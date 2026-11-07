package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import ph.u;
import vg.i;

/* loaded from: classes2.dex */
final class zzdx extends i implements p {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzecVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzdx(this.zzb, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 == 0) {
            u uVar = this.zzb.zzc;
            this.zza = 1;
            if (uVar.await(this) == aVar) {
                return aVar;
            }
        }
        return f0.f21461a;
    }
}
