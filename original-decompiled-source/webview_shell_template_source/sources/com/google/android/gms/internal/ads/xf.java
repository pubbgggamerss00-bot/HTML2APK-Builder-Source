package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xf extends me {

    /* renamed from: t, reason: collision with root package name */
    public final Long f10552t;

    /* renamed from: u, reason: collision with root package name */
    public final Boolean f10553u;

    /* renamed from: v, reason: collision with root package name */
    public final Boolean f10554v;

    public xf(String str) {
        super(0);
        HashMap mapD = me.d(str);
        if (mapD != null) {
            this.f10552t = (Long) mapD.get(0);
            this.f10553u = (Boolean) mapD.get(1);
            this.f10554v = (Boolean) mapD.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final HashMap k() {
        HashMap map = new HashMap();
        map.put(0, this.f10552t);
        map.put(1, this.f10553u);
        map.put(2, this.f10554v);
        return map;
    }
}
