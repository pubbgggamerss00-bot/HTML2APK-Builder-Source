package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzdv extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzec zzecVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzecVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        return this.zzb.zzl(null, this);
    }
}
