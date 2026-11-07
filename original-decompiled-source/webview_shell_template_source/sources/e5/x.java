package e5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class x extends w {
    public static final void j(LinkedHashMap linkedHashMap, d5.c[] cVarArr) {
        for (d5.c cVar : cVarArr) {
            linkedHashMap.put(cVar.s, cVar.f12739t);
        }
    }

    public static Map k(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return t.s;
        }
        if (size == 1) {
            d5.c cVar = (d5.c) arrayList.get(0);
            kotlin.jvm.internal.j.e("pair", cVar);
            Map mapSingletonMap = Collections.singletonMap(cVar.s, cVar.f12739t);
            kotlin.jvm.internal.j.d("singletonMap(...)", mapSingletonMap);
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w.i(arrayList.size()));
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj = arrayList.get(i6);
            i6++;
            d5.c cVar2 = (d5.c) obj;
            linkedHashMap.put(cVar2.s, cVar2.f12739t);
        }
        return linkedHashMap;
    }
}
