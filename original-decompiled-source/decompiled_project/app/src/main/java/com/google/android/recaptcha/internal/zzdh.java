package com.google.android.recaptcha.internal;

import android.os.Build;
import com.google.android.recaptcha.RecaptchaException;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzdh extends i implements p {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzdtVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzdh(this.zzb, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws RecaptchaException {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 != 0) {
            return obj;
        }
        int iZza = new zzbs(pa.e.f21389b).zza(this.zzb.zzr());
        zzdt zzdtVar = this.zzb;
        String str = zzdtVar.zza;
        String packageName = zzdtVar.zzr().getPackageName();
        String strZzd = this.zzb.zzb.zzd();
        zzbf zzbfVarZzt = this.zzb.zzt();
        int i11 = Build.VERSION.SDK_INT;
        String strZza = zzbfVarZzt.zza();
        zztn zztnVarZzf = zzto.zzf();
        zztnVarZzf.zzt(str);
        zztnVarZzf.zzq(packageName);
        zztnVarZzf.zzu(iZza);
        zztnVarZzf.zzr("18.6.1");
        zztnVarZzf.zzs(strZzd);
        zztnVarZzf.zzf(String.valueOf(i11));
        zztnVarZzf.zze(strZza);
        zzto zztoVar = (zzto) zztnVarZzf.zzk();
        zzdt zzdtVar2 = this.zzb;
        zzff zzffVarZzg = zzdt.zzg(zzdtVar2);
        String strZzb = zzdt.zzd(zzdtVar2).zzb();
        this.zza = 1;
        Object objZzc = zzffVarZzg.zzc(strZzb, zztoVar, this);
        return objZzc == aVar ? aVar : objZzc;
    }
}
