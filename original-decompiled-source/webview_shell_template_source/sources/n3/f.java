package n3;

import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ h s;

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.s.f13923a;
        long j6 = h.b(context).getLong("app_set_id_last_used_time", -1L);
        long j7 = j6 != -1 ? j6 + 33696000000L : -1L;
        if (j7 == -1 || System.currentTimeMillis() <= j7) {
            return;
        }
        if (!h.b(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }
}
