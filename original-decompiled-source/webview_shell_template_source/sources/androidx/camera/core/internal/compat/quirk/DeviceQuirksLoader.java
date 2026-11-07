package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    public static List<Quirk> loadQuirks(QuirkSettings quirkSettings) {
        ArrayList arrayList = new ArrayList();
        if (quirkSettings.shouldEnableQuirk(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.load())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(SurfaceOrderQuirk.class, SurfaceOrderQuirk.load())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.load())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(LowMemoryQuirk.class, LowMemoryQuirk.load())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(LargeJpegImageQuirk.class, LargeJpegImageQuirk.load())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.load())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        return arrayList;
    }
}
