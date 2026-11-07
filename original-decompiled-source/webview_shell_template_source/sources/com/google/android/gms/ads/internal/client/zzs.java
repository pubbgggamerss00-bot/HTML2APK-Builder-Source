package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzs extends f3.a {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzs[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    public zzs() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zze(displayMetrics) * displayMetrics.density);
    }

    public static zzs zzb() {
        return new zzs("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzs zzc() {
        return new zzs("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzs zzd() {
        return new zzs("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    private static int zze(DisplayMetrics displayMetrics) {
        int i6 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i6 <= 400) {
            return 32;
        }
        return i6 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        String str = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 2, str);
        int i7 = this.zzb;
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(i7);
        int i8 = this.zzc;
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(i8);
        boolean z6 = this.zzd;
        e5.i.r(parcel, 5, 4);
        parcel.writeInt(z6 ? 1 : 0);
        int i9 = this.zze;
        e5.i.r(parcel, 6, 4);
        parcel.writeInt(i9);
        int i10 = this.zzf;
        e5.i.r(parcel, 7, 4);
        parcel.writeInt(i10);
        e5.i.p(parcel, 8, this.zzg, i6);
        boolean z7 = this.zzh;
        e5.i.r(parcel, 9, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzi;
        e5.i.r(parcel, 10, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.zzj;
        e5.i.r(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.zzk;
        e5.i.r(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzl;
        e5.i.r(parcel, 13, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.zzm;
        e5.i.r(parcel, 14, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.zzn;
        e5.i.r(parcel, 15, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.zzo;
        e5.i.r(parcel, 16, 4);
        parcel.writeInt(z14 ? 1 : 0);
        e5.i.t(iS, parcel);
    }

    public zzs(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzs(Context context, AdSize[] adSizeArr) {
        int height;
        int i6;
        int iZze;
        String str;
        int dimensionPixelSize;
        double d7;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean zIsFluid = adSize.isFluid();
        this.zzi = zIsFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        boolean zZzh = com.google.android.gms.ads.zzc.zzh(adSize);
        this.zzo = zZzh;
        if (zIsFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zza(adSize);
            this.zzb = height;
        } else if (zZzh) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zzb(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        boolean z6 = this.zze == -1;
        boolean z7 = height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z6) {
            zzbc.zzb();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r7.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    zzbc.zzb();
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i7 = displayMetrics2.heightPixels;
                        int i8 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i9 = displayMetrics2.heightPixels;
                        int i10 = displayMetrics2.widthPixels;
                        if (i9 == i7 && i10 == i8) {
                            int i11 = displayMetrics.widthPixels;
                            zzbc.zzb();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i11 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = dimensionPixelSize;
                        }
                        d7 = dimensionPixelSize / displayMetrics.density;
                        i6 = (int) d7;
                        if (d7 - i6 >= 0.01d) {
                        }
                    }
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.zzf = dimensionPixelSize;
                d7 = dimensionPixelSize / displayMetrics.density;
                i6 = (int) d7;
                if (d7 - i6 >= 0.01d) {
                    i6++;
                }
            }
        } else {
            i6 = this.zze;
            zzbc.zzb();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzp(displayMetrics, this.zze);
        }
        if (z7) {
            iZze = zze(displayMetrics);
        } else {
            iZze = this.zzb;
        }
        zzbc.zzb();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzp(displayMetrics, iZze);
        if (z6 || z7) {
            this.zza = i6 + "x" + iZze + "_as";
        } else {
            if (this.zzn || this.zzo) {
                str = this.zze + "x" + this.zzb + "_as";
            } else if (zIsFluid) {
                str = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = str;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzs[length];
            for (int i12 = 0; i12 < adSizeArr.length; i12++) {
                this.zzg[i12] = new zzs(context, adSizeArr[i12]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public zzs(String str, int i6, int i7, boolean z6, int i8, int i9, zzs[] zzsVarArr, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.zza = str;
        this.zzb = i6;
        this.zzc = i7;
        this.zzd = z6;
        this.zze = i8;
        this.zzf = i9;
        this.zzg = zzsVarArr;
        this.zzh = z7;
        this.zzi = z8;
        this.zzj = z9;
        this.zzk = z10;
        this.zzl = z11;
        this.zzm = z12;
        this.zzn = z13;
        this.zzo = z14;
    }
}
