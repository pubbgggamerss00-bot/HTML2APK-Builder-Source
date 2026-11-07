package s2;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f14369v = androidx.work.k.e("StopWorkRunnable");
    public final j2.k s;

    /* renamed from: t, reason: collision with root package name */
    public final String f14370t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f14371u;

    public m(j2.k kVar, String str, boolean z6) {
        this.s = kVar;
        this.f14370t = str;
        this.f14371u = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zJ;
        j2.k kVar = this.s;
        WorkDatabase workDatabase = kVar.f13476c;
        j2.d dVar = kVar.f13479f;
        r2.m mVarN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f14370t;
            synchronized (dVar.C) {
                zContainsKey = dVar.f13455x.containsKey(str);
            }
            if (this.f14371u) {
                zJ = this.s.f13479f.i(this.f14370t);
            } else {
                if (!zContainsKey) {
                    r2.s sVar = (r2.s) mVarN;
                    if (sVar.f(this.f14370t) == androidx.work.p.f1843t) {
                        sVar.p(androidx.work.p.s, this.f14370t);
                    }
                }
                zJ = this.s.f13479f.j(this.f14370t);
            }
            androidx.work.k.c().a(f14369v, "StopWorkRunnable for " + this.f14370t + "; Processor.stopWork = " + zJ, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
