package d0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class d2 {
    public static x0.n1 a() {
        return new x0.x1(pg.f0.f21461a, x0.q1.f31878a);
    }

    public static final void b(x0.n1 n1Var) {
        n1Var.setValue(pg.f0.f21461a);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f10, float f11) {
        return (f10 == 1.0f && f11 == 1.0f) ? dVar : androidx.compose.ui.graphics.a.b(dVar, f10, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, false, 131068);
    }

    public static String d(int i10) {
        return i10 == 1 ? "Clip" : i10 == 2 ? "Ellipsis" : i10 == 5 ? "MiddleEllipsis" : i10 == 3 ? "Visible" : i10 == 4 ? "StartEllipsis" : "Invalid";
    }
}
