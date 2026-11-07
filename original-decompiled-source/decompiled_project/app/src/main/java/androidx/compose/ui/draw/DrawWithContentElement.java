package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import n1.l;
import pg.f0;
import s1.c;

/* loaded from: classes.dex */
final class DrawWithContentElement extends a1<l> {

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<c, f0> f1161b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(eh.l<? super c, f0> lVar) {
        this.f1161b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        l lVar = new l();
        lVar.f18314q = this.f1161b;
        return lVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((l) cVar).f18314q = this.f1161b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && r.a(this.f1161b, ((DrawWithContentElement) obj).f1161b);
    }

    public final int hashCode() {
        return this.f1161b.hashCode();
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f1161b + ')';
    }
}
