package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u50 {

    /* renamed from: a, reason: collision with root package name */
    public final zzg f9462a;

    public u50(zzg zzgVar) {
        this.f9462a = zzgVar;
    }

    public final void a(int i6, long j6) {
        if (((Boolean) zzbe.zzc().a(zn.D0)).booleanValue()) {
            return;
        }
        zzg zzgVar = this.f9462a;
        if (j6 - zzgVar.zzf() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzbe.zzc().a(zn.E0)).booleanValue()) {
            zzgVar.zzH(i6);
            zzgVar.zzI(j6);
        } else {
            zzgVar.zzH(-1);
            zzgVar.zzI(j6);
        }
    }
}
