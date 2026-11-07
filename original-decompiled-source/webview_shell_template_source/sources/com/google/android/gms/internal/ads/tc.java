package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tc {

    /* renamed from: a, reason: collision with root package name */
    public final String f9222a;

    /* renamed from: b, reason: collision with root package name */
    public final q8 f9223b;

    /* renamed from: c, reason: collision with root package name */
    public final t7 f9224c;

    /* renamed from: d, reason: collision with root package name */
    public final lf f9225d;

    /* renamed from: e, reason: collision with root package name */
    public final l5 f9226e;

    static {
        zn1 zn1Var = bo1.f3236t;
        cp1 cp1Var = cp1.f3636w;
        List list = Collections.EMPTY_LIST;
        ga gaVar = ga.f4956a;
        new l5();
        lf lfVar = lf.f6679z;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ tc(String str, l5 l5Var, q8 q8Var, t7 t7Var, lf lfVar) {
        ga gaVar = ga.f4956a;
        this.f9222a = str;
        this.f9223b = q8Var;
        this.f9224c = t7Var;
        this.f9225d = lfVar;
        this.f9226e = l5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc)) {
            return false;
        }
        tc tcVar = (tc) obj;
        if (!this.f9222a.equals(tcVar.f9222a) || !this.f9226e.equals(tcVar.f9226e) || !Objects.equals(this.f9223b, tcVar.f9223b) || !this.f9224c.equals(tcVar.f9224c) || !Objects.equals(this.f9225d, tcVar.f9225d)) {
            return false;
        }
        ga gaVar = ga.f4956a;
        return gaVar.equals(gaVar);
    }

    public final int hashCode() {
        int iHashCode = this.f9222a.hashCode() * 31;
        q8 q8Var = this.f9223b;
        return (this.f9225d.hashCode() + ((this.f9226e.hashCode() + ((this.f9224c.hashCode() + ((iHashCode + (q8Var != null ? q8Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
