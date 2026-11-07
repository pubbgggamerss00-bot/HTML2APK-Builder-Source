package com.google.android.recaptcha.internal;

import eh.p;
import java.util.List;
import pg.f0;
import pg.q;
import ph.i0;
import ph.j0;
import qg.x;
import vg.i;

/* loaded from: classes2.dex */
final class zzfq extends i implements p {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, eVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 == 0) {
            i0 i0Var = (i0) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() >= this.zzc.size() || !j0.d(i0Var)) {
                    break;
                }
                zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzufVar, this.zzb);
                } catch (Exception e10) {
                    zzufVar.zzk();
                    i.a.a(zzufVar.zzg());
                    x.I(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                    zzft zzftVar = this.zzd;
                    zzgd zzgdVar2 = this.zzb;
                    this.zza = 1;
                    if (zzftVar.zzh(e10, zzgdVar2, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return f0.f21461a;
        }
        return f0.f21461a;
    }
}
