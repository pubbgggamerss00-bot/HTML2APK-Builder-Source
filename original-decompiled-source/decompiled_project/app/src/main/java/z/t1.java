package z;

/* loaded from: classes.dex */
public final class t1 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f34638a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.x1 f34639b;

    public t1(u0 u0Var, String str) {
        this.f34638a = str;
        this.f34639b = bg.b.h(u0Var);
    }

    @Override // z.u1
    public final int a(f3.d dVar, f3.r rVar) {
        return e().f34640a;
    }

    @Override // z.u1
    public final int b(f3.d dVar) {
        return e().f34641b;
    }

    @Override // z.u1
    public final int c(f3.d dVar) {
        return e().f34643d;
    }

    @Override // z.u1
    public final int d(f3.d dVar, f3.r rVar) {
        return e().f34642c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u0 e() {
        return (u0) this.f34639b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            return kotlin.jvm.internal.r.a(e(), ((t1) obj).e());
        }
        return false;
    }

    public final void f(u0 u0Var) {
        this.f34639b.setValue(u0Var);
    }

    public final int hashCode() {
        return this.f34638a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34638a);
        sb.append("(left=");
        sb.append(e().f34640a);
        sb.append(", top=");
        sb.append(e().f34641b);
        sb.append(", right=");
        sb.append(e().f34642c);
        sb.append(", bottom=");
        return b.b.a(sb, e().f34643d, ')');
    }
}
