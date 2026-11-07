package com.google.android.gms.internal.consent_sdk;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g7 implements Map.Entry {
    public final Map.Entry s;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.s.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((i7) this.s.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof v7)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        i7 i7Var = (i7) this.s.getValue();
        v7 v7Var = i7Var.f11777a;
        i7Var.f11778b = null;
        i7Var.f11777a = (v7) obj;
        return v7Var;
    }
}
