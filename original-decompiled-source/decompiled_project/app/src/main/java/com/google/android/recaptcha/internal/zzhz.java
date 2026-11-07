package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import qg.x;

/* loaded from: classes2.dex */
public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) throws zzce {
        if (str.length() == 0) {
            throw new zzce(3, 17, null);
        }
        try {
            zzhv zzhvVar = new zzhv(this.zza.zza(x.d0(list)), 255L, zzhv.zza);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb.append((char) (str.charAt(i10) ^ ((int) zzhvVar.zza())));
            }
            return zztz.zzg(zzkh.zzh().zzj(sb.toString()));
        } catch (Exception e10) {
            throw new zzce(3, 18, e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    public final zztz zza(zzub zzubVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        zztz zztzVarZzb = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), jZza);
        return zztzVarZzb;
    }
}
