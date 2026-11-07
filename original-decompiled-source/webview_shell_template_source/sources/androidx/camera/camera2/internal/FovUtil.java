package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.impl.utils.TransformUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class FovUtil {
    private static final String TAG = "FovUtil";

    private FovUtil() {
    }

    public static int focalLengthToViewAngleDegrees(float f6, float f7) {
        androidx.work.j.a("Focal length should be positive.", f6 > 0.0f);
        androidx.work.j.a("Sensor length should be positive.", f7 > 0.0f);
        int degrees = (int) Math.toDegrees(Math.atan(f7 / (f6 * 2.0f)) * 2.0d);
        androidx.work.j.c("The provided focal length and sensor length result in an invalid view angle degrees.", degrees, 0, 360);
        return degrees;
    }

    public static float getDefaultFocalLength(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        float[] fArr = (float[]) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        androidx.work.j.e("The focal lengths can not be empty.", fArr);
        return fArr[0];
    }

    public static int getDeviceDefaultViewAngleDegrees(CameraManagerCompat cameraManagerCompat, int i6) {
        try {
            for (String str : cameraManagerCompat.getCameraIdList()) {
                CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
                Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING);
                androidx.work.j.e("Lens facing can not be null", num);
                if (num.intValue() == LensFacingUtil.getLensFacingInt(i6)) {
                    return focalLengthToViewAngleDegrees(getDefaultFocalLength(cameraCharacteristicsCompat), getSensorHorizontalLength(cameraCharacteristicsCompat));
                }
            }
            throw new IllegalArgumentException("Unable to get the default focal length with the specified lens facing.");
        } catch (CameraAccessExceptionCompat unused) {
            throw new IllegalArgumentException("Unable to get the default focal length.");
        }
    }

    public static float getSensorHorizontalLength(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        SizeF sizeFReverseSizeF = (SizeF) cameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) cameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size sizeReverseSize = (Size) cameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_ORIENTATION);
        androidx.work.j.e("The sensor size can't be null.", sizeFReverseSizeF);
        androidx.work.j.e("The sensor orientation can't be null.", num);
        androidx.work.j.e("The active array size can't be null.", rect);
        androidx.work.j.e("The pixel array size can't be null.", sizeReverseSize);
        Size sizeRectToSize = TransformUtils.rectToSize(rect);
        if (TransformUtils.is90or270(num.intValue())) {
            sizeFReverseSizeF = TransformUtils.reverseSizeF(sizeFReverseSizeF);
            sizeRectToSize = TransformUtils.reverseSize(sizeRectToSize);
            sizeReverseSize = TransformUtils.reverseSize(sizeReverseSize);
        }
        return (sizeFReverseSizeF.getWidth() * sizeRectToSize.getWidth()) / sizeReverseSize.getWidth();
    }
}
