package c2;

import java.util.ArrayList;
import s.y1;

/* loaded from: classes.dex */
public abstract class g0 implements ci.e, ci.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4646a;

    public g0(int i10) {
        switch (i10) {
            case 1:
                this.f4646a = new ArrayList();
                break;
            case 2:
                this.f4646a = bg.b.h(Boolean.FALSE);
                break;
        }
    }

    @Override // ci.c
    public void B(bi.f descriptor, int i10, byte b10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        u(W(descriptor, i10), b10);
    }

    @Override // ci.e
    public void C(bi.f enumDescriptor, int i10) {
        kotlin.jvm.internal.r.e(enumDescriptor, "enumDescriptor");
        E(Y(), enumDescriptor, i10);
    }

    @Override // ci.c
    public void D(bi.f descriptor, int i10, float f10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        F(W(descriptor, i10), f10);
    }

    public abstract void E(Object obj, bi.f fVar, int i10);

    public abstract void F(Object obj, float f10);

    @Override // ci.e
    public void H(int i10) {
        Q(i10, Y());
    }

    @Override // ci.c
    public ci.e I(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return P(W(descriptor, i10), descriptor.h(i10));
    }

    @Override // ci.e
    public void K(long j10) {
        R(Y(), j10);
    }

    @Override // ci.c
    public void L(bi.f descriptor, int i10, boolean z10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        s(W(descriptor, i10), z10);
    }

    @Override // ci.c
    public void M(bi.f descriptor, int i10, String value) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(value, "value");
        T(W(descriptor, i10), value);
    }

    @Override // ci.e
    public void N(String value) {
        kotlin.jvm.internal.r.e(value, "value");
        T(Y(), value);
    }

    @Override // ci.c
    public void O(int i10, int i11, bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        Q(i11, W(descriptor, i10));
    }

    public abstract ci.e P(Object obj, bi.f fVar);

    public abstract void Q(int i10, Object obj);

    public abstract void R(Object obj, long j10);

    public abstract void S(Object obj, short s10);

    public abstract void T(Object obj, String str);

    public abstract void U(bi.f fVar);

    public abstract Object V();

    public String W(bi.f fVar, int i10) {
        kotlin.jvm.internal.r.e(fVar, "<this>");
        String nestedName = j(fVar, i10);
        kotlin.jvm.internal.r.e(nestedName, "nestedName");
        return nestedName;
    }

    public abstract Object X();

    public Object Y() {
        ArrayList arrayList = (ArrayList) this.f4646a;
        if (arrayList.isEmpty()) {
            throw new zh.h("No tag in stack for requested element");
        }
        return arrayList.remove(qg.p.i(arrayList));
    }

    public abstract void Z(Object obj);

    public abstract void a0(y1 y1Var);

    @Override // ci.c
    public void b(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (!((ArrayList) this.f4646a).isEmpty()) {
            Y();
        }
        U(descriptor);
    }

    public abstract void b0();

    @Override // ci.c
    public void e(bi.f descriptor, int i10, long j10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        R(W(descriptor, i10), j10);
    }

    @Override // ci.e
    public ci.e f(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return P(Y(), descriptor);
    }

    @Override // ci.c
    public void g(bi.f descriptor, int i10, zh.i serializer, Object obj) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(serializer, "serializer");
        ((ArrayList) this.f4646a).add(W(descriptor, i10));
        m(serializer, obj);
    }

    public abstract String j(bi.f fVar, int i10);

    @Override // ci.e
    public void k(double d10) {
        x(Y(), d10);
    }

    @Override // ci.e
    public void l(short s10) {
        S(Y(), s10);
    }

    @Override // ci.e
    public void n(byte b10) {
        u(Y(), b10);
    }

    @Override // ci.e
    public void o(boolean z10) {
        s(Y(), z10);
    }

    @Override // ci.c
    public void p(bi.f descriptor, int i10, double d10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        x(W(descriptor, i10), d10);
    }

    @Override // ci.c
    public void q(bi.f descriptor, int i10, short s10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        S(W(descriptor, i10), s10);
    }

    @Override // ci.e
    public void r(float f10) {
        F(Y(), f10);
    }

    public abstract void s(Object obj, boolean z10);

    @Override // ci.e
    public void t(char c10) {
        w(Y(), c10);
    }

    public abstract void u(Object obj, byte b10);

    public abstract void w(Object obj, char c10);

    public abstract void x(Object obj, double d10);

    @Override // ci.c
    public void y(bi.f descriptor, int i10, zh.i serializer, Object obj) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(serializer, "serializer");
        ((ArrayList) this.f4646a).add(W(descriptor, i10));
        J(serializer, obj);
    }

    @Override // ci.c
    public void z(bi.f descriptor, int i10, char c10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        w(W(descriptor, i10), c10);
    }
}
