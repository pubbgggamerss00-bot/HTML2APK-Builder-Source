package b0;

import d0.b1;
import d0.b2;

/* loaded from: classes.dex */
public final class q implements o {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f3416a;

    /* renamed from: b, reason: collision with root package name */
    public final m f3417b;

    /* renamed from: c, reason: collision with root package name */
    public final f f3418c;

    /* renamed from: d, reason: collision with root package name */
    public final b2 f3419d;

    public q(m0 m0Var, m mVar, f fVar, b2 b2Var) {
        this.f3416a = m0Var;
        this.f3417b = mVar;
        this.f3418c = fVar;
        this.f3419d = b2Var;
    }

    @Override // b0.o
    public final d0.j0 a() {
        return this.f3419d;
    }

    @Override // b0.o
    public final p.x b() {
        this.f3417b.getClass();
        return p.h.f20635a;
    }

    @Override // d0.g0
    public final int c(Object obj) {
        return this.f3419d.c(obj);
    }

    @Override // d0.g0
    public final Object d(int i10) {
        Object objA = this.f3419d.a(i10);
        return objA == null ? this.f3417b.g(i10) : objA;
    }

    @Override // d0.g0
    public final Object e(int i10) {
        d0.g gVarB = this.f3417b.f().b(i10);
        return gVarB.f7133c.getType().invoke(Integer.valueOf(i10 - gVarB.f7131a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return kotlin.jvm.internal.r.a(this.f3417b, ((q) obj).f3417b);
    }

    @Override // b0.o
    public final f f() {
        return this.f3418c;
    }

    @Override // d0.g0
    public final int getItemCount() {
        return this.f3417b.f().f7052b;
    }

    @Override // d0.g0
    public final void h(int i10, Object obj, x0.j jVar) {
        jVar.L(-462424778);
        b1.a(obj, i10, this.f3416a.f3398q, f1.c.b(-824725566, new p(this, i10), jVar), jVar, 3072);
        jVar.B();
    }

    public final int hashCode() {
        return this.f3417b.hashCode();
    }
}
