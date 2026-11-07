package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzda extends i implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j10, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j10;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objZzf;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 != 0) {
            objZzf = ((pg.p) obj).f21471a;
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            objZzf = zzdcVar.zzf(recaptchaAction, j10, this);
            if (objZzf == aVar) {
                return aVar;
            }
        }
        q.b(objZzf);
        return objZzf;
    }
}
