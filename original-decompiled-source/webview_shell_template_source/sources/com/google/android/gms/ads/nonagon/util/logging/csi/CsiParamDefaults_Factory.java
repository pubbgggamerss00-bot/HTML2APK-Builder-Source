package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.ga2;
import com.google.android.gms.internal.ads.x92;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CsiParamDefaults_Factory implements x92<CsiParamDefaults> {
    private final ga2 zza;
    private final ga2 zzb;

    public CsiParamDefaults_Factory(ga2<Context> ga2Var, ga2<VersionInfoParcel> ga2Var2) {
        this.zza = ga2Var;
        this.zzb = ga2Var2;
    }

    public static CsiParamDefaults_Factory create(ga2<Context> ga2Var, ga2<VersionInfoParcel> ga2Var2) {
        return new CsiParamDefaults_Factory(ga2Var, ga2Var2);
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb());
    }
}
