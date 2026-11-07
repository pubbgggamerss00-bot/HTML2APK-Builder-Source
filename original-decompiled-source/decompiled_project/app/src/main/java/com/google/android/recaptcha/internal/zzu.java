package com.google.android.recaptcha.internal;

import eh.p;
import java.util.Iterator;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzu extends i implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, tg.e eVar) {
        super(2, eVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzu(this.zzd, this.zze, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        zzse zzseVarZzj;
        Iterator it;
        ug.a aVar = ug.a.f29706a;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzseVarZzj = (zzse) this.zza;
            q.b(obj);
        } else {
            q.b(obj);
            if (!this.zzd.zzS()) {
                return new pg.p(q.a(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzseVarZzj = this.zzd.zzj();
            if (zzseVarZzj.zzi().zzd() == 0) {
                return new pg.p(q.a(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            this.zze.zzc = zzseVarZzj.zzi();
            it = this.zze.zzb.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzseVarZzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzseVarZzj, this) == aVar) {
                return aVar;
            }
        }
        return new pg.p(f0.f21461a);
    }
}
