package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pp1 extends op1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.s).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.s.iterator();
        it.getClass();
        tl1 tl1Var = this.f7837t;
        tl1Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (tl1Var.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new pp1(((SortedSet) this.s).headSet(obj), this.f7837t);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.s;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f7837t.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new pp1(((SortedSet) this.s).subSet(obj, obj2), this.f7837t);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new pp1(((SortedSet) this.s).tailSet(obj), this.f7837t);
    }
}
