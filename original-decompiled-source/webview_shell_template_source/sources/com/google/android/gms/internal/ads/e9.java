package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e9 implements z8 {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f4159l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final ha f4160a;

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f4161b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f4162c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final c9 f4163d;

    /* renamed from: e, reason: collision with root package name */
    public final p9 f4164e;

    /* renamed from: f, reason: collision with root package name */
    public d9 f4165f;

    /* renamed from: g, reason: collision with root package name */
    public long f4166g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public s1 f4167i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4168j;

    /* renamed from: k, reason: collision with root package name */
    public long f4169k;

    public e9(ha haVar) {
        this.f4160a = haVar;
        c9 c9Var = new c9();
        c9Var.f3472e = new byte[128];
        this.f4163d = c9Var;
        this.f4169k = -9223372036854775807L;
        this.f4164e = new p9(178);
        this.f4161b = new ex0();
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
        y5.k(this.f4165f);
        if (z6) {
            this.f4165f.b(0, this.f4166g, this.f4168j);
            d9 d9Var = this.f4165f;
            d9Var.f3796b = false;
            d9Var.f3797c = false;
            d9Var.f3798d = false;
            d9Var.f3799e = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
    @Override // com.google.android.gms.internal.ads.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ex0 ex0Var) {
        c9 c9Var;
        p9 p9Var;
        int i6;
        boolean z6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        float f6;
        y5.k(this.f4165f);
        y5.k(this.f4167i);
        int i10 = ex0Var.f4417b;
        int i11 = ex0Var.f4418c;
        byte[] bArr = ex0Var.f4416a;
        this.f4166g += ex0Var.o();
        this.f4167i.e(ex0Var.o(), ex0Var);
        while (true) {
            int iA = uf1.a(bArr, i10, i11, this.f4162c);
            c9Var = this.f4163d;
            p9Var = this.f4164e;
            if (iA == i11) {
                break;
            }
            int i12 = iA + 3;
            byte b7 = ex0Var.f4416a[i12];
            int i13 = b7 & 255;
            int i14 = iA - i10;
            if (this.f4168j) {
                i6 = i11;
            } else {
                if (i14 > 0) {
                    c9Var.a(i10, iA, bArr);
                }
                int i15 = i14 < 0 ? -i14 : 0;
                int i16 = c9Var.f3469b;
                if (i16 != 0) {
                    i6 = i11;
                    if (i16 == 1) {
                        i9 = 0;
                        if (i13 != 181) {
                            qs0.f("H263Reader", "Unexpected start code value");
                            c9Var.f3468a = false;
                            c9Var.f3470c = 0;
                            c9Var.f3469b = 0;
                        } else {
                            c9Var.f3469b = 2;
                        }
                    } else if (i16 == 2) {
                        i9 = 0;
                        if (i13 > 31) {
                            qs0.f("H263Reader", "Unexpected start code value");
                            c9Var.f3468a = false;
                            c9Var.f3470c = 0;
                            c9Var.f3469b = 0;
                        } else {
                            c9Var.f3469b = 3;
                        }
                    } else if (i16 != 3) {
                        if (i13 == 179 || i13 == 181) {
                            c9Var.f3470c -= i15;
                            c9Var.f3468a = false;
                            s1 s1Var = this.f4167i;
                            int i17 = c9Var.f3471d;
                            String str = this.h;
                            str.getClass();
                            byte[] bArrCopyOf = Arrays.copyOf(c9Var.f3472e, c9Var.f3470c);
                            l42 l42Var = new l42(bArrCopyOf.length, bArrCopyOf);
                            l42Var.E(i17);
                            l42Var.E(4);
                            l42Var.C();
                            l42Var.D(8);
                            if (l42Var.G()) {
                                l42Var.D(4);
                                l42Var.D(3);
                            }
                            int iW = l42Var.w(4);
                            if (iW == 15) {
                                int iW2 = l42Var.w(8);
                                int iW3 = l42Var.w(8);
                                if (iW3 == 0) {
                                    qs0.f("H263Reader", "Invalid aspect ratio");
                                    f6 = 1.0f;
                                    if (l42Var.G()) {
                                        l42Var.D(2);
                                        l42Var.D(1);
                                        if (l42Var.G()) {
                                            l42Var.D(15);
                                            l42Var.C();
                                            l42Var.D(15);
                                            l42Var.C();
                                            l42Var.D(15);
                                            l42Var.C();
                                            l42Var.D(3);
                                            l42Var.D(11);
                                            l42Var.C();
                                            l42Var.D(15);
                                            l42Var.C();
                                        }
                                    }
                                    if (l42Var.w(2) != 0) {
                                        qs0.f("H263Reader", "Unhandled video object layer shape");
                                    }
                                    l42Var.C();
                                    int iW4 = l42Var.w(16);
                                    l42Var.C();
                                    if (l42Var.G()) {
                                        if (iW4 == 0) {
                                            qs0.f("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            int i18 = iW4 - 1;
                                            int i19 = 0;
                                            while (i18 > 0) {
                                                i18 >>= 1;
                                                i19++;
                                            }
                                            l42Var.D(i19);
                                        }
                                    }
                                    l42Var.C();
                                    int iW5 = l42Var.w(13);
                                    l42Var.C();
                                    int iW6 = l42Var.w(13);
                                    l42Var.C();
                                    l42Var.C();
                                    tk2 tk2Var = new tk2();
                                    tk2Var.f9320a = str;
                                    tk2Var.c("video/mp4v-es");
                                    tk2Var.s = iW5;
                                    tk2Var.f9337t = iW6;
                                    tk2Var.f9340w = f6;
                                    tk2Var.f9333o = Collections.singletonList(bArrCopyOf);
                                    s1Var.b(new w(tk2Var));
                                    this.f4168j = true;
                                } else {
                                    f6 = iW2 / iW3;
                                    if (l42Var.G()) {
                                    }
                                    if (l42Var.w(2) != 0) {
                                    }
                                    l42Var.C();
                                    int iW42 = l42Var.w(16);
                                    l42Var.C();
                                    if (l42Var.G()) {
                                    }
                                    l42Var.C();
                                    int iW52 = l42Var.w(13);
                                    l42Var.C();
                                    int iW62 = l42Var.w(13);
                                    l42Var.C();
                                    l42Var.C();
                                    tk2 tk2Var2 = new tk2();
                                    tk2Var2.f9320a = str;
                                    tk2Var2.c("video/mp4v-es");
                                    tk2Var2.s = iW52;
                                    tk2Var2.f9337t = iW62;
                                    tk2Var2.f9340w = f6;
                                    tk2Var2.f9333o = Collections.singletonList(bArrCopyOf);
                                    s1Var.b(new w(tk2Var2));
                                    this.f4168j = true;
                                }
                            } else if (iW < 7) {
                                f6 = f4159l[iW];
                                if (l42Var.G()) {
                                }
                                if (l42Var.w(2) != 0) {
                                }
                                l42Var.C();
                                int iW422 = l42Var.w(16);
                                l42Var.C();
                                if (l42Var.G()) {
                                }
                                l42Var.C();
                                int iW522 = l42Var.w(13);
                                l42Var.C();
                                int iW622 = l42Var.w(13);
                                l42Var.C();
                                l42Var.C();
                                tk2 tk2Var22 = new tk2();
                                tk2Var22.f9320a = str;
                                tk2Var22.c("video/mp4v-es");
                                tk2Var22.s = iW522;
                                tk2Var22.f9337t = iW622;
                                tk2Var22.f9340w = f6;
                                tk2Var22.f9333o = Collections.singletonList(bArrCopyOf);
                                s1Var.b(new w(tk2Var22));
                                this.f4168j = true;
                            } else {
                                qs0.f("H263Reader", "Invalid aspect ratio");
                                f6 = 1.0f;
                                if (l42Var.G()) {
                                }
                                if (l42Var.w(2) != 0) {
                                }
                                l42Var.C();
                                int iW4222 = l42Var.w(16);
                                l42Var.C();
                                if (l42Var.G()) {
                                }
                                l42Var.C();
                                int iW5222 = l42Var.w(13);
                                l42Var.C();
                                int iW6222 = l42Var.w(13);
                                l42Var.C();
                                l42Var.C();
                                tk2 tk2Var222 = new tk2();
                                tk2Var222.f9320a = str;
                                tk2Var222.c("video/mp4v-es");
                                tk2Var222.s = iW5222;
                                tk2Var222.f9337t = iW6222;
                                tk2Var222.f9340w = f6;
                                tk2Var222.f9333o = Collections.singletonList(bArrCopyOf);
                                s1Var.b(new w(tk2Var222));
                                this.f4168j = true;
                            }
                        } else {
                            i9 = 0;
                        }
                    } else if ((b7 & 240) != 32) {
                        qs0.f("H263Reader", "Unexpected start code value");
                        i9 = 0;
                        c9Var.f3468a = false;
                        c9Var.f3470c = 0;
                        c9Var.f3469b = 0;
                    } else {
                        i9 = 0;
                        c9Var.f3471d = c9Var.f3470c;
                        c9Var.f3469b = 4;
                    }
                } else {
                    i6 = i11;
                    i9 = 0;
                    if (i13 == 176) {
                        c9Var.f3469b = 1;
                        c9Var.f3468a = true;
                    }
                }
                c9Var.a(i9, 3, c9.f3467f);
            }
            this.f4165f.a(i10, iA, bArr);
            if (p9Var == null) {
                z6 = true;
            } else {
                if (i14 > 0) {
                    p9Var.b(i10, iA, bArr);
                    i8 = 0;
                } else {
                    i8 = -i14;
                }
                if (p9Var.e(i8)) {
                    int iB = uf1.b(p9Var.f7995d, (byte[]) p9Var.f7996e);
                    int i20 = j31.f5914a;
                    byte[] bArr2 = (byte[]) p9Var.f7996e;
                    ex0 ex0Var2 = this.f4161b;
                    ex0Var2.h(iB, bArr2);
                    this.f4160a.a(this.f4169k, ex0Var2);
                }
                if (i13 == 178) {
                    z6 = true;
                    if (ex0Var.f4416a[iA + 2] == 1) {
                        p9Var.d(178);
                    }
                    i13 = 178;
                }
            }
            int i21 = i6 - iA;
            this.f4165f.b(i21, this.f4166g - i21, this.f4168j);
            d9 d9Var = this.f4165f;
            long j6 = this.f4169k;
            d9Var.f3799e = i13;
            d9Var.f3798d = false;
            if (i13 == 182) {
                z7 = z6;
                i7 = i13;
            } else if (i13 == 179) {
                z7 = z6;
                i7 = 179;
            } else {
                i7 = i13;
                z7 = false;
            }
            d9Var.f3796b = z7;
            d9Var.f3797c = i7 == 182 ? z6 : false;
            d9Var.f3800f = 0;
            d9Var.h = j6;
            i10 = i12;
            i11 = i6;
        }
        if (!this.f4168j) {
            c9Var.a(i10, i11, bArr);
        }
        this.f4165f.a(i10, i11, bArr);
        if (p9Var != null) {
            p9Var.b(i10, i11, bArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.h = eaVar.f4182e;
        eaVar.b();
        s1 s1VarG = z0Var.g(eaVar.f4181d, 2);
        this.f4167i = s1VarG;
        this.f4165f = new d9(s1VarG);
        this.f4160a.b(z0Var, eaVar);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f4169k = j6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        uf1.f(this.f4162c);
        c9 c9Var = this.f4163d;
        c9Var.f3468a = false;
        c9Var.f3470c = 0;
        c9Var.f3469b = 0;
        d9 d9Var = this.f4165f;
        if (d9Var != null) {
            d9Var.f3796b = false;
            d9Var.f3797c = false;
            d9Var.f3798d = false;
            d9Var.f3799e = -1;
        }
        p9 p9Var = this.f4164e;
        if (p9Var != null) {
            p9Var.c();
        }
        this.f4166g = 0L;
        this.f4169k = -9223372036854775807L;
    }
}
