package s2;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.eu;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public final /* synthetic */ UUID s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.work.f f14385t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t2.c f14386u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f14387v;

    public q(r rVar, UUID uuid, androidx.work.f fVar, t2.c cVar) {
        this.f14387v = rVar;
        this.s = uuid;
        this.f14385t = fVar;
        this.f14386u = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t2.c cVar = this.f14386u;
        UUID uuid = this.s;
        String string = uuid.toString();
        androidx.work.k kVarC = androidx.work.k.c();
        String str = r.f14388c;
        StringBuilder sb = new StringBuilder("Updating progress for ");
        sb.append(uuid);
        sb.append(" (");
        androidx.work.f fVar = this.f14385t;
        sb.append(fVar);
        sb.append(")");
        kVarC.a(str, sb.toString(), new Throwable[0]);
        r rVar = this.f14387v;
        WorkDatabase workDatabase = rVar.f14389a;
        WorkDatabase workDatabase2 = rVar.f14389a;
        workDatabase.c();
        try {
            r2.l lVarI = ((r2.s) workDatabase2.n()).i(string);
            if (lVarI == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (lVarI.f14281b == androidx.work.p.f1843t) {
                r2.i iVar = new r2.i(string, fVar);
                eu euVarM = workDatabase2.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) euVarM.f4395t;
                workDatabase_Impl.b();
                workDatabase_Impl.c();
                try {
                    ((r2.d) euVarM.f4396u).e(iVar);
                    workDatabase_Impl.h();
                    workDatabase_Impl.f();
                } catch (Throwable th) {
                    workDatabase_Impl.f();
                    throw th;
                }
            } else {
                androidx.work.k.c().f(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.", new Throwable[0]);
            }
            cVar.h(null);
            workDatabase2.h();
        } catch (Throwable th2) {
            try {
                androidx.work.k.c().b(r.f14388c, "Error updating Worker progress", th2);
                cVar.i(th2);
            } finally {
                workDatabase2.f();
            }
        }
    }
}
