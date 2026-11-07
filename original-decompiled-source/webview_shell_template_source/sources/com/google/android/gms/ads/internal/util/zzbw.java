package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.bs1;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.ye1;
import com.google.android.gms.internal.ads.ze1;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbw extends zzb {
    private final com.google.android.gms.ads.internal.util.client.zzu zza;
    private final String zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;

    public zzbw(Context context, String str, String str2, ze1 ze1Var, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzu(com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
        this.zzb = str2;
        this.zzc = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        if (zzvVar == null) {
            this.zza.zza(this.zzb);
            return;
        }
        try {
            new ye1(zzvVar.zzb(), this.zza, i70.f5590e, null).a(1, this.zzb, 0L);
        } catch (NullPointerException | RejectedExecutionException unused) {
            bs1.m(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
        }
    }
}
