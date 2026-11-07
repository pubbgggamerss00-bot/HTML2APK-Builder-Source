package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.t;
import rd.w0;

/* loaded from: classes2.dex */
final class zzacq extends zzaex<Void, w0> {
    private final t zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzacq(t tVar, String str, String str2, String str3) {
        super(2);
        p.f(tVar);
        this.zzu = tVar;
        p.d(str);
        this.zzv = str;
        this.zzw = str2;
        this.zzx = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        ((w0) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
