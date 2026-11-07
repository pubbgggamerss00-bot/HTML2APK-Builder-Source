package z;

/* loaded from: classes.dex */
public final class r1 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f34622a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f34623b;

    public r1(u1 u1Var, u1 u1Var2) {
        this.f34622a = u1Var;
        this.f34623b = u1Var2;
    }

    @Override // z.u1
    public final int a(f3.d dVar, f3.r rVar) {
        return Math.max(this.f34622a.a(dVar, rVar), this.f34623b.a(dVar, rVar));
    }

    @Override // z.u1
    public final int b(f3.d dVar) {
        return Math.max(this.f34622a.b(dVar), this.f34623b.b(dVar));
    }

    @Override // z.u1
    public final int c(f3.d dVar) {
        return Math.max(this.f34622a.c(dVar), this.f34623b.c(dVar));
    }

    @Override // z.u1
    public final int d(f3.d dVar, f3.r rVar) {
        return Math.max(this.f34622a.d(dVar, rVar), this.f34623b.d(dVar, rVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return kotlin.jvm.internal.r.a(r1Var.f34622a, this.f34622a) && kotlin.jvm.internal.r.a(r1Var.f34623b, this.f34623b);
    }

    public final int hashCode() {
        return (this.f34623b.hashCode() * 31) + this.f34622a.hashCode();
    }

    public final String toString() {
        return "(" + this.f34622a + " ∪ " + this.f34623b + ')';
    }
}
