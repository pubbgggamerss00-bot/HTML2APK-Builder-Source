package d2;

import android.os.Trace;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static void b(int i6, String str) {
        Trace.setCounter(str, i6);
    }
}
