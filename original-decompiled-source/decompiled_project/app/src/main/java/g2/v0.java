package g2;

import java.util.List;

/* loaded from: classes.dex */
public final class v0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f11457a;

    public v0(u0 u0Var) {
        this.f11457a = u0Var;
    }

    @Override // g2.l0
    public final int c(q qVar, List<? extends p> list, int i10) {
        return this.f11457a.c(qVar, i2.z0.a(qVar), i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && kotlin.jvm.internal.r.a(this.f11457a, ((v0) obj).f11457a);
    }

    @Override // g2.l0
    public final int f(q qVar, List<? extends p> list, int i10) {
        return this.f11457a.f(qVar, i2.z0.a(qVar), i10);
    }

    @Override // g2.l0
    public final int g(q qVar, List<? extends p> list, int i10) {
        return this.f11457a.g(qVar, i2.z0.a(qVar), i10);
    }

    @Override // g2.l0
    public final m0 h(o0 o0Var, List<? extends k0> list, long j10) {
        return this.f11457a.h(o0Var, i2.z0.a(o0Var), j10);
    }

    public final int hashCode() {
        return this.f11457a.hashCode();
    }

    @Override // g2.l0
    public final int i(q qVar, List<? extends p> list, int i10) {
        return this.f11457a.i(qVar, i2.z0.a(qVar), i10);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f11457a + ')';
    }
}
