package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f6, float f7) {
        this.mMaxZoomRatio = f6;
        this.mMinZoomRatio = f7;
    }

    private float getPercentageByRatio(float f6) {
        float f7 = this.mMaxZoomRatio;
        float f8 = this.mMinZoomRatio;
        if (f7 == f8) {
            return 0.0f;
        }
        if (f6 == f7) {
            return 1.0f;
        }
        if (f6 == f8) {
            return 0.0f;
        }
        float f9 = 1.0f / f8;
        return ((1.0f / f6) - f9) / ((1.0f / f7) - f9);
    }

    private float getRatioByPercentage(float f6) {
        if (f6 == 1.0f) {
            return this.mMaxZoomRatio;
        }
        if (f6 == 0.0f) {
            return this.mMinZoomRatio;
        }
        float f7 = this.mMaxZoomRatio;
        float f8 = this.mMinZoomRatio;
        double d7 = 1.0f / f8;
        double d8 = 1.0d / ((((1.0f / f7) - d7) * f6) + d7);
        double d9 = f8;
        double d10 = f7;
        if (d8 < d9) {
            d8 = d9;
        } else if (d8 > d10) {
            d8 = d10;
        }
        return (float) d8;
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setLinearZoom(float f6) {
        if (f6 <= 1.0f && f6 >= 0.0f) {
            this.mLinearZoom = f6;
            this.mZoomRatio = getRatioByPercentage(f6);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f6 + " is not within valid range [0..1]");
        }
    }

    public void setZoomRatio(float f6) {
        if (f6 <= this.mMaxZoomRatio && f6 >= this.mMinZoomRatio) {
            this.mZoomRatio = f6;
            this.mLinearZoom = getPercentageByRatio(f6);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f6 + " is not within valid range [" + this.mMinZoomRatio + " , " + this.mMaxZoomRatio + "]");
    }
}
