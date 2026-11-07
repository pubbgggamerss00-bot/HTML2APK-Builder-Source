package i0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k4 {
    public static final float a(t2.h0 h0Var, int i10) {
        if (i10 < 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        t2.g0 g0Var = h0Var.f27819a;
        t2.l lVar = h0Var.f27820b;
        if (g0Var.f27809a.f27761b.length() == 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        int iMin = Math.min(lVar.d(i10), Math.min(lVar.f27844b - 1, lVar.f27848f - 1));
        if (i10 > lVar.c(iMin, false)) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        lVar.m(iMin);
        ArrayList arrayList = lVar.f27850h;
        t2.o oVar = (t2.o) arrayList.get(t2.n.b(iMin, arrayList));
        t2.a aVar = oVar.f27864a;
        int i11 = iMin - oVar.f27867d;
        u2.j0 j0Var = aVar.f27747d;
        return j0Var.e(i11) - j0Var.g(i11);
    }
}
