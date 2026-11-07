package q1;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class k0 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f21717a;

    public k0(PathMeasure pathMeasure) {
        this.f21717a = pathMeasure;
    }

    @Override // q1.v1
    public final boolean a(float f10, float f11, j0 j0Var) {
        if (j0Var == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f21717a.getSegment(f10, f11, j0Var.f21712a, true);
    }

    @Override // q1.v1
    public final void b(j0 j0Var) {
        this.f21717a.setPath(j0Var != null ? j0Var.f21712a : null, false);
    }

    @Override // q1.v1
    public final float getLength() {
        return this.f21717a.getLength();
    }
}
