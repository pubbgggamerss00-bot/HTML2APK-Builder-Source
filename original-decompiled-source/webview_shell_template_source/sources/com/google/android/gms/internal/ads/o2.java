package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o2 implements x0 {

    /* renamed from: d, reason: collision with root package name */
    public z0 f7571d;

    /* renamed from: e, reason: collision with root package name */
    public s1 f7572e;

    /* renamed from: g, reason: collision with root package name */
    public qh f7574g;
    public d1 h;

    /* renamed from: i, reason: collision with root package name */
    public int f7575i;

    /* renamed from: j, reason: collision with root package name */
    public int f7576j;

    /* renamed from: k, reason: collision with root package name */
    public n2 f7577k;

    /* renamed from: l, reason: collision with root package name */
    public int f7578l;

    /* renamed from: m, reason: collision with root package name */
    public long f7579m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7568a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f7569b = new ex0(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    public final b1 f7570c = new b1();

    /* renamed from: f, reason: collision with root package name */
    public int f7573f = 0;

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        if (j6 == 0) {
            this.f7573f = 0;
        } else {
            n2 n2Var = this.f7577k;
            if (n2Var != null) {
                n2Var.b(j7);
            }
        }
        this.f7579m = j7 != 0 ? -1L : 0L;
        this.f7578l = 0;
        this.f7569b.g(0);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) {
        qh qhVarB = new xj0(1).b(y0Var, y3.f10822a);
        if (qhVarB != null) {
            int length = qhVarB.s.length;
        }
        ex0 ex0Var = new ex0(4);
        ((p0) y0Var).g(ex0Var.f4416a, 0, 4, false);
        return ex0Var.D() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final int e(y0 y0Var, b1 b1Var) throws rn {
        d1 d1Var;
        int i6;
        m1 l1Var;
        long j6;
        long j7;
        long j8;
        boolean zL;
        int i7 = this.f7573f;
        qh qhVar = null;
        if (i7 == 0) {
            y0Var.zzj();
            long jZze = y0Var.zze();
            qh qhVarB = new xj0(1).b(y0Var, null);
            if (qhVarB != null && qhVarB.s.length != 0) {
                qhVar = qhVarB;
            }
            y0Var.b((int) (y0Var.zze() - jZze));
            this.f7574g = qhVar;
            this.f7573f = 1;
            return 0;
        }
        byte[] bArr = this.f7568a;
        if (i7 == 1) {
            y0Var.h(0, 42, bArr);
            y0Var.zzj();
            this.f7573f = 2;
            return 0;
        }
        if (i7 == 2) {
            ex0 ex0Var = new ex0(4);
            y0Var.i(0, 4, ex0Var.f4416a);
            if (ex0Var.D() != 1716281667) {
                throw rn.a(null, "Failed to read FLAC stream marker.");
            }
            this.f7573f = 3;
            return 0;
        }
        if (i7 != 3) {
            long j9 = 0;
            if (i7 == 4) {
                y0Var.zzj();
                ex0 ex0Var2 = new ex0(2);
                y0Var.h(0, 2, ex0Var2.f4416a);
                int iZ = ex0Var2.z();
                if ((iZ >> 2) != 16382) {
                    y0Var.zzj();
                    throw rn.a(null, "First frame does not start with sync code.");
                }
                y0Var.zzj();
                this.f7576j = iZ;
                z0 z0Var = this.f7571d;
                int i8 = j31.f5914a;
                long jZzf = y0Var.zzf();
                long jZzd = y0Var.zzd();
                d1 d1Var2 = this.h;
                d1Var2.getClass();
                if (d1Var2.f3718k != null) {
                    l1Var = new c1(d1Var2, jZzf);
                    i6 = 0;
                } else if (jZzd == -1 || d1Var2.f3717j <= 0) {
                    i6 = 0;
                    l1Var = new l1(d1Var2.a(), 0L);
                } else {
                    int i9 = this.f7576j;
                    int i10 = d1Var2.f3711c;
                    l2 l2Var = new l2(0, d1Var2);
                    m2 m2Var = new m2();
                    m2Var.f6905t = d1Var2;
                    m2Var.s = i9;
                    m2Var.f6906u = new b1();
                    long jA = d1Var2.a();
                    long j10 = d1Var2.f3717j;
                    int i11 = d1Var2.f3712d;
                    if (i11 > 0) {
                        i6 = 0;
                        j7 = ((i11 + i10) / 2) + 1;
                        j6 = j10;
                    } else {
                        i6 = 0;
                        int i12 = d1Var2.f3709a;
                        long j11 = 4096;
                        if (i12 == d1Var2.f3710b && i12 > 0) {
                            j11 = i12;
                        }
                        j6 = j10;
                        j7 = 64 + (((j11 * d1Var2.f3715g) * d1Var2.h) / 8);
                    }
                    n2 n2Var = new n2(l2Var, m2Var, jA, j6, jZzf, jZzd, j7, Math.max(6, i10));
                    this.f7577k = n2Var;
                    l1Var = n2Var.f6893a;
                }
                z0Var.f(l1Var);
                this.f7573f = 5;
                return i6;
            }
            this.f7572e.getClass();
            this.h.getClass();
            n2 n2Var2 = this.f7577k;
            if (n2Var2 != null && n2Var2.f6895c != null) {
                return n2Var2.a(y0Var, b1Var);
            }
            if (this.f7579m == -1) {
                y0Var.zzj();
                y0Var.a(1);
                byte[] bArr2 = new byte[1];
                y0Var.h(0, 1, bArr2);
                int i13 = bArr2[0] & 1;
                boolean z6 = 1 == i13;
                y0Var.a(2);
                i = 1 != i13 ? 6 : 7;
                ex0 ex0Var3 = new ex0(i);
                byte[] bArr3 = ex0Var3.f4416a;
                int i14 = 0;
                while (i14 < i) {
                    int iE = y0Var.e(i14, i - i14, bArr3);
                    if (iE == -1) {
                        break;
                    }
                    i14 += iE;
                }
                ex0Var3.i(i14);
                y0Var.zzj();
                try {
                    long jF = ex0Var3.F();
                    if (!z6) {
                        jF *= r2.f3710b;
                    }
                    j9 = jF;
                } catch (NumberFormatException unused) {
                    z = false;
                }
                if (!z) {
                    throw rn.a(null, null);
                }
                this.f7579m = j9;
            } else {
                ex0 ex0Var4 = this.f7569b;
                int i15 = ex0Var4.f4418c;
                if (i15 < 32768) {
                    int iJ = y0Var.j(i15, 32768 - i15, ex0Var4.f4416a);
                    z = iJ == -1;
                    if (!z) {
                        ex0Var4.i(i15 + iJ);
                    } else if (ex0Var4.o() == 0) {
                        long j12 = this.f7579m * 1000000;
                        d1 d1Var3 = this.h;
                        int i16 = j31.f5914a;
                        this.f7572e.a(j12 / d1Var3.f3713e, 1, this.f7578l, 0, null);
                        return -1;
                    }
                } else {
                    z = false;
                }
                int i17 = ex0Var4.f4417b;
                int i18 = this.f7578l;
                int i19 = this.f7575i;
                if (i18 < i19) {
                    ex0Var4.k(Math.min(i19 - i18, ex0Var4.o()));
                }
                this.h.getClass();
                int i20 = ex0Var4.f4417b;
                while (true) {
                    int i21 = ex0Var4.f4418c - 16;
                    b1 b1Var2 = this.f7570c;
                    if (i20 <= i21) {
                        ex0Var4.j(i20);
                        if (y5.l(ex0Var4, this.h, this.f7576j, b1Var2)) {
                            ex0Var4.j(i20);
                            j8 = b1Var2.f2886a;
                            break;
                        }
                        i20++;
                    } else {
                        if (z) {
                            while (true) {
                                int i22 = ex0Var4.f4418c;
                                if (i20 > i22 - this.f7575i) {
                                    ex0Var4.j(i22);
                                    break;
                                }
                                ex0Var4.j(i20);
                                try {
                                    zL = y5.l(ex0Var4, this.h, this.f7576j, b1Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zL = false;
                                }
                                if (ex0Var4.f4417b <= ex0Var4.f4418c && zL) {
                                    ex0Var4.j(i20);
                                    j8 = b1Var2.f2886a;
                                    break;
                                }
                                i20++;
                            }
                        } else {
                            ex0Var4.j(i20);
                        }
                        j8 = -1;
                    }
                }
                int i23 = ex0Var4.f4417b - i17;
                ex0Var4.j(i17);
                this.f7572e.e(i23, ex0Var4);
                int i24 = this.f7578l + i23;
                this.f7578l = i24;
                if (j8 != -1) {
                    long j13 = this.f7579m * 1000000;
                    d1 d1Var4 = this.h;
                    int i25 = j31.f5914a;
                    this.f7572e.a(j13 / d1Var4.f3713e, 1, i24, 0, null);
                    this.f7578l = 0;
                    this.f7579m = j8;
                }
                if (ex0Var4.o() < 16) {
                    int iO = ex0Var4.o();
                    byte[] bArr4 = ex0Var4.f4416a;
                    System.arraycopy(bArr4, ex0Var4.f4417b, bArr4, 0, iO);
                    ex0Var4.j(0);
                    ex0Var4.i(iO);
                    return 0;
                }
            }
            return 0;
        }
        int i26 = 0;
        d1 d1Var5 = this.h;
        while (true) {
            y0Var.zzj();
            byte[] bArr5 = new byte[4];
            l42 l42Var = new l42(4, bArr5);
            int i27 = i26;
            y0Var.h(i27, 4, bArr5);
            boolean zG = l42Var.G();
            int iW = l42Var.w(i);
            int iW2 = l42Var.w(24) + 4;
            if (iW == 0) {
                byte[] bArr6 = new byte[38];
                y0Var.i(i27, 38, bArr6);
                d1Var5 = new d1(4, bArr6);
            } else {
                if (d1Var5 == null) {
                    throw new IllegalArgumentException();
                }
                qh qhVar2 = d1Var5.f3719l;
                if (iW == 3) {
                    ex0 ex0Var5 = new ex0(iW2);
                    y0Var.i(i27, iW2, ex0Var5.f4416a);
                    d1Var = new d1(d1Var5.f3709a, d1Var5.f3710b, d1Var5.f3711c, d1Var5.f3712d, d1Var5.f3713e, d1Var5.f3715g, d1Var5.h, d1Var5.f3717j, bq.h(ex0Var5), d1Var5.f3719l);
                } else if (iW == 4) {
                    ex0 ex0Var6 = new ex0(iW2);
                    y0Var.i(0, iW2, ex0Var6.f4416a);
                    ex0Var6.k(4);
                    qh qhVarA = x1.a(Arrays.asList((String[]) x1.b(ex0Var6, false, false).f10619t));
                    if (qhVar2 != null) {
                        qhVarA = qhVar2.m(qhVarA);
                    }
                    d1Var = new d1(d1Var5.f3709a, d1Var5.f3710b, d1Var5.f3711c, d1Var5.f3712d, d1Var5.f3713e, d1Var5.f3715g, d1Var5.h, d1Var5.f3717j, d1Var5.f3718k, qhVarA);
                } else if (iW == 6) {
                    ex0 ex0Var7 = new ex0(iW2);
                    y0Var.i(0, iW2, ex0Var7.f4416a);
                    ex0Var7.k(4);
                    qh qhVar3 = new qh(bo1.n(g3.l(ex0Var7)));
                    if (qhVar2 != null) {
                        qhVar3 = qhVar2.m(qhVar3);
                    }
                    d1Var = new d1(d1Var5.f3709a, d1Var5.f3710b, d1Var5.f3711c, d1Var5.f3712d, d1Var5.f3713e, d1Var5.f3715g, d1Var5.h, d1Var5.f3717j, d1Var5.f3718k, qhVar3);
                } else {
                    y0Var.b(iW2);
                }
                d1Var5 = d1Var;
            }
            int i28 = j31.f5914a;
            this.h = d1Var5;
            if (zG) {
                this.f7575i = Math.max(d1Var5.f3711c, 6);
                this.f7572e.b(this.h.b(bArr, this.f7574g));
                this.f7573f = 4;
                return 0;
            }
            i = 7;
            i26 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f7571d = z0Var;
        this.f7572e = z0Var.g(0, 1);
        z0Var.d();
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
