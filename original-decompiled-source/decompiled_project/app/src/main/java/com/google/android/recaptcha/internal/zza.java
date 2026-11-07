package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
final class zza extends vg.c {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, tg.e eVar) {
        super(eVar);
        this.zzd = zzeVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        this.zzc = obj;
        this.zze |= PKIFailureInfo.systemUnavail;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == ug.a.f29706a ? objZzc : new p(objZzc);
    }
}
