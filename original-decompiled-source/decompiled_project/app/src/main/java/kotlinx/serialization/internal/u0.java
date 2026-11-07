package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class u0 implements bi.f, f {

    /* renamed from: a, reason: collision with root package name */
    public final bi.f f16415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16416b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<String> f16417c;

    public u0(bi.f original) {
        kotlin.jvm.internal.r.e(original, "original");
        this.f16415a = original;
        this.f16416b = original.a() + '?';
        this.f16417c = l0.a(original);
    }

    @Override // bi.f
    public final String a() {
        return this.f16416b;
    }

    @Override // kotlinx.serialization.internal.f
    public final Set<String> b() {
        return this.f16417c;
    }

    @Override // bi.f
    public final boolean c() {
        return true;
    }

    @Override // bi.f
    public final int d(String name) {
        kotlin.jvm.internal.r.e(name, "name");
        return this.f16415a.d(name);
    }

    @Override // bi.f
    public final int e() {
        return this.f16415a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            return kotlin.jvm.internal.r.a(this.f16415a, ((u0) obj).f16415a);
        }
        return false;
    }

    @Override // bi.f
    public final String f(int i10) {
        return this.f16415a.f(i10);
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        return this.f16415a.g(i10);
    }

    @Override // bi.f
    public final List<Annotation> getAnnotations() {
        return this.f16415a.getAnnotations();
    }

    @Override // bi.f
    public final bi.l getKind() {
        return this.f16415a.getKind();
    }

    @Override // bi.f
    public final bi.f h(int i10) {
        return this.f16415a.h(i10);
    }

    public final int hashCode() {
        return this.f16415a.hashCode() * 31;
    }

    @Override // bi.f
    public final boolean i(int i10) {
        return this.f16415a.i(i10);
    }

    @Override // bi.f
    public final boolean isInline() {
        return this.f16415a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16415a);
        sb.append('?');
        return sb.toString();
    }
}
