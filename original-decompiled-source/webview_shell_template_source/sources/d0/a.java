package d0;

import android.annotation.SuppressLint;
import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public final class a {
    public static String a(Context context, int i6) {
        if (i6 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i6);
        } catch (Exception unused) {
            return androidx.camera.camera2.internal.compat.workaround.c.d(i6, "?");
        }
    }
}
