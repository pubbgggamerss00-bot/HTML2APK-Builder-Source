package com.google.android.gms.ads.internal.client;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzs f2293c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzba f2295e;

    public i(zzba zzbaVar, Context context, zzs zzsVar, String str) {
        this.f2292b = context;
        this.f2293c = zzsVar;
        this.f2294d = str;
        this.f2295e = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2292b, "search");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzf(new k3.b(this.f2292b), this.f2293c, this.f2294d, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f2295e.zza.zza(this.f2292b, this.f2293c, this.f2294d, null, 3);
    }
}
