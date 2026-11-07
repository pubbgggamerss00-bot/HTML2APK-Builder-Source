package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import ph.u;
import vg.i;

/* loaded from: classes2.dex */
final class zzeb extends i implements p {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ u zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, u uVar, long j10, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzecVar;
        this.zzc = uVar;
        this.zzd = j10;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzbd e10;
        zzbq zzbqVar;
        zzdz zzdzVar;
        zzea zzeaVar;
        ug.a aVar = ug.a.f29706a;
        if (this.zza != 0) {
            try {
                q.b(obj);
                zzebVar = this;
            } catch (zzbd e11) {
                zzbdVar = e11;
                zzebVar = this;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.d0(zzbdVar);
                return f0.f21461a;
            }
        } else {
            q.b(obj);
            try {
                zzbqVar = zzbq.zza;
                zzdzVar = new zzdz(this.zzb);
                zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
            } catch (zzbd e12) {
                e10 = e12;
                zzebVar = this;
                zzbdVar = e10;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.d0(zzbdVar);
                return f0.f21461a;
            }
            try {
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (zzbd e13) {
                e10 = e13;
                zzbdVar = e10;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.d0(zzbdVar);
                return f0.f21461a;
            }
        }
        ((Boolean) obj).getClass();
        return f0.f21461a;
    }
}
