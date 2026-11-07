package h9;

import android.content.Context;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import t0.ff;
import t0.nf;
import t0.of;
import x0.j;

/* loaded from: classes.dex */
public final class g2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f12629c;

    public g2(Context context, x0.n1<Boolean> n1Var, x0.n1<String> n1Var2) {
        this.f12627a = context;
        this.f12628b = n1Var;
        this.f12629c = n1Var2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z.q qVarA = z.o.a(z.b.h(4), d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
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
            ph.v1.j(g.a.f13867f, qVarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            jVar2.L(-1083248687);
            for (final String str : com.basitce.htmltoapk.util.a.f5832a) {
                String strC = f3.q.c(com.basitce.htmltoapk.util.a.f(str), jVar2);
                final x0.n1<String> n1Var = this.f12629c;
                boolean zA = kotlin.jvm.internal.r.a(n1Var.getValue(), str);
                jVar2.L(-1270400472);
                final Context context = this.f12627a;
                boolean zL = jVar2.l(context) | jVar2.K(str);
                final x0.n1<Boolean> n1Var2 = this.f12628b;
                boolean zK = zL | jVar2.K(n1Var2);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: h9.f2
                        @Override // eh.a
                        public final Object invoke() {
                            Context context2 = context;
                            String str2 = str;
                            com.basitce.htmltoapk.util.a.b(context2, str2);
                            n1Var.setValue(str2);
                            n1Var2.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                v3.a(strC, zA, (eh.a) objG, jVar2, 0);
            }
            jVar2.B();
            ff.b(f3.q.c(R.string.settings_launcher_name_desc, jVar2), androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26549l, jVar2, 48, 0, 65528);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
