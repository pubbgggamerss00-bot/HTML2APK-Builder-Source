package i0;

import j2.p5;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.s implements eh.l<g2.v, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5 f13374c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.v f13377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(i2 i2Var, boolean z10, p5 p5Var, m0.x2 x2Var, y2.c0 c0Var, y2.v vVar) {
        super(1);
        this.f13372a = i2Var;
        this.f13373b = z10;
        this.f13374c = p5Var;
        this.f13375d = x2Var;
        this.f13376e = c0Var;
        this.f13377f = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final pg.f0 invoke(g2.v vVar) {
        y2.n0 n0Var;
        g2.v vVar2;
        g2.v vVar3;
        g2.v vVar4 = vVar;
        i2 i2Var = this.f13372a;
        x0.x1 x1Var = i2Var.f13351o;
        i2Var.f13344h = vVar4;
        l4 l4VarD = i2Var.d();
        if (l4VarD != null) {
            l4VarD.f13419b = vVar4;
        }
        if (this.f13373b) {
            v1 v1VarA = i2Var.a();
            v1 v1Var = v1.f13647b;
            y2.c0 c0Var = this.f13376e;
            m0.x2 x2Var = this.f13375d;
            if (v1VarA == v1Var) {
                if (((Boolean) i2Var.f13348l.getValue()).booleanValue() && this.f13374c.a()) {
                    x2Var.p();
                } else {
                    x2Var.l();
                }
                i2Var.f13349m.setValue(Boolean.valueOf(m0.d3.b(x2Var, true)));
                i2Var.f13350n.setValue(Boolean.valueOf(m0.d3.b(x2Var, false)));
                x1Var.setValue(Boolean.valueOf(t2.j0.b(c0Var.f33683b)));
            } else if (i2Var.a() == v1.f13648c) {
                x1Var.setValue(Boolean.valueOf(m0.d3.b(x2Var, true)));
            }
            q1.g(i2Var, c0Var, this.f13377f);
            l4 l4VarD2 = i2Var.d();
            if (l4VarD2 != null && (n0Var = i2Var.f13341e) != null && i2Var.b() && (vVar2 = l4VarD2.f13419b) != null && vVar2.m() && (vVar3 = l4VarD2.f13420c) != null) {
                t2.h0 h0Var = l4VarD2.f13418a;
                h3 h3Var = new h3(vVar2, 0);
                p1.e eVarC = m0.a2.c(vVar2);
                p1.e eVarN = vVar2.N(vVar3, false);
                if (kotlin.jvm.internal.r.a(n0Var.f33750a.f33705b.get(), n0Var)) {
                    n0Var.f33751b.d(this.f13376e, this.f13377f, h0Var, h3Var, eVarC, eVarN);
                }
            }
        }
        return pg.f0.f21461a;
    }
}
