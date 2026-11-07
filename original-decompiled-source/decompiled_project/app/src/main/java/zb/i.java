package zb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yalantis.ucrop.view.CropImageView;
import zb.h;

/* loaded from: classes2.dex */
public final class i {
    public static e a(int i10) {
        if (i10 != 0 && i10 == 1) {
            return new f();
        }
        return new k();
    }

    public static void b(ViewGroup viewGroup, h hVar) {
        ub.a aVar = hVar.f34886b.f34914b;
        if (aVar == null || !aVar.f29691a) {
            return;
        }
        float elevation = CropImageView.DEFAULT_ASPECT_RATIO;
        for (ViewParent parent = viewGroup.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        h.c cVar = hVar.f34886b;
        if (cVar.f34922j != elevation) {
            cVar.f34922j = elevation;
            hVar.n();
        }
    }
}
