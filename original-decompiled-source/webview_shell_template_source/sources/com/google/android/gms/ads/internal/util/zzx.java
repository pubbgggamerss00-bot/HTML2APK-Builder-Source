package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zn;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@TargetApi(28)
/* loaded from: classes.dex */
public class zzx extends zzv {
    public static final /* synthetic */ WindowInsets zzl(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzv.zzp().d().zzj() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (displayCutout != null) {
                zzj zzjVarD = com.google.android.gms.ads.internal.zzv.zzp().d();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    Locale locale = Locale.US;
                    String str = rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom;
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                zzjVarD.zzy(strConcat);
            } else {
                com.google.android.gms.ads.internal.zzv.zzp().d().zzy(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z6, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i6 = attributes.layoutInDisplayCutoutMode;
        int i7 = true != z6 ? 2 : 1;
        if (i7 != i6) {
            attributes.layoutInDisplayCutoutMode = i7;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzj(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzk(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11448o1)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().d().zzj() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.zzl(activity, view, windowInsets);
                }
            });
        }
    }
}
