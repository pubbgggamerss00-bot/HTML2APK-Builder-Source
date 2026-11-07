package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class x implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f16342a;

    public x(Class jClass) {
        r.e(jClass, "jClass");
        this.f16342a = jClass;
    }

    @Override // kotlin.jvm.internal.g
    public final Class<?> b() {
        return this.f16342a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return r.a(this.f16342a, ((x) obj).f16342a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16342a.hashCode();
    }

    public final String toString() {
        return this.f16342a + " (Kotlin reflection is not available)";
    }
}
