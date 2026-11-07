package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import eh.p;
import java.util.UUID;
import mh.k;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import ph.h;

/* loaded from: classes2.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final k zza = new k("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j10, RecaptchaAction recaptchaAction) throws zzbd {
        zzbd zzbdVar = !zza.e(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j10 < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(RecaptchaAction recaptchaAction, long j10, tg.e eVar) {
        zzcy zzcyVar;
        String string;
        zzbd zzbdVar;
        if (eVar instanceof zzcy) {
            zzcyVar = (zzcy) eVar;
            int i10 = zzcyVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzcyVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzcyVar = new zzcy(this, eVar);
            }
        }
        Object objZzg = zzcyVar.zza;
        Object obj = ug.a.f29706a;
        int i11 = zzcyVar.zzc;
        if (i11 == 0) {
            q.b(objZzg);
            try {
                string = UUID.randomUUID().toString();
            } catch (zzbd e10) {
                e = e10;
                zzbdVar = e;
                return q.a(zzbdVar.zzc());
            }
            try {
                p zzczVar = new zzcz(this, j10, recaptchaAction, string, null);
                zzcyVar.zzc = 1;
                objZzg = zzg(string, zzczVar, zzcyVar);
                if (objZzg == obj) {
                    return obj;
                }
            } catch (zzbd e11) {
                e = e11;
                zzbdVar = e;
                return q.a(zzbdVar.zzc());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                q.b(objZzg);
            } catch (zzbd e12) {
                zzbdVar = e12;
                return q.a(zzbdVar.zzc());
            }
        }
        return ((pg.p) objZzg).f21471a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, p pVar, tg.e eVar) throws zzbd {
        zzdb zzdbVar;
        if (eVar instanceof zzdb) {
            zzdbVar = (zzdb) eVar;
            int i10 = zzdbVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzdbVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzdbVar = new zzdb(this, eVar);
            }
        }
        Object objInvoke = zzdbVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzdbVar.zzc;
        try {
            if (i11 == 0) {
                q.b(objInvoke);
                zzek zzekVarZza = this.zzd.zza();
                zzekVarZza.zzc(str);
                zzen zzenVarZzf = zzekVarZza.zzf(9);
                zzdbVar.zzd = zzenVarZzf;
                zzdbVar.zzc = 1;
                objInvoke = pVar.invoke(zzekVarZza, zzdbVar);
                str = zzenVarZzf;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzen zzenVar = zzdbVar.zzd;
                q.b(objInvoke);
                str = zzenVar;
            }
            str.zza();
            return objInvoke;
        } catch (zzbd e10) {
            str.zzb(e10);
            throw e10;
        } catch (Exception e11) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e11.getMessage());
            str.zzb(zzbdVar);
            throw zzbdVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo71execute0E7RQCE(RecaptchaAction recaptchaAction, long j10, tg.e<? super pg.p<String>> eVar) {
        zzcw zzcwVar;
        if (eVar instanceof zzcw) {
            zzcwVar = (zzcw) eVar;
            int i10 = zzcwVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzcwVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzcwVar = new zzcw(this, eVar);
            }
        }
        Object obj = zzcwVar.zza;
        Object obj2 = ug.a.f29706a;
        int i11 = zzcwVar.zzc;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            return ((pg.p) obj).f21471a;
        }
        q.b(obj);
        zzcwVar.zzc = 1;
        Object objZzf = zzf(recaptchaAction, j10, zzcwVar);
        return objZzf == obj2 ? obj2 : objZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo72executegIAlus(RecaptchaAction recaptchaAction, tg.e<? super pg.p<String>> eVar) {
        zzcx zzcxVar;
        if (eVar instanceof zzcx) {
            zzcxVar = (zzcx) eVar;
            int i10 = zzcxVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzcxVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzcxVar = new zzcx(this, eVar);
            }
        }
        Object obj = zzcxVar.zza;
        Object obj2 = ug.a.f29706a;
        int i11 = zzcxVar.zzc;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            return ((pg.p) obj).f21471a;
        }
        q.b(obj);
        zzcxVar.zzc = 1;
        Object objMo71execute0E7RQCE = mo71execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
        return objMo71execute0E7RQCE == obj2 ? obj2 : objMo71execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(h.a(this.zze.zzb(), null, new zzda(this, recaptchaAction, 10000L, null), 3));
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j10) {
        return zzas.zza(h.a(this.zze.zzb(), null, new zzda(this, recaptchaAction, j10, null), 3));
    }
}
