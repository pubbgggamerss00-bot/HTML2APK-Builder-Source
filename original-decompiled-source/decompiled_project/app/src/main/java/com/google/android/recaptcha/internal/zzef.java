package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;

/* loaded from: classes2.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        this.zza = zzdtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j10, tg.e eVar) throws zzbd {
        zzed zzedVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        double d10;
        zzef zzefVar;
        String str3;
        zzef zzefVar2;
        if (eVar instanceof zzed) {
            zzedVar = (zzed) eVar;
            int i10 = zzedVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzedVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzedVar = new zzed(this, eVar);
            }
        }
        zzed zzedVar2 = zzedVar;
        Object objZzl = zzedVar2.zzb;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzedVar2.zzd;
        try {
            if (i11 == 0) {
                q.b(objZzl);
                if (!r.a(this.zzb, zzcm.zzb)) {
                    throw new zzbd(zzbb.zzb, zzba.zzar, null);
                }
                double d11 = j10;
                zzdt zzdtVar = this.zza;
                double d12 = 0.45d * d11;
                zzedVar2.zze = this;
                zzedVar2.zzf = str;
                zzedVar2.zzg = recaptchaAction;
                double d13 = d11 * 0.55d;
                zzedVar2.zza = d13;
                zzedVar2.zzd = 1;
                objZzl = zzdtVar.zzl(str, (long) d12, zzedVar2);
                if (objZzl != aVar) {
                    str2 = str;
                    recaptchaAction2 = recaptchaAction;
                    d10 = d13;
                    zzefVar = this;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = zzedVar2.zzf;
                zzefVar2 = zzedVar2.zze;
                q.b(objZzl);
                zzsr zzsrVar = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar);
                return zzsrVar.zzj();
            }
            double d14 = zzedVar2.zza;
            recaptchaAction2 = zzedVar2.zzg;
            String str4 = zzedVar2.zzf;
            zzef zzefVar3 = zzedVar2.zze;
            q.b(objZzl);
            d10 = d14;
            zzefVar = zzefVar3;
            str2 = str4;
            zzsi zzsiVar = (zzsi) objZzl;
            zzdt zzdtVar2 = zzefVar.zza;
            zzsc zzscVar = zzefVar.zzc;
            if (zzscVar == null) {
                zzscVar = null;
            }
            zzsp zzspVarZzi = zzdtVar2.zzi(recaptchaAction2, zzsiVar, zzscVar);
            zzedVar2.zze = zzefVar;
            zzedVar2.zzf = str2;
            zzedVar2.zzg = null;
            zzedVar2.zzd = 2;
            objZzl = zzefVar.zza.zzm(zzspVarZzi, str2, (long) d10, zzedVar2);
            if (objZzl != aVar) {
                str3 = str2;
                zzefVar2 = zzefVar;
                zzsr zzsrVar2 = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar2);
                return zzsrVar2.zzj();
            }
            return aVar;
        } catch (zzbd e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzb, zzba.zzaz, e11.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzef] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j10, tg.e eVar) throws zzbd {
        zzee zzeeVar;
        Object obj;
        double d10;
        zzef zzefVar;
        if (eVar instanceof zzee) {
            zzeeVar = (zzee) eVar;
            int i10 = zzeeVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzeeVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzeeVar = new zzee(this, eVar);
            }
        }
        Object obj2 = zzeeVar.zzb;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzeeVar.zzd;
        try {
            if (i11 == 0) {
                q.b(obj2);
                if (r.a(this.zzb, zzcm.zzb) || r.a(this.zzb, zzcm.zzd)) {
                    return f0.f21461a;
                }
                this.zzb = zzcm.zzc;
                double d11 = j10;
                try {
                    zzdt zzdtVar = this.zza;
                    double d12 = 0.6d * d11;
                    zzeeVar.zze = this;
                    double d13 = d11 * 0.4d;
                    zzeeVar.zza = d13;
                    zzeeVar.zzd = 1;
                    Object objZzo = zzdtVar.zzo((long) d12, zzeeVar);
                    if (objZzo != aVar) {
                        obj = objZzo;
                        d10 = d13;
                        zzefVar = this;
                        zzsc zzscVar = (zzsc) obj;
                        zzefVar.zzc = zzscVar;
                        zzeeVar.zze = zzefVar;
                        zzeeVar.zzd = 2;
                        Object objZzn = zzefVar.zza.zzn(zzscVar, (long) d10, zzeeVar);
                        j10 = zzefVar;
                    }
                    return aVar;
                } catch (zzbd e10) {
                    e = e10;
                    j10 = this;
                    j10.zzb = zzcm.zzd;
                    throw e;
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzef zzefVar2 = zzeeVar.zze;
                q.b(obj2);
                j10 = zzefVar2;
                j10.zzb = zzcm.zzb;
                return f0.f21461a;
            }
            double d14 = zzeeVar.zza;
            zzef zzefVar3 = zzeeVar.zze;
            try {
                q.b(obj2);
                obj = obj2;
                d10 = d14;
                zzefVar = zzefVar3;
                zzsc zzscVar2 = (zzsc) obj;
                zzefVar.zzc = zzscVar2;
                zzeeVar.zze = zzefVar;
                zzeeVar.zzd = 2;
                Object objZzn2 = zzefVar.zza.zzn(zzscVar2, (long) d10, zzeeVar);
                j10 = zzefVar;
            } catch (zzbd e11) {
                e = e11;
                j10 = zzefVar3;
                j10.zzb = zzcm.zzd;
                throw e;
            }
        } catch (zzbd e12) {
            e = e12;
        }
    }
}
