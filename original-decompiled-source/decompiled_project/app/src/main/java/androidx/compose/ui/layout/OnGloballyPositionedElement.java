package androidx.compose.ui.layout;

import androidx.compose.ui.d;
import eh.l;
import g2.v;
import g2.y0;
import i2.a1;
import pg.f0;

/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends a1<y0> {

    /* renamed from: b, reason: collision with root package name */
    public final l<v, f0> f1211b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(l<? super v, f0> lVar) {
        this.f1211b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        y0 y0Var = new y0();
        y0Var.f11460q = this.f1211b;
        return y0Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((y0) cVar).f11460q = this.f1211b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f1211b == ((OnGloballyPositionedElement) obj).f1211b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1211b.hashCode();
    }
}
