package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e72 implements Map.Entry, Comparable {
    public final Comparable s;

    /* renamed from: t, reason: collision with root package name */
    public Object f4151t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j72 f4152u;

    public e72(j72 j72Var, Comparable comparable, Object obj) {
        this.f4152u = j72Var;
        this.s = comparable;
        this.f4151t = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.s.compareTo(((e72) obj).s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.s;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f4151t;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4151t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.s;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4151t;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i6 = j72.f5962y;
        this.f4152u.h();
        Object obj2 = this.f4151t;
        this.f4151t = obj;
        return obj2;
    }

    public final String toString() {
        return androidx.activity.m.d(String.valueOf(this.s), "=", String.valueOf(this.f4151t));
    }
}
