package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lp1 extends bp1 implements Serializable {
    public final bp1 s;

    public lp1(bp1 bp1Var) {
        this.s = bp1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.s.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lp1) {
            return this.s.equals(((lp1) obj).s);
        }
        return false;
    }

    public final int hashCode() {
        return -this.s.hashCode();
    }

    public final String toString() {
        return this.s.toString().concat(".reverse()");
    }
}
