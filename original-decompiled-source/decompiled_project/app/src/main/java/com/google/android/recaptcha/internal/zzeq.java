package com.google.android.recaptcha.internal;

import eh.p;
import java.util.Timer;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzeq extends i implements p {
    final /* synthetic */ zzes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzes zzesVar, tg.e eVar) {
        super(2, eVar);
        this.zza = zzesVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzeq(this.zza, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeq) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzei zzeiVar = zzesVar.zze;
                if (zzeiVar != null && zzeiVar.zzb() == 0) {
                    Timer timer = zzes.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzes.zza = null;
                }
                zzesVar.zzg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f0.f21461a;
    }
}
