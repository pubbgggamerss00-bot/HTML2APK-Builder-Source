package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.p;
import pg.q;
import ph.u2;

/* loaded from: classes2.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j10, tg.e eVar) throws zzbd {
        zza zzaVar;
        zzen zzenVarZza;
        Exception exc;
        long j11;
        zzen zzenVar;
        zze zzeVar;
        zze zzeVar2;
        String str2;
        zze zzeVar3;
        String str3;
        long j12;
        Exception e10;
        String str4 = str;
        long j13 = j10;
        if (eVar instanceof zza) {
            zzaVar = (zza) eVar;
            int i10 = zzaVar.zze;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzaVar.zze = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzaVar = new zza(this, eVar);
            }
        }
        zza zzaVar2 = zzaVar;
        Object objB = zzaVar2.zzc;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzaVar2.zze;
        if (i11 == 0) {
            q.b(objB);
            zzenVarZza = zza(str);
            try {
                zzb zzbVar = new zzb(this, str4, null);
                zzaVar2.zza = this;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = zzenVarZza;
                zzaVar2.zzb = j13;
                zzaVar2.zze = 1;
                objB = u2.b(j13, zzbVar, zzaVar2);
                if (objB != aVar) {
                    zzeVar2 = this;
                }
            } catch (Exception e11) {
                exc = e11;
                j11 = j13;
                zzenVar = zzenVarZza;
                zzeVar = this;
                zzbd zzbdVarZza = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                if (zzenVar != null) {
                }
                zzaVar2.zza = zzeVar;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = null;
                zzaVar2.zze = 2;
                str2 = str4;
                if (zzeVar.zzi(str2, j11, exc, zzaVar2) != aVar) {
                }
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(objB);
                return objB;
            }
            str3 = zzaVar2.zzf;
            zzeVar3 = (zze) zzaVar2.zza;
            q.b(objB);
            zzaVar2.zza = null;
            zzaVar2.zzf = null;
            zzaVar2.zze = 3;
            Object objZzd = zzeVar3.zzd(str3, zzaVar2);
            return objZzd != aVar ? aVar : objZzd;
        }
        long j14 = zzaVar2.zzb;
        zzenVar = zzaVar2.zzg;
        String str5 = zzaVar2.zzf;
        zzeVar2 = (zze) zzaVar2.zza;
        try {
            q.b(objB);
            zzenVarZza = zzenVar;
            j13 = j14;
            str4 = str5;
        } catch (Exception e12) {
            e10 = e12;
            j12 = j14;
            str4 = str5;
            zzeVar = zzeVar2;
            j11 = j12;
            exc = e10;
            zzbd zzbdVarZza2 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVarZza2);
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j11, exc, zzaVar2) != aVar) {
                zzeVar3 = zzeVar;
                str3 = str2;
                zzaVar2.zza = null;
                zzaVar2.zzf = null;
                zzaVar2.zze = 3;
                Object objZzd2 = zzeVar3.zzd(str3, zzaVar2);
                if (objZzd2 != aVar) {
                }
            }
        }
        try {
            Object obj = ((p) objB).f21471a;
            q.b(obj);
            zzsi zzsiVar = (zzsi) obj;
            if (zzenVarZza == null) {
                return zzsiVar;
            }
            zzenVarZza.zza();
            return zzsiVar;
        } catch (Exception e13) {
            e10 = e13;
            j12 = j13;
            zzenVar = zzenVarZza;
            zzeVar = zzeVar2;
            j11 = j12;
            exc = e10;
            zzbd zzbdVarZza22 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
            if (zzenVar != null) {
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j11, exc, zzaVar2) != aVar) {
            }
        }
    }

    public abstract Object zzd(String str, tg.e eVar);

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[PHI: r8 r9 r11
      0x009b: PHI (r8v9 com.google.android.recaptcha.internal.zzen) = (r8v6 com.google.android.recaptcha.internal.zzen), (r8v15 com.google.android.recaptcha.internal.zzen) binds: [B:36:0x0099, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r9v6 com.google.android.recaptcha.internal.zze) = (r9v3 com.google.android.recaptcha.internal.zze), (r9v10 com.google.android.recaptcha.internal.zze) binds: [B:36:0x0099, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r11v8 java.lang.Object) = (r11v9 java.lang.Object), (r11v10 java.lang.Object) binds: [B:36:0x0099, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j10, zzsc zzscVar, tg.e eVar) throws zzbd {
        zzc zzcVar;
        Exception e10;
        zze zzeVar;
        zzen zzenVar;
        Object obj;
        Object objZzj;
        Object obj2;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        if (eVar instanceof zzc) {
            zzcVar = (zzc) eVar;
            int i10 = zzcVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzcVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzcVar = new zzc(this, eVar);
            }
        }
        Object obj3 = zzcVar.zzb;
        Object obj4 = ug.a.f29706a;
        int i11 = zzcVar.zzd;
        if (i11 == 0) {
            q.b(obj3);
            zzen zzenVarZzb = zzb();
            if (this.zza) {
                zzenVarZzb.zza();
                return f0.f21461a;
            }
            try {
                zzd zzdVar = new zzd(this, zzscVar, null);
                zzcVar.zza = this;
                zzcVar.zze = zzenVarZzb;
                zzcVar.zzd = 1;
                Object objB = u2.b(j10, zzdVar, zzcVar);
                if (objB != obj4) {
                    obj = objB;
                    zzenVar = zzenVarZzb;
                    zzeVar = this;
                }
            } catch (Exception e11) {
                e10 = e11;
                zzeVar = this;
                zzenVar = zzenVarZzb;
                zzeVar.zza = false;
                zzcVar.zza = zzeVar;
                zzcVar.zze = zzenVar;
                zzcVar.zzd = 2;
                objZzj = zzeVar.zzj(e10, zzcVar);
                obj2 = objZzj;
                if (objZzj != obj4) {
                }
                return obj4;
            }
            return obj4;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzbdVar2 = (zzbd) zzcVar.zza;
                q.b(obj3);
                return q.a(zzbdVar2);
            }
            zzenVar = zzcVar.zze;
            zzeVar = (zze) zzcVar.zza;
            q.b(obj3);
            obj2 = obj3;
            zzbdVar = (zzbd) obj2;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            zzcVar.zza = zzbdVar;
            zzcVar.zze = null;
            zzcVar.zzd = 3;
            if (zzeVar.zzg(zzbdVar, zzcVar) != obj4) {
                zzbdVar2 = zzbdVar;
                return q.a(zzbdVar2);
            }
            return obj4;
        }
        zzenVar = zzcVar.zze;
        zzeVar = (zze) zzcVar.zza;
        try {
            q.b(obj3);
            obj = obj3;
        } catch (Exception e12) {
            e10 = e12;
            zzeVar.zza = false;
            zzcVar.zza = zzeVar;
            zzcVar.zze = zzenVar;
            zzcVar.zzd = 2;
            objZzj = zzeVar.zzj(e10, zzcVar);
            obj2 = objZzj;
            if (objZzj != obj4) {
                zzbdVar = (zzbd) obj2;
                if (zzenVar != null) {
                }
                zzcVar.zza = zzbdVar;
                zzcVar.zze = null;
                zzcVar.zzd = 3;
                if (zzeVar.zzg(zzbdVar, zzcVar) != obj4) {
                }
            }
            return obj4;
        }
        q.b(((p) obj).f21471a);
        f0 f0Var = f0.f21461a;
        zzeVar.zza = true;
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return f0Var;
    }

    public abstract Object zzf(String str, tg.e eVar) throws zzbd;

    public Object zzg(zzbd zzbdVar, tg.e eVar) {
        return f0.f21461a;
    }

    public abstract Object zzh(zzsc zzscVar, tg.e eVar) throws zzbd;

    public Object zzi(String str, long j10, Exception exc, tg.e eVar) {
        return f0.f21461a;
    }

    public Object zzj(Exception exc, tg.e eVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
