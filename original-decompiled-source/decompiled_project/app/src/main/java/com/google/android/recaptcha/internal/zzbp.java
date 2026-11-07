package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzbp extends vg.c {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzbq zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbq zzbqVar, tg.e eVar) {
        super(eVar);
        this.zzg = zzbqVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= PKIFailureInfo.systemUnavail;
        return this.zzg.zza(null, 0L, 0L, 0.0d, null, this);
    }
}
