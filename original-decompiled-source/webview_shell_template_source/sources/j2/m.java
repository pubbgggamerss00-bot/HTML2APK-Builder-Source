package j2;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.v0;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.p;
import com.google.android.gms.internal.ads.eu;
import com.google.android.gms.internal.ads.ni0;
import com.google.android.gms.internal.ads.tf0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import r2.s;
import s2.o;
import s2.r;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m implements Runnable {
    public static final String L = androidx.work.k.e("WorkerWrapper");
    public androidx.work.c A;
    public d B;
    public WorkDatabase C;
    public r2.m D;
    public ni0 E;
    public ni0 F;
    public ArrayList G;
    public String H;
    public t2.c<Boolean> I;
    public c5.a<ListenableWorker.a> J;
    public volatile boolean K;
    public Context s;

    /* renamed from: t, reason: collision with root package name */
    public String f13484t;

    /* renamed from: u, reason: collision with root package name */
    public List<e> f13485u;

    /* renamed from: v, reason: collision with root package name */
    public WorkerParameters.a f13486v;

    /* renamed from: w, reason: collision with root package name */
    public r2.l f13487w;

    /* renamed from: x, reason: collision with root package name */
    public ListenableWorker f13488x;

    /* renamed from: y, reason: collision with root package name */
    public u2.b f13489y;

    /* renamed from: z, reason: collision with root package name */
    public ListenableWorker.a f13490z;

    public final void a(ListenableWorker.a aVar) {
        boolean z6 = aVar instanceof ListenableWorker.a.c;
        String str = L;
        if (!z6) {
            if (aVar instanceof ListenableWorker.a.b) {
                androidx.work.k.c().d(str, k0.a("Worker result RETRY for ", this.H), new Throwable[0]);
                d();
                return;
            }
            androidx.work.k.c().d(str, k0.a("Worker result FAILURE for ", this.H), new Throwable[0]);
            if (this.f13487w.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        androidx.work.k.c().d(str, k0.a("Worker result SUCCESS for ", this.H), new Throwable[0]);
        if (this.f13487w.c()) {
            e();
            return;
        }
        ni0 ni0Var = this.E;
        String str2 = this.f13484t;
        r2.m mVar = this.D;
        WorkDatabase workDatabase = this.C;
        workDatabase.c();
        try {
            ((s) mVar).p(p.f1844u, str2);
            ((s) mVar).n(str2, ((ListenableWorker.a.c) this.f13490z).f1738a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListE = ni0Var.e(str2);
            int size = arrayListE.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListE.get(i6);
                i6++;
                String str3 = (String) obj;
                if (((s) mVar).f(str3) == p.f1846w) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ni0Var.f7447t;
                    v1.i iVarA = v1.i.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        iVarA.e(1);
                    } else {
                        iVarA.f(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorG = workDatabase_Impl.g(iVarA);
                    try {
                        if (cursorG.moveToFirst() && cursorG.getInt(0) != 0) {
                            androidx.work.k.c().d(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            ((s) mVar).p(p.s, str3);
                            ((s) mVar).o(str3, jCurrentTimeMillis);
                        }
                    } finally {
                        cursorG.close();
                        iVarA.h();
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            f(false);
        } catch (Throwable th) {
            workDatabase.f();
            f(false);
            throw th;
        }
    }

    public final void b(String str) throws SQLException {
        r2.m mVar = this.D;
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s sVar = (s) mVar;
            if (sVar.f(str2) != p.f1847x) {
                sVar.p(p.f1845v, str2);
            }
            linkedList.addAll(this.E.e(str2));
        }
    }

    public final void c() {
        List<e> list = this.f13485u;
        String str = this.f13484t;
        WorkDatabase workDatabase = this.C;
        if (!i()) {
            workDatabase.c();
            try {
                p pVarF = ((s) this.D).f(str);
                eu euVarM = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) euVarM.f4395t;
                workDatabase_Impl.b();
                r2.j jVar = (r2.j) euVarM.s;
                a2.e eVarA = jVar.a();
                if (str == null) {
                    eVarA.c(1);
                } else {
                    eVarA.d(1, str);
                }
                workDatabase_Impl.c();
                try {
                    eVarA.e();
                    workDatabase_Impl.h();
                    if (pVarF == null) {
                        f(false);
                    } else if (pVarF == p.f1843t) {
                        a(this.f13490z);
                    } else if (!pVarF.a()) {
                        d();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    workDatabase_Impl.f();
                    jVar.c(eVarA);
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().d(str);
            }
            f.a(this.A, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f13484t;
        r2.m mVar = this.D;
        WorkDatabase workDatabase = this.C;
        workDatabase.c();
        try {
            ((s) mVar).p(p.s, str);
            ((s) mVar).o(str, System.currentTimeMillis());
            ((s) mVar).l(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f13484t;
        r2.m mVar = this.D;
        WorkDatabase workDatabase = this.C;
        workDatabase.c();
        try {
            ((s) mVar).o(str, System.currentTimeMillis());
            ((s) mVar).p(p.s, str);
            ((s) mVar).m(str);
            ((s) mVar).l(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z6) {
        boolean z7;
        ListenableWorker listenableWorker;
        this.C.c();
        try {
            s sVar = (s) this.C.n();
            sVar.getClass();
            v1.i iVarA = v1.i.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = sVar.f14299a;
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(iVarA);
            try {
                if (cursorG.moveToFirst()) {
                    z7 = cursorG.getInt(0) != 0;
                }
                if (!z7) {
                    s2.h.a(this.s, RescheduleReceiver.class, false);
                }
                if (z6) {
                    ((s) this.D).p(p.s, this.f13484t);
                    ((s) this.D).l(this.f13484t, -1L);
                }
                if (this.f13487w != null && (listenableWorker = this.f13488x) != null && listenableWorker.isRunInForeground()) {
                    d dVar = this.B;
                    String str = this.f13484t;
                    synchronized (dVar.C) {
                        dVar.f13455x.remove(str);
                        dVar.h();
                    }
                }
                this.C.h();
                this.C.f();
                this.I.h(Boolean.valueOf(z6));
            } finally {
                cursorG.close();
                iVarA.h();
            }
        } catch (Throwable th) {
            this.C.f();
            throw th;
        }
    }

    public final void g() {
        r2.m mVar = this.D;
        String str = this.f13484t;
        p pVarF = ((s) mVar).f(str);
        p pVar = p.f1843t;
        String str2 = L;
        if (pVarF == pVar) {
            androidx.work.k.c().a(str2, v0.b("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            f(true);
            return;
        }
        androidx.work.k.c().a(str2, "Status for " + str + " is " + pVarF + "; not doing any work", new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.f13484t;
        WorkDatabase workDatabase = this.C;
        workDatabase.c();
        try {
            b(str);
            ((s) this.D).n(str, ((ListenableWorker.a.C0020a) this.f13490z).f1737a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.K) {
            return false;
        }
        androidx.work.k.c().a(L, k0.a("Work interrupted for ", this.H), new Throwable[0]);
        if (((s) this.D).f(this.f13484t) == null) {
            f(false);
            return true;
        }
        f(!r0.a());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:13:0x005c, B:16:0x0069, B:21:0x008b, B:24:0x0091, B:27:0x00b9, B:29:0x00bf, B:31:0x00c5, B:44:0x010d, B:36:0x00ce, B:39:0x00dd, B:41:0x00e5), top: B:101:0x005c }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        androidx.work.i iVar;
        androidx.work.f fVarA;
        boolean z6;
        ni0 ni0Var = this.F;
        String str = this.f13484t;
        ArrayList arrayListG = ni0Var.g(str);
        this.G = arrayListG;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(str);
        sb.append(", tags={ ");
        int size = arrayListG.size();
        int i6 = 0;
        boolean z7 = true;
        while (i6 < size) {
            Object obj = arrayListG.get(i6);
            i6++;
            String str2 = (String) obj;
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.H = sb.toString();
        androidx.work.c cVar = this.A;
        r2.m mVar = this.D;
        u2.b bVar = this.f13489y;
        WorkDatabase workDatabase = this.C;
        if (i()) {
            return;
        }
        workDatabase.c();
        try {
            r2.l lVarI = ((s) mVar).i(str);
            this.f13487w = lVarI;
            String str3 = L;
            if (lVarI == null) {
                androidx.work.k.c().b(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                f(false);
                workDatabase.h();
                return;
            }
            p pVar = lVarI.f14281b;
            p pVar2 = p.s;
            if (pVar != pVar2) {
                g();
                workDatabase.h();
                androidx.work.k.c().a(str3, this.f13487w.f14282c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
                return;
            }
            if (!lVarI.c()) {
                r2.l lVar = this.f13487w;
                if (lVar.f14281b == pVar2 && lVar.f14289k > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    r2.l lVar2 = this.f13487w;
                    if (lVar2.f14292n != 0 && jCurrentTimeMillis < lVar2.a()) {
                        androidx.work.k.c().a(str3, "Delaying execution for " + this.f13487w.f14282c + " because it is being executed before schedule.", new Throwable[0]);
                        f(true);
                        workDatabase.h();
                        return;
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f13487w.c()) {
                fVarA = this.f13487w.f14284e;
            } else {
                androidx.work.j jVar = cVar.f1759d;
                String str4 = this.f13487w.f14283d;
                jVar.getClass();
                String str5 = androidx.work.i.f1784a;
                try {
                    iVar = (androidx.work.i) Class.forName(str4).newInstance();
                } catch (Exception e6) {
                    androidx.work.k.c().b(androidx.work.i.f1784a, k0.a("Trouble instantiating + ", str4), e6);
                    iVar = null;
                }
                if (iVar == null) {
                    androidx.work.k.c().b(str3, k0.a("Could not create Input Merger ", this.f13487w.f14283d), new Throwable[0]);
                    h();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f13487w.f14284e);
                WorkDatabase_Impl workDatabase_Impl = ((s) mVar).f14299a;
                v1.i iVarA = v1.i.a(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    iVarA.e(1);
                } else {
                    iVarA.f(1, str);
                }
                workDatabase_Impl.b();
                Cursor cursorG = workDatabase_Impl.g(iVarA);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                    while (cursorG.moveToNext()) {
                        arrayList2.add(androidx.work.f.a(cursorG.getBlob(0)));
                    }
                    cursorG.close();
                    iVarA.h();
                    arrayList.addAll(arrayList2);
                    fVarA = iVar.a(arrayList);
                } catch (Throwable th) {
                    cursorG.close();
                    iVarA.h();
                    throw th;
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            ArrayList arrayList3 = this.G;
            WorkerParameters.a aVar = this.f13486v;
            int i7 = this.f13487w.f14289k;
            ExecutorService executorService = cVar.f1756a;
            androidx.work.s sVar = cVar.f1758c;
            r rVar = new r(workDatabase, bVar);
            s2.p pVar3 = new s2.p(workDatabase, this.B, bVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f1740a = uuidFromString;
            workerParameters.f1741b = fVarA;
            workerParameters.f1742c = new HashSet(arrayList3);
            workerParameters.f1743d = aVar;
            workerParameters.f1744e = i7;
            workerParameters.f1745f = executorService;
            workerParameters.f1746g = bVar;
            workerParameters.h = sVar;
            workerParameters.f1747i = rVar;
            workerParameters.f1748j = pVar3;
            if (this.f13488x == null) {
                this.f13488x = sVar.a(this.s, this.f13487w.f14282c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f13488x;
            if (listenableWorker == null) {
                androidx.work.k.c().b(str3, k0.a("Could not create Worker ", this.f13487w.f14282c), new Throwable[0]);
                h();
                return;
            }
            if (listenableWorker.isUsed()) {
                androidx.work.k.c().b(str3, v0.b("Received an already-used Worker ", this.f13487w.f14282c, "; WorkerFactory should return new instances"), new Throwable[0]);
                h();
                return;
            }
            this.f13488x.setUsed();
            workDatabase.c();
            try {
                if (((s) mVar).f(str) == pVar2) {
                    ((s) mVar).p(p.f1843t, str);
                    ((s) mVar).k(str);
                    z6 = true;
                } else {
                    z6 = false;
                }
                workDatabase.h();
                if (!z6) {
                    g();
                    return;
                }
                if (i()) {
                    return;
                }
                t2.c cVar2 = new t2.c();
                o oVar = new o(this.s, this.f13487w, this.f13488x, pVar3, this.f13489y);
                bVar.f14595c.execute(oVar);
                t2.c<Void> cVar3 = oVar.s;
                cVar3.addListener(new tf0(this, cVar3, cVar2), bVar.f14595c);
                cVar2.addListener(new l(this, cVar2, this.H), bVar.f14593a);
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            workDatabase.f();
        }
    }
}
