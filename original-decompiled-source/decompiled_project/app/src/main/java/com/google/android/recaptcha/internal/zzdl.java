package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzdl extends i implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsc zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdt zzdtVar, zzsc zzscVar, long j10, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzdtVar;
        this.zzc = zzscVar;
        this.zzd = j10;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzdl(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 == 0) {
            zzdt zzdtVar = this.zzb;
            zzsc zzscVar = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            if (zzdtVar.zzv(zzscVar, j10, this) == aVar) {
                return aVar;
            }
        }
        return f0.f21461a;
    }
}
