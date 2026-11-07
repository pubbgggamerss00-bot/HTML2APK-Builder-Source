package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xj2 extends vj2 {
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final int M;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f10620w;

    /* renamed from: x, reason: collision with root package name */
    public final jj2 f10621x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10622y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10623z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xj2(int i6, a00 a00Var, int i7, jj2 jj2Var, int i8, String str, boolean z6) {
        boolean z7;
        boolean z8;
        int i9;
        int iH;
        int i10;
        boolean z9;
        int i11;
        w wVar;
        int i12;
        int i13;
        int i14;
        super(i6, a00Var, i7);
        this.f10621x = jj2Var;
        boolean z10 = jj2Var.f6088m;
        bo1 bo1Var = jj2Var.f3751c;
        bo1 bo1Var2 = jj2Var.f3752d;
        int i15 = 1;
        int i16 = true != z10 ? 16 : 24;
        if (z6) {
            w wVar2 = this.f9888v;
            int i17 = wVar2.f9984t;
            float f6 = wVar2.f9986v;
            z7 = f6 == -1.0f || f6 <= 2.1474836E9f;
        }
        this.f10620w = z7;
        if (!z6 || (((i12 = (wVar = this.f9888v).f9984t) != -1 && i12 < 0) || ((i13 = wVar.f9985u) != -1 && i13 < 0))) {
            z8 = false;
        } else {
            float f7 = wVar.f9986v;
            if ((f7 == -1.0f || f7 >= 0.0f) && ((i14 = wVar.f9974i) == -1 || i14 >= 0)) {
                z8 = true;
            }
        }
        this.f10622y = z8;
        this.f10623z = rj1.i(i8, false);
        w wVar3 = this.f9888v;
        float f8 = wVar3.f9986v;
        this.A = f8 != -1.0f && f8 >= 10.0f;
        this.B = wVar3.f9974i;
        int i18 = wVar3.f9984t;
        this.C = (i18 == -1 || (i11 = wVar3.f9985u) == -1) ? -1 : i18 * i11;
        int i19 = 0;
        while (true) {
            i9 = Integer.MAX_VALUE;
            if (i19 >= bo1Var2.size()) {
                iH = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                iH = yj2.h(this.f9888v, (String) bo1Var2.get(i19), false);
                if (iH > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.E = i19;
        this.F = iH;
        int i20 = this.f9888v.f9972f;
        pn1 pn1Var = yj2.f11011j;
        this.G = (i20 == 0 || i20 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i21 = this.f9888v.f9972f;
        this.H = i21 == 0 || (i21 & 1) != 0;
        this.I = yj2.h(this.f9888v, str, yj2.i(str) == null);
        int i22 = 0;
        while (true) {
            if (i22 < bo1Var.size()) {
                String str2 = this.f9888v.f9978m;
                if (str2 != null && str2.equals(bo1Var.get(i22))) {
                    i9 = i22;
                    break;
                }
                i22++;
            } else {
                break;
            }
        }
        this.D = i9;
        this.K = (i8 & 384) == 128;
        this.L = (i8 & 64) == 64;
        w wVar4 = this.f9888v;
        String str3 = wVar4.f9978m;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1851077871:
                    if (str3.equals("video/dolby-vision")) {
                        i10 = 5;
                        break;
                    }
                    break;
                case -1662735862:
                    if (str3.equals("video/av01")) {
                        i10 = 4;
                        break;
                    }
                    break;
                case -1662541442:
                    if (str3.equals("video/hevc")) {
                        i10 = 3;
                        break;
                    }
                    break;
                case 1331836730:
                    if (str3.equals("video/avc")) {
                        i10 = 1;
                        break;
                    }
                    break;
                case 1599127257:
                    if (str3.equals("video/x-vnd.on2.vp9")) {
                        i10 = 2;
                        break;
                    }
                    break;
            }
        } else {
            i10 = 0;
        }
        this.M = i10;
        if ((wVar4.f9972f & 16384) != 0) {
            i15 = 0;
        } else {
            jj2 jj2Var2 = this.f10621x;
            if (rj1.i(i8, jj2Var2.f6092q) && ((z9 = this.f10620w) || jj2Var2.f6087l)) {
                if (rj1.i(i8, false) && this.f10622y && z9 && wVar4.f9974i != -1 && (i16 & i8) != 0) {
                    i15 = 2;
                }
            }
        }
        this.J = i15;
    }

    @Override // com.google.android.gms.internal.ads.vj2
    public final int a() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.vj2
    public final /* bridge */ /* synthetic */ boolean b(vj2 vj2Var) {
        xj2 xj2Var = (xj2) vj2Var;
        if (!Objects.equals(this.f9888v.f9978m, xj2Var.f9888v.f9978m)) {
            return false;
        }
        this.f10621x.getClass();
        return this.K == xj2Var.K && this.L == xj2Var.L;
    }
}
