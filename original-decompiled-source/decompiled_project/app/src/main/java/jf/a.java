package jf;

import cf.l;
import cf.t;
import cf.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class a<E> implements List<E> {

    /* renamed from: a, reason: collision with root package name */
    public final cf.a f15708a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15709b;

    /* renamed from: c, reason: collision with root package name */
    public t f15710c;

    /* renamed from: d, reason: collision with root package name */
    public final l f15711d;

    public a() {
        this.f15708a = new cf.a();
        this.f15709b = new ArrayList();
    }

    public static ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (E e10 : collection) {
            if (e10 instanceof String) {
                arrayList.add(new u((String) e10));
            } else {
                arrayList.add(((c) e10).Z());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public final boolean add(E e10) {
        t tVar = this.f15710c;
        cf.a aVar = this.f15708a;
        if (tVar != null) {
            tVar.O0(this.f15711d, aVar);
            this.f15710c = null;
        }
        if (e10 instanceof String) {
            aVar.g0(new u((String) e10));
        } else if (aVar != null) {
            aVar.g0(((c) e10).Z());
        }
        return this.f15709b.add(e10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        t tVar = this.f15710c;
        cf.a aVar = this.f15708a;
        if (tVar != null && collection.size() > 0) {
            this.f15710c.O0(this.f15711d, aVar);
            this.f15710c = null;
        }
        aVar.f5416b.addAll(a(collection));
        return this.f15709b.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        t tVar = this.f15710c;
        if (tVar != null) {
            tVar.L0(this.f15711d);
        }
        this.f15709b.clear();
        this.f15708a.f5416b.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15709b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f15709b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f15709b.equals(obj);
    }

    @Override // java.util.List
    public final E get(int i10) {
        return (E) this.f15709b.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f15709b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f15709b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f15709b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.f15709b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f15709b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.f15709b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        ArrayList arrayList = this.f15709b;
        int iIndexOf = arrayList.indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        arrayList.remove(iIndexOf);
        this.f15708a.q0(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            cf.b bVarZ = ((c) it.next()).Z();
            cf.a aVar = this.f15708a;
            for (int size = aVar.f5416b.size() - 1; size >= 0; size--) {
                if (bVarZ.equals(aVar.l0(size))) {
                    aVar.q0(size);
                }
            }
        }
        return this.f15709b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            cf.b bVarZ = ((c) it.next()).Z();
            cf.a aVar = this.f15708a;
            for (int size = aVar.f5416b.size() - 1; size >= 0; size--) {
                if (!bVarZ.equals(aVar.l0(size))) {
                    aVar.q0(size);
                }
            }
        }
        return this.f15709b.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final E set(int i10, E e10) {
        boolean z10 = e10 instanceof String;
        cf.a aVar = this.f15708a;
        l lVar = this.f15711d;
        if (z10) {
            u uVar = new u((String) e10);
            t tVar = this.f15710c;
            if (tVar != null && i10 == 0) {
                tVar.O0(lVar, uVar);
            }
            aVar.y0(i10, uVar);
        } else {
            t tVar2 = this.f15710c;
            if (tVar2 != null && i10 == 0) {
                tVar2.O0(lVar, ((c) e10).Z());
            }
            aVar.y0(i10, ((c) e10).Z());
        }
        return (E) this.f15709b.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f15709b.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i10, int i11) {
        return this.f15709b.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f15709b.toArray();
    }

    public final String toString() {
        return "COSArrayList{" + this.f15708a.toString() + "}";
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i10) {
        return this.f15709b.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final <X> X[] toArray(X[] xArr) {
        return (X[]) this.f15709b.toArray(xArr);
    }

    public a(l lVar, l lVar2, t tVar, l lVar3) {
        cf.a aVar = new cf.a();
        this.f15708a = aVar;
        aVar.g0(lVar2);
        ArrayList arrayList = new ArrayList();
        this.f15709b = arrayList;
        arrayList.add(lVar);
        this.f15710c = tVar;
        this.f15711d = lVar3;
    }

    @Override // java.util.List
    public final E remove(int i10) {
        this.f15708a.q0(i10);
        return (E) this.f15709b.remove(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final void add(int i10, E e10) {
        t tVar = this.f15710c;
        cf.a aVar = this.f15708a;
        if (tVar != null) {
            tVar.O0(this.f15711d, aVar);
            this.f15710c = null;
        }
        this.f15709b.add(i10, e10);
        if (e10 instanceof String) {
            aVar.f5416b.add(i10, new u((String) e10));
        } else {
            aVar.f5416b.add(i10, ((c) e10).Z());
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        t tVar = this.f15710c;
        cf.a aVar = this.f15708a;
        if (tVar != null && collection.size() > 0) {
            this.f15710c.O0(this.f15711d, aVar);
            this.f15710c = null;
        }
        aVar.f5416b.addAll(i10, a(collection));
        return this.f15709b.addAll(i10, collection);
    }
}
