package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import qg.o;

/* loaded from: classes2.dex */
public final class zzcb {
    private Object zza;
    private final yh.a zzb = new yh.c();

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, tg.e eVar) {
        zzby zzbyVar;
        yh.a aVar;
        zzcb zzcbVar;
        if (eVar instanceof zzby) {
            zzbyVar = (zzby) eVar;
            int i10 = zzbyVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzbyVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzbyVar = new zzby(this, eVar);
            }
        }
        Object obj2 = zzbyVar.zzb;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = zzbyVar.zzd;
        if (i11 == 0) {
            q.b(obj2);
            aVar = this.zzb;
            zzbyVar.zze = this;
            zzbyVar.zzf = (zzje) obj;
            zzbyVar.zza = aVar;
            zzbyVar.zzd = 1;
            if (aVar.h(zzbyVar) == aVar2) {
                return aVar2;
            }
            zzcbVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yh.a aVar3 = (yh.a) zzbyVar.zza;
            zzje zzjeVar = zzbyVar.zzf;
            zzcbVar = zzbyVar.zze;
            q.b(obj2);
            aVar = aVar3;
            obj = zzjeVar;
        }
        try {
            return Boolean.valueOf(r.a(zzcbVar.zza, obj));
        } finally {
            aVar.l(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, tg.e eVar) {
        zzbz zzbzVar;
        yh.a aVar;
        zzcb zzcbVar;
        if (eVar instanceof zzbz) {
            zzbzVar = (zzbz) eVar;
            int i10 = zzbzVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzbzVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzbzVar = new zzbz(this, eVar);
            }
        }
        Object obj = zzbzVar.zzb;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = zzbzVar.zzd;
        if (i11 == 0) {
            q.b(obj);
            aVar = this.zzb;
            zzbzVar.zze = this;
            zzbzVar.zzf = (zzje[]) objArr;
            zzbzVar.zza = aVar;
            zzbzVar.zzd = 1;
            if (aVar.h(zzbzVar) == aVar2) {
                return aVar2;
            }
            zzcbVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yh.a aVar3 = (yh.a) zzbzVar.zza;
            zzje[] zzjeVarArr = zzbzVar.zzf;
            zzcbVar = zzbzVar.zze;
            q.b(obj);
            aVar = aVar3;
            objArr = zzjeVarArr;
        }
        try {
            return Boolean.valueOf(o.r(objArr, zzcbVar.zza));
        } finally {
            aVar.l(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, tg.e eVar) {
        zzca zzcaVar;
        yh.a aVar;
        zzcb zzcbVar;
        if (eVar instanceof zzca) {
            zzcaVar = (zzca) eVar;
            int i10 = zzcaVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzcaVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzcaVar = new zzca(this, eVar);
            }
        }
        Object obj2 = zzcaVar.zzb;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = zzcaVar.zzd;
        if (i11 == 0) {
            q.b(obj2);
            aVar = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzje) obj;
            zzcaVar.zza = aVar;
            zzcaVar.zzd = 1;
            if (aVar.h(zzcaVar) == aVar2) {
                return aVar2;
            }
            zzcbVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yh.a aVar3 = (yh.a) zzcaVar.zza;
            zzje zzjeVar = zzcaVar.zzf;
            zzcbVar = zzcaVar.zze;
            q.b(obj2);
            aVar = aVar3;
            obj = zzjeVar;
        }
        try {
            zzcbVar.zza = obj;
            f0 f0Var = f0.f21461a;
            aVar.l(null);
            return f0.f21461a;
        } catch (Throwable th2) {
            aVar.l(null);
            throw th2;
        }
    }
}
