package com.google.android.gms.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    private final int zzb;

    AdFormat(int i6) {
        this.zzb = i6;
    }

    public static AdFormat getAdFormat(int i6) {
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i6) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.zzb;
    }
}
