package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import rd.d1;
import rd.g;
import rd.w0;

/* loaded from: classes2.dex */
final class zzado extends zzaex<Object, w0> {
    private final zzaiu zzu;

    public zzado(String str, String str2) {
        super(2);
        p.e(str, "token cannot be null or empty");
        this.zzu = new zzaiu(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "signInWithCustomToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        g gVarZza = zzach.zza(this.zzc, this.zzk);
        ((w0) this.zze).a(this.zzj, gVarZza);
        zzb(new d1(gVarZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }
}
