package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzj extends i implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j10, zzsc zzscVar, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzeVar;
        this.zzc = j10;
        this.zzd = zzscVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        Object objZze;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 != 0) {
            objZze = ((pg.p) obj).f21471a;
        } else {
            zze zzeVar = this.zzb;
            long j10 = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            objZze = zzeVar.zze(j10, zzscVar, this);
            if (objZze == aVar) {
                return aVar;
            }
        }
        return new pg.p(objZze);
    }
}
