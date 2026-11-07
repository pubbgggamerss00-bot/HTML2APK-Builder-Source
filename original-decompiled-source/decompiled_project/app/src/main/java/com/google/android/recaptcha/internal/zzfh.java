package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzfh extends i implements p {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, tg.e eVar) {
        super(2, eVar);
        this.zza = zzfjVar;
        this.zzb = zzbrVar;
        this.zzc = zzspVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzfh(this.zza, this.zzb, this.zzc, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        zzew zzewVarZza = null;
        try {
            try {
                zzewVarZza = zzfj.zza(this.zza).zza(this.zzb.zzd());
                zzewVarZza.zzc();
                zzewVarZza.zze(this.zzc.zzd());
                zzsr zzsrVar = (zzsr) zzewVarZza.zza(zzsr.zzi());
                zzewVarZza.zzd();
                return zzsrVar;
            } catch (zzbd e10) {
                throw e10;
            } catch (Exception e11) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e11.getMessage());
            }
        } catch (Throwable th2) {
            if (zzewVarZza != null) {
                zzewVarZza.zzd();
            }
            throw th2;
        }
    }
}
