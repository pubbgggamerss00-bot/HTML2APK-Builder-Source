package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.tn0;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbm implements tn0 {
    private final zzb zza;
    private final int zzb;
    private final String zzc;

    public zzbm(zzb zzbVar, int i6, String str) {
        this.zza = zzbVar;
        this.zzb = i6;
        this.zzc = str;
    }

    public final /* synthetic */ void zza(zzbk zzbkVar) throws JSONException {
        this.zza.zzd(this.zzc, zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zze(final zzbk zzbkVar) {
        if (zzbkVar == null || this.zzb != 2 || TextUtils.isEmpty(this.zzc)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbl
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                this.zza.zza(zzbkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zzf(String str) {
    }
}
