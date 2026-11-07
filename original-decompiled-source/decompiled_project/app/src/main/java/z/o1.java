package z;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public final class o1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f34600a = new o1();

    @Override // z.n1
    public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f10) {
        if (f10 <= 0.0d) {
            a0.a.a("invalid weight; must be greater than zero");
        }
        if (f10 > Float.MAX_VALUE) {
            f10 = Float.MAX_VALUE;
        }
        return dVar.h(new LayoutWeightElement(f10, true));
    }
}
