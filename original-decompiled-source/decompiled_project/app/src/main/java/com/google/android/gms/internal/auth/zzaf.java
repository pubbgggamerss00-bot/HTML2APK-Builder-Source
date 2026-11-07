package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, da.c
    public final void zzc(boolean z10) {
        this.zza.setResult((zzag) new zzak(z10 ? Status.f5905e : zzal.zza));
    }
}
