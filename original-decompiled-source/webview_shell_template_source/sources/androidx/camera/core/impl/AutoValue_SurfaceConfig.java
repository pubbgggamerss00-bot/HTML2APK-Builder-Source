package androidx.camera.core.impl;

import androidx.camera.core.impl.SurfaceConfig;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_SurfaceConfig extends SurfaceConfig {
    private final SurfaceConfig.ConfigSize configSize;
    private final SurfaceConfig.ConfigType configType;
    private final long streamUseCase;

    public AutoValue_SurfaceConfig(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, long j6) {
        if (configType == null) {
            throw new NullPointerException("Null configType");
        }
        this.configType = configType;
        if (configSize == null) {
            throw new NullPointerException("Null configSize");
        }
        this.configSize = configSize;
        this.streamUseCase = j6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceConfig) {
            SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
            if (this.configType.equals(surfaceConfig.getConfigType()) && this.configSize.equals(surfaceConfig.getConfigSize()) && this.streamUseCase == surfaceConfig.getStreamUseCase()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigSize getConfigSize() {
        return this.configSize;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigType getConfigType() {
        return this.configType;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public long getStreamUseCase() {
        return this.streamUseCase;
    }

    public int hashCode() {
        int iHashCode = (((this.configType.hashCode() ^ 1000003) * 1000003) ^ this.configSize.hashCode()) * 1000003;
        long j6 = this.streamUseCase;
        return iHashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.configType + ", configSize=" + this.configSize + ", streamUseCase=" + this.streamUseCase + "}";
    }
}
