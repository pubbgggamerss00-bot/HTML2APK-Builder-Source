package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.recaptcha.RecaptchaException;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import ph.r2;
import vg.i;

/* loaded from: classes2.dex */
final class zzco extends i implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzco(Application application, String str, long j10, tg.e eVar) {
        super(2, eVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzco(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzco) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws RecaptchaException, r2, com.google.android.gms.common.api.b {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j10 = this.zzd;
        this.zza = 1;
        Object objZzb = zzcq.zzb(application, str, j10, this);
        return objZzb == aVar ? aVar : objZzb;
    }
}
