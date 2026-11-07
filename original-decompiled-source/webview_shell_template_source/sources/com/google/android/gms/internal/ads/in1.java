package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class in1 extends AbstractSet {
    public final /* synthetic */ nn1 s;

    public in1(nn1 nn1Var) {
        this.s = nn1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        nn1 nn1Var = this.s;
        Map mapD = nn1Var.d();
        if (mapD != null) {
            return mapD.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iH = nn1Var.h(entry.getKey());
            if (iH != -1 && aa1.k(nn1Var.c()[iH], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        nn1 nn1Var = this.s;
        Map mapD = nn1Var.d();
        return mapD != null ? mapD.entrySet().iterator() : new gn1(nn1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        nn1 nn1Var = this.s;
        Map mapD = nn1Var.d();
        if (mapD != null) {
            return mapD.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (nn1Var.f()) {
            return false;
        }
        int iG = nn1Var.g();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = nn1Var.s;
        Objects.requireNonNull(obj2);
        int iA = on1.a(key, value, iG, obj2, nn1Var.a(), nn1Var.b(), nn1Var.c());
        if (iA == -1) {
            return false;
        }
        nn1Var.e(iA, iG);
        nn1Var.f7475x--;
        nn1Var.f7474w += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.size();
    }
}
