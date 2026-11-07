package i9;

import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import r.e2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.z9;
import x0.a2;
import z.k1;
import z.m1;
import z.n1;

/* loaded from: classes.dex */
public final class p implements eh.q<n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14375c;

    public p(long j10, String str, boolean z10) {
        this.f14373a = str;
        this.f14374b = z10;
        this.f14375c = j10;
    }

    @Override // eh.q
    public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            String str = this.f14373a;
            if (str != null && !mh.x.A(str)) {
                jVar2.L(-573849257);
                ff.b(k3.b.a(str, " — ", f3.q.c(R.string.support_button_action, jVar2)), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65502);
                jVar2.B();
            } else if (this.f14374b) {
                jVar2.L(-573530794);
                m1 m1VarA = k1.a(z.b.f34448e, d.a.f14612k, jVar2, 54);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
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
                v1.j(g.a.f13867f, m1VarA, jVar2);
                v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                v1.j(g.a.f13865d, dVarC, jVar2);
                z9.a(2, 0, 390, 24, this.f14375c, 0L, androidx.compose.foundation.layout.g.n(aVar, 16), jVar2);
                ff.b(e2.b(aVar, 8, jVar2, R.string.support_button_action, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65502);
                jVar2.H();
                jVar2.B();
            } else {
                jVar2.L(-572720795);
                ff.b(f3.q.c(R.string.support_button_action, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65502);
                jVar2.B();
            }
        }
        return pg.f0.f21461a;
    }
}
