package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.q;
import rd.a0;
import rd.w0;

/* loaded from: classes2.dex */
final class zzacs extends zzaex<q, w0> {
    private final String zzu;

    public zzacs(String str) {
        super(1);
        p.e(str, "refresh token cannot be null");
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzu);
        }
        ((w0) this.zze).a(this.zzj, this.zzd);
        zzb(a0.a(this.zzj.zzc()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zzb(this.zzu, this.zzb);
    }
}
