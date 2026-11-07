package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import f3.h;
import i2.a1;
import z.s1;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends a1<s1> {

    /* renamed from: b, reason: collision with root package name */
    public final float f956b;

    /* renamed from: c, reason: collision with root package name */
    public final float f957c;

    public UnspecifiedConstraintsElement(float f10, float f11) {
        this.f956b = f10;
        this.f957c = f11;
    }

    @Override // i2.a1
    public final d.c a() {
        s1 s1Var = new s1();
        s1Var.f34631q = this.f956b;
        s1Var.f34632r = this.f957c;
        return s1Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        s1 s1Var = (s1) cVar;
        s1Var.f34631q = this.f956b;
        s1Var.f34632r = this.f957c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return h.a(this.f956b, unspecifiedConstraintsElement.f956b) && h.a(this.f957c, unspecifiedConstraintsElement.f957c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f957c) + (Float.hashCode(this.f956b) * 31);
    }
}
