package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c2 implements x0 {

    /* renamed from: d, reason: collision with root package name */
    public final w6 f3367d;

    /* renamed from: e, reason: collision with root package name */
    public int f3368e;

    /* renamed from: g, reason: collision with root package name */
    public d2 f3370g;

    /* renamed from: j, reason: collision with root package name */
    public long f3372j;

    /* renamed from: k, reason: collision with root package name */
    public f2 f3373k;

    /* renamed from: o, reason: collision with root package name */
    public int f3377o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3378p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3366c = true;

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f3364a = new ex0(12);

    /* renamed from: b, reason: collision with root package name */
    public final b2 f3365b = new b2();

    /* renamed from: f, reason: collision with root package name */
    public z0 f3369f = new f0(8);

    /* renamed from: i, reason: collision with root package name */
    public f2[] f3371i = new f2[0];

    /* renamed from: m, reason: collision with root package name */
    public long f3375m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f3376n = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f3374l = -1;
    public long h = -9223372036854775807L;

    public c2(w6 w6Var) {
        this.f3367d = w6Var;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.f3372j = -1L;
        this.f3373k = null;
        for (f2 f2Var : this.f3371i) {
            if (f2Var.f4450j == 0) {
                f2Var.h = 0;
            } else {
                f2Var.h = f2Var.f4453m[j31.j(f2Var.f4452l, j6, true)];
            }
        }
        if (j6 == 0) {
            this.f3368e = this.f3371i.length != 0 ? 3 : 0;
        } else {
            this.f3368e = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) {
        ex0 ex0Var = this.f3364a;
        y0Var.h(0, 12, ex0Var.f4416a);
        ex0Var.j(0);
        if (ex0Var.r() == 1179011410) {
            ex0Var.k(4);
            if (ex0Var.r() == 541677121) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws rn {
        boolean z6;
        int i6;
        f2 f2Var;
        long j6;
        int i7;
        char c7;
        f2 f2Var2;
        long j7 = this.f3372j;
        int i8 = 0;
        if (j7 != -1) {
            long jZzf = y0Var.zzf();
            if (j7 < jZzf || j7 > 262144 + jZzf) {
                b1Var.f2886a = j7;
                z6 = true;
            } else {
                y0Var.b((int) (j7 - jZzf));
                z6 = false;
            }
        } else {
            z6 = false;
        }
        this.f3372j = -1L;
        if (z6) {
            return 1;
        }
        int i9 = this.f3368e;
        f2 f2Var3 = null;
        if (i9 == 0) {
            if (!d(y0Var)) {
                throw rn.a(null, "AVI Header List not found");
            }
            y0Var.b(12);
            this.f3368e = 1;
            return 0;
        }
        b2 b2Var = this.f3365b;
        ex0 ex0Var = this.f3364a;
        if (i9 == 1) {
            y0Var.i(0, 12, ex0Var.f4416a);
            ex0Var.j(0);
            b2Var.getClass();
            b2Var.f2892a = ex0Var.r();
            b2Var.f2893b = ex0Var.r();
            int i10 = b2Var.f2892a;
            if (i10 != 1414744396) {
                throw rn.a(null, "LIST expected, found: " + i10);
            }
            int iR = ex0Var.r();
            if (iR == 1819436136) {
                this.f3374l = b2Var.f2893b;
                this.f3368e = 2;
                return 0;
            }
            throw rn.a(null, "hdrl expected, found: " + iR);
        }
        char c8 = 3;
        if (i9 == 2) {
            int i11 = 2;
            int i12 = this.f3374l - 4;
            ex0 ex0Var2 = new ex0(i12);
            y0Var.i(0, i12, ex0Var2.f4416a);
            g2 g2VarB = g2.b(1819436136, ex0Var2);
            int i13 = g2VarB.f4869b;
            if (i13 != 1819436136) {
                throw rn.a(null, "Unexpected header list type " + i13);
            }
            d2 d2Var = (d2) g2VarB.a(d2.class);
            if (d2Var == null) {
                throw rn.a(null, "AviHeader not found");
            }
            this.f3370g = d2Var;
            this.h = d2Var.f3734c * d2Var.f3732a;
            ArrayList arrayList = new ArrayList();
            bo1 bo1Var = g2VarB.f4868a;
            int size = bo1Var.size();
            int i14 = 0;
            int i15 = 0;
            while (i14 < size) {
                z1 z1Var = (z1) bo1Var.get(i14);
                if (z1Var.zza() == 1819440243) {
                    g2 g2Var = (g2) z1Var;
                    int i16 = i15 + 1;
                    e2 e2Var = (e2) g2Var.a(e2.class);
                    h2 h2Var = (h2) g2Var.a(h2.class);
                    if (e2Var == null) {
                        qs0.f("AviExtractor", "Missing Stream Header");
                    } else if (h2Var == null) {
                        qs0.f("AviExtractor", "Missing Stream Format");
                    } else {
                        int i17 = e2Var.f4084d;
                        int i18 = e2Var.f4082b;
                        int i19 = e2Var.f4083c;
                        w wVar = h2Var.f5214a;
                        long jU = j31.u(i17, i18 * 1000000, i19, RoundingMode.DOWN);
                        tk2 tk2Var = new tk2(wVar);
                        tk2Var.b(i15);
                        int i20 = e2Var.f4085e;
                        if (i20 != 0) {
                            tk2Var.f9331m = i20;
                        }
                        i2 i2Var = (i2) g2Var.a(i2.class);
                        if (i2Var != null) {
                            tk2Var.f9321b = i2Var.f5535a;
                        }
                        int iB = bk.b(wVar.f9978m);
                        if (iB == 1) {
                            i6 = iB;
                        } else if (iB == i11) {
                            i6 = 2;
                        }
                        s1 s1VarG = this.f3369f.g(i15, i6);
                        s1VarG.b(new w(tk2Var));
                        f2Var = new f2(i15, i6, jU, e2Var.f4084d, s1VarG);
                        this.h = Math.max(this.h, jU);
                        if (f2Var != null) {
                            arrayList.add(f2Var);
                        }
                        i15 = i16;
                    }
                    f2Var = null;
                    if (f2Var != null) {
                    }
                    i15 = i16;
                }
                i14++;
                i11 = 2;
            }
            this.f3371i = (f2[]) arrayList.toArray(new f2[0]);
            this.f3369f.d();
            this.f3368e = 3;
            return 0;
        }
        if (i9 == 3) {
            long j8 = this.f3375m;
            if (j8 != -1 && y0Var.zzf() != j8) {
                this.f3372j = j8;
                return 0;
            }
            y0Var.h(0, 12, ex0Var.f4416a);
            y0Var.zzj();
            ex0Var.j(0);
            b2Var.getClass();
            b2Var.f2892a = ex0Var.r();
            b2Var.f2893b = ex0Var.r();
            int iR2 = ex0Var.r();
            int i21 = b2Var.f2892a;
            if (i21 == 1179011410) {
                y0Var.b(12);
                return 0;
            }
            if (i21 != 1414744396 || iR2 != 1769369453) {
                this.f3372j = y0Var.zzf() + b2Var.f2893b + 8;
                return 0;
            }
            long jZzf2 = y0Var.zzf();
            this.f3375m = jZzf2;
            long j9 = jZzf2 + b2Var.f2893b + 8;
            this.f3376n = j9;
            if (!this.f3378p) {
                d2 d2Var2 = this.f3370g;
                d2Var2.getClass();
                if ((d2Var2.f3733b & 16) == 16) {
                    this.f3368e = 4;
                    this.f3372j = j9;
                    return 0;
                }
                this.f3369f.f(new l1(this.h, 0L));
                this.f3378p = true;
            }
            this.f3372j = y0Var.zzf() + 12;
            this.f3368e = 6;
            return 0;
        }
        if (i9 == 4) {
            y0Var.i(0, 8, ex0Var.f4416a);
            ex0Var.j(0);
            int iR3 = ex0Var.r();
            int iR4 = ex0Var.r();
            if (iR3 != 829973609) {
                this.f3372j = y0Var.zzf() + iR4;
                return 0;
            }
            this.f3368e = 5;
            this.f3377o = iR4;
            return 0;
        }
        if (i9 != 5) {
            if (y0Var.zzf() >= this.f3376n) {
                return -1;
            }
            f2 f2Var4 = this.f3373k;
            if (f2Var4 != null) {
                s1 s1Var = f2Var4.f4442a;
                int i22 = f2Var4.f4448g;
                int iD = i22 - s1Var.d(y0Var, i22, false);
                f2Var4.f4448g = iD;
                boolean z7 = iD == 0;
                if (z7) {
                    if (f2Var4.f4447f > 0) {
                        int i23 = f2Var4.h;
                        s1Var.a((f2Var4.f4445d * i23) / f2Var4.f4446e, Arrays.binarySearch(f2Var4.f4453m, i23) >= 0 ? 1 : 0, f2Var4.f4447f, 0, null);
                    }
                    f2Var4.h++;
                }
                if (!z7) {
                    return 0;
                }
                this.f3373k = null;
                return 0;
            }
            if ((y0Var.zzf() & 1) == 1) {
                y0Var.b(1);
            }
            y0Var.h(0, 12, ex0Var.f4416a);
            ex0Var.j(0);
            int iR5 = ex0Var.r();
            if (iR5 == 1414744396) {
                ex0Var.j(8);
                y0Var.b(ex0Var.r() != 1769369453 ? 8 : 12);
                y0Var.zzj();
                return 0;
            }
            int iR6 = ex0Var.r();
            if (iR5 == 1263424842) {
                this.f3372j = y0Var.zzf() + iR6 + 8;
                return 0;
            }
            y0Var.b(8);
            y0Var.zzj();
            for (f2 f2Var5 : this.f3371i) {
                if (f2Var5.f4443b == iR5 || f2Var5.f4444c == iR5) {
                    f2Var3 = f2Var5;
                    break;
                }
            }
            if (f2Var3 == null) {
                this.f3372j = y0Var.zzf() + iR6;
                return 0;
            }
            f2Var3.f4447f = iR6;
            f2Var3.f4448g = iR6;
            this.f3373k = f2Var3;
            return 0;
        }
        ex0 ex0Var3 = new ex0(this.f3377o);
        y0Var.i(0, this.f3377o, ex0Var3.f4416a);
        if (ex0Var3.o() < 16) {
            j6 = 0;
        } else {
            int i24 = ex0Var3.f4417b;
            ex0Var3.k(8);
            long jR = ex0Var3.r();
            long j10 = this.f3375m;
            j6 = jR > j10 ? 0L : j10 + 8;
            ex0Var3.j(i24);
        }
        while (ex0Var3.o() >= 16) {
            int iR7 = ex0Var3.r();
            int iR8 = ex0Var3.r();
            long jR2 = ex0Var3.r() + j6;
            ex0Var3.r();
            f2[] f2VarArr = this.f3371i;
            int length = f2VarArr.length;
            int i25 = i8;
            while (true) {
                if (i25 >= length) {
                    i7 = i8;
                    c7 = c8;
                    f2Var2 = null;
                    break;
                }
                c7 = c8;
                f2Var2 = f2VarArr[i25];
                i7 = i8;
                if (f2Var2.f4443b == iR7 || f2Var2.f4444c == iR7) {
                    break;
                }
                i25++;
                c8 = c7;
                i8 = i7;
            }
            if (f2Var2 != null) {
                int i26 = (iR8 & 16) == 16 ? 1 : i7;
                if (f2Var2.f4451k == -1) {
                    f2Var2.f4451k = jR2;
                }
                if (i26 != 0) {
                    if (f2Var2.f4450j == f2Var2.f4453m.length) {
                        long[] jArr = f2Var2.f4452l;
                        f2Var2.f4452l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                        int[] iArr = f2Var2.f4453m;
                        f2Var2.f4453m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                    }
                    long[] jArr2 = f2Var2.f4452l;
                    int i27 = f2Var2.f4450j;
                    jArr2[i27] = jR2;
                    f2Var2.f4453m[i27] = f2Var2.f4449i;
                    f2Var2.f4450j = i27 + 1;
                }
                f2Var2.f4449i++;
            }
            c8 = c7;
            i8 = i7;
        }
        int i28 = i8;
        f2[] f2VarArr2 = this.f3371i;
        int length2 = f2VarArr2.length;
        for (int i29 = i28; i29 < length2; i29++) {
            f2 f2Var6 = f2VarArr2[i29];
            f2Var6.f4452l = Arrays.copyOf(f2Var6.f4452l, f2Var6.f4450j);
            f2Var6.f4453m = Arrays.copyOf(f2Var6.f4453m, f2Var6.f4450j);
        }
        this.f3378p = true;
        this.f3369f.f(new a2(this, this.h));
        this.f3368e = 6;
        this.f3372j = this.f3375m;
        return i28;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f3368e = 0;
        if (this.f3366c) {
            z0Var = new b7(z0Var, this.f3367d);
        }
        this.f3369f = z0Var;
        this.f3372j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
