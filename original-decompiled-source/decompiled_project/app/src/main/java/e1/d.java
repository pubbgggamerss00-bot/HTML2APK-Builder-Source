package e1;

import com.yalantis.ucrop.view.CropImageView;
import eh.p;
import lh.h;
import p.g0;
import q1.f2;

/* loaded from: classes.dex */
public class d {
    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(c.a(i10, i11, "index: ", ", size: "));
        }
    }

    public static final void b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(c.a(i10, i11, "index: ", ", size: "));
        }
    }

    public static final void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbA = g0.a(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
            sbA.append(i12);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(c.a(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, f2 f2Var) {
        return androidx.compose.ui.graphics.a.b(dVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f2Var, true, 124927);
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.graphics.a.b(dVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, true, 126975);
    }

    public static h f(p pVar) {
        h hVar = new h();
        hVar.f17078d = ah.p.b(pVar, hVar, hVar);
        return hVar;
    }
}
