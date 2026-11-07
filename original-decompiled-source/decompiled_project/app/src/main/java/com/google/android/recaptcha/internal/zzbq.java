package com.google.android.recaptcha.internal;

import eh.l;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;

/* loaded from: classes2.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (ph.t0.b(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ad -> B:13:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(l lVar, long j10, long j11, double d10, l lVar2, tg.e eVar) throws Exception {
        zzbp zzbpVar;
        long j12;
        long j13;
        double d11;
        l lVar3;
        zzbp zzbpVar2;
        l lVar4;
        l lVar5;
        long j14;
        double d12;
        Exception e10;
        if (eVar instanceof zzbp) {
            zzbpVar = (zzbp) eVar;
            int i10 = zzbpVar.zzh;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzbpVar.zzh = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzbpVar = new zzbp(this, eVar);
            }
        }
        Object obj = zzbpVar.zzf;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzbpVar.zzh;
        if (i11 == 0) {
            q.b(obj);
            j12 = j10;
            j13 = j11;
            d11 = d10;
            lVar3 = lVar2;
            zzbpVar2 = zzbpVar;
            lVar4 = lVar;
            zzbpVar2.zza = lVar4;
            zzbpVar2.zzb = lVar3;
            zzbpVar2.zzc = j13;
            zzbpVar2.zze = d11;
            zzbpVar2.zzd = j12;
            zzbpVar2.zzh = 1;
            Object objInvoke = lVar3.invoke(zzbpVar2);
            if (objInvoke != aVar) {
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = zzbpVar.zzd;
                d12 = zzbpVar.zze;
                j14 = zzbpVar.zzc;
                lVar3 = (l) zzbpVar.zzb;
                lVar5 = (l) zzbpVar.zza;
                q.b(obj);
                l lVar6 = lVar5;
                zzbpVar2 = zzbpVar;
                lVar4 = lVar6;
                long j15 = j14;
                d11 = d12;
                j13 = j15;
                try {
                } catch (Exception e11) {
                    e10 = e11;
                    zzbp zzbpVar3 = zzbpVar2;
                    lVar5 = lVar4;
                    zzbpVar = zzbpVar3;
                    double d13 = d11;
                    j14 = j13;
                    d12 = d13;
                    if (((Boolean) lVar5.invoke(e10)).booleanValue()) {
                    }
                }
                zzbpVar2.zza = lVar4;
                zzbpVar2.zzb = lVar3;
                zzbpVar2.zzc = j13;
                zzbpVar2.zze = d11;
                zzbpVar2.zzd = j12;
                zzbpVar2.zzh = 1;
                Object objInvoke2 = lVar3.invoke(zzbpVar2);
                return objInvoke2 != aVar ? aVar : objInvoke2;
            }
            j12 = zzbpVar.zzd;
            d12 = zzbpVar.zze;
            j14 = zzbpVar.zzc;
            lVar3 = (l) zzbpVar.zzb;
            lVar5 = (l) zzbpVar.zza;
            try {
                q.b(obj);
                return obj;
            } catch (Exception e12) {
                e10 = e12;
                if (((Boolean) lVar5.invoke(e10)).booleanValue()) {
                    throw e10;
                }
                j12 = (long) (j12 * d12);
                if (j12 > j14) {
                    j12 = j14;
                }
                zzbpVar.zza = lVar5;
                zzbpVar.zzb = lVar3;
                zzbpVar.zzc = j14;
                zzbpVar.zze = d12;
                zzbpVar.zzd = j12;
                zzbpVar.zzh = 2;
            }
        }
    }
}
