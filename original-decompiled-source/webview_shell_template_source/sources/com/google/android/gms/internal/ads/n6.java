package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n6 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public z0 f7317a;

    /* renamed from: b, reason: collision with root package name */
    public s6 f7318b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7319c;

    public final boolean a(y0 y0Var) {
        p6 p6Var = new p6();
        if (p6Var.a(y0Var, true) && (p6Var.f7949a & 2) == 2) {
            int iMin = Math.min(p6Var.f7953e, 8);
            ex0 ex0Var = new ex0(iMin);
            y0Var.h(0, iMin, ex0Var.f4416a);
            ex0Var.j(0);
            if (ex0Var.o() >= 5 && ex0Var.v() == 127 && ex0Var.D() == 1179402563) {
                this.f7318b = new m6();
                return true;
            }
            ex0Var.j(0);
            try {
                if (x1.c(1, ex0Var, true)) {
                    this.f7318b = new t6();
                    return true;
                }
            } catch (rn unused) {
            }
            ex0Var.j(0);
            if (r6.e(ex0Var, r6.f8552o)) {
                this.f7318b = new r6();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        s6 s6Var = this.f7318b;
        if (s6Var != null) {
            o6 o6Var = s6Var.f8804a;
            p6 p6Var = o6Var.f7616a;
            p6Var.f7949a = 0;
            p6Var.f7950b = 0L;
            p6Var.f7951c = 0;
            p6Var.f7952d = 0;
            p6Var.f7953e = 0;
            o6Var.f7617b.g(0);
            o6Var.f7618c = -1;
            o6Var.f7620e = false;
            if (j6 == 0) {
                s6Var.b(!s6Var.f8814l);
                return;
            }
            if (s6Var.h != 0) {
                long j8 = (s6Var.f8811i * j7) / 1000000;
                s6Var.f8808e = j8;
                q6 q6Var = s6Var.f8807d;
                int i6 = j31.f5914a;
                q6Var.b(j8);
                s6Var.h = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) {
        try {
            return a(y0Var);
        } catch (rn unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws rn {
        int i6;
        ex0 ex0Var;
        byte[] bArr;
        y5.k(this.f7317a);
        if (this.f7318b == null) {
            if (!a(y0Var)) {
                throw rn.a(null, "Failed to determine bitstream type");
            }
            y0Var.zzj();
        }
        if (!this.f7319c) {
            s1 s1VarG = this.f7317a.g(0, 1);
            this.f7317a.d();
            s6 s6Var = this.f7318b;
            s6Var.f8806c = this.f7317a;
            s6Var.f8805b = s1VarG;
            s6Var.b(true);
            this.f7319c = true;
        }
        s6 s6Var2 = this.f7318b;
        o6 o6Var = s6Var2.f8804a;
        y5.k(s6Var2.f8805b);
        int i7 = j31.f5914a;
        int i8 = s6Var2.h;
        int i9 = 3;
        int i10 = -1;
        if (i8 != 0) {
            if (i8 == 1) {
                y0Var.b((int) s6Var2.f8809f);
                s6Var2.h = 2;
                return 0;
            }
            if (i8 != 2) {
                return -1;
            }
            long jA = s6Var2.f8807d.a(y0Var);
            if (jA >= 0) {
                b1Var.f2886a = jA;
                return 1;
            }
            if (jA < -1) {
                s6Var2.d(-(jA + 2));
            }
            if (!s6Var2.f8814l) {
                m1 m1VarZze = s6Var2.f8807d.zze();
                y5.k(m1VarZze);
                s6Var2.f8806c.f(m1VarZze);
                s6Var2.f8814l = true;
            }
            if (s6Var2.f8813k <= 0 && !o6Var.a(y0Var)) {
                s6Var2.h = 3;
                return -1;
            }
            s6Var2.f8813k = 0L;
            ex0 ex0Var2 = o6Var.f7617b;
            long jA2 = s6Var2.a(ex0Var2);
            if (jA2 >= 0) {
                long j6 = s6Var2.f8810g;
                if (j6 + jA2 >= s6Var2.f8808e) {
                    s6Var2.f8805b.e(ex0Var2.f4418c, ex0Var2);
                    s6Var2.f8805b.a((j6 * 1000000) / s6Var2.f8811i, 1, ex0Var2.f4418c, 0, null);
                    s6Var2.f8808e = -1L;
                }
            }
            s6Var2.f8810g += jA2;
            return 0;
        }
        while (true) {
            boolean zA = o6Var.a(y0Var);
            ex0 ex0Var3 = o6Var.f7617b;
            if (!zA) {
                s6Var2.h = i9;
                return i10;
            }
            long jZzf = y0Var.zzf();
            long j7 = s6Var2.f8809f;
            s6Var2.f8813k = jZzf - j7;
            if (s6Var2.c(ex0Var3, j7, s6Var2.f8812j)) {
                s6Var2.f8809f = y0Var.zzf();
                i9 = 3;
                i10 = -1;
            } else {
                w wVar = (w) s6Var2.f8812j.f2372t;
                s6Var2.f8811i = wVar.C;
                if (!s6Var2.f8815m) {
                    s6Var2.f8805b.b(wVar);
                    s6Var2.f8815m = true;
                }
                l6 l6Var = (l6) s6Var2.f8812j.f2373u;
                if (l6Var != null) {
                    s6Var2.f8807d = l6Var;
                } else {
                    if (y0Var.zzd() != -1) {
                        p6 p6Var = o6Var.f7616a;
                        boolean z6 = (p6Var.f7949a & 4) != 0;
                        long j8 = s6Var2.f8809f;
                        long jZzd = y0Var.zzd();
                        int i11 = p6Var.f7952d + p6Var.f7953e;
                        long j9 = p6Var.f7950b;
                        long j10 = i11;
                        i6 = 2;
                        ex0Var = ex0Var3;
                        s6Var2.f8807d = new k6(s6Var2, j8, jZzd, j10, j9, z6);
                        s6Var2.h = i6;
                        bArr = ex0Var.f4416a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        ex0Var.h(ex0Var.f4418c, Arrays.copyOf(bArr, Math.max(65025, ex0Var.f4418c)));
                        return 0;
                    }
                    s6Var2.f8807d = new bq(14, (byte) 0);
                }
                i6 = 2;
                ex0Var = ex0Var3;
                s6Var2.h = i6;
                bArr = ex0Var.f4416a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f7317a = z0Var;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
