package d7;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.model.WorkSpec;
import c7.i0;
import java.util.UUID;
import u6.z0;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f7413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f7414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6.j f7415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f7416d;

    public /* synthetic */ y(z zVar, UUID uuid, t6.j jVar, Context context) {
        this.f7413a = zVar;
        this.f7414b = uuid;
        this.f7415c = jVar;
        this.f7416d = context;
    }

    @Override // eh.a
    public final Object invoke() {
        z zVar = this.f7413a;
        UUID uuid = this.f7414b;
        t6.j jVar = this.f7415c;
        Context context = this.f7416d;
        String string = uuid.toString();
        WorkSpec workSpecS = zVar.f7419c.s(string);
        if (workSpecS == null || workSpecS.f3168b.a()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        u6.r rVar = zVar.f7418b;
        synchronized (rVar.f29326k) {
            try {
                t6.s.d().e(u6.r.f29315l, "Moving WorkSpec (" + string + ") to the foreground");
                z0 z0Var = (z0) rVar.f29322g.remove(string);
                if (z0Var != null) {
                    if (rVar.f29316a == null) {
                        PowerManager.WakeLock wakeLockA = u.a(rVar.f29317b, "ProcessorForegroundLck");
                        rVar.f29316a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    rVar.f29321f.put(string, z0Var);
                    p3.b.startForegroundService(rVar.f29317b, b7.b.c(rVar.f29317b, i0.a(z0Var.f29365a), jVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c7.j jVarA = i0.a(workSpecS);
        String str = b7.b.f3655k;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", jVar.f28029a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar.f28030b);
        intent.putExtra("KEY_NOTIFICATION", jVar.f28031c);
        intent.putExtra("KEY_WORKSPEC_ID", jVarA.f5006a);
        intent.putExtra("KEY_GENERATION", jVarA.f5007b);
        context.startService(intent);
        return null;
    }
}
