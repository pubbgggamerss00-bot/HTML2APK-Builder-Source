package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.c50;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.l60;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.r10;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.xs;
import com.google.android.gms.internal.ads.xu;
import com.google.android.gms.internal.ads.ys;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzba {
    private final zzk zza;
    private final zzi zzb;
    private final zzfe zzc;
    private final xs zzd;
    private final r10 zze;
    private final ys zzf;
    private u20 zzg;
    private final zzl zzh;

    public zzba(zzk zzkVar, zzi zziVar, zzfe zzfeVar, xs xsVar, c50 c50Var, r10 r10Var, ys ysVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfeVar;
        this.zzd = xsVar;
        this.zze = r10Var;
        this.zzf = ysVar;
        this.zzh = zzlVar;
    }

    public static /* bridge */ /* synthetic */ void zzv(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbc.zzb().zzn(context, zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zzd(Context context, String str, gy gyVar) {
        return (zzbu) new k(this, context, str, gyVar).d(context, false);
    }

    public final zzby zze(Context context, zzs zzsVar, String str, gy gyVar) {
        return (zzby) new h(this, context, zzsVar, str, gyVar).d(context, false);
    }

    public final zzby zzf(Context context, zzs zzsVar, String str, gy gyVar) {
        return (zzby) new j(this, context, zzsVar, str, gyVar).d(context, false);
    }

    public final zzci zzg(Context context, gy gyVar) {
        return (zzci) new l(this, context, gyVar).d(context, false);
    }

    public final zzdu zzh(Context context, gy gyVar) {
        return (zzdu) new c(context, gyVar).d(context, false);
    }

    public final dr zzj(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (dr) new n(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final jr zzk(View view, HashMap map, HashMap map2) {
        return (jr) new o(this, view, map, map2).d(view.getContext(), false);
    }

    public final xu zzn(Context context, gy gyVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (xu) new f(context, gyVar, onH5AdsEventListener).d(context, false);
    }

    public final n10 zzo(Context context, gy gyVar) {
        return (n10) new e(context, gyVar).d(context, false);
    }

    public final u10 zzq(Activity activity) {
        b bVar = new b(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (u10) bVar.d(activity, booleanExtra);
    }

    public final r40 zzs(Context context, String str, gy gyVar) {
        return (r40) new a(context, str, gyVar).d(context, false);
    }

    public final l60 zzt(Context context, gy gyVar) {
        return (l60) new d(context, gyVar).d(context, false);
    }
}
