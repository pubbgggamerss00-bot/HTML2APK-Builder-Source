package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class jh0 implements jl0 {
    public final /* synthetic */ Context s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ VersionInfoParcel f6064t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ tb1 f6065u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ec1 f6066v;

    public /* synthetic */ jh0(Context context, VersionInfoParcel versionInfoParcel, tb1 tb1Var, ec1 ec1Var) {
        this.s = context;
        this.f6064t = versionInfoParcel;
        this.f6065u = tb1Var;
        this.f6066v = ec1Var;
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() {
        zzay zzayVarZzt = zzv.zzt();
        JSONObject jSONObject = this.f6065u.C;
        zzayVarZzt.zzn(this.s, this.f6064t.afmaVersion, jSONObject.toString(), this.f6066v.f4211f);
    }
}
