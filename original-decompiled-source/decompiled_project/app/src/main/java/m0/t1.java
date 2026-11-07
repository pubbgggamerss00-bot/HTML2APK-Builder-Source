package m0;

import m0.e0;

/* loaded from: classes.dex */
public final class t1 implements i0.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f17518b;

    public t1(boolean z10, r1 r1Var) {
        this.f17517a = z10;
        this.f17518b = r1Var;
    }

    @Override // i0.b3
    public final void a(long j10) {
        r1 r1Var = this.f17518b;
        if (r1Var.d() == null) {
            return;
        }
        z zVarE = r1Var.e();
        kotlin.jvm.internal.r.b(zVarE);
        boolean z10 = this.f17517a;
        x xVarB = r1Var.f17469a.f17398c.b((z10 ? zVarE.f17593a : zVarE.f17594b).f17598c);
        if (xVarB == null) {
            y.c.d("SelectionRegistrar should contain the current selection's selectableIds");
            throw new pg.g();
        }
        x xVar = xVarB;
        g2.v vVarI = xVar.i();
        if (vVarI == null) {
            y.c.d("Current selectable should have layout coordinates.");
            throw new pg.g();
        }
        long jK = xVar.k(zVarE, z10);
        if ((9223372034707292159L & jK) == 9205357640488583168L) {
            return;
        }
        r1Var.f17480l.setValue(new p1.c(r1Var.j().L(vVarI, h1.a(jK))));
        r1Var.f17481m.setValue(new p1.c(0L));
    }

    @Override // i0.b3
    public final void b() {
        r1 r1Var = this.f17518b;
        r1Var.n(true);
        r1Var.f17484p.setValue(null);
        r1Var.f17485q.setValue(null);
    }

    @Override // i0.b3
    public final void c() {
        r1 r1Var = this.f17518b;
        r1Var.n(true);
        r1Var.f17484p.setValue(null);
        r1Var.f17485q.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i0.b3
    public final void d() {
        z zVarE;
        g2.v vVarI;
        r1 r1Var = this.f17518b;
        boolean z10 = this.f17517a;
        if ((z10 ? (p1.c) r1Var.f17482n.getValue() : (p1.c) r1Var.f17483o.getValue()) == null || (zVarE = r1Var.e()) == null) {
            return;
        }
        x xVarC = r1Var.c(z10 ? zVarE.f17593a : zVarE.f17594b);
        if (xVarC == null || (vVarI = xVarC.i()) == null) {
            return;
        }
        long jK = xVarC.k(zVarE, z10);
        if ((9223372034707292159L & jK) == 9205357640488583168L) {
            return;
        }
        r1Var.f17485q.setValue(new p1.c(r1Var.j().L(vVarI, h1.a(jK))));
        r1Var.f17484p.setValue(z10 ? i0.u1.f13616b : i0.u1.f13617c);
        r1Var.n(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i0.b3
    public final void e(long j10) {
        r1 r1Var = this.f17518b;
        x0.x1 x1Var = r1Var.f17480l;
        x0.x1 x1Var2 = r1Var.f17481m;
        if (r1Var.d() == null) {
            return;
        }
        x1Var2.setValue(new p1.c(p1.c.g(((p1.c) x1Var2.getValue()).f21129a, j10)));
        long jG = p1.c.g(((p1.c) x1Var.getValue()).f21129a, ((p1.c) x1Var2.getValue()).f21129a);
        if (r1Var.p(jG, ((p1.c) x1Var.getValue()).f21129a, this.f17517a, e0.a.f17305d)) {
            x1Var.setValue(new p1.c(jG));
            x1Var2.setValue(new p1.c(0L));
        }
    }

    @Override // i0.b3
    public final void onCancel() {
        r1 r1Var = this.f17518b;
        r1Var.n(true);
        r1Var.f17484p.setValue(null);
        r1Var.f17485q.setValue(null);
    }
}
