package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import i2.a1;

/* loaded from: classes.dex */
public final class LayoutWeightElement extends a1<z.a1> {

    /* renamed from: b, reason: collision with root package name */
    public final float f937b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f938c;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f937b = f10;
        this.f938c = z10;
    }

    @Override // i2.a1
    public final d.c a() {
        z.a1 a1Var = new z.a1();
        a1Var.f34442q = this.f937b;
        a1Var.f34443r = this.f938c;
        return a1Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        z.a1 a1Var = (z.a1) cVar;
        a1Var.f34442q = this.f937b;
        a1Var.f34443r = this.f938c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f937b == layoutWeightElement.f937b && this.f938c == layoutWeightElement.f938c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f938c) + (Float.hashCode(this.f937b) * 31);
    }
}
