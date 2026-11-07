package j2;

import android.graphics.Matrix;
import android.view.View;
import j2.q0;

/* loaded from: classes.dex */
public final class v1 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f14926a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14927b = new int[2];

    public v1(float[] fArr) {
        this.f14926a = fArr;
    }

    @Override // j2.u1
    public final void a(View view, float[] fArr) {
        q1.r1.d(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z10 = parent instanceof View;
        float[] fArr2 = this.f14926a;
        if (z10) {
            b((View) parent, fArr);
            q0.a aVar = q0.f14863a;
            q1.r1.d(fArr2);
            q1.r1.f(fArr2, -view.getScrollX(), -view.getScrollY());
            q0.b(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            q1.r1.d(fArr2);
            q1.r1.f(fArr2, left, top);
            q0.b(fArr, fArr2);
        } else {
            int[] iArr = this.f14927b;
            view.getLocationInWindow(iArr);
            q0.a aVar2 = q0.f14863a;
            q1.r1.d(fArr2);
            q1.r1.f(fArr2, -view.getScrollX(), -view.getScrollY());
            q0.b(fArr, fArr2);
            float f10 = iArr[0];
            float f11 = iArr[1];
            q1.r1.d(fArr2);
            q1.r1.f(fArr2, f10, f11);
            q0.b(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        q1.g0.c(matrix, fArr2);
        q0.b(fArr, fArr2);
    }
}
