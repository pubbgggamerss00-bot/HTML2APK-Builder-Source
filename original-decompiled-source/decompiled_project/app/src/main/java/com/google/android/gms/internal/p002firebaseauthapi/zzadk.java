package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import qd.a;
import rd.w0;

/* loaded from: classes2.dex */
final class zzadk extends zzaex<Void, w0> {
    private final zzahe zzu;
    private final String zzv;

    public zzadk(String str, a aVar, String str2, String str3, String str4) {
        super(4);
        p.e(str, "email cannot be null or empty");
        zzahe zzaheVar = new zzahe(aVar.f22653j);
        this.zzu = zzaheVar;
        zzaheVar.zzb(str);
        zzaheVar.zza(aVar);
        zzaheVar.zzc(str2);
        zzaheVar.zza(str3);
        this.zzv = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zzb(this.zzu, this.zzb);
    }
}
