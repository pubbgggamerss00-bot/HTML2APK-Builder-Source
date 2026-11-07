package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q90 implements Runnable {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f8276t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f8277u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s90 f8278v;

    public q90(s90 s90Var, String str, String str2, long j6) {
        this.s = str;
        this.f8276t = str2;
        this.f8277u = j6;
        this.f8278v = s90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.s);
        map.put("cachedSrc", this.f8276t);
        map.put("totalDuration", Long.toString(this.f8277u));
        s90.h(this.f8278v, map);
    }
}
