package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import j2.e3;
import pg.f0;
import z.w0;
import z.y0;

/* loaded from: classes.dex */
final class IntrinsicWidthElement extends a1<y0> {

    /* renamed from: b, reason: collision with root package name */
    public final w0 f934b = w0.f34659b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f935c = true;

    /* renamed from: d, reason: collision with root package name */
    public final l<e3, f0> f936d;

    public IntrinsicWidthElement(l lVar) {
        this.f936d = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        y0 y0Var = new y0();
        y0Var.f34691q = this.f934b;
        y0Var.f34692r = this.f935c;
        return y0Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        y0 y0Var = (y0) cVar;
        y0Var.f34691q = this.f934b;
        y0Var.f34692r = this.f935c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f934b == intrinsicWidthElement.f934b && this.f935c == intrinsicWidthElement.f935c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f935c) + (this.f934b.hashCode() * 31);
    }
}
