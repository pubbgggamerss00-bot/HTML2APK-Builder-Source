package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ne extends me {

    /* renamed from: t, reason: collision with root package name */
    public String f7425t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7426u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7427v;

    /* renamed from: w, reason: collision with root package name */
    public final String f7428w;

    /* renamed from: x, reason: collision with root package name */
    public final String f7429x;

    public ne() {
        super(0);
        this.f7425t = "E";
        this.f7426u = -1L;
        this.f7427v = "E";
        this.f7428w = "E";
        this.f7429x = "E";
    }

    @Override // com.google.android.gms.internal.ads.me
    public final HashMap k() {
        HashMap map = new HashMap();
        map.put(0, this.f7425t);
        map.put(4, this.f7429x);
        map.put(3, this.f7428w);
        map.put(2, this.f7427v);
        map.put(1, Long.valueOf(this.f7426u));
        return map;
    }

    public ne(String str) {
        super(0);
        this.f7425t = "E";
        this.f7426u = -1L;
        this.f7427v = "E";
        this.f7428w = "E";
        this.f7429x = "E";
        HashMap mapD = me.d(str);
        if (mapD != null) {
            this.f7425t = mapD.get(0) == null ? "E" : (String) mapD.get(0);
            this.f7426u = mapD.get(1) != null ? ((Long) mapD.get(1)).longValue() : -1L;
            this.f7427v = mapD.get(2) == null ? "E" : (String) mapD.get(2);
            this.f7428w = mapD.get(3) == null ? "E" : (String) mapD.get(3);
            this.f7429x = mapD.get(4) != null ? (String) mapD.get(4) : "E";
        }
    }
}
