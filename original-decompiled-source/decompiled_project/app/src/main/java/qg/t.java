package qg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class t extends s {
    public static void p(Iterable elements, Collection collection) {
        kotlin.jvm.internal.r.e(collection, "<this>");
        kotlin.jvm.internal.r.e(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void q(Collection collection, Object[] elements) {
        kotlin.jvm.internal.r.e(collection, "<this>");
        kotlin.jvm.internal.r.e(elements, "elements");
        collection.addAll(m.a(elements));
    }

    public static void r(eh.l predicate, List list) {
        int i10;
        kotlin.jvm.internal.r.e(list, "<this>");
        kotlin.jvm.internal.r.e(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof fh.a) && !(list instanceof fh.b)) {
                kotlin.jvm.internal.m0.d(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int i11 = p.i(list);
        int i12 = 0;
        if (i11 >= 0) {
            int i13 = 0;
            while (true) {
                Object obj = list.get(i12);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i13 != i12) {
                        list.set(i13, obj);
                    }
                    i13++;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
            i12 = i13;
        }
        if (i12 >= list.size() || i12 > (i10 = p.i(list))) {
            return;
        }
        while (true) {
            list.remove(i10);
            if (i10 == i12) {
                return;
            } else {
                i10--;
            }
        }
    }

    public static Object s(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object t(List list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(p.i(list));
    }

    public static void u(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void v(List list, Comparator comparator) {
        kotlin.jvm.internal.r.e(list, "<this>");
        kotlin.jvm.internal.r.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
