package kotlinx.serialization.internal;

import bi.m;
import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a0 implements bi.f {

    /* renamed from: a, reason: collision with root package name */
    public final bi.f f16346a;

    public a0(bi.f fVar) {
        this.f16346a = fVar;
    }

    @Override // bi.f
    public final int d(String name) {
        kotlin.jvm.internal.r.e(name, "name");
        Integer numG = mh.s.g(name);
        if (numG != null) {
            return numG.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // bi.f
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.r.a(this.f16346a, a0Var.f16346a) && kotlin.jvm.internal.r.a(a(), a0Var.a());
    }

    @Override // bi.f
    public final String f(int i10) {
        return String.valueOf(i10);
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        if (i10 >= 0) {
            return qg.z.f22752a;
        }
        StringBuilder sbB = p.i0.b(i10, "Illegal index ", ", ");
        sbB.append(a());
        sbB.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbB.toString().toString());
    }

    @Override // bi.f
    public final bi.l getKind() {
        return m.b.f4279a;
    }

    @Override // bi.f
    public final bi.f h(int i10) {
        if (i10 >= 0) {
            return this.f16346a;
        }
        StringBuilder sbB = p.i0.b(i10, "Illegal index ", ", ");
        sbB.append(a());
        sbB.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbB.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f16346a.hashCode() * 31);
    }

    @Override // bi.f
    public final boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        StringBuilder sbB = p.i0.b(i10, "Illegal index ", ", ");
        sbB.append(a());
        sbB.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbB.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f16346a + ')';
    }
}
