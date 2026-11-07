package com.google.android.recaptcha.internal;

import eh.p;
import kotlin.jvm.internal.g0;
import pg.f0;
import pg.q;
import ph.i0;
import ph.u;
import ph.u2;
import vg.i;

/* loaded from: classes2.dex */
final class zzam extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, tg.e eVar) {
        super(2, eVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzam(this.zzc, this.zzd, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g0 g0Var;
        Exception e10;
        Throwable th2;
        ug.a aVar = ug.a.f29706a;
        if (this.zzb != 0) {
            g0Var = (g0) this.zza;
            try {
                q.b(obj);
            } catch (Exception e11) {
                e10 = e11;
                u uVarZzf = this.zzc.zzf();
                th2 = (Throwable) g0Var.f16327a;
                if (th2 == null) {
                    th2 = e10;
                }
                uVarZzf.d0(th2);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e10.getMessage()));
                return f0.f21461a;
            }
        } else {
            q.b(obj);
            g0 g0Var2 = new g0();
            try {
                zzal zzalVar = new zzal(this.zzc, this.zzd, g0Var2, null);
                this.zza = g0Var2;
                this.zzb = 1;
                if (u2.b(60000L, zzalVar, this) == aVar) {
                    return aVar;
                }
            } catch (Exception e12) {
                g0Var = g0Var2;
                e10 = e12;
                u uVarZzf2 = this.zzc.zzf();
                th2 = (Throwable) g0Var.f16327a;
                if (th2 == null) {
                }
                uVarZzf2.d0(th2);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e10.getMessage()));
                return f0.f21461a;
            }
        }
        return f0.f21461a;
    }
}
