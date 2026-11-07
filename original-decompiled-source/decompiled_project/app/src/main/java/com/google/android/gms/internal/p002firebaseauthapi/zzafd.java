package com.google.android.gms.internal.p002firebaseauthapi;

import qd.z;

/* loaded from: classes2.dex */
final class zzafd implements zzafe {
    private final /* synthetic */ String zza;

    public zzafd(zzaez zzaezVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(z zVar, Object... objArr) {
        zVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
