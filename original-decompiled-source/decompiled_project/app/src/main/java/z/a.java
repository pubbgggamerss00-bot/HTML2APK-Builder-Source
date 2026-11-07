package z;

/* loaded from: classes.dex */
public final class a implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34428a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34429b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.x1 f34430c = bg.b.h(r3.f.f23162e);

    /* renamed from: d, reason: collision with root package name */
    public final x0.x1 f34431d = bg.b.h(Boolean.TRUE);

    public a(int i10, String str) {
        this.f34428a = i10;
        this.f34429b = str;
    }

    @Override // z.u1
    public final int a(f3.d dVar, f3.r rVar) {
        return e().f23163a;
    }

    @Override // z.u1
    public final int b(f3.d dVar) {
        return e().f23164b;
    }

    @Override // z.u1
    public final int c(f3.d dVar) {
        return e().f23166d;
    }

    @Override // z.u1
    public final int d(f3.d dVar, f3.r rVar) {
        return e().f23165c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r3.f e() {
        return (r3.f) this.f34430c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f34428a == ((a) obj).f34428a;
        }
        return false;
    }

    public final void f(y3.i1 i1Var, int i10) {
        int i11 = this.f34428a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f34430c.setValue(i1Var.f33825a.i(i11));
            this.f34431d.setValue(Boolean.valueOf(i1Var.f33825a.u(i11)));
        }
    }

    public final int hashCode() {
        return this.f34428a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34429b);
        sb.append('(');
        sb.append(e().f23163a);
        sb.append(", ");
        sb.append(e().f23164b);
        sb.append(", ");
        sb.append(e().f23165c);
        sb.append(", ");
        return b.b.a(sb, e().f23166d, ')');
    }
}
