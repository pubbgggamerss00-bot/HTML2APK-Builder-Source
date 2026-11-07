package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kh2 extends zg2 {

    /* renamed from: k, reason: collision with root package name */
    public final qh2 f6415k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6416l;

    /* renamed from: m, reason: collision with root package name */
    public final cy f6417m;

    /* renamed from: n, reason: collision with root package name */
    public final jx f6418n;

    /* renamed from: o, reason: collision with root package name */
    public hh2 f6419o;

    /* renamed from: p, reason: collision with root package name */
    public gh2 f6420p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6421q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6422r;
    public boolean s;

    public kh2(qh2 qh2Var, boolean z6) {
        boolean z7;
        this.f6415k = qh2Var;
        if (z6) {
            qh2Var.zzv();
            z7 = true;
        } else {
            z7 = false;
        }
        this.f6416l = z7;
        this.f6417m = new cy();
        this.f6418n = new jx();
        qh2Var.zzM();
        this.f6419o = new hh2(new jh2(qh2Var.g()), cy.f3686m, hh2.f5396e);
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void b(nh2 nh2Var) {
        gh2 gh2Var = (gh2) nh2Var;
        nh2 nh2Var2 = gh2Var.f5050v;
        if (nh2Var2 != null) {
            qh2 qh2Var = gh2Var.f5049u;
            qh2Var.getClass();
            qh2Var.b(nh2Var2);
        }
        if (nh2Var == this.f6420p) {
            this.f6420p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void c(tc tcVar) {
        if (this.s) {
            hh2 hh2Var = this.f6419o;
            this.f6419o = new hh2(new ti2(this.f6419o.f3938b, tcVar), hh2Var.f5397c, hh2Var.f5398d);
        } else {
            this.f6419o = new hh2(new jh2(tcVar), cy.f3686m, hh2.f5396e);
        }
        this.f6415k.c(tcVar);
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final tc g() {
        return this.f6415k.g();
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void o(o52 o52Var) {
        this.f11291j = o52Var;
        int i6 = j31.f5914a;
        Looper looperMyLooper = Looper.myLooper();
        y5.k(looperMyLooper);
        this.f11290i = new Handler(looperMyLooper, null);
        if (this.f6416l) {
            return;
        }
        this.f6421q = true;
        s(null, this.f6415k);
    }

    @Override // com.google.android.gms.internal.ads.zg2, com.google.android.gms.internal.ads.sg2
    public final void q() {
        this.f6422r = false;
        this.f6421q = false;
        super.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    @Override // com.google.android.gms.internal.ads.zg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, sg2 sg2Var, zy zyVar) {
        hh2 hh2Var;
        hh2 hh2Var2;
        oh2 oh2VarA = null;
        if (this.f6422r) {
            hh2 hh2Var3 = this.f6419o;
            this.f6419o = new hh2(zyVar, hh2Var3.f5397c, hh2Var3.f5398d);
            gh2 gh2Var = this.f6420p;
            if (gh2Var != null) {
                x(gh2Var.f5052x);
            }
        } else if (zyVar.o()) {
            if (this.s) {
                hh2 hh2Var4 = this.f6419o;
                hh2Var2 = new hh2(zyVar, hh2Var4.f5397c, hh2Var4.f5398d);
            } else {
                hh2Var2 = new hh2(zyVar, cy.f3686m, hh2.f5396e);
            }
            this.f6419o = hh2Var2;
        } else {
            cy cyVar = this.f6417m;
            zyVar.e(0, cyVar, 0L);
            Object obj2 = cyVar.f3688a;
            gh2 gh2Var2 = this.f6420p;
            if (gh2Var2 != null) {
                long j6 = gh2Var2.f5048t;
                this.f6419o.n(gh2Var2.s.f7769a, this.f6418n);
                this.f6419o.e(0, cyVar, 0L);
                long j7 = j6 != 0 ? j6 : 0L;
                Pair pairL = zyVar.l(this.f6417m, this.f6418n, 0, j7);
                Object obj3 = pairL.first;
                long jLongValue = ((Long) pairL.second).longValue();
                if (this.s) {
                    hh2 hh2Var5 = this.f6419o;
                    hh2Var = new hh2(zyVar, hh2Var5.f5397c, hh2Var5.f5398d);
                } else {
                    hh2Var = new hh2(zyVar, obj2, obj3);
                }
                this.f6419o = hh2Var;
                gh2 gh2Var3 = this.f6420p;
                if (gh2Var3 != null && x(jLongValue)) {
                    oh2 oh2Var = gh2Var3.s;
                    Object obj4 = oh2Var.f7769a;
                    if (this.f6419o.f5398d != null && obj4.equals(hh2.f5396e)) {
                        obj4 = this.f6419o.f5398d;
                    }
                    oh2VarA = oh2Var.a(obj4);
                }
            }
        }
        this.s = true;
        this.f6422r = true;
        p(this.f6419o);
        if (oh2VarA != null) {
            gh2 gh2Var4 = this.f6420p;
            gh2Var4.getClass();
            long j8 = gh2Var4.f5048t;
            long j9 = gh2Var4.f5052x;
            if (j9 != -9223372036854775807L) {
                j8 = j9;
            }
            qh2 qh2Var = gh2Var4.f5049u;
            qh2Var.getClass();
            nh2 nh2VarE = qh2Var.e(oh2VarA, gh2Var4.f5053y, j8);
            gh2Var4.f5050v = nh2VarE;
            if (gh2Var4.f5051w != null) {
                nh2VarE.i(gh2Var4, j8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zg2
    public final /* bridge */ /* synthetic */ void t(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zg2
    public final /* synthetic */ void u(long j6, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zg2
    public final oh2 v(Object obj, oh2 oh2Var) {
        Object obj2 = this.f6419o.f5398d;
        Object obj3 = oh2Var.f7769a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = hh2.f5396e;
        }
        return oh2Var.a(obj3);
    }

    @Override // com.google.android.gms.internal.ads.qh2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final gh2 e(oh2 oh2Var, u1 u1Var, long j6) {
        gh2 gh2Var = new gh2(oh2Var, u1Var, j6);
        y5.r(gh2Var.f5049u == null);
        qh2 qh2Var = this.f6415k;
        gh2Var.f5049u = qh2Var;
        if (this.f6422r) {
            Object obj = oh2Var.f7769a;
            if (this.f6419o.f5398d != null && obj.equals(hh2.f5396e)) {
                obj = this.f6419o.f5398d;
            }
            oh2 oh2VarA = oh2Var.a(obj);
            long j7 = gh2Var.f5052x;
            if (j7 != -9223372036854775807L) {
                j6 = j7;
            }
            qh2 qh2Var2 = gh2Var.f5049u;
            qh2Var2.getClass();
            nh2 nh2VarE = qh2Var2.e(oh2VarA, u1Var, j6);
            gh2Var.f5050v = nh2VarE;
            if (gh2Var.f5051w != null) {
                nh2VarE.i(gh2Var, j6);
                return gh2Var;
            }
        } else {
            this.f6420p = gh2Var;
            if (!this.f6421q) {
                this.f6421q = true;
                s(null, qh2Var);
            }
        }
        return gh2Var;
    }

    public final boolean x(long j6) {
        gh2 gh2Var = this.f6420p;
        int iA = this.f6419o.a(gh2Var.s.f7769a);
        if (iA == -1) {
            return false;
        }
        hh2 hh2Var = this.f6419o;
        jx jxVar = this.f6418n;
        hh2Var.d(iA, jxVar, false);
        long j7 = jxVar.f6183d;
        if (j7 != -9223372036854775807L && j6 >= j7) {
            j6 = Math.max(0L, j7 - 1);
        }
        gh2Var.f5052x = j6;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.sg2, com.google.android.gms.internal.ads.qh2
    public final void zzM() {
        this.f6415k.zzM();
    }

    @Override // com.google.android.gms.internal.ads.sg2, com.google.android.gms.internal.ads.qh2
    public final void zzv() {
        this.f6415k.zzv();
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void zzz() {
    }
}
