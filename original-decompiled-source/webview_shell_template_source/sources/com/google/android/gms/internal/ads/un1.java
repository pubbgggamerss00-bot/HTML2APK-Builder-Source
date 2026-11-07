package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class un1 extends me implements Map {
    @Override // java.util.Map
    public final void clear() {
        ((zv1) this).f11589t.clear();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((zv1) this).f11589t.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((zv1) this).f11589t.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((zv1) this).f11589t.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((zv1) this).f11589t.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((zv1) this).f11589t.values();
    }
}
