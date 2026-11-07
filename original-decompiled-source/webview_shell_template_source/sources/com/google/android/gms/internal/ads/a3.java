package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a3 extends f1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f2557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f2558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(b3 b3Var, m1 m1Var, m1 m1Var2) {
        super(m1Var);
        this.f2557b = m1Var2;
        this.f2558c = b3Var;
    }

    @Override // com.google.android.gms.internal.ads.f1, com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        k1 k1VarB = this.f2557b.b(j6);
        n1 n1Var = k1VarB.f6212a;
        long j7 = n1Var.f7278b;
        long j8 = this.f2558c.s;
        n1 n1Var2 = new n1(n1Var.f7277a, j7 + j8);
        n1 n1Var3 = k1VarB.f6213b;
        return new k1(n1Var2, new n1(n1Var3.f7277a, n1Var3.f7278b + j8));
    }
}
