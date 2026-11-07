package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class MeteringPointFactory {
    private Rational mSurfaceAspectRatio;

    public MeteringPointFactory() {
        this(null);
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    public abstract PointF convertPoint(float f6, float f7);

    public final MeteringPoint createPoint(float f6, float f7) {
        return createPoint(f6, f7, getDefaultPointSize());
    }

    public void setSurfaceAspectRatio(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public MeteringPointFactory(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public final MeteringPoint createPoint(float f6, float f7, float f8) {
        PointF pointFConvertPoint = convertPoint(f6, f7);
        return new MeteringPoint(pointFConvertPoint.x, pointFConvertPoint.y, f8, this.mSurfaceAspectRatio);
    }
}
