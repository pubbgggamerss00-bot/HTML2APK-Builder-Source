package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.c50;
import com.google.android.gms.internal.ads.r10;
import com.google.android.gms.internal.ads.xs;
import com.google.android.gms.internal.ads.ys;
import java.util.Random;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbc {
    public static final /* synthetic */ int zza = 0;
    private static final zzbc zzb = new zzbc();
    private final com.google.android.gms.ads.internal.util.client.zzf zzc;
    private final zzba zzd;
    private final String zze;
    private final VersionInfoParcel zzf;
    private final Random zzg;

    public zzbc() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzba zzbaVar = new zzba(new zzk(), new zzi(), new zzfe(), new xs("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl"), new c50(), new r10("com.google.android.gms.ads.AdOverlayCreatorImpl"), new ys("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl"), new zzl());
        String strZze = com.google.android.gms.ads.internal.util.client.zzf.zze();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 244410000, true);
        Random random = new Random();
        this.zzc = zzfVar;
        this.zzd = zzbaVar;
        this.zze = strZze;
        this.zzf = versionInfoParcel;
        this.zzg = random;
    }

    public static zzba zza() {
        return zzb.zzd;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zzb() {
        return zzb.zzc;
    }

    public static VersionInfoParcel zzc() {
        return zzb.zzf;
    }

    public static String zzd() {
        return zzb.zze;
    }

    public static Random zze() {
        return zzb.zzg;
    }
}
