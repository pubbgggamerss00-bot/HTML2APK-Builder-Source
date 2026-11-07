package qg;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class k0 extends j0 {
    public static Object c(Object obj, Map map) {
        kotlin.jvm.internal.r.e(map, "<this>");
        if (map instanceof i0) {
            return ((i0) map).b();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static <K, V> Map<K, V> d(pg.n<? extends K, ? extends V>... nVarArr) {
        if (nVarArr.length <= 0) {
            return a0.f22708a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.a(nVarArr.length));
        h(linkedHashMap, nVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap e(pg.n... nVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.a(nVarArr.length));
        h(linkedHashMap, nVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap f(Map map, Map map2) {
        kotlin.jvm.internal.r.e(map, "<this>");
        kotlin.jvm.internal.r.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> g(Map<? extends K, ? extends V> map, pg.n<? extends K, ? extends V> nVar) {
        if (map.isEmpty()) {
            return j0.b(nVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(nVar.f21469a, nVar.f21470b);
        return linkedHashMap;
    }

    public static final void h(AbstractMap abstractMap, pg.n[] nVarArr) {
        for (pg.n nVar : nVarArr) {
            abstractMap.put(nVar.f21469a, nVar.f21470b);
        }
    }

    public static Map i(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return a0.f22708a;
        }
        if (size == 1) {
            return j0.b((pg.n) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.a(arrayList.size()));
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            pg.n nVar = (pg.n) obj;
            linkedHashMap.put(nVar.f21469a, nVar.f21470b);
        }
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> j(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.r.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return a0.f22708a;
        }
        if (size != 1) {
            return k(map);
        }
        kotlin.jvm.internal.r.e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.r.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap k(Map map) {
        kotlin.jvm.internal.r.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
