package d9;

import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import p0.n2;
import pg.f0;
import ph.v1;
import q1.b1;
import q1.i2;
import t0.f2;
import t0.v2;
import w1.d;
import x0.a2;
import x0.e2;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class t implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g8.u f7653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f7654b;

    public t(g8.u uVar, n1<Boolean> n1Var) {
        this.f7653a = uVar;
        this.f7654b = n1Var;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            v1.j(g.a.f13867f, qVarA, jVar2);
            v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, jVar2);
            w1.d dVarB = n0.f.f18294a;
            if (dVarB == null) {
                d.a aVar3 = new d.a("AutoMirrored.Filled.Logout", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i10 = w1.m.f31210a;
                i2 i2Var = new i2(b1.f21648b);
                w1.e eVarA = n0.b.a(17.0f, 7.0f, -1.41f, 1.41f);
                eVarA.f(18.17f, 11.0f);
                eVarA.d(8.0f);
                eVarA.l(2.0f);
                eVarA.e(10.17f);
                eVarA.g(-2.58f, 2.58f);
                eVarA.f(17.0f, 17.0f);
                eVarA.g(5.0f, -5.0f);
                eVarA.a();
                eVarA.h(4.0f, 5.0f);
                eVarA.e(8.0f);
                eVarA.k(3.0f);
                eVarA.d(4.0f);
                eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
                eVarA.l(14.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                eVarA.e(8.0f);
                eVarA.l(-2.0f);
                eVarA.d(4.0f);
                eVarA.k(5.0f);
                eVarA.a();
                d.a.a(aVar3, eVarA.f31100a, 0, i2Var);
                dVarB = aVar3.b();
                n0.f.f18294a = dVarB;
            }
            String strC = f3.q.c(R.string.profile_sign_out, jVar2);
            jVar2.L(1678481980);
            g8.u uVar = this.f7653a;
            boolean zL = jVar2.l(uVar);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zL || objG == obj) {
                objG = new r(uVar, 0);
                jVar2.C(objG);
            }
            jVar2.B();
            m.d(dVarB, strC, null, 0L, (eh.a) objG, jVar2, 384, 8);
            androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(aVar, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            e2 e2Var = f2.f25858a;
            v2.a(dVarJ2, CropImageView.DEFAULT_ASPECT_RATIO, b1.c(0.4f, ((t0.e2) jVar2.f(e2Var)).B), jVar2, 6, 2);
            w1.d dVarA = n2.a();
            String strC2 = f3.q.c(R.string.profile_delete_account, jVar2);
            String strC3 = f3.q.c(R.string.profile_delete_account_summary, jVar2);
            long j10 = ((t0.e2) jVar2.f(e2Var)).f25777w;
            jVar2.L(1678504150);
            Object obj2 = this.f7654b;
            boolean zK = jVar2.K(obj2);
            Object objG2 = jVar2.g();
            if (zK || objG2 == obj) {
                objG2 = new s(obj2, 0);
                jVar2.C(objG2);
            }
            jVar2.B();
            m.d(dVarA, strC2, strC3, j10, (eh.a) objG2, jVar2, 0, 0);
            jVar2.H();
        }
        return f0.f21461a;
    }
}
