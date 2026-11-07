package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class CropRegionZoomImpl implements ZoomControl.ZoomImpl {
    public static final float MIN_DIGITAL_ZOOM = 1.0f;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private Rect mCurrentCropRect = null;
    private Rect mPendingZoomCropRegion = null;
    private b.a<Void> mPendingZoomRatioCompleter;

    public CropRegionZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
    }

    private static Rect getCropRectByRatio(Rect rect, float f6) {
        float fWidth = rect.width() / f6;
        float fHeight = rect.height() / f6;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    private Rect getSensorRect() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void addRequestOption(Camera2ImplConfig.Builder builder) {
        Rect rect = this.mCurrentCropRect;
        if (rect != null) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.SCALER_CROP_REGION, rect, Config.OptionPriority.REQUIRED);
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public Rect getCropSensorRegion() {
        Rect rect = this.mCurrentCropRect;
        return rect != null ? rect : getSensorRect();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMaxZoom() {
        Float f6 = (Float) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f6 == null) {
            return 1.0f;
        }
        return f6.floatValue() < getMinZoom() ? getMinZoom() : f6.floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMinZoom() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        if (this.mPendingZoomRatioCompleter != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.mPendingZoomCropRegion;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.mPendingZoomRatioCompleter.a(null);
            this.mPendingZoomRatioCompleter = null;
            this.mPendingZoomCropRegion = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void resetZoom() {
        this.mPendingZoomCropRegion = null;
        this.mCurrentCropRect = null;
        b.a<Void> aVar = this.mPendingZoomRatioCompleter;
        if (aVar != null) {
            aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void setZoomRatio(float f6, b.a<Void> aVar) {
        this.mCurrentCropRect = getCropRectByRatio(getSensorRect(), f6);
        b.a<Void> aVar2 = this.mPendingZoomRatioCompleter;
        if (aVar2 != null) {
            aVar2.b(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.mPendingZoomCropRegion = this.mCurrentCropRect;
        this.mPendingZoomRatioCompleter = aVar;
    }
}
