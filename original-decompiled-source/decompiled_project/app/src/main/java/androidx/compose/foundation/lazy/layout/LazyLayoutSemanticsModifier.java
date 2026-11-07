package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.d;
import d0.g0;
import d0.m1;
import d0.n1;
import i2.a1;
import i2.k;
import kotlin.jvm.internal.r;
import r.o2;
import v.t0;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends a1<n1> {

    /* renamed from: b, reason: collision with root package name */
    public final eh.a<g0> f1011b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f1012c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f1013d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1014e;

    public LazyLayoutSemanticsModifier(eh.a aVar, m1 m1Var, t0 t0Var, boolean z10) {
        this.f1011b = aVar;
        this.f1012c = m1Var;
        this.f1013d = t0Var;
        this.f1014e = z10;
    }

    @Override // i2.a1
    public final d.c a() {
        return new n1(this.f1011b, this.f1012c, this.f1013d, this.f1014e);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        n1 n1Var = (n1) cVar;
        n1Var.f7196q = this.f1011b;
        n1Var.f7197r = this.f1012c;
        t0 t0Var = n1Var.f7198s;
        t0 t0Var2 = this.f1013d;
        if (t0Var != t0Var2) {
            n1Var.f7198s = t0Var2;
            k.f(n1Var).P();
        }
        boolean z10 = n1Var.f7199t;
        boolean z11 = this.f1014e;
        if (z10 == z11) {
            return;
        }
        n1Var.f7199t = z11;
        n1Var.T1();
        k.f(n1Var).P();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f1011b == lazyLayoutSemanticsModifier.f1011b && r.a(this.f1012c, lazyLayoutSemanticsModifier.f1012c) && this.f1013d == lazyLayoutSemanticsModifier.f1013d && this.f1014e == lazyLayoutSemanticsModifier.f1014e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + o2.a((this.f1013d.hashCode() + ((this.f1012c.hashCode() + (this.f1011b.hashCode() * 31)) * 31)) * 31, 31, this.f1014e);
    }
}
