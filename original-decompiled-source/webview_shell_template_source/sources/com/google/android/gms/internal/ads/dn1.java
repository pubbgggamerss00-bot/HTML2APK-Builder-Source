package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class dn1 implements vo1 {
    public transient qm1 s;

    /* renamed from: t, reason: collision with root package name */
    public transient cn1 f3978t;

    /* renamed from: u, reason: collision with root package name */
    public transient nm1 f3979u;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vo1) {
            return zzs().equals(((vo1) obj).zzs());
        }
        return false;
    }

    public final int hashCode() {
        return ((nm1) zzs()).f7469u.hashCode();
    }

    public final String toString() {
        return ((nm1) zzs()).f7469u.toString();
    }

    @Override // com.google.android.gms.internal.ads.vo1
    public final Map zzs() {
        nm1 nm1Var = this.f3979u;
        if (nm1Var != null) {
            return nm1Var;
        }
        xo1 xo1Var = (xo1) this;
        Map map = xo1Var.f2801v;
        nm1 rm1Var = map instanceof NavigableMap ? new rm1(xo1Var, (NavigableMap) map) : map instanceof SortedMap ? new vm1(xo1Var, (SortedMap) map) : new nm1(xo1Var, map);
        this.f3979u = rm1Var;
        return rm1Var;
    }
}
