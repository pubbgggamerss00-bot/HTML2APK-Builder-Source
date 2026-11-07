package i0;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f13717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<t2.h0, pg.f0> f13720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.v f13722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f3.d f13723h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f13724j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(m0.x2 x2Var, i2 i2Var, boolean z10, boolean z11, eh.l<? super t2.h0, pg.f0> lVar, y2.c0 c0Var, y2.v vVar, f3.d dVar, int i10) {
        super(2);
        this.f13716a = x2Var;
        this.f13717b = i2Var;
        this.f13718c = z10;
        this.f13719d = z11;
        this.f13720e = lVar;
        this.f13721f = c0Var;
        this.f13722g = vVar;
        this.f13723h = dVar;
        this.f13724j = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    @Override // eh.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        boolean z10 = true;
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            f3.d dVar = this.f13723h;
            int i10 = this.f13724j;
            i2 i2Var = this.f13717b;
            y0 y0Var = new y0(i2Var, this.f13720e, this.f13721f, this.f13722g, dVar, i10);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, y0Var, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            jVar2.H();
            v1 v1VarA = i2Var.a();
            v1 v1Var = v1.f13646a;
            boolean z11 = this.f13718c;
            if (v1VarA == v1Var || i2Var.c() == null) {
                z10 = false;
                m0.x2 x2Var = this.f13716a;
                q1.d(x2Var, z10, jVar2, 0);
                if (i2Var.a() == v1.f13648c || this.f13719d || !z11) {
                    jVar2.L(-7090978);
                    jVar2.B();
                } else {
                    jVar2.L(-7167858);
                    q1.c(x2Var, jVar2, 0);
                    jVar2.B();
                }
            } else {
                g2.v vVarC = i2Var.c();
                kotlin.jvm.internal.r.b(vVarC);
                if (!vVarC.m() || !z11) {
                }
                m0.x2 x2Var2 = this.f13716a;
                q1.d(x2Var2, z10, jVar2, 0);
                if (i2Var.a() == v1.f13648c) {
                    jVar2.L(-7090978);
                    jVar2.B();
                }
            }
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
