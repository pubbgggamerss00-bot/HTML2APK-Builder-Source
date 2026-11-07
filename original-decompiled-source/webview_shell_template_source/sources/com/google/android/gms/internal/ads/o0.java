package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7549a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7550b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7551c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7552d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f7553e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7554f;

    public o0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f7550b = iArr;
        this.f7551c = jArr;
        this.f7552d = jArr2;
        this.f7553e = jArr3;
        int length = iArr.length;
        this.f7549a = length;
        if (length <= 0) {
            this.f7554f = 0L;
        } else {
            int i6 = length - 1;
            this.f7554f = jArr2[i6] + jArr3[i6];
        }
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        long[] jArr = this.f7553e;
        int iJ = j31.j(jArr, j6, true);
        long j7 = jArr[iJ];
        long[] jArr2 = this.f7551c;
        n1 n1Var = new n1(j7, jArr2[iJ]);
        if (j7 >= j6 || iJ == this.f7549a - 1) {
            return new k1(n1Var, n1Var);
        }
        int i6 = iJ + 1;
        return new k1(n1Var, new n1(jArr[i6], jArr2[i6]));
    }

    public final String toString() {
        String string = Arrays.toString(this.f7550b);
        String string2 = Arrays.toString(this.f7551c);
        String string3 = Arrays.toString(this.f7553e);
        String string4 = Arrays.toString(this.f7552d);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.f7549a);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        return androidx.activity.m.e(sb, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f7554f;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return true;
    }
}
