package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import eh.p;
import pg.f0;
import pg.q;
import vg.i;

/* loaded from: classes2.dex */
final class zzcz extends i implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzdc zzdcVar, long j10, RecaptchaAction recaptchaAction, String str, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzdcVar;
        this.zzc = j10;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j10 = this.zzc;
            zzcn zzcnVar = zzdcVar.zzb;
            this.zza = 1;
            obj = zzcnVar.zza(str, recaptchaAction, j10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new pg.p((String) obj);
    }
}
