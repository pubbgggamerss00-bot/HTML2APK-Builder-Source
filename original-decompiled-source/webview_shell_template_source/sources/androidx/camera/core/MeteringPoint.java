package androidx.camera.core;

import android.util.Rational;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;
    private Rational mSurfaceAspectRatio;

    public MeteringPoint(float f6, float f7, float f8, Rational rational) {
        this.mNormalizedX = f6;
        this.mNormalizedY = f7;
        this.mSize = f8;
        this.mSurfaceAspectRatio = rational;
    }

    public float getSize() {
        return this.mSize;
    }

    public Rational getSurfaceAspectRatio() {
        return this.mSurfaceAspectRatio;
    }

    public float getX() {
        return this.mNormalizedX;
    }

    public float getY() {
        return this.mNormalizedY;
    }
}
