package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dj2 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f3961a;

    public final int a(int i6) {
        SparseBooleanArray sparseBooleanArray = this.f3961a;
        y5.f(i6, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj2)) {
            return false;
        }
        dj2 dj2Var = (dj2) obj;
        SparseBooleanArray sparseBooleanArray = dj2Var.f3961a;
        int i6 = j31.f5914a;
        SparseBooleanArray sparseBooleanArray2 = this.f3961a;
        if (i6 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i7 = 0; i7 < sparseBooleanArray2.size(); i7++) {
            if (a(i7) != dj2Var.a(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i6 = j31.f5914a;
        SparseBooleanArray sparseBooleanArray = this.f3961a;
        if (i6 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            size = (size * 31) + a(i7);
        }
        return size;
    }
}
