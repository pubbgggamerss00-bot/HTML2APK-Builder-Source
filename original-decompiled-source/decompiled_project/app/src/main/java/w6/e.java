package w6;

import a7.p;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.model.WorkSpec;
import c7.j;
import d7.b0;
import d7.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import ph.g0;
import ph.l2;
import q8.t;
import t6.s;
import u6.r;
import u6.x;
import w6.f;
import y6.b;
import y6.h;
import y6.l;
import y6.n;

/* loaded from: classes.dex */
public final class e implements h, b0.a {

    /* renamed from: q, reason: collision with root package name */
    public static final String f31288q = s.f("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f31289a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31290b;

    /* renamed from: c, reason: collision with root package name */
    public final j f31291c;

    /* renamed from: d, reason: collision with root package name */
    public final f f31292d;

    /* renamed from: e, reason: collision with root package name */
    public final l f31293e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f31294f;

    /* renamed from: g, reason: collision with root package name */
    public int f31295g;

    /* renamed from: h, reason: collision with root package name */
    public final e7.a f31296h;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f31297j;

    /* renamed from: k, reason: collision with root package name */
    public PowerManager.WakeLock f31298k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31299l;

    /* renamed from: m, reason: collision with root package name */
    public final x f31300m;

    /* renamed from: n, reason: collision with root package name */
    public final g0 f31301n;

    /* renamed from: p, reason: collision with root package name */
    public volatile l2 f31302p;

    public e(Context context, int i10, f fVar, x xVar) {
        this.f31289a = context;
        this.f31290b = i10;
        this.f31292d = fVar;
        this.f31291c = xVar.f29358a;
        this.f31300m = xVar;
        p pVar = fVar.f31308e.f29345j;
        e7.b bVar = fVar.f31305b;
        this.f31296h = bVar.c();
        this.f31297j = bVar.b();
        this.f31301n = bVar.a();
        this.f31293e = new l(pVar);
        this.f31299l = false;
        this.f31295g = 0;
        this.f31294f = new Object();
    }

    public static void c(e eVar) {
        boolean z10;
        int i10 = eVar.f31290b;
        Executor executor = eVar.f31297j;
        Context context = eVar.f31289a;
        String str = f31288q;
        f fVar = eVar.f31292d;
        j jVar = eVar.f31291c;
        String str2 = jVar.f5006a;
        if (eVar.f31295g >= 2) {
            s.d().a(str, "Already stopped work for " + str2);
            return;
        }
        eVar.f31295g = 2;
        s.d().a(str, "Stopping work for WorkSpec " + str2);
        String str3 = b.f31277f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        b.d(intent, jVar);
        executor.execute(new f.b(i10, intent, fVar));
        r rVar = fVar.f31307d;
        String str4 = jVar.f5006a;
        synchronized (rVar.f29326k) {
            z10 = rVar.c(str4) != null;
        }
        if (!z10) {
            s.d().a(str, "Processor does not have WorkSpec " + str2 + ". No need to reschedule");
            return;
        }
        s.d().a(str, "WorkSpec " + str2 + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        b.d(intent2, jVar);
        executor.execute(new f.b(i10, intent2, fVar));
    }

    public static void d(e eVar) {
        if (eVar.f31295g != 0) {
            s.d().a(f31288q, "Already started work for " + eVar.f31291c);
            return;
        }
        eVar.f31295g = 1;
        s.d().a(f31288q, "onAllConstraintsMet for " + eVar.f31291c);
        if (!eVar.f31292d.f31307d.f(eVar.f31300m, null)) {
            eVar.e();
            return;
        }
        b0 b0Var = eVar.f31292d.f31306c;
        j jVar = eVar.f31291c;
        synchronized (b0Var.f7381d) {
            s.d().a(b0.f7377e, "Starting timer for " + jVar);
            b0Var.a(jVar);
            b0.b bVar = new b0.b(b0Var, jVar);
            b0Var.f7379b.put(jVar, bVar);
            b0Var.f7380c.put(jVar, eVar);
            b0Var.f7378a.b(SignalCredentialStateController.MAX_RETRY_TIME, bVar);
        }
    }

    @Override // y6.h
    public final void a(WorkSpec workSpec, y6.b bVar) {
        boolean z10 = bVar instanceof b.a;
        e7.a aVar = this.f31296h;
        if (z10) {
            ((d7.s) aVar).execute(new d(this));
        } else {
            ((d7.s) aVar).execute(new t(this, 1));
        }
    }

    @Override // d7.b0.a
    public final void b(j jVar) {
        s.d().a(f31288q, "Exceeded time limits on execution for " + jVar);
        ((d7.s) this.f31296h).execute(new t(this, 1));
    }

    public final void e() {
        synchronized (this.f31294f) {
            try {
                if (this.f31302p != null) {
                    this.f31302p.cancel((CancellationException) null);
                }
                this.f31292d.f31306c.a(this.f31291c);
                PowerManager.WakeLock wakeLock = this.f31298k;
                if (wakeLock != null && wakeLock.isHeld()) {
                    s.d().a(f31288q, "Releasing wakelock " + this.f31298k + "for WorkSpec " + this.f31291c);
                    this.f31298k.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        String str = this.f31291c.f5006a;
        Context context = this.f31289a;
        StringBuilder sbA = v5.b.a(str, " (");
        sbA.append(this.f31290b);
        sbA.append(")");
        this.f31298k = u.a(context, sbA.toString());
        s sVarD = s.d();
        String str2 = f31288q;
        sVarD.a(str2, "Acquiring wakelock " + this.f31298k + "for WorkSpec " + str);
        this.f31298k.acquire();
        WorkSpec workSpecS = this.f31292d.f31308e.f29338c.workSpecDao().s(str);
        if (workSpecS == null) {
            ((d7.s) this.f31296h).execute(new t(this, 1));
            return;
        }
        boolean zB = workSpecS.b();
        this.f31299l = zB;
        if (zB) {
            this.f31302p = n.a(this.f31293e, workSpecS, this.f31301n, this);
            return;
        }
        s.d().a(str2, "No constraints for ".concat(str));
        ((d7.s) this.f31296h).execute(new d(this));
    }

    public final void g(boolean z10) {
        s sVarD = s.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        j jVar = this.f31291c;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z10);
        sVarD.a(f31288q, sb.toString());
        e();
        int i10 = this.f31290b;
        f fVar = this.f31292d;
        Executor executor = this.f31297j;
        Context context = this.f31289a;
        if (z10) {
            String str = b.f31277f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            b.d(intent, jVar);
            executor.execute(new f.b(i10, intent, fVar));
        }
        if (this.f31299l) {
            String str2 = b.f31277f;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new f.b(i10, intent2, fVar));
        }
    }
}
