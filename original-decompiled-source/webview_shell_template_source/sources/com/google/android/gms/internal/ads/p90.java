package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p90 implements Runnable {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f7997t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7998u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s90 f7999v;

    public p90(s90 s90Var, String str, String str2, int i6) {
        this.s = str;
        this.f7997t = str2;
        this.f7998u = i6;
        this.f7999v = s90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.s);
        map.put("cachedSrc", this.f7997t);
        map.put("totalBytes", Integer.toString(this.f7998u));
        s90.h(this.f7999v, map);
    }
}
