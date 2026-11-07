package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;
import pg.q;
import ph.j0;
import qg.t;
import qg.z;

/* loaded from: classes2.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzh(zze... zzeVarArr) {
        t.q(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j10, tg.e eVar) {
        return j0.c(new zzh(this, str, j10, null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(long j10, zzsc zzscVar, zzek zzekVar, tg.e eVar) {
        zzi zziVar;
        if (eVar instanceof zzi) {
            zziVar = (zzi) eVar;
            int i10 = zziVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zziVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zziVar = new zzi(this, eVar);
            }
        }
        Object objC = zziVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zziVar.zzc;
        if (i11 == 0) {
            q.b(objC);
            zzk zzkVar = new zzk(this, zzekVar, j10, zzscVar, null);
            zziVar.zzc = 1;
            objC = j0.c(zzkVar, zziVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(objC);
        }
        return ((p) objC).f21471a;
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i10, j jVar) {
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) z.f22752a.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
