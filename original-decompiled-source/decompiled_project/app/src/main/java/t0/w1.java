package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f27274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.f1 f27275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27276c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b f27278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(float f10, z.f1 f1Var, eh.p pVar, long j10, f1.b bVar, long j11) {
        super(2);
        this.f27274a = f10;
        this.f27275b = f1Var;
        this.f27276c = pVar;
        this.f27277d = j10;
        this.f27278e = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            float f10 = this.f27274a;
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.b(aVar, CropImageView.DEFAULT_ASPECT_RATIO, f10, 1), this.f27275b);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, v1.f27206a, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            jVar2.L(-1293169671);
            eh.p<x0.j, Integer, pg.f0> pVar = this.f27276c;
            if (pVar != null) {
                androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(aVar, "leadingIcon");
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, l0VarD, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                if (pVar != null) {
                    jVar2.L(832788565);
                    x0.y.a(com.android.aapt.a.b(this.f27277d, p2.f26666a), pVar, jVar2, 8);
                    jVar2.B();
                } else {
                    jVar2.L(833040347);
                    jVar2.B();
                }
                jVar2.H();
            }
            jVar2.B();
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.ui.layout.a.b(aVar, AnnotatedPrivateKey.LABEL), d2.f25637a, 0);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 54);
            int iD3 = jVar2.D();
            x0.a2 a2VarY3 = jVar2.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarI, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, m1VarA, jVar2);
            ph.v1.j(dVar, a2VarY3, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar2, iD3, c0128a);
            }
            ph.v1.j(cVar, dVarC3, jVar2);
            this.f27278e.invoke(jVar2, 0);
            jVar2.H();
            jVar2.L(-1293135324);
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
