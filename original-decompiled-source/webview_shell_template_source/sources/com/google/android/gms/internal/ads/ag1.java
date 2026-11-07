package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ag1 extends x40 {
    public final /* synthetic */ ps1 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r40 f2752t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ if1 f2753u;

    public ag1(if1 if1Var, ps1 ps1Var, r40 r40Var) {
        this.s = ps1Var;
        this.f2752t = r40Var;
        this.f2753u = if1Var;
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zzf(zze zzeVar) {
        String string = zzeVar.zzb().toString();
        if1 if1Var = this.f2753u;
        zzo.zzj("Failed to load rewarded ad with error: " + string + ", adUnitId: " + if1Var.f10961e.zza);
        yf1.g(if1Var, zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zzg() {
        this.s.e(this.f2752t);
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zze(int i6) {
    }
}
