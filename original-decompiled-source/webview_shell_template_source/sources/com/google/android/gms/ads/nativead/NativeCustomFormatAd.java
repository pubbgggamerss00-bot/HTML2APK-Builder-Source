package com.google.android.gms.ads.nativead;

import android.view.View;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface NativeCustomFormatAd {
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface DisplayOpenMeasurement {
        void setView(View view);

        boolean start();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OnCustomClickListener {
        void onCustomClick(NativeCustomFormatAd nativeCustomFormatAd, String str);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(NativeCustomFormatAd nativeCustomFormatAd);
    }

    void destroy();

    List<String> getAvailableAssetNames();

    String getCustomFormatId();

    DisplayOpenMeasurement getDisplayOpenMeasurement();

    NativeAd.Image getImage(String str);

    MediaContent getMediaContent();

    CharSequence getText(String str);

    void performClick(String str);

    void recordImpression();
}
