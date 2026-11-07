package n3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import v3.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements z2.a {

    /* renamed from: d, reason: collision with root package name */
    public static h f13922d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13923a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f13924b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f13925c;

    public h(Context context) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f13924b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f13925c = Executors.newSingleThreadExecutor();
        this.f13923a = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new f(this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final SharedPreferences b(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void c(Context context) {
        if (b(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new g("Failed to store the app set ID last used time.");
    }

    @Override // z2.a
    public final p a() {
        v3.f fVar = new v3.f();
        this.f13925c.execute(new i0.d(1, this, fVar));
        return fVar.f14800a;
    }
}
