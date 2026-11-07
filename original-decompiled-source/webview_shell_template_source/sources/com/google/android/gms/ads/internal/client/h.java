package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.internal.ads.gy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzs f2288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gy f2290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzba f2291f;

    public h(zzba zzbaVar, Context context, zzs zzsVar, String str, gy gyVar) {
        this.f2287b = context;
        this.f2288c = zzsVar;
        this.f2289d = str;
        this.f2290e = gyVar;
        this.f2291f = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2287b, "app_open");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzc(new k3.b(this.f2287b), this.f2288c, this.f2289d, this.f2290e, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f2291f.zza.zza(this.f2287b, this.f2288c, this.f2289d, this.f2290e, 4);
    }
}
