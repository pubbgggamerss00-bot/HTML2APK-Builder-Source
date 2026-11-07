package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uj0 implements yl0, tn0 {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final ec1 f9574t;

    /* renamed from: u, reason: collision with root package name */
    public final VersionInfoParcel f9575u;

    /* renamed from: v, reason: collision with root package name */
    public final zzg f9576v;

    /* renamed from: w, reason: collision with root package name */
    public final fv0 f9577w;

    /* renamed from: x, reason: collision with root package name */
    public final ie1 f9578x;

    public uj0(Context context, ec1 ec1Var, VersionInfoParcel versionInfoParcel, zzj zzjVar, fv0 fv0Var, ie1 ie1Var) {
        this.s = context;
        this.f9574t = ec1Var;
        this.f9575u = versionInfoParcel;
        this.f9576v = zzjVar;
        this.f9577w = fv0Var;
        this.f9578x = ie1Var;
    }

    public final void a() throws JSONException {
        if (((Boolean) zzbe.zzc().a(zn.f11362b4)).booleanValue()) {
            zzv.zza().zzc(this.s, this.f9575u, this.f9574t.f4211f, this.f9576v.zzg(), this.f9578x);
        }
        this.f9577w.b();
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) throws JSONException {
        a();
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zze(zzbk zzbkVar) throws JSONException {
        if (((Boolean) zzbe.zzc().a(zn.f11370c4)).booleanValue()) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) {
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zzf(String str) {
    }
}
