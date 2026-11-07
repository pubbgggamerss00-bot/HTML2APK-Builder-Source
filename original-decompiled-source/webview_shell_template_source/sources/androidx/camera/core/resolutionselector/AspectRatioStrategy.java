package androidx.camera.core.resolutionselector;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AspectRatioStrategy {
    public static final int FALLBACK_RULE_AUTO = 1;
    public static final int FALLBACK_RULE_NONE = 0;
    private final int mFallbackRule;
    private final int mPreferredAspectRatio;
    public static final AspectRatioStrategy RATIO_4_3_FALLBACK_AUTO_STRATEGY = new AspectRatioStrategy(0, 1);
    public static final AspectRatioStrategy RATIO_16_9_FALLBACK_AUTO_STRATEGY = new AspectRatioStrategy(1, 1);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AspectRatioFallbackRule {
    }

    public AspectRatioStrategy(int i6, int i7) {
        this.mPreferredAspectRatio = i6;
        this.mFallbackRule = i7;
    }

    public int getFallbackRule() {
        return this.mFallbackRule;
    }

    public int getPreferredAspectRatio() {
        return this.mPreferredAspectRatio;
    }
}
