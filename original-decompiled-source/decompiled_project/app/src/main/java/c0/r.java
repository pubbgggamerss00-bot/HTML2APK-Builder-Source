package c0;

import d0.b2;

/* loaded from: classes.dex */
public final class r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f4475a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4476b;

    /* renamed from: c, reason: collision with root package name */
    public final b2 f4477c;

    public r(w0 w0Var, j jVar, b2 b2Var) {
        this.f4475a = w0Var;
        this.f4476b = jVar;
        this.f4477c = b2Var;
    }

    @Override // c0.p
    public final d0.j0 a() {
        return this.f4477c;
    }

    @Override // c0.p
    public final p.x b() {
        this.f4476b.getClass();
        return p.h.f20635a;
    }

    @Override // d0.g0
    public final int c(Object obj) {
        return this.f4477c.c(obj);
    }

    @Override // d0.g0
    public final Object d(int i10) {
        Object objA = this.f4477c.a(i10);
        return objA == null ? this.f4476b.g(i10) : objA;
    }

    @Override // d0.g0
    public final Object e(int i10) {
        d0.g gVarB = this.f4476b.f().b(i10);
        return gVarB.f7133c.getType().invoke(Integer.valueOf(i10 - gVarB.f7131a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return kotlin.jvm.internal.r.a(this.f4476b, ((r) obj).f4476b);
    }

    @Override // c0.p
    public final v0 g() {
        return this.f4476b.f4401a;
    }

    @Override // d0.g0
    public final int getItemCount() {
        return this.f4476b.f().f7052b;
    }

    @Override // d0.g0
    public final void h(int i10, Object obj, x0.j jVar) {
        jVar.L(1493551140);
        d0.b1.a(obj, i10, this.f4475a.f4521q, f1.c.b(726189336, new q(this, i10), jVar), jVar, 3072);
        jVar.B();
    }

    public final int hashCode() {
        return this.f4476b.hashCode();
    }
}
