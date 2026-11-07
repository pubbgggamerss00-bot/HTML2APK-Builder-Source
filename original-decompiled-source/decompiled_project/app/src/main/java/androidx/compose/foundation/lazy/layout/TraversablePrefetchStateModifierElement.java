package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.d;
import d0.d1;
import d0.k2;
import i2.a1;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends a1<k2> {

    /* renamed from: b, reason: collision with root package name */
    public final d1 f1015b;

    public TraversablePrefetchStateModifierElement(d1 d1Var) {
        this.f1015b = d1Var;
    }

    @Override // i2.a1
    public final d.c a() {
        return new k2(this.f1015b);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((k2) cVar).f7176q = this.f1015b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && r.a(this.f1015b, ((TraversablePrefetchStateModifierElement) obj).f1015b);
    }

    public final int hashCode() {
        return this.f1015b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f1015b + ')';
    }
}
