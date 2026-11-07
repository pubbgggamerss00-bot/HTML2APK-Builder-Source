package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class nm1 extends to1 {

    /* renamed from: u, reason: collision with root package name */
    public final transient Map f7469u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ an1 f7470v;

    public nm1(an1 an1Var, Map map) {
        this.f7470v = an1Var;
        this.f7469u = map;
    }

    public final xn1 a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        xo1 xo1Var = (xo1) this.f7470v;
        xo1Var.getClass();
        List list = (List) collection;
        return new xn1(key, list instanceof RandomAccess ? new tm1(xo1Var, key, list, null) : new zm1(xo1Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f7469u;
        an1 an1Var = this.f7470v;
        if (map == an1Var.f2801v) {
            an1Var.a();
            return;
        }
        mm1 mm1Var = new mm1(this);
        while (mm1Var.hasNext()) {
            mm1Var.next();
            mm1Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f7469u;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f7469u.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f7469u;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        xo1 xo1Var = (xo1) this.f7470v;
        xo1Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new tm1(xo1Var, obj, list, null) : new zm1(xo1Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f7469u.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        an1 an1Var = this.f7470v;
        qm1 qm1Var = an1Var.s;
        if (qm1Var != null) {
            return qm1Var;
        }
        xo1 xo1Var = (xo1) an1Var;
        Map map = xo1Var.f2801v;
        qm1 sm1Var = map instanceof NavigableMap ? new sm1(xo1Var, (NavigableMap) map) : map instanceof SortedMap ? new wm1(xo1Var, (SortedMap) map) : new qm1(xo1Var, map);
        an1Var.s = sm1Var;
        return sm1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f7469u.remove(obj);
        if (collection == null) {
            return null;
        }
        an1 an1Var = this.f7470v;
        List list = (List) ((xo1) an1Var).f10653x.mo7zza();
        list.addAll(collection);
        an1Var.f2802w -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7469u.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f7469u.toString();
    }
}
