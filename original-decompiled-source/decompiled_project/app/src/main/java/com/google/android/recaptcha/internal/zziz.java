package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zziz extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzja zzjaVar, zzen zzenVar, tg.e eVar) {
        super(2, eVar);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zziz(this.zzc, this.zzd, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (ph.u2.b(20000, r6, r5) == r0) goto L20;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zzb;
        try {
        } catch (Exception e10) {
            e10.getMessage();
            zzbd zzbdVarZza = zzf.zza(e10, new zzbd(zzbb.zzb, zzba.zzV, e10.getMessage()));
            zzcb zzcbVarZzm = this.zzc.zzm();
            zzje zzjeVar = zzje.zza;
            this.zza = zzbdVarZza;
            this.zzb = 3;
            if (zzcbVarZzm.zzc(zzjeVar, this) != aVar) {
                zzbdVar = zzbdVarZza;
            }
        }
        if (i10 == 0) {
            q.b(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
            if (zzjaVar.zzx(this) != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                q.b(obj);
                return f0.f21461a;
            }
            zzbdVar = (zzbd) this.zza;
            q.b(obj);
            this.zzd.zzb(zzbdVar);
            return f0.f21461a;
        }
        q.b(obj);
        zziy zziyVar = new zziy(this.zzc, this.zzd, null);
        this.zzb = 2;
    }
}
