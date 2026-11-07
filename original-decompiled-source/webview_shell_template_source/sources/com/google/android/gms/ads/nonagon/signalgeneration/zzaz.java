package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.ok;
import com.google.android.gms.internal.ads.p60;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzaz {
    private final String zza;
    private final String zzb;
    private final p60 zzc;

    public /* synthetic */ zzaz(zzax zzaxVar, zzay zzayVar) {
        this.zza = zzaxVar.zza;
        this.zzb = zzaxVar.zzb;
        this.zzc = zzaxVar.zzc;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ok zza() {
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return ok.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return ok.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return ok.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    return ok.BANNER;
                }
                break;
        }
        return ok.AD_INITIATER_UNSPECIFIED;
    }

    public final p60 zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Set zze() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
