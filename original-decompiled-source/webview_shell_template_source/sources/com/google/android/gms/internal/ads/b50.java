package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b50 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2920a;

    /* renamed from: b, reason: collision with root package name */
    public final a00 f2921b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2922c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2923d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f2924e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public b50(a00 a00Var, boolean z6, int[] iArr, boolean[] zArr) {
        int i6 = a00Var.f2531a;
        this.f2920a = i6;
        y5.n(i6 == iArr.length && i6 == zArr.length);
        this.f2921b = a00Var;
        this.f2922c = z6 && i6 > 1;
        this.f2923d = (int[]) iArr.clone();
        this.f2924e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b50.class == obj.getClass()) {
            b50 b50Var = (b50) obj;
            if (this.f2922c == b50Var.f2922c && this.f2921b.equals(b50Var.f2921b) && Arrays.equals(this.f2923d, b50Var.f2923d) && Arrays.equals(this.f2924e, b50Var.f2924e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2924e) + ((Arrays.hashCode(this.f2923d) + (((this.f2921b.hashCode() * 31) + (this.f2922c ? 1 : 0)) * 31)) * 31);
    }
}
