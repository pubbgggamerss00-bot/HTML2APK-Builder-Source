package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class y1 extends w1<x1, x1> {
    @Override // androidx.datastore.preferences.protobuf.w1
    public final void a(x1 x1Var, int i10, int i11) {
        x1Var.f((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final void b(x1 x1Var, int i10, long j10) {
        x1Var.f((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final void c(x1 x1Var, int i10, x1 x1Var2) {
        x1Var.f((i10 << 3) | 3, x1Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final void d(x1 x1Var, int i10, j jVar) {
        x1Var.f((i10 << 3) | 2, jVar);
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final void e(x1 x1Var, int i10, long j10) {
        x1Var.f(i10 << 3, Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final x1 f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        x1 x1Var = generatedMessageLite.unknownFields;
        if (x1Var != x1.f2170f) {
            return x1Var;
        }
        x1 x1Var2 = new x1();
        generatedMessageLite.unknownFields = x1Var2;
        return x1Var2;
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final x1 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final int h(x1 x1Var) {
        return x1Var.c();
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final int i(x1 x1Var) {
        x1 x1Var2 = x1Var;
        int i10 = x1Var2.f2174d;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < x1Var2.f2171a; i11++) {
            int i12 = x1Var2.f2172b[i11] >>> 3;
            iB += m.b(3, (j) x1Var2.f2173c[i11]) + m.h(i12) + m.g(2) + (m.g(1) * 2);
        }
        x1Var2.f2174d = iB;
        return iB;
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final void j(Object obj) {
        x1 x1Var = ((GeneratedMessageLite) obj).unknownFields;
        if (x1Var.f2175e) {
            x1Var.f2175e = false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final x1 k(Object obj, Object obj2) {
        x1 x1Var = (x1) obj;
        x1 x1Var2 = (x1) obj2;
        x1 x1Var3 = x1.f2170f;
        if (x1Var3.equals(x1Var2)) {
            return x1Var;
        }
        if (x1Var3.equals(x1Var)) {
            return x1.e(x1Var, x1Var2);
        }
        x1Var.getClass();
        if (x1Var2.equals(x1Var3)) {
            return x1Var;
        }
        x1Var.a();
        int i10 = x1Var.f2171a + x1Var2.f2171a;
        x1Var.b(i10);
        System.arraycopy(x1Var2.f2172b, 0, x1Var.f2172b, x1Var.f2171a, x1Var2.f2171a);
        System.arraycopy(x1Var2.f2173c, 0, x1Var.f2173c, x1Var.f2171a, x1Var2.f2171a);
        x1Var.f2171a = i10;
        return x1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final x1 m() {
        return new x1();
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final void n(Object obj, x1 x1Var) {
        ((GeneratedMessageLite) obj).unknownFields = x1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final void o(Object obj, x1 x1Var) {
        ((GeneratedMessageLite) obj).unknownFields = x1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final x1 p(Object obj) {
        x1 x1Var = (x1) obj;
        if (x1Var.f2175e) {
            x1Var.f2175e = false;
        }
        return x1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final void q(x1 x1Var, c2 c2Var) throws IOException {
        x1 x1Var2 = x1Var;
        x1Var2.getClass();
        c2Var.getClass();
        for (int i10 = 0; i10 < x1Var2.f2171a; i10++) {
            ((n) c2Var).b(x1Var2.f2172b[i10] >>> 3, x1Var2.f2173c[i10]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w1
    public final void r(x1 x1Var, c2 c2Var) throws IOException {
        x1Var.g(c2Var);
    }
}
