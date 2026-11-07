package e2;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t extends s {
    @Override // e2.p
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // e2.p
    public final void b(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // e2.s, e2.p
    public final void c(View view, int i6) {
        view.setTransitionVisibility(i6);
    }

    @Override // e2.q
    public final void d(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // e2.q
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // e2.r
    public final void f(View view, int i6, int i7, int i8, int i9) {
        view.setLeftTopRightBottom(i6, i7, i8, i9);
    }
}
