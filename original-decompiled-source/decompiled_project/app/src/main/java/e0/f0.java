package e0;

import d0.b2;

/* loaded from: classes.dex */
public final class f0 implements d0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f8176a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.o<s> f8177b;

    /* renamed from: c, reason: collision with root package name */
    public final b2 f8178c;

    public f0(b bVar, d0 d0Var, b2 b2Var) {
        this.f8176a = bVar;
        this.f8177b = d0Var;
        this.f8178c = b2Var;
    }

    @Override // d0.g0
    public final int c(Object obj) {
        return this.f8178c.c(obj);
    }

    @Override // d0.g0
    public final Object d(int i10) {
        Object objA = this.f8178c.a(i10);
        return objA == null ? this.f8177b.g(i10) : objA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        return kotlin.jvm.internal.r.a(this.f8177b, ((f0) obj).f8177b);
    }

    @Override // d0.g0
    public final int getItemCount() {
        return this.f8177b.f().f7052b;
    }

    @Override // d0.g0
    public final void h(int i10, Object obj, x0.j jVar) {
        jVar.L(-1201380429);
        d0.b1.a(obj, i10, this.f8176a.A, f1.c.b(1142237095, new e0(this, i10), jVar), jVar, 3072);
        jVar.B();
    }

    public final int hashCode() {
        return this.f8177b.hashCode();
    }
}
