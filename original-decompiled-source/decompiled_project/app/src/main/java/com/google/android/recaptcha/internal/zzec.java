package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import eh.l;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import ph.h;
import ph.u;
import ph.v;
import ph.w;

/* loaded from: classes2.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private zzbd zzd;
    private zzsc zze;
    private final zzbi zzg;
    private u zzc = w.a();
    private zzcm zzf = zzcm.zza;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(l lVar, tg.e eVar) {
        zzdv zzdvVar;
        zzbn zzbnVar;
        if (eVar instanceof zzdv) {
            zzdvVar = (zzdv) eVar;
            int i10 = zzdvVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzdvVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzdvVar = new zzdv(this, eVar);
            }
        }
        Object obj = zzdvVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzdvVar.zzc;
        if (i11 == 0) {
            q.b(obj);
            zzbn zzbnVar2 = new zzbn();
            zzdvVar.zzd = zzbnVar2;
            zzdvVar.zzc = 1;
            if (lVar.invoke(zzdvVar) == aVar) {
                return aVar;
            }
            zzbnVar = zzbnVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbnVar = zzdvVar.zzd;
            q.b(obj);
        }
        zzbnVar.zzc();
        return new Long(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:13:0x002b, B:26:0x0063, B:31:0x0076, B:32:0x007f), top: B:53:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(long j10, tg.e eVar) throws zzbd {
        zzdw zzdwVar;
        zzec zzecVar;
        zzec zzecVar2;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        long jLongValue;
        if (eVar instanceof zzdw) {
            zzdwVar = (zzdw) eVar;
            int i10 = zzdwVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzdwVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzdwVar = new zzdw(this, eVar);
            }
        }
        Object objZzl = zzdwVar.zzb;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzdwVar.zzd;
        try {
            if (i11 == 0) {
                q.b(objZzl);
                zzdwVar.zze = this;
                zzdwVar.zza = j10;
                zzdwVar.zzd = 1;
                if (zzn(j10, zzdwVar) != aVar) {
                    zzecVar = this;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = zzdwVar.zza;
                zzecVar2 = zzdwVar.zze;
                try {
                    q.b(objZzl);
                    jLongValue = j10 - ((Number) objZzl).longValue();
                    if (jLongValue < 500) {
                        return new Long(jLongValue);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzar, null);
                } catch (Exception e10) {
                    e = e10;
                    if (e instanceof zzbd) {
                    }
                    if (zzbdVar == null) {
                    }
                    if (r.a(zzecVar2.zzf, zzcm.zzd)) {
                    }
                    throw zzbdVar2;
                }
            }
            j10 = zzdwVar.zza;
            zzecVar = zzdwVar.zze;
            q.b(objZzl);
            zzdy zzdyVar = new zzdy(j10, zzecVar, null);
            zzdwVar.zze = zzecVar;
            zzdwVar.zza = j10;
            zzdwVar.zzd = 2;
            objZzl = zzecVar.zzl(zzdyVar, zzdwVar);
            if (objZzl != aVar) {
                zzecVar2 = zzecVar;
                jLongValue = j10 - ((Number) objZzl).longValue();
                if (jLongValue < 500) {
                }
            }
            return aVar;
        } catch (Exception e11) {
            e = e11;
            zzecVar2 = zzecVar;
            zzbdVar = e instanceof zzbd ? (zzbd) e : null;
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            if ((!r.a(zzecVar2.zzf, zzcm.zzd) || r.a(zzecVar2.zzf, zzcm.zzc)) && (zzbdVar2 = zzecVar2.zzd) != null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
    }

    private final Object zzn(long j10, tg.e eVar) {
        if (r.a(this.zzf, zzcm.zzb) || r.a(this.zzf, zzcm.zzc)) {
            return f0.f21461a;
        }
        if (r.a(this.zzf, zzcm.zzd) && !zzo(this.zzd)) {
            return f0.f21461a;
        }
        this.zzf = zzcm.zzc;
        v vVarA = w.a();
        this.zzc = vVarA;
        h.c(this.zzg.zza(), null, null, new zzeb(this, vVarA, j10, null), 3);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (r.a(zzbdVar.zzb(), zzbb.zzd) || r.a(zzbdVar.zzb(), zzbb.zze) || r.a(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j10, tg.e eVar) throws zzbd {
        zzdu zzduVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object objZzm;
        zzec zzecVar;
        String str3;
        double d10;
        zzec zzecVar2;
        zzsc zzscVar;
        String str4;
        zzec zzecVar3;
        if (eVar instanceof zzdu) {
            zzduVar = (zzdu) eVar;
            int i10 = zzduVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzduVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzduVar = new zzdu(this, eVar);
            }
        }
        zzdu zzduVar2 = zzduVar;
        Object objZzm2 = zzduVar2.zzb;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzduVar2.zzd;
        try {
            if (i11 == 0) {
                q.b(objZzm2);
                zzduVar2.zze = this;
                str2 = str;
                zzduVar2.zzf = str2;
                recaptchaAction2 = recaptchaAction;
                zzduVar2.zzg = recaptchaAction2;
                zzduVar2.zzd = 1;
                objZzm = zzm(j10, zzduVar2);
                if (objZzm == aVar) {
                    return aVar;
                }
                zzecVar = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str4 = zzduVar2.zzf;
                        zzecVar3 = zzduVar2.zze;
                        q.b(objZzm2);
                        zzsr zzsrVar = (zzsr) objZzm2;
                        zzecVar3.zza.zzq(str4, zzsrVar);
                        return zzsrVar.zzj();
                    }
                    d10 = zzduVar2.zza;
                    recaptchaAction2 = zzduVar2.zzg;
                    str3 = zzduVar2.zzf;
                    zzecVar2 = zzduVar2.zze;
                    q.b(objZzm2);
                    zzsi zzsiVar = (zzsi) objZzm2;
                    zzdt zzdtVar = zzecVar2.zza;
                    zzscVar = zzecVar2.zze;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzspVarZzi = zzdtVar.zzi(recaptchaAction2, zzsiVar, zzscVar);
                    zzdt zzdtVar2 = zzecVar2.zza;
                    long j11 = (long) d10;
                    zzduVar2.zze = zzecVar2;
                    zzduVar2.zzf = str3;
                    zzduVar2.zzg = null;
                    zzduVar2.zzd = 3;
                    String str5 = str3;
                    objZzm2 = zzdtVar2.zzm(zzspVarZzi, str5, j11, zzduVar2);
                    if (objZzm2 != aVar) {
                        str4 = str5;
                        zzecVar3 = zzecVar2;
                        zzsr zzsrVar2 = (zzsr) objZzm2;
                        zzecVar3.zza.zzq(str4, zzsrVar2);
                        return zzsrVar2.zzj();
                    }
                    return aVar;
                }
                recaptchaAction2 = zzduVar2.zzg;
                String str6 = zzduVar2.zzf;
                zzecVar = zzduVar2.zze;
                q.b(objZzm2);
                objZzm = objZzm2;
                str2 = str6;
            }
            double dLongValue = ((Number) objZzm).longValue();
            zzdt zzdtVar3 = zzecVar.zza;
            double d11 = 0.45d * dLongValue;
            zzduVar2.zze = zzecVar;
            zzduVar2.zzf = str2;
            zzduVar2.zzg = recaptchaAction2;
            double d12 = dLongValue * 0.55d;
            zzduVar2.zza = d12;
            zzduVar2.zzd = 2;
            Object objZzl = zzdtVar3.zzl(str2, (long) d11, zzduVar2);
            if (objZzl != aVar) {
                zzec zzecVar4 = zzecVar;
                str3 = str2;
                objZzm2 = objZzl;
                d10 = d12;
                zzecVar2 = zzecVar4;
                zzsi zzsiVar2 = (zzsi) objZzm2;
                zzdt zzdtVar4 = zzecVar2.zza;
                zzscVar = zzecVar2.zze;
                if (zzscVar == null) {
                }
                zzsp zzspVarZzi2 = zzdtVar4.zzi(recaptchaAction2, zzsiVar2, zzscVar);
                zzdt zzdtVar22 = zzecVar2.zza;
                long j112 = (long) d10;
                zzduVar2.zze = zzecVar2;
                zzduVar2.zzf = str3;
                zzduVar2.zzg = null;
                zzduVar2.zzd = 3;
                String str52 = str3;
                objZzm2 = zzdtVar22.zzm(zzspVarZzi2, str52, j112, zzduVar2);
                if (objZzm2 != aVar) {
                }
            }
            return aVar;
        } catch (zzbd e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e11.getMessage());
        }
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j10, tg.e eVar) {
        Object objZzn = zzn(j10, eVar);
        return objZzn == ug.a.f29706a ? objZzn : f0.f21461a;
    }
}
