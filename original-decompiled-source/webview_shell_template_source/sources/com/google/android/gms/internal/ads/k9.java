package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k9 implements z8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6285a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6286b;

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f6287c;

    /* renamed from: d, reason: collision with root package name */
    public final l42 f6288d;

    /* renamed from: e, reason: collision with root package name */
    public s1 f6289e;

    /* renamed from: f, reason: collision with root package name */
    public String f6290f;

    /* renamed from: g, reason: collision with root package name */
    public w f6291g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f6292i;

    /* renamed from: j, reason: collision with root package name */
    public int f6293j;

    /* renamed from: k, reason: collision with root package name */
    public int f6294k;

    /* renamed from: l, reason: collision with root package name */
    public long f6295l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6296m;

    /* renamed from: n, reason: collision with root package name */
    public int f6297n;

    /* renamed from: o, reason: collision with root package name */
    public int f6298o;

    /* renamed from: p, reason: collision with root package name */
    public int f6299p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6300q;

    /* renamed from: r, reason: collision with root package name */
    public long f6301r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public long f6302t;

    /* renamed from: u, reason: collision with root package name */
    public int f6303u;

    /* renamed from: v, reason: collision with root package name */
    public String f6304v;

    public k9(String str, int i6) {
        this.f6285a = str;
        this.f6286b = i6;
        ex0 ex0Var = new ex0(1024);
        this.f6287c = ex0Var;
        byte[] bArr = ex0Var.f4416a;
        this.f6288d = new l42(bArr.length, bArr);
        this.f6295l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void c(ex0 ex0Var) throws rn {
        int iW;
        int i6;
        int iW2;
        boolean zG;
        int i7;
        y5.k(this.f6289e);
        while (ex0Var.o() > 0) {
            int i8 = this.h;
            if (i8 != 0) {
                int i9 = 2;
                if (i8 != 1) {
                    l42 l42Var = this.f6288d;
                    ex0 ex0Var2 = this.f6287c;
                    if (i8 != 2) {
                        int iMin = Math.min(ex0Var.o(), this.f6293j - this.f6292i);
                        ex0Var.f(this.f6292i, iMin, (byte[]) l42Var.f6576d);
                        int i10 = this.f6292i + iMin;
                        this.f6292i = i10;
                        if (i10 == this.f6293j) {
                            l42Var.B(0);
                            if (l42Var.G()) {
                                if (this.f6296m) {
                                }
                                this.h = 0;
                            } else {
                                this.f6296m = true;
                                int iW3 = l42Var.w(1);
                                if (iW3 == 1) {
                                    iW2 = l42Var.w(1);
                                    i6 = 1;
                                } else {
                                    i6 = iW3;
                                    iW2 = 0;
                                }
                                this.f6297n = iW2;
                                if (iW2 != 0) {
                                    throw rn.a(null, null);
                                }
                                if (i6 == 1) {
                                    l42Var.w((l42Var.w(2) + 1) * 8);
                                    i6 = 1;
                                }
                                if (!l42Var.G()) {
                                    throw rn.a(null, null);
                                }
                                this.f6298o = l42Var.w(6);
                                int iW4 = l42Var.w(4);
                                int iW5 = l42Var.w(3);
                                if (iW4 != 0 || iW5 != 0) {
                                    throw rn.a(null, null);
                                }
                                if (i6 == 0) {
                                    int i11 = (l42Var.f6573a * 8) + l42Var.f6574b;
                                    int iT = l42Var.t();
                                    b0 b0VarA = c0.a(l42Var, true);
                                    this.f6304v = b0VarA.f2882c;
                                    this.s = b0VarA.f2880a;
                                    this.f6303u = b0VarA.f2881b;
                                    int iT2 = iT - l42Var.t();
                                    l42Var.B(i11);
                                    byte[] bArr = new byte[(iT2 + 7) / 8];
                                    l42Var.z(iT2, bArr);
                                    tk2 tk2Var = new tk2();
                                    tk2Var.f9320a = this.f6290f;
                                    tk2Var.c("audio/mp4a-latm");
                                    tk2Var.f9327i = this.f6304v;
                                    tk2Var.A = this.f6303u;
                                    tk2Var.B = this.s;
                                    tk2Var.f9333o = Collections.singletonList(bArr);
                                    tk2Var.f9323d = this.f6285a;
                                    tk2Var.f9325f = this.f6286b;
                                    w wVar = new w(tk2Var);
                                    if (!wVar.equals(this.f6291g)) {
                                        this.f6291g = wVar;
                                        this.f6302t = 1024000000 / wVar.C;
                                        this.f6289e.b(wVar);
                                    }
                                } else {
                                    int iT3 = l42Var.t();
                                    b0 b0VarA2 = c0.a(l42Var, true);
                                    this.f6304v = b0VarA2.f2882c;
                                    this.s = b0VarA2.f2880a;
                                    this.f6303u = b0VarA2.f2881b;
                                    l42Var.D(l42Var.w((l42Var.w(2) + 1) * 8) - (iT3 - l42Var.t()));
                                }
                                int iW6 = l42Var.w(3);
                                this.f6299p = iW6;
                                if (iW6 == 0) {
                                    l42Var.D(8);
                                } else if (iW6 == 1) {
                                    l42Var.D(9);
                                } else if (iW6 == 3 || iW6 == 4 || iW6 == 5) {
                                    l42Var.D(6);
                                } else {
                                    if (iW6 != 6 && iW6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    l42Var.D(1);
                                }
                                boolean zG2 = l42Var.G();
                                this.f6300q = zG2;
                                this.f6301r = 0L;
                                if (zG2) {
                                    if (i6 != 1) {
                                        do {
                                            zG = l42Var.G();
                                            this.f6301r = (this.f6301r << 8) + l42Var.w(8);
                                        } while (zG);
                                    } else {
                                        this.f6301r = l42Var.w((l42Var.w(2) + 1) * 8);
                                    }
                                }
                                if (l42Var.G()) {
                                    l42Var.D(8);
                                }
                            }
                            if (this.f6297n != 0) {
                                throw rn.a(null, null);
                            }
                            if (this.f6298o != 0) {
                                throw rn.a(null, null);
                            }
                            if (this.f6299p != 0) {
                                throw rn.a(null, null);
                            }
                            int i12 = 0;
                            do {
                                iW = l42Var.w(8);
                                i12 += iW;
                            } while (iW == 255);
                            int i13 = (l42Var.f6573a * 8) + l42Var.f6574b;
                            if ((i13 & 7) == 0) {
                                ex0Var2.j(i13 >> 3);
                            } else {
                                l42Var.z(i12 * 8, ex0Var2.f4416a);
                                ex0Var2.j(0);
                            }
                            this.f6289e.e(i12, ex0Var2);
                            y5.r(this.f6295l != -9223372036854775807L);
                            this.f6289e.a(this.f6295l, 1, i12, 0, null);
                            this.f6295l += this.f6302t;
                            if (this.f6300q) {
                                l42Var.D((int) this.f6301r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int iV = ((this.f6294k & (-225)) << 8) | ex0Var.v();
                        this.f6293j = iV;
                        if (iV > ex0Var2.f4416a.length) {
                            ex0Var2.g(iV);
                            byte[] bArr2 = ex0Var2.f4416a;
                            int length = bArr2.length;
                            l42Var.f6576d = bArr2;
                            i7 = 0;
                            l42Var.f6573a = 0;
                            l42Var.f6574b = 0;
                            l42Var.f6575c = length;
                        } else {
                            i7 = 0;
                        }
                        this.f6292i = i7;
                        this.h = 3;
                    }
                } else {
                    int iV2 = ex0Var.v();
                    if ((iV2 & 224) == 224) {
                        this.f6294k = iV2;
                    } else if (iV2 != 86) {
                        i9 = 0;
                    }
                    this.h = i9;
                }
            } else if (ex0Var.v() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f6289e = z0Var.g(eaVar.f4181d, 1);
        eaVar.b();
        this.f6290f = eaVar.f4182e;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f6295l = j6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.h = 0;
        this.f6295l = -9223372036854775807L;
        this.f6296m = false;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
    }
}
