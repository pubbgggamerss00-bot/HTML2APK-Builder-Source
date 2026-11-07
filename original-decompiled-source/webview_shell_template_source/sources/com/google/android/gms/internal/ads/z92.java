package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z92 extends v92 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11232b = 0;

    static {
        y92.a(Collections.EMPTY_MAP);
    }

    public static ej0 a(int i6) {
        return new ej0(i6);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        Map map = this.f9761a;
        LinkedHashMap linkedHashMapC = ov1.c(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapC.put(entry.getKey(), ((ca2) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapC);
    }
}
