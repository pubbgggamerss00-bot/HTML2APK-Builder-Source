package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class op1 extends AbstractCollection implements Set {
    public final Set s;

    /* renamed from: t, reason: collision with root package name */
    public final tl1 f7837t;

    public op1(Set set, tl1 tl1Var) {
        this.s = set;
        this.f7837t = tl1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        sl1.d(this.f7837t.zza(obj));
        return this.s.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sl1.d(this.f7837t.zza(it.next()));
        }
        return this.s.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.s;
        boolean z6 = set instanceof RandomAccess;
        tl1 tl1Var = this.f7837t;
        if (!z6 || !(set instanceof List)) {
            Iterator it = set.iterator();
            tl1Var.getClass();
            while (it.hasNext()) {
                if (tl1Var.zza(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        tl1Var.getClass();
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object obj = list.get(i7);
            if (!tl1Var.zza(obj)) {
                if (i7 > i6) {
                    try {
                        list.set(i6, obj);
                    } catch (IllegalArgumentException unused) {
                        ed0.r(list, tl1Var, i6, i7);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        ed0.r(list, tl1Var, i6, i7);
                        return;
                    }
                }
                i6++;
            }
        }
        list.subList(i6, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.s;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f7837t.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return rj1.q(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return rj1.a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.s.iterator();
        tl1 tl1Var = this.f7837t;
        sl1.c("predicate", tl1Var);
        int i6 = 0;
        while (it.hasNext()) {
            if (tl1Var.zza(it.next())) {
                return i6 == -1;
            }
            i6++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.s.iterator();
        it.getClass();
        tl1 tl1Var = this.f7837t;
        tl1Var.getClass();
        return new ho1(it, tl1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.s.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.s.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f7837t.zza(next) && collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.s.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f7837t.zza(next) && !collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.s.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (this.f7837t.zza(it.next())) {
                i6++;
            }
        }
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        ho1 ho1Var = (ho1) it;
        while (ho1Var.hasNext()) {
            arrayList.add(ho1Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        ho1 ho1Var = (ho1) it;
        while (ho1Var.hasNext()) {
            arrayList.add(ho1Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
