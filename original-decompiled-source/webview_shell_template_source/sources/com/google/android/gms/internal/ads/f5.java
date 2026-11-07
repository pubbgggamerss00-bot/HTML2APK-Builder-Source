package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f5 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f4474a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f4475b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f4476c;

    /* renamed from: d, reason: collision with root package name */
    public final xj0 f4477d;

    /* renamed from: e, reason: collision with root package name */
    public z0 f4478e;

    /* renamed from: f, reason: collision with root package name */
    public s1 f4479f;

    /* renamed from: g, reason: collision with root package name */
    public s1 f4480g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public qh f4481i;

    /* renamed from: j, reason: collision with root package name */
    public long f4482j;

    /* renamed from: k, reason: collision with root package name */
    public long f4483k;

    /* renamed from: l, reason: collision with root package name */
    public long f4484l;

    /* renamed from: m, reason: collision with root package name */
    public long f4485m;

    /* renamed from: n, reason: collision with root package name */
    public int f4486n;

    /* renamed from: o, reason: collision with root package name */
    public h5 f4487o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4488p;

    public f5() {
        throw null;
    }

    public final void a() {
        h5 h5Var = this.f4487o;
        if ((h5Var instanceof c5) && ((c5) h5Var).zzh()) {
            long j6 = this.f4485m;
            if (j6 == -1 || j6 == this.f4487o.zzd()) {
                return;
            }
            c5 c5Var = (c5) this.f4487o;
            this.f4487o = new c5(c5Var.h, c5Var.f3409i, this.f4485m, c5Var.f3408g);
            z0 z0Var = this.f4478e;
            z0Var.getClass();
            z0Var.f(this.f4487o);
        }
    }

    public final boolean b(y0 y0Var) {
        h5 h5Var = this.f4487o;
        if (h5Var != null) {
            long jZzd = h5Var.zzd();
            if (jZzd != -1 && y0Var.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !y0Var.g(this.f4474a.f4416a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.h = 0;
        this.f4482j = -9223372036854775807L;
        this.f4483k = 0L;
        this.f4486n = 0;
        if (this.f4487o instanceof d5) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) {
        return g(y0Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0475 A[PHI: r3
      0x0475: PHI (r3v4 int) = (r3v3 int), (r3v14 int) binds: [B:185:0x0419, B:199:0x0473] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws Throwable {
        Throwable th;
        int i6;
        int i7;
        long j6;
        h5 h5Var;
        ex0 ex0Var;
        int i8;
        int iD;
        int i9;
        ex0 ex0Var2;
        long[] jArr;
        int i10;
        int i11;
        long j7;
        h5 c5Var;
        qh qhVar;
        e5 e5Var;
        h5 c5Var2;
        long jS;
        long j8;
        long j9;
        int iV;
        f5 f5Var = this;
        y0 y0Var2 = y0Var;
        y5.k(f5Var.f4479f);
        int i12 = j31.f5914a;
        int i13 = f5Var.h;
        j1 j1Var = f5Var.f4475b;
        if (i13 == 0) {
            try {
                f5Var.g(y0Var2, false);
                h5Var = f5Var.f4487o;
                ex0 ex0Var3 = f5Var.f4474a;
                if (h5Var != null) {
                    ex0 ex0Var4 = new ex0(j1Var.f5898c);
                    j6 = 1000000;
                    y0Var2.h(0, j1Var.f5898c, ex0Var4.f4416a);
                    if ((j1Var.f5896a & 1) != 0) {
                        i9 = j1Var.f5900e != 1 ? 36 : 21;
                        th = null;
                        if (ex0Var4.f4418c < i9 + 4) {
                            ex0Var4.j(i9);
                            int iQ = ex0Var4.q();
                            if (iQ != 1483304551) {
                                if (iQ == 1231971951) {
                                    iQ = 1231971951;
                                } else if (ex0Var4.f4418c >= 40) {
                                    ex0Var4.j(36);
                                    iQ = ex0Var4.q() == 1447187017 ? 1447187017 : 0;
                                }
                            }
                            g1 g1Var = f5Var.f4476c;
                            if (iQ == 1231971951) {
                                ex0Var2 = ex0Var3;
                                int iQ2 = ex0Var4.q();
                                int iY = (iQ2 & 1) != 0 ? ex0Var4.y() : -1;
                                long jD = (iQ2 & 2) != 0 ? ex0Var4.D() : -1L;
                                if ((iQ2 & 4) == 4) {
                                    long[] jArr2 = new long[100];
                                    for (int i14 = 0; i14 < 100; i14++) {
                                        jArr2[i14] = ex0Var4.v();
                                    }
                                    jArr = jArr2;
                                } else {
                                    jArr = null;
                                }
                                if ((iQ2 & 8) != 0) {
                                    ex0Var4.k(4);
                                }
                                if (ex0Var4.o() >= 24) {
                                    ex0Var4.k(21);
                                    int iX = ex0Var4.x();
                                    i11 = iX >> 12;
                                    i10 = iX & 4095;
                                } else {
                                    i10 = -1;
                                    i11 = -1;
                                }
                                long j10 = iY;
                                int i15 = j1Var.f5898c;
                                int i16 = j1Var.f5899d;
                                int i17 = j1Var.f5901f;
                                int i18 = j1Var.f5902g;
                                if ((g1Var.f4863a == -1 || g1Var.f4864b == -1) && i11 != -1 && i10 != -1) {
                                    g1Var.f4863a = i11;
                                    g1Var.f4864b = i10;
                                }
                                long jZzf = y0Var2.zzf();
                                if (y0Var2.zzd() != -1 && jD != -1) {
                                    long j11 = jZzf + jD;
                                    if (y0Var2.zzd() != j11) {
                                        qs0.e("Mp3Extractor", "Data size mismatch between stream (" + y0Var.zzd() + ") and Xing frame (" + j11 + "), using Xing value.");
                                    }
                                }
                                y0Var2 = y0Var;
                                y0Var2.b(j1Var.f5898c);
                                if (iQ == 1483304551) {
                                    long jT = (j10 == -1 || j10 == 0) ? -9223372036854775807L : j31.t(i16, (j10 * i18) - 1);
                                    c5Var = jT == -9223372036854775807L ? null : (jD == -1 || jArr == null) ? new j5(jZzf, i15, jT, i17, -1L, null) : new j5(jZzf, i15, jT, i17, jD, jArr);
                                    f5Var = this;
                                    qhVar = f5Var.f4481i;
                                    long jZzf2 = y0Var2.zzf();
                                    if (qhVar != null) {
                                        zg[] zgVarArr = qhVar.s;
                                        for (zg zgVar : zgVarArr) {
                                            if (zgVar instanceof e4) {
                                                int[] iArr = ((e4) zgVar).f4111w;
                                                int length = zgVarArr.length;
                                                int i19 = 0;
                                                while (true) {
                                                    if (i19 >= length) {
                                                        jS = -9223372036854775807L;
                                                        break;
                                                    }
                                                    zg zgVar2 = zgVarArr[i19];
                                                    if (zgVar2 instanceof i4) {
                                                        i4 i4Var = (i4) zgVar2;
                                                        if (i4Var.s.equals("TLEN")) {
                                                            jS = j31.s(Long.parseLong((String) i4Var.f5547u.get(0)));
                                                            break;
                                                        }
                                                    }
                                                    i19++;
                                                }
                                                int length2 = iArr.length;
                                                int i20 = length2 + 1;
                                                long[] jArr3 = new long[i20];
                                                long[] jArr4 = new long[i20];
                                                jArr3[0] = jZzf2;
                                                jArr4[0] = 0;
                                                long j12 = 0;
                                                int i21 = 1;
                                                while (i21 <= length2) {
                                                    int i22 = i21 - 1;
                                                    jZzf2 += r9.f4109u + iArr[i22];
                                                    j12 += r9.f4110v + r9.f4112x[i22];
                                                    jArr3[i21] = jZzf2;
                                                    jArr4[i21] = j12;
                                                    i21++;
                                                    length2 = length2;
                                                    iArr = iArr;
                                                }
                                                e5Var = new e5(jS, jArr3, jArr4);
                                                if (f5Var.f4488p) {
                                                    c5Var2 = new g5(-9223372036854775807L, 0L);
                                                    ex0Var = ex0Var2;
                                                } else {
                                                    if (e5Var != null) {
                                                        c5Var = e5Var;
                                                    } else if (c5Var == null) {
                                                        c5Var = null;
                                                    }
                                                    if (c5Var != null) {
                                                        c5Var.zzh();
                                                        ex0Var = ex0Var2;
                                                        c5Var2 = c5Var;
                                                    } else {
                                                        ex0Var = ex0Var2;
                                                        y0Var2.h(0, 4, ex0Var.f4416a);
                                                        ex0Var.j(0);
                                                        j1Var.a(ex0Var.q());
                                                        c5Var2 = new c5(j1Var.f5901f, j1Var.f5898c, y0Var2.zzd(), y0Var2.zzf());
                                                    }
                                                }
                                                f5Var.f4487o = c5Var2;
                                                f5Var.f4478e.f(c5Var2);
                                                tk2 tk2Var = new tk2();
                                                tk2Var.c(j1Var.f5897b);
                                                tk2Var.f9331m = 4096;
                                                tk2Var.A = j1Var.f5900e;
                                                tk2Var.B = j1Var.f5899d;
                                                tk2Var.D = g1Var.f4863a;
                                                tk2Var.E = g1Var.f4864b;
                                                tk2Var.f9328j = f5Var.f4481i;
                                                if (f5Var.f4487o.zzc() != -2147483647) {
                                                    tk2Var.f9326g = f5Var.f4487o.zzc();
                                                }
                                                f5Var.f4480g.b(new w(tk2Var));
                                                f5Var.f4484l = y0Var2.zzf();
                                            }
                                        }
                                        e5Var = null;
                                        if (f5Var.f4488p) {
                                        }
                                        f5Var.f4487o = c5Var2;
                                        f5Var.f4478e.f(c5Var2);
                                        tk2 tk2Var2 = new tk2();
                                        tk2Var2.c(j1Var.f5897b);
                                        tk2Var2.f9331m = 4096;
                                        tk2Var2.A = j1Var.f5900e;
                                        tk2Var2.B = j1Var.f5899d;
                                        tk2Var2.D = g1Var.f4863a;
                                        tk2Var2.E = g1Var.f4864b;
                                        tk2Var2.f9328j = f5Var.f4481i;
                                        if (f5Var.f4487o.zzc() != -2147483647) {
                                        }
                                        f5Var.f4480g.b(new w(tk2Var2));
                                        f5Var.f4484l = y0Var2.zzf();
                                    } else {
                                        e5Var = null;
                                        if (f5Var.f4488p) {
                                        }
                                        f5Var.f4487o = c5Var2;
                                        f5Var.f4478e.f(c5Var2);
                                        tk2 tk2Var22 = new tk2();
                                        tk2Var22.c(j1Var.f5897b);
                                        tk2Var22.f9331m = 4096;
                                        tk2Var22.A = j1Var.f5900e;
                                        tk2Var22.B = j1Var.f5899d;
                                        tk2Var22.D = g1Var.f4863a;
                                        tk2Var22.E = g1Var.f4864b;
                                        tk2Var22.f9328j = f5Var.f4481i;
                                        if (f5Var.f4487o.zzc() != -2147483647) {
                                        }
                                        f5Var.f4480g.b(new w(tk2Var22));
                                        f5Var.f4484l = y0Var2.zzf();
                                    }
                                } else {
                                    long jZzd = y0Var2.zzd();
                                    long jT2 = (j10 == -1 || j10 == 0) ? -9223372036854775807L : j31.t(i16, (i18 * j10) - 1);
                                    if (jT2 != -9223372036854775807L) {
                                        if (jD != -1) {
                                            jZzd = jZzf + jD;
                                            j7 = jD - i15;
                                        } else {
                                            if (jZzd != -1) {
                                                j7 = (jZzd - jZzf) - i15;
                                            }
                                            f5Var = this;
                                            c5Var = null;
                                            qhVar = f5Var.f4481i;
                                            long jZzf22 = y0Var2.zzf();
                                            if (qhVar != null) {
                                            }
                                        }
                                        long j13 = jZzd;
                                        long j14 = j7;
                                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                                        f5Var = this;
                                        c5Var = new c5(ed0.l(j31.u(j14, 8000000L, jT2, roundingMode)), ed0.l(kq1.b(j14, j10, roundingMode)), j13, jZzf + i15);
                                        qhVar = f5Var.f4481i;
                                        long jZzf222 = y0Var2.zzf();
                                        if (qhVar != null) {
                                        }
                                    } else {
                                        f5Var = this;
                                        c5Var = null;
                                        qhVar = f5Var.f4481i;
                                        long jZzf2222 = y0Var2.zzf();
                                        if (qhVar != null) {
                                        }
                                    }
                                }
                            } else if (iQ != 1447187017) {
                                if (iQ != 1483304551) {
                                    y0Var2.zzj();
                                    c5Var = null;
                                    ex0Var2 = ex0Var3;
                                }
                                qhVar = f5Var.f4481i;
                                long jZzf22222 = y0Var2.zzf();
                                if (qhVar != null) {
                                }
                            } else {
                                long jZzd2 = y0Var2.zzd();
                                long jZzf3 = y0Var2.zzf();
                                ex0Var4.k(10);
                                int iQ3 = ex0Var4.q();
                                if (iQ3 <= 0) {
                                    ex0Var2 = ex0Var3;
                                } else {
                                    int i23 = j1Var.f5899d;
                                    long jU = j31.u(iQ3, (i23 >= 32000 ? 1152 : 576) * 1000000, i23, RoundingMode.DOWN);
                                    int iZ = ex0Var4.z();
                                    int iZ2 = ex0Var4.z();
                                    int iZ3 = ex0Var4.z();
                                    ex0Var4.k(2);
                                    ex0Var2 = ex0Var3;
                                    long j15 = j1Var.f5898c + jZzf3;
                                    long[] jArr5 = new long[iZ];
                                    long[] jArr6 = new long[iZ];
                                    int i24 = 0;
                                    while (i24 < iZ) {
                                        jArr5[i24] = (i24 * jU) / iZ;
                                        jArr6[i24] = Math.max(jZzf3, j15);
                                        if (iZ3 != 1) {
                                            j9 = j15;
                                            if (iZ3 == 2) {
                                                iV = ex0Var4.z();
                                            } else if (iZ3 == 3) {
                                                iV = ex0Var4.x();
                                            } else if (iZ3 == 4) {
                                                iV = ex0Var4.y();
                                            }
                                        } else {
                                            j9 = j15;
                                            iV = ex0Var4.v();
                                        }
                                        i24++;
                                        jZzf3 = (iV * iZ2) + jZzf3;
                                        jZzd2 = jZzd2;
                                        j15 = j9;
                                    }
                                    long j16 = jZzd2;
                                    long j17 = jZzf3;
                                    if (j16 == -1 || j16 == j17) {
                                        j8 = j17;
                                    } else {
                                        StringBuilder sb = new StringBuilder("VBRI data size mismatch: ");
                                        sb.append(j16);
                                        sb.append(", ");
                                        j8 = j17;
                                        sb.append(j8);
                                        qs0.f("VbriSeeker", sb.toString());
                                    }
                                    c5Var = new i5(jArr5, jArr6, jU, j8, j1Var.f5901f);
                                    y0Var2 = y0Var;
                                    y0Var2.b(j1Var.f5898c);
                                    f5Var = this;
                                    qhVar = f5Var.f4481i;
                                    long jZzf222222 = y0Var2.zzf();
                                    if (qhVar != null) {
                                    }
                                }
                                c5Var = null;
                                y0Var2 = y0Var;
                                y0Var2.b(j1Var.f5898c);
                                f5Var = this;
                                qhVar = f5Var.f4481i;
                                long jZzf2222222 = y0Var2.zzf();
                                if (qhVar != null) {
                                }
                            }
                        }
                    } else {
                        if (j1Var.f5900e == 1) {
                            i9 = 13;
                        }
                        th = null;
                        if (ex0Var4.f4418c < i9 + 4) {
                        }
                    }
                } else {
                    ex0Var = ex0Var3;
                    th = null;
                    j6 = 1000000;
                    long j18 = f5Var.f4484l;
                    if (j18 != 0) {
                        long jZzf4 = y0Var2.zzf();
                        if (jZzf4 < j18) {
                            y0Var2.b((int) (j18 - jZzf4));
                        }
                    }
                }
                i8 = f5Var.f4486n;
                if (i8 != 0) {
                    y0Var2.zzj();
                    if (!b(y0Var)) {
                        ex0Var.j(0);
                        int iQ4 = ex0Var.q();
                        if (((-128000) & iQ4) != (f5Var.h & (-128000)) || fo.e(iQ4) == -1) {
                            y0Var2.b(1);
                            f5Var.h = 0;
                            i6 = 0;
                            i7 = -1;
                        } else {
                            j1Var.a(iQ4);
                            if (f5Var.f4482j == -9223372036854775807L) {
                                f5Var.f4482j = f5Var.f4487o.a(y0Var2.zzf());
                            }
                            i8 = j1Var.f5898c;
                            f5Var.f4486n = i8;
                            f5Var.f4485m = y0Var2.zzf() + i8;
                            if (f5Var.f4487o instanceof d5) {
                                long j19 = ((f5Var.f4483k + j1Var.f5902g) * j6) / j1Var.f5899d;
                                throw th;
                            }
                            iD = f5Var.f4480g.d(y0Var2, i8, true);
                            if (iD != -1) {
                                int i25 = f5Var.f4486n - iD;
                                f5Var.f4486n = i25;
                                if (i25 > 0) {
                                    i6 = 0;
                                } else {
                                    f5Var.f4480g.a(((f5Var.f4483k * j6) / j1Var.f5899d) + f5Var.f4482j, 1, j1Var.f5898c, 0, null);
                                    f5Var.f4483k += j1Var.f5902g;
                                    f5Var.f4486n = 0;
                                    i6 = 0;
                                }
                            }
                            i7 = -1;
                        }
                    }
                    i6 = -1;
                    i7 = -1;
                } else {
                    iD = f5Var.f4480g.d(y0Var2, i8, true);
                    if (iD != -1) {
                        i6 = -1;
                    }
                    i7 = -1;
                }
            } catch (EOFException unused) {
                th = null;
                i6 = -1;
                i7 = -1;
                j6 = 1000000;
            }
        } else {
            h5Var = f5Var.f4487o;
            ex0 ex0Var32 = f5Var.f4474a;
            if (h5Var != null) {
            }
            i8 = f5Var.f4486n;
            if (i8 != 0) {
            }
        }
        if (i6 == i7) {
            h5 h5Var2 = f5Var.f4487o;
            if (h5Var2 instanceof d5) {
                if (h5Var2.zza() != ((f5Var.f4483k * j6) / j1Var.f5899d) + f5Var.f4482j) {
                    throw th;
                }
            }
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f4478e = z0Var;
        s1 s1VarG = z0Var.g(0, 1);
        this.f4479f = s1VarG;
        this.f4480g = s1VarG;
        this.f4478e.d();
    }

    public final boolean g(y0 y0Var, boolean z6) throws EOFException {
        int iZze;
        int i6;
        int iE;
        y0Var.zzj();
        if (y0Var.zzf() == 0) {
            qh qhVarB = this.f4477d.b(y0Var, null);
            this.f4481i = qhVarB;
            if (qhVarB != null) {
                this.f4476c.a(qhVarB);
            }
            iZze = (int) y0Var.zze();
            if (!z6) {
                y0Var.b(iZze);
            }
            i6 = 0;
        } else {
            iZze = 0;
            i6 = 0;
        }
        int i7 = i6;
        int i8 = i7;
        while (true) {
            if (!b(y0Var)) {
                ex0 ex0Var = this.f4474a;
                ex0Var.j(0);
                int iQ = ex0Var.q();
                if ((i6 == 0 || ((-128000) & iQ) == (i6 & (-128000))) && (iE = fo.e(iQ)) != -1) {
                    i7++;
                    if (i7 != 1) {
                        if (i7 == 4) {
                            break;
                        }
                    } else {
                        this.f4475b.a(iQ);
                        i6 = iQ;
                    }
                    y0Var.a(iE - 4);
                } else {
                    int i9 = i8 + 1;
                    if (i8 == (true != z6 ? 131072 : 32768)) {
                        if (z6) {
                            return false;
                        }
                        a();
                        throw new EOFException();
                    }
                    if (z6) {
                        y0Var.zzj();
                        y0Var.a(iZze + i9);
                    } else {
                        y0Var.b(1);
                    }
                    i6 = 0;
                    i8 = i9;
                    i7 = 0;
                }
            } else if (i7 <= 0) {
                a();
                throw new EOFException();
            }
        }
        if (z6) {
            y0Var.b(iZze + i8);
        } else {
            y0Var.zzj();
        }
        this.h = i6;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }

    public f5(int i6) {
        this.f4474a = new ex0(10);
        this.f4475b = new j1();
        this.f4476c = new g1();
        this.f4482j = -9223372036854775807L;
        this.f4477d = new xj0(1);
        this.f4480g = new t0();
        this.f4485m = -1L;
    }
}
