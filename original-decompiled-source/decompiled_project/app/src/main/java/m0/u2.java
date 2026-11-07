package m0;

import i0.l4;

/* loaded from: classes.dex */
public final class u2 implements i0.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f17534a;

    public u2(x2 x2Var) {
        this.f17534a = x2Var;
    }

    @Override // i0.b3
    public final void a(long j10) {
        l4 l4VarD;
        x2 x2Var = this.f17534a;
        long jA = h1.a(x2Var.j(true));
        i0.i2 i2Var = x2Var.f17550d;
        if (i2Var == null || (l4VarD = i2Var.d()) == null) {
            return;
        }
        long jE = l4VarD.e(jA);
        x2Var.f17561o = jE;
        x2Var.f17565s.setValue(new p1.c(jE));
        x2Var.f17563q = 0L;
        x2Var.f17564r.setValue(i0.u1.f13615a);
        x2Var.q(false);
    }

    @Override // i0.b3
    public final void b() {
        x2 x2Var = this.f17534a;
        x2Var.f17564r.setValue(null);
        x2Var.f17565s.setValue(null);
    }

    @Override // i0.b3
    public final void c() {
        x2 x2Var = this.f17534a;
        x2Var.f17564r.setValue(null);
        x2Var.f17565s.setValue(null);
    }

    @Override // i0.b3
    public final void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i0.b3
    public final void e(long j10) {
        l4 l4VarD;
        y1.a aVar;
        x2 x2Var = this.f17534a;
        x2Var.f17563q = p1.c.g(x2Var.f17563q, j10);
        i0.i2 i2Var = x2Var.f17550d;
        if (i2Var == null || (l4VarD = i2Var.d()) == null) {
            return;
        }
        x2Var.f17565s.setValue(new p1.c(p1.c.g(x2Var.f17561o, x2Var.f17563q)));
        y2.v vVar = x2Var.f17548b;
        p1.c cVarG = x2Var.g();
        kotlin.jvm.internal.r.b(cVarG);
        int iA = vVar.a(l4VarD.b(cVarG.f21129a, true));
        long jA = t2.k0.a(iA, iA);
        if (t2.j0.a(jA, x2Var.k().f33683b)) {
            return;
        }
        i0.i2 i2Var2 = x2Var.f17550d;
        if ((i2Var2 == null || ((Boolean) i2Var2.f13353q.getValue()).booleanValue()) && (aVar = x2Var.f17557k) != null) {
            aVar.a(9);
        }
        x2Var.f17549c.invoke(x2.c(x2Var.k().f33682a, jA));
    }

    @Override // i0.b3
    public final void onCancel() {
    }
}
