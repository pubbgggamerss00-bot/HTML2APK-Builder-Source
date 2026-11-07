package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import x0.s1;

/* loaded from: classes2.dex */
public final class s0 implements bi.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f16411a;

    /* renamed from: b, reason: collision with root package name */
    public final bi.e f16412b;

    public s0(String str, bi.e kind) {
        kotlin.jvm.internal.r.e(kind, "kind");
        this.f16411a = str;
        this.f16412b = kind;
    }

    @Override // bi.f
    public final String a() {
        return this.f16411a;
    }

    public final void b() {
        throw new IllegalStateException(b.o.a(new StringBuilder("Primitive descriptor "), this.f16411a, " does not have elements"));
    }

    @Override // bi.f
    public final int d(String name) {
        kotlin.jvm.internal.r.e(name, "name");
        b();
        throw null;
    }

    @Override // bi.f
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return kotlin.jvm.internal.r.a(this.f16411a, s0Var.f16411a) && kotlin.jvm.internal.r.a(this.f16412b, s0Var.f16412b);
    }

    @Override // bi.f
    public final String f(int i10) {
        b();
        throw null;
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        b();
        throw null;
    }

    @Override // bi.f
    public final bi.l getKind() {
        return this.f16412b;
    }

    @Override // bi.f
    public final bi.f h(int i10) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.f16412b.hashCode() * 31) + this.f16411a.hashCode();
    }

    @Override // bi.f
    public final boolean i(int i10) {
        b();
        throw null;
    }

    public final String toString() {
        return s1.a(new StringBuilder("PrimitiveDescriptor("), this.f16411a, ')');
    }
}
