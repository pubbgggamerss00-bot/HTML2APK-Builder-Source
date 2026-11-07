package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wu0 extends t40 {
    public final /* synthetic */ xu0 s;

    public wu0(xu0 xu0Var) {
        this.s = xu0Var;
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void D1(zze zzeVar) throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        int i6 = zzeVar.zza;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onRewardedAdFailedToShow";
        pu0Var.f8153d = Integer.valueOf(i6);
        qu0Var.b(pu0Var);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void e0(o40 o40Var) throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onUserEarnedReward";
        pu0Var.f8154e = o40Var.zzf();
        pu0Var.f8155f = Integer.valueOf(o40Var.zze());
        qu0Var.b(pu0Var);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void i(int i6) throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onRewardedAdFailedToShow";
        pu0Var.f8153d = Integer.valueOf(i6);
        qu0Var.b(pu0Var);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zze() throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onAdClicked";
        qu0Var.b(pu0Var);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zzf() throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onAdImpression";
        qu0Var.b(pu0Var);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zzg() throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onRewardedAdClosed";
        qu0Var.b(pu0Var);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zzj() throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onRewardedAdOpened";
        qu0Var.b(pu0Var);
    }
}
