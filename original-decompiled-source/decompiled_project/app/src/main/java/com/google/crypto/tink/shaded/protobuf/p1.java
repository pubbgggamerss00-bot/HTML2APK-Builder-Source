package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class p1 extends n1<o1, o1> {
    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void a(o1 o1Var, int i10, int i11) {
        o1Var.c((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void b(o1 o1Var, int i10, long j10) {
        o1Var.c((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void c(o1 o1Var, int i10, o1 o1Var2) {
        o1Var.c((i10 << 3) | 3, o1Var2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void d(o1 o1Var, int i10, h hVar) {
        o1Var.c((i10 << 3) | 2, hVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void e(o1 o1Var, int i10, long j10) {
        o1Var.c(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final o1 f(Object obj) {
        w wVar = (w) obj;
        o1 o1Var = wVar.unknownFields;
        if (o1Var != o1.f6737f) {
            return o1Var;
        }
        o1 o1Var2 = new o1();
        wVar.unknownFields = o1Var2;
        return o1Var2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final o1 g(Object obj) {
        return ((w) obj).unknownFields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final int h(o1 o1Var) {
        return o1Var.b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final int i(o1 o1Var) {
        o1 o1Var2 = o1Var;
        int i10 = o1Var2.f6741d;
        if (i10 != -1) {
            return i10;
        }
        int I = 0;
        for (int i11 = 0; i11 < o1Var2.f6738a; i11++) {
            int i12 = o1Var2.f6739b[i11] >>> 3;
            I += k.I(3, (h) o1Var2.f6740c[i11]) + k.R(2, i12) + (k.Q(1) * 2);
        }
        o1Var2.f6741d = I;
        return I;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void j(Object obj) {
        ((w) obj).unknownFields.f6742e = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final o1 k(Object obj, Object obj2) {
        o1 o1Var = (o1) obj;
        o1 o1Var2 = (o1) obj2;
        o1 o1Var3 = o1.f6737f;
        if (o1Var3.equals(o1Var2)) {
            return o1Var;
        }
        if (o1Var3.equals(o1Var)) {
            int i10 = o1Var.f6738a + o1Var2.f6738a;
            int[] iArrCopyOf = Arrays.copyOf(o1Var.f6739b, i10);
            System.arraycopy(o1Var2.f6739b, 0, iArrCopyOf, o1Var.f6738a, o1Var2.f6738a);
            Object[] objArrCopyOf = Arrays.copyOf(o1Var.f6740c, i10);
            System.arraycopy(o1Var2.f6740c, 0, objArrCopyOf, o1Var.f6738a, o1Var2.f6738a);
            return new o1(i10, iArrCopyOf, objArrCopyOf, true);
        }
        o1Var.getClass();
        if (o1Var2.equals(o1Var3)) {
            return o1Var;
        }
        if (!o1Var.f6742e) {
            throw new UnsupportedOperationException();
        }
        int i11 = o1Var.f6738a + o1Var2.f6738a;
        o1Var.a(i11);
        System.arraycopy(o1Var2.f6739b, 0, o1Var.f6739b, o1Var.f6738a, o1Var2.f6738a);
        System.arraycopy(o1Var2.f6740c, 0, o1Var.f6740c, o1Var.f6738a, o1Var2.f6738a);
        o1Var.f6738a = i11;
        return o1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final o1 m() {
        return new o1();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void n(Object obj, o1 o1Var) {
        ((w) obj).unknownFields = o1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void o(Object obj, o1 o1Var) {
        ((w) obj).unknownFields = o1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final o1 p(Object obj) {
        o1 o1Var = (o1) obj;
        o1Var.f6742e = false;
        return o1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void q(o1 o1Var, v1 v1Var) throws IOException {
        o1 o1Var2 = o1Var;
        o1Var2.getClass();
        v1Var.getClass();
        for (int i10 = 0; i10 < o1Var2.f6738a; i10++) {
            int i11 = o1Var2.f6739b[i10] >>> 3;
            Object obj = o1Var2.f6740c[i10];
            k kVar = ((l) v1Var).f6726a;
            if (obj instanceof h) {
                kVar.f0(i11, (h) obj);
            } else {
                kVar.e0(i11, (p0) obj);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public final void r(o1 o1Var, v1 v1Var) throws IOException {
        o1Var.d(v1Var);
    }
}
