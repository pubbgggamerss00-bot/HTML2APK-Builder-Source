package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzak extends vg.c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzan zzc;
    int zzd;
    zzan zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzan zzanVar, tg.e eVar) {
        super(eVar);
        this.zzc = zzanVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= PKIFailureInfo.systemUnavail;
        return this.zzc.zze(this);
    }
}
