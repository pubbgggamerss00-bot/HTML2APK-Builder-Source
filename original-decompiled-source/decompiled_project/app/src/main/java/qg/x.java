package qg;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import u0.u1;

/* loaded from: classes2.dex */
public class x extends t {
    public static <T> T A(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) B((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T B(List<? extends T> list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T C(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T D(List<? extends T> list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object E(int i10, List list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static <T> int F(Iterable<? extends T> iterable, T t3) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t3);
        }
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 < 0) {
                p.o();
                throw null;
            }
            if (kotlin.jvm.internal.r.a(t3, t10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void G(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, eh.l lVar) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            mh.o.a(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void H(List list, StringBuilder sb, String str, u1 u1Var, int i10) {
        if ((i10 & 64) != 0) {
            u1Var = null;
        }
        G(list, sb, str, "", "", "...", u1Var);
    }

    public static String I(Iterable iterable, CharSequence charSequence, String str, String str2, eh.l lVar, int i10) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i10 & 2) != 0 ? "" : str;
        String str3 = (i10 & 4) != 0 ? "" : str2;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.r.e(iterable, "<this>");
        kotlin.jvm.internal.r.e(separator, "separator");
        kotlin.jvm.internal.r.e(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        G(iterable, sb, separator, prefix, str3, "...", lVar);
        return sb.toString();
    }

    public static <T> T J(List<? extends T> list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(p.i(list));
    }

    public static <T> T K(List<? extends T> list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable L(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable M(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList N(List list, Object obj) {
        kotlin.jvm.internal.r.e(list, "<this>");
        ArrayList arrayList = new ArrayList(p.h(list, 10));
        boolean z10 = false;
        for (Object obj2 : list) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.r.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList O(Iterable elements, Collection collection) {
        kotlin.jvm.internal.r.e(collection, "<this>");
        kotlin.jvm.internal.r.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            t.p(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList P(Object obj, Collection collection) {
        kotlin.jvm.internal.r.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static <T> T Q(Collection<? extends T> collection, hh.c random) {
        kotlin.jvm.internal.r.e(collection, "<this>");
        kotlin.jvm.internal.r.e(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) z(collection, random.c(collection.size()));
    }

    public static <T> List<T> R(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return c0(iterable);
        }
        List<T> listF0 = f0(iterable);
        Collections.reverse(listF0);
        return listF0;
    }

    public static <T> T S(List<? extends T> list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T extends Comparable<? super T>> List<T> T(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listF0 = f0(iterable);
            t.u(listF0);
            return listF0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return c0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.r.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return m.a(array);
    }

    public static List U(Comparator comparator, Iterable iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        kotlin.jvm.internal.r.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listF0 = f0(iterable);
            t.v(listF0, comparator);
            return listF0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return c0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.r.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return m.a(array);
    }

    public static int V(Iterable<Integer> iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public static <T> List<T> W(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(ad.b.b(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return z.f22752a;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return c0(iterable);
            }
            if (i10 == 1) {
                return c0.g0.c(A(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return p.l(arrayList);
    }

    public static List X(int i10, List list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(ad.b.b(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return z.f22752a;
        }
        int size = list.size();
        if (i10 >= size) {
            return c0(list);
        }
        if (i10 == 1) {
            return c0.g0.c(J(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] Y(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            bArr[i10] = ((Number) obj).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final void Z(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] a0(Collection<Float> collection) {
        kotlin.jvm.internal.r.e(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }

    public static int[] b0(List list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> c0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return p.l(f0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z.f22752a;
        }
        if (size != 1) {
            return e0(collection);
        }
        return c0.g0.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] d0(List list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static ArrayList e0(Collection collection) {
        kotlin.jvm.internal.r.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> List<T> f0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return e0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Z(iterable, arrayList);
        return arrayList;
    }

    public static <T> Set<T> g0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Z(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> h0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return n0.g(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(j0.a(collection.size()));
                Z(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Z(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : n0.g(linkedHashSet2.iterator().next());
            }
        }
        return b0.f22711a;
    }

    public static <T> boolean w(Iterable<? extends T> iterable, T t3) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t3) : F(iterable, t3) >= 0;
    }

    public static <T> List<T> x(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        return c0(g0(iterable));
    }

    public static List y(int i10, List list) {
        if (i10 < 0) {
            throw new IllegalArgumentException(ad.b.b(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return c0(list);
        }
        int size = list.size() - i10;
        if (size <= 0) {
            return z.f22752a;
        }
        if (size == 1) {
            return c0.g0.c(J(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i10 < size2) {
                arrayList.add(list.get(i10));
                i10++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static <T> T z(Iterable<? extends T> iterable, final int i10) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        boolean z10 = iterable instanceof List;
        if (z10) {
            return (T) ((List) iterable).get(i10);
        }
        eh.l lVar = new eh.l() { // from class: qg.u
            @Override // eh.l
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i10 + '.');
            }
        };
        if (z10) {
            List list = (List) iterable;
            if (i10 >= 0 && i10 < list.size()) {
                return (T) list.get(i10);
            }
            lVar.invoke(Integer.valueOf(i10));
            throw null;
        }
        if (i10 < 0) {
            lVar.invoke(Integer.valueOf(i10));
            throw null;
        }
        int i11 = 0;
        for (T t3 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t3;
            }
            i11 = i12;
        }
        lVar.invoke(Integer.valueOf(i10));
        throw null;
    }
}
