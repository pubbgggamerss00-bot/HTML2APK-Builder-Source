package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ad2 {

    /* renamed from: a, reason: collision with root package name */
    public final jx f2665a;

    /* renamed from: b, reason: collision with root package name */
    public bo1 f2666b;

    /* renamed from: c, reason: collision with root package name */
    public ip1 f2667c;

    /* renamed from: d, reason: collision with root package name */
    public oh2 f2668d;

    /* renamed from: e, reason: collision with root package name */
    public oh2 f2669e;

    /* renamed from: f, reason: collision with root package name */
    public oh2 f2670f;

    public ad2(jx jxVar) {
        this.f2665a = jxVar;
        zn1 zn1Var = bo1.f3236t;
        this.f2666b = cp1.f3636w;
        this.f2667c = ip1.f5823y;
    }

    public static oh2 a(q72 q72Var, bo1 bo1Var, oh2 oh2Var, jx jxVar) {
        zy zyVarV = q72Var.v();
        int iJ = q72Var.j();
        Object objF = zyVarV.o() ? null : zyVarV.f(iJ);
        if (!q72Var.z() && !zyVarV.o()) {
            jx jxVarD = zyVarV.d(iJ, jxVar, false);
            q72Var.t();
            int i6 = j31.f5914a;
            jxVarD.getClass();
        }
        for (int i7 = 0; i7 < bo1Var.size(); i7++) {
            oh2 oh2Var2 = (oh2) bo1Var.get(i7);
            if (d(oh2Var2, objF, q72Var.z(), q72Var.e(), q72Var.g())) {
                return oh2Var2;
            }
        }
        if (bo1Var.isEmpty() && oh2Var != null && d(oh2Var, objF, q72Var.z(), q72Var.e(), q72Var.g())) {
            return oh2Var;
        }
        return null;
    }

    public static boolean d(oh2 oh2Var, Object obj, boolean z6, int i6, int i7) {
        Object obj2 = oh2Var.f7769a;
        int i8 = oh2Var.f7770b;
        if (obj2.equals(obj)) {
            return z6 ? i8 == i6 && oh2Var.f7771c == i7 : i8 == -1 && oh2Var.f7773e == -1;
        }
        return false;
    }

    public final void b(do1 do1Var, oh2 oh2Var, zy zyVar) {
        if (oh2Var == null) {
            return;
        }
        if (zyVar.a(oh2Var.f7769a) != -1) {
            do1Var.a(oh2Var, zyVar);
            return;
        }
        zy zyVar2 = (zy) this.f2667c.get(oh2Var);
        if (zyVar2 != null) {
            do1Var.a(oh2Var, zyVar2);
        }
    }

    public final void c(zy zyVar) {
        do1 do1Var = new do1(4);
        if (this.f2666b.isEmpty()) {
            b(do1Var, this.f2669e, zyVar);
            if (!aa1.k(this.f2670f, this.f2669e)) {
                b(do1Var, this.f2670f, zyVar);
            }
            if (!aa1.k(this.f2668d, this.f2669e) && !aa1.k(this.f2668d, this.f2670f)) {
                b(do1Var, this.f2668d, zyVar);
            }
        } else {
            for (int i6 = 0; i6 < this.f2666b.size(); i6++) {
                b(do1Var, (oh2) this.f2666b.get(i6), zyVar);
            }
            if (!this.f2666b.contains(this.f2668d)) {
                b(do1Var, this.f2668d, zyVar);
            }
        }
        this.f2667c = do1Var.b();
    }
}
