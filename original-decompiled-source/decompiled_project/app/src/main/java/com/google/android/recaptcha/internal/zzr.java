package com.google.android.recaptcha.internal;

import eh.p;
import java.util.List;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzr extends i implements p {
    int zza;
    final /* synthetic */ zzy zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzy zzyVar, String str, List list, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzyVar;
        this.zzc = str;
        this.zzd = list;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzr(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 == 0) {
            zzy zzyVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzyVar.zzc(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.zzd.add((zzaa) obj);
        return f0.f21461a;
    }
}
