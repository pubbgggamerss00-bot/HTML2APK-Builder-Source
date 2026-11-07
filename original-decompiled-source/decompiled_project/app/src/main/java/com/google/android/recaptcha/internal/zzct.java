package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import vg.i;

/* loaded from: classes2.dex */
final class zzct extends i implements p {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcv zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcn zzg;
    final /* synthetic */ zzch zzh;
    final /* synthetic */ zzbi zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(zzcv zzcvVar, String str, long j10, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, tg.e eVar) {
        super(2, eVar);
        this.zzd = zzcvVar;
        this.zze = str;
        this.zzf = j10;
        this.zzg = zzcnVar;
        this.zzi = zzbiVar;
        this.zzh = zzchVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        zzct zzctVar = new zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, eVar);
        zzctVar.zzc = obj;
        return zzctVar;
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((zzek) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzek zzekVar;
        zzcn zzcnVar;
        ug.a aVar = ug.a.f29706a;
        if (this.zzb != 0) {
            zzcnVar = (zzcn) this.zza;
            zzekVar = (zzek) this.zzc;
            q.b(obj);
        } else {
            q.b(obj);
            zzekVar = (zzek) this.zzc;
            zzdc zzdcVarZza = zzcv.zza(this.zzd, this.zze);
            if (zzdcVarZza != null) {
                return zzdcVarZza;
            }
            zzcv.zzc(this.zzd, this.zzf);
            zzcn zzcnVarZze = this.zzg;
            if (zzcnVarZze == null) {
                zzcnVarZze = zzcv.zze(this.zzd, this.zze, this.zzi, this.zzh, zzekVar);
            }
            long j10 = this.zzf;
            this.zzc = zzekVar;
            this.zza = zzcnVarZze;
            this.zzb = 1;
            if (zzcnVarZze.zzb(j10, this) == aVar) {
                return aVar;
            }
            zzcnVar = zzcnVarZze;
        }
        zzdc zzdcVar = new zzdc(zzcnVar, this.zze, this.zzi, zzekVar);
        this.zzd.zzc = zzdcVar;
        return zzdcVar;
    }
}
