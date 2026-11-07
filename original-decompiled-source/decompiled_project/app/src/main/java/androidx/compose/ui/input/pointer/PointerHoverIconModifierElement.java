package androidx.compose.ui.input.pointer;

import androidx.compose.ui.d;
import c2.b;
import c2.w;
import c2.x;
import i2.a1;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends a1<w> {

    /* renamed from: b, reason: collision with root package name */
    public final b f1202b;

    public PointerHoverIconModifierElement(b bVar) {
        this.f1202b = bVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new w(this.f1202b);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        w wVar = (w) cVar;
        x xVar = wVar.f4648r;
        b bVar = this.f1202b;
        if (r.a(xVar, bVar)) {
            return;
        }
        wVar.f4648r = bVar;
        if (wVar.f4649s) {
            wVar.V1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointerHoverIconModifierElement) && r.a(this.f1202b, ((PointerHoverIconModifierElement) obj).f1202b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f1202b.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f1202b + ", overrideDescendants=false)";
    }
}
