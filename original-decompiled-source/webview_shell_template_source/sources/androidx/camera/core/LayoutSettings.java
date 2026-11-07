package androidx.camera.core;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class LayoutSettings {
    public static final LayoutSettings DEFAULT = new Builder().setAlpha(1.0f).setOffsetX(0.0f).setOffsetY(0.0f).setWidth(1.0f).setHeight(1.0f).build();
    private final float mAlpha;
    private final float mHeight;
    private final float mOffsetX;
    private final float mOffsetY;
    private final float mWidth;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Builder {
        private float mAlpha = 1.0f;
        private float mOffsetX = 0.0f;
        private float mOffsetY = 0.0f;
        private float mWidth = 0.0f;
        private float mHeight = 0.0f;

        public LayoutSettings build() {
            return new LayoutSettings(this.mAlpha, this.mOffsetX, this.mOffsetY, this.mWidth, this.mHeight);
        }

        public Builder setAlpha(float f6) {
            this.mAlpha = f6;
            return this;
        }

        public Builder setHeight(float f6) {
            this.mHeight = f6;
            return this;
        }

        public Builder setOffsetX(float f6) {
            this.mOffsetX = f6;
            return this;
        }

        public Builder setOffsetY(float f6) {
            this.mOffsetY = f6;
            return this;
        }

        public Builder setWidth(float f6) {
            this.mWidth = f6;
            return this;
        }
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public float getOffsetX() {
        return this.mOffsetX;
    }

    public float getOffsetY() {
        return this.mOffsetY;
    }

    public float getWidth() {
        return this.mWidth;
    }

    private LayoutSettings(float f6, float f7, float f8, float f9, float f10) {
        this.mAlpha = f6;
        this.mOffsetX = f7;
        this.mOffsetY = f8;
        this.mWidth = f9;
        this.mHeight = f10;
    }
}
