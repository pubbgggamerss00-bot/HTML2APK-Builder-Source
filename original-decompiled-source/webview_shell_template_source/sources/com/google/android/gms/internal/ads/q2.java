package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q2 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f8195a = new ex0(4);

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f8196b = new ex0(9);

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f8197c = new ex0(11);

    /* renamed from: d, reason: collision with root package name */
    public final ex0 f8198d = new ex0();

    /* renamed from: e, reason: collision with root package name */
    public final r2 f8199e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f8200f;

    /* renamed from: g, reason: collision with root package name */
    public int f8201g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public long f8202i;

    /* renamed from: j, reason: collision with root package name */
    public int f8203j;

    /* renamed from: k, reason: collision with root package name */
    public int f8204k;

    /* renamed from: l, reason: collision with root package name */
    public int f8205l;

    /* renamed from: m, reason: collision with root package name */
    public long f8206m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8207n;

    /* renamed from: o, reason: collision with root package name */
    public p2 f8208o;

    /* renamed from: p, reason: collision with root package name */
    public t2 f8209p;

    public q2() {
        r2 r2Var = new r2(new t0());
        r2Var.f8507u = -9223372036854775807L;
        r2Var.f8508v = new long[0];
        r2Var.f8509w = new long[0];
        this.f8199e = r2Var;
        this.f8201g = 1;
    }

    public final ex0 a(y0 y0Var) {
        int i6 = this.f8205l;
        ex0 ex0Var = this.f8198d;
        byte[] bArr = ex0Var.f4416a;
        if (i6 > bArr.length) {
            int length = bArr.length;
            ex0Var.h(0, new byte[Math.max(length + length, i6)]);
        } else {
            ex0Var.j(0);
        }
        ex0Var.i(this.f8205l);
        y0Var.i(0, this.f8205l, ex0Var.f4416a);
        return ex0Var;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        if (j6 == 0) {
            this.f8201g = 1;
            this.h = false;
        } else {
            this.f8201g = 3;
        }
        this.f8203j = 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) throws EOFException, InterruptedIOException {
        ex0 ex0Var = this.f8195a;
        p0 p0Var = (p0) y0Var;
        p0Var.g(ex0Var.f4416a, 0, 3, false);
        ex0Var.j(0);
        if (ex0Var.x() == 4607062) {
            p0Var.g(ex0Var.f4416a, 0, 2, false);
            ex0Var.j(0);
            if ((ex0Var.z() & 250) == 0) {
                p0Var.g(ex0Var.f4416a, 0, 4, false);
                ex0Var.j(0);
                int iQ = ex0Var.q();
                p0Var.f7910f = 0;
                p0Var.k(iQ, false);
                p0Var.g(ex0Var.f4416a, 0, 4, false);
                ex0Var.j(0);
                if (ex0Var.q() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0386 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0279  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws rn {
        long j6;
        int i6;
        boolean z6;
        int i7;
        int i8;
        int i9;
        y5.k(this.f8200f);
        while (true) {
            int i10 = this.f8201g;
            int i11 = 8;
            if (i10 == 1) {
                ex0 ex0Var = this.f8196b;
                if (!y0Var.f(ex0Var.f4416a, 0, 9, true)) {
                    return -1;
                }
                ex0Var.j(0);
                ex0Var.k(4);
                int iV = ex0Var.v();
                int i12 = iV & 4;
                int i13 = iV & 1;
                if (i12 != 0 && this.f8208o == null) {
                    this.f8208o = new p2(this.f8200f.g(8, 1));
                }
                if (i13 != 0 && this.f8209p == null) {
                    this.f8209p = new t2(this.f8200f.g(9, 2));
                }
                this.f8200f.d();
                this.f8203j = ex0Var.q() - 5;
                this.f8201g = 2;
            } else if (i10 == 2) {
                y0Var.b(this.f8203j);
                this.f8203j = 0;
                this.f8201g = 3;
            } else if (i10 == 3) {
                ex0 ex0Var2 = this.f8197c;
                if (!y0Var.f(ex0Var2.f4416a, 0, 11, true)) {
                    return -1;
                }
                ex0Var2.j(0);
                this.f8204k = ex0Var2.v();
                this.f8205l = ex0Var2.x();
                this.f8206m = ex0Var2.x();
                this.f8206m = ((ex0Var2.v() << 24) | this.f8206m) * 1000;
                ex0Var2.k(3);
                this.f8201g = 4;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                boolean z7 = this.h;
                r2 r2Var = this.f8199e;
                long j7 = z7 ? this.f8202i + this.f8206m : r2Var.f8507u == -9223372036854775807L ? 0L : this.f8206m;
                int i14 = this.f8204k;
                if (i14 == 8) {
                    if (this.f8208o != null) {
                        if (!this.f8207n) {
                            this.f8200f.f(new l1(-9223372036854775807L, 0L));
                            this.f8207n = true;
                        }
                        p2 p2Var = this.f8208o;
                        ex0 ex0VarA = a(y0Var);
                        s1 s1Var = (s1) p2Var.s;
                        if (p2Var.f7913u) {
                            ex0VarA.k(1);
                        } else {
                            int iV2 = ex0VarA.v();
                            int i15 = iV2 >> 4;
                            p2Var.f7915w = i15;
                            if (i15 == 2) {
                                int i16 = p2.f7912x[(iV2 >> 2) & 3];
                                tk2 tk2Var = new tk2();
                                tk2Var.c("audio/mpeg");
                                tk2Var.A = 1;
                                tk2Var.B = i16;
                                s1Var.b(new w(tk2Var));
                                p2Var.f7914v = true;
                            } else if (i15 == 7 || i15 == 8) {
                                tk2 tk2Var2 = new tk2();
                                tk2Var2.c(i15 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                                tk2Var2.A = 1;
                                tk2Var2.B = 8000;
                                s1Var.b(new w(tk2Var2));
                                p2Var.f7914v = true;
                            } else if (i15 != 10) {
                                throw new s2(androidx.camera.camera2.internal.compat.workaround.c.d(i15, "Audio format not supported: "));
                            }
                            p2Var.f7913u = true;
                        }
                        s1 s1Var2 = (s1) p2Var.s;
                        i8 = 1;
                        if (p2Var.f7915w == 2) {
                            int iO = ex0VarA.o();
                            s1Var2.e(iO, ex0VarA);
                            ((s1) p2Var.s).a(j7, 1, iO, 0, null);
                        } else {
                            int iV3 = ex0VarA.v();
                            if (iV3 == 0 && !p2Var.f7914v) {
                                int iO2 = ex0VarA.o();
                                byte[] bArr = new byte[iO2];
                                ex0VarA.f(0, iO2, bArr);
                                b0 b0VarA = c0.a(new l42(iO2, bArr), false);
                                tk2 tk2Var3 = new tk2();
                                tk2Var3.c("audio/mp4a-latm");
                                tk2Var3.f9327i = b0VarA.f2882c;
                                tk2Var3.A = b0VarA.f2881b;
                                tk2Var3.B = b0VarA.f2880a;
                                tk2Var3.f9333o = Collections.singletonList(bArr);
                                s1Var2.b(new w(tk2Var3));
                                p2Var.f7914v = true;
                            } else if (p2Var.f7915w != 10 || iV3 == 1) {
                                int iO3 = ex0VarA.o();
                                s1Var2.e(iO3, ex0VarA);
                                ((s1) p2Var.s).a(j7, 1, iO3, 0, null);
                            }
                            i8 = 0;
                        }
                        z6 = true;
                        i7 = 1;
                        j6 = -9223372036854775807L;
                        i6 = 0;
                    }
                    if (!this.h && i8 != 0) {
                        this.h = z6;
                        this.f8202i = r2Var.f8507u != j6 ? -this.f8206m : 0L;
                    }
                    this.f8203j = 4;
                    this.f8201g = 2;
                    if (i7 != 0) {
                        return i6;
                    }
                } else {
                    i11 = i14;
                }
                if (i11 != 9) {
                    j6 = -9223372036854775807L;
                    i6 = 0;
                    if (i11 != 18 || this.f8207n) {
                        z6 = true;
                        y0Var.b(this.f8205l);
                        i8 = i6;
                        i7 = i8;
                        if (!this.h) {
                        }
                        this.f8203j = 4;
                        this.f8201g = 2;
                        if (i7 != 0) {
                        }
                    } else {
                        ex0 ex0VarA2 = a(y0Var);
                        r2Var.getClass();
                        r2Var.getClass();
                        if (ex0VarA2.v() == 2 && "onMetaData".equals(r2.B(ex0VarA2)) && ex0VarA2.o() != 0 && ex0VarA2.v() == 8) {
                            HashMap mapC = r2.C(ex0VarA2);
                            Object obj = mapC.get("duration");
                            if (obj instanceof Double) {
                                double dDoubleValue = ((Double) obj).doubleValue();
                                if (dDoubleValue > 0.0d) {
                                    r2Var.f8507u = (long) (dDoubleValue * 1000000.0d);
                                }
                            }
                            Object obj2 = mapC.get("keyframes");
                            if (obj2 instanceof Map) {
                                Map map = (Map) obj2;
                                Object obj3 = map.get("filepositions");
                                Object obj4 = map.get("times");
                                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                    List list = (List) obj3;
                                    List list2 = (List) obj4;
                                    int size = list2.size();
                                    r2Var.f8508v = new long[size];
                                    r2Var.f8509w = new long[size];
                                    for (int i17 = 0; i17 < size; i17++) {
                                        Object obj5 = list.get(i17);
                                        Object obj6 = list2.get(i17);
                                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                            r2Var.f8508v = new long[0];
                                            r2Var.f8509w = new long[0];
                                            break;
                                        }
                                        r2Var.f8508v[i17] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                        r2Var.f8509w[i17] = ((Double) obj5).longValue();
                                    }
                                }
                            }
                        }
                        long j8 = r2Var.f8507u;
                        if (j8 != -9223372036854775807L) {
                            this.f8200f.f(new i1(j8, r2Var.f8509w, r2Var.f8508v));
                            z6 = true;
                            this.f8207n = true;
                        } else {
                            z6 = true;
                        }
                        i7 = z6 ? 1 : 0;
                        i8 = 0;
                        if (!this.h) {
                        }
                        this.f8203j = 4;
                        this.f8201g = 2;
                        if (i7 != 0) {
                        }
                    }
                } else if (this.f8209p != null) {
                    if (!this.f8207n) {
                        this.f8200f.f(new l1(-9223372036854775807L, 0L));
                        this.f8207n = true;
                    }
                    t2 t2Var = this.f8209p;
                    ex0 ex0VarA3 = a(y0Var);
                    t2Var.getClass();
                    int iV4 = ex0VarA3.v();
                    int i18 = iV4 >> 4;
                    int i19 = iV4 & 15;
                    if (i19 != 7) {
                        throw new s2(androidx.camera.camera2.internal.compat.workaround.c.d(i19, "Video format not supported: "));
                    }
                    t2Var.f9076z = i18;
                    if (i18 != 5) {
                        ex0 ex0Var3 = t2Var.f9071u;
                        s1 s1Var3 = (s1) t2Var.s;
                        ex0 ex0Var4 = t2Var.f9072v;
                        int iV5 = ex0VarA3.v();
                        byte[] bArr2 = ex0VarA3.f4416a;
                        int i20 = ex0VarA3.f4417b;
                        int i21 = i20 + 1;
                        ex0VarA3.f4417b = i21;
                        j6 = -9223372036854775807L;
                        int i22 = bArr2[i20] & 255;
                        int i23 = i20 + 2;
                        ex0VarA3.f4417b = i23;
                        int i24 = bArr2[i21] & 255;
                        ex0VarA3.f4417b = i20 + 3;
                        long j9 = (bArr2[i23] & 255) | (i24 << 8) | ((i22 << 24) >> 8);
                        boolean z8 = false;
                        if (iV5 == 0) {
                            if (!t2Var.f9074x) {
                                byte[] bArr3 = new byte[ex0VarA3.o()];
                                ex0 ex0Var5 = new ex0(bArr3);
                                ex0VarA3.f(0, ex0VarA3.o(), bArr3);
                                g0 g0VarA = g0.a(ex0Var5);
                                t2Var.f9073w = g0VarA.f4848b;
                                tk2 tk2Var4 = new tk2();
                                tk2Var4.c("video/avc");
                                tk2Var4.f9327i = g0VarA.f4857l;
                                tk2Var4.s = g0VarA.f4849c;
                                tk2Var4.f9337t = g0VarA.f4850d;
                                tk2Var4.f9340w = g0VarA.f4856k;
                                tk2Var4.f9333o = g0VarA.f4847a;
                                s1Var3.b(new w(tk2Var4));
                                t2Var.f9074x = true;
                            }
                        } else if (iV5 == 1 && t2Var.f9074x) {
                            int i25 = t2Var.f9076z == 1 ? 1 : 0;
                            if (t2Var.f9075y) {
                                i9 = i25;
                            } else if (i25 != 0) {
                                i9 = 1;
                            }
                            byte[] bArr4 = ex0Var4.f4416a;
                            bArr4[0] = 0;
                            bArr4[1] = 0;
                            bArr4[2] = 0;
                            int i26 = 4 - t2Var.f9073w;
                            int i27 = 0;
                            while (ex0VarA3.o() > 0) {
                                ex0VarA3.f(i26, t2Var.f9073w, ex0Var4.f4416a);
                                ex0Var4.j(0);
                                int iY = ex0Var4.y();
                                ex0Var3.j(0);
                                s1Var3.e(4, ex0Var3);
                                s1Var3.e(iY, ex0VarA3);
                                i27 = i27 + 4 + iY;
                            }
                            i6 = 0;
                            ((s1) t2Var.s).a((j9 * 1000) + j7, i9, i27, 0, null);
                            t2Var.f9075y = true;
                            z8 = true;
                            if (!z8) {
                                i8 = 1;
                            }
                            z6 = true;
                            i7 = 1;
                            if (!this.h) {
                                this.h = z6;
                                this.f8202i = r2Var.f8507u != j6 ? -this.f8206m : 0L;
                            }
                            this.f8203j = 4;
                            this.f8201g = 2;
                            if (i7 != 0) {
                            }
                        }
                        i6 = 0;
                        if (!z8) {
                        }
                        z6 = true;
                        i7 = 1;
                        if (!this.h) {
                        }
                        this.f8203j = 4;
                        this.f8201g = 2;
                        if (i7 != 0) {
                        }
                    } else {
                        j6 = -9223372036854775807L;
                        i6 = 0;
                    }
                    i8 = i6;
                    z6 = true;
                    i7 = 1;
                    if (!this.h) {
                    }
                    this.f8203j = 4;
                    this.f8201g = 2;
                    if (i7 != 0) {
                    }
                } else {
                    j6 = -9223372036854775807L;
                    i6 = 0;
                    z6 = true;
                    y0Var.b(this.f8205l);
                    i8 = i6;
                    i7 = i8;
                    if (!this.h) {
                    }
                    this.f8203j = 4;
                    this.f8201g = 2;
                    if (i7 != 0) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f8200f = z0Var;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
