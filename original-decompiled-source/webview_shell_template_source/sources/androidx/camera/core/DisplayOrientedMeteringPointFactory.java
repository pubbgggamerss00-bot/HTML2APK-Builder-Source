package androidx.camera.core;

import android.graphics.PointF;
import android.view.Display;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class DisplayOrientedMeteringPointFactory extends MeteringPointFactory {
    private final CameraInfo mCameraInfo;
    private final Display mDisplay;
    private final float mHeight;
    private final float mWidth;

    public DisplayOrientedMeteringPointFactory(Display display, CameraInfo cameraInfo, float f6, float f7) {
        this.mWidth = f6;
        this.mHeight = f7;
        this.mDisplay = display;
        this.mCameraInfo = cameraInfo;
    }

    private int getRelativeCameraOrientation(boolean z6) {
        try {
            int sensorRotationDegrees = this.mCameraInfo.getSensorRotationDegrees(this.mDisplay.getRotation());
            return z6 ? (360 - sensorRotationDegrees) % 360 : sensorRotationDegrees;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.camera.core.MeteringPointFactory
    public PointF convertPoint(float f6, float f7) {
        float f8 = this.mWidth;
        float f9 = this.mHeight;
        boolean z6 = this.mCameraInfo.getLensFacing() == 0;
        int relativeCameraOrientation = getRelativeCameraOrientation(z6);
        if (relativeCameraOrientation != 90 && relativeCameraOrientation != 270) {
            f7 = f6;
            f6 = f7;
            f9 = f8;
            f8 = f9;
        }
        if (relativeCameraOrientation == 90) {
            f6 = f8 - f6;
        } else if (relativeCameraOrientation == 180) {
            f7 = f9 - f7;
            f6 = f8 - f6;
        } else if (relativeCameraOrientation == 270) {
            f7 = f9 - f7;
        }
        if (z6) {
            f7 = f9 - f7;
        }
        return new PointF(f7 / f9, f6 / f8);
    }
}
