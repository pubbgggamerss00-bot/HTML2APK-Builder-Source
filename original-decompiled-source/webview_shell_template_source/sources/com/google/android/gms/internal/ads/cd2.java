package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cd2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3529a;

    /* renamed from: b, reason: collision with root package name */
    public int f3530b;

    /* renamed from: c, reason: collision with root package name */
    public long f3531c;

    /* renamed from: d, reason: collision with root package name */
    public final oh2 f3532d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3533e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dd2 f3535g;

    public cd2(dd2 dd2Var, String str, int i6, oh2 oh2Var) {
        this.f3535g = dd2Var;
        this.f3529a = str;
        this.f3530b = i6;
        this.f3531c = oh2Var == null ? -1L : oh2Var.f7772d;
        if (oh2Var == null || !oh2Var.b()) {
            return;
        }
        this.f3532d = oh2Var;
    }

    public final boolean a(xc2 xc2Var) {
        oh2 oh2Var = xc2Var.f10500d;
        if (oh2Var == null) {
            return this.f3530b != xc2Var.f10499c;
        }
        long j6 = this.f3531c;
        if (j6 == -1) {
            return false;
        }
        if (oh2Var.f7772d > j6) {
            return true;
        }
        oh2 oh2Var2 = this.f3532d;
        if (oh2Var2 == null) {
            return false;
        }
        int i6 = oh2Var2.f7770b;
        zy zyVar = xc2Var.f10498b;
        int iA = zyVar.a(oh2Var.f7769a);
        int iA2 = zyVar.a(oh2Var2.f7769a);
        if (oh2Var.f7772d < oh2Var2.f7772d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!oh2Var.b()) {
            int i7 = oh2Var.f7773e;
            return i7 == -1 || i7 > i6;
        }
        int i8 = oh2Var.f7770b;
        int i9 = oh2Var.f7771c;
        if (i8 <= i6) {
            return i8 == i6 && i9 > oh2Var2.f7771c;
        }
        return true;
    }

    public final boolean b(zy zyVar, zy zyVar2) {
        oh2 oh2Var;
        dd2 dd2Var = this.f3535g;
        cy cyVar = dd2Var.f3858a;
        int i6 = this.f3530b;
        if (i6 < zyVar.c()) {
            zyVar.e(i6, cyVar, 0L);
            for (int i7 = cyVar.f3697k; i7 <= cyVar.f3698l; i7++) {
                int iA = zyVar2.a(zyVar.f(i7));
                if (iA != -1) {
                    i6 = zyVar2.d(iA, dd2Var.f3859b, false).f6182c;
                    break;
                }
            }
            i6 = -1;
        } else if (i6 >= zyVar2.c()) {
            i6 = -1;
        }
        this.f3530b = i6;
        return i6 != -1 && ((oh2Var = this.f3532d) == null || zyVar2.a(oh2Var.f7769a) != -1);
    }
}
