package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import i2.q;
import j0.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final q f1055a;

    static {
        float f10 = 40;
        float f11 = 10;
        f1055a = new q(f11, f10, f11, f10);
    }

    public static final d a(boolean z10, boolean z11, eh.a aVar) {
        d stylusHoverIconModifierElement = d.a.f1143b;
        if (!z10 || !b.f14595a) {
            return stylusHoverIconModifierElement;
        }
        if (z11) {
            stylusHoverIconModifierElement = new StylusHoverIconModifierElement(f1055a);
        }
        return stylusHoverIconModifierElement.h(new StylusHandwritingElement(aVar));
    }
}
