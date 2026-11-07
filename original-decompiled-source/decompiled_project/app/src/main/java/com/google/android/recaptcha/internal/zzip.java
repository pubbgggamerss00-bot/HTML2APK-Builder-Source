package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
final class zzip extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzip(zzja zzjaVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzjaVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        Object objZzf = this.zzb.zzf(null, this);
        return objZzf == ug.a.f29706a ? objZzf : new p(objZzf);
    }
}
