package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import i2.a1;
import j1.f;
import kotlin.jvm.internal.r;
import z.q0;

/* loaded from: classes.dex */
public final class HorizontalAlignElement extends a1<q0> {

    /* renamed from: b, reason: collision with root package name */
    public final f.a f930b;

    public HorizontalAlignElement(f.a aVar) {
        this.f930b = aVar;
    }

    @Override // i2.a1
    public final d.c a() {
        q0 q0Var = new q0();
        q0Var.f34615q = this.f930b;
        return q0Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((q0) cVar).f34615q = this.f930b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return r.a(this.f930b, horizontalAlignElement.f930b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f930b.f14621a);
    }
}
