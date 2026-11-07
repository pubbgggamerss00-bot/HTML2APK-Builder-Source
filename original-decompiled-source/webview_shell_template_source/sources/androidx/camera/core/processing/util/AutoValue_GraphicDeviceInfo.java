package androidx.camera.core.processing.util;

import androidx.activity.m;
import androidx.camera.core.c;
import androidx.camera.core.processing.util.GraphicDeviceInfo;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_GraphicDeviceInfo extends GraphicDeviceInfo {
    private final String eglExtensions;
    private final String eglVersion;
    private final String glExtensions;
    private final String glVersion;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Builder extends GraphicDeviceInfo.Builder {
        private String eglExtensions;
        private String eglVersion;
        private String glExtensions;
        private String glVersion;

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo build() {
            String strB = this.glVersion == null ? " glVersion" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (this.eglVersion == null) {
                strB = c.b(strB, " eglVersion");
            }
            if (this.glExtensions == null) {
                strB = c.b(strB, " glExtensions");
            }
            if (this.eglExtensions == null) {
                strB = c.b(strB, " eglExtensions");
            }
            if (strB.isEmpty()) {
                return new AutoValue_GraphicDeviceInfo(this.glVersion, this.eglVersion, this.glExtensions, this.eglExtensions);
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setEglExtensions(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.eglExtensions = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setEglVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.eglVersion = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setGlExtensions(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.glExtensions = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setGlVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.glVersion = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GraphicDeviceInfo) {
            GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) obj;
            if (this.glVersion.equals(graphicDeviceInfo.getGlVersion()) && this.eglVersion.equals(graphicDeviceInfo.getEglVersion()) && this.glExtensions.equals(graphicDeviceInfo.getGlExtensions()) && this.eglExtensions.equals(graphicDeviceInfo.getEglExtensions())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public String getEglExtensions() {
        return this.eglExtensions;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public String getEglVersion() {
        return this.eglVersion;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public String getGlExtensions() {
        return this.glExtensions;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public String getGlVersion() {
        return this.glVersion;
    }

    public int hashCode() {
        return ((((((this.glVersion.hashCode() ^ 1000003) * 1000003) ^ this.eglVersion.hashCode()) * 1000003) ^ this.glExtensions.hashCode()) * 1000003) ^ this.eglExtensions.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.glVersion);
        sb.append(", eglVersion=");
        sb.append(this.eglVersion);
        sb.append(", glExtensions=");
        sb.append(this.glExtensions);
        sb.append(", eglExtensions=");
        return m.e(sb, this.eglExtensions, "}");
    }

    private AutoValue_GraphicDeviceInfo(String str, String str2, String str3, String str4) {
        this.glVersion = str;
        this.eglVersion = str2;
        this.glExtensions = str3;
        this.eglExtensions = str4;
    }
}
