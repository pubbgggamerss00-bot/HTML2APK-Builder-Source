package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class id2 {

    /* renamed from: d, reason: collision with root package name */
    public static final id2 f5720d;

    /* renamed from: a, reason: collision with root package name */
    public final int f5721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5722b;

    /* renamed from: c, reason: collision with root package name */
    public final go1 f5723c;

    static {
        id2 id2Var;
        if (j31.f5914a >= 33) {
            fo1 fo1Var = new fo1(4);
            for (int i6 = 1; i6 <= 10; i6++) {
                fo1Var.t(Integer.valueOf(j31.m(i6)));
            }
            id2Var = new id2(2, fo1Var.v());
        } else {
            id2Var = new id2(2, 10);
        }
        f5720d = id2Var;
    }

    public id2(int i6, int i7) {
        this.f5721a = i6;
        this.f5722b = i7;
        this.f5723c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id2)) {
            return false;
        }
        id2 id2Var = (id2) obj;
        return this.f5721a == id2Var.f5721a && this.f5722b == id2Var.f5722b && Objects.equals(this.f5723c, id2Var.f5723c);
    }

    public final int hashCode() {
        go1 go1Var = this.f5723c;
        return (((this.f5721a * 31) + this.f5722b) * 31) + (go1Var == null ? 0 : go1Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f5721a + ", maxChannelCount=" + this.f5722b + ", channelMasks=" + String.valueOf(this.f5723c) + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public id2(int i6, Set set) {
        go1 go1VarM;
        this.f5721a = i6;
        int i7 = go1.f5097u;
        if (!(set instanceof go1) || (set instanceof SortedSet)) {
            Object[] array = set.toArray();
            go1VarM = go1.m(array, array.length);
        } else {
            go1VarM = (go1) set;
            if (go1VarM.h()) {
            }
        }
        this.f5723c = go1VarM;
        up1 it = go1VarM.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f5722b = iMax;
    }
}
