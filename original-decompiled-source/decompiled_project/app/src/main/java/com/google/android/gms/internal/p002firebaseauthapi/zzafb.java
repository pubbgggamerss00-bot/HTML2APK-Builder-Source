package com.google.android.gms.internal.p002firebaseauthapi;

import qd.y;
import qd.z;

/* loaded from: classes2.dex */
final class zzafb implements zzafe {
    private final /* synthetic */ String zza;

    public zzafb(zzaez zzaezVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(z zVar, Object... objArr) {
        zVar.onCodeSent(this.zza, new y());
    }
}
