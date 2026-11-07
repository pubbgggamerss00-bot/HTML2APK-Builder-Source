package com.google.android.recaptcha.internal;

import eh.p;
import java.util.Arrays;
import kotlin.jvm.internal.h0;
import pg.f0;
import pg.q;
import ph.i0;
import ph.j0;
import vg.i;

/* loaded from: classes2.dex */
final class zzfr extends i implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ zzft zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(Exception exc, zzgd zzgdVar, zzft zzftVar, tg.e eVar) {
        super(2, eVar);
        this.zza = exc;
        this.zzb = zzgdVar;
        this.zzc = zzftVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        zzfr zzfrVar = new zzfr(this.zza, this.zzb, this.zzc, eVar);
        zzfrVar.zzd = obj;
        return zzfrVar;
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfr) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        zztd zztdVarZza;
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        i0 i0Var = (i0) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzce) {
            zztdVarZza = ((zzce) exc).zza();
            zztdVarZza.zze(this.zzb.zza());
        } else {
            zzgd zzgdVar = this.zzb;
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zze(zzgdVar.zza());
            zztdVarZzf.zzr(2);
            zztdVarZzf.zzq(2);
            zztdVarZza = zztdVarZzf;
        }
        zzte zzteVar = (zzte) zztdVarZza.zzk();
        zzteVar.zzl();
        zzteVar.zzk();
        h0.a(this.zza.getClass()).e();
        this.zza.getMessage();
        zzgd zzgdVar2 = this.zzb;
        zzbn zzbnVarZzb = zzgdVar2.zzb();
        zzbn zzbnVar = zzgdVar2.zza;
        if (zzbnVar == null) {
            zzbnVar = null;
        }
        zzrl zzrlVarZza = zzev.zza(zzbnVarZzb, zzbnVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        if (j0.d(i0Var)) {
            zzft zzftVar = this.zzc;
            zzkh zzkhVarZzh = zzkh.zzh();
            byte[] bArrZzd = zzteVar.zzd();
            String strZzi = zzkhVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzkh zzkhVarZzh2 = zzkh.zzh();
            byte[] bArrZzd2 = zzrlVarZza.zzd();
            zzftVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzkhVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return f0.f21461a;
    }
}
