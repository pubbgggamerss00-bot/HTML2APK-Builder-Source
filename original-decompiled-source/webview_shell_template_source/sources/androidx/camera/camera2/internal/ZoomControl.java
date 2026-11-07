package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class ZoomControl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private static final String TAG = "ZoomControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final ZoomStateImpl mCurrentZoomState;
    private final Executor mExecutor;
    final ZoomImpl mZoomImpl;
    private final androidx.lifecycle.r<ZoomState> mZoomStateLiveData;
    private boolean mIsActive = false;
    private Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ZoomControl.1
        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            ZoomControl.this.mZoomImpl.onCaptureResult(totalCaptureResult);
            return false;
        }
    };

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface ZoomImpl {
        void addRequestOption(Camera2ImplConfig.Builder builder);

        Rect getCropSensorRegion();

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(TotalCaptureResult totalCaptureResult);

        void resetZoom();

        void setZoomRatio(float f6, b.a<Void> aVar);
    }

    public ZoomControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        ZoomImpl zoomImplCreateZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        this.mZoomImpl = zoomImplCreateZoomImpl;
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(zoomImplCreateZoomImpl.getMaxZoom(), zoomImplCreateZoomImpl.getMinZoom());
        this.mCurrentZoomState = zoomStateImpl;
        zoomStateImpl.setZoomRatio(1.0f);
        this.mZoomStateLiveData = new androidx.lifecycle.r<>(ImmutableZoomState.create(zoomStateImpl));
        camera2CameraControlImpl.addCaptureResultListener(this.mCaptureResultListener);
    }

    private static ZoomImpl createZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isAndroidRZoomSupported(cameraCharacteristicsCompat) ? new AndroidRZoomImpl(cameraCharacteristicsCompat) : new CropRegionZoomImpl(cameraCharacteristicsCompat);
    }

    public static ZoomState getDefaultZoomState(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        ZoomImpl zoomImplCreateZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(zoomImplCreateZoomImpl.getMaxZoom(), zoomImplCreateZoomImpl.getMinZoom());
        zoomStateImpl.setZoomRatio(1.0f);
        return ImmutableZoomState.create(zoomStateImpl);
    }

    private static Range<Float> getZoomRatioRange(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        try {
            return (Range) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e6) {
            Logger.w(TAG, "AssertionError, fail to get camera characteristic.", e6);
            return null;
        }
    }

    public static boolean isAndroidRZoomSupported(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return Build.VERSION.SDK_INT >= 30 && getZoomRatioRange(cameraCharacteristicsCompat) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setLinearZoom$3(final ZoomState zoomState, final b.a aVar) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.c2
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$setLinearZoom$2(aVar, zoomState);
            }
        });
        return "setLinearZoom";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setZoomRatio$1(final ZoomState zoomState, final b.a aVar) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.b2
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$setZoomRatio$0(aVar, zoomState);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitCameraZoomRatio, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$setZoomRatio$0(b.a<Void> aVar, ZoomState zoomState) {
        ZoomState zoomStateCreate;
        if (this.mIsActive) {
            this.mZoomImpl.setZoomRatio(zoomState.getZoomRatio(), aVar);
            this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
            return;
        }
        synchronized (this.mCurrentZoomState) {
            this.mCurrentZoomState.setZoomRatio(1.0f);
            zoomStateCreate = ImmutableZoomState.create(this.mCurrentZoomState);
        }
        updateLiveData(zoomStateCreate);
        aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    private void updateLiveData(ZoomState zoomState) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.mZoomStateLiveData.setValue(zoomState);
        } else {
            this.mZoomStateLiveData.postValue(zoomState);
        }
    }

    public void addZoomOption(Camera2ImplConfig.Builder builder) {
        this.mZoomImpl.addRequestOption(builder);
    }

    public Rect getCropSensorRegion() {
        return this.mZoomImpl.getCropSensorRegion();
    }

    public LiveData<ZoomState> getZoomState() {
        return this.mZoomStateLiveData;
    }

    public void setActive(boolean z6) {
        ZoomState zoomStateCreate;
        if (this.mIsActive == z6) {
            return;
        }
        this.mIsActive = z6;
        if (z6) {
            return;
        }
        synchronized (this.mCurrentZoomState) {
            this.mCurrentZoomState.setZoomRatio(1.0f);
            zoomStateCreate = ImmutableZoomState.create(this.mCurrentZoomState);
        }
        updateLiveData(zoomStateCreate);
        this.mZoomImpl.resetZoom();
        this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
    }

    public c5.a<Void> setLinearZoom(float f6) {
        final ZoomState zoomStateCreate;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setLinearZoom(f6);
                zoomStateCreate = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e6) {
                return Futures.immediateFailedFuture(e6);
            }
        }
        updateLiveData(zoomStateCreate);
        return y.b.a(new b.c() { // from class: androidx.camera.camera2.internal.d2
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar) {
                return this.s.lambda$setLinearZoom$3(zoomStateCreate, aVar);
            }
        });
    }

    public c5.a<Void> setZoomRatio(float f6) {
        ZoomState zoomStateCreate;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setZoomRatio(f6);
                zoomStateCreate = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e6) {
                return Futures.immediateFailedFuture(e6);
            }
        }
        updateLiveData(zoomStateCreate);
        return y.b.a(new x0(this, zoomStateCreate));
    }
}
