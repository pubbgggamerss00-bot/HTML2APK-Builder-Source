package i3;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {
    public static void a(Context context, Throwable th) {
        try {
            l.f(context);
            l.f(th);
        } catch (Exception e6) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e6);
        }
    }
}
