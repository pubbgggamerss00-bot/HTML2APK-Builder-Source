package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.camera.camera2.internal.compat.workaround.c;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i6, int i7) {
        this(i6, i7, (i6 == -1 ? "FULL" : String.valueOf(i6)) + "x" + (i7 == -2 ? "AUTO" : String.valueOf(i7)) + "_as");
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i6) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i6, 50, 0);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i6) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        if (iZza == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i6, 0);
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    @Deprecated
    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context, int i6) {
        return zzj(i6, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0));
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i6, int i7) {
        AdSize adSize = new AdSize(i6, 0);
        adSize.zzg = i7;
        adSize.zzf = true;
        if (i7 < 32) {
            zzo.zzj("The maximum height set for the inline adaptive ad size was " + i7 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i6) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i6, 50, 2);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i6) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2);
        AdSize adSize = new AdSize(i6, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    @Deprecated
    public static AdSize getLandscapeInterscrollerAdSize(Context context, int i6) {
        return zzj(i6, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i6) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i6, 50, 1);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i6) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1);
        AdSize adSize = new AdSize(i6, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    @Deprecated
    public static AdSize getPortraitInterscrollerAdSize(Context context, int i6) {
        return zzj(i6, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1));
    }

    private static AdSize zzj(int i6, int i7) {
        if (i7 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i6, 0);
        adSize.zzi = i7;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context) {
        int i6 = this.zzc;
        if (i6 == -4 || i6 == -3) {
            return -1;
        }
        if (i6 == -2) {
            return zzs.zza(context.getResources().getDisplayMetrics());
        }
        zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i6);
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context) {
        int i6 = this.zzb;
        if (i6 == -3) {
            return -1;
        }
        if (i6 != -1) {
            zzbc.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i6);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzs> creator = zzs.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int i6) {
        this.zzg = i6;
    }

    public final void zzd(int i6) {
        this.zzi = i6;
    }

    public final void zze(boolean z6) {
        this.zzf = true;
    }

    public final void zzf(boolean z6) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public AdSize(int i6, int i7, String str) {
        if (i6 < 0 && i6 != -1 && i6 != -3) {
            throw new IllegalArgumentException(c.d(i6, "Invalid width for AdSize: "));
        }
        if (i7 < 0 && i7 != -2 && i7 != -4) {
            throw new IllegalArgumentException(c.d(i7, "Invalid height for AdSize: "));
        }
        this.zzb = i6;
        this.zzc = i7;
        this.zzd = str;
    }
}
