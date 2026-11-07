package com.google.android.recaptcha.internal;

import e9.w0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.j;
import pg.q;
import ph.j0;

/* loaded from: classes2.dex */
public final class zzfj {
    private final j zza;

    public zzfj() {
        int i10 = zzav.zza;
        this.zza = w0.b(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, tg.e eVar) {
        zzfg zzfgVar;
        if (eVar instanceof zzfg) {
            zzfgVar = (zzfg) eVar;
            int i10 = zzfgVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzfgVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzfgVar = new zzfg(zzfjVar, eVar);
            }
        }
        Object obj = zzfgVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzfgVar.zzc;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            return obj;
        }
        q.b(obj);
        zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
        zzfgVar.zzc = 1;
        Object objC = j0.c(zzfhVar, zzfgVar);
        return objC == aVar ? aVar : objC;
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, tg.e eVar) {
        return zzc(this, zzbrVar, zzspVar, eVar);
    }
}
