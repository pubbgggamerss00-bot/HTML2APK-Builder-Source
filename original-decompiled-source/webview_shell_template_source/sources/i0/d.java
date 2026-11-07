package i0;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13290t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13291u;

    public /* synthetic */ d(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f13290t = obj;
        this.f13291u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws n3.g {
        switch (this.s) {
            case 0:
                try {
                    Method method = e.f13295d;
                    Object obj = this.f13291u;
                    Object obj2 = this.f13290t;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e.f13296e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e6) {
                    if (e6.getClass() == RuntimeException.class && e6.getMessage() != null && e6.getMessage().startsWith("Unable to stop")) {
                        throw e6;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            default:
                n3.h hVar = (n3.h) this.f13290t;
                v3.p pVar = ((v3.f) this.f13291u).f14800a;
                Context context = hVar.f13923a;
                String string = n3.h.b(context).getString("app_set_id", null);
                long j6 = n3.h.b(context).getLong("app_set_id_last_used_time", -1L);
                long j7 = j6 != -1 ? j6 + 33696000000L : -1L;
                if (string == null || System.currentTimeMillis() > j7) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String strValueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                            throw new n3.g("Failed to store the app set ID.");
                        }
                        n3.h.c(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new n3.g("Failed to store the app set ID creation time.");
                        }
                    } catch (n3.g e7) {
                        pVar.i(e7);
                        return;
                    }
                } else {
                    try {
                        n3.h.c(context);
                    } catch (n3.g e8) {
                        pVar.i(e8);
                        return;
                    }
                }
                pVar.j(new z2.b(string, 1));
                return;
        }
    }
}
