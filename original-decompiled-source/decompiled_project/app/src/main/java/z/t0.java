package z;

/* loaded from: classes.dex */
public final class t0 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f34636a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.d f34637b;

    public t0(u1 u1Var, f3.d dVar) {
        this.f34636a = u1Var;
        this.f34637b = dVar;
    }

    @Override // z.f1
    public final float a() {
        u1 u1Var = this.f34636a;
        f3.d dVar = this.f34637b;
        return dVar.u(u1Var.c(dVar));
    }

    @Override // z.f1
    public final float b(f3.r rVar) {
        u1 u1Var = this.f34636a;
        f3.d dVar = this.f34637b;
        return dVar.u(u1Var.a(dVar, rVar));
    }

    @Override // z.f1
    public final float c() {
        u1 u1Var = this.f34636a;
        f3.d dVar = this.f34637b;
        return dVar.u(u1Var.b(dVar));
    }

    @Override // z.f1
    public final float d(f3.r rVar) {
        u1 u1Var = this.f34636a;
        f3.d dVar = this.f34637b;
        return dVar.u(u1Var.d(dVar, rVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.r.a(this.f34636a, t0Var.f34636a) && kotlin.jvm.internal.r.a(this.f34637b, t0Var.f34637b);
    }

    public final int hashCode() {
        return this.f34637b.hashCode() + (this.f34636a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f34636a + ", density=" + this.f34637b + ')';
    }
}
