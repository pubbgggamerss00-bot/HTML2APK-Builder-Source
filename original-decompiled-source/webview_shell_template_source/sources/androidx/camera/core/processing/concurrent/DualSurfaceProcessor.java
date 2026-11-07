package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.i;
import androidx.camera.core.processing.l;
import androidx.camera.core.processing.o;
import androidx.camera.core.processing.util.GLUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p5.q;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class DualSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "DualSurfaceProcessor";
    private final Executor mGlExecutor;
    final Handler mGlHandler;
    private final DualOpenGlRenderer mGlRenderer;
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final Map<SurfaceOutput, Surface> mOutputSurfaces;
    private SurfaceTexture mPrimarySurfaceTexture;
    private SurfaceTexture mSecondarySurfaceTexture;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Factory {
        private static q<DynamicRange, LayoutSettings, LayoutSettings, SurfaceProcessorInternal> sSupplier = new androidx.camera.core.c();

        private Factory() {
        }

        public static SurfaceProcessorInternal newInstance(DynamicRange dynamicRange, LayoutSettings layoutSettings, LayoutSettings layoutSettings2) {
            return sSupplier.a(dynamicRange, layoutSettings, layoutSettings2);
        }

        public static void setSupplier(q<DynamicRange, LayoutSettings, LayoutSettings, SurfaceProcessorInternal> qVar) {
            sSupplier = qVar;
        }
    }

    public DualSurfaceProcessor(DynamicRange dynamicRange, LayoutSettings layoutSettings, LayoutSettings layoutSettings2) {
        this(dynamicRange, Collections.EMPTY_MAP, layoutSettings, layoutSettings2);
    }

    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            Iterator<SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    private void executeSafely(Runnable runnable) {
        executeSafely(runnable, new i(1));
    }

    private void initGlRenderer(final DynamicRange dynamicRange, final Map<GLUtils.InputFormat, ShaderProvider> map) {
        try {
            y.b.a(new b.c() { // from class: androidx.camera.core.processing.concurrent.a
                @Override // y.b.c
                public final Object attachCompleter(b.a aVar) {
                    return this.s.lambda$initGlRenderer$6(dynamicRange, map, aVar);
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
    public /* synthetic */ void lambda$executeSafely$8(Runnable runnable, Runnable runnable2) {
        if (this.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGlRenderer$5(DynamicRange dynamicRange, Map map, b.a aVar) {
        try {
            this.mGlRenderer.init(dynamicRange, map);
            aVar.a(null);
        } catch (RuntimeException e6) {
            aVar.b(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$initGlRenderer$6(final DynamicRange dynamicRange, final Map map, final b.a aVar) {
        executeSafely(new Runnable() { // from class: androidx.camera.core.processing.concurrent.b
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$initGlRenderer$5(dynamicRange, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$0(SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.mInputSurfaceCount--;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$1(SurfaceRequest surfaceRequest) {
        this.mInputSurfaceCount++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.mGlRenderer.getTextureName(surfaceRequest.isPrimary()));
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, this.mGlExecutor, new t0.a() { // from class: androidx.camera.core.processing.concurrent.e
            @Override // t0.a
            public final void accept(Object obj) {
                this.f600a.lambda$onInputSurface$0(surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        if (surfaceRequest.isPrimary()) {
            this.mPrimarySurfaceTexture = surfaceTexture;
        } else {
            this.mSecondarySurfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.mGlHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$2(SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        surfaceOutput.close();
        Surface surfaceRemove = this.mOutputSurfaces.remove(surfaceOutput);
        if (surfaceRemove != null) {
            this.mGlRenderer.unregisterOutputSurface(surfaceRemove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$3(final SurfaceOutput surfaceOutput) {
        Surface surface = surfaceOutput.getSurface(this.mGlExecutor, new t0.a() { // from class: androidx.camera.core.processing.concurrent.c
            @Override // t0.a
            public final void accept(Object obj) {
                this.f595a.lambda$onOutputSurface$2(surfaceOutput, (SurfaceOutput.Event) obj);
            }
        });
        this.mGlRenderer.registerOutputSurface(surface);
        this.mOutputSurfaces.put(surfaceOutput, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$4() {
        this.mIsReleased = true;
        checkReadyToRelease();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.mIsReleaseRequested.get() || (surfaceTexture2 = this.mPrimarySurfaceTexture) == null || this.mSecondarySurfaceTexture == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.mSecondarySurfaceTexture.updateTexImage();
        for (Map.Entry<SurfaceOutput, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            SurfaceOutput key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), value, key, this.mPrimarySurfaceTexture, this.mSecondarySurfaceTexture);
                } catch (RuntimeException e6) {
                    Logger.e(TAG, "Failed to render with OpenGL.", e6);
                }
            }
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(SurfaceRequest surfaceRequest) {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        androidx.camera.camera2.interop.d dVar = new androidx.camera.camera2.interop.d(3, this, surfaceRequest);
        Objects.requireNonNull(surfaceRequest);
        executeSafely(dVar, new o(1, surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(SurfaceOutput surfaceOutput) {
        if (this.mIsReleaseRequested.get()) {
            surfaceOutput.close();
            return;
        }
        androidx.camera.core.e eVar = new androidx.camera.core.e(3, this, surfaceOutput);
        Objects.requireNonNull(surfaceOutput);
        executeSafely(eVar, new l(2, surfaceOutput));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely(new androidx.camera.camera2.interop.c(2, this));
    }

    public DualSurfaceProcessor(DynamicRange dynamicRange, Map<GLUtils.InputFormat, ShaderProvider> map, LayoutSettings layoutSettings, LayoutSettings layoutSettings2) {
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mOutputSurfaces = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new DualOpenGlRenderer(layoutSettings, layoutSettings2);
        try {
            initGlRenderer(dynamicRange, map);
        } catch (RuntimeException e6) {
            release();
            throw e6;
        }
    }

    private void executeSafely(Runnable runnable, Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new d(this, runnable2, runnable, 0));
        } catch (RejectedExecutionException e6) {
            Logger.w(TAG, "Unable to executor runnable", e6);
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$executeSafely$7() {
    }
}
