package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzs;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cc0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3512a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3513b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3514c;

    public cc0(int i6, int i7, int i8) {
        this.f3512a = i6;
        this.f3514c = i7;
        this.f3513b = i8;
    }

    public static cc0 a(zzs zzsVar) {
        return zzsVar.zzd ? new cc0(3, 0, 0) : zzsVar.zzi ? new cc0(2, 0, 0) : zzsVar.zzh ? new cc0(0, 0, 0) : new cc0(1, zzsVar.zzf, zzsVar.zzc);
    }

    public final boolean b() {
        return this.f3512a == 3;
    }
}
