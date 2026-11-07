package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dj {

    /* renamed from: b, reason: collision with root package name */
    public static final dj f3948b = new dj(new a[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final a f3949c;

    /* renamed from: a, reason: collision with root package name */
    public final a[] f3950a;

    static {
        a aVar = new a(-1, new int[0], new tc[0], new long[0]);
        int[] iArr = aVar.f2529d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f2530e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f3949c = new a(0, iArrCopyOf, (tc[]) Arrays.copyOf(aVar.f2528c, 0), jArrCopyOf);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public dj(a[] aVarArr) {
        this.f3950a = aVarArr;
    }

    public final a a(int i6) {
        return i6 < 0 ? f3949c : this.f3950a[i6];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dj.class == obj.getClass() && Arrays.equals(this.f3950a, ((dj) obj).f3950a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3950a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return androidx.camera.camera2.internal.k0.a("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
