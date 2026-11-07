package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o90 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ x90 B;
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f7648t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7649u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7650v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f7651w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f7652x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f7653y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f7654z;

    public o90(x90 x90Var, String str, String str2, int i6, int i7, long j6, long j7, boolean z6, int i8, int i9) {
        this.s = str;
        this.f7648t = str2;
        this.f7649u = i6;
        this.f7650v = i7;
        this.f7651w = j6;
        this.f7652x = j7;
        this.f7653y = z6;
        this.f7654z = i8;
        this.A = i9;
        this.B = x90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.s);
        map.put("cachedSrc", this.f7648t);
        map.put("bytesLoaded", Integer.toString(this.f7649u));
        map.put("totalBytes", Integer.toString(this.f7650v));
        map.put("bufferedDuration", Long.toString(this.f7651w));
        map.put("totalDuration", Long.toString(this.f7652x));
        map.put("cacheReady", true != this.f7653y ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f7654z));
        map.put("playerPreparedCount", Integer.toString(this.A));
        s90.h(this.B, map);
    }
}
