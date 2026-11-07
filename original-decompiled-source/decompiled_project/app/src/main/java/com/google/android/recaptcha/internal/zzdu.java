package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzdu extends vg.c {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzec zzecVar, tg.e eVar) {
        super(eVar);
        this.zzc = zzecVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= PKIFailureInfo.systemUnavail;
        return this.zzc.zza(null, null, 0L, this);
    }
}
