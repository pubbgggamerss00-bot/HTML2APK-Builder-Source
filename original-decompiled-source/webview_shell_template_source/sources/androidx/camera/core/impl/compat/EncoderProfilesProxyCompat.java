package androidx.camera.core.impl.compat;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.internal.s0;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class EncoderProfilesProxyCompat {
    private static final String TAG = "EncoderProfilesProxyCompat";

    private EncoderProfilesProxyCompat() {
    }

    public static EncoderProfilesProxy from(EncoderProfiles encoderProfiles) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            return EncoderProfilesProxyCompatApi33Impl.from(encoderProfiles);
        }
        if (i6 >= 31) {
            return EncoderProfilesProxyCompatApi31Impl.from(encoderProfiles);
        }
        throw new RuntimeException(s0.a(i6, "Unable to call from(EncoderProfiles) on API ", ". Version 31 or higher required."));
    }

    public static EncoderProfilesProxy from(CamcorderProfile camcorderProfile) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            Logger.w(TAG, "Should use from(EncoderProfiles) on API " + i6 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return EncoderProfilesProxyCompatBaseImpl.from(camcorderProfile);
    }
}
