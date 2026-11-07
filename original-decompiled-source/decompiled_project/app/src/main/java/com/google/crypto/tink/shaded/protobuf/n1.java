package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class n1<T, B> {
    public abstract void a(B b10, int i10, int i11);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(B b10, int i10, T t3);

    public abstract void d(B b10, int i10, h hVar);

    public abstract void e(B b10, int i10, long j10);

    public abstract o1 f(Object obj);

    public abstract o1 g(Object obj);

    public abstract int h(T t3);

    public abstract int i(T t3);

    public abstract void j(Object obj);

    public abstract o1 k(Object obj, Object obj2);

    public final boolean l(B b10, f1 f1Var) throws IOException {
        j jVar = (j) f1Var;
        int i10 = jVar.f6698b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            jVar.v(0);
            e(b10, i11, jVar.f6697a.q());
            return true;
        }
        if (i12 == 1) {
            jVar.v(1);
            b(b10, i11, jVar.f6697a.n());
            return true;
        }
        if (i12 == 2) {
            d(b10, i11, jVar.e());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw z.c();
            }
            jVar.v(5);
            a(b10, i11, jVar.f6697a.m());
            return true;
        }
        o1 o1VarM = m();
        int i13 = (i11 << 3) | 4;
        while (jVar.a() != Integer.MAX_VALUE && l(o1VarM, jVar)) {
        }
        if (i13 != jVar.f6698b) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
        c(b10, i11, p(o1VarM));
        return true;
    }

    public abstract o1 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t3);

    public abstract o1 p(Object obj);

    public abstract void q(T t3, v1 v1Var) throws IOException;

    public abstract void r(T t3, v1 v1Var) throws IOException;
}
