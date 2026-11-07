package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.recaptcha.RecaptchaException;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzcp extends i implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(Application application, String str, tg.e eVar) {
        super(2, eVar);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzcp(this.zzb, this.zzc, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcp) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws RecaptchaException, com.google.android.gms.common.api.b {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        this.zza = 1;
        Object objZzd = zzcq.zzd(application, str, this);
        return objZzd == aVar ? aVar : objZzd;
    }
}
