package i2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r2 implements x0.d<e0> {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f14011a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<e0> f14012b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public e0 f14013c;

    public r2(e0 e0Var) {
        this.f14011a = e0Var;
        this.f14013c = e0Var;
    }

    @Override // x0.d
    public final void a(int i10, e0 e0Var) {
        this.f14013c.L(i10, e0Var);
    }

    @Override // x0.d
    public final void b(e0 e0Var) {
        this.f14012b.add(this.f14013c);
        this.f14013c = e0Var;
    }

    @Override // x0.d
    public final void c() {
        this.f14013c.j();
    }

    @Override // x0.d
    public final void d(int i10, int i11, int i12) {
        this.f14013c.T(i10, i11, i12);
    }

    @Override // x0.d
    public final void e(int i10, int i11) {
        this.f14013c.a0(i10, i11);
    }

    @Override // x0.d
    public final void f() {
        this.f14013c = this.f14012b.remove(r0.size() - 1);
    }

    @Override // x0.d
    public final /* bridge */ /* synthetic */ void g(int i10, e0 e0Var) {
    }

    @Override // x0.d
    public final e0 h() {
        return this.f14013c;
    }

    public final void i() {
        this.f14012b.clear();
        this.f14013c = this.f14011a;
        this.f14011a.Z();
    }

    public final void j() {
        v1 v1Var = this.f14011a.f13822p;
        if (v1Var != null) {
            v1Var.u();
        }
    }
}
