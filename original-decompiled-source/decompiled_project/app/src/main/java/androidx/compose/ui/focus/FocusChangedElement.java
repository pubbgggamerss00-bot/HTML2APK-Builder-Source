package androidx.compose.ui.focus;

import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import kotlin.jvm.internal.r;
import o1.d;
import o1.h0;
import pg.f0;

/* loaded from: classes.dex */
final class FocusChangedElement extends a1<d> {

    /* renamed from: b, reason: collision with root package name */
    public final l<h0, f0> f1176b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(l<? super h0, f0> lVar) {
        this.f1176b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        o1.d dVar = new o1.d();
        dVar.f18858q = this.f1176b;
        return dVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((o1.d) cVar).f18858q = this.f1176b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && r.a(this.f1176b, ((FocusChangedElement) obj).f1176b);
    }

    public final int hashCode() {
        return this.f1176b.hashCode();
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f1176b + ')';
    }
}
