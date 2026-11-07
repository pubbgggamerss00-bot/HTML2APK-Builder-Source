package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vu0 extends x40 {
    public final /* synthetic */ xu0 s;

    public vu0(xu0 xu0Var) {
        this.s = xu0Var;
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zze(int i6) throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onRewardedAdFailedToLoad";
        pu0Var.f8153d = Integer.valueOf(i6);
        qu0Var.b(pu0Var);
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zzf(zze zzeVar) throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        int i6 = zzeVar.zza;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onRewardedAdFailedToLoad";
        pu0Var.f8153d = Integer.valueOf(i6);
        qu0Var.b(pu0Var);
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zzg() throws JSONException {
        xu0 xu0Var = this.s;
        qu0 qu0Var = xu0Var.f10714b;
        long j6 = xu0Var.f10713a;
        pu0 pu0Var = new pu0("rewarded");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "onRewardedAdLoaded";
        qu0Var.b(pu0Var);
    }
}
