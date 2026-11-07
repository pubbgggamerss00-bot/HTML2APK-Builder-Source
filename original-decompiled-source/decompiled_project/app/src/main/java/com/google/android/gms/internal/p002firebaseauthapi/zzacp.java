package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.t;
import rd.d1;
import rd.g;
import rd.w0;

/* loaded from: classes2.dex */
final class zzacp extends zzaex<Object, w0> {
    private final t zzu;
    private final String zzv;
    private final String zzw;

    public zzacp(t tVar, String str, String str2) {
        super(2);
        p.f(tVar);
        this.zzu = tVar;
        p.d(str);
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        g gVarZza = zzach.zza(this.zzc, this.zzk);
        qd.p pVar = this.zzd;
        if (pVar != null && !pVar.j().equalsIgnoreCase(gVarZza.f23366b.f23349a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((w0) this.zze).a(this.zzj, gVarZza);
            zzb(new d1(gVarZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzv, this.zzu, this.zzw, this.zzb);
    }
}
