package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements Quirk {
    private static final List<String> SUPPORTED_DEVICES = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean load() {
        return "Google".equals(Build.MANUFACTURER) && SUPPORTED_DEVICES.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
