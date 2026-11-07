package kotlinx.serialization.internal;

import bi.m;
import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes2.dex */
public final class h0 implements bi.f {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f16371a = new h0();

    /* renamed from: b, reason: collision with root package name */
    public static final m.d f16372b = m.d.f4281a;

    /* renamed from: c, reason: collision with root package name */
    public static final String f16373c = "kotlin.Nothing";

    @Override // bi.f
    public final String a() {
        return f16373c;
    }

    @Override // bi.f
    public final int d(String name) {
        kotlin.jvm.internal.r.e(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // bi.f
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // bi.f
    public final String f(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // bi.f
    public final bi.l getKind() {
        return f16372b;
    }

    @Override // bi.f
    public final bi.f h(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (f16372b.hashCode() * 31) + f16373c.hashCode();
    }

    @Override // bi.f
    public final boolean i(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
