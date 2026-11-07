package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    public final f6 f5568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5569b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f5570c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f5571d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5572e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f5573f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f5574g;
    public final long h;

    public i6(f6 f6Var, long[] jArr, int[] iArr, int i6, long[] jArr2, int[] iArr2, long j6) {
        int length = iArr.length;
        int length2 = jArr2.length;
        y5.n(length == length2);
        int length3 = jArr.length;
        y5.n(length3 == length2);
        int length4 = iArr2.length;
        y5.n(length4 == length2);
        this.f5568a = f6Var;
        this.f5570c = jArr;
        this.f5571d = iArr;
        this.f5572e = i6;
        this.f5573f = jArr2;
        this.f5574g = iArr2;
        this.h = j6;
        this.f5569b = length3;
        if (length4 > 0) {
            int i7 = length4 - 1;
            iArr2[i7] = iArr2[i7] | 536870912;
        }
    }

    public final int a(long j6) {
        int i6;
        int i7 = j31.f5914a;
        long[] jArr = this.f5573f;
        int iBinarySearch = Arrays.binarySearch(jArr, j6);
        if (iBinarySearch < 0) {
            i6 = ~iBinarySearch;
        } else {
            while (true) {
                int i8 = iBinarySearch + 1;
                if (i8 >= jArr.length || jArr[i8] != j6) {
                    break;
                }
                iBinarySearch = i8;
            }
            i6 = iBinarySearch;
        }
        while (i6 < jArr.length) {
            if ((this.f5574g[i6] & 1) != 0) {
                return i6;
            }
            i6++;
        }
        return -1;
    }
}
