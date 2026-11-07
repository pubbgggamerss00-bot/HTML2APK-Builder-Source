package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SurfaceEdge {
    private final Rect mCropRect;
    private final int mFormat;
    private final boolean mHasCameraTransform;
    private final boolean mMirroring;
    private SurfaceRequest mProviderSurfaceRequest;
    private int mRotationDegrees;
    private final Matrix mSensorToBufferTransform;
    private SettableSurface mSettableSurface;
    private final StreamSpec mStreamSpec;
    private int mTargetRotation;
    private final int mTargets;
    private boolean mHasConsumer = false;
    private final Set<Runnable> mOnInvalidatedListeners = new HashSet();
    private boolean mIsClosed = false;
    private final List<t0.a<SurfaceRequest.TransformationInfo>> mTransformationUpdatesListeners = new ArrayList();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class SettableSurface extends DeferrableSurface {
        b.a<Surface> mCompleter;
        private SurfaceOutputImpl mConsumer;
        private DeferrableSurface mProvider;
        final c5.a<Surface> mSurfaceFuture;

        public SettableSurface(Size size, int i6) {
            super(size, i6);
            this.mSurfaceFuture = y.b.a(new b.c() { // from class: androidx.camera.core.processing.r
                @Override // y.b.c
                public final Object attachCompleter(b.a aVar) {
                    return this.s.lambda$new$0(aVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$close$1() {
            SurfaceOutputImpl surfaceOutputImpl = this.mConsumer;
            if (surfaceOutputImpl != null) {
                surfaceOutputImpl.requestClose();
            }
            if (this.mProvider == null) {
                b.a<Surface> aVar = this.mCompleter;
                aVar.f15193d = true;
                b.d<Surface> dVar = aVar.f15191b;
                if (dVar == null || !dVar.f15194t.cancel(true)) {
                    return;
                }
                aVar.f15190a = null;
                aVar.f15191b = null;
                aVar.f15192c = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$new$0(b.a aVar) {
            this.mCompleter = aVar;
            return "SettableFuture hashCode: " + hashCode();
        }

        public boolean canSetProvider() {
            Threads.checkMainThread();
            return this.mProvider == null && !isClosed();
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public void close() {
            super.close();
            Threads.runOnMain(new q(0, this));
        }

        public boolean hasProvider() {
            return this.mProvider != null;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public c5.a<Surface> provideSurface() {
            return this.mSurfaceFuture;
        }

        public void setConsumer(SurfaceOutputImpl surfaceOutputImpl) {
            androidx.work.j.f("Consumer can only be linked once.", this.mConsumer == null);
            this.mConsumer = surfaceOutputImpl;
        }

        public boolean setProvider(DeferrableSurface deferrableSurface, Runnable runnable) {
            Threads.checkMainThread();
            deferrableSurface.getClass();
            DeferrableSurface deferrableSurface2 = this.mProvider;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            androidx.work.j.f("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", deferrableSurface2 == null);
            androidx.work.j.a("The provider's size(" + getPrescribedSize() + ") must match the parent(" + deferrableSurface.getPrescribedSize() + ")", getPrescribedSize().equals(deferrableSurface.getPrescribedSize()));
            boolean z6 = getPrescribedStreamFormat() == deferrableSurface.getPrescribedStreamFormat();
            androidx.work.j.a("The provider's format(" + getPrescribedStreamFormat() + ") must match the parent(" + deferrableSurface.getPrescribedStreamFormat() + ")", z6);
            androidx.work.j.f("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", isClosed() ^ true);
            this.mProvider = deferrableSurface;
            Futures.propagate(deferrableSurface.getSurface(), this.mCompleter);
            deferrableSurface.incrementUseCount();
            getTerminationFuture().addListener(new androidx.activity.o(3, deferrableSurface), CameraXExecutors.directExecutor());
            deferrableSurface.getCloseFuture().addListener(runnable, CameraXExecutors.mainThreadExecutor());
            return true;
        }
    }

    public SurfaceEdge(int i6, int i7, StreamSpec streamSpec, Matrix matrix, boolean z6, Rect rect, int i8, int i9, boolean z7) {
        this.mTargets = i6;
        this.mFormat = i7;
        this.mStreamSpec = streamSpec;
        this.mSensorToBufferTransform = matrix;
        this.mHasCameraTransform = z6;
        this.mCropRect = rect;
        this.mRotationDegrees = i8;
        this.mTargetRotation = i9;
        this.mMirroring = z7;
        this.mSettableSurface = new SettableSurface(streamSpec.getResolution(), i7);
    }

    private void checkAndSetHasConsumer() {
        androidx.work.j.f("Consumer can only be linked once.", !this.mHasConsumer);
        this.mHasConsumer = true;
    }

    private void checkNotClosed() {
        androidx.work.j.f("Edge is already closed.", !this.mIsClosed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c5.a lambda$createSurfaceOutputFuture$2(SettableSurface settableSurface, int i6, SurfaceOutput.CameraInputInfo cameraInputInfo, SurfaceOutput.CameraInputInfo cameraInputInfo2, Surface surface) {
        surface.getClass();
        try {
            settableSurface.incrementUseCount();
            SurfaceOutputImpl surfaceOutputImpl = new SurfaceOutputImpl(surface, getTargets(), i6, this.mStreamSpec.getResolution(), cameraInputInfo, cameraInputInfo2, this.mSensorToBufferTransform);
            surfaceOutputImpl.getCloseFuture().addListener(new o(0, settableSurface), CameraXExecutors.directExecutor());
            settableSurface.setConsumer(surfaceOutputImpl);
            return Futures.immediateFuture(surfaceOutputImpl);
        } catch (DeferrableSurface.SurfaceClosedException e6) {
            return Futures.immediateFailedFuture(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSurfaceRequest$0() {
        if (this.mIsClosed) {
            return;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSurfaceRequest$1() {
        CameraXExecutors.mainThreadExecutor().execute(new p(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTransformation$3(int i6, int i7) {
        boolean z6;
        boolean z7 = true;
        if (this.mRotationDegrees != i6) {
            this.mRotationDegrees = i6;
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.mTargetRotation != i7) {
            this.mTargetRotation = i7;
        } else {
            z7 = z6;
        }
        if (z7) {
            notifyTransformationInfoUpdate();
        }
    }

    private void notifyTransformationInfoUpdate() {
        Threads.checkMainThread();
        SurfaceRequest.TransformationInfo transformationInfoOf = SurfaceRequest.TransformationInfo.of(this.mCropRect, this.mRotationDegrees, this.mTargetRotation, hasCameraTransform(), this.mSensorToBufferTransform, this.mMirroring);
        SurfaceRequest surfaceRequest = this.mProviderSurfaceRequest;
        if (surfaceRequest != null) {
            surfaceRequest.updateTransformationInfo(transformationInfoOf);
        }
        Iterator<t0.a<SurfaceRequest.TransformationInfo>> it = this.mTransformationUpdatesListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(transformationInfoOf);
        }
    }

    public void addOnInvalidatedListener(Runnable runnable) {
        Threads.checkMainThread();
        checkNotClosed();
        this.mOnInvalidatedListeners.add(runnable);
    }

    public void addTransformationUpdateListener(t0.a<SurfaceRequest.TransformationInfo> aVar) {
        aVar.getClass();
        this.mTransformationUpdatesListeners.add(aVar);
    }

    public final void close() {
        Threads.checkMainThread();
        this.mSettableSurface.close();
        this.mIsClosed = true;
    }

    public c5.a<SurfaceOutput> createSurfaceOutputFuture(final int i6, final SurfaceOutput.CameraInputInfo cameraInputInfo, final SurfaceOutput.CameraInputInfo cameraInputInfo2) {
        Threads.checkMainThread();
        checkNotClosed();
        checkAndSetHasConsumer();
        final SettableSurface settableSurface = this.mSettableSurface;
        return Futures.transformAsync(settableSurface.getSurface(), new AsyncFunction() { // from class: androidx.camera.core.processing.k
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final c5.a apply(Object obj) {
                return this.s.lambda$createSurfaceOutputFuture$2(settableSurface, i6, cameraInputInfo, cameraInputInfo2, (Surface) obj);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    public SurfaceRequest createSurfaceRequest(CameraInternal cameraInternal) {
        return createSurfaceRequest(cameraInternal, true);
    }

    public final void disconnect() {
        Threads.checkMainThread();
        checkNotClosed();
        this.mSettableSurface.close();
    }

    public Rect getCropRect() {
        return this.mCropRect;
    }

    public DeferrableSurface getDeferrableSurface() {
        Threads.checkMainThread();
        checkNotClosed();
        checkAndSetHasConsumer();
        return this.mSettableSurface;
    }

    public DeferrableSurface getDeferrableSurfaceForTesting() {
        return this.mSettableSurface;
    }

    public int getFormat() {
        return this.mFormat;
    }

    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    public Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    public StreamSpec getStreamSpec() {
        return this.mStreamSpec;
    }

    public int getTargets() {
        return this.mTargets;
    }

    public boolean hasCameraTransform() {
        return this.mHasCameraTransform;
    }

    public boolean hasProvider() {
        return this.mSettableSurface.hasProvider();
    }

    public void invalidate() {
        Threads.checkMainThread();
        checkNotClosed();
        if (this.mSettableSurface.canSetProvider()) {
            return;
        }
        this.mHasConsumer = false;
        this.mSettableSurface.close();
        this.mSettableSurface = new SettableSurface(this.mStreamSpec.getResolution(), this.mFormat);
        Iterator<Runnable> it = this.mOnInvalidatedListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public boolean isClosed() {
        return this.mIsClosed;
    }

    public boolean isMirroring() {
        return this.mMirroring;
    }

    public void removeTransformationUpdateListener(t0.a<SurfaceRequest.TransformationInfo> aVar) {
        aVar.getClass();
        this.mTransformationUpdatesListeners.remove(aVar);
    }

    public void setProvider(DeferrableSurface deferrableSurface) {
        Threads.checkMainThread();
        checkNotClosed();
        SettableSurface settableSurface = this.mSettableSurface;
        Objects.requireNonNull(settableSurface);
        settableSurface.setProvider(deferrableSurface, new l(0, settableSurface));
    }

    public void updateTransformation(int i6) {
        updateTransformation(i6, -1);
    }

    public SurfaceRequest createSurfaceRequest(CameraInternal cameraInternal, boolean z6) {
        Threads.checkMainThread();
        checkNotClosed();
        SurfaceRequest surfaceRequest = new SurfaceRequest(this.mStreamSpec.getResolution(), cameraInternal, z6, this.mStreamSpec.getDynamicRange(), this.mStreamSpec.getExpectedFrameRateRange(), new androidx.activity.o(2, this));
        try {
            final DeferrableSurface deferrableSurface = surfaceRequest.getDeferrableSurface();
            SettableSurface settableSurface = this.mSettableSurface;
            Objects.requireNonNull(settableSurface);
            if (settableSurface.setProvider(deferrableSurface, new l(0, settableSurface))) {
                c5.a<Void> terminationFuture = settableSurface.getTerminationFuture();
                Objects.requireNonNull(deferrableSurface);
                terminationFuture.addListener(new Runnable() { // from class: androidx.camera.core.processing.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        deferrableSurface.close();
                    }
                }, CameraXExecutors.directExecutor());
            }
            this.mProviderSurfaceRequest = surfaceRequest;
            notifyTransformationInfoUpdate();
            return surfaceRequest;
        } catch (DeferrableSurface.SurfaceClosedException e6) {
            throw new AssertionError("Surface is somehow already closed", e6);
        } catch (RuntimeException e7) {
            surfaceRequest.willNotProvideSurface();
            throw e7;
        }
    }

    public void updateTransformation(final int i6, final int i7) {
        Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.processing.n
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$updateTransformation$3(i6, i7);
            }
        });
    }
}
