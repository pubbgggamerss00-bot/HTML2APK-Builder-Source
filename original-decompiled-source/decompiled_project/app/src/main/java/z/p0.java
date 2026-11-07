package z;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public final class p0 implements n1, o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f34606a = new p0();

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
