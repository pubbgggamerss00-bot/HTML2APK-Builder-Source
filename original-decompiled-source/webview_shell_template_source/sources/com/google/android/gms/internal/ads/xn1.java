package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xn1 extends bn1 implements Serializable {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f10648t;

    public xn1(Object obj, List list) {
        this.s = obj;
        this.f10648t = list;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10648t;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
