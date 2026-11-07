package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import ph.h;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzds extends i implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdtVar, zzen zzenVar, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzds(this.zzb, this.zzc, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = h.e(zzdtVar.zzi.zza().getCoroutineContext(), new zzdh(zzdtVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
