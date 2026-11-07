package y8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import p0.p3;
import p0.q3;
import ph.v1;
import q1.y1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import x0.a2;
import x0.n1;
import x0.s3;
import z.b;
import z.m1;

/* loaded from: classes.dex */
public final class d0 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f34090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1.d f34091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f34092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f34094f;

    public d0(long j10, boolean z10, w1.d dVar, String str, n1<Boolean> n1Var, String str2) {
        this.f34089a = j10;
        this.f34090b = z10;
        this.f34091c = dVar;
        this.f34092d = str;
        this.f34093e = n1Var;
        this.f34094f = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0303  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) throws Throwable {
        Throwable th2;
        e0.a aVar;
        int i10;
        s3 s3Var;
        boolean z10;
        z.r Card = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            b.k kVar = z.b.f34446c;
            f.a aVar3 = d.a.f14614m;
            z.q qVarA = z.o.a(kVar, aVar3, jVar2, 0);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar4);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m()) {
                th2 = null;
            } else {
                th2 = null;
                if (!kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                float f10 = 16;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), f10);
                m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14611j, jVar2, 54);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarH, jVar2);
                if (jVar2.t() != null) {
                    u1.d();
                    throw th2;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar4);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, m1VarA, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                androidx.compose.ui.d dVarD2 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, 44), h0.f.a(12));
                long j10 = this.f34089a;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD2, q1.b1.c(0.15f, j10), y1.f21750a);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar2.D();
                a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw th2;
                }
                jVar2.r();
                if (jVar2.m()) {
                    aVar = aVar4;
                    jVar2.w(aVar);
                } else {
                    aVar = aVar4;
                    jVar2.z();
                }
                v1.j(bVar, l0VarD, jVar2);
                v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                v1.j(cVar, dVarC3, jVar2);
                t4.b(this.f34091c, null, androidx.compose.foundation.layout.g.n(aVar2, 24), j10, jVar2, 432, 0);
                jVar2.H();
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA2 = z.o.a(kVar, aVar3, jVar2, 0);
                int iD4 = jVar2.D();
                a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw th2;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, qVarA2, jVar2);
                v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a);
                }
                v1.j(cVar, dVarC4, jVar2);
                s3 s3Var2 = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var2)).f26546i;
                x2.p pVar = x2.p.f32033f;
                s3 s3Var3 = f2.f25858a;
                ff.b(this.f34092d, null, ((e2) jVar2.f(s3Var3)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                x0.j jVar3 = jVar2;
                jVar3.L(1854922972);
                boolean z11 = this.f34090b;
                if (z11) {
                    String strC = f3.q.c(R.string.howto_expand_hint, jVar3);
                    t2.l0 l0Var2 = ((nf) jVar3.f(s3Var2)).f26549l;
                    long j11 = ((e2) jVar3.f(s3Var3)).f25773s;
                    s3Var = s3Var3;
                    z10 = z11;
                    i10 = R.string.howto_expand_hint;
                    ff.b(strC, null, j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar3, 0, 0, 65530);
                    jVar3 = jVar3;
                } else {
                    i10 = R.string.howto_expand_hint;
                    s3Var = s3Var3;
                    z10 = z11;
                }
                jVar3.B();
                jVar3.H();
                jVar3.L(204865530);
                n1<Boolean> n1Var = this.f34093e;
                if (z10) {
                    t4.b(n1Var.getValue().booleanValue() ? p3.a() : q3.a(), f3.q.c(i10, jVar3), null, ((e2) jVar3.f(s3Var)).f25773s, jVar3, 0, 4);
                }
                jVar3.B();
                jVar3.H();
                x0.j jVar4 = jVar3;
                androidx.compose.animation.d.b(z.s.f34624a, n1Var.getValue().booleanValue(), null, null, null, null, f1.c.b(1439737039, new c0(this.f34094f), jVar3), jVar4, 1572870, 30);
                jVar4.H();
            }
            l9.i.a(iD, jVar2, iD, c0128a);
            g.a.c cVar2 = g.a.f13865d;
            v1.j(cVar2, dVarC, jVar2);
            float f102 = 16;
            androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), f102);
            m1 m1VarA2 = z.k1.a(z.b.h(f102), d.a.f14611j, jVar2, 54);
            int iD22 = jVar2.D();
            a2 a2VarY22 = jVar2.y();
            androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarH2, jVar2);
            if (jVar2.t() != null) {
            }
        }
        return pg.f0.f21461a;
    }
}
