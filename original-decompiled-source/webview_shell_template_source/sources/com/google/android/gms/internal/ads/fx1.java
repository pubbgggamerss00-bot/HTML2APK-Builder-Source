package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fx1 implements ct1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4816a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f4817b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4818c;

    public fx1(String str, int i6, Class cls) {
        this.f4816a = str;
        this.f4817b = cls;
        this.f4818c = i6;
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final v12 a(g42 g42Var) {
        w12 w12VarB = x12.B();
        w12VarB.k(this.f4816a);
        w12VarB.l(g42Var);
        w12VarB.j(q22.RAW);
        x12 x12Var = (x12) w12VarB.g();
        py1 py1Var = new py1(x12Var, zy1.a(x12Var.H()));
        wx1 wx1Var = wx1.f10304b;
        oy1 oy1Var = (oy1) wx1Var.c(px1.f8174b.a(wx1Var.b(py1Var), null));
        u12 u12VarB = v12.B();
        String str = oy1Var.f7885a;
        u12VarB.i();
        v12.H((v12) u12VarB.f4126t, str);
        g42 g42Var2 = oy1Var.f7887c;
        u12VarB.i();
        v12.I((v12) u12VarB.f4126t, g42Var2);
        int i6 = oy1Var.f7888d;
        u12VarB.i();
        v12.G((v12) u12VarB.f4126t, i6);
        return (v12) u12VarB.g();
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final Object b(g42 g42Var) {
        return vx1.f9959b.b(wx1.f10304b.a(oy1.a(this.f4816a, g42Var, this.f4818c, q22.RAW, null)), this.f4817b);
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final Class zzb() {
        return this.f4817b;
    }
}
