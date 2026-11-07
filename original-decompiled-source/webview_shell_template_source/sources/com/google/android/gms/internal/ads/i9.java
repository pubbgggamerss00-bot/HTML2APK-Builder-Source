package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i9 implements z8 {

    /* renamed from: a, reason: collision with root package name */
    public final x9 f5602a;

    /* renamed from: b, reason: collision with root package name */
    public String f5603b;

    /* renamed from: c, reason: collision with root package name */
    public s1 f5604c;

    /* renamed from: d, reason: collision with root package name */
    public h9 f5605d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5606e;

    /* renamed from: l, reason: collision with root package name */
    public long f5612l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f5607f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final p9 f5608g = new p9(32);
    public final p9 h = new p9(33);

    /* renamed from: i, reason: collision with root package name */
    public final p9 f5609i = new p9(34);

    /* renamed from: j, reason: collision with root package name */
    public final p9 f5610j = new p9(39);

    /* renamed from: k, reason: collision with root package name */
    public final p9 f5611k = new p9(40);

    /* renamed from: m, reason: collision with root package name */
    public long f5613m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final ex0 f5614n = new ex0();

    public i9(x9 x9Var) {
        this.f5602a = x9Var;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
        y5.k(this.f5604c);
        int i6 = j31.f5914a;
        if (z6) {
            this.f5602a.f10444c.d(0);
            h9 h9Var = this.f5605d;
            long j6 = this.f5612l;
            h9Var.f5304m = h9Var.f5295c;
            h9Var.a((int) (j6 - h9Var.f5294b));
            h9Var.f5302k = h9Var.f5294b;
            h9Var.f5294b = j6;
            h9Var.a(0);
            h9Var.f5300i = false;
        }
    }

    public final void b(int i6, int i7, byte[] bArr) {
        h9 h9Var = this.f5605d;
        if (h9Var.f5298f) {
            int i8 = h9Var.f5296d;
            int i9 = (i6 + 2) - i8;
            if (i9 < i7) {
                h9Var.f5299g = (bArr[i9] & 128) != 0;
                h9Var.f5298f = false;
            } else {
                h9Var.f5296d = (i7 - i6) + i8;
            }
        }
        if (!this.f5606e) {
            this.f5608g.b(i6, i7, bArr);
            this.h.b(i6, i7, bArr);
            this.f5609i.b(i6, i7, bArr);
        }
        this.f5610j.b(i6, i7, bArr);
        this.f5611k.b(i6, i7, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022d  */
    @Override // com.google.android.gms.internal.ads.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ex0 ex0Var) {
        ba baVar;
        boolean z6;
        int i6;
        byte[] bArr;
        int i7;
        int i8;
        boolean zE;
        p9 p9Var;
        int i9;
        boolean z7;
        boolean z8;
        boolean z9;
        ex0 ex0Var2 = ex0Var;
        ba baVar2 = this.f5602a.f10444c;
        y5.k(this.f5604c);
        int i10 = j31.f5914a;
        while (ex0Var2.o() > 0) {
            int i11 = ex0Var2.f4417b;
            int i12 = ex0Var2.f4418c;
            byte[] bArr2 = ex0Var2.f4416a;
            this.f5612l += ex0Var2.o();
            this.f5604c.e(ex0Var2.o(), ex0Var2);
            while (i11 < i12) {
                int iA = uf1.a(bArr2, i11, i12, this.f5607f);
                if (iA == i12) {
                    b(i11, i12, bArr2);
                    return;
                }
                int i13 = iA + 3;
                int i14 = bArr2[i13] & 126;
                int i15 = iA - i11;
                if (i15 > 0) {
                    b(i11, iA, bArr2);
                }
                int i16 = i12 - iA;
                long j6 = this.f5612l - i16;
                int i17 = i15 < 0 ? -i15 : 0;
                long j7 = this.f5613m;
                h9 h9Var = this.f5605d;
                boolean z10 = this.f5606e;
                if (h9Var.f5301j && h9Var.f5299g) {
                    h9Var.f5304m = h9Var.f5295c;
                    h9Var.f5301j = false;
                } else {
                    if (h9Var.h || h9Var.f5299g) {
                        if (z10 && h9Var.f5300i) {
                            baVar = baVar2;
                            h9Var.a(((int) (j6 - h9Var.f5294b)) + i16);
                        } else {
                            baVar = baVar2;
                        }
                        h9Var.f5302k = h9Var.f5294b;
                        h9Var.f5303l = h9Var.f5297e;
                        h9Var.f5304m = h9Var.f5295c;
                        h9Var.f5300i = true;
                    }
                    z6 = this.f5606e;
                    p9 p9Var2 = this.f5609i;
                    p9 p9Var3 = this.h;
                    p9 p9Var4 = this.f5608g;
                    if (z6) {
                        p9Var4.e(i17);
                        p9Var3.e(i17);
                        p9Var2.e(i17);
                        if (p9Var4.f7994c && p9Var3.f7994c && p9Var2.f7994c) {
                            String str = this.f5603b;
                            ba baVar3 = baVar;
                            int i18 = p9Var4.f7995d;
                            i7 = i13;
                            byte[] bArr3 = new byte[p9Var3.f7995d + i18 + p9Var2.f7995d];
                            i8 = i14;
                            i6 = i12;
                            System.arraycopy((byte[]) p9Var4.f7996e, 0, bArr3, 0, i18);
                            bArr = bArr2;
                            System.arraycopy((byte[]) p9Var3.f7996e, 0, bArr3, p9Var4.f7995d, p9Var3.f7995d);
                            System.arraycopy((byte[]) p9Var2.f7996e, 0, bArr3, p9Var4.f7995d + p9Var3.f7995d, p9Var2.f7995d);
                            String strC = null;
                            ad1 ad1VarC = uf1.c((byte[]) p9Var3.f7996e, 3, p9Var3.f7995d, null);
                            wa1 wa1Var = ad1VarC.f2656a;
                            if (wa1Var != null) {
                                int i19 = wa1Var.f10141f;
                                int[] iArr = wa1Var.f10140e;
                                strC = sl0.c(wa1Var.f10136a, wa1Var.f10137b, wa1Var.f10138c, wa1Var.f10139d, iArr, i19);
                            }
                            tk2 tk2Var = new tk2();
                            tk2Var.f9320a = str;
                            tk2Var.c("video/hevc");
                            tk2Var.f9327i = strC;
                            tk2Var.s = ad1VarC.f2659d;
                            tk2Var.f9337t = ad1VarC.f2660e;
                            tk2Var.f9343z = new mb2(ad1VarC.h, ad1VarC.f2663i, ad1VarC.f2664j, ad1VarC.f2657b + 8, ad1VarC.f2658c + 8, null);
                            tk2Var.f9340w = ad1VarC.f2661f;
                            tk2Var.f9332n = ad1VarC.f2662g;
                            tk2Var.f9333o = Collections.singletonList(bArr3);
                            w wVar = new w(tk2Var);
                            this.f5604c.b(wVar);
                            int i20 = wVar.f9980o;
                            if (i20 == -1) {
                                throw new IllegalStateException();
                            }
                            baVar3.getClass();
                            y5.r(i20 >= 0);
                            baVar = baVar3;
                            baVar.s = i20;
                            baVar.d(i20);
                            this.f5606e = true;
                        } else {
                            i6 = i12;
                            bArr = bArr2;
                            i7 = i13;
                            i8 = i14;
                        }
                    }
                    p9 p9Var5 = this.f5610j;
                    zE = p9Var5.e(i17);
                    ex0 ex0Var3 = this.f5614n;
                    if (zE) {
                        ex0Var3.h(uf1.b(p9Var5.f7995d, (byte[]) p9Var5.f7996e), (byte[]) p9Var5.f7996e);
                        ex0Var3.k(5);
                        baVar.a(j7, ex0Var3);
                    }
                    p9Var = this.f5611k;
                    if (p9Var.e(i17)) {
                        ex0Var3.h(uf1.b(p9Var.f7995d, (byte[]) p9Var.f7996e), (byte[]) p9Var.f7996e);
                        ex0Var3.k(5);
                        baVar.a(j7, ex0Var3);
                    }
                    i9 = i8 >> 1;
                    long j8 = this.f5613m;
                    h9 h9Var2 = this.f5605d;
                    boolean z11 = this.f5606e;
                    h9Var2.f5299g = false;
                    h9Var2.h = false;
                    h9Var2.f5297e = j8;
                    h9Var2.f5296d = 0;
                    h9Var2.f5294b = j6;
                    if (i9 >= 32 || i9 == 40) {
                        z7 = true;
                        z8 = false;
                    } else {
                        if (!h9Var2.f5300i || h9Var2.f5301j) {
                            z8 = false;
                        } else {
                            if (z11) {
                                h9Var2.a(i16);
                            }
                            z8 = false;
                            h9Var2.f5300i = false;
                        }
                        if (i9 <= 35 || i9 == 39) {
                            z7 = true;
                            h9Var2.h = !h9Var2.f5301j;
                            h9Var2.f5301j = true;
                        } else {
                            z7 = true;
                        }
                    }
                    z9 = (i9 >= 16 || i9 > 21) ? z8 : z7;
                    h9Var2.f5295c = z9;
                    if (!z9 && i9 > 9) {
                        z7 = z8;
                    }
                    h9Var2.f5298f = z7;
                    if (this.f5606e) {
                        p9Var4.d(i9);
                        p9Var3.d(i9);
                        p9Var2.d(i9);
                    }
                    p9Var5.d(i9);
                    p9Var.d(i9);
                    baVar2 = baVar;
                    i11 = i7;
                    i12 = i6;
                    bArr2 = bArr;
                }
                baVar = baVar2;
                z6 = this.f5606e;
                p9 p9Var22 = this.f5609i;
                p9 p9Var32 = this.h;
                p9 p9Var42 = this.f5608g;
                if (z6) {
                }
                p9 p9Var52 = this.f5610j;
                zE = p9Var52.e(i17);
                ex0 ex0Var32 = this.f5614n;
                if (zE) {
                }
                p9Var = this.f5611k;
                if (p9Var.e(i17)) {
                }
                i9 = i8 >> 1;
                long j82 = this.f5613m;
                h9 h9Var22 = this.f5605d;
                boolean z112 = this.f5606e;
                h9Var22.f5299g = false;
                h9Var22.h = false;
                h9Var22.f5297e = j82;
                h9Var22.f5296d = 0;
                h9Var22.f5294b = j6;
                if (i9 >= 32) {
                    z7 = true;
                    z8 = false;
                }
                if (i9 >= 16) {
                }
                h9Var22.f5295c = z9;
                if (!z9) {
                    z7 = z8;
                }
                h9Var22.f5298f = z7;
                if (this.f5606e) {
                }
                p9Var52.d(i9);
                p9Var.d(i9);
                baVar2 = baVar;
                i11 = i7;
                i12 = i6;
                bArr2 = bArr;
            }
            ex0Var2 = ex0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f5603b = eaVar.f4182e;
        eaVar.b();
        s1 s1VarG = z0Var.g(eaVar.f4181d, 2);
        this.f5604c = s1VarG;
        this.f5605d = new h9(s1VarG);
        this.f5602a.a(z0Var, eaVar);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f5613m = j6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f5612l = 0L;
        this.f5613m = -9223372036854775807L;
        uf1.f(this.f5607f);
        this.f5608g.c();
        this.h.c();
        this.f5609i.c();
        this.f5610j.c();
        this.f5611k.c();
        this.f5602a.f10444c.d(0);
        h9 h9Var = this.f5605d;
        if (h9Var != null) {
            h9Var.f5298f = false;
            h9Var.f5299g = false;
            h9Var.h = false;
            h9Var.f5300i = false;
            h9Var.f5301j = false;
        }
    }
}
