package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l9 implements z8 {

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f6614a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f6615b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6616c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6617d;

    /* renamed from: e, reason: collision with root package name */
    public s1 f6618e;

    /* renamed from: f, reason: collision with root package name */
    public String f6619f;

    /* renamed from: g, reason: collision with root package name */
    public int f6620g = 0;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6621i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6622j;

    /* renamed from: k, reason: collision with root package name */
    public long f6623k;

    /* renamed from: l, reason: collision with root package name */
    public int f6624l;

    /* renamed from: m, reason: collision with root package name */
    public long f6625m;

    public l9(String str, int i6) {
        ex0 ex0Var = new ex0(4);
        this.f6614a = ex0Var;
        ex0Var.f4416a[0] = -1;
        this.f6615b = new j1();
        this.f6625m = -9223372036854775807L;
        this.f6616c = str;
        this.f6617d = i6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void c(ex0 ex0Var) {
        y5.k(this.f6618e);
        while (ex0Var.o() > 0) {
            int i6 = this.f6620g;
            ex0 ex0Var2 = this.f6614a;
            if (i6 == 0) {
                byte[] bArr = ex0Var.f4416a;
                int i7 = ex0Var.f4417b;
                int i8 = ex0Var.f4418c;
                while (true) {
                    if (i7 >= i8) {
                        ex0Var.j(i8);
                        break;
                    }
                    int i9 = i7 + 1;
                    byte b7 = bArr[i7];
                    boolean z6 = (b7 & 255) == 255;
                    boolean z7 = this.f6622j && (b7 & 224) == 224;
                    this.f6622j = z6;
                    if (z7) {
                        ex0Var.j(i9);
                        this.f6622j = false;
                        ex0Var2.f4416a[1] = bArr[i7];
                        this.h = 2;
                        this.f6620g = 1;
                        break;
                    }
                    i7 = i9;
                }
            } else if (i6 != 1) {
                int iMin = Math.min(ex0Var.o(), this.f6624l - this.h);
                this.f6618e.e(iMin, ex0Var);
                int i10 = this.h + iMin;
                this.h = i10;
                if (i10 >= this.f6624l) {
                    y5.r(this.f6625m != -9223372036854775807L);
                    this.f6618e.a(this.f6625m, 1, this.f6624l, 0, null);
                    this.f6625m += this.f6623k;
                    this.h = 0;
                    this.f6620g = 0;
                }
            } else {
                int iMin2 = Math.min(ex0Var.o(), 4 - this.h);
                ex0Var.f(this.h, iMin2, ex0Var2.f4416a);
                int i11 = this.h + iMin2;
                this.h = i11;
                if (i11 >= 4) {
                    ex0Var2.j(0);
                    int iQ = ex0Var2.q();
                    j1 j1Var = this.f6615b;
                    if (j1Var.a(iQ)) {
                        this.f6624l = j1Var.f5898c;
                        if (!this.f6621i) {
                            this.f6623k = (j1Var.f5902g * 1000000) / j1Var.f5899d;
                            tk2 tk2Var = new tk2();
                            tk2Var.f9320a = this.f6619f;
                            tk2Var.c(j1Var.f5897b);
                            tk2Var.f9331m = 4096;
                            tk2Var.A = j1Var.f5900e;
                            tk2Var.B = j1Var.f5899d;
                            tk2Var.f9323d = this.f6616c;
                            tk2Var.f9325f = this.f6617d;
                            this.f6618e.b(new w(tk2Var));
                            this.f6621i = true;
                        }
                        ex0Var2.j(0);
                        this.f6618e.e(4, ex0Var2);
                        this.f6620g = 2;
                    } else {
                        this.h = 0;
                        this.f6620g = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f6619f = eaVar.f4182e;
        eaVar.b();
        this.f6618e = z0Var.g(eaVar.f4181d, 1);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f6625m = j6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f6620g = 0;
        this.h = 0;
        this.f6622j = false;
        this.f6625m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
    }
}
