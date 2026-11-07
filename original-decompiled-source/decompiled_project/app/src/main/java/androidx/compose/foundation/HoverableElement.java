package androidx.compose.foundation;

import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import t.s0;
import x.m;

/* loaded from: classes.dex */
final class HoverableElement extends a1<s0> {

    /* renamed from: b, reason: collision with root package name */
    public final m f789b;

    public HoverableElement(m mVar) {
        this.f789b = mVar;
    }

    @Override // i2.a1
    public final d.c a() {
        s0 s0Var = new s0();
        s0Var.f25339q = this.f789b;
        return s0Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        s0 s0Var = (s0) cVar;
        m mVar = s0Var.f25339q;
        m mVar2 = this.f789b;
        if (r.a(mVar, mVar2)) {
            return;
        }
        s0Var.V1();
        s0Var.f25339q = mVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && r.a(((HoverableElement) obj).f789b, this.f789b);
    }

    public final int hashCode() {
        return this.f789b.hashCode() * 31;
    }
}
