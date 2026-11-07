package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import rd.w0;

/* loaded from: classes2.dex */
final class zzacm extends zzaex<Void, w0> {
    private final zzahu zzu;

    public zzacm(String str, String str2, String str3) {
        super(4);
        p.e(str, "code cannot be null or empty");
        p.e(str2, "new password cannot be null or empty");
        this.zzu = new zzahu(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "confirmPasswordReset";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }
}
