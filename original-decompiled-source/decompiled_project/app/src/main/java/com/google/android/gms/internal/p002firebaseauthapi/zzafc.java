package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import qd.z;

/* loaded from: classes2.dex */
final class zzafc implements zzafe {
    private final /* synthetic */ Status zza;

    public zzafc(zzaez zzaezVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(z zVar, Object... objArr) {
        zVar.onVerificationFailed(zzaei.zza(this.zza));
    }
}
