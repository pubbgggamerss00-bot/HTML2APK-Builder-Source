package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import rd.l;
import rd.w0;

/* loaded from: classes2.dex */
final class zzads extends zzaex<Void, w0> {
    private final String zzaa;
    private final String zzab;
    private final String zzac;
    private final boolean zzad;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final long zzx;
    private final boolean zzy;
    private final boolean zzz;

    public zzads(l lVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12) {
        super(8);
        p.f(lVar);
        p.d(str);
        String str6 = lVar.f23397a;
        p.d(str6);
        this.zzu = str6;
        this.zzv = str;
        this.zzw = str2;
        this.zzx = j10;
        this.zzy = z10;
        this.zzz = z11;
        this.zzaa = str3;
        this.zzab = str4;
        this.zzac = str5;
        this.zzad = z12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzb);
    }
}
