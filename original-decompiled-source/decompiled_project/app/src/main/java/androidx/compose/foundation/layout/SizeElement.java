package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import eh.l;
import f3.h;
import i2.a1;
import j2.e3;
import pg.f0;
import r.z1;
import z.p1;

/* loaded from: classes.dex */
final class SizeElement extends a1<p1> {

    /* renamed from: b, reason: collision with root package name */
    public final float f950b;

    /* renamed from: c, reason: collision with root package name */
    public final float f951c;

    /* renamed from: d, reason: collision with root package name */
    public final float f952d;

    /* renamed from: e, reason: collision with root package name */
    public final float f953e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f954f;

    /* renamed from: g, reason: collision with root package name */
    public final l<e3, f0> f955g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, l lVar, int i10) {
        l lVar2;
        boolean z11;
        float f14;
        f10 = (i10 & 1) != 0 ? Float.NaN : f10;
        f11 = (i10 & 2) != 0 ? Float.NaN : f11;
        f12 = (i10 & 4) != 0 ? Float.NaN : f12;
        if ((i10 & 8) != 0) {
            lVar2 = lVar;
            z11 = z10;
            f14 = Float.NaN;
        } else {
            lVar2 = lVar;
            z11 = z10;
            f14 = f13;
        }
        this(f10, f11, f12, f14, z11, lVar2);
    }

    @Override // i2.a1
    public final d.c a() {
        p1 p1Var = new p1();
        p1Var.f34607q = this.f950b;
        p1Var.f34608r = this.f951c;
        p1Var.f34609s = this.f952d;
        p1Var.f34610t = this.f953e;
        p1Var.f34611v = this.f954f;
        return p1Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        p1 p1Var = (p1) cVar;
        p1Var.f34607q = this.f950b;
        p1Var.f34608r = this.f951c;
        p1Var.f34609s = this.f952d;
        p1Var.f34610t = this.f953e;
        p1Var.f34611v = this.f954f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return h.a(this.f950b, sizeElement.f950b) && h.a(this.f951c, sizeElement.f951c) && h.a(this.f952d, sizeElement.f952d) && h.a(this.f953e, sizeElement.f953e) && this.f954f == sizeElement.f954f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f954f) + z1.a(this.f953e, z1.a(this.f952d, z1.a(this.f951c, Float.hashCode(this.f950b) * 31, 31), 31), 31);
    }

    public SizeElement(float f10, float f11, float f12, float f13, boolean z10, l lVar) {
        this.f950b = f10;
        this.f951c = f11;
        this.f952d = f12;
        this.f953e = f13;
        this.f954f = z10;
        this.f955g = lVar;
    }
}
