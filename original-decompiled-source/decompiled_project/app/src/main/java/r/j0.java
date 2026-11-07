package r;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final j1.d f22861a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<f3.p, f3.p> f22862b;

    /* renamed from: c, reason: collision with root package name */
    public final s.e0<f3.p> f22863c;

    public j0(eh.l lVar, j1.d dVar, s.e0 e0Var) {
        this.f22861a = dVar;
        this.f22862b = lVar;
        this.f22863c = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.r.a(this.f22861a, j0Var.f22861a) && kotlin.jvm.internal.r.a(this.f22862b, j0Var.f22862b) && kotlin.jvm.internal.r.a(this.f22863c, j0Var.f22863c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f22863c.hashCode() + ((this.f22862b.hashCode() + (this.f22861a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f22861a + ", size=" + this.f22862b + ", animationSpec=" + this.f22863c + ", clip=true)";
    }
}
