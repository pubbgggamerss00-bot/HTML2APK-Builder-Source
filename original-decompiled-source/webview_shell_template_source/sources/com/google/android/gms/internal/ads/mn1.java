package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mn1 extends AbstractCollection {
    public final /* synthetic */ nn1 s;

    public mn1(nn1 nn1Var) {
        this.s = nn1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        nn1 nn1Var = this.s;
        Map mapD = nn1Var.d();
        return mapD != null ? mapD.values().iterator() : new hn1(nn1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.s.size();
    }
}
