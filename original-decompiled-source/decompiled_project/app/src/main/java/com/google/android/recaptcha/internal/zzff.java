package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaException;
import e9.w0;
import mh.t;
import pg.j;
import ph.j0;

/* loaded from: classes2.dex */
public final class zzff {
    private final j zza;
    private final j zzb;
    private final j zzc;

    public zzff() {
        int i10 = zzav.zza;
        this.zza = w0.b(zzfc.zza);
        this.zzb = w0.b(zzfd.zza);
        this.zzc = w0.b(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, tg.e eVar) throws Exception {
        String strZza;
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    strZza = zzffVar.zzf().zza(strZzM);
                } catch (Exception e10) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e10.getMessage()));
                }
                if (strZza != null) {
                    zzenVarZzf.zza();
                    strZzb = strZza;
                } else {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e11) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e11.getMessage()));
                    }
                } catch (zzbd e12) {
                    zzenVarZzf2.zzb(e12);
                    throw e12;
                }
            }
            return t.n(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb);
        } catch (Exception e13) {
            if (e13 instanceof zzbd) {
                throw e13;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e13.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, tg.e eVar) throws RecaptchaException {
        return j0.c(new zzfb(this, str, zztoVar, null), eVar);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, tg.e eVar) throws zzbd {
        return zze(this, zzscVar, zzekVar, eVar);
    }
}
