package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
final class zzcy extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzdc zzdcVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzdcVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        Object objZzf = this.zzb.zzf(null, 0L, this);
        return objZzf == ug.a.f29706a ? objZzf : new p(objZzf);
    }
}
