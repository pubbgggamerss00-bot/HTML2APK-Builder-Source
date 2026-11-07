package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.compat.EncoderProfilesProxyCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class Camera2EncoderProfilesProvider implements EncoderProfilesProvider {
    private static final String TAG = "Camera2EncoderProfilesProvider";
    private final String mCameraId;
    private final Quirks mCameraQuirks;
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final boolean mHasValidCameraId;
    private final int mIntCameraId;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static EncoderProfiles getAll(String str, int i6) {
            return CamcorderProfile.getAll(str, i6);
        }
    }

    public Camera2EncoderProfilesProvider(String str, Quirks quirks) throws NumberFormatException {
        boolean z6;
        int i6;
        this.mCameraId = str;
        try {
            i6 = Integer.parseInt(str);
            z6 = true;
        } catch (NumberFormatException unused) {
            Logger.w(TAG, "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z6 = false;
            i6 = -1;
        }
        this.mHasValidCameraId = z6;
        this.mIntCameraId = i6;
        this.mCameraQuirks = quirks;
    }

    private EncoderProfilesProxy createProfilesFromCamcorderProfile(int i6) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.mIntCameraId, i6);
        } catch (RuntimeException e6) {
            Logger.w(TAG, "Unable to get CamcorderProfile by quality: " + i6, e6);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return EncoderProfilesProxyCompat.from(camcorderProfile);
        }
        return null;
    }

    private EncoderProfilesProxy findHighestQualityProfiles() {
        Iterator<Integer> it = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.iterator();
        while (it.hasNext()) {
            EncoderProfilesProxy all = getAll(it.next().intValue());
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    private EncoderProfilesProxy findLowestQualityProfiles() {
        for (int size = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.size() - 1; size >= 0; size--) {
            EncoderProfilesProxy all = getAll(size);
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    private EncoderProfilesProxy getProfilesInternal(int i6) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles all = Api31Impl.getAll(this.mCameraId, i6);
            if (all == null) {
                return null;
            }
            if (DeviceQuirks.get(InvalidVideoProfilesQuirk.class) != null) {
                Logger.d(TAG, "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return EncoderProfilesProxyCompat.from(all);
                } catch (NullPointerException e6) {
                    Logger.w(TAG, "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e6);
                }
            }
        }
        return createProfilesFromCamcorderProfile(i6);
    }

    private boolean isEncoderProfilesResolutionValidInQuirk(EncoderProfilesProxy encoderProfilesProxy) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.mCameraQuirks.get(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = encoderProfilesProxy.getVideoProfiles();
        if (videoProfiles.isEmpty()) {
            return true;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = videoProfiles.get(0);
        return camcorderProfileResolutionQuirk.getSupportedResolutions().contains(new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight()));
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i6) {
        EncoderProfilesProxy encoderProfilesProxyFindLowestQualityProfiles = null;
        if (!this.mHasValidCameraId || !CamcorderProfile.hasProfile(this.mIntCameraId, i6)) {
            return null;
        }
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i6))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i6));
        }
        EncoderProfilesProxy profilesInternal = getProfilesInternal(i6);
        if (profilesInternal == null || isEncoderProfilesResolutionValidInQuirk(profilesInternal)) {
            encoderProfilesProxyFindLowestQualityProfiles = profilesInternal;
        } else if (i6 == 1) {
            encoderProfilesProxyFindLowestQualityProfiles = findHighestQualityProfiles();
        } else if (i6 == 0) {
            encoderProfilesProxyFindLowestQualityProfiles = findLowestQualityProfiles();
        }
        this.mEncoderProfilesCache.put(Integer.valueOf(i6), encoderProfilesProxyFindLowestQualityProfiles);
        return encoderProfilesProxyFindLowestQualityProfiles;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i6) {
        return this.mHasValidCameraId && getAll(i6) != null;
    }
}
