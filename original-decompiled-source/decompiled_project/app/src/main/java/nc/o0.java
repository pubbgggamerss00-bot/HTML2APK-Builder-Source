package nc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import nc.r;

/* loaded from: classes2.dex */
public abstract class o0<T> implements Comparator<T> {
    public static <T> o0<T> a(Comparator<T> comparator) {
        return comparator instanceof o0 ? (o0) comparator : new h(comparator);
    }

    public final u0 b(Collection collection) {
        Collection collection2;
        r.a aVar = r.f18735b;
        if (collection instanceof Collection) {
            collection2 = collection;
        } else {
            Iterator<T> it = collection.iterator();
            ArrayList arrayList = new ArrayList();
            j0.a(arrayList, it);
            collection2 = arrayList;
        }
        Object[] array = collection2.toArray();
        h1.m.c(array.length, array);
        Arrays.sort(array, this);
        return r.i(array.length, array);
    }

    public <S extends T> o0<S> c() {
        return new z0(this);
    }
}
