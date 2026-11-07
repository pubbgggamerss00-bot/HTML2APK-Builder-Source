package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
final class zzcw extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdcVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzdcVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        Object objMo71execute0E7RQCE = this.zzb.mo71execute0E7RQCE(null, 0L, this);
        return objMo71execute0E7RQCE == ug.a.f29706a ? objMo71execute0E7RQCE : new p(objMo71execute0E7RQCE);
    }
}
