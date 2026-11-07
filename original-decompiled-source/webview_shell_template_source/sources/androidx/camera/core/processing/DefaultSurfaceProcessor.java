package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.g0;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class DefaultSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "DefaultSurfaceProcessor";
    private final Executor mGlExecutor;
    final Handler mGlHandler;
    private final OpenGlRenderer mGlRenderer;
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final Map<SurfaceOutput, Surface> mOutputSurfaces;
    private final List<PendingSnapshot> mPendingSnapshots;
    private final float[] mSurfaceOutputMatrix;
    private final float[] mTextureMatrix;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Factory {
        private static o.a<DynamicRange, SurfaceProcessorInternal> sSupplier = new g0();

        private Factory() {
        }

        public static SurfaceProcessorInternal newInstance(DynamicRange dynamicRange) {
            return sSupplier.apply(dynamicRange);
        }

        public static void setSupplier(o.a<DynamicRange, SurfaceProcessorInternal> aVar) {
            sSupplier = aVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class PendingSnapshot {
        public static AutoValue_DefaultSurfaceProcessor_PendingSnapshot of(int i6, int i7, b.a<Void> aVar) {
            return new AutoValue_DefaultSurfaceProcessor_PendingSnapshot(i6, i7, aVar);
        }

        public abstract b.a<Void> getCompleter();

        public abstract int getJpegQuality();

        public abstract int getRotationDegrees();
    }

    public DefaultSurfaceProcessor(DynamicRange dynamicRange) {
        this(dynamicRange, Collections.EMPTY_MAP);
    }

    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            Iterator<SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<PendingSnapshot> it2 = this.mPendingSnapshots.iterator();
            while (it2.hasNext()) {
                it2.next().getCompleter().b(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    private void executeSafely(Runnable runnable) {
        executeSafely(runnable, new i(0));
    }

    private void failAllPendingSnapshots(Throwable th) {
        Iterator<PendingSnapshot> it = this.mPendingSnapshots.iterator();
        while (it.hasNext()) {
            it.next().getCompleter().b(th);
        }
        this.mPendingSnapshots.clear();
    }

    private Bitmap getBitmap(Size size, float[] fArr, int i6) {
        float[] fArr2 = (float[]) fArr.clone();
        MatrixExt.preRotate(fArr2, i6, 0.5f, 0.5f);
        MatrixExt.preVerticalFlip(fArr2, 0.5f);
        return this.mGlRenderer.snapshot(TransformUtils.rotateSize(size, i6), fArr2);
    }

    private void initGlRenderer(final DynamicRange dynamicRange, final Map<GLUtils.InputFormat, ShaderProvider> map) {
        try {
            y.b.a(new b.c() { // from class: androidx.camera.core.processing.g
                @Override // y.b.c
                public final Object attachCompleter(b.a aVar) {
                    return this.s.lambda$initGlRenderer$10(dynamicRange, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e6) {
            e = e6;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeSafely$12(Runnable runnable, Runnable runnable2) {
        if (this.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$initGlRenderer$10(DynamicRange dynamicRange, Map map, b.a aVar) {
        executeSafely(new h(this, dynamicRange, map, aVar, 0));
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGlRenderer$9(DynamicRange dynamicRange, Map map, b.a aVar) {
        try {
            this.mGlRenderer.init(dynamicRange, map);
            aVar.a(null);
        } catch (RuntimeException e6) {
            aVar.b(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$0(SurfaceRequest surfaceRequest, SurfaceRequest.TransformationInfo transformationInfo) {
        GLUtils.InputFormat inputFormat = GLUtils.InputFormat.DEFAULT;
        if (surfaceRequest.getDynamicRange().is10BitHdr() && transformationInfo.hasCameraTransform()) {
            inputFormat = GLUtils.InputFormat.YUV;
        }
        this.mGlRenderer.setInputFormat(inputFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$1(SurfaceRequest surfaceRequest, SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        surfaceRequest.clearTransformationInfoListener();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.mInputSurfaceCount--;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$2(final SurfaceRequest surfaceRequest) {
        this.mInputSurfaceCount++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.mGlRenderer.getTextureName());
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.setTransformationInfoListener(this.mGlExecutor, new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.core.processing.e
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                this.f610a.lambda$onInputSurface$0(surfaceRequest, transformationInfo);
            }
        });
        surfaceRequest.provideSurface(surface, this.mGlExecutor, new t0.a() { // from class: androidx.camera.core.processing.f
            @Override // t0.a
            public final void accept(Object obj) {
                this.f612a.lambda$onInputSurface$1(surfaceRequest, surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.mGlHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$3(SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        surfaceOutput.close();
        Surface surfaceRemove = this.mOutputSurfaces.remove(surfaceOutput);
        if (surfaceRemove != null) {
            this.mGlRenderer.unregisterOutputSurface(surfaceRemove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$4(final SurfaceOutput surfaceOutput) {
        Surface surface = surfaceOutput.getSurface(this.mGlExecutor, new t0.a() { // from class: androidx.camera.core.processing.d
            @Override // t0.a
            public final void accept(Object obj) {
                this.f608a.lambda$onOutputSurface$3(surfaceOutput, (SurfaceOutput.Event) obj);
            }
        });
        this.mGlRenderer.registerOutputSurface(surface);
        this.mOutputSurfaces.put(surfaceOutput, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$5() {
        this.mIsReleased = true;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$snapshot$6(PendingSnapshot pendingSnapshot) {
        this.mPendingSnapshots.add(pendingSnapshot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$snapshot$7(b.a aVar) {
        aVar.b(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$snapshot$8(int i6, int i7, b.a aVar) {
        final AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshotOf = PendingSnapshot.of(i6, i7, aVar);
        executeSafely(new Runnable() { // from class: androidx.camera.core.processing.a
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$snapshot$6(autoValue_DefaultSurfaceProcessor_PendingSnapshotOf);
            }
        }, new l(1, aVar));
        return "DefaultSurfaceProcessor#snapshot";
    }

    private void takeSnapshotAndDrawJpeg(d5.g<Surface, Size, float[]> gVar) throws IOException {
        if (this.mPendingSnapshots.isEmpty()) {
            return;
        }
        if (gVar == null) {
            failAllPendingSnapshots(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<PendingSnapshot> it = this.mPendingSnapshots.iterator();
                int rotationDegrees = -1;
                int jpegQuality = -1;
                Bitmap bitmap = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    PendingSnapshot next = it.next();
                    if (rotationDegrees != next.getRotationDegrees() || bitmap == null) {
                        rotationDegrees = next.getRotationDegrees();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = getBitmap(gVar.f12742t, gVar.f12743u, rotationDegrees);
                        jpegQuality = -1;
                    }
                    if (jpegQuality != next.getJpegQuality()) {
                        byteArrayOutputStream.reset();
                        jpegQuality = next.getJpegQuality();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, jpegQuality, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = gVar.s;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.writeJpegBytesToSurface(surface, byteArray);
                    next.getCompleter().a(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e6) {
            failAllPendingSnapshots(e6);
        }
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [float[], java.io.Serializable] */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.mIsReleaseRequested.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.mTextureMatrix);
        d5.g<Surface, Size, float[]> gVar = null;
        for (Map.Entry<SurfaceOutput, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            SurfaceOutput key = entry.getKey();
            key.updateTransformMatrix(this.mSurfaceOutputMatrix, this.mTextureMatrix);
            if (key.getFormat() == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), this.mSurfaceOutputMatrix, value);
                } catch (RuntimeException e6) {
                    Logger.e(TAG, "Failed to render with OpenGL.", e6);
                }
            } else {
                androidx.work.j.f("Unsupported format: " + key.getFormat(), key.getFormat() == 256);
                androidx.work.j.f("Only one JPEG output is supported.", gVar == null);
                gVar = new d5.g<>(value, key.getSize(), (float[]) this.mSurfaceOutputMatrix.clone());
            }
        }
        try {
            takeSnapshotAndDrawJpeg(gVar);
        } catch (RuntimeException e7) {
            failAllPendingSnapshots(e7);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(SurfaceRequest surfaceRequest) {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        t tVar = new t(1, this, surfaceRequest);
        Objects.requireNonNull(surfaceRequest);
        executeSafely(tVar, new o(1, surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(SurfaceOutput surfaceOutput) {
        if (this.mIsReleaseRequested.get()) {
            surfaceOutput.close();
            return;
        }
        x xVar = new x(4, this, surfaceOutput);
        Objects.requireNonNull(surfaceOutput);
        executeSafely(xVar, new l(2, surfaceOutput));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely(new q(1, this));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public c5.a<Void> snapshot(final int i6, final int i7) {
        return Futures.nonCancellationPropagating(y.b.a(new b.c() { // from class: androidx.camera.core.processing.c
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar) {
                return this.s.lambda$snapshot$8(i6, i7, aVar);
            }
        }));
    }

    public DefaultSurfaceProcessor(DynamicRange dynamicRange, Map<GLUtils.InputFormat, ShaderProvider> map) {
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mTextureMatrix = new float[16];
        this.mSurfaceOutputMatrix = new float[16];
        this.mOutputSurfaces = new LinkedHashMap();
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mPendingSnapshots = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new OpenGlRenderer();
        try {
            initGlRenderer(dynamicRange, map);
        } catch (RuntimeException e6) {
            release();
            throw e6;
        }
    }

    private void executeSafely(final Runnable runnable, final Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$executeSafely$12(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e6) {
            Logger.w(TAG, "Unable to executor runnable", e6);
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$executeSafely$11() {
    }
}
