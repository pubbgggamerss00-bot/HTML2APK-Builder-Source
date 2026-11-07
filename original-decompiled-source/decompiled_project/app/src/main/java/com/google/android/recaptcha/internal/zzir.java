package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
final class zzir extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(zzja zzjaVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzjaVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == ug.a.f29706a ? objZzh : new p(objZzh);
    }
}
