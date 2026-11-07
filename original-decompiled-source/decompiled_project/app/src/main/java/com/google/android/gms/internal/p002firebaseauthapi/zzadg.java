package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.x;
import rd.d1;
import rd.g;
import rd.w0;

/* loaded from: classes2.dex */
final class zzadg extends zzaex<Object, w0> {
    private final zzaai zzu;

    public zzadg(x xVar, String str) {
        super(2);
        p.g(xVar, "credential cannot be null");
        xVar.f22706d = false;
        this.zzu = new zzaai(xVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "reauthenticateWithPhoneCredentialWithData";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        g gVarZza = zzach.zza(this.zzc, this.zzk);
        if (!this.zzd.j().equalsIgnoreCase(gVarZza.f23366b.f23349a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((w0) this.zze).a(this.zzj, gVarZza);
            zzb(new d1(gVarZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }
}
