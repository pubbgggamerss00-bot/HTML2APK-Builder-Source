package androidx.compose.ui.layout;

import androidx.compose.ui.d;
import g2.x;
import i2.a1;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class LayoutIdElement extends a1<x> {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1210b;

    public LayoutIdElement(Object obj) {
        this.f1210b = obj;
    }

    @Override // i2.a1
    public final d.c a() {
        x xVar = new x();
        xVar.f11459q = this.f1210b;
        return xVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((x) cVar).f11459q = this.f1210b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && r.a(this.f1210b, ((LayoutIdElement) obj).f1210b);
    }

    public final int hashCode() {
        return this.f1210b.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f1210b + ')';
    }
}
