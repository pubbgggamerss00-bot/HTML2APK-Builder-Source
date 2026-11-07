package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sm1 extends wm1 implements NavigableSet {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ an1 f8982v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm1(an1 an1Var, NavigableMap navigableMap) {
        super(an1Var, navigableMap);
        this.f8982v = an1Var;
    }

    @Override // com.google.android.gms.internal.ads.wm1
    public final /* synthetic */ SortedMap c() {
        return (NavigableMap) ((SortedMap) this.s);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.s)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((qm1) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new sm1(this.f8982v, ((NavigableMap) ((SortedMap) this.s)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.s)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.wm1, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.s)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.s)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        pm1 pm1Var = (pm1) iterator();
        if (!pm1Var.hasNext()) {
            return null;
        }
        Object next = pm1Var.next();
        pm1Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // com.google.android.gms.internal.ads.wm1, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.wm1, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z6) {
        return new sm1(this.f8982v, ((NavigableMap) ((SortedMap) this.s)).headMap(obj, z6));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z6, Object obj2, boolean z7) {
        return new sm1(this.f8982v, ((NavigableMap) ((SortedMap) this.s)).subMap(obj, z6, obj2, z7));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z6) {
        return new sm1(this.f8982v, ((NavigableMap) ((SortedMap) this.s)).tailMap(obj, z6));
    }
}
