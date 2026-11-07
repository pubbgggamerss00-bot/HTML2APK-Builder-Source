package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kn1 extends AbstractSet {
    public final /* synthetic */ nn1 s;

    public kn1(nn1 nn1Var) {
        this.s = nn1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.s.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        nn1 nn1Var = this.s;
        Map mapD = nn1Var.d();
        return mapD != null ? mapD.keySet().iterator() : new fn1(nn1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        nn1 nn1Var = this.s;
        Map mapD = nn1Var.d();
        return mapD != null ? mapD.keySet().remove(obj) : nn1Var.j(obj) != nn1.B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.size();
    }
}
