package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.fu0;
import com.google.android.gms.internal.ads.wp;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzp extends QueryInfoGenerationCallback {
    private final zzo zza;
    private final fu0 zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzv.zzC().a();
    private final Boolean zzf;

    public zzp(zzo zzoVar, boolean z6, int i6, Boolean bool, fu0 fu0Var) {
        this.zza = zzoVar;
        this.zzc = z6;
        this.zzd = i6;
        this.zzf = bool;
        this.zzb = fu0Var;
    }

    private static long zza() {
        return ((Long) wp.f10248f.c()).longValue() + com.google.android.gms.ads.internal.zzv.zzC().a();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzv.zzC().a() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        zzaa.zzd(this.zzb, null, "sgpcf", new Pair("sgf_reason", str), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(zzb())), new Pair("sgpc_rn", Integer.toString(this.zzd)), new Pair("sgpc_lsu", String.valueOf(this.zzf)), new Pair("tpc", true != this.zzc ? "0" : "1"));
        this.zza.zzf(this.zzc, new zzq(null, str, zza(), this.zzd));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        zzaa.zzd(this.zzb, null, "sgpcs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(zzb())), new Pair("sgpc_rn", Integer.toString(this.zzd)), new Pair("sgpc_lsu", String.valueOf(this.zzf)), new Pair("tpc", true != this.zzc ? "0" : "1"));
        this.zza.zzf(this.zzc, new zzq(queryInfo, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zza(), this.zzd));
    }
}
