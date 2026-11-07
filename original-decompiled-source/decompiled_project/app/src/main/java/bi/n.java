package bi;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.o0;

/* loaded from: classes2.dex */
public final class n implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f4282a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4283b;

    public n(String str, f original) {
        r.e(original, "original");
        this.f4282a = str;
        this.f4283b = original;
    }

    @Override // bi.f
    public final String a() {
        return this.f4282a;
    }

    @Override // bi.f
    public final boolean c() {
        return this.f4283b.c();
    }

    @Override // bi.f
    public final int d(String name) {
        r.e(name, "name");
        return this.f4283b.d(name);
    }

    @Override // bi.f
    public final int e() {
        return this.f4283b.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return r.a(this.f4282a, nVar.f4282a) && r.a(this.f4283b, nVar.f4283b);
    }

    @Override // bi.f
    public final String f(int i10) {
        return this.f4283b.f(i10);
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        return this.f4283b.g(i10);
    }

    @Override // bi.f
    public final List<Annotation> getAnnotations() {
        return this.f4283b.getAnnotations();
    }

    @Override // bi.f
    public final l getKind() {
        return this.f4283b.getKind();
    }

    @Override // bi.f
    public final f h(int i10) {
        return this.f4283b.h(i10);
    }

    public final int hashCode() {
        return this.f4283b.hashCode() + (this.f4282a.hashCode() * 31);
    }

    @Override // bi.f
    public final boolean i(int i10) {
        return this.f4283b.i(i10);
    }

    @Override // bi.f
    public final boolean isInline() {
        return this.f4283b.isInline();
    }

    public final String toString() {
        return o0.c(this);
    }
}
