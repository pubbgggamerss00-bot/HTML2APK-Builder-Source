package androidx.camera.core.processing.util;

import androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class GraphicDeviceInfo {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class Builder {
        public abstract GraphicDeviceInfo build();

        public abstract Builder setEglExtensions(String str);

        public abstract Builder setEglVersion(String str);

        public abstract Builder setGlExtensions(String str);

        public abstract Builder setGlVersion(String str);
    }

    public static Builder builder() {
        return new AutoValue_GraphicDeviceInfo.Builder().setGlVersion(GLUtils.VERSION_UNKNOWN).setEglVersion(GLUtils.VERSION_UNKNOWN).setGlExtensions(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).setEglExtensions(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public abstract String getEglExtensions();

    public abstract String getEglVersion();

    public abstract String getGlExtensions();

    public abstract String getGlVersion();
}
