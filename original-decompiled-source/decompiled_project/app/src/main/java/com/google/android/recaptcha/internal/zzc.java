package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
final class zzc extends vg.c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, tg.e eVar) {
        super(eVar);
        this.zzc = zzeVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        this.zzb = obj;
        this.zzd |= PKIFailureInfo.systemUnavail;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == ug.a.f29706a ? objZze : new p(objZze);
    }
}
