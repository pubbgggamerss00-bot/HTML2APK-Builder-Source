package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzah extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzan zzb;
    int zzc;
    String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzan zzanVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzanVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        return this.zzb.zzj(null, this);
    }
}
