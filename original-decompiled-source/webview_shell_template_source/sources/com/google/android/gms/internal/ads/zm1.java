package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class zm1 extends AbstractCollection implements List {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public Collection f11344t;

    /* renamed from: u, reason: collision with root package name */
    public final zm1 f11345u;

    /* renamed from: v, reason: collision with root package name */
    public final Collection f11346v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ an1 f11347w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ an1 f11348x;

    public zm1(an1 an1Var, Object obj, List list, zm1 zm1Var) {
        this.f11348x = an1Var;
        this.f11347w = an1Var;
        this.s = obj;
        this.f11344t = list;
        this.f11345u = zm1Var;
        this.f11346v = zm1Var == null ? null : zm1Var.f11344t;
    }

    @Override // java.util.List
    public final void add(int i6, Object obj) {
        zzb();
        boolean zIsEmpty = this.f11344t.isEmpty();
        ((List) this.f11344t).add(i6, obj);
        this.f11348x.f2802w++;
        if (zIsEmpty) {
            c();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f11344t).addAll(i6, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f11348x.f2802w += this.f11344t.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }

    public final void c() {
        zm1 zm1Var = this.f11345u;
        if (zm1Var != null) {
            zm1Var.c();
            return;
        }
        this.f11347w.f2801v.put(this.s, this.f11344t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f11344t.clear();
        this.f11347w.f2802w -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        zzb();
        return this.f11344t.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f11344t.containsAll(collection);
    }

    public final void d() {
        zm1 zm1Var = this.f11345u;
        if (zm1Var != null) {
            zm1Var.d();
        } else if (this.f11344t.isEmpty()) {
            this.f11347w.f2801v.remove(this.s);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f11344t.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i6) {
        zzb();
        return ((List) this.f11344t).get(i6);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        zzb();
        return this.f11344t.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f11344t).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        zzb();
        return new xm1(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f11344t).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new ym1(this);
    }

    @Override // java.util.List
    public final Object remove(int i6) {
        zzb();
        Object objRemove = ((List) this.f11344t).remove(i6);
        an1 an1Var = this.f11348x;
        an1Var.f2802w--;
        d();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f11344t.removeAll(collection);
        if (zRemoveAll) {
            this.f11347w.f2802w += this.f11344t.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f11344t.retainAll(collection);
        if (zRetainAll) {
            this.f11347w.f2802w += this.f11344t.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i6, Object obj) {
        zzb();
        return ((List) this.f11344t).set(i6, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzb();
        return this.f11344t.size();
    }

    @Override // java.util.List
    public final List subList(int i6, int i7) {
        zzb();
        List listSubList = ((List) this.f11344t).subList(i6, i7);
        zm1 zm1Var = this.f11345u;
        if (zm1Var == null) {
            zm1Var = this;
        }
        boolean z6 = listSubList instanceof RandomAccess;
        Object obj = this.s;
        an1 an1Var = this.f11348x;
        return z6 ? new tm1(an1Var, obj, listSubList, zm1Var) : new zm1(an1Var, obj, listSubList, zm1Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f11344t.toString();
    }

    public final void zzb() {
        zm1 zm1Var = this.f11345u;
        if (zm1Var != null) {
            zm1Var.zzb();
            if (zm1Var.f11344t != this.f11346v) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f11344t.isEmpty()) {
            Collection collection = (Collection) this.f11347w.f2801v.get(this.s);
            if (collection != null) {
                this.f11344t = collection;
            }
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i6) {
        zzb();
        return new ym1(this, i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f11344t.remove(obj);
        if (zRemove) {
            an1 an1Var = this.f11347w;
            an1Var.f2802w--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f11344t.isEmpty();
        boolean zAdd = this.f11344t.add(obj);
        if (zAdd) {
            this.f11347w.f2802w++;
            if (zIsEmpty) {
                c();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f11344t.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f11347w.f2802w += this.f11344t.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }
}
