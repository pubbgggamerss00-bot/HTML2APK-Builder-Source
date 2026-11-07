package com.google.android.recaptcha.internal;

import eh.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzfs extends i implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgd zzgdVar, zzft zzftVar, String str, tg.e eVar) {
        super(2, eVar);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzfs(this.zzd, this.zze, this.zzf, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r1.zzh(r7, r2, r6) != r0) goto L20;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzub zzubVar;
        zzjh zzjhVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zzc;
        try {
        } catch (Exception e10) {
            zzft zzftVar = this.zze;
            zzgd zzgdVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
        }
        if (i10 == 0) {
            q.b(obj);
            this.zzd.zza = new zzbn();
            zzub zzubVarZzi = zzub.zzi(zzkh.zzh().zzj(this.zzf));
            zzubVarZzi.zzf();
            zztz zztzVarZza = this.zze.zzc.zza(zzubVarZzi);
            zzjh zzjhVarZzb = zzjh.zzb();
            zzft zzftVar2 = this.zze;
            List listZzi = zztzVarZza.zzi();
            zzgd zzgdVar2 = this.zzd;
            this.zza = zzubVarZzi;
            this.zzb = zzjhVarZzb;
            this.zzc = 1;
            if (zzftVar2.zzg(listZzi, zzgdVar2, this) != aVar) {
                zzubVar = zzubVarZzi;
                zzjhVar = zzjhVarZzb;
            }
            return aVar;
        }
        if (i10 != 1) {
            q.b(obj);
            return f0.f21461a;
        }
        zzjhVar = (zzjh) this.zzb;
        zzubVar = (zzub) this.zza;
        q.b(obj);
        zzjhVar.zzf();
        i.a.b(zzjhVar.zza(TimeUnit.MICROSECONDS));
        zzubVar.zzf();
        return f0.f21461a;
    }
}
