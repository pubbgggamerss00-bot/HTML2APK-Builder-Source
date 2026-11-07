package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mo1 extends AbstractList implements RandomAccess, Serializable {
    public final List s;

    /* renamed from: t, reason: collision with root package name */
    public final pl1 f7196t;

    public mo1(List list, pl1 pl1Var) {
        list.getClass();
        this.s = list;
        this.f7196t = pl1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return this.f7196t.apply(this.s.get(i6));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.s.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        return new ko1(this, this.s.listIterator(i6));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        return this.f7196t.apply(this.s.remove(i6));
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
