package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.SessionConfig;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_SessionConfig_OutputConfig extends SessionConfig.OutputConfig {
    private final DynamicRange dynamicRange;
    private final int mirrorMode;
    private final String physicalCameraId;
    private final List<DeferrableSurface> sharedSurfaces;
    private final DeferrableSurface surface;
    private final int surfaceGroupId;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Builder extends SessionConfig.OutputConfig.Builder {
        private DynamicRange dynamicRange;
        private Integer mirrorMode;
        private String physicalCameraId;
        private List<DeferrableSurface> sharedSurfaces;
        private DeferrableSurface surface;
        private Integer surfaceGroupId;

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig build() {
            String strB = this.surface == null ? " surface" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (this.sharedSurfaces == null) {
                strB = androidx.camera.core.c.b(strB, " sharedSurfaces");
            }
            if (this.mirrorMode == null) {
                strB = androidx.camera.core.c.b(strB, " mirrorMode");
            }
            if (this.surfaceGroupId == null) {
                strB = androidx.camera.core.c.b(strB, " surfaceGroupId");
            }
            if (this.dynamicRange == null) {
                strB = androidx.camera.core.c.b(strB, " dynamicRange");
            }
            if (strB.isEmpty()) {
                return new AutoValue_SessionConfig_OutputConfig(this.surface, this.sharedSurfaces, this.physicalCameraId, this.mirrorMode.intValue(), this.surfaceGroupId.intValue(), this.dynamicRange);
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.dynamicRange = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setMirrorMode(int i6) {
            this.mirrorMode = Integer.valueOf(i6);
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setPhysicalCameraId(String str) {
            this.physicalCameraId = str;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSharedSurfaces(List<DeferrableSurface> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.sharedSurfaces = list;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSurface(DeferrableSurface deferrableSurface) {
            if (deferrableSurface == null) {
                throw new NullPointerException("Null surface");
            }
            this.surface = deferrableSurface;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSurfaceGroupId(int i6) {
            this.surfaceGroupId = Integer.valueOf(i6);
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionConfig.OutputConfig) {
            SessionConfig.OutputConfig outputConfig = (SessionConfig.OutputConfig) obj;
            if (this.surface.equals(outputConfig.getSurface()) && this.sharedSurfaces.equals(outputConfig.getSharedSurfaces()) && ((str = this.physicalCameraId) != null ? str.equals(outputConfig.getPhysicalCameraId()) : outputConfig.getPhysicalCameraId() == null) && this.mirrorMode == outputConfig.getMirrorMode() && this.surfaceGroupId == outputConfig.getSurfaceGroupId() && this.dynamicRange.equals(outputConfig.getDynamicRange())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public int getMirrorMode() {
        return this.mirrorMode;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public List<DeferrableSurface> getSharedSurfaces() {
        return this.sharedSurfaces;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public DeferrableSurface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public int getSurfaceGroupId() {
        return this.surfaceGroupId;
    }

    public int hashCode() {
        int iHashCode = (((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.sharedSurfaces.hashCode()) * 1000003;
        String str = this.physicalCameraId;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mirrorMode) * 1000003) ^ this.surfaceGroupId) * 1000003) ^ this.dynamicRange.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.surface + ", sharedSurfaces=" + this.sharedSurfaces + ", physicalCameraId=" + this.physicalCameraId + ", mirrorMode=" + this.mirrorMode + ", surfaceGroupId=" + this.surfaceGroupId + ", dynamicRange=" + this.dynamicRange + "}";
    }

    private AutoValue_SessionConfig_OutputConfig(DeferrableSurface deferrableSurface, List<DeferrableSurface> list, String str, int i6, int i7, DynamicRange dynamicRange) {
        this.surface = deferrableSurface;
        this.sharedSurfaces = list;
        this.physicalCameraId = str;
        this.mirrorMode = i6;
        this.surfaceGroupId = i7;
        this.dynamicRange = dynamicRange;
    }
}
