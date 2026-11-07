package com.google.android.recaptcha.internal;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import ph.i0;
import ph.j0;

/* loaded from: classes2.dex */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = "";
    private final zzbs zzf;

    public zzae(zzek zzekVar, Context context, i0 i0Var, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzkhVarZzg = zzkh.zzg();
        byte[] bArrZzl = zzleVar.zzl();
        byte[] bArrZzd = zzjz.zza().zza(zzkhVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzleVarZzk = zzle.zzk(bArrZzd, 0, bArrZzd.length);
        zzkh zzkhVarZzh = zzkh.zzh();
        byte[] bArrZzl2 = zzleVarZzk.zzl();
        return zzkhVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, tg.e eVar) {
        return j0.c(new zzac(this, str, null), eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r12.zze(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(zzse zzseVar, tg.e eVar) {
        zzad zzadVar;
        zzae zzaeVar;
        zzen zzenVar;
        if (eVar instanceof zzad) {
            zzadVar = (zzad) eVar;
            int i10 = zzadVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzadVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzadVar = new zzad(this, eVar);
            }
        }
        Object obj = zzadVar.zzb;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzadVar.zzd;
        if (i11 == 0) {
            q.b(obj);
            zzen zzenVarZzc = zzz.zzc(this);
            if (this.zzf.zza(this.zzb) != 3 || zzseVar.zzf() == 0) {
                this.zzd = false;
                zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
                return f0.f21461a;
            }
            this.zze = zzi(zzseVar.zzg());
            zzan zzanVar = this.zzc;
            long jZzf = zzseVar.zzf();
            zzadVar.zza = this;
            zzadVar.zze = zzenVarZzc;
            zzadVar.zzd = 1;
            if (zzanVar.zzd(jZzf, zzadVar) != aVar) {
                zzaeVar = this;
                zzenVar = zzenVarZzc;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = (zzen) zzadVar.zza;
            q.b(obj);
            zzenVar.zza();
            return f0.f21461a;
        }
        zzenVar = zzadVar.zze;
        zzaeVar = (zzae) zzadVar.zza;
        q.b(obj);
        zzan zzanVar2 = zzaeVar.zzc;
        zzadVar.zza = zzenVar;
        zzadVar.zze = null;
        zzadVar.zzd = 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
