package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q9 implements fa {

    /* renamed from: a, reason: collision with root package name */
    public final z8 f8266a;

    /* renamed from: b, reason: collision with root package name */
    public final l42 f8267b = new l42(10, new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f8268c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8269d;

    /* renamed from: e, reason: collision with root package name */
    public m11 f8270e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8271f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8272g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f8273i;

    /* renamed from: j, reason: collision with root package name */
    public int f8274j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8275k;

    public q9(z8 z8Var) {
        this.f8266a = z8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.l42] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.z8] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // com.google.android.gms.internal.ads.fa
    public final void a(int i6, ex0 ex0Var) {
        int i7;
        int i8;
        int i9;
        int i10;
        long jB;
        long j6;
        int i11;
        y5.k(this.f8270e);
        int i12 = i6 & 1;
        ?? r32 = this.f8266a;
        int i13 = -1;
        int i14 = 2;
        ?? r7 = 0;
        if (i12 != 0) {
            int i15 = this.f8268c;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.f8274j;
                    if (i16 != -1) {
                        qs0.f("PesReader", "Unexpected start indicator: expected " + i16 + " more bytes");
                    }
                    r32.a(ex0Var.f4418c == 0);
                } else {
                    qs0.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f8268c = 1;
            this.f8269d = 0;
        }
        int i17 = i6;
        while (ex0Var.o() > 0) {
            int i18 = this.f8268c;
            if (i18 != 0) {
                ?? r10 = this.f8267b;
                if (i18 != 1) {
                    if (i18 != i14) {
                        int iO = ex0Var.o();
                        int i19 = this.f8274j;
                        int i20 = i19 == i13 ? r7 : iO - i19;
                        if (i20 > 0) {
                            iO -= i20;
                            ex0Var.i(ex0Var.f4417b + iO);
                        }
                        r32.c(ex0Var);
                        int i21 = this.f8274j;
                        if (i21 != i13) {
                            int i22 = i21 - iO;
                            this.f8274j = i22;
                            if (i22 == 0) {
                                r32.a(r7);
                                this.f8268c = 1;
                                this.f8269d = r7;
                            }
                        }
                    } else {
                        if (c(ex0Var, (byte[]) r10.f6576d, Math.min(10, this.f8273i)) && c(ex0Var, null, this.f8273i)) {
                            r10.B(r7);
                            if (this.f8271f) {
                                r10.D(4);
                                long jW = r10.w(3);
                                r10.D(1);
                                int iW = r10.w(15) << 15;
                                r10.D(1);
                                long jW2 = r10.w(15);
                                r10.D(1);
                                if (this.h || !this.f8272g) {
                                    j6 = jW;
                                    i11 = iW;
                                } else {
                                    r10.D(4);
                                    j6 = jW;
                                    r10.D(1);
                                    int iW2 = r10.w(15) << 15;
                                    r10.D(1);
                                    long jW3 = r10.w(15);
                                    r10.D(1);
                                    i11 = iW;
                                    this.f8270e.b((r10.w(3) << 30) | iW2 | jW3);
                                    this.h = true;
                                }
                                jB = this.f8270e.b(jW2 | (j6 << 30) | i11);
                            } else {
                                jB = -9223372036854775807L;
                            }
                            i17 |= true != this.f8275k ? 0 : 4;
                            r32.e(i17, jB);
                            this.f8268c = 3;
                            this.f8269d = 0;
                            r7 = 0;
                            i13 = -1;
                            i14 = 2;
                        }
                    }
                    i7 = i13;
                    i8 = r7;
                    i9 = i14;
                } else {
                    i8 = r7;
                    if (c(ex0Var, (byte[]) r10.f6576d, 9)) {
                        r10.B(i8);
                        int iW3 = r10.w(24);
                        if (iW3 != 1) {
                            androidx.activity.m.g(iW3, "Unexpected start code prefix: ", "PesReader");
                            this.f8274j = -1;
                            i7 = -1;
                            i10 = 0;
                            i9 = 2;
                        } else {
                            r10.D(8);
                            int iW4 = r10.w(16);
                            r10.D(5);
                            this.f8275k = r10.G();
                            i9 = 2;
                            r10.D(2);
                            this.f8271f = r10.G();
                            this.f8272g = r10.G();
                            r10.D(6);
                            int iW5 = r10.w(8);
                            this.f8273i = iW5;
                            i7 = -1;
                            if (iW4 == 0) {
                                this.f8274j = -1;
                            } else {
                                int i23 = (iW4 - 3) - iW5;
                                this.f8274j = i23;
                                if (i23 < 0) {
                                    androidx.activity.m.g(i23, "Found negative packet payload size: ", "PesReader");
                                    this.f8274j = -1;
                                }
                            }
                            i10 = 2;
                        }
                        this.f8268c = i10;
                        i8 = 0;
                        this.f8269d = 0;
                    } else {
                        i9 = 2;
                        i7 = -1;
                    }
                }
            } else {
                i7 = i13;
                i8 = r7;
                i9 = i14;
                ex0Var.k(ex0Var.o());
            }
            i14 = i9;
            r7 = i8;
            i13 = i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.fa
    public final void b(m11 m11Var, z0 z0Var, ea eaVar) {
        this.f8270e = m11Var;
        this.f8266a.d(z0Var, eaVar);
    }

    public final boolean c(ex0 ex0Var, byte[] bArr, int i6) {
        int iMin = Math.min(ex0Var.o(), i6 - this.f8269d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            ex0Var.k(iMin);
        } else {
            ex0Var.f(this.f8269d, iMin, bArr);
        }
        int i7 = this.f8269d + iMin;
        this.f8269d = i7;
        return i7 == i6;
    }

    @Override // com.google.android.gms.internal.ads.fa
    public final void zzc() {
        this.f8268c = 0;
        this.f8269d = 0;
        this.h = false;
        this.f8266a.zze();
    }
}
