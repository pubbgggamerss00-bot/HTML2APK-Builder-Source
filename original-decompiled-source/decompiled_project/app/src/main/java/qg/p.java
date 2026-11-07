package qg;

import i0.x1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class p extends c0.g0 {
    public static ArrayList f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new k(objArr, true));
    }

    public static int g(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        m(arrayList.size(), size);
        int i10 = size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int iB = x1.b((Comparable) arrayList.get(i12), comparable);
            if (iB < 0) {
                i11 = i12 + 1;
            } else {
                if (iB <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static <T> int h(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.r.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static int i(List list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        return list.size() - 1;
    }

    public static List j(Object... elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        return elements.length > 0 ? m.a(elements) : z.f22752a;
    }

    public static ArrayList k(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new k(objArr, true));
    }

    public static final List l(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : c0.g0.c(list.get(0)) : z.f22752a;
    }

    public static final void m(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(ad.b.b(i11, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i11 > i10) {
            throw new IndexOutOfBoundsException(r1.f.a(i11, i10, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void n() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void o() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
