package x8;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import t0.mf;
import x0.j;

/* loaded from: classes.dex */
public final class e5 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f32554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j6 f32556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f32557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f32558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f32559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f32560g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32561h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c.k<String[], Uri> f32562j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f32563k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32564l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.n1<ProjectEntity> f32565m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f32566n;

    public e5(boolean z10, x0.n1 n1Var, j6 j6Var, p5.x xVar, x0.n1 n1Var2, x0.n1 n1Var3, x0.n1 n1Var4, x0.n1 n1Var5, c.k kVar, Context context, x0.n1 n1Var6, x0.n1 n1Var7, x0.n1 n1Var8) {
        this.f32554a = z10;
        this.f32555b = n1Var;
        this.f32556c = j6Var;
        this.f32557d = xVar;
        this.f32558e = n1Var2;
        this.f32559f = n1Var3;
        this.f32560g = n1Var4;
        this.f32561h = n1Var5;
        this.f32562j = kVar;
        this.f32563k = context;
        this.f32564l = n1Var6;
        this.f32565m = n1Var7;
        this.f32566n = n1Var8;
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
            f1.b bVarB = f1.c.b(171546564, new t4(), jVar2);
            boolean z10 = this.f32554a;
            x0.n1<Boolean> n1Var = this.f32555b;
            p5.x xVar = this.f32557d;
            x0.r3<Boolean> r3Var = this.f32558e;
            x0.r3<Boolean> r3Var2 = this.f32559f;
            x0.r3<Boolean> r3Var3 = this.f32560g;
            final j6 j6Var = this.f32556c;
            f1.b bVarB2 = f1.c.b(132737017, new d5(z10, n1Var, xVar, r3Var, r3Var2, r3Var3, j6Var, this.f32561h, this.f32562j, this.f32563k, this.f32564l, this.f32565m), jVar2);
            float f10 = mf.f26477a;
            t0.g0.b(bVarB, null, null, bVarB2, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 3078, 182);
            jVar2.L(1094521814);
            if (z10 && !r3Var.getValue().booleanValue()) {
                jVar2.L(1094525722);
                boolean zK = jVar2.K(n1Var) | jVar2.l(j6Var);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                int i10 = 1;
                if (zK || objG == obj) {
                    objG = new j4.c(i10, j6Var, n1Var);
                    jVar2.C(objG);
                }
                eh.a aVar2 = (eh.a) objG;
                jVar2.B();
                boolean z11 = !this.f32566n.getValue().booleanValue();
                jVar2.L(1094536437);
                boolean zL = jVar2.l(j6Var);
                Object objG2 = jVar2.g();
                if (zL || objG2 == obj) {
                    objG2 = new eh.a() { // from class: x8.s4
                        @Override // eh.a
                        public final Object invoke() {
                            j6 j6Var2 = j6Var;
                            ph.h.c(androidx.lifecycle.x0.a(j6Var2), null, null, new i7(j6Var2, null), 3);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                g5.C(aVar2, z11, (eh.a) objG2, null, jVar2, 0);
            }
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
