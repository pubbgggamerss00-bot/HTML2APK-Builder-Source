package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
final class zzcx extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzdcVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        Object objMo72executegIAlus = this.zzb.mo72executegIAlus(null, this);
        return objMo72executegIAlus == ug.a.f29706a ? objMo72executegIAlus : new p(objMo72executegIAlus);
    }
}
