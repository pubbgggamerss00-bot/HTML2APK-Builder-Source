package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vi0 implements wi0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9878a;

    public vi0(Map map) {
        this.f9878a = map;
    }

    @Override // com.google.android.gms.internal.ads.wi0
    public final yz0 a(int i6, String str) {
        return (yz0) this.f9878a.get(str);
    }
}
