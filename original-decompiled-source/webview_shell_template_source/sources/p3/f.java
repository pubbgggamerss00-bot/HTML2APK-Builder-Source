package p3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class f extends b implements List, RandomAccess {

    /* renamed from: t, reason: collision with root package name */
    public static final c f14089t = new c(h.f14090w, 0);

    @Override // java.util.List
    @Deprecated
    public final void add(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i6, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i6 = 0; i6 < size; i6++) {
                        if (Objects.equals(get(i6), list.get(i6))) {
                        }
                    }
                    return true;
                }
                c cVarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (cVarListIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(cVarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p3.b
    public int f(Object[] objArr) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            objArr[i6] = get(i6);
        }
        return size;
    }

    public f g() {
        return size() <= 1 ? this : new d(this);
    }

    @Override // java.util.List
    /* renamed from: h */
    public f subList(int i6, int i7) {
        l.b(i6, i7, size());
        int i8 = i7 - i6;
        return i8 == size() ? this : i8 == 0 ? h.f14090w : new e(this, i6, i8);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i6 = 0; i6 < size; i6++) {
            iHashCode = (iHashCode * 31) + get(i6).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final c listIterator(int i6) {
        int size = size();
        if (i6 < 0 || i6 > size) {
            throw new IndexOutOfBoundsException(l.c(i6, size, "index"));
        }
        return isEmpty() ? f14089t : new c(this, i6);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (obj.equals(get(i6))) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }
}
