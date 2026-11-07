package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.d;
import rd.d1;
import rd.g;
import rd.w0;

/* loaded from: classes2.dex */
final class zzacy extends zzaex<Object, w0> {
    private final d zzu;

    public zzacy(d dVar) {
        super(2);
        p.g(dVar, "credential cannot be null");
        this.zzu = dVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "linkEmailAuthCredential";
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
        d dVar = this.zzu;
        qd.p pVar = this.zzd;
        dVar.getClass();
        dVar.f22668d = pVar.zze();
        dVar.f22669e = true;
        zzaefVar.zza(new zzagp(dVar, null, null), this.zzb);
    }
}
