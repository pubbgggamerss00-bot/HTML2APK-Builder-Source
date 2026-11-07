package bi;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final g f4247a;

    /* renamed from: b, reason: collision with root package name */
    public final kh.c<?> f4248b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4249c;

    public c(g gVar, kh.c kClass) {
        r.e(kClass, "kClass");
        this.f4247a = gVar;
        this.f4248b = kClass;
        this.f4249c = gVar.f4261a + '<' + kClass.e() + '>';
    }

    @Override // bi.f
    public final String a() {
        return this.f4249c;
    }

    @Override // bi.f
    public final boolean c() {
        return false;
    }

    @Override // bi.f
    public final int d(String name) {
        r.e(name, "name");
        return this.f4247a.d(name);
    }

    @Override // bi.f
    public final int e() {
        return this.f4247a.f4263c;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && this.f4247a.equals(cVar.f4247a) && r.a(cVar.f4248b, this.f4248b);
    }

    @Override // bi.f
    public final String f(int i10) {
        return this.f4247a.f4266f[i10];
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        return this.f4247a.f4268h[i10];
    }

    @Override // bi.f
    public final List<Annotation> getAnnotations() {
        return this.f4247a.f4264d;
    }

    @Override // bi.f
    public final l getKind() {
        return this.f4247a.f4262b;
    }

    @Override // bi.f
    public final f h(int i10) {
        return this.f4247a.f4267g[i10];
    }

    public final int hashCode() {
        return this.f4249c.hashCode() + (this.f4248b.hashCode() * 31);
    }

    @Override // bi.f
    public final boolean i(int i10) {
        return this.f4247a.f4269i[i10];
    }

    @Override // bi.f
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f4248b + ", original: " + this.f4247a + ')';
    }
}
