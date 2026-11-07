package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.d;
import eh.l;
import f3.m;
import i2.a1;
import i2.e0;
import i2.k;
import z.d1;

/* loaded from: classes.dex */
final class OffsetPxElement extends a1<d1> {

    /* renamed from: b, reason: collision with root package name */
    public final l<f3.d, m> f942b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f943c = true;

    public OffsetPxElement(l lVar, e.b bVar) {
        this.f942b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        d1 d1Var = new d1();
        d1Var.f34486q = this.f942b;
        d1Var.f34487r = this.f943c;
        return d1Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        d1 d1Var = (d1) cVar;
        l<? super f3.d, m> lVar = d1Var.f34486q;
        l<f3.d, m> lVar2 = this.f942b;
        boolean z10 = this.f943c;
        if (lVar != lVar2 || d1Var.f34487r != z10) {
            e0 e0VarF = k.f(d1Var);
            e0.c cVar2 = e0.U;
            e0VarF.e0(false);
        }
        d1Var.f34486q = lVar2;
        d1Var.f34487r = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f942b == offsetPxElement.f942b && this.f943c == offsetPxElement.f943c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f943c) + (this.f942b.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f942b + ", rtlAware=" + this.f943c + ')';
    }
}
