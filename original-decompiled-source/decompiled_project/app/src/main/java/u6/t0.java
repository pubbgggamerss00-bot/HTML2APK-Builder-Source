package u6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import b9.i1;
import b9.t1;
import java.util.Iterator;
import java.util.List;
import t6.s;

/* loaded from: classes.dex */
public final class t0 extends t6.d0 {

    /* renamed from: k, reason: collision with root package name */
    public static t0 f29333k;

    /* renamed from: l, reason: collision with root package name */
    public static t0 f29334l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f29335m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f29336a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.a f29337b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f29338c;

    /* renamed from: d, reason: collision with root package name */
    public final e7.b f29339d;

    /* renamed from: e, reason: collision with root package name */
    public final List<t> f29340e;

    /* renamed from: f, reason: collision with root package name */
    public final r f29341f;

    /* renamed from: g, reason: collision with root package name */
    public final d7.q f29342g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29343h = false;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f29344i;

    /* renamed from: j, reason: collision with root package name */
    public final a7.p f29345j;

    static {
        t6.s.f("WorkManagerImpl");
        f29333k = null;
        f29334l = null;
        f29335m = new Object();
    }

    public t0(Context context, final androidx.work.a aVar, e7.b bVar, final WorkDatabase workDatabase, final List<t> list, r rVar, a7.p pVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        s.a aVar2 = new s.a(aVar.f3123h);
        synchronized (t6.s.f28049a) {
            try {
                if (t6.s.f28050b == null) {
                    t6.s.f28050b = aVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f29336a = applicationContext;
        this.f29339d = bVar;
        this.f29338c = workDatabase;
        this.f29341f = rVar;
        this.f29345j = pVar;
        this.f29337b = aVar;
        this.f29340e = list;
        ph.g0 g0VarA = bVar.a();
        kotlin.jvm.internal.r.d(g0VarA, "taskExecutor.taskCoroutineDispatcher");
        uh.c cVarA = ph.j0.a(g0VarA);
        this.f29342g = new d7.q(workDatabase);
        final d7.s sVarC = bVar.c();
        String str = w.f29356a;
        rVar.a(new e() { // from class: u6.u
            @Override // u6.e
            public final void b(final c7.j jVar, boolean z10) {
                final List list2 = list;
                final androidx.work.a aVar3 = aVar;
                final WorkDatabase workDatabase2 = workDatabase;
                sVarC.execute(new Runnable() { // from class: u6.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((t) it.next()).e(jVar.f5006a);
                        }
                        w.b(aVar3, workDatabase2, list3);
                    }
                });
            }
        });
        bVar.d(new ForceStopRunnable(applicationContext, this));
        String str2 = c0.f29267a;
        if (d7.r.a(applicationContext, aVar)) {
            ph.h.c(cVarA, null, null, new sh.j(new sh.c0(gg.a.d(gg.a.b(new sh.q(workDatabase.workSpecDao().f(), new a0(4, null)), -1)), new b0(applicationContext, null)), null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t0 b(Context context) {
        t0 t0VarB;
        Object obj = f29335m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    t0VarB = f29333k;
                    if (t0VarB == null) {
                        t0VarB = f29334l;
                    }
                }
                return t0VarB;
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (t0VarB == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            c(applicationContext, ((a.b) applicationContext).a());
            t0VarB = b(applicationContext);
        }
        return t0VarB;
    }

    public static void c(Context context, androidx.work.a aVar) {
        synchronized (f29335m) {
            try {
                t0 t0Var = f29333k;
                if (t0Var != null && f29334l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (t0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f29334l == null) {
                        f29334l = androidx.work.impl.a.a(applicationContext, aVar);
                    }
                    f29333k = f29334l;
                }
            } finally {
            }
        }
    }

    public final t6.x a(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        d0 d0Var = new d0(this, list);
        if (d0Var.f29280f) {
            t6.s.d().g(d0.f29274h, "Already enqueued work ids (" + TextUtils.join(", ", d0Var.f29278d) + ")");
        } else {
            d0Var.f29281g = t6.a0.a(this.f29337b.f3128m, "EnqueueRunnable_KEEP", this.f29339d.c(), new i1(d0Var, 2));
        }
        return d0Var.f29281g;
    }

    public final void d() {
        synchronized (f29335m) {
            try {
                this.f29343h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f29344i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f29344i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        c2.y yVar = this.f29337b.f3128m;
        t1 t1Var = new t1(this, 3);
        kotlin.jvm.internal.r.e(yVar, "<this>");
        boolean zB = m6.a.b();
        if (zB) {
            try {
                yVar.c("ReschedulingWork");
            } catch (Throwable th2) {
                if (zB) {
                    Trace.endSection();
                }
                throw th2;
            }
        }
        t1Var.invoke();
        if (zB) {
            Trace.endSection();
        }
    }
}
