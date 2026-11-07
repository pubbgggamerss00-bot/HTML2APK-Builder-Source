package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.d;
import rd.d1;
import rd.g;
import rd.w0;

/* loaded from: classes2.dex */
final class zzact extends zzaex<Object, w0> {
    private final d zzu;
    private final String zzv;

    public zzact(d dVar, String str) {
        super(2);
        p.g(dVar, "credential cannot be null");
        this.zzu = dVar;
        p.e(dVar.f22665a, "email cannot be null");
        p.e(dVar.f22666b, "password cannot be null");
        this.zzv = str;
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
        String str = dVar.f22665a;
        String str2 = dVar.f22666b;
        p.d(str2);
        zzaefVar.zza(str, str2, this.zzd.zze(), this.zzd.i(), this.zzv, this.zzb);
    }
}
