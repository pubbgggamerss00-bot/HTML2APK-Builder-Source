package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
final class StylusHandwritingElement extends a1<j0.a> {

    /* renamed from: b, reason: collision with root package name */
    public final eh.a<f0> f1054b;

    public StylusHandwritingElement(eh.a<f0> aVar) {
        this.f1054b = aVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new j0.a(this.f1054b);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((j0.a) cVar).f14586s = this.f1054b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && r.a(this.f1054b, ((StylusHandwritingElement) obj).f1054b);
    }

    public final int hashCode() {
        return this.f1054b.hashCode();
    }

    public final String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.f1054b + ')';
    }
}
