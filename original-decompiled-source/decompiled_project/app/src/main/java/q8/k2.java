package q8;

import androidx.compose.ui.d;
import f9.be;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class k2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22282d;

    public k2(boolean z10, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3) {
        this.f22279a = z10;
        this.f22280b = n1Var;
        this.f22281c = n1Var2;
        this.f22282d = n1Var3;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
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
            ph.v1.j(g.a.f13867f, qVarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            mh.k kVar = n2.f22323a;
            final x0.n1<Boolean> n1Var = this.f22280b;
            boolean zBooleanValue = n1Var.getValue().booleanValue();
            boolean z10 = !this.f22279a;
            jVar2.L(1414358905);
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK || objG == c0321a) {
                objG = new eh.l() { // from class: q8.i2
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        mh.k kVar2 = n2.f22323a;
                        n1Var.setValue(bool);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            n2.b(zBooleanValue, z10, (eh.l) objG, b0.f22111a, jVar2, 3072);
            n2.a(0, jVar2);
            x0.n1<Boolean> n1Var2 = this.f22281c;
            boolean zBooleanValue2 = n1Var2.getValue().booleanValue();
            jVar2.L(1414372668);
            boolean zK2 = jVar2.K(n1Var2);
            Object objG2 = jVar2.g();
            if (zK2 || objG2 == c0321a) {
                objG2 = new be(n1Var2, 1);
                jVar2.C(objG2);
            }
            jVar2.B();
            n2.b(zBooleanValue2, z10, (eh.l) objG2, b0.f22112b, jVar2, 3072);
            n2.a(0, jVar2);
            x0.n1<Boolean> n1Var3 = this.f22282d;
            boolean zBooleanValue3 = n1Var3.getValue().booleanValue();
            jVar2.L(1414402617);
            boolean zK3 = jVar2.K(n1Var3);
            Object objG3 = jVar2.g();
            if (zK3 || objG3 == c0321a) {
                objG3 = new j2(n1Var3, 0);
                jVar2.C(objG3);
            }
            jVar2.B();
            n2.b(zBooleanValue3, z10, (eh.l) objG3, b0.f22113c, jVar2, 3072);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
