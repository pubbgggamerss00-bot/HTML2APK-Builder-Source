package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.recaptcha.RecaptchaException;
import e9.w0;
import eh.p;
import java.util.UUID;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import ph.r2;

/* loaded from: classes2.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final yh.a zzb = new yh.c();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(Application application) {
        this.zza = application;
        int i10 = 1;
        this.zze = new zzl(null, i10, 0 == true ? 1 : 0);
        int i11 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i12 = 0; i12 < 13; i12++) {
            zzaw zzawVar = zzawVarArr[i12];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) throws zzbd {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (r.a(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j10) throws zzbd {
        if (j10 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (p3.b.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return r.a(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j10, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, tg.e eVar, int i10, Object obj) throws RecaptchaException, r2, com.google.android.gms.common.api.b {
        if ((i10 & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i10 & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i10 & 2) != 0) {
            j10 = 10000;
        }
        return zzcvVar.zzg(str, j10, null, zzbiVar2, zzchVar2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, int i10, p pVar, tg.e eVar) throws RecaptchaException {
        zzcu zzcuVar;
        Exception e10;
        zzen zzenVar;
        zzbd e11;
        if (eVar instanceof zzcu) {
            zzcuVar = (zzcu) eVar;
            int i11 = zzcuVar.zzc;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                zzcuVar.zzc = i11 - PKIFailureInfo.systemUnavail;
            } else {
                zzcuVar = new zzcu(this, eVar);
            }
        }
        Object objInvoke = zzcuVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i12 = zzcuVar.zzc;
        if (i12 == 0) {
            q.b(objInvoke);
            zzek zzekVarZzk = zzk(str, this.zzf, i10);
            zzen zzenVarZzf = zzekVarZzk.zzf(6);
            try {
                zzcuVar.zzd = zzenVarZzf;
                zzcuVar.zzc = 1;
                objInvoke = pVar.invoke(zzekVarZzk, zzcuVar);
                if (objInvoke == aVar) {
                    return aVar;
                }
                zzenVar = zzenVarZzf;
            } catch (zzbd e12) {
                e11 = e12;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e11);
                throw e11.zzc();
            } catch (Exception e13) {
                e10 = e13;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e10.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar.zzc();
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzcuVar.zzd;
            try {
                q.b(objInvoke);
            } catch (zzbd e14) {
                e11 = e14;
                zzenVar.zzb(e11);
                throw e11.zzc();
            } catch (Exception e15) {
                e10 = e15;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e10.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2.zzc();
            }
        }
        zzenVar.zza();
        return objInvoke;
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i10) {
        String string = UUID.randomUUID().toString();
        int i11 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) w0.b(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, string, i10, this.zza, zzesVar, null);
        zzekVar.zzc(string);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, long j10, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, tg.e eVar) throws Throwable {
        zzcs zzcsVar;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j11;
        zzcv zzcvVar;
        String str2;
        yh.a aVar;
        yh.a aVar2;
        if (eVar instanceof zzcs) {
            zzcsVar = (zzcs) eVar;
            int i10 = zzcsVar.zzg;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzcsVar.zzg = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzcsVar = new zzcs(this, eVar);
            }
        }
        Object objZzj = zzcsVar.zze;
        ug.a aVar3 = ug.a.f29706a;
        int i11 = zzcsVar.zzg;
        try {
            if (i11 == 0) {
                q.b(objZzj);
                yh.a aVar4 = this.zzb;
                zzcsVar.zza = this;
                zzcsVar.zzh = str;
                zzcsVar.zzb = null;
                zzcsVar.zzj = zzbiVar;
                zzcsVar.zzi = zzchVar;
                zzcsVar.zzc = aVar4;
                zzcsVar.zzd = j10;
                zzcsVar.zzg = 1;
                if (aVar4.h(zzcsVar) != aVar3) {
                    zzbiVar2 = zzbiVar;
                    zzchVar2 = zzchVar;
                    j11 = j10;
                    zzcvVar = this;
                    str2 = str;
                    aVar = aVar4;
                }
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (yh.a) zzcsVar.zza;
                try {
                    q.b(objZzj);
                    zzdc zzdcVar = (zzdc) objZzj;
                    aVar2.l(null);
                    return zzdcVar;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.l(null);
                    throw th;
                }
            }
            long j12 = zzcsVar.zzd;
            yh.a aVar5 = (yh.a) zzcsVar.zzc;
            zzch zzchVar3 = zzcsVar.zzi;
            zzbi zzbiVar3 = zzcsVar.zzj;
            String str3 = zzcsVar.zzh;
            zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
            q.b(objZzj);
            zzchVar2 = zzchVar3;
            zzbiVar2 = zzbiVar3;
            str2 = str3;
            zzcvVar = zzcvVar2;
            j11 = j12;
            aVar = aVar5;
            int i12 = r.a(zzchVar2, zzch.zza) ? 3 : r.a(zzchVar2, zzch.zzb) ? 4 : 2;
            zzct zzctVar = new zzct(zzcvVar, str2, j11, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = aVar;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            objZzj = zzcvVar.zzj(str2, i12, zzctVar, zzcsVar);
            if (objZzj != aVar3) {
                aVar2 = aVar;
                zzdc zzdcVar2 = (zzdc) objZzj;
                aVar2.l(null);
                return zzdcVar2;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.l(null);
            throw th;
        }
    }
}
