package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xb2 {

    /* renamed from: c, reason: collision with root package name */
    public final wc2 f10478c;

    /* renamed from: d, reason: collision with root package name */
    public final xo0 f10479d;

    /* renamed from: e, reason: collision with root package name */
    public long f10480e;

    /* renamed from: f, reason: collision with root package name */
    public int f10481f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10482g;
    public vb2 h;

    /* renamed from: i, reason: collision with root package name */
    public vb2 f10483i;

    /* renamed from: j, reason: collision with root package name */
    public vb2 f10484j;

    /* renamed from: k, reason: collision with root package name */
    public vb2 f10485k;

    /* renamed from: l, reason: collision with root package name */
    public int f10486l;

    /* renamed from: m, reason: collision with root package name */
    public Object f10487m;

    /* renamed from: n, reason: collision with root package name */
    public long f10488n;

    /* renamed from: p, reason: collision with root package name */
    public final v31 f10490p;

    /* renamed from: a, reason: collision with root package name */
    public final jx f10476a = new jx();

    /* renamed from: b, reason: collision with root package name */
    public final cy f10477b = new cy();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f10489o = new ArrayList();

    public xb2(wc2 wc2Var, xo0 xo0Var, v31 v31Var, ya2 ya2Var) {
        this.f10478c = wc2Var;
        this.f10479d = xo0Var;
        this.f10490p = v31Var;
    }

    public static oh2 f(zy zyVar, Object obj, long j6, cy cyVar, jx jxVar) {
        zyVar.n(obj, jxVar);
        zyVar.e(jxVar.f6182c, cyVar, 0L);
        zyVar.a(obj);
        jxVar.f6185f.getClass();
        zyVar.n(obj, jxVar);
        jxVar.f6185f.a(-1);
        int i6 = a.f2525f;
        return new oh2(obj, j6, -1);
    }

    public final boolean A(zy zyVar, int i6) {
        this.f10481f = i6;
        return j(zyVar);
    }

    public final boolean B(zy zyVar, boolean z6) {
        this.f10482g = z6;
        return j(zyVar);
    }

    public final long a(Object obj) {
        for (int i6 = 0; i6 < this.f10489o.size(); i6++) {
            vb2 vb2Var = (vb2) this.f10489o.get(i6);
            if (vb2Var.f9792b.equals(obj)) {
                return vb2Var.f9797g.f10148a.f7772d;
            }
        }
        return -1L;
    }

    public final wb2 b(zy zyVar, vb2 vb2Var, long j6) {
        int i6;
        zy zyVar2;
        long j7;
        int i7;
        jx jxVar;
        Object obj;
        long j8;
        long j9;
        long j10;
        long j11;
        wb2 wb2Var = vb2Var.f9797g;
        long j12 = vb2Var.f9805p;
        long j13 = wb2Var.f10152e;
        long jLongValue = wb2Var.f10150c;
        oh2 oh2Var = wb2Var.f10148a;
        long j14 = j12 + j13;
        boolean z6 = wb2Var.f10153f;
        long j15 = j14 - j6;
        jx jxVar2 = this.f10476a;
        if (z6) {
            int i8 = zyVar.i(zyVar.a(oh2Var.f7769a), this.f10476a, this.f10477b, this.f10481f, this.f10482g);
            if (i8 != -1) {
                int i9 = zyVar.d(i8, jxVar2, true).f6182c;
                Object obj2 = jxVar2.f6181b;
                obj2.getClass();
                long j16 = oh2Var.f7772d;
                if (zyVar.e(i9, this.f10477b, 0L).f3697k == i8) {
                    long jMax = Math.max(0L, j15);
                    jxVar = jxVar2;
                    Pair pairM = zyVar.m(this.f10477b, this.f10476a, i9, -9223372036854775807L, jMax);
                    if (pairM != null) {
                        Object obj3 = pairM.first;
                        long jLongValue2 = ((Long) pairM.second).longValue();
                        vb2 vb2Var2 = vb2Var.f9802m;
                        if (vb2Var2 == null || !vb2Var2.f9792b.equals(obj3)) {
                            long jA = a(obj3);
                            if (jA == -1) {
                                jA = this.f10480e;
                                this.f10480e = 1 + jA;
                            }
                            j11 = jA;
                        } else {
                            j11 = vb2Var2.f9797g.f10148a.f7772d;
                        }
                        j8 = jLongValue2;
                        obj = obj3;
                        j10 = j11;
                        j9 = -9223372036854775807L;
                    }
                } else {
                    jxVar = jxVar2;
                    obj = obj2;
                    j8 = 0;
                    j9 = 0;
                    j10 = j16;
                }
                oh2 oh2VarF = f(zyVar, obj, j10, this.f10477b, this.f10476a);
                if (j9 != -9223372036854775807L && jLongValue != -9223372036854775807L) {
                    zyVar.n(oh2Var.f7769a, jxVar).f6185f.getClass();
                    jxVar.f6185f.getClass();
                }
                return c(zyVar, oh2VarF, j9, j8);
            }
            return null;
        }
        Object obj4 = oh2Var.f7769a;
        int i10 = oh2Var.f7773e;
        zyVar.n(obj4, jxVar2);
        if (!oh2Var.b()) {
            if (i10 != -1) {
                jxVar2.f6185f.getClass();
                if (i10 == -1) {
                    jxVar2.f6185f.a(-1);
                    int i11 = a.f2525f;
                }
            }
            a aVarA = jxVar2.f6185f.a(i10);
            int i12 = 0;
            while (true) {
                int[] iArr = aVarA.f2529d;
                if (i12 >= iArr.length || (i6 = iArr[i12]) == 0 || i6 == 1) {
                    break;
                }
                i12++;
            }
            jxVar2.c(i10);
            if (i12 != jxVar2.f6185f.a(i10).f2526a) {
                return d(zyVar, oh2Var.f7769a, oh2Var.f7773e, i12, wb2Var.f10152e, oh2Var.f7772d);
            }
            zyVar.n(obj4, jxVar2);
            jxVar2.f6185f.a(i10).getClass();
            jxVar2.f6185f.a(i10).getClass();
            return e(zyVar, oh2Var.f7769a, 0L, wb2Var.f10152e, oh2Var.f7772d);
        }
        int i13 = oh2Var.f7770b;
        if (jxVar2.f6185f.a(i13).f2526a == -1) {
            return null;
        }
        int i14 = oh2Var.f7771c;
        a aVarA2 = jxVar2.f6185f.a(i13);
        int i15 = i14 + 1;
        while (true) {
            int[] iArr2 = aVarA2.f2529d;
            if (i15 >= iArr2.length || (i7 = iArr2[i15]) == 0 || i7 == 1) {
                break;
            }
            i15++;
        }
        if (i15 < 0) {
            return d(zyVar, oh2Var.f7769a, i13, i15, wb2Var.f10150c, oh2Var.f7772d);
        }
        if (jLongValue == -9223372036854775807L) {
            int i16 = jxVar2.f6182c;
            long jMax2 = Math.max(0L, j15);
            zyVar2 = zyVar;
            j7 = 0;
            Pair pairM2 = zyVar2.m(this.f10477b, jxVar2, i16, -9223372036854775807L, jMax2);
            if (pairM2 == null) {
                return null;
            }
            jLongValue = ((Long) pairM2.second).longValue();
        } else {
            zyVar2 = zyVar;
            j7 = 0;
        }
        int i17 = oh2Var.f7770b;
        zyVar2.n(obj4, jxVar2);
        jxVar2.f6185f.a(i17).getClass();
        jxVar2.f6185f.a(i17).getClass();
        return e(zyVar2, oh2Var.f7769a, Math.max(j7, jLongValue), wb2Var.f10150c, oh2Var.f7772d);
    }

    public final wb2 c(zy zyVar, oh2 oh2Var, long j6, long j7) {
        zyVar.n(oh2Var.f7769a, this.f10476a);
        return oh2Var.b() ? d(zyVar, oh2Var.f7769a, oh2Var.f7770b, oh2Var.f7771c, j6, oh2Var.f7772d) : e(zyVar, oh2Var.f7769a, j7, j6, oh2Var.f7772d);
    }

    public final wb2 d(zy zyVar, Object obj, int i6, int i7, long j6, long j7) {
        int i8;
        oh2 oh2Var = new oh2(obj, i6, i7, j7, -1);
        jx jxVar = this.f10476a;
        long jA = zyVar.n(obj, jxVar).a(i6, i7);
        a aVarA = jxVar.f6185f.a(i6);
        int i9 = 0;
        while (true) {
            int[] iArr = aVarA.f2529d;
            if (i9 >= iArr.length || (i8 = iArr[i9]) == 0 || i8 == 1) {
                break;
            }
            i9++;
        }
        if (i7 == i9) {
            jxVar.f6185f.getClass();
        }
        jxVar.c(i6);
        long jMax = 0;
        if (jA != -9223372036854775807L && jA <= 0) {
            jMax = Math.max(0L, (-1) + jA);
        }
        return new wb2(oh2Var, jMax, j6, -9223372036854775807L, jA, false, false, false);
    }

    public final wb2 e(zy zyVar, Object obj, long j6, long j7, long j8) {
        jx jxVar = this.f10476a;
        zyVar.n(obj, jxVar);
        jxVar.getClass();
        jxVar.f6185f.getClass();
        oh2 oh2Var = new oh2(obj, j8, -1);
        boolean z6 = !oh2Var.b();
        boolean zI = i(zyVar, oh2Var);
        boolean zH = h(zyVar, oh2Var, z6);
        long j9 = jxVar.f6183d;
        return new wb2(oh2Var, (j9 == -9223372036854775807L || j6 < j9) ? j6 : Math.max(0L, (-1) + j9), j7, -9223372036854775807L, j9, z6, zI, zH);
    }

    public final void g() {
        yn1 yn1Var = new yn1();
        for (vb2 vb2Var = this.h; vb2Var != null; vb2Var = vb2Var.f9802m) {
            yn1Var.q(vb2Var.f9797g.f10148a);
        }
        vb2 vb2Var2 = this.f10483i;
        this.f10479d.e(new uk1(this, yn1Var, vb2Var2 == null ? null : vb2Var2.f9797g.f10148a, 1));
    }

    public final boolean h(zy zyVar, oh2 oh2Var, boolean z6) {
        int iA = zyVar.a(oh2Var.f7769a);
        if (!zyVar.e(zyVar.d(iA, this.f10476a, false).f6182c, this.f10477b, 0L).f3694g) {
            if (zyVar.i(iA, this.f10476a, this.f10477b, this.f10481f, this.f10482g) == -1 && z6) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(zy zyVar, oh2 oh2Var) {
        boolean z6 = !oh2Var.b() && oh2Var.f7773e == -1;
        Object obj = oh2Var.f7769a;
        if (z6) {
            if (zyVar.e(zyVar.n(obj, this.f10476a).f6182c, this.f10477b, 0L).f3698l == zyVar.a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(zy zyVar) {
        zy zyVar2;
        vb2 vb2Var;
        vb2 vb2Var2 = this.h;
        if (vb2Var2 == null) {
            return true;
        }
        int iA = zyVar.a(vb2Var2.f9792b);
        while (true) {
            zyVar2 = zyVar;
            iA = zyVar2.i(iA, this.f10476a, this.f10477b, this.f10481f, this.f10482g);
            while (true) {
                vb2Var = vb2Var2.f9802m;
                if (vb2Var == null || vb2Var2.f9797g.f10153f) {
                    break;
                }
                vb2Var2 = vb2Var;
            }
            if (iA == -1 || vb2Var == null || zyVar2.a(vb2Var.f9792b) != iA) {
                break;
            }
            vb2Var2 = vb2Var;
            zyVar = zyVar2;
        }
        boolean zX = x(vb2Var2);
        vb2Var2.f9797g = r(zyVar2, vb2Var2.f9797g);
        return !zX;
    }

    public final vb2 k() {
        vb2 vb2Var = this.h;
        if (vb2Var == null) {
            return null;
        }
        if (vb2Var == this.f10483i) {
            this.f10483i = vb2Var.f9802m;
        }
        vb2Var.h();
        int i6 = this.f10486l - 1;
        this.f10486l = i6;
        if (i6 == 0) {
            this.f10484j = null;
            vb2 vb2Var2 = this.h;
            this.f10487m = vb2Var2.f9792b;
            this.f10488n = vb2Var2.f9797g.f10148a.f7772d;
        }
        this.h = this.h.f9802m;
        g();
        return this.h;
    }

    public final vb2 l() {
        vb2 vb2Var = this.f10483i;
        y5.k(vb2Var);
        this.f10483i = vb2Var.f9802m;
        g();
        vb2 vb2Var2 = this.f10483i;
        y5.k(vb2Var2);
        return vb2Var2;
    }

    public final vb2 m(wb2 wb2Var) {
        vb2 vb2Var;
        long j6 = wb2Var.f10149b;
        vb2 vb2Var2 = this.f10484j;
        long j7 = vb2Var2 == null ? 1000000000000L : (vb2Var2.f9805p + vb2Var2.f9797g.f10152e) - j6;
        int i6 = 0;
        while (true) {
            if (i6 >= this.f10489o.size()) {
                vb2Var = null;
                break;
            }
            wb2 wb2Var2 = ((vb2) this.f10489o.get(i6)).f9797g;
            long j8 = wb2Var2.f10152e;
            long j9 = wb2Var.f10152e;
            if ((j8 == -9223372036854775807L || j8 == j9) && wb2Var2.f10149b == j6 && wb2Var2.f10148a.equals(wb2Var.f10148a)) {
                vb2Var = (vb2) this.f10489o.remove(i6);
                break;
            }
            i6++;
        }
        if (vb2Var == null) {
            ob2 ob2Var = (ob2) this.f10490p.f9702t;
            u1 u1VarZzk = ob2Var.f7699x.zzk();
            ob2Var.f7692i0.getClass();
            vb2Var = new vb2(ob2Var.f7695t, j7, ob2Var.f7697v, u1VarZzk, ob2Var.J, wb2Var, ob2Var.f7698w);
        } else {
            vb2Var.f9797g = wb2Var;
            vb2Var.f9805p = j7;
        }
        vb2 vb2Var3 = this.f10484j;
        if (vb2Var3 == null) {
            this.h = vb2Var;
            this.f10483i = vb2Var;
        } else if (vb2Var != vb2Var3.f9802m) {
            vb2Var3.k();
            vb2Var3.f9802m = vb2Var;
        }
        this.f10487m = null;
        this.f10484j = vb2Var;
        this.f10486l++;
        g();
        return vb2Var;
    }

    public final vb2 n() {
        return this.h;
    }

    public final vb2 o(nh2 nh2Var) {
        for (int i6 = 0; i6 < this.f10489o.size(); i6++) {
            vb2 vb2Var = (vb2) this.f10489o.get(i6);
            if (vb2Var.f9791a == nh2Var) {
                return vb2Var;
            }
        }
        return null;
    }

    public final vb2 p() {
        return this.f10483i;
    }

    public final wb2 q(long j6, ic2 ic2Var) {
        vb2 vb2Var = this.f10484j;
        return vb2Var == null ? c(ic2Var.f5661a, ic2Var.f5662b, ic2Var.f5663c, ic2Var.f5677r) : b(ic2Var.f5661a, vb2Var, j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wb2 r(zy zyVar, wb2 wb2Var) {
        long j6;
        long jA;
        long j7;
        oh2 oh2Var = wb2Var.f10148a;
        boolean zB = oh2Var.b();
        int i6 = oh2Var.f7773e;
        boolean z6 = !zB && i6 == -1;
        int i7 = oh2Var.f7770b;
        boolean zI = i(zyVar, oh2Var);
        boolean zH = h(zyVar, oh2Var, z6);
        Object obj = oh2Var.f7769a;
        jx jxVar = this.f10476a;
        zyVar.n(obj, jxVar);
        long j8 = 0;
        if (oh2Var.b() || i6 == -1) {
            j6 = -9223372036854775807L;
        } else {
            jxVar.f6185f.a(i6).getClass();
            j6 = 0;
        }
        if (oh2Var.b()) {
            jA = jxVar.a(i7, oh2Var.f7771c);
        } else {
            if (j6 != -9223372036854775807L) {
                j7 = 0;
                if (!oh2Var.b()) {
                    jxVar.c(i7);
                } else if (i6 != -1) {
                    jxVar.c(i6);
                }
                return new wb2(oh2Var, wb2Var.f10149b, wb2Var.f10150c, j8, j7, z6, zI, zH);
            }
            jA = jxVar.f6183d;
        }
        j7 = jA;
        j8 = j6;
        if (!oh2Var.b()) {
        }
        return new wb2(oh2Var, wb2Var.f10149b, wb2Var.f10150c, j8, j7, z6, zI, zH);
    }

    public final oh2 s(zy zyVar, Object obj) {
        long jA;
        int iA;
        jx jxVar = this.f10476a;
        int i6 = zyVar.n(obj, jxVar).f6182c;
        Object obj2 = this.f10487m;
        if (obj2 == null || (iA = zyVar.a(obj2)) == -1 || zyVar.d(iA, jxVar, false).f6182c != i6) {
            vb2 vb2Var = this.h;
            while (true) {
                if (vb2Var == null) {
                    vb2 vb2Var2 = this.h;
                    while (true) {
                        if (vb2Var2 != null) {
                            int iA2 = zyVar.a(vb2Var2.f9792b);
                            if (iA2 != -1 && zyVar.d(iA2, jxVar, false).f6182c == i6) {
                                jA = vb2Var2.f9797g.f10148a.f7772d;
                                break;
                            }
                            vb2Var2 = vb2Var2.f9802m;
                        } else {
                            jA = a(obj);
                            if (jA == -1) {
                                jA = this.f10480e;
                                this.f10480e = 1 + jA;
                                if (this.h == null) {
                                    this.f10487m = obj;
                                    this.f10488n = jA;
                                }
                            }
                        }
                    }
                } else {
                    if (vb2Var.f9792b.equals(obj)) {
                        jA = vb2Var.f9797g.f10148a.f7772d;
                        break;
                    }
                    vb2Var = vb2Var.f9802m;
                }
            }
        } else {
            jA = this.f10488n;
        }
        long j6 = jA;
        zyVar.n(obj, jxVar);
        int i7 = jxVar.f6182c;
        cy cyVar = this.f10477b;
        zyVar.e(i7, cyVar, 0L);
        for (int iA3 = zyVar.a(obj); iA3 >= cyVar.f3697k; iA3--) {
            zyVar.d(iA3, jxVar, true);
            jxVar.f6185f.getClass();
            jxVar.f6185f.a(-1);
            int i8 = a.f2525f;
        }
        return f(zyVar, obj, j6, cyVar, this.f10476a);
    }

    public final void t() {
        if (this.f10486l == 0) {
            return;
        }
        vb2 vb2Var = this.h;
        y5.k(vb2Var);
        this.f10487m = vb2Var.f9792b;
        this.f10488n = vb2Var.f9797g.f10148a.f7772d;
        while (vb2Var != null) {
            vb2Var.h();
            vb2Var = vb2Var.f9802m;
        }
        this.h = null;
        this.f10484j = null;
        this.f10483i = null;
        this.f10486l = 0;
        g();
    }

    public final void u() {
        vb2 vb2Var = this.f10485k;
        if (vb2Var == null || vb2Var.j()) {
            this.f10485k = null;
            for (int i6 = 0; i6 < this.f10489o.size(); i6++) {
                vb2 vb2Var2 = (vb2) this.f10489o.get(i6);
                if (!vb2Var2.j()) {
                    this.f10485k = vb2Var2;
                    return;
                }
            }
        }
    }

    public final void v() {
        if (this.f10489o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < this.f10489o.size(); i6++) {
            ((vb2) this.f10489o.get(i6)).h();
        }
        this.f10489o = arrayList;
        this.f10485k = null;
        u();
    }

    public final void w(ya2 ya2Var) {
        ya2Var.getClass();
        v();
    }

    public final boolean x(vb2 vb2Var) {
        y5.k(vb2Var);
        int i6 = 0;
        if (vb2Var.equals(this.f10484j)) {
            return false;
        }
        this.f10484j = vb2Var;
        boolean z6 = false;
        while (true) {
            vb2Var = vb2Var.f9802m;
            if (vb2Var == null) {
                break;
            }
            if (vb2Var == this.f10483i) {
                this.f10483i = this.h;
                z6 = true;
            }
            vb2Var.h();
            this.f10486l--;
        }
        vb2 vb2Var2 = this.f10484j;
        vb2Var2.getClass();
        if (vb2Var2.f9802m != null) {
            vb2Var2.k();
            vb2Var2.f9802m = null;
            while (true) {
                gk2 gk2Var = vb2Var2.f9804o;
                if (i6 >= gk2Var.f5083a) {
                    break;
                }
                gk2Var.b(i6);
                ak2 ak2Var = ((ak2[]) vb2Var2.f9804o.f5085c)[i6];
                i6++;
            }
        }
        g();
        return z6;
    }

    public final boolean y() {
        vb2 vb2Var = this.f10484j;
        if (vb2Var != null) {
            return !vb2Var.f9797g.h && vb2Var.i() && this.f10484j.f9797g.f10152e != -9223372036854775807L && this.f10486l < 100;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (x(r3) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(zy zyVar, long j6, long j7) {
        wb2 wb2Var;
        boolean z6;
        vb2 vb2Var = this.h;
        vb2 vb2Var2 = null;
        while (true) {
            if (vb2Var == null) {
                break;
            }
            wb2 wb2Var2 = vb2Var.f9797g;
            if (vb2Var2 == null) {
                wb2Var = r(zyVar, wb2Var2);
            } else {
                wb2 wb2VarB = b(zyVar, vb2Var2, j6);
                if (wb2VarB == null) {
                    if (!x(vb2Var2)) {
                        break;
                    }
                    return false;
                }
                if (wb2Var2.f10149b != wb2VarB.f10149b || !wb2Var2.f10148a.equals(wb2VarB.f10148a)) {
                    break;
                }
                wb2Var = wb2VarB;
            }
            long j8 = wb2Var.f10152e;
            long j9 = wb2Var2.f10150c;
            if (j9 == wb2Var.f10150c) {
                z6 = false;
            } else {
                z6 = false;
                wb2Var = new wb2(wb2Var.f10148a, wb2Var.f10149b, j9, wb2Var.f10151d, j8, wb2Var.f10153f, wb2Var.f10154g, wb2Var.h);
            }
            vb2Var.f9797g = wb2Var;
            long j10 = wb2Var2.f10152e;
            if (j10 == -9223372036854775807L || j10 == j8) {
                vb2Var2 = vb2Var;
                vb2Var = vb2Var.f9802m;
            } else {
                Object obj = vb2Var.f9791a;
                if (obj instanceof vg2) {
                    long j11 = wb2Var.f10151d;
                    if (j11 == -9223372036854775807L) {
                        j11 = Long.MIN_VALUE;
                    }
                    ((vg2) obj).f9865w = j11;
                }
                boolean z7 = (vb2Var != this.f10483i || (j7 != Long.MIN_VALUE && j7 < ((j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : j8 + vb2Var.f9805p))) ? z6 : true;
                if (x(vb2Var) || z7) {
                    return z6;
                }
            }
        }
    }
}
