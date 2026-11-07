package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_StreamSpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class StreamSpec {
    public static final Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = new Range<>(0, 0);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class Builder {
        public abstract StreamSpec build();

        public abstract Builder setDynamicRange(DynamicRange dynamicRange);

        public abstract Builder setExpectedFrameRateRange(Range<Integer> range);

        public abstract Builder setImplementationOptions(Config config);

        public abstract Builder setResolution(Size size);

        public abstract Builder setZslDisabled(boolean z6);
    }

    public static Builder builder(Size size) {
        return new AutoValue_StreamSpec.Builder().setResolution(size).setExpectedFrameRateRange(FRAME_RATE_RANGE_UNSPECIFIED).setDynamicRange(DynamicRange.SDR).setZslDisabled(false);
    }

    public abstract DynamicRange getDynamicRange();

    public abstract Range<Integer> getExpectedFrameRateRange();

    public abstract Config getImplementationOptions();

    public abstract Size getResolution();

    public abstract boolean getZslDisabled();

    public abstract Builder toBuilder();
}
