package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.ExposureState;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ExposureStateImpl implements ExposureState {
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private int mExposureCompensation;
    private final Object mLock = new Object();

    public ExposureStateImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i6) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mExposureCompensation = i6;
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        int i6;
        synchronized (this.mLock) {
            i6 = this.mExposureCompensation;
        }
        return i6;
    }

    @Override // androidx.camera.core.ExposureState
    public Range<Integer> getExposureCompensationRange() {
        return (Range) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        return !isExposureCompensationSupported() ? Rational.ZERO : (Rational) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        Range range = (Range) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    public void setExposureCompensationIndex(int i6) {
        synchronized (this.mLock) {
            this.mExposureCompensation = i6;
        }
    }
}
