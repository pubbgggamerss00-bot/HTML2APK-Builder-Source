package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b9 implements z8 {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f2982q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f2983a;

    /* renamed from: b, reason: collision with root package name */
    public s1 f2984b;

    /* renamed from: c, reason: collision with root package name */
    public final ha f2985c;

    /* renamed from: d, reason: collision with root package name */
    public final ex0 f2986d;

    /* renamed from: e, reason: collision with root package name */
    public final p9 f2987e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f2988f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final a9 f2989g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2990i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2991j;

    /* renamed from: k, reason: collision with root package name */
    public long f2992k;

    /* renamed from: l, reason: collision with root package name */
    public long f2993l;

    /* renamed from: m, reason: collision with root package name */
    public long f2994m;

    /* renamed from: n, reason: collision with root package name */
    public long f2995n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2996o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2997p;

    public b9(ha haVar) {
        ex0 ex0Var;
        this.f2985c = haVar;
        a9 a9Var = new a9();
        a9Var.f2619d = new byte[128];
        this.f2989g = a9Var;
        if (haVar != null) {
            this.f2987e = new p9(178);
            ex0Var = new ex0();
        } else {
            ex0Var = null;
            this.f2987e = null;
        }
        this.f2986d = ex0Var;
        this.f2993l = -9223372036854775807L;
        this.f2995n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
        y5.k(this.f2984b);
        if (z6) {
            boolean z7 = this.f2996o;
            long j6 = this.h - this.f2994m;
            this.f2984b.a(this.f2995n, z7 ? 1 : 0, (int) j6, 0, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    @Override // com.google.android.gms.internal.ads.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ex0 ex0Var) {
        a9 a9Var;
        p9 p9Var;
        int i6;
        long j6;
        long j7;
        boolean z6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        float f6;
        int i10;
        long j8;
        byte b7;
        int i11;
        y5.k(this.f2984b);
        int i12 = ex0Var.f4417b;
        int i13 = ex0Var.f4418c;
        byte[] bArr = ex0Var.f4416a;
        this.h += ex0Var.o();
        this.f2984b.e(ex0Var.o(), ex0Var);
        while (true) {
            int iA = uf1.a(bArr, i12, i13, this.f2988f);
            a9Var = this.f2989g;
            p9Var = this.f2987e;
            if (iA == i13) {
                break;
            }
            int i14 = iA + 3;
            boolean z8 = ex0Var.f4416a[i14] & 255;
            int i15 = iA - i12;
            if (this.f2991j) {
                i6 = i13;
            } else {
                if (i15 > 0) {
                    a9Var.a(i12, iA, bArr);
                }
                int i16 = i15 < 0 ? -i15 : 0;
                if (a9Var.f2616a) {
                    int i17 = a9Var.f2617b - i16;
                    a9Var.f2617b = i17;
                    if (a9Var.f2618c == 0 && z8 == 181) {
                        a9Var.f2618c = i17;
                        i6 = i13;
                    } else {
                        a9Var.f2616a = false;
                        String str = this.f2983a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(a9Var.f2619d, a9Var.f2617b);
                        int i18 = bArrCopyOf[4] & 255;
                        byte b8 = bArrCopyOf[5];
                        i6 = i13;
                        int i19 = bArrCopyOf[6] & 255;
                        int i20 = ((b8 & 255) >> 4) | (i18 << 4);
                        int i21 = (bArrCopyOf[7] & 240) >> 4;
                        int i22 = ((b8 & 15) << 8) | i19;
                        if (i21 == 2) {
                            i8 = i22 * 4;
                            i9 = i20 * 3;
                        } else if (i21 == 3) {
                            i8 = i22 * 16;
                            i9 = i20 * 9;
                        } else if (i21 != 4) {
                            f6 = 1.0f;
                            tk2 tk2Var = new tk2();
                            tk2Var.f9320a = str;
                            tk2Var.c("video/mpeg2");
                            tk2Var.s = i20;
                            tk2Var.f9337t = i22;
                            tk2Var.f9340w = f6;
                            tk2Var.f9333o = Collections.singletonList(bArrCopyOf);
                            w wVar = new w(tk2Var);
                            i10 = (bArrCopyOf[7] & 15) - 1;
                            j8 = 0;
                            if (i10 >= 0 && i10 < 8) {
                                double d7 = f2982q[i10];
                                b7 = bArrCopyOf[a9Var.f2618c + 9];
                                i11 = (b7 & 96) >> 5;
                                if (i11 == (b7 & 31)) {
                                    d7 = ((i11 + 1.0d) / (r6 + 1)) * d7;
                                }
                                j8 = (long) (1000000.0d / d7);
                            }
                            Pair pairCreate = Pair.create(wVar, Long.valueOf(j8));
                            this.f2984b.b((w) pairCreate.first);
                            this.f2992k = ((Long) pairCreate.second).longValue();
                            this.f2991j = true;
                        } else {
                            i8 = i22 * 121;
                            i9 = i20 * 100;
                        }
                        f6 = i8 / i9;
                        tk2 tk2Var2 = new tk2();
                        tk2Var2.f9320a = str;
                        tk2Var2.c("video/mpeg2");
                        tk2Var2.s = i20;
                        tk2Var2.f9337t = i22;
                        tk2Var2.f9340w = f6;
                        tk2Var2.f9333o = Collections.singletonList(bArrCopyOf);
                        w wVar2 = new w(tk2Var2);
                        i10 = (bArrCopyOf[7] & 15) - 1;
                        j8 = 0;
                        if (i10 >= 0) {
                            double d72 = f2982q[i10];
                            b7 = bArrCopyOf[a9Var.f2618c + 9];
                            i11 = (b7 & 96) >> 5;
                            if (i11 == (b7 & 31)) {
                            }
                            j8 = (long) (1000000.0d / d72);
                        }
                        Pair pairCreate2 = Pair.create(wVar2, Long.valueOf(j8));
                        this.f2984b.b((w) pairCreate2.first);
                        this.f2992k = ((Long) pairCreate2.second).longValue();
                        this.f2991j = true;
                    }
                } else {
                    i6 = i13;
                    if (z8 == 179) {
                        a9Var.f2616a = true;
                    }
                }
                a9Var.a(0, 3, a9.f2615e);
            }
            if (p9Var != null) {
                if (i15 > 0) {
                    p9Var.b(i12, iA, bArr);
                    i7 = 0;
                } else {
                    i7 = -i15;
                }
                if (p9Var.e(i7)) {
                    int iB = uf1.b(p9Var.f7995d, (byte[]) p9Var.f7996e);
                    int i23 = j31.f5914a;
                    byte[] bArr2 = (byte[]) p9Var.f7996e;
                    ex0 ex0Var2 = this.f2986d;
                    ex0Var2.h(iB, bArr2);
                    this.f2985c.a(this.f2995n, ex0Var2);
                }
                if (z8 == 178) {
                    if (ex0Var.f4416a[iA + 2] == 1) {
                        p9Var.d(178);
                    }
                    z8 = 178;
                }
            }
            if (z8 == 0 || z8 == 179) {
                int i24 = i6 - iA;
                if (this.f2997p && this.f2991j) {
                    long j9 = this.f2995n;
                    if (j9 != -9223372036854775807L) {
                        j6 = -9223372036854775807L;
                        this.f2984b.a(j9, this.f2996o ? 1 : 0, ((int) (this.h - this.f2994m)) - i24, i24, null);
                    }
                    if (this.f2990i) {
                        this.f2994m = this.h - i24;
                        j7 = this.f2993l;
                        if (j7 == j6) {
                        }
                        this.f2995n = j7;
                        z6 = false;
                        this.f2996o = false;
                        this.f2993l = j6;
                        z7 = true;
                        this.f2990i = true;
                        this.f2997p = z8 != 0 ? z7 : z6;
                    }
                } else {
                    j6 = -9223372036854775807L;
                    if (this.f2990i || this.f2997p) {
                        this.f2994m = this.h - i24;
                        j7 = this.f2993l;
                        if (j7 == j6) {
                            long j10 = this.f2995n;
                            j7 = j10 != j6 ? j10 + this.f2992k : j6;
                        }
                        this.f2995n = j7;
                        z6 = false;
                        this.f2996o = false;
                        this.f2993l = j6;
                        z7 = true;
                        this.f2990i = true;
                    } else {
                        z7 = true;
                        z6 = false;
                    }
                    this.f2997p = z8 != 0 ? z7 : z6;
                }
            } else if (z8 == 184) {
                this.f2996o = true;
            }
            i12 = i14;
            i13 = i6;
        }
        if (!this.f2991j) {
            a9Var.a(i12, i13, bArr);
        }
        if (p9Var != null) {
            p9Var.b(i12, i13, bArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f2983a = eaVar.f4182e;
        eaVar.b();
        this.f2984b = z0Var.g(eaVar.f4181d, 2);
        ha haVar = this.f2985c;
        if (haVar != null) {
            haVar.b(z0Var, eaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f2993l = j6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        uf1.f(this.f2988f);
        a9 a9Var = this.f2989g;
        a9Var.f2616a = false;
        a9Var.f2617b = 0;
        a9Var.f2618c = 0;
        p9 p9Var = this.f2987e;
        if (p9Var != null) {
            p9Var.c();
        }
        this.h = 0L;
        this.f2990i = false;
        this.f2993l = -9223372036854775807L;
        this.f2995n = -9223372036854775807L;
    }
}
