package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.b0;
import qd.z;

/* loaded from: classes2.dex */
final class zzadu extends zzaex<Void, z> {
    private final zzaah zzu;

    public zzadu(b0 b0Var, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12) {
        super(8);
        p.f(b0Var);
        p.d(str);
        this.zzu = new zzaah(b0Var, str, str2, j10, z10, z11, str3, str4, str5, z12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }
}
