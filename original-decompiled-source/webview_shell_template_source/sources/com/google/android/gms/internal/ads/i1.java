package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final gt0 f5530a;

    /* renamed from: b, reason: collision with root package name */
    public final gt0 f5531b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5532c;

    public i1(long j6, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        y5.n(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f5530a = new gt0(length2);
            this.f5531b = new gt0(length2);
        } else {
            int i6 = length2 + 1;
            gt0 gt0Var = new gt0(i6);
            this.f5530a = gt0Var;
            gt0 gt0Var2 = new gt0(i6);
            this.f5531b = gt0Var2;
            gt0Var.b(0L);
            gt0Var2.b(0L);
        }
        this.f5530a.c(jArr);
        this.f5531b.c(jArr2);
        this.f5532c = j6;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        gt0 gt0Var = this.f5531b;
        int i6 = gt0Var.f5156a;
        if (i6 == 0) {
            n1 n1Var = n1.f7276c;
            return new k1(n1Var, n1Var);
        }
        int i7 = j31.f5914a;
        int i8 = i6 - 1;
        int i9 = 0;
        int i10 = 0;
        while (i10 <= i8) {
            int i11 = (i10 + i8) >>> 1;
            if (gt0Var.a(i11) < j6) {
                i10 = i11 + 1;
            } else {
                i8 = i11 - 1;
            }
        }
        int i12 = i8 + 1;
        if (i12 < gt0Var.f5156a && gt0Var.a(i12) == j6) {
            i9 = i12;
        } else if (i8 != -1) {
            i9 = i8;
        }
        long jA = gt0Var.a(i9);
        gt0 gt0Var2 = this.f5530a;
        n1 n1Var2 = new n1(jA, gt0Var2.a(i9));
        if (jA == j6 || i9 == gt0Var.f5156a - 1) {
            return new k1(n1Var2, n1Var2);
        }
        int i13 = i9 + 1;
        return new k1(n1Var2, new n1(gt0Var.a(i13), gt0Var2.a(i13)));
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f5532c;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return this.f5531b.f5156a > 0;
    }
}
