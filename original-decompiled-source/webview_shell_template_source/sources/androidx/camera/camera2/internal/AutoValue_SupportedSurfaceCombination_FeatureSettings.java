package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.SupportedSurfaceCombination;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_SupportedSurfaceCombination_FeatureSettings extends SupportedSurfaceCombination.FeatureSettings {
    private final int cameraMode;
    private final boolean previewStabilizationOn;
    private final int requiredMaxBitDepth;
    private final boolean ultraHdrOn;

    public AutoValue_SupportedSurfaceCombination_FeatureSettings(int i6, int i7, boolean z6, boolean z7) {
        this.cameraMode = i6;
        this.requiredMaxBitDepth = i7;
        this.previewStabilizationOn = z6;
        this.ultraHdrOn = z7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SupportedSurfaceCombination.FeatureSettings) {
            SupportedSurfaceCombination.FeatureSettings featureSettings = (SupportedSurfaceCombination.FeatureSettings) obj;
            if (this.cameraMode == featureSettings.getCameraMode() && this.requiredMaxBitDepth == featureSettings.getRequiredMaxBitDepth() && this.previewStabilizationOn == featureSettings.isPreviewStabilizationOn() && this.ultraHdrOn == featureSettings.isUltraHdrOn()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public int getCameraMode() {
        return this.cameraMode;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public int getRequiredMaxBitDepth() {
        return this.requiredMaxBitDepth;
    }

    public int hashCode() {
        return ((((((this.cameraMode ^ 1000003) * 1000003) ^ this.requiredMaxBitDepth) * 1000003) ^ (this.previewStabilizationOn ? 1231 : 1237)) * 1000003) ^ (this.ultraHdrOn ? 1231 : 1237);
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isPreviewStabilizationOn() {
        return this.previewStabilizationOn;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isUltraHdrOn() {
        return this.ultraHdrOn;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.cameraMode + ", requiredMaxBitDepth=" + this.requiredMaxBitDepth + ", previewStabilizationOn=" + this.previewStabilizationOn + ", ultraHdrOn=" + this.ultraHdrOn + "}";
    }
}
