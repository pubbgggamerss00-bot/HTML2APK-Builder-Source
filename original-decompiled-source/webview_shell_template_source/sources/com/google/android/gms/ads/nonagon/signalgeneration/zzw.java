package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.tn0;
import com.google.android.gms.internal.ads.zt0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzw implements tn0 {
    private final zt0 zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    public zzw(zt0 zt0Var, zzv zzvVar, String str, int i6) {
        this.zza = zt0Var;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i6;
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zze(zzbk zzbkVar) {
        String strOptString;
        if (zzbkVar == null || this.zzd == 2) {
            return;
        }
        if (TextUtils.isEmpty(zzbkVar.zzc)) {
            this.zzb.zzd(this.zzc, zzbkVar.zzb, this.zza);
            return;
        }
        try {
            strOptString = new JSONObject(zzbkVar.zzc).optString("request_id");
        } catch (JSONException e6) {
            com.google.android.gms.ads.internal.zzv.zzp().h("RenderSignals.getRequestId", e6);
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.zzb.zzd(strOptString, zzbkVar.zzc, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zzf(String str) {
    }
}
