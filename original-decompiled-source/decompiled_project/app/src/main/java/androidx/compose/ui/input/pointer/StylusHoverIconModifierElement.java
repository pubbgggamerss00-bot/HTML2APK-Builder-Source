package androidx.compose.ui.input.pointer;

import androidx.compose.ui.d;
import c2.b;
import c2.r0;
import c2.x;
import i0.v4;
import i2.a1;
import i2.q;
import kotlin.jvm.internal.r;
import r.o2;

/* loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends a1<r0> {

    /* renamed from: b, reason: collision with root package name */
    public final b f1203b = v4.f13651b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1204c;

    public StylusHoverIconModifierElement(q qVar) {
        this.f1204c = qVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new r0(this.f1203b, this.f1204c);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        r0 r0Var = (r0) cVar;
        x xVar = r0Var.f4648r;
        b bVar = this.f1203b;
        if (!r.a(xVar, bVar)) {
            r0Var.f4648r = bVar;
            if (r0Var.f4649s) {
                r0Var.V1();
            }
        }
        r0Var.f4647q = this.f1204c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return r.a(this.f1203b, stylusHoverIconModifierElement.f1203b) && r.a(this.f1204c, stylusHoverIconModifierElement.f1204c);
    }

    public final int hashCode() {
        int iA = o2.a(this.f1203b.f4592b * 31, 31, false);
        q qVar = this.f1204c;
        return iA + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.f1203b + ", overrideDescendants=false, touchBoundsExpansion=" + this.f1204c + ')';
    }
}
