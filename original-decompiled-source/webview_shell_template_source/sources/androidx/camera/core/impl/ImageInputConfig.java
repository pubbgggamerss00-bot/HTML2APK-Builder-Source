package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ImageInputConfig extends ReadableConfig {
    public static final Config.Option<Integer> OPTION_INPUT_FORMAT = Config.Option.create("camerax.core.imageInput.inputFormat", Integer.TYPE);
    public static final Config.Option<DynamicRange> OPTION_INPUT_DYNAMIC_RANGE = Config.Option.create("camerax.core.imageInput.inputDynamicRange", DynamicRange.class);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface Builder<B> {
        B setDynamicRange(DynamicRange dynamicRange);
    }

    default DynamicRange getDynamicRange() {
        DynamicRange dynamicRange = (DynamicRange) retrieveOption(OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
        dynamicRange.getClass();
        return dynamicRange;
    }

    default int getInputFormat() {
        return ((Integer) retrieveOption(OPTION_INPUT_FORMAT)).intValue();
    }

    default boolean hasDynamicRange() {
        return containsOption(OPTION_INPUT_DYNAMIC_RANGE);
    }
}
