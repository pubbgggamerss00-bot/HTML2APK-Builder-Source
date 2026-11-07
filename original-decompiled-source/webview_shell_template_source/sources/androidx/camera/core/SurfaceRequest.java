package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class SurfaceRequest {
    public static final Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    private final CameraInternal mCamera;
    private final DynamicRange mDynamicRange;
    private final Range<Integer> mExpectedFrameRate;
    private final DeferrableSurface mInternalDeferrableSurface;
    private final boolean mIsPrimary;
    private final Object mLock;
    private final b.a<Void> mRequestCancellationCompleter;
    private final Size mResolution;
    private final c5.a<Void> mSessionStatusFuture;
    private final b.a<Surface> mSurfaceCompleter;
    final c5.a<Surface> mSurfaceFuture;
    private final b.a<Void> mSurfaceRecreationCompleter;
    private TransformationInfo mTransformationInfo;
    private Executor mTransformationInfoExecutor;
    private TransformationInfoListener mTransformationInfoListener;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class Result {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        public static Result of(int i6, Surface surface) {
            return new AutoValue_SurfaceRequest_Result(i6, surface);
        }

        public abstract int getResultCode();

        public abstract Surface getSurface();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class TransformationInfo {
        public static TransformationInfo of(Rect rect, int i6, int i7, boolean z6, Matrix matrix, boolean z7) {
            return new AutoValue_SurfaceRequest_TransformationInfo(rect, i6, i7, z6, matrix, z7);
        }

        public abstract Rect getCropRect();

        public abstract int getRotationDegrees();

        public abstract Matrix getSensorToBufferTransform();

        public abstract int getTargetRotation();

        public abstract boolean hasCameraTransform();

        public abstract boolean isMirroring();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(TransformationInfo transformationInfo);
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, Runnable runnable) {
        this(size, cameraInternal, DynamicRange.SDR, FRAME_RATE_RANGE_UNSPECIFIED, runnable);
    }

    private b.a<Void> initialSurfaceRecreationCompleter(Executor executor, final Runnable runnable) {
        AtomicReference atomicReference = new AtomicReference(null);
        Futures.addCallback(y.b.a(new d0(0, this, atomicReference)), new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.5
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r12) {
                runnable.run();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
            }
        }, executor);
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$initialSurfaceRecreationCompleter$6(AtomicReference atomicReference, b.a aVar) {
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$0(AtomicReference atomicReference, String str, b.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$1(AtomicReference atomicReference, String str, b.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$2(AtomicReference atomicReference, String str, b.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        this.mSurfaceFuture.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$4(t0.a aVar, Surface surface) {
        aVar.accept(Result.of(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$5(t0.a aVar, Surface surface) {
        aVar.accept(Result.of(4, surface));
    }

    @SuppressLint({"PairedRegistration"})
    public void addRequestCancellationListener(Executor executor, Runnable runnable) {
        y.d<Void> dVar = this.mRequestCancellationCompleter.f15192c;
        if (dVar != null) {
            dVar.addListener(runnable, executor);
        }
    }

    public void clearTransformationInfoListener() {
        synchronized (this.mLock) {
            this.mTransformationInfoListener = null;
            this.mTransformationInfoExecutor = null;
        }
    }

    public CameraInternal getCamera() {
        return this.mCamera;
    }

    public DeferrableSurface getDeferrableSurface() {
        return this.mInternalDeferrableSurface;
    }

    public DynamicRange getDynamicRange() {
        return this.mDynamicRange;
    }

    public Range<Integer> getExpectedFrameRate() {
        return this.mExpectedFrameRate;
    }

    public Size getResolution() {
        return this.mResolution;
    }

    public boolean invalidate() {
        willNotProvideSurface();
        return this.mSurfaceRecreationCompleter.a(null);
    }

    public boolean isPrimary() {
        return this.mIsPrimary;
    }

    public boolean isServiced() {
        return this.mSurfaceFuture.isDone();
    }

    public void provideSurface(final Surface surface, Executor executor, final t0.a<Result> aVar) {
        if (this.mSurfaceCompleter.a(surface) || this.mSurfaceFuture.isCancelled()) {
            Futures.addCallback(this.mSessionStatusFuture, new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.4
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th) {
                    androidx.work.j.f("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof RequestCancelledException);
                    aVar.accept(Result.of(1, surface));
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(Void r32) {
                    aVar.accept(Result.of(0, surface));
                }
            }, executor);
            return;
        }
        androidx.work.j.f(null, this.mSurfaceFuture.isDone());
        try {
            this.mSurfaceFuture.get();
            executor.execute(new a(2, aVar, surface));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new androidx.camera.camera2.interop.d(1, aVar, surface));
        }
    }

    public void setTransformationInfoListener(Executor executor, TransformationInfoListener transformationInfoListener) {
        TransformationInfo transformationInfo;
        synchronized (this.mLock) {
            this.mTransformationInfoListener = transformationInfoListener;
            this.mTransformationInfoExecutor = executor;
            transformationInfo = this.mTransformationInfo;
        }
        if (transformationInfo != null) {
            executor.execute(new androidx.activity.p(1, transformationInfoListener, transformationInfo));
        }
    }

    public void updateTransformationInfo(TransformationInfo transformationInfo) {
        TransformationInfoListener transformationInfoListener;
        Executor executor;
        synchronized (this.mLock) {
            this.mTransformationInfo = transformationInfo;
            transformationInfoListener = this.mTransformationInfoListener;
            executor = this.mTransformationInfoExecutor;
        }
        if (transformationInfoListener == null || executor == null) {
            return;
        }
        executor.execute(new x(1, transformationInfoListener, transformationInfo));
    }

    public boolean willNotProvideSurface() {
        return this.mSurfaceCompleter.b(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, DynamicRange dynamicRange, Range<Integer> range, Runnable runnable) {
        this(size, cameraInternal, true, dynamicRange, range, runnable);
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, boolean z6, DynamicRange dynamicRange, Range<Integer> range, Runnable runnable) {
        this.mLock = new Object();
        this.mResolution = size;
        this.mCamera = cameraInternal;
        this.mIsPrimary = z6;
        this.mDynamicRange = dynamicRange;
        this.mExpectedFrameRate = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        final b.d dVarA = y.b.a(new b0(1, atomicReference, str));
        final b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.mRequestCancellationCompleter = aVar;
        AtomicReference atomicReference2 = new AtomicReference(null);
        b.d dVarA2 = y.b.a(new e0(str, atomicReference2));
        this.mSessionStatusFuture = dVarA2;
        Futures.addCallback(dVarA2, new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (th instanceof RequestCancelledException) {
                    androidx.work.j.f(null, dVarA.cancel(false));
                } else {
                    androidx.work.j.f(null, aVar.a(null));
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r22) {
                androidx.work.j.f(null, aVar.a(null));
            }
        }, CameraXExecutors.directExecutor());
        final b.a aVar2 = (b.a) atomicReference2.get();
        aVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        b.d dVarA3 = y.b.a(new f0(str, atomicReference3));
        this.mSurfaceFuture = dVarA3;
        b.a<Surface> aVar3 = (b.a) atomicReference3.get();
        aVar3.getClass();
        this.mSurfaceCompleter = aVar3;
        DeferrableSurface deferrableSurface = new DeferrableSurface(size, 34) { // from class: androidx.camera.core.SurfaceRequest.2
            @Override // androidx.camera.core.impl.DeferrableSurface
            public c5.a<Surface> provideSurface() {
                return SurfaceRequest.this.mSurfaceFuture;
            }
        };
        this.mInternalDeferrableSurface = deferrableSurface;
        final c5.a<Void> terminationFuture = deferrableSurface.getTerminationFuture();
        Futures.addCallback(dVarA3, new FutureCallback<Surface>() { // from class: androidx.camera.core.SurfaceRequest.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (th instanceof CancellationException) {
                    androidx.work.j.f(null, aVar2.b(new RequestCancelledException(androidx.activity.m.e(new StringBuilder(), str, " cancelled."), th)));
                } else {
                    aVar2.a(null);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Surface surface) {
                Futures.propagate(terminationFuture, aVar2);
            }
        }, CameraXExecutors.directExecutor());
        terminationFuture.addListener(new y(1, this), CameraXExecutors.directExecutor());
        this.mSurfaceRecreationCompleter = initialSurfaceRecreationCompleter(CameraXExecutors.directExecutor(), runnable);
    }
}
