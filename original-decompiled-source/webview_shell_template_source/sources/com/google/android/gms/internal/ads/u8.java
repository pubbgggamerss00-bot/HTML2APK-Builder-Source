package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u8 implements z8 {

    /* renamed from: a, reason: collision with root package name */
    public final l42 f9478a;

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f9479b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9480c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9481d;

    /* renamed from: e, reason: collision with root package name */
    public String f9482e;

    /* renamed from: f, reason: collision with root package name */
    public s1 f9483f;

    /* renamed from: g, reason: collision with root package name */
    public int f9484g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9485i;

    /* renamed from: j, reason: collision with root package name */
    public long f9486j;

    /* renamed from: k, reason: collision with root package name */
    public w f9487k;

    /* renamed from: l, reason: collision with root package name */
    public int f9488l;

    /* renamed from: m, reason: collision with root package name */
    public long f9489m;

    public u8(String str, int i6) {
        l42 l42Var = new l42(16, new byte[16]);
        this.f9478a = l42Var;
        this.f9479b = new ex0((byte[]) l42Var.f6576d);
        this.f9484g = 0;
        this.h = 0;
        this.f9485i = false;
        this.f9489m = -9223372036854775807L;
        this.f9480c = str;
        this.f9481d = i6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void c(ex0 ex0Var) {
        y5.k(this.f9483f);
        while (ex0Var.o() > 0) {
            int i6 = this.f9484g;
            ex0 ex0Var2 = this.f9479b;
            if (i6 == 0) {
                while (ex0Var.o() > 0) {
                    if (this.f9485i) {
                        int iV = ex0Var.v();
                        this.f9485i = iV == 172;
                        if (iV != 64) {
                            if (iV == 65) {
                                iV = 65;
                            }
                        }
                        this.f9484g = 1;
                        byte[] bArr = ex0Var2.f4416a;
                        bArr[0] = -84;
                        bArr[1] = iV == 65 ? (byte) 65 : (byte) 64;
                        this.h = 2;
                    } else {
                        this.f9485i = ex0Var.v() == 172;
                    }
                }
            } else if (i6 != 1) {
                int iMin = Math.min(ex0Var.o(), this.f9488l - this.h);
                this.f9483f.e(iMin, ex0Var);
                int i7 = this.h + iMin;
                this.h = i7;
                if (i7 == this.f9488l) {
                    y5.r(this.f9489m != -9223372036854775807L);
                    this.f9483f.a(this.f9489m, 1, this.f9488l, 0, null);
                    this.f9489m += this.f9486j;
                    this.f9484g = 0;
                }
            } else {
                byte[] bArr2 = ex0Var2.f4416a;
                int iMin2 = Math.min(ex0Var.o(), 16 - this.h);
                ex0Var.f(this.h, iMin2, bArr2);
                int i8 = this.h + iMin2;
                this.h = i8;
                if (i8 == 16) {
                    l42 l42Var = this.f9478a;
                    l42Var.B(0);
                    e0 e0VarC = f0.c(l42Var);
                    int i9 = e0VarC.f4064a;
                    w wVar = this.f9487k;
                    if (wVar == null || wVar.B != 2 || i9 != wVar.C || !"audio/ac4".equals(wVar.f9978m)) {
                        tk2 tk2Var = new tk2();
                        tk2Var.f9320a = this.f9482e;
                        tk2Var.c("audio/ac4");
                        tk2Var.A = 2;
                        tk2Var.B = i9;
                        tk2Var.f9323d = this.f9480c;
                        tk2Var.f9325f = this.f9481d;
                        w wVar2 = new w(tk2Var);
                        this.f9487k = wVar2;
                        this.f9483f.b(wVar2);
                    }
                    this.f9488l = e0VarC.f4065b;
                    this.f9486j = (e0VarC.f4066c * 1000000) / this.f9487k.C;
                    ex0Var2.j(0);
                    this.f9483f.e(16, ex0Var2);
                    this.f9484g = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f9482e = eaVar.f4182e;
        eaVar.b();
        this.f9483f = z0Var.g(eaVar.f4181d, 1);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f9489m = j6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f9484g = 0;
        this.h = 0;
        this.f9485i = false;
        this.f9489m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
    }
}
