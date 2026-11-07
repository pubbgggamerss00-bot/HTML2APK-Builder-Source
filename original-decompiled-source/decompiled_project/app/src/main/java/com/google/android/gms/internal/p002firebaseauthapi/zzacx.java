package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import pd.b;
import qd.c;
import rd.g;
import rd.w0;

/* loaded from: classes2.dex */
final class zzacx extends zzaex<Void, w0> {
    private final zzait zzu;

    public zzacx(c cVar, String str) {
        super(2);
        p.g(cVar, "credential cannot be null");
        this.zzu = b.a(cVar, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "reauthenticateWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        g gVarZza = zzach.zza(this.zzc, this.zzk);
        if (!this.zzd.j().equalsIgnoreCase(gVarZza.f23366b.f23349a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((w0) this.zze).a(this.zzj, gVarZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }
}
