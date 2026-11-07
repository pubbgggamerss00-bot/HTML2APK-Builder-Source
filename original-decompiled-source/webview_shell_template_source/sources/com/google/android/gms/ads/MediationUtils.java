package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zn;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MediationUtils {
    protected static final double MIN_HEIGHT_RATIO = 0.7d;
    protected static final double MIN_WIDTH_RATIO = 0.5d;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AdSize findClosestSize(Context context, AdSize adSize, List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.zzh() && !adSize.zzi()) {
                float f6 = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.getWidthInPixels(context) / f6), Math.round(adSize.getHeightInPixels(context) / f6));
            }
            for (AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    double d7 = width * MIN_WIDTH_RATIO;
                    double d8 = width2;
                    int height2 = adSize3.getHeight();
                    if (d7 <= d8 && width >= width2) {
                        if (adSize.zzi()) {
                            int iZza = adSize.zza();
                            if (((Integer) zzbe.zzc().a(zn.L7)).intValue() <= width2) {
                                if (((Integer) zzbe.zzc().a(zn.M7)).intValue() <= height2 && iZza >= height2) {
                                    if (adSize2 != null) {
                                        if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                        }
                                    }
                                    adSize2 = adSize3;
                                }
                            }
                        } else if (adSize.zzh()) {
                            if (adSize.zzb() >= height2) {
                                if (adSize2 != null) {
                                }
                                adSize2 = adSize3;
                            }
                        } else if (height * MIN_HEIGHT_RATIO <= height2 && height >= height2) {
                            if (adSize2 != null) {
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
