package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import rd.l;

/* loaded from: classes2.dex */
final class zzadr extends zzaex<zzaij, Void> {
    private final zzaim zzu;

    public zzadr(l lVar, String str) {
        super(12);
        p.f(lVar);
        String str2 = lVar.f23397a;
        p.d(str2);
        this.zzu = zzaim.zza(str2, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzb(this.zzt);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }
}
