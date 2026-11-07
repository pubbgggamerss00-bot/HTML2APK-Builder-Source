package androidx.compose.foundation;

import androidx.compose.ui.d;
import i2.a1;
import i2.j;
import kotlin.jvm.internal.r;
import t.x0;
import t.y0;
import x.l;

/* loaded from: classes.dex */
final class IndicationModifierElement extends a1<x0> {

    /* renamed from: b, reason: collision with root package name */
    public final l f790b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f791c;

    public IndicationModifierElement(l lVar, y0 y0Var) {
        this.f790b = lVar;
        this.f791c = y0Var;
    }

    @Override // i2.a1
    public final d.c a() {
        j jVarA = this.f791c.a(this.f790b);
        x0 x0Var = new x0();
        x0Var.f25407s = jVarA;
        x0Var.T1(jVarA);
        return x0Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        x0 x0Var = (x0) cVar;
        j jVarA = this.f791c.a(this.f790b);
        x0Var.U1(x0Var.f25407s);
        x0Var.f25407s = jVarA;
        x0Var.T1(jVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return r.a(this.f790b, indicationModifierElement.f790b) && r.a(this.f791c, indicationModifierElement.f791c);
    }

    public final int hashCode() {
        return this.f791c.hashCode() + (this.f790b.hashCode() * 31);
    }
}
