package j2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.camera.camera2.internal.k0;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import k0.a;
import s2.n;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements b, q2.a {
    public static final String D = androidx.work.k.e("Processor");

    /* renamed from: t, reason: collision with root package name */
    public final Context f13451t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.work.c f13452u;

    /* renamed from: v, reason: collision with root package name */
    public final u2.b f13453v;

    /* renamed from: w, reason: collision with root package name */
    public final WorkDatabase f13454w;

    /* renamed from: z, reason: collision with root package name */
    public final List<e> f13457z;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f13456y = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f13455x = new HashMap();
    public final HashSet A = new HashSet();
    public final ArrayList B = new ArrayList();
    public PowerManager.WakeLock s = null;
    public final Object C = new Object();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements Runnable {
        public d s;

        /* renamed from: t, reason: collision with root package name */
        public String f13458t;

        /* renamed from: u, reason: collision with root package name */
        public t2.c f13459u;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f13459u.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.s.c(this.f13458t, zBooleanValue);
        }
    }

    public d(Context context, androidx.work.c cVar, u2.b bVar, WorkDatabase workDatabase, List list) {
        this.f13451t = context;
        this.f13452u = cVar;
        this.f13453v = bVar;
        this.f13454w = workDatabase;
        this.f13457z = list;
    }

    public static boolean b(String str, m mVar) {
        boolean zIsDone;
        if (mVar == null) {
            androidx.work.k.c().a(D, k0.a("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        mVar.K = true;
        mVar.i();
        c5.a<ListenableWorker.a> aVar = mVar.J;
        if (aVar != null) {
            zIsDone = aVar.isDone();
            mVar.J.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = mVar.f13488x;
        if (listenableWorker == null || zIsDone) {
            androidx.work.k.c().a(m.L, "WorkSpec " + mVar.f13487w + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        androidx.work.k.c().a(D, k0.a("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(b bVar) {
        synchronized (this.C) {
            this.B.add(bVar);
        }
    }

    @Override // j2.b
    public final void c(String str, boolean z6) {
        synchronized (this.C) {
            try {
                this.f13456y.remove(str);
                int i6 = 0;
                androidx.work.k.c().a(D, d.class.getSimpleName() + " " + str + " executed; reschedule = " + z6, new Throwable[0]);
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((b) obj).c(str, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z6;
        synchronized (this.C) {
            try {
                z6 = this.f13456y.containsKey(str) || this.f13455x.containsKey(str);
            } finally {
            }
        }
        return z6;
    }

    public final void e(b bVar) {
        synchronized (this.C) {
            this.B.remove(bVar);
        }
    }

    public final void f(String str, androidx.work.h hVar) {
        synchronized (this.C) {
            try {
                androidx.work.k.c().d(D, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.f13456y.remove(str);
                if (mVar != null) {
                    if (this.s == null) {
                        PowerManager.WakeLock wakeLockA = n.a(this.f13451t, "ProcessorForegroundLck");
                        this.s = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f13455x.put(str, mVar);
                    Intent intentB = q2.b.b(this.f13451t, str, hVar);
                    Context context = this.f13451t;
                    if (Build.VERSION.SDK_INT >= 26) {
                        a.C0071a.a(context, intentB);
                    } else {
                        context.startService(intentB);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.C) {
            try {
                if (d(str)) {
                    androidx.work.k.c().a(D, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f13451t;
                androidx.work.c cVar = this.f13452u;
                u2.b bVar = this.f13453v;
                WorkDatabase workDatabase = this.f13454w;
                WorkerParameters.a aVar2 = new WorkerParameters.a();
                Context applicationContext = context.getApplicationContext();
                List<e> list = this.f13457z;
                if (aVar == null) {
                    aVar = aVar2;
                }
                m mVar = new m();
                mVar.f13490z = new ListenableWorker.a.C0020a();
                t2.c<Boolean> cVar2 = new t2.c<>();
                mVar.I = cVar2;
                mVar.J = null;
                mVar.s = applicationContext;
                mVar.f13489y = bVar;
                mVar.B = this;
                mVar.f13484t = str;
                mVar.f13485u = list;
                mVar.f13486v = aVar;
                mVar.f13488x = null;
                mVar.A = cVar;
                mVar.C = workDatabase;
                mVar.D = workDatabase.n();
                mVar.E = workDatabase.i();
                mVar.F = workDatabase.o();
                a aVar3 = new a();
                aVar3.s = this;
                aVar3.f13458t = str;
                aVar3.f13459u = cVar2;
                cVar2.addListener(aVar3, this.f13453v.f14595c);
                this.f13456y.put(str, mVar);
                this.f13453v.f14593a.execute(mVar);
                androidx.work.k.c().a(D, androidx.activity.m.d(d.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.C) {
            try {
                if (this.f13455x.isEmpty()) {
                    Context context = this.f13451t;
                    String str = q2.b.B;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f13451t.startService(intent);
                    } catch (Throwable th) {
                        androidx.work.k.c().b(D, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.s;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.s = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean zB;
        synchronized (this.C) {
            androidx.work.k.c().a(D, "Processor stopping foreground work " + str, new Throwable[0]);
            zB = b(str, (m) this.f13455x.remove(str));
        }
        return zB;
    }

    public final boolean j(String str) {
        boolean zB;
        synchronized (this.C) {
            androidx.work.k.c().a(D, "Processor stopping background work " + str, new Throwable[0]);
            zB = b(str, (m) this.f13456y.remove(str));
        }
        return zB;
    }
}
