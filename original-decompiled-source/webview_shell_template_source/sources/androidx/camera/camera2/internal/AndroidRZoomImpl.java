package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.params.CaptureRequestParameterCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AndroidRZoomImpl implements ZoomControl.ZoomImpl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private float mCurrentZoomRatio = 1.0f;
    private float mPendingZoomRatio = 1.0f;
    private b.a<Void> mPendingZoomRatioCompleter;
    private boolean mShouldOverrideZoom;
    private final Range<Float> mZoomRatioRange;

    public AndroidRZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mShouldOverrideZoom = false;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mZoomRatioRange = (Range) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.mShouldOverrideZoom = cameraCharacteristicsCompat.isZoomOverrideAvailable();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void addRequestOption(Camera2ImplConfig.Builder builder) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.mCurrentZoomRatio);
        Config.OptionPriority optionPriority = Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, fValueOf, optionPriority);
        if (this.mShouldOverrideZoom) {
            CaptureRequestParameterCompat.setSettingsOverrideZoom(builder, optionPriority);
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public Rect getCropSensorRegion() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMaxZoom() {
        return ((Float) this.mZoomRatioRange.getUpper()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMinZoom() {
        return ((Float) this.mZoomRatioRange.getLower()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        if (this.mPendingZoomRatioCompleter != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f6 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f6 == null) {
                return;
            }
            if (this.mPendingZoomRatio == f6.floatValue()) {
                this.mPendingZoomRatioCompleter.a(null);
                this.mPendingZoomRatioCompleter = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void resetZoom() {
        this.mCurrentZoomRatio = 1.0f;
        b.a<Void> aVar = this.mPendingZoomRatioCompleter;
        if (aVar != null) {
            aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void setZoomRatio(float f6, b.a<Void> aVar) {
        this.mCurrentZoomRatio = f6;
        b.a<Void> aVar2 = this.mPendingZoomRatioCompleter;
        if (aVar2 != null) {
            aVar2.b(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.mPendingZoomRatio = this.mCurrentZoomRatio;
        this.mPendingZoomRatioCompleter = aVar;
    }
}
