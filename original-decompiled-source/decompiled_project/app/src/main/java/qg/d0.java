package qg;

import fh.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class d0 {
    public static <T, K> Map<K, Integer> a(c0<T, ? extends K> c0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = c0Var.b();
        while (itB.hasNext()) {
            K kA = c0Var.a(itB.next());
            Object e0Var = linkedHashMap.get(kA);
            if (e0Var == null && !linkedHashMap.containsKey(kA)) {
                e0Var = new kotlin.jvm.internal.e0();
            }
            kotlin.jvm.internal.e0 e0Var2 = (kotlin.jvm.internal.e0) e0Var;
            e0Var2.f16324a++;
            linkedHashMap.put(kA, e0Var2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.r.c(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            if ((entry instanceof fh.a) && !(entry instanceof c.a)) {
                kotlin.jvm.internal.m0.d(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((kotlin.jvm.internal.e0) entry.getValue()).f16324a));
        }
        return kotlin.jvm.internal.m0.a(linkedHashMap);
    }
}
