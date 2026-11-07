package j2;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.k;
import androidx.work.q;
import com.htmltoapk.template.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import r2.r;
import r2.s;
import v1.g;
import z1.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: j, reason: collision with root package name */
    public static k f13471j;

    /* renamed from: k, reason: collision with root package name */
    public static k f13472k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f13473l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13474a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.c f13475b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f13476c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.b f13477d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f13478e;

    /* renamed from: f, reason: collision with root package name */
    public final d f13479f;

    /* renamed from: g, reason: collision with root package name */
    public final s2.i f13480g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f13481i;

    static {
        androidx.work.k.e("WorkManagerImpl");
        f13471j = null;
        f13472k = null;
        f13473l = new Object();
    }

    public k(Context context, androidx.work.c cVar, u2.b bVar) throws Resources.NotFoundException {
        g.a aVar;
        Executor executor;
        String str;
        boolean z6 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        s2.k kVar = bVar.f14593a;
        int i6 = WorkDatabase.f1786k;
        if (z6) {
            aVar = new g.a(applicationContext, null);
            aVar.f14779g = true;
        } else {
            String str2 = j.f13469a;
            g.a aVar2 = new g.a(applicationContext, "androidx.work.workdb");
            aVar2.f14778f = new h(applicationContext);
            aVar = aVar2;
        }
        aVar.f14776d = kVar;
        i iVar = new i();
        if (aVar.f14775c == null) {
            aVar.f14775c = new ArrayList<>();
        }
        aVar.f14775c.add(iVar);
        aVar.a(androidx.work.impl.a.f1795a);
        aVar.a(new a.h(applicationContext, 2, 3));
        aVar.a(androidx.work.impl.a.f1796b);
        aVar.a(androidx.work.impl.a.f1797c);
        aVar.a(new a.h(applicationContext, 5, 6));
        aVar.a(androidx.work.impl.a.f1798d);
        aVar.a(androidx.work.impl.a.f1799e);
        aVar.a(androidx.work.impl.a.f1800f);
        aVar.a(new a.i(applicationContext));
        aVar.a(new a.h(applicationContext, 10, 11));
        aVar.a(androidx.work.impl.a.f1801g);
        aVar.h = false;
        aVar.f14780i = true;
        g.c cVar2 = g.c.f14783t;
        Context context2 = aVar.f14774b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = aVar.f14776d;
        if (executor2 == null && aVar.f14777e == null) {
            m.a aVar3 = m.b.f13848u;
            aVar.f14777e = aVar3;
            aVar.f14776d = aVar3;
        } else if (executor2 != null && aVar.f14777e == null) {
            aVar.f14777e = executor2;
        } else if (executor2 == null && (executor = aVar.f14777e) != null) {
            aVar.f14776d = executor;
        }
        if (aVar.f14778f == null) {
            aVar.f14778f = new a2.c();
        }
        String str3 = aVar.f14773a;
        b.c cVar3 = aVar.f14778f;
        g.d dVar = aVar.f14781j;
        ArrayList<g.b> arrayList = aVar.f14775c;
        boolean z7 = aVar.f14779g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        g.c cVar4 = (activityManager == null || activityManager.isLowRamDevice()) ? g.c.s : cVar2;
        Executor executor3 = aVar.f14776d;
        v1.a aVar4 = new v1.a(context2, str3, cVar3, dVar, arrayList, z7, cVar4, executor3, aVar.f14777e, aVar.h, aVar.f14780i);
        g.c cVar5 = cVar4;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            v1.g gVar = (v1.g) Class.forName(str).newInstance();
            z1.b bVarE = gVar.e(aVar4);
            gVar.f14767c = bVarE;
            boolean z8 = cVar5 == cVar2;
            bVarE.setWriteAheadLoggingEnabled(z8);
            gVar.f14771g = arrayList;
            gVar.f14766b = executor3;
            new ArrayDeque();
            gVar.f14769e = z7;
            gVar.f14770f = z8;
            WorkDatabase workDatabase = (WorkDatabase) gVar;
            Context applicationContext2 = context.getApplicationContext();
            k.a aVar5 = new k.a(cVar.f1761f);
            synchronized (androidx.work.k.class) {
                androidx.work.k.f1830a = aVar5;
            }
            String str5 = f.f13460a;
            m2.b bVar2 = new m2.b(applicationContext2, this);
            s2.h.a(applicationContext2, SystemJobService.class, true);
            androidx.work.k.c().a(f.f13460a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List<e> listAsList = Arrays.asList(bVar2, new k2.b(applicationContext2, cVar, bVar, this));
            d dVar2 = new d(context, cVar, bVar, workDatabase, listAsList);
            Context applicationContext3 = context.getApplicationContext();
            this.f13474a = applicationContext3;
            this.f13475b = cVar;
            this.f13477d = bVar;
            this.f13476c = workDatabase;
            this.f13478e = listAsList;
            this.f13479f = dVar2;
            this.f13480g = new s2.i(workDatabase);
            this.h = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f13477d.a(new ForceStopRunnable(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k b(Context context) {
        k kVarB;
        Object obj = f13473l;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    kVarB = f13471j;
                    if (kVarB == null) {
                        kVarB = f13472k;
                    }
                }
                return kVarB;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (kVarB == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof c.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            c(applicationContext, ((c.b) applicationContext).a());
            kVarB = b(applicationContext);
        }
        return kVarB;
    }

    public static void c(Context context, androidx.work.c cVar) {
        synchronized (f13473l) {
            try {
                k kVar = f13471j;
                if (kVar != null && f13472k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (kVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f13472k == null) {
                        f13472k = new k(applicationContext, cVar, new u2.b(cVar.f1757b));
                    }
                    f13471j = f13472k;
                }
            } finally {
            }
        }
    }

    public final void d() {
        synchronized (f13473l) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f13481i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f13481i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList arrayListE;
        String str = m2.b.f13882w;
        Context context = this.f13474a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = m2.b.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            int size = arrayListE.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListE.get(i6);
                i6++;
                m2.b.c(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f13476c;
        s sVar = (s) workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = sVar.f14299a;
        workDatabase_Impl.b();
        r rVar = sVar.f14306i;
        a2.e eVarA = rVar.a();
        workDatabase_Impl.c();
        try {
            eVarA.f19t.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            rVar.c(eVarA);
            f.a(this.f13475b, workDatabase, this.f13478e);
        } catch (Throwable th) {
            workDatabase_Impl.f();
            rVar.c(eVarA);
            throw th;
        }
    }

    public final void f(String str, WorkerParameters.a aVar) {
        s2.l lVar = new s2.l();
        lVar.s = this;
        lVar.f14367t = str;
        lVar.f14368u = aVar;
        this.f13477d.a(lVar);
    }

    public final void g(String str) {
        this.f13477d.a(new s2.m(this, str, false));
    }
}
