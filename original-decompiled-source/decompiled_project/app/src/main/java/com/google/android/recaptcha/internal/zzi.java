package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
final class zzi extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzl zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzlVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzlVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        Object objZzc = this.zzb.zzc(0L, null, null, this);
        return objZzc == ug.a.f29706a ? objZzc : new p(objZzc);
    }
}
