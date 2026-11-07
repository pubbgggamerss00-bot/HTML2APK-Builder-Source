package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.h0;
import rd.w0;

/* loaded from: classes2.dex */
final class zzadz extends zzaex<Void, w0> {
    private final h0 zzu;

    public zzadz(h0 h0Var) {
        super(2);
        p.g(h0Var, "request cannot be null");
        this.zzu = h0Var;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        ((w0) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzd.zze(), this.zzu, this.zzb);
    }
}
