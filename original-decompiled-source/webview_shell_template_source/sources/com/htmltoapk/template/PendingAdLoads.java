package com.htmltoapk.template;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class PendingAdLoads {
    private final LinkedHashMap<String, p5.a<d5.j>> loads = new LinkedHashMap<>();

    public final Set<String> clear() {
        Set<String> setKeySet = this.loads.keySet();
        kotlin.jvm.internal.j.d("<get-keys>(...)", setKeySet);
        Set<String> setL = e5.q.l(setKeySet);
        this.loads.clear();
        return setL;
    }

    public final boolean contains(String str) {
        kotlin.jvm.internal.j.e("format", str);
        return this.loads.containsKey(str);
    }

    public final List<p5.a<d5.j>> drain() {
        Collection<p5.a<d5.j>> collectionValues = this.loads.values();
        kotlin.jvm.internal.j.d("<get-values>(...)", collectionValues);
        List<p5.a<d5.j>> listK = e5.q.k(collectionValues);
        this.loads.clear();
        return listK;
    }

    public final boolean put(String str, p5.a<d5.j> aVar) {
        kotlin.jvm.internal.j.e("format", str);
        kotlin.jvm.internal.j.e("action", aVar);
        return this.loads.put(str, aVar) != null;
    }
}
