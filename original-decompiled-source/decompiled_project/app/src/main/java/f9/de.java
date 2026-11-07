package f9;

import android.graphics.Color;
import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class de implements eh.q<z.o0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<String> f9332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f9334c;

    public de(eh.l lVar, String str, List list) {
        this.f9332a = list;
        this.f9333b = str;
        this.f9334c = lVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.o0 o0Var, x0.j jVar, Integer num) {
        long jB;
        long j10;
        z.o0 FlowRow = o0Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FlowRow, "$this$FlowRow");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            for (final String str : this.f9332a) {
                try {
                    jB = c2.n0.b(Color.parseColor(str));
                } catch (Exception unused) {
                    jB = q1.b1.f21648b;
                }
                boolean zJ = mh.t.j(this.f9333b, str, true);
                d.a aVar = d.a.f1143b;
                float f10 = 8;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(aVar, 36), h0.f.a(f10)), jB, q1.y1.f21750a);
                float f11 = zJ ? (float) 2.5d : 1;
                if (zJ) {
                    jVar2.L(1252272600);
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25751a;
                } else {
                    jVar2.L(1252273855);
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).B;
                }
                jVar2.B();
                androidx.compose.ui.d dVarA = t.o.a(dVarB, f11, j10, h0.f.a(f10));
                jVar2.L(1252279049);
                final eh.l<String, pg.f0> lVar = this.f9334c;
                boolean zK = jVar2.K(lVar) | jVar2.K(str);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: f9.ce
                        @Override // eh.a
                        public final Object invoke() {
                            lVar.invoke(str);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                androidx.compose.ui.d dVarC = androidx.compose.foundation.b.c(dVarA, false, null, null, (eh.a) objG, 7);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarC, jVar2);
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
                ph.v1.j(g.a.f13867f, l0VarD, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC2, jVar2);
                jVar2.L(341829500);
                if (zJ) {
                    w1.d dVarA2 = p0.n1.a();
                    long j11 = q1.b1.f21650d;
                    if (q1.b1.d(jB, j11) || kotlin.jvm.internal.r.a(str, "#FFFFFF") || kotlin.jvm.internal.r.a(str, "#F3F4F6")) {
                        j11 = q1.b1.f21648b;
                    }
                    t0.t4.b(dVarA2, null, androidx.compose.foundation.layout.g.n(aVar, 18), j11, jVar2, 432, 0);
                }
                jVar2.B();
                jVar2.H();
            }
        }
        return pg.f0.f21461a;
    }
}
