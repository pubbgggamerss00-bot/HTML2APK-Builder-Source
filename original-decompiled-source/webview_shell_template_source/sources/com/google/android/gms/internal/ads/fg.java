package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fg extends me {
    public final Long A;
    public final Long B;
    public final Long C;
    public final Long D;

    /* renamed from: t, reason: collision with root package name */
    public final Long f4644t;

    /* renamed from: u, reason: collision with root package name */
    public final Long f4645u;

    /* renamed from: v, reason: collision with root package name */
    public final Long f4646v;

    /* renamed from: w, reason: collision with root package name */
    public final Long f4647w;

    /* renamed from: x, reason: collision with root package name */
    public final Long f4648x;

    /* renamed from: y, reason: collision with root package name */
    public final Long f4649y;

    /* renamed from: z, reason: collision with root package name */
    public final Long f4650z;

    public fg(String str) {
        super(0);
        HashMap mapD = me.d(str);
        if (mapD != null) {
            this.f4644t = (Long) mapD.get(0);
            this.f4645u = (Long) mapD.get(1);
            this.f4646v = (Long) mapD.get(2);
            this.f4647w = (Long) mapD.get(3);
            this.f4648x = (Long) mapD.get(4);
            this.f4649y = (Long) mapD.get(5);
            this.f4650z = (Long) mapD.get(6);
            this.A = (Long) mapD.get(7);
            this.B = (Long) mapD.get(8);
            this.C = (Long) mapD.get(9);
            this.D = (Long) mapD.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final HashMap k() {
        HashMap map = new HashMap();
        map.put(0, this.f4644t);
        map.put(1, this.f4645u);
        map.put(2, this.f4646v);
        map.put(3, this.f4647w);
        map.put(4, this.f4648x);
        map.put(5, this.f4649y);
        map.put(6, this.f4650z);
        map.put(7, this.A);
        map.put(8, this.B);
        map.put(9, this.C);
        map.put(10, this.D);
        return map;
    }
}
