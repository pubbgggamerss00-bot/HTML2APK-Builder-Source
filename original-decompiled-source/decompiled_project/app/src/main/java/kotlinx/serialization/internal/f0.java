package kotlinx.serialization.internal;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class f0 implements ci.d, ci.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f16364a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f16365b;

    @Override // ci.b
    public final boolean A(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return F(R(descriptor, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final byte B() {
        return G(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final short C() {
        return O(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final float D() {
        return K(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final double E() {
        return I(S());
    }

    public abstract boolean F(String str);

    public abstract byte G(String str);

    public abstract char H(String str);

    public abstract double I(String str);

    public abstract int J(String str, bi.f fVar);

    public abstract float K(String str);

    public abstract ci.d L(String str, bi.f fVar);

    public abstract int M(String str);

    public abstract long N(String str);

    public abstract short O(String str);

    public abstract String P(String str);

    public String Q(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return descriptor.f(i10);
    }

    public final String R(bi.f fVar, int i10) {
        kotlin.jvm.internal.r.e(fVar, "<this>");
        String nestedName = Q(fVar, i10);
        kotlin.jvm.internal.r.e(nestedName, "nestedName");
        return nestedName;
    }

    public final String S() {
        ArrayList<String> arrayList = this.f16364a;
        String strRemove = arrayList.remove(qg.p.i(arrayList));
        this.f16365b = true;
        return strRemove;
    }

    public final String T() {
        ArrayList<String> arrayList = this.f16364a;
        return arrayList.isEmpty() ? "$" : qg.x.I(arrayList, ".", "$.", null, null, 60);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public ci.d e(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return L(S(), descriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final boolean f() {
        return F(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final char h() {
        return H(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final int i(bi.f enumDescriptor) {
        kotlin.jvm.internal.r.e(enumDescriptor, "enumDescriptor");
        return J(S(), enumDescriptor);
    }

    @Override // ci.b
    public final double j(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return I(R(descriptor, i10));
    }

    @Override // ci.b
    public final long k(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return N(R(descriptor, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final int m() {
        return M(S());
    }

    @Override // ci.b
    public final short n(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return O(R(descriptor, i10));
    }

    @Override // ci.b
    public final byte o(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return G(R(descriptor, i10));
    }

    @Override // ci.b
    public final ci.d p(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return L(R(descriptor, i10), descriptor.h(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final String r() {
        return P(S());
    }

    @Override // ci.b
    public final Object s(bi.f descriptor, int i10, zh.b deserializer, Object obj) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(deserializer, "deserializer");
        this.f16364a.add(R(descriptor, i10));
        Object objQ = (deserializer.getDescriptor().c() || x()) ? q(deserializer) : null;
        if (!this.f16365b) {
            S();
        }
        this.f16365b = false;
        return objQ;
    }

    @Override // ci.b
    public final float t(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return K(R(descriptor, i10));
    }

    @Override // ci.b
    public final <T> T u(bi.f descriptor, int i10, zh.a<? extends T> deserializer, T t3) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(deserializer, "deserializer");
        this.f16364a.add(R(descriptor, i10));
        kotlin.jvm.internal.r.e(deserializer, "deserializer");
        T t10 = (T) q(deserializer);
        if (!this.f16365b) {
            S();
        }
        this.f16365b = false;
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final long v() {
        return N(S());
    }

    @Override // ci.b
    public final int w(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return M(R(descriptor, i10));
    }

    @Override // ci.b
    public final char y(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return H(R(descriptor, i10));
    }

    @Override // ci.b
    public final String z(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return P(R(descriptor, i10));
    }
}
