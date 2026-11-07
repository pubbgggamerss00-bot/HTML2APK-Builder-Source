package e5;

import com.google.android.gms.ads.RequestConfiguration;
import e5.a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class q extends p {
    public static List f(ArrayList arrayList) {
        return k(new LinkedHashSet(arrayList));
    }

    public static final void g(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, p5.l lVar) {
        sb.append(charSequence2);
        int i6 = 0;
        for (Object obj : collection) {
            i6++;
            if (i6 > 1) {
                sb.append(charSequence);
            }
            a1.a.b(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static String h(Collection collection, String str, a.C0055a c0055a, int i6) {
        int i7 = i6 & 2;
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String str3 = i7 != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "[";
        if ((i6 & 4) == 0) {
            str2 = "]";
        }
        String str4 = str2;
        if ((i6 & 32) != 0) {
            c0055a = null;
        }
        StringBuilder sb = new StringBuilder();
        g(collection, sb, str, str3, str4, "...", c0055a);
        String string = sb.toString();
        kotlin.jvm.internal.j.d("toString(...)", string);
        return string;
    }

    public static List i(List list) {
        if (list.size() <= 1) {
            return k(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.j.e("<this>", comparableArr);
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        kotlin.jvm.internal.j.e("<this>", array);
        List listAsList = Arrays.asList(array);
        kotlin.jvm.internal.j.d("asList(...)", listAsList);
        return listAsList;
    }

    public static final void j(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static <T> List<T> k(Iterable<? extends T> iterable) {
        ArrayList arrayList;
        kotlin.jvm.internal.j.e("<this>", iterable);
        boolean z6 = iterable instanceof Collection;
        if (z6) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                return k.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
        } else {
            if (z6) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                j(iterable, arrayList);
            }
            int size2 = arrayList.size();
            if (size2 != 0) {
                return size2 != 1 ? arrayList : k.a(arrayList.get(0));
            }
        }
        return s.s;
    }

    public static Set l(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return u.s;
        }
        if (size == 1) {
            return j3.b.d(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.i(collection.size()));
        j(collection, linkedHashSet);
        return linkedHashSet;
    }
}
