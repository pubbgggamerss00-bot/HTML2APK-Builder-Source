package kotlinx.serialization.json;

import e9.w0;
import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes2.dex */
public final class m implements bi.f {

    /* renamed from: a, reason: collision with root package name */
    public final pg.s f16451a;

    public m(eh.a<? extends bi.f> aVar) {
        this.f16451a = w0.b(aVar);
    }

    @Override // bi.f
    public final String a() {
        return b().a();
    }

    public final bi.f b() {
        return (bi.f) this.f16451a.getValue();
    }

    @Override // bi.f
    public final int d(String name) {
        kotlin.jvm.internal.r.e(name, "name");
        return b().d(name);
    }

    @Override // bi.f
    public final int e() {
        return b().e();
    }

    @Override // bi.f
    public final String f(int i10) {
        return b().f(i10);
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        return b().g(i10);
    }

    @Override // bi.f
    public final bi.l getKind() {
        return b().getKind();
    }

    @Override // bi.f
    public final bi.f h(int i10) {
        return b().h(i10);
    }

    @Override // bi.f
    public final boolean i(int i10) {
        return b().i(i10);
    }
}
