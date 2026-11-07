package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.x;
import rd.w0;

/* loaded from: classes2.dex */
final class zzaea extends zzaex<Void, w0> {
    private final x zzu;

    public zzaea(x xVar) {
        super(2);
        p.f(xVar);
        this.zzu = xVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        ((w0) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(new zzahr(this.zzd.zze(), zzafo.zza(this.zzu)), this.zzb);
    }
}
