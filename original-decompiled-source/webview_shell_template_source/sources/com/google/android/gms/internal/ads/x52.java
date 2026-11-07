package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x52 implements Map.Entry {
    public final Map.Entry s;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.s.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((z52) this.s.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof m62)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        z52 z52Var = (z52) this.s.getValue();
        m62 m62Var = z52Var.f11188a;
        z52Var.f11189b = null;
        z52Var.f11188a = (m62) obj;
        return m62Var;
    }
}
