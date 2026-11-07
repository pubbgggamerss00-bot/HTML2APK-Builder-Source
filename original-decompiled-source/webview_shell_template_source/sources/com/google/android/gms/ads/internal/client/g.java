package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.internal.ads.gy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzs f2283c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gy f2285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzba f2286f;

    public g(zzba zzbaVar, Context context, zzs zzsVar, String str, gy gyVar) {
        this.f2282b = context;
        this.f2283c = zzsVar;
        this.f2284d = str;
        this.f2285e = gyVar;
        this.f2286f = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2282b, "banner");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzd(new k3.b(this.f2282b), this.f2283c, this.f2284d, this.f2285e, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f2286f.zza.zza(this.f2282b, this.f2283c, this.f2284d, this.f2285e, 1);
    }
}
