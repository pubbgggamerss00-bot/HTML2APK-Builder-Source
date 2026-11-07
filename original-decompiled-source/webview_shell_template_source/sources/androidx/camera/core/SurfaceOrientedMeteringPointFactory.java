package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
import android.util.Size;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SurfaceOrientedMeteringPointFactory extends MeteringPointFactory {
    private final float mHeight;
    private final float mWidth;

    public SurfaceOrientedMeteringPointFactory(float f6, float f7) {
        this.mWidth = f6;
        this.mHeight = f7;
    }

    private static Rational getUseCaseAspectRatio(UseCase useCase) {
        if (useCase == null) {
            return null;
        }
        Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
        if (attachedSurfaceResolution != null) {
            return new Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        throw new IllegalStateException("UseCase " + useCase + " is not bound.");
    }

    @Override // androidx.camera.core.MeteringPointFactory
    public PointF convertPoint(float f6, float f7) {
        return new PointF(f6 / this.mWidth, f7 / this.mHeight);
    }

    public SurfaceOrientedMeteringPointFactory(float f6, float f7, UseCase useCase) {
        super(getUseCaseAspectRatio(useCase));
        this.mWidth = f6;
        this.mHeight = f7;
    }
}
