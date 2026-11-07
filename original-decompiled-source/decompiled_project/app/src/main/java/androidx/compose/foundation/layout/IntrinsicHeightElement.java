package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import j2.e3;
import pg.f0;
import z.v0;
import z.w0;

/* loaded from: classes.dex */
final class IntrinsicHeightElement extends a1<v0> {

    /* renamed from: b, reason: collision with root package name */
    public final w0 f931b = w0.f34658a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f932c = true;

    /* renamed from: d, reason: collision with root package name */
    public final l<e3, f0> f933d;

    public IntrinsicHeightElement(l lVar) {
        this.f933d = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        v0 v0Var = new v0();
        v0Var.f34650q = this.f931b;
        v0Var.f34651r = this.f932c;
        return v0Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        v0 v0Var = (v0) cVar;
        v0Var.f34650q = this.f931b;
        v0Var.f34651r = this.f932c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.f931b == intrinsicHeightElement.f931b && this.f932c == intrinsicHeightElement.f932c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f932c) + (this.f931b.hashCode() * 31);
    }
}
