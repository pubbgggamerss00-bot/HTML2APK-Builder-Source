package com.google.android.gms.internal.consent_sdk;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h8 implements Map.Entry, Comparable {
    public final Comparable s;

    /* renamed from: t, reason: collision with root package name */
    public Object f11769t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k8 f11770u;

    public h8(k8 k8Var, Comparable comparable, Object obj) {
        this.f11770u = k8Var;
        this.s = comparable;
        this.f11769t = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.s.compareTo(((h8) obj).s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.s;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f11769t;
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
        return this.f11769t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.s;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f11769t;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i6 = k8.f11801y;
        this.f11770u.h();
        Object obj2 = this.f11769t;
        this.f11769t = obj;
        return obj2;
    }

    public final String toString() {
        return androidx.activity.m.d(String.valueOf(this.s), "=", String.valueOf(this.f11769t));
    }
}
