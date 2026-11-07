package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c6 implements x0, m1 {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public final z6 f3414a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3415b;

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f3416c;

    /* renamed from: d, reason: collision with root package name */
    public final ex0 f3417d;

    /* renamed from: e, reason: collision with root package name */
    public final ex0 f3418e;

    /* renamed from: f, reason: collision with root package name */
    public final ex0 f3419f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3420g;
    public final e6 h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3421i;

    /* renamed from: j, reason: collision with root package name */
    public cp1 f3422j;

    /* renamed from: k, reason: collision with root package name */
    public int f3423k;

    /* renamed from: l, reason: collision with root package name */
    public int f3424l;

    /* renamed from: m, reason: collision with root package name */
    public long f3425m;

    /* renamed from: n, reason: collision with root package name */
    public int f3426n;

    /* renamed from: o, reason: collision with root package name */
    public ex0 f3427o;

    /* renamed from: p, reason: collision with root package name */
    public int f3428p;

    /* renamed from: q, reason: collision with root package name */
    public int f3429q;

    /* renamed from: r, reason: collision with root package name */
    public int f3430r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3431t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3432u;

    /* renamed from: v, reason: collision with root package name */
    public z0 f3433v;

    /* renamed from: w, reason: collision with root package name */
    public b6[] f3434w;

    /* renamed from: x, reason: collision with root package name */
    public long[][] f3435x;

    /* renamed from: y, reason: collision with root package name */
    public int f3436y;

    /* renamed from: z, reason: collision with root package name */
    public long f3437z;

    @Deprecated
    public c6() {
        this(z6.f11190i, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6 A[EDGE_INSN: B:74:0x00e6->B:66:0x00e6 BREAK  A[LOOP:1: B:32:0x006a->B:65:0x00e1], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k1 b(long j6) {
        long j7;
        long j8;
        long j9;
        int i6;
        b6[] b6VarArr;
        long jMin;
        int i7;
        int iA;
        long j10;
        int iA2;
        b6[] b6VarArr2 = this.f3434w;
        int length = b6VarArr2.length;
        n1 n1Var = n1.f7276c;
        if (length == 0) {
            return new k1(n1Var, n1Var);
        }
        int i8 = this.f3436y;
        boolean z6 = false;
        int i9 = -1;
        long j11 = -1;
        if (i8 != -1) {
            i6 i6Var = b6VarArr2[i8].f2931b;
            long[] jArr = i6Var.f5573f;
            int iJ = j31.j(jArr, j6, false);
            while (true) {
                if (iJ < 0) {
                    iJ = -1;
                    break;
                }
                if ((i6Var.f5574g[iJ] & 1) != 0) {
                    break;
                }
                iJ--;
            }
            if (iJ == -1) {
                iJ = i6Var.a(j6);
            }
            long[] jArr2 = i6Var.f5570c;
            if (iJ == -1) {
                return new k1(n1Var, n1Var);
            }
            j8 = jArr[iJ];
            j7 = jArr2[iJ];
            if (j8 < j6 && iJ < i6Var.f5569b - 1 && (iA2 = i6Var.a(j6)) != -1 && iA2 != iJ) {
                j9 = jArr[iA2];
                j11 = jArr2[iA2];
            }
            i6 = 0;
            long jMin2 = j7;
            while (true) {
                b6VarArr = this.f3434w;
                if (i6 < b6VarArr.length) {
                    break;
                }
                if (i6 != this.f3436y) {
                    i6 i6Var2 = b6VarArr[i6].f2931b;
                    long[] jArr3 = i6Var2.f5570c;
                    int[] iArr = i6Var2.f5574g;
                    long[] jArr4 = i6Var2.f5573f;
                    int iJ2 = j31.j(jArr4, j8, z6);
                    while (true) {
                        if (iJ2 < 0) {
                            iA = i9;
                            break;
                        }
                        if ((iArr[iJ2] & 1) != 0) {
                            iA = iJ2;
                            break;
                        }
                        iJ2--;
                    }
                    if (iA == i9) {
                        iA = i6Var2.a(j8);
                    }
                    if (iA == i9) {
                        j10 = j11;
                    } else {
                        j10 = j11;
                        jMin2 = Math.min(jArr3[iA], jMin2);
                    }
                    if (j9 != -9223372036854775807L) {
                        z6 = false;
                        int iJ3 = j31.j(jArr4, j9, false);
                        while (true) {
                            if (iJ3 < 0) {
                                iJ3 = -1;
                                break;
                            }
                            if ((iArr[iJ3] & 1) != 0) {
                                break;
                            }
                            iJ3--;
                        }
                        i7 = -1;
                        if (iJ3 == -1) {
                            iJ3 = i6Var2.a(j9);
                        }
                        jMin = iJ3 == -1 ? j10 : Math.min(jArr3[iJ3], j10);
                    } else {
                        jMin = j10;
                        z6 = false;
                        i7 = -1;
                    }
                } else {
                    jMin = j11;
                    i7 = i9;
                }
                i6++;
                i9 = i7;
                j11 = jMin;
            }
            long j12 = j11;
            n1 n1Var2 = new n1(j8, jMin2);
            return j9 != -9223372036854775807L ? new k1(n1Var2, n1Var2) : new k1(n1Var2, new n1(j9, j12));
        }
        j7 = Long.MAX_VALUE;
        j8 = j6;
        j9 = -9223372036854775807L;
        i6 = 0;
        long jMin22 = j7;
        while (true) {
            b6VarArr = this.f3434w;
            if (i6 < b6VarArr.length) {
            }
            i6++;
            i9 = i7;
            j11 = jMin;
        }
        long j122 = j11;
        n1 n1Var22 = new n1(j8, jMin22);
        if (j9 != -9223372036854775807L) {
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.f3420g.clear();
        this.f3426n = 0;
        this.f3428p = -1;
        this.f3429q = 0;
        this.f3430r = 0;
        this.s = 0;
        this.f3431t = true;
        if (j6 == 0) {
            if (this.f3423k != 3) {
                g();
                return;
            }
            e6 e6Var = this.h;
            e6Var.f4129a.clear();
            e6Var.f4130b = 0;
            this.f3421i.clear();
            return;
        }
        for (b6 b6Var : this.f3434w) {
            i6 i6Var = b6Var.f2931b;
            int iJ = j31.j(i6Var.f5573f, j7, false);
            while (true) {
                if (iJ < 0) {
                    iJ = -1;
                    break;
                } else if ((i6Var.f5574g[iJ] & 1) != 0) {
                    break;
                } else {
                    iJ--;
                }
            }
            if (iJ == -1) {
                iJ = i6Var.a(j7);
            }
            b6Var.f2934e = iJ;
            t1 t1Var = b6Var.f2933d;
            if (t1Var != null) {
                t1Var.f9059b = false;
                t1Var.f9060c = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) {
        cp1 cp1VarN;
        q1 q1VarM = f0.m(y0Var, false, false);
        if (q1VarM != null) {
            cp1VarN = bo1.n(q1VarM);
        } else {
            zn1 zn1Var = bo1.f3236t;
            cp1VarN = cp1.f3636w;
        }
        this.f3422j = cp1VarN;
        return q1VarM == null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v51 */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws rn {
        long j6;
        int i6;
        char c7;
        ?? r7;
        int i7;
        int i8;
        char c8;
        boolean z6;
        while (true) {
            int i9 = this.f3423k;
            ArrayDeque arrayDeque = this.f3420g;
            ex0 ex0Var = this.f3418e;
            int i10 = 4;
            if (i9 == 0) {
                int i11 = this.f3426n;
                ex0 ex0Var2 = this.f3419f;
                if (i11 == 0) {
                    if (!y0Var.f(ex0Var2.f4416a, 0, 8, true)) {
                        return -1;
                    }
                    this.f3426n = 8;
                    ex0Var2.j(0);
                    this.f3425m = ex0Var2.D();
                    this.f3424l = ex0Var2.q();
                }
                long j7 = this.f3425m;
                if (j7 == 1) {
                    y0Var.i(8, 8, ex0Var2.f4416a);
                    this.f3426n += 8;
                    this.f3425m = ex0Var2.E();
                } else if (j7 == 0) {
                    long jZzd = y0Var.zzd();
                    if (jZzd == -1) {
                        s51 s51Var = (s51) arrayDeque.peek();
                        jZzd = s51Var != null ? s51Var.f8798b : -1L;
                    }
                    if (jZzd != -1) {
                        this.f3425m = (jZzd - y0Var.zzf()) + this.f3426n;
                    }
                }
                long j8 = this.f3425m;
                int i12 = this.f3426n;
                if (j8 < i12) {
                    throw rn.b("Atom size less than header length (unsupported).");
                }
                int i13 = this.f3424l;
                if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473 || i13 == 1701082724) {
                    long jZzf = y0Var.zzf();
                    long j9 = this.f3425m;
                    long j10 = jZzf + j9;
                    long j11 = this.f3426n;
                    if (j9 != j11 && this.f3424l == 1835365473) {
                        ex0Var.g(8);
                        y0Var.h(0, 8, ex0Var.f4416a);
                        byte[] bArr = s5.f8792a;
                        int i14 = ex0Var.f4417b;
                        ex0Var.k(4);
                        if (ex0Var.q() != 1751411826) {
                            i14 += 4;
                        }
                        ex0Var.j(i14);
                        y0Var.b(ex0Var.f4417b);
                        y0Var.zzj();
                    }
                    long j12 = j10 - j11;
                    arrayDeque.push(new s51(this.f3424l, j12));
                    if (this.f3425m == this.f3426n) {
                        h(j12);
                    } else {
                        g();
                    }
                } else if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                    y5.r(i12 == 8);
                    y5.r(this.f3425m <= 2147483647L);
                    ex0 ex0Var3 = new ex0((int) this.f3425m);
                    System.arraycopy(ex0Var2.f4416a, 0, ex0Var3.f4416a, 0, 8);
                    this.f3427o = ex0Var3;
                    this.f3423k = 1;
                } else {
                    long jZzf2 = y0Var.zzf();
                    long j13 = this.f3426n;
                    long j14 = jZzf2 - j13;
                    if (this.f3424l == 1836086884) {
                        new m4(0L, j14, -9223372036854775807L, j14 + j13, this.f3425m - j13);
                    }
                    this.f3427o = null;
                    this.f3423k = 1;
                }
            } else {
                if (i9 != 1) {
                    if (i9 != 2) {
                        e6 e6Var = this.h;
                        ArrayList arrayList = e6Var.f4129a;
                        int i15 = e6Var.f4130b;
                        if (i15 != 0) {
                            if (i15 != 1) {
                                char c9 = 2820;
                                int i16 = 8;
                                short s = 2817;
                                short s3 = 2816;
                                short s4 = 2192;
                                if (i15 != 2) {
                                    long jZzf3 = y0Var.zzf();
                                    int iZzd = (int) ((y0Var.zzd() - y0Var.zzf()) - e6Var.f4131c);
                                    ex0 ex0Var4 = new ex0(iZzd);
                                    y0Var.i(0, iZzd, ex0Var4.f4416a);
                                    int i17 = 0;
                                    while (i17 < arrayList.size()) {
                                        d6 d6Var = (d6) arrayList.get(i17);
                                        ex0Var4.j((int) (d6Var.f3768a - jZzf3));
                                        ex0Var4.k(i10);
                                        int iR = ex0Var4.r();
                                        Charset charset = StandardCharsets.UTF_8;
                                        String strB = ex0Var4.b(iR, charset);
                                        switch (strB.hashCode()) {
                                            case -1711564334:
                                                i8 = i10;
                                                if (!strB.equals("SlowMotion_Data")) {
                                                    break;
                                                } else {
                                                    c8 = 2192;
                                                    int i18 = d6Var.f3769b - (iR + 8);
                                                    if (c8 == 2192) {
                                                        ArrayList arrayList2 = new ArrayList();
                                                        List listB = e6.f4128e.b(ex0Var4.b(i18, charset));
                                                        for (int i19 = 0; i19 < listB.size(); i19++) {
                                                            List listB2 = e6.f4127d.b((CharSequence) listB.get(i19));
                                                            if (listB2.size() != 3) {
                                                                throw rn.a(null, null);
                                                            }
                                                            try {
                                                                arrayList2.add(new p4(1 << (Integer.parseInt((String) listB2.get(2)) - 1), Long.parseLong((String) listB2.get(0)), Long.parseLong((String) listB2.get(1))));
                                                            } catch (NumberFormatException e6) {
                                                                throw rn.a(e6, null);
                                                            }
                                                        }
                                                        this.f3421i.add(new q4(arrayList2));
                                                    } else if (c8 != 2816 && c8 != 2817 && c8 != 2819 && c8 != c9) {
                                                        throw new IllegalStateException();
                                                    }
                                                    i17++;
                                                    i10 = i8;
                                                    c9 = 2820;
                                                }
                                                break;
                                            case -1332107749:
                                                i8 = i10;
                                                if (!strB.equals("Super_SlowMotion_Edit_Data")) {
                                                    break;
                                                } else {
                                                    c8 = 2819;
                                                    int i182 = d6Var.f3769b - (iR + 8);
                                                    if (c8 == 2192) {
                                                    }
                                                    i17++;
                                                    i10 = i8;
                                                    c9 = 2820;
                                                }
                                                break;
                                            case -1251387154:
                                                i8 = i10;
                                                if (!strB.equals("Super_SlowMotion_Data")) {
                                                    break;
                                                } else {
                                                    c8 = 2816;
                                                    int i1822 = d6Var.f3769b - (iR + 8);
                                                    if (c8 == 2192) {
                                                    }
                                                    i17++;
                                                    i10 = i8;
                                                    c9 = 2820;
                                                }
                                                break;
                                            case -830665521:
                                                i8 = i10;
                                                if (!strB.equals("Super_SlowMotion_Deflickering_On")) {
                                                    break;
                                                } else {
                                                    c8 = c9;
                                                    int i18222 = d6Var.f3769b - (iR + 8);
                                                    if (c8 == 2192) {
                                                    }
                                                    i17++;
                                                    i10 = i8;
                                                    c9 = 2820;
                                                }
                                                break;
                                            case 1760745220:
                                                i8 = i10;
                                                if (!strB.equals("Super_SlowMotion_BGM")) {
                                                    break;
                                                } else {
                                                    c8 = 2817;
                                                    int i182222 = d6Var.f3769b - (iR + 8);
                                                    if (c8 == 2192) {
                                                    }
                                                    i17++;
                                                    i10 = i8;
                                                    c9 = 2820;
                                                }
                                                break;
                                        }
                                        throw rn.a(null, "Invalid SEF name");
                                    }
                                    b1Var.f2886a = 0L;
                                    i7 = 1;
                                } else {
                                    long jZzd2 = y0Var.zzd();
                                    int i20 = e6Var.f4131c - 20;
                                    ex0 ex0Var5 = new ex0(i20);
                                    y0Var.i(0, i20, ex0Var5.f4416a);
                                    int i21 = 0;
                                    while (i21 < i20 / 12) {
                                        ex0Var5.k(2);
                                        byte[] bArr2 = ex0Var5.f4416a;
                                        int i22 = ex0Var5.f4417b;
                                        int i23 = i22 + 1;
                                        ex0Var5.f4417b = i23;
                                        int i24 = bArr2[i22] & 255;
                                        ex0Var5.f4417b = i22 + 2;
                                        short s6 = (short) (((bArr2[i23] & 255) << 8) | i24);
                                        if (s6 != s4 && s6 != s3 && s6 != s) {
                                            if (s6 != 2819 && s6 != 2820) {
                                                ex0Var5.k(i16);
                                            }
                                            i21++;
                                            s4 = 2192;
                                            s = 2817;
                                            s3 = 2816;
                                            i16 = 8;
                                        }
                                        arrayList.add(new d6(ex0Var5.r(), (jZzd2 - e6Var.f4131c) - ex0Var5.r()));
                                        i21++;
                                        s4 = 2192;
                                        s = 2817;
                                        s3 = 2816;
                                        i16 = 8;
                                    }
                                    if (arrayList.isEmpty()) {
                                        b1Var.f2886a = 0L;
                                    } else {
                                        e6Var.f4130b = 3;
                                        b1Var.f2886a = ((d6) arrayList.get(0)).f3768a;
                                    }
                                }
                            } else {
                                ex0 ex0Var6 = new ex0(8);
                                y0Var.i(0, 8, ex0Var6.f4416a);
                                e6Var.f4131c = ex0Var6.r() + 8;
                                if (ex0Var6.q() != 1397048916) {
                                    b1Var.f2886a = 0L;
                                } else {
                                    b1Var.f2886a = y0Var.zzf() - (e6Var.f4131c - 12);
                                    e6Var.f4130b = 2;
                                }
                            }
                            i7 = 1;
                        } else {
                            long jZzd3 = y0Var.zzd();
                            b1Var.f2886a = (jZzd3 == -1 || jZzd3 < 8) ? 0L : jZzd3 - 8;
                            i7 = 1;
                            e6Var.f4130b = 1;
                        }
                        if (b1Var.f2886a != 0) {
                            return i7;
                        }
                        g();
                        return i7;
                    }
                    int i25 = 4;
                    long jZzf4 = y0Var.zzf();
                    int i26 = this.f3428p;
                    if (i26 == -1) {
                        int i27 = -1;
                        int i28 = -1;
                        int i29 = 0;
                        boolean z7 = true;
                        boolean z8 = true;
                        long j15 = Long.MAX_VALUE;
                        long j16 = Long.MAX_VALUE;
                        long j17 = Long.MAX_VALUE;
                        while (true) {
                            b6[] b6VarArr = this.f3434w;
                            if (i29 >= b6VarArr.length) {
                                break;
                            }
                            b6 b6Var = b6VarArr[i29];
                            int i30 = b6Var.f2934e;
                            i6 i6Var = b6Var.f2931b;
                            long j18 = jZzf4;
                            if (i30 != i6Var.f5569b) {
                                long j19 = i6Var.f5570c[i30];
                                long[][] jArr = this.f3435x;
                                int i31 = j31.f5914a;
                                long j20 = jArr[i29][i30];
                                long j21 = j19 - j18;
                                boolean z9 = j21 < 0 || j21 >= 262144;
                                if (z9) {
                                    if (z9 == z7 && j21 < j17) {
                                        z7 = z9;
                                        j17 = j21;
                                        i28 = i29;
                                        j16 = j20;
                                    }
                                    if (j20 < j15) {
                                        z8 = z9;
                                        i27 = i29;
                                        j15 = j20;
                                    }
                                } else {
                                    if (!z7) {
                                        z7 = false;
                                        if (z9 == z7) {
                                        }
                                        if (j20 < j15) {
                                        }
                                    }
                                    z7 = z9;
                                    j17 = j21;
                                    i28 = i29;
                                    j16 = j20;
                                    if (j20 < j15) {
                                    }
                                }
                            }
                            i29++;
                            jZzf4 = j18;
                        }
                        j6 = jZzf4;
                        i26 = (j15 == Long.MAX_VALUE || !z8 || j16 < j15 + 10485760) ? i28 : i27;
                        this.f3428p = i26;
                        if (i26 == -1) {
                            return -1;
                        }
                    } else {
                        j6 = jZzf4;
                    }
                    b6 b6Var2 = this.f3434w[i26];
                    s1 s1Var = b6Var2.f2932c;
                    f6 f6Var = b6Var2.f2930a;
                    i6 i6Var2 = b6Var2.f2931b;
                    int i32 = b6Var2.f2934e;
                    long j22 = i6Var2.f5570c[i32];
                    int i33 = i6Var2.f5571d[i32];
                    t1 t1Var = b6Var2.f2933d;
                    long j23 = (j22 - j6) + this.f3429q;
                    if (j23 < 0 || j23 >= 262144) {
                        b1Var.f2886a = j22;
                        return 1;
                    }
                    int i34 = f6Var.h;
                    w wVar = f6Var.f4497g;
                    if (i34 == 1) {
                        j23 += 8;
                        i6 = i33 - 8;
                    } else {
                        i6 = i33;
                    }
                    y0Var.b((int) j23);
                    if (Objects.equals(wVar.f9978m, "video/avc")) {
                        c7 = 1;
                    } else {
                        c7 = 1;
                        this.f3431t = true;
                    }
                    int i35 = f6Var.f4500k;
                    if (i35 == 0) {
                        if ("audio/ac4".equals(wVar.f9978m)) {
                            if (this.f3430r == 0) {
                                f0.j(i6, ex0Var);
                                s1Var.e(7, ex0Var);
                                this.f3430r += 7;
                            }
                            i6 += 7;
                        } else if (t1Var != null) {
                            t1Var.c(y0Var);
                        }
                        while (true) {
                            int i36 = this.f3430r;
                            if (i36 >= i6) {
                                break;
                            }
                            int iD = s1Var.d(y0Var, i6 - i36, false);
                            this.f3429q += iD;
                            this.f3430r += iD;
                            this.s -= iD;
                        }
                    } else {
                        ex0 ex0Var7 = this.f3417d;
                        byte[] bArr3 = ex0Var7.f4416a;
                        bArr3[0] = 0;
                        bArr3[c7] = 0;
                        bArr3[2] = 0;
                        int i37 = i35 + 1;
                        int i38 = 4 - i35;
                        while (this.f3430r < i6) {
                            int i39 = this.s;
                            if (i39 == 0) {
                                y0Var.i(i38, i37, bArr3);
                                this.f3429q += i37;
                                ex0Var7.j(0);
                                int iQ = ex0Var7.q();
                                if (iQ <= 0) {
                                    throw rn.a(null, "Invalid NAL length");
                                }
                                this.s = iQ - 1;
                                ex0 ex0Var8 = this.f3416c;
                                ex0Var8.j(0);
                                int i40 = i25;
                                s1Var.e(i40, ex0Var8);
                                s1Var.e(1, ex0Var7);
                                this.f3430r += 5;
                                i6 += i38;
                                if (!this.f3431t && uf1.g(bArr3[i40])) {
                                    this.f3431t = true;
                                }
                            } else {
                                int iD2 = s1Var.d(y0Var, i39, false);
                                this.f3429q += iD2;
                                this.f3430r += iD2;
                                this.s -= iD2;
                            }
                            i25 = 4;
                        }
                    }
                    int i41 = i6;
                    long j24 = i6Var2.f5573f[i32];
                    int i42 = i6Var2.f5574g[i32];
                    if (!this.f3431t) {
                        i42 |= 67108864;
                    }
                    int i43 = i42;
                    if (t1Var != null) {
                        t1Var.b(s1Var, j24, i43, i41, 0, null);
                        r7 = 1;
                        r7 = 1;
                        if (i32 + 1 == i6Var2.f5569b) {
                            t1Var.a(s1Var, null);
                        }
                    } else {
                        r7 = 1;
                        s1Var.a(j24, i43, i41, 0, null);
                    }
                    b6Var2.f2934e += r7;
                    this.f3428p = -1;
                    this.f3429q = 0;
                    this.f3430r = 0;
                    this.s = 0;
                    this.f3431t = r7;
                    return 0;
                }
                long j25 = this.f3425m - this.f3426n;
                long jZzf5 = y0Var.zzf() + j25;
                ex0 ex0Var9 = this.f3427o;
                if (ex0Var9 != null) {
                    y0Var.i(this.f3426n, (int) j25, ex0Var9.f4416a);
                    if (this.f3424l == 1718909296) {
                        this.f3432u = true;
                        ex0Var9.j(8);
                        int iQ2 = ex0Var9.q();
                        int i44 = iQ2 != 1751476579 ? iQ2 != 1903435808 ? 0 : 1 : 2;
                        if (i44 == 0) {
                            ex0Var9.k(4);
                            while (true) {
                                if (ex0Var9.o() <= 0) {
                                    i44 = 0;
                                    break;
                                }
                                int iQ3 = ex0Var9.q();
                                i44 = iQ3 != 1751476579 ? iQ3 != 1903435808 ? 0 : 1 : 2;
                                if (i44 != 0) {
                                    break;
                                }
                            }
                        }
                        this.A = i44;
                    } else if (!arrayDeque.isEmpty()) {
                        ((s51) arrayDeque.peek()).f8799c.add(new j61(this.f3424l, ex0Var9));
                    }
                } else {
                    if (!this.f3432u && this.f3424l == 1835295092) {
                        this.A = 1;
                    }
                    if (j25 < 262144) {
                        y0Var.b((int) j25);
                    } else {
                        b1Var.f2886a = y0Var.zzf() + j25;
                        z6 = true;
                        h(jZzf5);
                        if (z6 && this.f3423k != 2) {
                            return 1;
                        }
                    }
                }
                z6 = false;
                h(jZzf5);
                if (z6) {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        if ((this.f3415b & 16) == 0) {
            z0Var = new b7(z0Var, this.f3414a);
        }
        this.f3433v = z0Var;
    }

    public final void g() {
        this.f3423k = 0;
        this.f3426n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0230, code lost:
    
        r13 = r10;
        r10 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        r13 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x023a, code lost:
    
        if (r10 != 14) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023c, code lost:
    
        r10 = "image/png";
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x023f, code lost:
    
        r13 = r10;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0241, code lost:
    
        if (r10 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0243, code lost:
    
        com.google.android.gms.internal.ads.qs0.f("MetadataUtil", "Unrecognized cover art flags: " + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0253, code lost:
    
        r6.k(4);
        r0 = r0 - 16;
        r3 = new byte[r0];
        r6.f(0, r0, r3);
        r13 = 3;
        r3 = new com.google.android.gms.internal.ads.m3(r10, null, 3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x026a, code lost:
    
        r13 = 3;
        com.google.android.gms.internal.ads.qs0.f("MetadataUtil", "Failed to parse cover art attribute");
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0273, code lost:
    
        r13 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0278, code lost:
    
        if (r15 != 1631670868) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027a, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(1631670868, "TPE2", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0284, code lost:
    
        if (r15 != 1936682605) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0286, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(1936682605, "TSOT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0290, code lost:
    
        if (r15 != 1936679276) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0292, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(1936679276, "TSOA", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029c, code lost:
    
        if (r15 != 1936679282) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x029e, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(1936679282, "TSOP", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a8, code lost:
    
        if (r15 != 1936679265) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02aa, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(1936679265, "TSO2", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b4, code lost:
    
        if (r15 != 1936679791) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b6, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(1936679791, "TSOC", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c0, code lost:
    
        if (r15 != 1920233063) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c2, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.b(1920233063, "ITUNESADVISORY", r6, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ce, code lost:
    
        if (r15 != 1885823344) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d0, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.b(1885823344, "ITUNESGAPLESS", r6, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02db, code lost:
    
        if (r15 != 1936683886) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02dd, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(1936683886, "TVSHOWSORT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e7, code lost:
    
        if (r15 != 1953919848) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e9, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(1953919848, "TVSHOW", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f4, code lost:
    
        if (r15 != 757935405) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f6, code lost:
    
        r0 = null;
        r10 = null;
        r3 = r17;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02fb, code lost:
    
        r15 = r6.f4417b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02fd, code lost:
    
        if (r15 >= r7) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ff, code lost:
    
        r21 = r6.q();
        r12 = r6.q();
        r6.k(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x030e, code lost:
    
        if (r12 != 1835360622) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0310, code lost:
    
        r10 = r6.a(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0319, code lost:
    
        r13 = r21 - 12;
        r35 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0320, code lost:
    
        if (r12 != 1851878757) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0322, code lost:
    
        r0 = r6.a(r13);
        r14 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x032c, code lost:
    
        if (r12 != 1684108385) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x032f, code lost:
    
        r21 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0331, code lost:
    
        if (r12 != 1684108385) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0333, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0334, code lost:
    
        r6.k(r13);
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x033a, code lost:
    
        r35 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x033c, code lost:
    
        if (r10 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033e, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0342, code lost:
    
        if (r3 != r17) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0346, code lost:
    
        r6.j(r3);
        r6.k(16);
        r3 = new com.google.android.gms.internal.ads.c4(r10, r0, r6.a(r35 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0362, code lost:
    
        r10 = r15 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0367, code lost:
    
        if (r10 != 6516084) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0369, code lost:
    
        r10 = r6.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0374, code lost:
    
        if (r6.q() != 1684108385) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0376, code lost:
    
        r6.k(8);
        r3 = r6.a(r10 - 16);
        r3 = new com.google.android.gms.internal.ads.u3("und", r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x038d, code lost:
    
        com.google.android.gms.internal.ads.qs0.f("MetadataUtil", "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.v61.a(r15)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x039c, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a5, code lost:
    
        if (r10 == 7233901) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03aa, code lost:
    
        if (r10 != 7631467) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b1, code lost:
    
        if (r10 == 6516589) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03b6, code lost:
    
        if (r10 != 7828084) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03bd, code lost:
    
        if (r10 != 6578553) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03bf, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(r15, "TDRC", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ca, code lost:
    
        if (r10 != 4280916) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03cc, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(r15, "TPE1", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03d6, code lost:
    
        if (r10 != 7630703) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d8, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(r15, "TSSE", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03e2, code lost:
    
        if (r10 != 6384738) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03e4, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(r15, "TALB", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03ee, code lost:
    
        if (r10 != 7108978) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03f0, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(r15, "USLT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03fa, code lost:
    
        if (r10 != 6776174) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03fc, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(r15, "TCON", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0404, code lost:
    
        if (r10 != 6779504) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0406, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(r15, "TIT1", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x040d, code lost:
    
        com.google.android.gms.internal.ads.qs0.b("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.gms.internal.ads.v61.a(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0422, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(r15, "TCOM", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0429, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.d(r15, "TIT2", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0432, code lost:
    
        if (r3 == null) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0434, code lost:
    
        r2.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0437, code lost:
    
        r0 = r30;
        r10 = r31;
        r13 = r33;
        r3 = r34;
        r17 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0449, code lost:
    
        r6.j(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x044c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x044d, code lost:
    
        r30 = r0;
        r34 = r3;
        r31 = r10;
        r33 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x045d, code lost:
    
        if (r2.isEmpty() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x045f, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0461, code lost:
    
        r10 = new com.google.android.gms.internal.ads.qh(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017a, code lost:
    
        r6.j(r7);
        r6.k(r12);
        r2 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0185, code lost:
    
        r7 = r6.f4417b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
    
        if (r7 >= r9) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0189, code lost:
    
        r7 = r6.q() + r7;
        r15 = r6.q();
        r30 = r0;
        r0 = (r15 >> 24) & 255;
        r31 = r10;
        r33 = r13;
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ac, code lost:
    
        if (r0 == 169) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b0, code lost:
    
        if (r0 != 253) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b8, code lost:
    
        if (r15 != 1735291493) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ba, code lost:
    
        r0 = com.google.android.gms.internal.ads.a4.a(com.google.android.gms.internal.ads.z5.a(r6) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c4, code lost:
    
        if (r0 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c6, code lost:
    
        r3 = new com.google.android.gms.internal.ads.i4("TCON", null, com.google.android.gms.internal.ads.bo1.n(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d9, code lost:
    
        com.google.android.gms.internal.ads.qs0.f("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01de, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e4, code lost:
    
        if (r15 != 1684632427) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e6, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.c(1684632427, "TPOS", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f0, code lost:
    
        if (r15 != 1953655662) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f2, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.c(1953655662, "TRCK", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01fc, code lost:
    
        if (r15 != 1953329263) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01fe, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.b(1953329263, "TBPM", r6, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020b, code lost:
    
        if (r15 != 1668311404) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020d, code lost:
    
        r3 = com.google.android.gms.internal.ads.z5.b(1668311404, "TCMP", r6, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0217, code lost:
    
        if (r15 != 1668249202) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0219, code lost:
    
        r0 = r6.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0224, code lost:
    
        if (r6.q() != 1684108385) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0226, code lost:
    
        r10 = r6.q() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022e, code lost:
    
        if (r10 != 13) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0795 A[LOOP:13: B:354:0x0792->B:356:0x0795, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j6) {
        int i6;
        j61 j61VarC;
        ArrayDeque arrayDeque;
        qh qhVar;
        boolean z6;
        ArrayList arrayList;
        char c7;
        qh qhVar2;
        ArrayList arrayListD;
        int i7;
        b6[] b6VarArr;
        int i8;
        int i9;
        ArrayList arrayList2;
        int i10;
        qh qhVar3;
        char c8;
        ArrayList arrayList3;
        int i11;
        int i12;
        int i13;
        ArrayDeque arrayDeque2;
        qh qhVar4;
        boolean z7;
        ArrayList arrayList4;
        qh qhVar5;
        qh qhVarM;
        qh qhVar6;
        int iW;
        qh qhVar7;
        d51 d51Var;
        while (true) {
            ArrayDeque arrayDeque3 = this.f3420g;
            if (arrayDeque3.isEmpty() || ((s51) arrayDeque3.peek()).f8798b != j6) {
                break;
            }
            s51 s51Var = (s51) arrayDeque3.pop();
            if (s51Var.f9732a == 1836019574) {
                int i14 = 1835365473;
                s51 s51VarB = s51Var.b(1835365473);
                new ArrayList();
                int i15 = 1684108385;
                int i16 = 8;
                if (s51VarB != null) {
                    byte[] bArr = s5.f8792a;
                    j61 j61VarC2 = s51VarB.c(1751411826);
                    i6 = -1;
                    j61 j61VarC3 = s51VarB.c(1801812339);
                    j61 j61VarC4 = s51VarB.c(1768715124);
                    if (j61VarC2 != null && j61VarC3 != null && j61VarC4 != null) {
                        ex0 ex0Var = j61VarC2.f5954b;
                        ex0Var.j(16);
                        if (ex0Var.q() == 1835299937) {
                            ex0 ex0Var2 = j61VarC3.f5954b;
                            ex0Var2.j(12);
                            int iQ = ex0Var2.q();
                            String[] strArr = new String[iQ];
                            for (int i17 = 0; i17 < iQ; i17++) {
                                int iQ2 = ex0Var2.q();
                                ex0Var2.k(4);
                                strArr[i17] = ex0Var2.b(iQ2 - 8, StandardCharsets.UTF_8);
                            }
                            ex0 ex0Var3 = j61VarC4.f5954b;
                            ex0Var3.j(8);
                            ArrayList arrayList5 = new ArrayList();
                            while (ex0Var3.o() > 8) {
                                int iQ3 = ex0Var3.q() + ex0Var3.f4417b;
                                int iQ4 = ex0Var3.q() - 1;
                                if (iQ4 < 0 || iQ4 >= iQ) {
                                    androidx.activity.m.g(iQ4, "Skipped metadata with unknown key index: ", "BoxParsers");
                                } else {
                                    String str = strArr[iQ4];
                                    while (true) {
                                        int i18 = ex0Var3.f4417b;
                                        if (i18 >= iQ3) {
                                            d51Var = null;
                                            break;
                                        }
                                        int iQ5 = ex0Var3.q();
                                        if (ex0Var3.q() == i15) {
                                            int iQ6 = ex0Var3.q();
                                            int iQ7 = ex0Var3.q();
                                            int i19 = iQ5 - 16;
                                            byte[] bArr2 = new byte[i19];
                                            ex0Var3.f(0, i19, bArr2);
                                            d51Var = new d51(str, bArr2, iQ7, iQ6);
                                            break;
                                        }
                                        ex0Var3.j(i18 + iQ5);
                                        i15 = 1684108385;
                                    }
                                    if (d51Var != null) {
                                        arrayList5.add(d51Var);
                                    }
                                }
                                ex0Var3.j(iQ3);
                                i15 = 1684108385;
                            }
                            qh qhVar8 = arrayList5.isEmpty() ? null : new qh(arrayList5);
                            ArrayList arrayList6 = new ArrayList();
                            boolean z8 = this.A != 1;
                            g1 g1Var = new g1();
                            j61VarC = s51Var.c(1969517665);
                            if (j61VarC == null) {
                                byte[] bArr3 = s5.f8792a;
                                ex0 ex0Var4 = j61VarC.f5954b;
                                ex0Var4.j(8);
                                qh qhVar9 = new qh(-9223372036854775807L, new zg[0]);
                                while (ex0Var4.o() >= i16) {
                                    int i20 = ex0Var4.f4417b;
                                    int iQ8 = ex0Var4.q() + i20;
                                    int iQ9 = ex0Var4.q();
                                    if (iQ9 == i14) {
                                        ex0Var4.j(i20);
                                        ex0Var4.k(i16);
                                        int i21 = ex0Var4.f4417b;
                                        ex0Var4.k(4);
                                        if (ex0Var4.q() != 1751411826) {
                                            i21 += 4;
                                        }
                                        ex0Var4.j(i21);
                                        while (true) {
                                            int i22 = ex0Var4.f4417b;
                                            if (i22 >= iQ8) {
                                                arrayDeque2 = arrayDeque3;
                                                qhVar4 = qhVar8;
                                                z7 = z8;
                                                arrayList4 = arrayList6;
                                                break;
                                            }
                                            int iQ10 = ex0Var4.q() + i22;
                                            if (ex0Var4.q() == 1768715124) {
                                                break;
                                            }
                                            ex0Var4.j(iQ10);
                                            arrayDeque3 = arrayDeque3;
                                            i16 = 8;
                                            i6 = -1;
                                        }
                                        qhVar9 = qhVar9.m(qhVar7);
                                    } else {
                                        arrayDeque2 = arrayDeque3;
                                        qhVar4 = qhVar8;
                                        z7 = z8;
                                        arrayList4 = arrayList6;
                                        if (iQ9 == 1936553057) {
                                            ex0Var4.j(i20);
                                            ex0Var4.k(12);
                                            while (true) {
                                                int i23 = ex0Var4.f4417b;
                                                if (i23 >= iQ8) {
                                                    break;
                                                }
                                                int iQ11 = ex0Var4.q();
                                                if (ex0Var4.q() == 1935766900) {
                                                    if (iQ11 >= 16) {
                                                        ex0Var4.k(4);
                                                        int i24 = -1;
                                                        int i25 = 0;
                                                        for (int i26 = 0; i26 < 2; i26++) {
                                                            int iV = ex0Var4.v();
                                                            int iV2 = ex0Var4.v();
                                                            if (iV == 0) {
                                                                i24 = iV2;
                                                            } else if (iV == 1) {
                                                                i25 = iV2;
                                                            }
                                                        }
                                                        if (i24 == 12) {
                                                            iW = 240;
                                                        } else if (i24 == 13) {
                                                            iW = 120;
                                                        } else {
                                                            if (i24 == 21) {
                                                                if (ex0Var4.o() >= 8) {
                                                                    if (ex0Var4.f4417b + 8 <= iQ8) {
                                                                        int iQ12 = ex0Var4.q();
                                                                        int iQ13 = ex0Var4.q();
                                                                        if (iQ12 >= 12 && iQ13 == 1936877170) {
                                                                            iW = ex0Var4.w();
                                                                        }
                                                                        if (iW == -2147483647) {
                                                                            break;
                                                                        } else {
                                                                            qhVar6 = new qh(-9223372036854775807L, new t4(iW, i25));
                                                                        }
                                                                    }
                                                                }
                                                                iW = -2147483647;
                                                                if (iW == -2147483647) {
                                                                }
                                                            }
                                                            iW = -2147483647;
                                                        }
                                                        if (iW == -2147483647) {
                                                            break;
                                                        }
                                                    } else {
                                                        qhVar6 = null;
                                                    }
                                                } else {
                                                    ex0Var4.j(i23 + iQ11);
                                                }
                                            }
                                            qhVar6 = null;
                                            qhVarM = qhVar9.m(qhVar6);
                                        } else if (iQ9 == -1451722374) {
                                            short sD = ex0Var4.d();
                                            ex0Var4.k(2);
                                            String strB = ex0Var4.b(sD, StandardCharsets.UTF_8);
                                            int iMax = Math.max(strB.lastIndexOf(43), strB.lastIndexOf(45));
                                            try {
                                                qhVar5 = new qh(-9223372036854775807L, new h81(Float.parseFloat(strB.substring(0, iMax)), Float.parseFloat(strB.substring(iMax, strB.length() - 1))));
                                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                                qhVar5 = null;
                                            }
                                            qhVarM = qhVar9.m(qhVar5);
                                        }
                                        qhVar9 = qhVarM;
                                    }
                                    ex0Var4.j(iQ8);
                                    arrayDeque3 = arrayDeque2;
                                    z8 = z7;
                                    arrayList6 = arrayList4;
                                    qhVar8 = qhVar4;
                                    i14 = 1835365473;
                                    i16 = 8;
                                    i6 = -1;
                                }
                                arrayDeque = arrayDeque3;
                                qhVar = qhVar8;
                                z6 = z8;
                                arrayList = arrayList6;
                                c7 = 3;
                                g1Var.a(qhVar9);
                                qhVar2 = qhVar9;
                            } else {
                                arrayDeque = arrayDeque3;
                                qhVar = qhVar8;
                                z6 = z8;
                                arrayList = arrayList6;
                                c7 = 3;
                                qhVar2 = null;
                            }
                            j61 j61VarC5 = s51Var.c(1836476516);
                            j61VarC5.getClass();
                            long j7 = -9223372036854775807L;
                            qh qhVar10 = new qh(-9223372036854775807L, s5.b(j61VarC5.f5954b));
                            char c9 = c7;
                            arrayListD = s5.d(s51Var, g1Var, -9223372036854775807L, null, false, z6, new a6(0));
                            long j8 = -9223372036854775807L;
                            i7 = 0;
                            int i27 = 0;
                            int size = -1;
                            while (i7 < arrayListD.size()) {
                                i6 i6Var = (i6) arrayListD.get(i7);
                                int i28 = i6Var.f5569b;
                                int i29 = i6Var.f5572e;
                                if (i28 == 0) {
                                    arrayList2 = arrayListD;
                                    i10 = i7;
                                    c8 = c9;
                                    arrayList3 = arrayList;
                                    qhVar3 = qhVar;
                                } else {
                                    f6 f6Var = i6Var.f5568a;
                                    long j9 = j7;
                                    z0 z0Var = this.f3433v;
                                    int i30 = i27 + 1;
                                    arrayList2 = arrayListD;
                                    int i31 = f6Var.f4492b;
                                    i10 = i7;
                                    w wVar = f6Var.f4497g;
                                    s1 s1VarG = z0Var.g(i27, i31);
                                    b6 b6Var = new b6(f6Var, i6Var, s1VarG);
                                    long j10 = f6Var.f4495e;
                                    if (j10 == j9) {
                                        j10 = i6Var.h;
                                    }
                                    s1VarG.getClass();
                                    long jMax = Math.max(j8, j10);
                                    int i32 = "audio/true-hd".equals(wVar.f9978m) ? i29 * 16 : i29 + 30;
                                    tk2 tk2Var = new tk2(wVar);
                                    tk2Var.f9331m = i32;
                                    if (i31 == 2) {
                                        int i33 = wVar.f9972f;
                                        if ((this.f3415b & 8) != 0) {
                                            i33 |= size == -1 ? 1 : 2;
                                        }
                                        if (wVar.f9986v == -1.0f && j10 > 0 && (i13 = i6Var.f5569b) > 0) {
                                            tk2Var.f9338u = i13 / (j10 / 1000000.0f);
                                        }
                                        tk2Var.f9325f = i33;
                                    }
                                    if (i31 == 1 && (i11 = g1Var.f4863a) != -1 && (i12 = g1Var.f4864b) != -1) {
                                        tk2Var.D = i11;
                                        tk2Var.E = i12;
                                    }
                                    ArrayList arrayList7 = this.f3421i;
                                    qh[] qhVarArr = {arrayList7.isEmpty() ? null : new qh(arrayList7), qhVar2, qhVar10};
                                    qh qhVar11 = new qh(j9, new zg[0]);
                                    qhVar3 = qhVar;
                                    if (qhVar != null) {
                                        int i34 = 0;
                                        while (true) {
                                            zg[] zgVarArr = qhVar3.s;
                                            if (i34 >= zgVarArr.length) {
                                                break;
                                            }
                                            zg zgVar = zgVarArr[i34];
                                            if (zgVar instanceof d51) {
                                                d51 d51Var2 = (d51) zgVar;
                                                if (!d51Var2.s.equals("com.android.capture.fps")) {
                                                    qhVar11 = qhVar11.l(d51Var2);
                                                } else if (i31 == 2) {
                                                    qhVar11 = qhVar11.l(d51Var2);
                                                }
                                            }
                                            i34++;
                                        }
                                    }
                                    c8 = 3;
                                    for (int i35 = 0; i35 < 3; i35++) {
                                        qhVar11 = qhVar11.m(qhVarArr[i35]);
                                    }
                                    if (qhVar11.s.length > 0) {
                                        tk2Var.f9328j = qhVar11;
                                    }
                                    b6Var.f2932c.b(new w(tk2Var));
                                    if (i31 == 2 && size == -1) {
                                        size = arrayList.size();
                                    }
                                    arrayList3 = arrayList;
                                    arrayList3.add(b6Var);
                                    i27 = i30;
                                    j8 = jMax;
                                }
                                arrayList = arrayList3;
                                i7 = i10 + 1;
                                c9 = c8;
                                qhVar = qhVar3;
                                arrayListD = arrayList2;
                                j7 = -9223372036854775807L;
                            }
                            long j11 = 0;
                            this.f3436y = size;
                            this.f3437z = j8;
                            b6VarArr = (b6[]) arrayList.toArray(new b6[0]);
                            this.f3434w = b6VarArr;
                            int length = b6VarArr.length;
                            long[][] jArr = new long[length][];
                            int[] iArr = new int[length];
                            long[] jArr2 = new long[length];
                            boolean[] zArr = new boolean[length];
                            for (i8 = 0; i8 < b6VarArr.length; i8++) {
                                jArr[i8] = new long[b6VarArr[i8].f2931b.f5569b];
                                jArr2[i8] = b6VarArr[i8].f2931b.f5573f[0];
                            }
                            i9 = 0;
                            while (i9 < b6VarArr.length) {
                                long j12 = Long.MAX_VALUE;
                                int i36 = -1;
                                for (int i37 = 0; i37 < b6VarArr.length; i37++) {
                                    if (!zArr[i37]) {
                                        long j13 = jArr2[i37];
                                        if (j13 <= j12) {
                                            i36 = i37;
                                            j12 = j13;
                                        }
                                    }
                                }
                                int i38 = iArr[i36];
                                long[] jArr3 = jArr[i36];
                                jArr3[i38] = j11;
                                i6 i6Var2 = b6VarArr[i36].f2931b;
                                j11 += i6Var2.f5571d[i38];
                                int i39 = i38 + 1;
                                iArr[i36] = i39;
                                if (i39 < jArr3.length) {
                                    jArr2[i36] = i6Var2.f5573f[i39];
                                } else {
                                    zArr[i36] = true;
                                    i9++;
                                }
                            }
                            this.f3435x = jArr;
                            this.f3433v.d();
                            this.f3433v.f(this);
                            arrayDeque.clear();
                            this.f3423k = 2;
                        }
                    }
                } else {
                    i6 = -1;
                }
                ArrayList arrayList62 = new ArrayList();
                if (this.A != 1) {
                }
                g1 g1Var2 = new g1();
                j61VarC = s51Var.c(1969517665);
                if (j61VarC == null) {
                }
                j61 j61VarC52 = s51Var.c(1836476516);
                j61VarC52.getClass();
                long j72 = -9223372036854775807L;
                qh qhVar102 = new qh(-9223372036854775807L, s5.b(j61VarC52.f5954b));
                char c92 = c7;
                arrayListD = s5.d(s51Var, g1Var2, -9223372036854775807L, null, false, z6, new a6(0));
                long j82 = -9223372036854775807L;
                i7 = 0;
                int i272 = 0;
                int size2 = -1;
                while (i7 < arrayListD.size()) {
                }
                long j112 = 0;
                this.f3436y = size2;
                this.f3437z = j82;
                b6VarArr = (b6[]) arrayList.toArray(new b6[0]);
                this.f3434w = b6VarArr;
                int length2 = b6VarArr.length;
                long[][] jArr4 = new long[length2][];
                int[] iArr2 = new int[length2];
                long[] jArr22 = new long[length2];
                boolean[] zArr2 = new boolean[length2];
                while (i8 < b6VarArr.length) {
                }
                i9 = 0;
                while (i9 < b6VarArr.length) {
                }
                this.f3435x = jArr4;
                this.f3433v.d();
                this.f3433v.f(this);
                arrayDeque.clear();
                this.f3423k = 2;
            } else if (!arrayDeque3.isEmpty()) {
                ((s51) arrayDeque3.peek()).f8800d.add(s51Var);
            }
        }
        if (this.f3423k != 2) {
            g();
        }
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f3437z;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final /* synthetic */ List zzd() {
        return this.f3422j;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return true;
    }

    public c6(z6 z6Var, int i6) {
        this.f3414a = z6Var;
        this.f3415b = i6;
        zn1 zn1Var = bo1.f3236t;
        this.f3422j = cp1.f3636w;
        this.f3423k = 0;
        this.h = new e6();
        this.f3421i = new ArrayList();
        this.f3419f = new ex0(16);
        this.f3420g = new ArrayDeque();
        this.f3416c = new ex0(uf1.f9551a);
        this.f3417d = new ex0(5);
        this.f3418e = new ex0();
        this.f3428p = -1;
        this.f3433v = z0.h;
        this.f3434w = new b6[0];
        this.f3431t = true;
    }
}
