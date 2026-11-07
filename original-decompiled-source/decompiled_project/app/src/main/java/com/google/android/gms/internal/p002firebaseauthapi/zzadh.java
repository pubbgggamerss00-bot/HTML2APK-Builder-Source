package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.a;
import rd.w0;

/* loaded from: classes2.dex */
final class zzadh extends zzaex<Void, w0> {
    private final zzahe zzu;

    public zzadh(String str, a aVar) {
        super(6);
        p.e(str, "token cannot be null or empty");
        zzahe zzaheVar = new zzahe(4);
        this.zzu = zzaheVar;
        zzaheVar.zzd(str);
        if (aVar != null) {
            zzaheVar.zza(aVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }
}
