package q1;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class x1 {
    public static final Rect a(f3.n nVar) {
        return new Rect(nVar.f8822a, nVar.f8823b, nVar.f8824c, nVar.f8825d);
    }

    @pg.d
    public static final Rect b(p1.e eVar) {
        return new Rect((int) eVar.f21131a, (int) eVar.f21132b, (int) eVar.f21133c, (int) eVar.f21134d);
    }

    public static final RectF c(p1.e eVar) {
        return new RectF(eVar.f21131a, eVar.f21132b, eVar.f21133c, eVar.f21134d);
    }

    public static final p1.e d(Rect rect) {
        return new p1.e(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final p1.e e(RectF rectF) {
        return new p1.e(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
