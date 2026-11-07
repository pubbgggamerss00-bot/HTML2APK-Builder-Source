package androidx.compose.foundation;

import androidx.compose.ui.d;
import f3.h;
import i2.a1;
import kotlin.jvm.internal.r;
import q1.f2;
import q1.u0;
import t.u;

/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends a1<u> {

    /* renamed from: b, reason: collision with root package name */
    public final float f775b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f776c;

    /* renamed from: d, reason: collision with root package name */
    public final f2 f777d;

    public BorderModifierNodeElement(float f10, u0 u0Var, f2 f2Var) {
        this.f775b = f10;
        this.f776c = u0Var;
        this.f777d = f2Var;
    }

    @Override // i2.a1
    public final d.c a() {
        return new u(this.f775b, this.f776c, this.f777d);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        u uVar = (u) cVar;
        float f10 = uVar.f25370t;
        n1.c cVar2 = uVar.f25373x;
        float f11 = this.f775b;
        if (!h.a(f10, f11)) {
            uVar.f25370t = f11;
            cVar2.P();
        }
        u0 u0Var = uVar.f25371v;
        u0 u0Var2 = this.f776c;
        if (!r.a(u0Var, u0Var2)) {
            uVar.f25371v = u0Var2;
            cVar2.P();
        }
        f2 f2Var = uVar.f25372w;
        f2 f2Var2 = this.f777d;
        if (r.a(f2Var, f2Var2)) {
            return;
        }
        uVar.f25372w = f2Var2;
        cVar2.P();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return h.a(this.f775b, borderModifierNodeElement.f775b) && r.a(this.f776c, borderModifierNodeElement.f776c) && r.a(this.f777d, borderModifierNodeElement.f777d);
    }

    public final int hashCode() {
        return this.f777d.hashCode() + ((this.f776c.hashCode() + (Float.hashCode(this.f775b) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) h.b(this.f775b)) + ", brush=" + this.f776c + ", shape=" + this.f777d + ')';
    }
}
