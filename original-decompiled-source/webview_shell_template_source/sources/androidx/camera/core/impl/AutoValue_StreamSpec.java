package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamSpec;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_StreamSpec extends StreamSpec {
    private final DynamicRange dynamicRange;
    private final Range<Integer> expectedFrameRateRange;
    private final Config implementationOptions;
    private final Size resolution;
    private final boolean zslDisabled;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Builder extends StreamSpec.Builder {
        private DynamicRange dynamicRange;
        private Range<Integer> expectedFrameRateRange;
        private Config implementationOptions;
        private Size resolution;
        private Boolean zslDisabled;

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec build() {
            String strB = this.resolution == null ? " resolution" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (this.dynamicRange == null) {
                strB = androidx.camera.core.c.b(strB, " dynamicRange");
            }
            if (this.expectedFrameRateRange == null) {
                strB = androidx.camera.core.c.b(strB, " expectedFrameRateRange");
            }
            if (this.zslDisabled == null) {
                strB = androidx.camera.core.c.b(strB, " zslDisabled");
            }
            if (strB.isEmpty()) {
                return new AutoValue_StreamSpec(this.resolution, this.dynamicRange, this.expectedFrameRateRange, this.implementationOptions, this.zslDisabled.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.dynamicRange = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setExpectedFrameRateRange(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.expectedFrameRateRange = range;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setImplementationOptions(Config config) {
            this.implementationOptions = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setResolution(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.resolution = size;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setZslDisabled(boolean z6) {
            this.zslDisabled = Boolean.valueOf(z6);
            return this;
        }

        public Builder() {
        }

        private Builder(StreamSpec streamSpec) {
            this.resolution = streamSpec.getResolution();
            this.dynamicRange = streamSpec.getDynamicRange();
            this.expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
            this.implementationOptions = streamSpec.getImplementationOptions();
            this.zslDisabled = Boolean.valueOf(streamSpec.getZslDisabled());
        }
    }

    public boolean equals(Object obj) {
        Config config;
        if (obj == this) {
            return true;
        }
        if (obj instanceof StreamSpec) {
            StreamSpec streamSpec = (StreamSpec) obj;
            if (this.resolution.equals(streamSpec.getResolution()) && this.dynamicRange.equals(streamSpec.getDynamicRange()) && this.expectedFrameRateRange.equals(streamSpec.getExpectedFrameRateRange()) && ((config = this.implementationOptions) != null ? config.equals(streamSpec.getImplementationOptions()) : streamSpec.getImplementationOptions() == null) && this.zslDisabled == streamSpec.getZslDisabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Range<Integer> getExpectedFrameRateRange() {
        return this.expectedFrameRateRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Config getImplementationOptions() {
        return this.implementationOptions;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Size getResolution() {
        return this.resolution;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public boolean getZslDisabled() {
        return this.zslDisabled;
    }

    public int hashCode() {
        int iHashCode = (((((this.resolution.hashCode() ^ 1000003) * 1000003) ^ this.dynamicRange.hashCode()) * 1000003) ^ this.expectedFrameRateRange.hashCode()) * 1000003;
        Config config = this.implementationOptions;
        return ((iHashCode ^ (config == null ? 0 : config.hashCode())) * 1000003) ^ (this.zslDisabled ? 1231 : 1237);
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public StreamSpec.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.resolution + ", dynamicRange=" + this.dynamicRange + ", expectedFrameRateRange=" + this.expectedFrameRateRange + ", implementationOptions=" + this.implementationOptions + ", zslDisabled=" + this.zslDisabled + "}";
    }

    private AutoValue_StreamSpec(Size size, DynamicRange dynamicRange, Range<Integer> range, Config config, boolean z6) {
        this.resolution = size;
        this.dynamicRange = dynamicRange;
        this.expectedFrameRateRange = range;
        this.implementationOptions = config;
        this.zslDisabled = z6;
    }
}
