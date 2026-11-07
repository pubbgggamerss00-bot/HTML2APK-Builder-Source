package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zv1 extends un1 {

    /* renamed from: t, reason: collision with root package name */
    public final Map f11589t;

    public zv1(Map map) {
        super(6);
        this.f11589t = map;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final /* synthetic */ Object c() {
        return this.f11589t;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f11589t.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = entrySet().iterator();
        po1 po1Var = new po1(it);
        if (obj == null) {
            while (it.hasNext()) {
                if (po1Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(po1Var.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return rj1.o(this.f11589t.entrySet(), new ev1(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && uo1.a(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f11589t.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return rj1.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f11589t;
        if (map.isEmpty()) {
            return true;
        }
        return super.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return rj1.o(this.f11589t.keySet(), new ev1(1));
    }

    @Override // com.google.android.gms.internal.ads.un1, java.util.Map
    public final int size() {
        return super.size() - (this.f11589t.containsKey(null) ? 1 : 0);
    }
}
