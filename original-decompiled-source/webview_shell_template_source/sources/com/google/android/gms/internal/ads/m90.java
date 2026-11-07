package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m90 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ s90 C;
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f6997t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f6998u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f6999v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f7000w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f7001x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f7002y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f7003z;

    public m90(s90 s90Var, String str, String str2, long j6, long j7, long j8, long j9, long j10, boolean z6, int i6, int i7) {
        this.s = str;
        this.f6997t = str2;
        this.f6998u = j6;
        this.f6999v = j7;
        this.f7000w = j8;
        this.f7001x = j9;
        this.f7002y = j10;
        this.f7003z = z6;
        this.A = i6;
        this.B = i7;
        this.C = s90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.s);
        map.put("cachedSrc", this.f6997t);
        map.put("bufferedDuration", Long.toString(this.f6998u));
        map.put("totalDuration", Long.toString(this.f6999v));
        if (((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f7000w));
            map.put("qoeCachedBytes", Long.toString(this.f7001x));
            map.put("totalBytes", Long.toString(this.f7002y));
            map.put("reportTime", Long.toString(zzv.zzC().a()));
        }
        map.put("cacheReady", true != this.f7003z ? "0" : "1");
        map.put("playerCount", Integer.toString(this.A));
        map.put("playerPreparedCount", Integer.toString(this.B));
        s90.h(this.C, map);
    }
}
