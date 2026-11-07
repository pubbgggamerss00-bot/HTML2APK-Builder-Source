package y8;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import s8.e2;
import t0.i4;
import x0.a2;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class s0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f34222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.k<String, Uri> f34223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f34224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p5.x f34225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f34226f;

    public s0(n1 n1Var, n1 n1Var2, c.k kVar, Context context, p5.x xVar, boolean z10) {
        this.f34221a = n1Var;
        this.f34222b = n1Var2;
        this.f34223c = kVar;
        this.f34224d = context;
        this.f34225e = xVar;
        this.f34226f = z10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            final n1<Boolean> n1Var = this.f34221a;
            if (!n1Var.getValue().booleanValue()) {
                androidx.compose.ui.d dVarF = d0.h.f(d.a.f1143b);
                z.q qVarA = z.o.a(z.b.h(12), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarF, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
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
                jVar2.L(574610679);
                final n1 n1Var2 = this.f34222b;
                boolean zK = jVar2.K(n1Var2);
                final c.k<String, Uri> kVar = this.f34223c;
                boolean zL = zK | jVar2.l(kVar);
                final Context context = this.f34224d;
                boolean zL2 = zL | jVar2.l(context);
                final p5.x xVar = this.f34225e;
                boolean zL3 = zL2 | jVar2.l(xVar);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zL3 || objG == obj) {
                    objG = new eh.a() { // from class: y8.q0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            if (((Boolean) n1Var2.getValue()).booleanValue()) {
                                hf.a.a(kVar, context, "*/*", R.string.launch_no_app);
                            } else {
                                p5.x.c(e2.r.f24648c.f24627a, xVar);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                i4.a((eh.a) objG, null, null, 0L, 0L, null, a.f34003c, jVar2, 12582912);
                jVar2.L(574624414);
                final boolean z10 = this.f34226f;
                boolean zC = jVar2.c(z10) | jVar2.l(xVar);
                Object objG2 = jVar2.g();
                if (zC || objG2 == obj) {
                    objG2 = new eh.a() { // from class: y8.r0
                        @Override // eh.a
                        public final Object invoke() {
                            if (z10) {
                                n1Var.setValue(Boolean.TRUE);
                            } else {
                                p5.x.c(e2.r.f24648c.f24627a, xVar);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                i4.a((eh.a) objG2, null, null, 0L, 0L, null, a.f34004d, jVar2, 12582912);
                jVar2.H();
            }
        }
        return pg.f0.f21461a;
    }
}
