package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class LowMemoryQuirk implements Quirk {
    private static final Set<String> DEVICE_MODELS = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    public static boolean load() {
        return DEVICE_MODELS.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
