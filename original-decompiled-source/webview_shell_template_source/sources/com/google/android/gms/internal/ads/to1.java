package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class to1 extends AbstractMap {
    public transient lm1 s;

    /* renamed from: t, reason: collision with root package name */
    public transient so1 f9356t;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        lm1 lm1Var = this.s;
        if (lm1Var != null) {
            return lm1Var;
        }
        lm1 lm1Var2 = new lm1((nm1) this);
        this.s = lm1Var2;
        return lm1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        so1 so1Var = this.f9356t;
        if (so1Var != null) {
            return so1Var;
        }
        so1 so1Var2 = new so1(this);
        this.f9356t = so1Var2;
        return so1Var2;
    }
}
