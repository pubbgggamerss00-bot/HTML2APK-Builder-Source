package org.jf.util;

import i0.u2;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import lc.l;
import nc.n0;
import nc.y;

/* loaded from: classes3.dex */
public class CollectionUtils {
    public static <T> int compareAsIterable(Comparator<? super T> comparator, Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Iterator<? extends T> it = iterable2.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            try {
                int iCompare = comparator.compare(it2.next(), it.next());
                if (iCompare != 0) {
                    return iCompare;
                }
            } catch (NoSuchElementException unused) {
                return 1;
            }
        }
        return it.hasNext() ? -1 : 0;
    }

    public static <T extends Comparable<? super T>> int compareAsList(Collection<? extends T> collection, Collection<? extends T> collection2) {
        int iC = u2.c(collection.size(), collection2.size());
        if (iC != 0) {
            return iC;
        }
        Iterator<? extends T> it = collection2.iterator();
        Iterator<? extends T> it2 = collection.iterator();
        while (it2.hasNext()) {
            int iCompareTo = it2.next().compareTo(it.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public static <T extends Comparable<T>> int compareAsSet(Collection<? extends T> collection, Collection<? extends T> collection2) {
        int iC = u2.c(collection.size(), collection2.size());
        if (iC != 0) {
            return iC;
        }
        toNaturalSortedSet(collection);
        toNaturalSortedSet(collection2);
        Iterator<? extends T> it = collection2.iterator();
        Iterator<? extends T> it2 = collection.iterator();
        while (it2.hasNext()) {
            int iCompareTo = it2.next().compareTo(it.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public static <T> boolean isNaturalSortedSet(Iterable<? extends T> iterable) {
        if (!(iterable instanceof SortedSet)) {
            return false;
        }
        Comparator comparator = ((SortedSet) iterable).comparator();
        return comparator == null || comparator.equals(n0.f18723a);
    }

    public static <T> boolean isSortedSet(Comparator<? extends T> comparator, Iterable<? extends T> iterable) {
        if (!(iterable instanceof SortedSet)) {
            return false;
        }
        Comparator comparator2 = ((SortedSet) iterable).comparator();
        return comparator2 == null ? comparator.equals(n0.f18723a) : comparator.equals(comparator2);
    }

    public static <T> int lastIndexOf(Iterable<T> iterable, l<? super T> lVar) {
        Iterator<T> it = iterable.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            if (lVar.apply(it.next())) {
                i11 = i10;
            }
            i10++;
        }
        return i11;
    }

    public static <T> Comparator<Collection<? extends T>> listComparator(final Comparator<? super T> comparator) {
        return new Comparator<Collection<? extends T>>() { // from class: org.jf.util.CollectionUtils.1
            @Override // java.util.Comparator
            public int compare(Collection<? extends T> collection, Collection<? extends T> collection2) {
                return CollectionUtils.compareAsList(comparator, collection, collection2);
            }
        };
    }

    public static <T> int listHashCode(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public static <T> Comparator<Collection<? extends T>> setComparator(final Comparator<? super T> comparator) {
        return new Comparator<Collection<? extends T>>() { // from class: org.jf.util.CollectionUtils.2
            @Override // java.util.Comparator
            public int compare(Collection<? extends T> collection, Collection<? extends T> collection2) {
                return CollectionUtils.compareAsSet(comparator, collection, collection2);
            }
        };
    }

    private static <T> SortedSet<? extends T> toNaturalSortedSet(Collection<? extends T> collection) {
        if (isNaturalSortedSet(collection)) {
            return (SortedSet) collection;
        }
        int i10 = y.f18789f;
        return y.q(n0.f18723a, collection);
    }

    private static <T> SortedSet<? extends T> toSortedSet(Comparator<? super T> comparator, Collection<? extends T> collection) {
        SortedSet<? extends T> sortedSet;
        Comparator<? super Object> comparator2;
        return ((collection instanceof SortedSet) && (comparator2 = (sortedSet = (SortedSet) collection).comparator()) != null && comparator2.equals(comparator)) ? sortedSet : y.q(comparator, collection);
    }

    public static <T> int compareAsList(Comparator<? super T> comparator, Collection<? extends T> collection, Collection<? extends T> collection2) {
        int iC = u2.c(collection.size(), collection2.size());
        if (iC != 0) {
            return iC;
        }
        Iterator<? extends T> it = collection2.iterator();
        Iterator<? extends T> it2 = collection.iterator();
        while (it2.hasNext()) {
            int iCompare = comparator.compare(it2.next(), it.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> int compareAsIterable(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Iterator<? extends T> it = iterable2.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            try {
                int iCompareTo = it2.next().compareTo(it.next());
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            } catch (NoSuchElementException unused) {
                return 1;
            }
        }
        return it.hasNext() ? -1 : 0;
    }

    public static <T> int compareAsSet(Comparator<? super T> comparator, Collection<? extends T> collection, Collection<? extends T> collection2) {
        int iC = u2.c(collection.size(), collection2.size());
        if (iC != 0) {
            return iC;
        }
        SortedSet sortedSet = toSortedSet(comparator, collection);
        Iterator it = toSortedSet(comparator, collection2).iterator();
        Iterator it2 = sortedSet.iterator();
        while (it2.hasNext()) {
            int iCompare = comparator.compare((Object) it2.next(), (Object) it.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }
}
