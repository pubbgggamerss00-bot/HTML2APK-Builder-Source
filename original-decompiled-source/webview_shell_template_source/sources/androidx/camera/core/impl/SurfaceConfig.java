package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.internal.utils.SizeUtil;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class SurfaceConfig {
    public static final long DEFAULT_STREAM_USE_CASE_VALUE = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum ConfigSize {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        ConfigSize(int i6) {
            this.mId = i6;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    public static SurfaceConfig create(ConfigType configType, ConfigSize configSize) {
        return new AutoValue_SurfaceConfig(configType, configSize, 0L);
    }

    public static ConfigType getConfigType(int i6) {
        return i6 == 35 ? ConfigType.YUV : i6 == 256 ? ConfigType.JPEG : i6 == 4101 ? ConfigType.JPEG_R : i6 == 32 ? ConfigType.RAW : ConfigType.PRIV;
    }

    public static SurfaceConfig transformSurfaceConfig(int i6, int i7, Size size, SurfaceSizeDefinition surfaceSizeDefinition) {
        ConfigType configType = getConfigType(i7);
        ConfigSize configSize = ConfigSize.NOT_SUPPORT;
        int area = SizeUtil.getArea(size);
        if (i6 == 1) {
            if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS720pSize(i7))) {
                configSize = ConfigSize.s720p;
            } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS1440pSize(i7))) {
                configSize = ConfigSize.s1440p;
            }
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getAnalysisSize())) {
            configSize = ConfigSize.VGA;
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getPreviewSize())) {
            configSize = ConfigSize.PREVIEW;
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getRecordSize())) {
            configSize = ConfigSize.RECORD;
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getMaximumSize(i7))) {
            configSize = ConfigSize.MAXIMUM;
        } else {
            Size ultraMaximumSize = surfaceSizeDefinition.getUltraMaximumSize(i7);
            if (ultraMaximumSize != null && area <= SizeUtil.getArea(ultraMaximumSize)) {
                configSize = ConfigSize.ULTRA_MAXIMUM;
            }
        }
        return create(configType, configSize);
    }

    public abstract ConfigSize getConfigSize();

    public abstract ConfigType getConfigType();

    public abstract long getStreamUseCase();

    public final boolean isSupported(SurfaceConfig surfaceConfig) {
        return surfaceConfig.getConfigSize().getId() <= getConfigSize().getId() && surfaceConfig.getConfigType() == getConfigType();
    }

    public static SurfaceConfig create(ConfigType configType, ConfigSize configSize, long j6) {
        return new AutoValue_SurfaceConfig(configType, configSize, j6);
    }
}
