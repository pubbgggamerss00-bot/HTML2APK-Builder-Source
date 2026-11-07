package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gt0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5156a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f5157b;

    public gt0(int i6) {
        this.f5157b = new long[i6];
    }

    public final long a(int i6) {
        if (i6 < 0 || i6 >= this.f5156a) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Invalid index ", i6, this.f5156a, ", size is "));
        }
        return this.f5157b[i6];
    }

    public final void b(long j6) {
        int i6 = this.f5156a;
        long[] jArr = this.f5157b;
        if (i6 == jArr.length) {
            this.f5157b = Arrays.copyOf(jArr, i6 + i6);
        }
        long[] jArr2 = this.f5157b;
        int i7 = this.f5156a;
        this.f5156a = i7 + 1;
        jArr2[i7] = j6;
    }

    public final void c(long[] jArr) {
        int i6 = this.f5156a;
        int length = jArr.length;
        int i7 = i6 + length;
        long[] jArr2 = this.f5157b;
        int length2 = jArr2.length;
        if (i7 > length2) {
            this.f5157b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i7));
        }
        System.arraycopy(jArr, 0, this.f5157b, this.f5156a, length);
        this.f5156a = i7;
    }
}
