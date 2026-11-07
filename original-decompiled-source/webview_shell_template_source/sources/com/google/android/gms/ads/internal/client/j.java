package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.internal.ads.gy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzs f2297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gy f2299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzba f2300f;

    public j(zzba zzbaVar, Context context, zzs zzsVar, String str, gy gyVar) {
        this.f2296b = context;
        this.f2297c = zzsVar;
        this.f2298d = str;
        this.f2299e = gyVar;
        this.f2300f = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2296b, "interstitial");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zze(new k3.b(this.f2296b), this.f2297c, this.f2298d, this.f2299e, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f2300f.zza.zza(this.f2296b, this.f2297c, this.f2298d, this.f2299e, 2);
    }
}
