package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzad extends vg.c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzae zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzae zzaeVar, tg.e eVar) {
        super(eVar);
        this.zzc = zzaeVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= PKIFailureInfo.systemUnavail;
        return this.zzc.zzd(null, this);
    }
}
