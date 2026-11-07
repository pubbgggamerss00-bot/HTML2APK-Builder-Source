package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m6 extends s6 {

    /* renamed from: n, reason: collision with root package name */
    public d1 f6943n;

    /* renamed from: o, reason: collision with root package name */
    public l6 f6944o;

    @Override // com.google.android.gms.internal.ads.s6
    public final long a(ex0 ex0Var) {
        byte[] bArr = ex0Var.f4416a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i6 = (bArr[2] & 255) >> 4;
        if (i6 == 6) {
            ex0Var.k(4);
            ex0Var.F();
        } else if (i6 == 7) {
            i6 = 7;
            ex0Var.k(4);
            ex0Var.F();
        }
        int iD = y5.d(i6, ex0Var);
        ex0Var.j(0);
        return iD;
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final void b(boolean z6) {
        super.b(z6);
        if (z6) {
            this.f6943n = null;
            this.f6944o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final boolean c(ex0 ex0Var, long j6, com.google.android.gms.ads.mediation.customevent.a aVar) {
        byte[] bArr = ex0Var.f4416a;
        d1 d1Var = this.f6943n;
        if (d1Var == null) {
            d1 d1Var2 = new d1(17, bArr);
            this.f6943n = d1Var2;
            aVar.f2372t = d1Var2.b(Arrays.copyOfRange(bArr, 9, ex0Var.f4418c), null);
            return true;
        }
        byte b7 = bArr[0];
        if ((b7 & Byte.MAX_VALUE) == 3) {
            ni0 ni0VarH = bq.h(ex0Var);
            d1 d1Var3 = new d1(d1Var.f3709a, d1Var.f3710b, d1Var.f3711c, d1Var.f3712d, d1Var.f3713e, d1Var.f3715g, d1Var.h, d1Var.f3717j, ni0VarH, d1Var.f3719l);
            this.f6943n = d1Var3;
            this.f6944o = new l6(d1Var3, ni0VarH);
            return true;
        }
        if (b7 != -1) {
            return true;
        }
        l6 l6Var = this.f6944o;
        if (l6Var != null) {
            l6Var.f6584u = j6;
            aVar.f2373u = l6Var;
        }
        ((w) aVar.f2372t).getClass();
        return false;
    }
}
