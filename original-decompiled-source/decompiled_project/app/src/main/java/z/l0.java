package z;

import f3.b;
import z.b;

/* loaded from: classes.dex */
public interface l0 extends i1 {
    @Override // z.i1
    default g2.m0 a(g2.g1[] g1VarArr, g2.o0 o0Var, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        int i15;
        int i16;
        if (n()) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
        }
        return o0Var.i0(i16, i15, qg.a0.f22708a, new k0(iArr2, i12, i13, i14, g1VarArr, this, i11, n() ? f3.r.f8828a : o0Var.getLayoutDirection(), iArr));
    }

    @Override // z.i1
    default int b(g2.g1 g1Var) {
        return n() ? g1Var.e0() : g1Var.g0();
    }

    @Override // z.i1
    default void d(int i10, int[] iArr, int[] iArr2, g2.o0 o0Var) {
        if (n()) {
            l().b(o0Var, i10, iArr, o0Var.getLayoutDirection(), iArr2);
        } else {
            m().c(o0Var, i10, iArr, iArr2);
        }
    }

    @Override // z.i1
    default long e(int i10, int i11, int i12, boolean z10) {
        if (n()) {
            m1 m1Var = k1.f34578a;
            return !z10 ? f3.c.a(i10, i11, 0, i12) : b.a.b(i10, i11, 0, i12);
        }
        q qVar = o.f34599a;
        return !z10 ? f3.c.a(0, i12, i10, i11) : b.a.a(0, i12, i10, i11);
    }

    @Override // z.i1
    default int j(g2.g1 g1Var) {
        return n() ? g1Var.g0() : g1Var.e0();
    }

    v k();

    b.e l();

    b.l m();

    boolean n();
}
