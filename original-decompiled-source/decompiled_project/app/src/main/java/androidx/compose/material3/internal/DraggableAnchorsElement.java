package androidx.compose.material3.internal;

import androidx.compose.ui.d;
import eh.p;
import f3.b;
import i2.a1;
import kotlin.jvm.internal.r;
import pg.n;
import u0.a0;
import u0.c0;
import u0.e0;
import v.t0;

/* loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends a1<e0<T>> {

    /* renamed from: b, reason: collision with root package name */
    public final a0<T> f1133b;

    /* renamed from: c, reason: collision with root package name */
    public final p<f3.p, b, n<c0<T>, T>> f1134c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f1135d;

    public DraggableAnchorsElement(a0 a0Var, p pVar) {
        t0 t0Var = t0.f30083a;
        this.f1133b = a0Var;
        this.f1134c = pVar;
        this.f1135d = t0Var;
    }

    @Override // i2.a1
    public final d.c a() {
        e0 e0Var = new e0();
        e0Var.f28977q = this.f1133b;
        e0Var.f28978r = this.f1134c;
        e0Var.f28979s = this.f1135d;
        return e0Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        e0 e0Var = (e0) cVar;
        e0Var.f28977q = this.f1133b;
        e0Var.f28978r = this.f1134c;
        e0Var.f28979s = this.f1135d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return r.a(this.f1133b, draggableAnchorsElement.f1133b) && this.f1134c == draggableAnchorsElement.f1134c && this.f1135d == draggableAnchorsElement.f1135d;
    }

    public final int hashCode() {
        return this.f1135d.hashCode() + ((this.f1134c.hashCode() + (this.f1133b.hashCode() * 31)) * 31);
    }
}
