package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zzbk {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i10, long j10) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i10);
        Object zzbjVar = concurrentHashMap.get(numValueOf);
        if (zzbjVar == null) {
            zzbjVar = new zzbj();
        }
        zzbj zzbjVar2 = (zzbj) zzbjVar;
        zzbjVar2.zzg(zzbjVar2.zzb() + 1);
        zzbjVar2.zzf(zzbjVar2.zzd() + j10);
        zzbjVar2.zze(Math.max(j10, zzbjVar2.zzc()));
        concurrentHashMap.put(numValueOf, zzbjVar2);
    }
}
