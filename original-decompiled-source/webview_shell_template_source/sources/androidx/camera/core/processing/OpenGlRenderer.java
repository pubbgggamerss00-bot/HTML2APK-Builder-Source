package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.processing.util.GraphicDeviceInfo;
import androidx.camera.core.processing.util.OutputSurface;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class OpenGlRenderer {
    private static final String TAG = "OpenGlRenderer";
    protected Surface mCurrentSurface;
    protected EGLConfig mEglConfig;
    protected Thread mGlThread;
    protected final AtomicBoolean mInitialized = new AtomicBoolean(false);
    protected final Map<Surface, OutputSurface> mOutputSurfaceMap = new HashMap();
    protected EGLDisplay mEglDisplay = EGL14.EGL_NO_DISPLAY;
    protected EGLContext mEglContext = EGL14.EGL_NO_CONTEXT;
    protected int[] mSurfaceAttrib = GLUtils.EMPTY_ATTRIBS;
    protected EGLSurface mTempSurface = EGL14.EGL_NO_SURFACE;
    protected Map<GLUtils.InputFormat, GLUtils.Program2D> mProgramHandles = Collections.EMPTY_MAP;
    protected GLUtils.Program2D mCurrentProgram = null;
    protected GLUtils.InputFormat mCurrentInputformat = GLUtils.InputFormat.UNKNOWN;
    private int mExternalTextureId = -1;

    private void activateExternalTexture(int i6) {
        GLES20.glActiveTexture(33984);
        GLUtils.checkGlErrorOrThrow("glActiveTexture");
        GLES20.glBindTexture(36197, i6);
        GLUtils.checkGlErrorOrThrow("glBindTexture");
    }

    private void createEglContext(DynamicRange dynamicRange, GraphicDeviceInfo.Builder builder) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEglDisplay = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.mEglDisplay, iArr, 0, iArr, 1)) {
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (builder != null) {
            builder.setEglVersion(iArr[0] + "." + iArr[1]);
        }
        int i6 = dynamicRange.is10BitHdr() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.mEglDisplay, new int[]{12324, i6, 12323, i6, 12322, i6, 12321, dynamicRange.is10BitHdr() ? 2 : 8, 12325, 0, 12326, 0, 12352, dynamicRange.is10BitHdr() ? 64 : 4, 12610, dynamicRange.is10BitHdr() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.mEglDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, dynamicRange.is10BitHdr() ? 3 : 2, 12344}, 0);
        GLUtils.checkEglErrorOrThrow("eglCreateContext");
        this.mEglConfig = eGLConfig;
        this.mEglContext = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.mEglDisplay, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d(TAG, "EGLContext created, client version " + iArr2[0]);
    }

    private void createTempSurface() {
        EGLDisplay eGLDisplay = this.mEglDisplay;
        EGLConfig eGLConfig = this.mEglConfig;
        Objects.requireNonNull(eGLConfig);
        this.mTempSurface = GLUtils.createPBufferSurface(eGLDisplay, eGLConfig, 1, 1);
    }

    private t0.b<String, String> getExtensionsBeforeInitialized(DynamicRange dynamicRange) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        try {
            createEglContext(dynamicRange, null);
            createTempSurface();
            makeCurrent(this.mTempSurface);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.mEglDisplay, 12373);
            if (strGlGetString == null) {
                strGlGetString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (strEglQueryString == null) {
                strEglQueryString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            return new t0.b<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e6) {
            Logger.w(TAG, "Failed to get GL or EGL extensions: " + e6.getMessage(), e6);
            return new t0.b<>(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } finally {
            releaseInternal();
        }
    }

    private void releaseInternal() {
        Iterator<GLUtils.Program2D> it = this.mProgramHandles.values().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
        this.mProgramHandles = Collections.EMPTY_MAP;
        this.mCurrentProgram = null;
        if (!Objects.equals(this.mEglDisplay, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (OutputSurface outputSurface : this.mOutputSurfaceMap.values()) {
                if (!Objects.equals(outputSurface.getEglSurface(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.mEglDisplay, outputSurface.getEglSurface())) {
                    GLUtils.checkEglErrorOrLog("eglDestroySurface");
                }
            }
            this.mOutputSurfaceMap.clear();
            if (!Objects.equals(this.mTempSurface, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mTempSurface);
                this.mTempSurface = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.mEglContext, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEglDisplay);
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
        }
        this.mEglConfig = null;
        this.mExternalTextureId = -1;
        this.mCurrentInputformat = GLUtils.InputFormat.UNKNOWN;
        this.mCurrentSurface = null;
        this.mGlThread = null;
    }

    public OutputSurface createOutputSurfaceInternal(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLConfig eGLConfig = this.mEglConfig;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceCreateWindowSurface = GLUtils.createWindowSurface(eGLDisplay, eGLConfig, surface, this.mSurfaceAttrib);
            Size surfaceSize = GLUtils.getSurfaceSize(this.mEglDisplay, eGLSurfaceCreateWindowSurface);
            return OutputSurface.of(eGLSurfaceCreateWindowSurface, surfaceSize.getWidth(), surfaceSize.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e6) {
            Logger.w(TAG, "Failed to create EGL surface: " + e6.getMessage(), e6);
            return null;
        }
    }

    public OutputSurface getOutSurfaceOrThrow(Surface surface) {
        androidx.work.j.f("The surface is not registered.", this.mOutputSurfaceMap.containsKey(surface));
        OutputSurface outputSurface = this.mOutputSurfaceMap.get(surface);
        Objects.requireNonNull(outputSurface);
        return outputSurface;
    }

    public int getTextureName() {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        return this.mExternalTextureId;
    }

    public GraphicDeviceInfo init(DynamicRange dynamicRange) {
        return init(dynamicRange, Collections.EMPTY_MAP);
    }

    public void makeCurrent(EGLSurface eGLSurface) {
        this.mEglDisplay.getClass();
        this.mEglContext.getClass();
        if (!EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void registerOutputSurface(Surface surface) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mOutputSurfaceMap.containsKey(surface)) {
            return;
        }
        this.mOutputSurfaceMap.put(surface, GLUtils.NO_OUTPUT_SURFACE);
    }

    public void release() {
        if (this.mInitialized.getAndSet(false)) {
            GLUtils.checkGlThreadOrThrow(this.mGlThread);
            releaseInternal();
        }
    }

    public void removeOutputSurfaceInternal(Surface surface, boolean z6) {
        if (this.mCurrentSurface == surface) {
            this.mCurrentSurface = null;
            makeCurrent(this.mTempSurface);
        }
        OutputSurface outputSurfaceRemove = z6 ? this.mOutputSurfaceMap.remove(surface) : this.mOutputSurfaceMap.put(surface, GLUtils.NO_OUTPUT_SURFACE);
        if (outputSurfaceRemove == null || outputSurfaceRemove == GLUtils.NO_OUTPUT_SURFACE) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.mEglDisplay, outputSurfaceRemove.getEglSurface());
        } catch (RuntimeException e6) {
            Logger.w(TAG, "Failed to destroy EGL surface: " + e6.getMessage(), e6);
        }
    }

    public void render(long j6, float[] fArr, Surface surface) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        OutputSurface outSurfaceOrThrow = getOutSurfaceOrThrow(surface);
        if (outSurfaceOrThrow == GLUtils.NO_OUTPUT_SURFACE) {
            outSurfaceOrThrow = createOutputSurfaceInternal(surface);
            if (outSurfaceOrThrow == null) {
                return;
            } else {
                this.mOutputSurfaceMap.put(surface, outSurfaceOrThrow);
            }
        }
        if (surface != this.mCurrentSurface) {
            makeCurrent(outSurfaceOrThrow.getEglSurface());
            this.mCurrentSurface = surface;
            GLES20.glViewport(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
            GLES20.glScissor(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
        }
        GLUtils.Program2D program2D = this.mCurrentProgram;
        program2D.getClass();
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            ((GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.checkGlErrorOrThrow("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.mEglDisplay, outSurfaceOrThrow.getEglSurface(), j6);
        if (EGL14.eglSwapBuffers(this.mEglDisplay, outSurfaceOrThrow.getEglSurface())) {
            return;
        }
        Logger.w(TAG, "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        removeOutputSurfaceInternal(surface, false);
    }

    public void setInputFormat(GLUtils.InputFormat inputFormat) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mCurrentInputformat != inputFormat) {
            this.mCurrentInputformat = inputFormat;
            useAndConfigureProgramWithTexture(this.mExternalTextureId);
        }
    }

    public Bitmap snapshot(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getHeight() * size.getWidth() * 4);
        snapshot(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.copyByteBufferToBitmap(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public void unregisterOutputSurface(Surface surface) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        removeOutputSurfaceInternal(surface, true);
    }

    public void useAndConfigureProgramWithTexture(int i6) {
        GLUtils.Program2D program2D = this.mProgramHandles.get(this.mCurrentInputformat);
        if (program2D == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.mCurrentInputformat);
        }
        if (this.mCurrentProgram != program2D) {
            this.mCurrentProgram = program2D;
            program2D.use();
            Log.d(TAG, "Using program for input format " + this.mCurrentInputformat + ": " + this.mCurrentProgram);
        }
        activateExternalTexture(i6);
    }

    public GraphicDeviceInfo init(DynamicRange dynamicRange, Map<GLUtils.InputFormat, ShaderProvider> map) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        GraphicDeviceInfo.Builder builder = GraphicDeviceInfo.builder();
        try {
            if (dynamicRange.is10BitHdr()) {
                t0.b<String, String> extensionsBeforeInitialized = getExtensionsBeforeInitialized(dynamicRange);
                String str = extensionsBeforeInitialized.f14401a;
                str.getClass();
                String str2 = extensionsBeforeInitialized.f14402b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    Logger.w(TAG, "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    dynamicRange = DynamicRange.SDR;
                }
                this.mSurfaceAttrib = GLUtils.chooseSurfaceAttrib(str2, dynamicRange);
                builder.setGlExtensions(str);
                builder.setEglExtensions(str2);
            }
            createEglContext(dynamicRange, builder);
            createTempSurface();
            makeCurrent(this.mTempSurface);
            builder.setGlVersion(GLUtils.getGlVersionNumber());
            this.mProgramHandles = GLUtils.createPrograms(dynamicRange, map);
            int iCreateTexture = GLUtils.createTexture();
            this.mExternalTextureId = iCreateTexture;
            useAndConfigureProgramWithTexture(iCreateTexture);
            this.mGlThread = Thread.currentThread();
            this.mInitialized.set(true);
            return builder.build();
        } catch (IllegalArgumentException e6) {
            e = e6;
            releaseInternal();
            throw e;
        } catch (IllegalStateException e7) {
            e = e7;
            releaseInternal();
            throw e;
        }
    }

    private void snapshot(ByteBuffer byteBuffer, Size size, float[] fArr) {
        androidx.work.j.a("ByteBuffer capacity is not equal to width * height * 4.", byteBuffer.capacity() == (size.getHeight() * size.getWidth()) * 4);
        androidx.work.j.a("ByteBuffer is not direct.", byteBuffer.isDirect());
        int iGenerateTexture = GLUtils.generateTexture();
        GLES20.glActiveTexture(33985);
        GLUtils.checkGlErrorOrThrow("glActiveTexture");
        GLES20.glBindTexture(3553, iGenerateTexture);
        GLUtils.checkGlErrorOrThrow("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        GLUtils.checkGlErrorOrThrow("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iGenerateFbo = GLUtils.generateFbo();
        GLES20.glBindFramebuffer(36160, iGenerateFbo);
        GLUtils.checkGlErrorOrThrow("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iGenerateTexture, 0);
        GLUtils.checkGlErrorOrThrow("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        GLUtils.checkGlErrorOrThrow("glActiveTexture");
        GLES20.glBindTexture(36197, this.mExternalTextureId);
        GLUtils.checkGlErrorOrThrow("glBindTexture");
        this.mCurrentSurface = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        GLUtils.Program2D program2D = this.mCurrentProgram;
        program2D.getClass();
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            ((GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.checkGlErrorOrThrow("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        GLUtils.checkGlErrorOrThrow("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLUtils.deleteTexture(iGenerateTexture);
        GLUtils.deleteFbo(iGenerateFbo);
        activateExternalTexture(this.mExternalTextureId);
    }
}
