package com.google.android.recaptcha.internal;

import eh.l;
import pg.f0;
import pg.q;
import ph.u;
import vg.i;

/* loaded from: classes2.dex */
final class zzea extends i implements l {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ u zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j10, u uVar, tg.e eVar) {
        super(1, eVar);
        this.zzc = zzecVar;
        this.zzd = j10;
        this.zze = uVar;
    }

    @Override // vg.a
    public final tg.e create(tg.e eVar) {
        return new zzea(this.zzc, this.zzd, this.zze, eVar);
    }

    @Override // eh.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((tg.e) obj)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        zzbd e10;
        zzen zzenVar2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zzb;
        if (i10 == 0) {
            q.b(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j10 = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j10, this);
                if (objZzo != aVar) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return aVar;
            } catch (zzbd e11) {
                zzenVar = zzenVarZzf;
                e10 = e11;
                this.zzc.zzd = e10;
                zzenVar.zzb(e10);
                throw e10;
            }
        }
        if (i10 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                q.b(obj);
                zzenVar.zza();
                this.zzc.zzf = zzcm.zzb;
                return Boolean.valueOf(this.zze.g0(f0.f21461a));
            } catch (zzbd e12) {
                e10 = e12;
                this.zzc.zzd = e10;
                zzenVar.zzb(e10);
                throw e10;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            q.b(obj);
        } catch (zzbd e13) {
            e10 = e13;
            zzenVar = zzenVar2;
            this.zzc.zzd = e10;
            zzenVar.zzb(e10);
            throw e10;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j11 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j11, this) != aVar) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(this.zze.g0(f0.f21461a));
        }
        return aVar;
    }
}
