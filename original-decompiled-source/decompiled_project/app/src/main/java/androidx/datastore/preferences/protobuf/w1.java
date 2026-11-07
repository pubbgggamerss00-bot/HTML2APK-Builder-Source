package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class w1<T, B> {
    public abstract void a(B b10, int i10, int i11);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(B b10, int i10, T t3);

    public abstract void d(B b10, int i10, j jVar);

    public abstract void e(B b10, int i10, long j10);

    public abstract x1 f(Object obj);

    public abstract x1 g(Object obj);

    public abstract int h(T t3);

    public abstract int i(T t3);

    public abstract void j(Object obj);

    public abstract x1 k(Object obj, Object obj2);

    public final boolean l(B b10, n1 n1Var, int i10) throws IOException {
        l lVar = (l) n1Var;
        int i11 = lVar.f2079b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            lVar.x(0);
            e(b10, i12, lVar.f2078a.u());
            return true;
        }
        if (i13 == 1) {
            lVar.x(1);
            b(b10, i12, lVar.f2078a.q());
            return true;
        }
        if (i13 == 2) {
            d(b10, i12, lVar.e());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw e0.c();
            }
            lVar.x(5);
            a(b10, i12, lVar.f2078a.p());
            return true;
        }
        x1 x1VarM = m();
        int i14 = (i12 << 3) | 4;
        int i15 = i10 + 1;
        if (i15 >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (lVar.a() != Integer.MAX_VALUE && l(x1VarM, lVar, i15)) {
        }
        if (i14 != lVar.f2079b) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
        c(b10, i12, p(x1VarM));
        return true;
    }

    public abstract x1 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t3);

    public abstract x1 p(Object obj);

    public abstract void q(T t3, c2 c2Var) throws IOException;

    public abstract void r(T t3, c2 c2Var) throws IOException;
}
