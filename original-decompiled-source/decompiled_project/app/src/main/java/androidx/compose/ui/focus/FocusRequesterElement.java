package androidx.compose.ui.focus;

import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import o1.c0;
import o1.g0;

/* loaded from: classes.dex */
final class FocusRequesterElement extends a1<g0> {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f1178b;

    public FocusRequesterElement(c0 c0Var) {
        this.f1178b = c0Var;
    }

    @Override // i2.a1
    public final d.c a() {
        g0 g0Var = new g0();
        g0Var.f18862q = this.f1178b;
        return g0Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        g0 g0Var = (g0) cVar;
        g0Var.f18862q.f18857a.j(g0Var);
        c0 c0Var = this.f1178b;
        g0Var.f18862q = c0Var;
        c0Var.f18857a.b(g0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && r.a(this.f1178b, ((FocusRequesterElement) obj).f1178b);
    }

    public final int hashCode() {
        return this.f1178b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f1178b + ')';
    }
}
