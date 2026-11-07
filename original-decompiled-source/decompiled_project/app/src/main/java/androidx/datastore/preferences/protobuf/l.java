package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.b2;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final k f2078a;

    /* renamed from: b, reason: collision with root package name */
    public int f2079b;

    /* renamed from: c, reason: collision with root package name */
    public int f2080c;

    /* renamed from: d, reason: collision with root package name */
    public int f2081d = 0;

    public l(k kVar) {
        d0.a(kVar, "input");
        this.f2078a = kVar;
        kVar.f2051d = this;
    }

    public static void A(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw e0.f();
        }
    }

    public static void z(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw e0.f();
        }
    }

    public final int a() throws IOException {
        int i10 = this.f2081d;
        if (i10 != 0) {
            this.f2079b = i10;
            this.f2081d = 0;
        } else {
            this.f2079b = this.f2078a.E();
        }
        int i11 = this.f2079b;
        if (i11 == 0 || i11 == this.f2080c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public final <T> void b(T t3, o1<T> o1Var, t tVar) throws IOException {
        int i10 = this.f2080c;
        this.f2080c = ((this.f2079b >>> 3) << 3) | 4;
        try {
            o1Var.e(t3, this, tVar);
            if (this.f2079b == this.f2080c) {
            } else {
                throw e0.f();
            }
        } finally {
            this.f2080c = i10;
        }
    }

    public final <T> void c(T t3, o1<T> o1Var, t tVar) throws IOException {
        k kVar = this.f2078a;
        int iF = kVar.F();
        if (kVar.f2048a >= kVar.f2049b) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iK = kVar.k(iF);
        kVar.f2048a++;
        o1Var.e(t3, this, tVar);
        kVar.a(0);
        kVar.f2048a--;
        kVar.j(iK);
    }

    public final void d(List<Boolean> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof f;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(kVar.l()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.f() + kVar.F();
            do {
                list.add(Boolean.valueOf(kVar.l()));
            } while (kVar.f() < iF);
            w(iF);
            return;
        }
        f fVar = (f) list;
        int i11 = this.f2079b & 7;
        if (i11 == 0) {
            do {
                fVar.addBoolean(kVar.l());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF2 = kVar.f() + kVar.F();
        do {
            fVar.addBoolean(kVar.l());
        } while (kVar.f() < iF2);
        w(iF2);
    }

    public final j e() throws IOException {
        x(2);
        return this.f2078a.m();
    }

    public final void f(List<j> list) throws IOException {
        int iE;
        if ((this.f2079b & 7) != 2) {
            throw e0.c();
        }
        do {
            list.add(e());
            k kVar = this.f2078a;
            if (kVar.g()) {
                return;
            } else {
                iE = kVar.E();
            }
        } while (iE == this.f2079b);
        this.f2081d = iE;
    }

    public final void g(List<Double> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof q;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(kVar.n()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.F();
            A(iF);
            int iF2 = kVar.f() + iF;
            do {
                list.add(Double.valueOf(kVar.n()));
            } while (kVar.f() < iF2);
            return;
        }
        q qVar = (q) list;
        int i11 = this.f2079b & 7;
        if (i11 == 1) {
            do {
                qVar.addDouble(kVar.n());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF3 = kVar.F();
        A(iF3);
        int iF4 = kVar.f() + iF3;
        do {
            qVar.addDouble(kVar.n());
        } while (kVar.f() < iF4);
    }

    public final void h(List<Integer> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof c0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(kVar.o()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.f() + kVar.F();
            do {
                list.add(Integer.valueOf(kVar.o()));
            } while (kVar.f() < iF);
            w(iF);
            return;
        }
        c0 c0Var = (c0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 0) {
            do {
                c0Var.addInt(kVar.o());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF2 = kVar.f() + kVar.F();
        do {
            c0Var.addInt(kVar.o());
        } while (kVar.f() < iF2);
        w(iF2);
    }

    public final Object i(b2.a aVar, Class<?> cls, t tVar) throws IOException {
        int iOrdinal = aVar.ordinal();
        k kVar = this.f2078a;
        switch (iOrdinal) {
            case 0:
                x(1);
                return Double.valueOf(kVar.n());
            case 1:
                x(5);
                return Float.valueOf(kVar.r());
            case 2:
                x(0);
                return Long.valueOf(kVar.u());
            case 3:
                x(0);
                return Long.valueOf(kVar.G());
            case 4:
                x(0);
                return Integer.valueOf(kVar.t());
            case 5:
                x(1);
                return Long.valueOf(kVar.q());
            case 6:
                x(5);
                return Integer.valueOf(kVar.p());
            case 7:
                x(0);
                return Boolean.valueOf(kVar.l());
            case 8:
                x(2);
                return kVar.D();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return o(cls, tVar);
            case 11:
                return e();
            case 12:
                x(0);
                return Integer.valueOf(kVar.F());
            case 13:
                x(0);
                return Integer.valueOf(kVar.o());
            case 14:
                x(5);
                return Integer.valueOf(kVar.y());
            case 15:
                x(1);
                return Long.valueOf(kVar.z());
            case 16:
                x(0);
                return Integer.valueOf(kVar.A());
            case 17:
                x(0);
                return Long.valueOf(kVar.B());
        }
    }

    public final void j(List<Integer> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof c0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 2) {
                int iF = kVar.F();
                z(iF);
                int iF2 = kVar.f() + iF;
                do {
                    list.add(Integer.valueOf(kVar.p()));
                } while (kVar.f() < iF2);
                return;
            }
            if (i10 != 5) {
                throw e0.c();
            }
            do {
                list.add(Integer.valueOf(kVar.p()));
                if (kVar.g()) {
                    return;
                } else {
                    iE = kVar.E();
                }
            } while (iE == this.f2079b);
            this.f2081d = iE;
            return;
        }
        c0 c0Var = (c0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 2) {
            int iF3 = kVar.F();
            z(iF3);
            int iF4 = kVar.f() + iF3;
            do {
                c0Var.addInt(kVar.p());
            } while (kVar.f() < iF4);
            return;
        }
        if (i11 != 5) {
            throw e0.c();
        }
        do {
            c0Var.addInt(kVar.p());
            if (kVar.g()) {
                return;
            } else {
                iE2 = kVar.E();
            }
        } while (iE2 == this.f2079b);
        this.f2081d = iE2;
    }

    public final void k(List<Long> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof n0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(kVar.q()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.F();
            A(iF);
            int iF2 = kVar.f() + iF;
            do {
                list.add(Long.valueOf(kVar.q()));
            } while (kVar.f() < iF2);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 1) {
            do {
                n0Var.addLong(kVar.q());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF3 = kVar.F();
        A(iF3);
        int iF4 = kVar.f() + iF3;
        do {
            n0Var.addLong(kVar.q());
        } while (kVar.f() < iF4);
    }

    public final void l(List<Float> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof a0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 2) {
                int iF = kVar.F();
                z(iF);
                int iF2 = kVar.f() + iF;
                do {
                    list.add(Float.valueOf(kVar.r()));
                } while (kVar.f() < iF2);
                return;
            }
            if (i10 != 5) {
                throw e0.c();
            }
            do {
                list.add(Float.valueOf(kVar.r()));
                if (kVar.g()) {
                    return;
                } else {
                    iE = kVar.E();
                }
            } while (iE == this.f2079b);
            this.f2081d = iE;
            return;
        }
        a0 a0Var = (a0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 2) {
            int iF3 = kVar.F();
            z(iF3);
            int iF4 = kVar.f() + iF3;
            do {
                a0Var.addFloat(kVar.r());
            } while (kVar.f() < iF4);
            return;
        }
        if (i11 != 5) {
            throw e0.c();
        }
        do {
            a0Var.addFloat(kVar.r());
            if (kVar.g()) {
                return;
            } else {
                iE2 = kVar.E();
            }
        } while (iE2 == this.f2079b);
        this.f2081d = iE2;
    }

    public final void m(List<Integer> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof c0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(kVar.t()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.f() + kVar.F();
            do {
                list.add(Integer.valueOf(kVar.t()));
            } while (kVar.f() < iF);
            w(iF);
            return;
        }
        c0 c0Var = (c0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 0) {
            do {
                c0Var.addInt(kVar.t());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF2 = kVar.f() + kVar.F();
        do {
            c0Var.addInt(kVar.t());
        } while (kVar.f() < iF2);
        w(iF2);
    }

    public final void n(List<Long> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof n0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(kVar.u()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.f() + kVar.F();
            do {
                list.add(Long.valueOf(kVar.u()));
            } while (kVar.f() < iF);
            w(iF);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 0) {
            do {
                n0Var.addLong(kVar.u());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF2 = kVar.f() + kVar.F();
        do {
            n0Var.addLong(kVar.u());
        } while (kVar.f() < iF2);
        w(iF2);
    }

    public final <T> T o(Class<T> cls, t tVar) throws IOException {
        x(2);
        o1<T> o1VarA = k1.f2075c.a(cls);
        T tNewInstance = o1VarA.newInstance();
        c(tNewInstance, o1VarA, tVar);
        o1VarA.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    public final void p(List<Integer> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof c0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 2) {
                int iF = kVar.F();
                z(iF);
                int iF2 = kVar.f() + iF;
                do {
                    list.add(Integer.valueOf(kVar.y()));
                } while (kVar.f() < iF2);
                return;
            }
            if (i10 != 5) {
                throw e0.c();
            }
            do {
                list.add(Integer.valueOf(kVar.y()));
                if (kVar.g()) {
                    return;
                } else {
                    iE = kVar.E();
                }
            } while (iE == this.f2079b);
            this.f2081d = iE;
            return;
        }
        c0 c0Var = (c0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 2) {
            int iF3 = kVar.F();
            z(iF3);
            int iF4 = kVar.f() + iF3;
            do {
                c0Var.addInt(kVar.y());
            } while (kVar.f() < iF4);
            return;
        }
        if (i11 != 5) {
            throw e0.c();
        }
        do {
            c0Var.addInt(kVar.y());
            if (kVar.g()) {
                return;
            } else {
                iE2 = kVar.E();
            }
        } while (iE2 == this.f2079b);
        this.f2081d = iE2;
    }

    public final void q(List<Long> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof n0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(kVar.z()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.F();
            A(iF);
            int iF2 = kVar.f() + iF;
            do {
                list.add(Long.valueOf(kVar.z()));
            } while (kVar.f() < iF2);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 1) {
            do {
                n0Var.addLong(kVar.z());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF3 = kVar.F();
        A(iF3);
        int iF4 = kVar.f() + iF3;
        do {
            n0Var.addLong(kVar.z());
        } while (kVar.f() < iF4);
    }

    public final void r(List<Integer> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof c0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(kVar.A()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.f() + kVar.F();
            do {
                list.add(Integer.valueOf(kVar.A()));
            } while (kVar.f() < iF);
            w(iF);
            return;
        }
        c0 c0Var = (c0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 0) {
            do {
                c0Var.addInt(kVar.A());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF2 = kVar.f() + kVar.F();
        do {
            c0Var.addInt(kVar.A());
        } while (kVar.f() < iF2);
        w(iF2);
    }

    public final void s(List<Long> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof n0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(kVar.B()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.f() + kVar.F();
            do {
                list.add(Long.valueOf(kVar.B()));
            } while (kVar.f() < iF);
            w(iF);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 0) {
            do {
                n0Var.addLong(kVar.B());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF2 = kVar.f() + kVar.F();
        do {
            n0Var.addLong(kVar.B());
        } while (kVar.f() < iF2);
        w(iF2);
    }

    public final void t(List<String> list, boolean z10) throws IOException {
        String strC;
        int iE;
        int iE2;
        if ((this.f2079b & 7) != 2) {
            throw e0.c();
        }
        boolean z11 = list instanceof j0;
        k kVar = this.f2078a;
        if (z11 && !z10) {
            j0 j0Var = (j0) list;
            do {
                e();
                j0Var.z();
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        do {
            if (z10) {
                x(2);
                strC = kVar.D();
            } else {
                x(2);
                strC = kVar.C();
            }
            list.add(strC);
            if (kVar.g()) {
                return;
            } else {
                iE = kVar.E();
            }
        } while (iE == this.f2079b);
        this.f2081d = iE;
    }

    public final void u(List<Integer> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof c0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(kVar.F()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.f() + kVar.F();
            do {
                list.add(Integer.valueOf(kVar.F()));
            } while (kVar.f() < iF);
            w(iF);
            return;
        }
        c0 c0Var = (c0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 0) {
            do {
                c0Var.addInt(kVar.F());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF2 = kVar.f() + kVar.F();
        do {
            c0Var.addInt(kVar.F());
        } while (kVar.f() < iF2);
        w(iF2);
    }

    public final void v(List<Long> list) throws IOException {
        int iE;
        int iE2;
        boolean z10 = list instanceof n0;
        k kVar = this.f2078a;
        if (!z10) {
            int i10 = this.f2079b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(kVar.G()));
                    if (kVar.g()) {
                        return;
                    } else {
                        iE = kVar.E();
                    }
                } while (iE == this.f2079b);
                this.f2081d = iE;
                return;
            }
            if (i10 != 2) {
                throw e0.c();
            }
            int iF = kVar.f() + kVar.F();
            do {
                list.add(Long.valueOf(kVar.G()));
            } while (kVar.f() < iF);
            w(iF);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f2079b & 7;
        if (i11 == 0) {
            do {
                n0Var.addLong(kVar.G());
                if (kVar.g()) {
                    return;
                } else {
                    iE2 = kVar.E();
                }
            } while (iE2 == this.f2079b);
            this.f2081d = iE2;
            return;
        }
        if (i11 != 2) {
            throw e0.c();
        }
        int iF2 = kVar.f() + kVar.F();
        do {
            n0Var.addLong(kVar.G());
        } while (kVar.f() < iF2);
        w(iF2);
    }

    public final void w(int i10) throws IOException {
        if (this.f2078a.f() != i10) {
            throw e0.g();
        }
    }

    public final void x(int i10) throws IOException {
        if ((this.f2079b & 7) != i10) {
            throw e0.c();
        }
    }

    public final boolean y() throws IOException {
        int i10;
        k kVar = this.f2078a;
        if (kVar.g() || (i10 = this.f2079b) == this.f2080c) {
            return false;
        }
        return kVar.H(i10);
    }
}
