package com.google.android.gms.internal.p002firebaseauthapi;

import qd.x;
import qd.z;

/* loaded from: classes2.dex */
final class zzafa implements zzafe {
    private final /* synthetic */ x zza;

    public zzafa(zzaez zzaezVar, x xVar) {
        this.zza = xVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(z zVar, Object... objArr) {
        zVar.onVerificationCompleted(this.zza);
    }
}
