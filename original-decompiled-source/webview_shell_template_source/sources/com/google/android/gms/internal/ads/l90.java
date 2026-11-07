package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l90 implements Runnable {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f6626t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6627u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6628v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u90 f6629w;

    public l90(u90 u90Var, String str, String str2, int i6, int i7) {
        this.s = str;
        this.f6626t = str2;
        this.f6627u = i6;
        this.f6628v = i7;
        this.f6629w = u90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.s);
        map.put("cachedSrc", this.f6626t);
        map.put("bytesLoaded", Integer.toString(this.f6627u));
        map.put("totalBytes", Integer.toString(this.f6628v));
        map.put("cacheReady", "0");
        s90.h(this.f6629w, map);
    }
}
