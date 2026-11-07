package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import pd.b;
import qd.c;
import rd.d1;
import rd.g;
import rd.w0;

/* loaded from: classes2.dex */
final class zzacw extends zzaex<Object, w0> {
    private final zzait zzu;

    public zzacw(c cVar) {
        super(2);
        p.g(cVar, "credential cannot be null");
        this.zzu = b.a(cVar, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "linkFederatedCredential";
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
        zzaefVar.zza(this.zzd.zze(), this.zzu, this.zzb);
    }
}
