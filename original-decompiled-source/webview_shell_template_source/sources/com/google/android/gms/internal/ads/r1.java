package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8502a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8503b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8504c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8505d;

    public r1(int i6, byte[] bArr, int i7, int i8) {
        this.f8502a = i6;
        this.f8503b = bArr;
        this.f8504c = i7;
        this.f8505d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f8502a == r1Var.f8502a && this.f8504c == r1Var.f8504c && this.f8505d == r1Var.f8505d && Arrays.equals(this.f8503b, r1Var.f8503b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f8503b) + (this.f8502a * 31)) * 31) + this.f8504c) * 31) + this.f8505d;
    }
}
