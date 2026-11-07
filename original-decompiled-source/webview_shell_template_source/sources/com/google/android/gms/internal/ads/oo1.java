package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oo1 extends AbstractSequentialList implements Serializable {
    public final List s;

    /* renamed from: t, reason: collision with root package name */
    public final pl1 f7827t;

    public oo1(List list, pl1 pl1Var) {
        list.getClass();
        this.s = list;
        this.f7827t = pl1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.s.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        return new no1(this, this.s.listIterator(i6));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        this.s.subList(i6, i7).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s.size();
    }
}
