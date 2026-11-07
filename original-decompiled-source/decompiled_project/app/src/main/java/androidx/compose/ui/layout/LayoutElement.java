package androidx.compose.ui.layout;

import androidx.compose.ui.d;
import eh.q;
import g2.c0;
import g2.k0;
import g2.m0;
import g2.o0;
import i2.a1;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class LayoutElement extends a1<c0> {

    /* renamed from: b, reason: collision with root package name */
    public final q<o0, k0, f3.b, m0> f1209b;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(q<? super o0, ? super k0, ? super f3.b, ? extends m0> qVar) {
        this.f1209b = qVar;
    }

    @Override // i2.a1
    public final d.c a() {
        c0 c0Var = new c0();
        c0Var.f11321q = this.f1209b;
        return c0Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((c0) cVar).f11321q = this.f1209b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && r.a(this.f1209b, ((LayoutElement) obj).f1209b);
    }

    public final int hashCode() {
        return this.f1209b.hashCode();
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f1209b + ')';
    }
}
