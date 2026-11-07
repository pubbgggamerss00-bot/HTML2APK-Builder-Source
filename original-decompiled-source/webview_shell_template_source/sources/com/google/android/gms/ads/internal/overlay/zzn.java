package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.cu0;
import com.google.android.gms.internal.ads.on0;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzn {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z6, cu0 cu0Var) {
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            on0 on0Var = adOverlayInfoParcel.zzu;
            if (on0Var != null) {
                on0Var.O();
            }
            Activity activityZzi = adOverlayInfoParcel.zzd.zzi();
            zzc zzcVar = adOverlayInfoParcel.zza;
            Context context2 = (zzcVar == null || !zzcVar.zzj || activityZzi == null) ? context : activityZzi;
            com.google.android.gms.ads.internal.zzv.zzi();
            zzc zzcVar2 = adOverlayInfoParcel.zza;
            zza.zzb(context2, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null, cu0Var, adOverlayInfoParcel.zzq);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
        intent.putExtra("shouldCallOnOverlayOpened", z6);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) zzbe.zzc().a(zn.Uc)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            zzs.zzX(context, intent, cu0Var, adOverlayInfoParcel.zzq);
        } else {
            com.google.android.gms.ads.internal.zzv.zzq();
            zzs.zzT(context, intent);
        }
    }
}
