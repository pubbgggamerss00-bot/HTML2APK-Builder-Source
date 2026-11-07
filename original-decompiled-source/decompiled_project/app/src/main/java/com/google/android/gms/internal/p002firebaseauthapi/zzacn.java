package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import rd.q;
import rd.w0;

/* loaded from: classes2.dex */
final class zzacn extends zzaex<Object, w0> {
    private final String zzu;
    private final String zzv;

    public zzacn(String str, String str2) {
        super(3);
        p.e(str, "email cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        List<String> listZza;
        if (this.zzl.zza() == null) {
            listZza = zzaj.zzh();
        } else {
            listZza = this.zzl.zza();
            p.f(listZza);
        }
        zzb(new q(listZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zze(this.zzu, this.zzv, this.zzb);
    }
}
