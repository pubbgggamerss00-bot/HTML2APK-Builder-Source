package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ka implements ja {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f6305a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f6306b;

    /* renamed from: c, reason: collision with root package name */
    public final ma f6307c;

    /* renamed from: d, reason: collision with root package name */
    public final w f6308d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6309e;

    /* renamed from: f, reason: collision with root package name */
    public long f6310f;

    /* renamed from: g, reason: collision with root package name */
    public int f6311g;
    public long h;

    public ka(z0 z0Var, s1 s1Var, ma maVar, String str, int i6) throws rn {
        this.f6305a = z0Var;
        this.f6306b = s1Var;
        this.f6307c = maVar;
        int i7 = maVar.f7011a;
        int i8 = maVar.f7012b;
        int i9 = maVar.f7014d * i7;
        int i10 = maVar.f7013c;
        int i11 = i9 / 8;
        if (i10 != i11) {
            throw rn.a(null, "Expected block size: " + i11 + "; got: " + i10);
        }
        int i12 = i8 * i11;
        int i13 = i12 * 8;
        int iMax = Math.max(i11, i12 / 10);
        this.f6309e = iMax;
        tk2 tk2Var = new tk2();
        tk2Var.c(str);
        tk2Var.f9326g = i13;
        tk2Var.h = i13;
        tk2Var.f9331m = iMax;
        tk2Var.A = i7;
        tk2Var.B = i8;
        tk2Var.C = i6;
        this.f6308d = new w(tk2Var);
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void a(long j6) {
        this.f6310f = j6;
        this.f6311g = 0;
        this.h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void c(int i6, long j6) {
        this.f6305a.f(new pa(this.f6307c, 1, i6, j6));
        this.f6306b.b(this.f6308d);
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final boolean d(y0 y0Var, long j6) {
        int i6;
        int i7;
        long j7 = j6;
        while (j7 > 0 && (i6 = this.f6311g) < (i7 = this.f6309e)) {
            int iD = this.f6306b.d(y0Var, (int) Math.min(i7 - i6, j7), true);
            if (iD == -1) {
                j7 = 0;
            } else {
                this.f6311g += iD;
                j7 -= iD;
            }
        }
        int i8 = this.f6311g;
        int i9 = this.f6307c.f7013c;
        int i10 = i8 / i9;
        if (i10 > 0) {
            long jU = this.f6310f + j31.u(this.h, 1000000L, r2.f7012b, RoundingMode.DOWN);
            int i11 = i10 * i9;
            int i12 = this.f6311g - i11;
            this.f6306b.a(jU, 1, i11, i12, null);
            this.h += i10;
            this.f6311g = i12;
        }
        return j7 <= 0;
    }
}
