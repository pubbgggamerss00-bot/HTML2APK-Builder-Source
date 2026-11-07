package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pt0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8145a;

    /* renamed from: b, reason: collision with root package name */
    public int f8146b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f8147c;

    /* renamed from: d, reason: collision with root package name */
    public int f8148d;

    public final long a() {
        int i6 = this.f8146b;
        if (i6 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f8147c;
        int i7 = this.f8145a;
        long j6 = jArr[i7];
        this.f8145a = this.f8148d & (i7 + 1);
        this.f8146b = i6 - 1;
        return j6;
    }
}
