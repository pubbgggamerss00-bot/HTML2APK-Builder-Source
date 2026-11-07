package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import kotlin.jvm.internal.r;
import n1.d;
import n1.g;
import n1.k;

/* loaded from: classes.dex */
final class DrawWithCacheElement extends a1<d> {

    /* renamed from: b, reason: collision with root package name */
    public final l<g, k> f1160b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(l<? super g, k> lVar) {
        this.f1160b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new n1.d(new g(), this.f1160b);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        n1.d dVar = (n1.d) cVar;
        dVar.f18305t = this.f1160b;
        dVar.P();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && r.a(this.f1160b, ((DrawWithCacheElement) obj).f1160b);
    }

    public final int hashCode() {
        return this.f1160b.hashCode();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f1160b + ')';
    }
}
