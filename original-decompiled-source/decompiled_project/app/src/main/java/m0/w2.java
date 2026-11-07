package m0;

import i0.l4;
import m0.e0;

/* loaded from: classes.dex */
public final class w2 implements i0.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f17541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17542b;

    public w2(x2 x2Var, boolean z10) {
        this.f17541a = x2Var;
        this.f17542b = z10;
    }

    @Override // i0.b3
    public final void a(long j10) {
    }

    @Override // i0.b3
    public final void b() {
        x2 x2Var = this.f17541a;
        x2Var.f17564r.setValue(null);
        x2Var.f17565s.setValue(null);
        x2Var.q(true);
    }

    @Override // i0.b3
    public final void c() {
        x2 x2Var = this.f17541a;
        x2Var.f17564r.setValue(null);
        x2Var.f17565s.setValue(null);
        x2Var.q(true);
    }

    @Override // i0.b3
    public final void d() {
        l4 l4VarD;
        boolean z10 = this.f17542b;
        i0.u1 u1Var = z10 ? i0.u1.f13616b : i0.u1.f13617c;
        x2 x2Var = this.f17541a;
        x2Var.f17564r.setValue(u1Var);
        long jA = h1.a(x2Var.j(z10));
        i0.i2 i2Var = x2Var.f17550d;
        if (i2Var == null || (l4VarD = i2Var.d()) == null) {
            return;
        }
        long jE = l4VarD.e(jA);
        x2Var.f17561o = jE;
        x2Var.f17565s.setValue(new p1.c(jE));
        x2Var.f17563q = 0L;
        x2Var.f17566t = -1;
        i0.i2 i2Var2 = x2Var.f17550d;
        if (i2Var2 != null) {
            i2Var2.f13353q.setValue(Boolean.TRUE);
        }
        x2Var.q(false);
    }

    @Override // i0.b3
    public final void e(long j10) {
        x2 x2Var = this.f17541a;
        long jG = p1.c.g(x2Var.f17563q, j10);
        x2Var.f17563q = jG;
        x2Var.f17565s.setValue(new p1.c(p1.c.g(x2Var.f17561o, jG)));
        y2.c0 c0VarK = x2Var.k();
        p1.c cVarG = x2Var.g();
        kotlin.jvm.internal.r.b(cVarG);
        x2.a(x2Var, c0VarK, cVarG.f21129a, false, this.f17542b, e0.a.f17305d, true);
        x2Var.q(false);
    }

    @Override // i0.b3
    public final void onCancel() {
    }
}
