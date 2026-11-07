package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tu0 extends zzbk {
    public final /* synthetic */ qu0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ uu0 f9374t;

    public tu0(uu0 uu0Var, qu0 qu0Var) {
        this.s = qu0Var;
        this.f9374t = uu0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws JSONException {
        long j6 = this.f9374t.f9632a;
        pu0 pu0Var = new pu0("interstitial");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onAdClicked";
        this.s.f8455a.zzb(pu0.a(pu0Var));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws JSONException {
        long j6 = this.f9374t.f9632a;
        pu0 pu0Var = new pu0("interstitial");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onAdClosed";
        this.s.b(pu0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i6) throws JSONException {
        long j6 = this.f9374t.f9632a;
        pu0 pu0Var = new pu0("interstitial");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onAdFailedToLoad";
        pu0Var.f8153d = Integer.valueOf(i6);
        this.s.b(pu0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zzeVar) throws JSONException {
        long j6 = this.f9374t.f9632a;
        int i6 = zzeVar.zza;
        pu0 pu0Var = new pu0("interstitial");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onAdFailedToLoad";
        pu0Var.f8153d = Integer.valueOf(i6);
        this.s.b(pu0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws JSONException {
        long j6 = this.f9374t.f9632a;
        pu0 pu0Var = new pu0("interstitial");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onAdLoaded";
        this.s.b(pu0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws JSONException {
        long j6 = this.f9374t.f9632a;
        pu0 pu0Var = new pu0("interstitial");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onAdOpened";
        this.s.b(pu0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
    }
}
