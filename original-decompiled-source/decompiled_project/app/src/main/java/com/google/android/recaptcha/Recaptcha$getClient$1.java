package com.google.android.recaptcha;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;
import tg.e;
import ug.a;
import vg.c;

/* loaded from: classes2.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, e eVar) {
        super(eVar);
        this.zzb = recaptcha;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        Object objM70getClientBWLJW6A = this.zzb.m70getClientBWLJW6A(null, null, 0L, this);
        return objM70getClientBWLJW6A == a.f29706a ? objM70getClientBWLJW6A : new p(objM70getClientBWLJW6A);
    }
}
