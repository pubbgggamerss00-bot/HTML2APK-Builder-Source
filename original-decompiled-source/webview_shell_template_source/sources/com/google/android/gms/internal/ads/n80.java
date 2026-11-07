package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n80 extends Thread implements SurfaceTexture.OnFrameAvailableListener {
    public static final float[] T = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public SurfaceTexture F;
    public SurfaceTexture G;
    public int H;
    public int I;
    public int J;
    public final FloatBuffer K;
    public final CountDownLatch L;
    public final Object M;
    public EGL10 N;
    public EGLDisplay O;
    public EGLContext P;
    public EGLSurface Q;
    public volatile boolean R;
    public volatile boolean S;
    public final m80 s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f7335t;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f7336u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f7337v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f7338w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f7339x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f7340y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f7341z;

    public n80(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.K = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(T).position(0);
        this.f7335t = new float[9];
        this.f7336u = new float[9];
        this.f7337v = new float[9];
        this.f7338w = new float[9];
        this.f7339x = new float[9];
        this.f7340y = new float[9];
        this.f7341z = new float[9];
        this.A = Float.NaN;
        m80 m80Var = new m80(context);
        this.s = m80Var;
        m80Var.h = this;
        this.L = new CountDownLatch(1);
        this.M = new Object();
    }

    public static final void e(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f6 = fArr2[0] * fArr3[0];
        float f7 = fArr2[1];
        float f8 = fArr3[3];
        float f9 = fArr2[2];
        float f10 = fArr3[6];
        fArr[0] = f6 + (f7 * f8) + (f9 * f10);
        float f11 = fArr2[0];
        float f12 = fArr3[1] * f11;
        float f13 = fArr3[4];
        float f14 = fArr3[7];
        fArr[1] = f12 + (f7 * f13) + (f9 * f14);
        float f15 = f11 * fArr3[2];
        float f16 = fArr2[1];
        float f17 = fArr3[5];
        float f18 = fArr3[8];
        fArr[2] = f15 + (f16 * f17) + (f9 * f18);
        float f19 = fArr2[3];
        float f20 = fArr3[0];
        float f21 = fArr2[4];
        float f22 = fArr2[5];
        fArr[3] = (f19 * f20) + (f8 * f21) + (f22 * f10);
        float f23 = fArr2[3];
        float f24 = fArr3[1];
        fArr[4] = (f23 * f24) + (f21 * f13) + (f22 * f14);
        float f25 = fArr3[2];
        fArr[5] = (f23 * f25) + (fArr2[4] * f17) + (f22 * f18);
        float f26 = fArr2[6] * f20;
        float f27 = fArr2[7];
        float f28 = fArr3[3] * f27;
        float f29 = fArr2[8];
        fArr[6] = f26 + f28 + (f10 * f29);
        float f30 = fArr2[6];
        float f31 = f14 * f29;
        fArr[7] = f31 + (f27 * fArr3[4]) + (f24 * f30);
        fArr[8] = (f30 * f25) + (fArr2[7] * fArr3[5]) + (f29 * f18);
    }

    public static final void g(float[] fArr, float f6) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d7 = f6;
        fArr[4] = (float) Math.cos(d7);
        fArr[5] = (float) (-Math.sin(d7));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d7);
        fArr[8] = (float) Math.cos(d7);
    }

    public static final void h(float[] fArr, float f6) {
        double d7 = f6;
        fArr[0] = (float) Math.cos(d7);
        fArr[1] = (float) (-Math.sin(d7));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d7);
        fArr[4] = (float) Math.cos(d7);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(int i6, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i6);
        e("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            e("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            e("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i6 + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                e("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final void a(int i6, int i7) {
        synchronized (this.M) {
            this.E = i6;
            this.D = i7;
            this.R = true;
            this.M.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.M) {
            this.S = true;
            this.G = null;
            this.M.notifyAll();
        }
    }

    public final void c(float f6, float f7) {
        int i6 = this.E;
        int i7 = this.D;
        if (i6 <= i7) {
            i6 = i7;
        }
        float f8 = i6;
        this.B -= (f6 * 1.7453293f) / f8;
        float f9 = this.C - ((f7 * 1.7453293f) / f8);
        this.C = f9;
        if (f9 < -1.5707964f) {
            this.C = -1.5707964f;
            f9 = -1.5707964f;
        }
        if (f9 > 1.5707964f) {
            this.C = 1.5707964f;
        }
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.Q;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.N.eglMakeCurrent(this.O, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.N.eglDestroySurface(this.O, this.Q);
            this.Q = null;
        }
        EGLContext eGLContext = this.P;
        if (eGLContext != null) {
            this.N.eglDestroyContext(this.O, eGLContext);
            this.P = null;
        }
        EGLDisplay eGLDisplay = this.O;
        if (eGLDisplay != null) {
            this.N.eglTerminate(eGLDisplay);
            this.O = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.J++;
        synchronized (this.M) {
            this.M.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object[] objArr;
        int iGlCreateProgram;
        if (this.G == null) {
            zzo.zzg("SphericalVideoProcessor started with no output texture.");
            this.L.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.N = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.O = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.N.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.N.eglChooseConfig(this.O, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig == null) {
                objArr = false;
            } else {
                EGL10 egl102 = this.N;
                EGLDisplay eGLDisplay = this.O;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eGLContextEglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.P = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext != null && eGLContextEglCreateContext != eGLContext) {
                    EGLSurface eGLSurfaceEglCreateWindowSurface = this.N.eglCreateWindowSurface(this.O, eGLConfig, this.G, null);
                    this.Q = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface != null && eGLSurfaceEglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.N.eglMakeCurrent(this.O, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.P)) {
                        objArr = true;
                    }
                }
            }
        }
        sn snVar = zn.f11473s1;
        int i6 = i(35633, !((String) zzbe.zzc().a(snVar)).equals(snVar.h()) ? (String) zzbe.zzc().a(snVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (i6 == 0) {
            iGlCreateProgram = 0;
        } else {
            sn snVar2 = zn.f11478t1;
            int i7 = i(35632, !((String) zzbe.zzc().a(snVar2)).equals(snVar2.h()) ? (String) zzbe.zzc().a(snVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (i7 != 0) {
                iGlCreateProgram = GLES20.glCreateProgram();
                e("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, i6);
                    e("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, i7);
                    e("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    e("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    e("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        e("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        e("validateProgram");
                    }
                }
            }
        }
        this.H = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        e("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.H, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.K);
        e("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        e("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        e("genTextures");
        int i8 = iArr3[0];
        GLES20.glBindTexture(36197, i8);
        e("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        e("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.H, "uVMat");
        this.I = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i9 = this.H;
        if (!objArr == true || i9 == 0) {
            String strConcat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.N.eglGetError())));
            zzo.zzg(strConcat);
            zzv.zzp().h("SphericalVideoProcessor.run.1", new Throwable(strConcat));
            d();
            this.L.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i8);
        this.F = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.L.countDown();
        m80 m80Var = this.s;
        SensorManager sensorManager = m80Var.f6968a;
        if (m80Var.f6974g == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzo.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            } else {
                HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                handlerThread.start();
                uj1 uj1Var = new uj1(handlerThread.getLooper());
                m80Var.f6974g = uj1Var;
                if (!sensorManager.registerListener(m80Var, defaultSensor, 0, uj1Var)) {
                    zzo.zzg("SensorManager.registerListener failed.");
                    m80Var.b();
                }
            }
        }
        try {
            try {
                this.R = true;
                while (!this.S) {
                    while (this.J > 0) {
                        this.F.updateTexImage();
                        this.J--;
                    }
                    if (this.s.c(this.f7335t)) {
                        if (Float.isNaN(this.A)) {
                            float[] fArr = this.f7335t;
                            float[] fArr2 = {0.0f, 1.0f, 0.0f};
                            float f6 = fArr[0];
                            float f7 = fArr2[0];
                            float f8 = fArr[1];
                            float f9 = fArr2[1];
                            float[] fArr3 = {(fArr[2] * 0.0f) + (f8 * f9) + (f6 * f7), (fArr[5] * 0.0f) + (fArr[4] * f9) + (fArr[3] * f7), (fArr[8] * 0.0f) + (fArr[7] * f9) + (fArr[6] * f7)};
                            this.A = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                        }
                        h(this.f7340y, this.A + this.B);
                    } else {
                        g(this.f7335t, -1.5707964f);
                        h(this.f7340y, this.B);
                    }
                    g(this.f7336u, 1.5707964f);
                    f(this.f7337v, this.f7340y, this.f7336u);
                    f(this.f7338w, this.f7335t, this.f7337v);
                    g(this.f7339x, this.C);
                    f(this.f7341z, this.f7339x, this.f7338w);
                    GLES20.glUniformMatrix3fv(this.I, 1, false, this.f7341z, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    e("drawArrays");
                    GLES20.glFinish();
                    this.N.eglSwapBuffers(this.O, this.Q);
                    if (this.R) {
                        GLES20.glViewport(0, 0, this.E, this.D);
                        e("viewport");
                        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.H, "uFOVx");
                        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.H, "uFOVy");
                        int i10 = this.E;
                        int i11 = this.D;
                        if (i10 > i11) {
                            GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                            GLES20.glUniform1f(iGlGetUniformLocation3, (this.D * 0.87266463f) / this.E);
                        } else {
                            GLES20.glUniform1f(iGlGetUniformLocation2, (i10 * 0.87266463f) / i11);
                            GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                        }
                        this.R = false;
                    }
                    try {
                        synchronized (this.M) {
                            try {
                                if (!this.S && !this.R && this.J == 0) {
                                    this.M.wait();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            } finally {
                this.s.b();
                this.F.setOnFrameAvailableListener(null);
                this.F = null;
                d();
            }
        } catch (IllegalStateException unused2) {
            zzo.zzj("SphericalVideoProcessor halted unexpectedly.");
        } catch (Throwable th2) {
            zzo.zzh("SphericalVideoProcessor died.", th2);
            zzv.zzp().h("SphericalVideoProcessor.run.2", th2);
        }
    }
}
