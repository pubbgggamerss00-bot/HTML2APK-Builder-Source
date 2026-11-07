package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class eo1 implements Map, Serializable {
    public transient go1 s;

    /* renamed from: t, reason: collision with root package name */
    public transient go1 f4362t;

    /* renamed from: u, reason: collision with root package name */
    public transient wn1 f4363u;

    public static ip1 b(HashMap map) {
        int size;
        Object[] objArr;
        int length;
        int size2;
        Set<Map.Entry> setEntrySet = map.entrySet();
        do1 do1Var = new do1(setEntrySet != null ? setEntrySet.size() : 4);
        if (setEntrySet != null && (size2 = (size = setEntrySet.size()) + size) > (length = (objArr = do1Var.f3980a).length)) {
            do1Var.f3980a = Arrays.copyOf(objArr, me.o(length, size2));
        }
        for (Map.Entry entry : setEntrySet) {
            do1Var.a(entry.getKey(), entry.getValue());
        }
        return do1Var.b();
    }

    public abstract hp1 a();

    public abstract fp1 c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        wn1 wn1VarA = this.f4363u;
        if (wn1VarA == null) {
            wn1VarA = a();
            this.f4363u = wn1VarA;
        }
        return wn1VarA.contains(obj);
    }

    public abstract gp1 d();

    @Override // java.util.Map
    public final Set entrySet() {
        go1 go1Var = this.s;
        if (go1Var != null) {
            return go1Var;
        }
        fp1 fp1VarC = c();
        this.s = fp1VarC;
        return fp1VarC;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return uo1.a(obj, this);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        go1 go1VarC = this.s;
        if (go1VarC == null) {
            go1VarC = c();
            this.s = go1VarC;
        }
        return rj1.a(go1VarC);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        go1 go1Var = this.f4362t;
        if (go1Var != null) {
            return go1Var;
        }
        gp1 gp1VarD = d();
        this.f4362t = gp1VarD;
        return gp1VarD;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        en1.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        wn1 wn1Var = this.f4363u;
        if (wn1Var != null) {
            return wn1Var;
        }
        hp1 hp1VarA = a();
        this.f4363u = hp1VarA;
        return hp1VarA;
    }
}
