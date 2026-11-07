package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.a;

/* loaded from: classes2.dex */
final class zzaec extends zzaex<Void, Void> {
    private final zzahe zzu;

    public zzaec(String str, String str2, a aVar) {
        super(6);
        p.d(str);
        p.d(str2);
        p.f(aVar);
        this.zzu = zzahe.zza(aVar, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zzc(this.zzu, this.zzb);
    }
}
