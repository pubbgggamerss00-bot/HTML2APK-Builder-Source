package com.google.android.gms.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzc {
    public static int zza(AdSize adSize) {
        return adSize.zzb();
    }

    public static int zzb(AdSize adSize) {
        return adSize.zza();
    }

    public static AdSize zzc(int i6, int i7, String str) {
        return new AdSize(i6, i7, str);
    }

    public static AdSize zzd(int i6, int i7) {
        AdSize adSize = new AdSize(i6, i7);
        adSize.zze(true);
        adSize.zzc(i7);
        return adSize;
    }

    public static AdSize zze(int i6, int i7) {
        AdSize adSize = new AdSize(i6, i7);
        adSize.zzf(true);
        adSize.zzd(i7);
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.zzg();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.zzh();
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.zzi();
    }
}
