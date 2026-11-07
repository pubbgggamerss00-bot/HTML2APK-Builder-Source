package u6;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkTagDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import k3.d;
import ph.u1;
import ph.v1;
import tg.h;
import u6.z0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: l, reason: collision with root package name */
    public static final String f29315l = t6.s.f("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f29317b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.a f29318c;

    /* renamed from: d, reason: collision with root package name */
    public final e7.c f29319d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f29320e;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f29322g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f29321f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f29324i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f29325j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f29316a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f29326k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f29323h = new HashMap();

    public r(Context context, androidx.work.a aVar, e7.c cVar, WorkDatabase workDatabase) {
        this.f29317b = context;
        this.f29318c = aVar;
        this.f29319d = cVar;
        this.f29320e = workDatabase;
    }

    public static boolean d(String str, z0 z0Var, int i10) {
        String str2 = f29315l;
        if (z0Var == null) {
            t6.s.d().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        z0Var.f29377m.n(new w0(i10));
        t6.s.d().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(e eVar) {
        synchronized (this.f29326k) {
            this.f29325j.add(eVar);
        }
    }

    public final z0 b(String str) {
        z0 z0Var = (z0) this.f29321f.remove(str);
        boolean z10 = z0Var != null;
        if (!z10) {
            z0Var = (z0) this.f29322g.remove(str);
        }
        this.f29323h.remove(str);
        if (z10) {
            synchronized (this.f29326k) {
                try {
                    if (this.f29321f.isEmpty()) {
                        Context context = this.f29317b;
                        String str2 = b7.b.f3655k;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f29317b.startService(intent);
                        } catch (Throwable th2) {
                            t6.s.d().c(f29315l, "Unable to stop foreground service", th2);
                        }
                        PowerManager.WakeLock wakeLock = this.f29316a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f29316a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return z0Var;
    }

    public final z0 c(String str) {
        z0 z0Var = (z0) this.f29321f.get(str);
        return z0Var == null ? (z0) this.f29322g.get(str) : z0Var;
    }

    public final void e(e eVar) {
        synchronized (this.f29326k) {
            this.f29325j.remove(eVar);
        }
    }

    public final boolean f(x xVar, WorkerParameters.a aVar) throws Throwable {
        boolean z10;
        c7.j jVar = xVar.f29358a;
        final String str = jVar.f5006a;
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.f29320e.runInTransaction(new Callable() { // from class: u6.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.f29309a.f29320e;
                WorkTagDao workTagDao = workDatabase.workTagDao();
                String str2 = str;
                arrayList.addAll(workTagDao.b(str2));
                return workDatabase.workSpecDao().s(str2);
            }
        });
        if (workSpec == null) {
            t6.s.d().g(f29315l, "Didn't find WorkSpec for id " + jVar);
            this.f29319d.f8401d.execute(new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.e(1, this, jVar));
            return false;
        }
        synchronized (this.f29326k) {
            try {
                try {
                    synchronized (this.f29326k) {
                        try {
                            z10 = c(str) != null;
                        } finally {
                            th = th;
                            while (true) {
                                Throwable th2 = th;
                                try {
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
            try {
                if (z10) {
                    Set set = (Set) this.f29323h.get(str);
                    if (((x) set.iterator().next()).f29358a.f5007b == jVar.f5007b) {
                        set.add(xVar);
                        t6.s.d().a(f29315l, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        this.f29319d.f8401d.execute(new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.e(1, this, jVar));
                    }
                    return false;
                }
                if (workSpec.f3186t != jVar.f5007b) {
                    this.f29319d.f8401d.execute(new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.e(1, this, jVar));
                    return false;
                }
                final z0 z0Var = new z0(new z0.a(this.f29317b, this.f29318c, this.f29319d, this, this.f29320e, workSpec, arrayList));
                ph.g0 g0Var = z0Var.f29368d.f8399b;
                u1 u1VarA = v1.a();
                g0Var.getClass();
                tg.h context = h.a.C0291a.c(g0Var, u1VarA);
                b1 b1Var = new b1(z0Var, null);
                ph.k0 k0Var = ph.k0.f21553a;
                kotlin.jvm.internal.r.e(context, "context");
                final d.C0161d c0161dA = k3.d.a(new t6.m(context, k0Var, b1Var));
                c0161dA.f15971b.a(new Runnable() { // from class: u6.q
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zBooleanValue;
                        r rVar = this.f29312a;
                        d.C0161d c0161d = c0161dA;
                        z0 z0Var2 = z0Var;
                        try {
                            zBooleanValue = ((Boolean) c0161d.f15971b.get()).booleanValue();
                        } catch (InterruptedException | ExecutionException unused) {
                            zBooleanValue = true;
                        }
                        synchronized (rVar.f29326k) {
                            try {
                                c7.j jVarA = c7.i0.a(z0Var2.f29365a);
                                String str2 = jVarA.f5006a;
                                if (rVar.c(str2) == z0Var2) {
                                    rVar.b(str2);
                                }
                                t6.s.d().a(r.f29315l, r.class.getSimpleName() + " " + str2 + " executed; reschedule = " + zBooleanValue);
                                ArrayList arrayList2 = rVar.f29325j;
                                int size = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList2.get(i10);
                                    i10++;
                                    ((e) obj).b(jVarA, zBooleanValue);
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                    }
                }, this.f29319d.f8401d);
                this.f29322g.put(str, z0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(xVar);
                this.f29323h.put(str, hashSet);
                t6.s.d().a(f29315l, r.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th6) {
                Throwable th7 = th6;
                throw th7;
            }
        }
    }
}
