package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.d;
import f3.h;
import i2.a1;
import i2.e0;
import i2.k;
import r.z1;
import z.c1;

/* loaded from: classes.dex */
final class OffsetElement extends a1<c1> {

    /* renamed from: b, reason: collision with root package name */
    public final float f939b;

    /* renamed from: c, reason: collision with root package name */
    public final float f940c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f941d = true;

    public OffsetElement(float f10, float f11, e.a aVar) {
        this.f939b = f10;
        this.f940c = f11;
    }

    @Override // i2.a1
    public final d.c a() {
        c1 c1Var = new c1();
        c1Var.f34479q = this.f939b;
        c1Var.f34480r = this.f940c;
        c1Var.f34481s = this.f941d;
        return c1Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        c1 c1Var = (c1) cVar;
        float f10 = c1Var.f34479q;
        float f11 = this.f939b;
        boolean zA = h.a(f10, f11);
        float f12 = this.f940c;
        boolean z10 = this.f941d;
        if (!zA || !h.a(c1Var.f34480r, f12) || c1Var.f34481s != z10) {
            e0 e0VarF = k.f(c1Var);
            e0.c cVar2 = e0.U;
            e0VarF.e0(false);
        }
        c1Var.f34479q = f11;
        c1Var.f34480r = f12;
        c1Var.f34481s = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && h.a(this.f939b, offsetElement.f939b) && h.a(this.f940c, offsetElement.f940c) && this.f941d == offsetElement.f941d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f941d) + z1.a(this.f940c, Float.hashCode(this.f939b) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) h.b(this.f939b)) + ", y=" + ((Object) h.b(this.f940c)) + ", rtlAware=" + this.f941d + ')';
    }
}
