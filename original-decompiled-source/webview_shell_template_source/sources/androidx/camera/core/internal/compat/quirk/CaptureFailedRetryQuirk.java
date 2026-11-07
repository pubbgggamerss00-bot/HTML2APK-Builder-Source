package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.Quirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CaptureFailedRetryQuirk implements Quirk {
    private static final Set<Pair<String, String>> FAILED_RETRY_ALLOW_LIST = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    public static boolean load() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return FAILED_RETRY_ALLOW_LIST.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    public int getRetryCount() {
        return 1;
    }
}
