package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.ImageUtil;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ExifRotationAvailability {
    public boolean isRotationOptionSupported() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) DeviceQuirks.get(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.isSupported(CaptureConfig.OPTION_ROTATION);
    }

    public boolean shouldUseExifOrientation(ImageProxy imageProxy) {
        return isRotationOptionSupported() && ImageUtil.isJpegFormats(imageProxy.getFormat());
    }
}
