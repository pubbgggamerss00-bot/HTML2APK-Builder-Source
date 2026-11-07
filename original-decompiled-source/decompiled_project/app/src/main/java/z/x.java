package z;

/* loaded from: classes.dex */
public final class x implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f34663a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f34664b;

    public x(u1 u1Var, u1 u1Var2) {
        this.f34663a = u1Var;
        this.f34664b = u1Var2;
    }

    @Override // z.u1
    public final int a(f3.d dVar, f3.r rVar) {
        int iA = this.f34663a.a(dVar, rVar) - this.f34664b.a(dVar, rVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // z.u1
    public final int b(f3.d dVar) {
        int iB = this.f34663a.b(dVar) - this.f34664b.b(dVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // z.u1
    public final int c(f3.d dVar) {
        int iC = this.f34663a.c(dVar) - this.f34664b.c(dVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // z.u1
    public final int d(f3.d dVar, f3.r rVar) {
        int iD = this.f34663a.d(dVar, rVar) - this.f34664b.d(dVar, rVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.r.a(xVar.f34663a, this.f34663a) && kotlin.jvm.internal.r.a(xVar.f34664b, this.f34664b);
    }

    public final int hashCode() {
        return this.f34664b.hashCode() + (this.f34663a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f34663a + " - " + this.f34664b + ')';
    }
}
