package m0;

import m0.z;

/* loaded from: classes.dex */
public final class r2 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17497b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17498c;

    /* renamed from: d, reason: collision with root package name */
    public final z f17499d;

    /* renamed from: e, reason: collision with root package name */
    public final y f17500e;

    public r2(boolean z10, int i10, int i11, z zVar, y yVar) {
        this.f17496a = z10;
        this.f17497b = i10;
        this.f17498c = i11;
        this.f17499d = zVar;
        this.f17500e = yVar;
    }

    @Override // m0.i1
    public final boolean a() {
        return this.f17496a;
    }

    @Override // m0.i1
    public final y b() {
        return this.f17500e;
    }

    @Override // m0.i1
    public final z c() {
        return this.f17499d;
    }

    @Override // m0.i1
    public final void d(eh.l<? super y, pg.f0> lVar) {
    }

    @Override // m0.i1
    public final y e() {
        return this.f17500e;
    }

    @Override // m0.i1
    public final boolean f(i1 i1Var) {
        if (this.f17499d == null || i1Var == null || !(i1Var instanceof r2) || this.f17497b != i1Var.l() || this.f17498c != i1Var.g() || this.f17496a != i1Var.a()) {
            return true;
        }
        y yVar = ((r2) i1Var).f17500e;
        y yVar2 = this.f17500e;
        return (yVar2.f17574a == yVar.f17574a && yVar2.f17576c == yVar.f17576c && yVar2.f17577d == yVar.f17577d) ? false : true;
    }

    @Override // m0.i1
    public final int g() {
        return this.f17498c;
    }

    @Override // m0.i1
    public final int getSize() {
        return 1;
    }

    @Override // m0.i1
    public final y h() {
        return this.f17500e;
    }

    @Override // m0.i1
    public final n i() {
        int i10 = this.f17497b;
        int i11 = this.f17498c;
        return i10 < i11 ? n.f17424b : i10 > i11 ? n.f17423a : this.f17500e.b();
    }

    @Override // m0.i1
    public final p.c0 j(z zVar) {
        boolean z10 = zVar.f17595c;
        z.a aVar = zVar.f17594b;
        z.a aVar2 = zVar.f17593a;
        if ((!z10 && aVar2.f17597b > aVar.f17597b) || (z10 && aVar2.f17597b <= aVar.f17597b)) {
            zVar = z.a(zVar, null, null, !z10, 3);
        }
        long j10 = this.f17500e.f17574a;
        p.c0 c0Var = p.o.f20698a;
        p.c0 c0Var2 = new p.c0();
        c0Var2.h(zVar, j10);
        return c0Var2;
    }

    @Override // m0.i1
    public final y k() {
        return this.f17500e;
    }

    @Override // m0.i1
    public final int l() {
        return this.f17497b;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f17496a + ", crossed=" + i() + ", info=\n\t" + this.f17500e + ')';
    }
}
