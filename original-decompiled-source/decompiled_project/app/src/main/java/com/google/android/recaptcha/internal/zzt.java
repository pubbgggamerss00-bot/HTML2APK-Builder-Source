package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
final class zzt extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzv zzvVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzvVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == ug.a.f29706a ? objZzh : new p(objZzh);
    }
}
