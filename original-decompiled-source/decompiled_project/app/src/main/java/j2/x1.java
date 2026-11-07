package j2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class x1 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f14968a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14969b = new int[2];

    @Override // j2.u1
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f14968a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f14969b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        q1.g0.c(matrix, fArr);
    }
}
