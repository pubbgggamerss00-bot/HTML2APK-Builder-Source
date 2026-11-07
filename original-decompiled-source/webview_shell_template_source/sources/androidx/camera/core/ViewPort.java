package androidx.camera.core;

import android.util.Rational;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ViewPort {
    public static final int FILL_CENTER = 1;
    public static final int FILL_END = 2;
    public static final int FILL_START = 0;
    public static final int FIT = 3;
    private Rational mAspectRatio;
    private int mLayoutDirection;
    private int mRotation;
    private int mScaleType;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Builder {
        private static final int DEFAULT_LAYOUT_DIRECTION = 0;
        private static final int DEFAULT_SCALE_TYPE = 1;
        private final Rational mAspectRatio;
        private final int mRotation;
        private int mScaleType = 1;
        private int mLayoutDirection = 0;

        public Builder(Rational rational, int i6) {
            this.mAspectRatio = rational;
            this.mRotation = i6;
        }

        public ViewPort build() {
            androidx.work.j.e("The crop aspect ratio must be set.", this.mAspectRatio);
            return new ViewPort(this.mScaleType, this.mAspectRatio, this.mRotation, this.mLayoutDirection);
        }

        public Builder setLayoutDirection(int i6) {
            this.mLayoutDirection = i6;
            return this;
        }

        public Builder setScaleType(int i6) {
            this.mScaleType = i6;
            return this;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LayoutDirection {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScaleType {
    }

    public ViewPort(int i6, Rational rational, int i7, int i8) {
        this.mScaleType = i6;
        this.mAspectRatio = rational;
        this.mRotation = i7;
        this.mLayoutDirection = i8;
    }

    public Rational getAspectRatio() {
        return this.mAspectRatio;
    }

    public int getLayoutDirection() {
        return this.mLayoutDirection;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public int getScaleType() {
        return this.mScaleType;
    }
}
