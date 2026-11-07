package com.google.android.recaptcha.internal;

import eh.l;
import pg.f0;
import pg.q;
import ph.u2;
import vg.i;

/* loaded from: classes2.dex */
final class zzdy extends i implements l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j10, zzec zzecVar, tg.e eVar) {
        super(1, eVar);
        this.zzb = j10;
        this.zzc = zzecVar;
    }

    @Override // vg.a
    public final tg.e create(tg.e eVar) {
        return new zzdy(this.zzb, this.zzc, eVar);
    }

    @Override // eh.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((tg.e) obj)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 == 0) {
            long j10 = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (u2.b(j10, zzdxVar, this) == aVar) {
                return aVar;
            }
        }
        return f0.f21461a;
    }
}
