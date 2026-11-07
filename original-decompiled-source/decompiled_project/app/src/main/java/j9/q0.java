package j9;

import android.content.Context;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j9.x1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import x0.j;

/* loaded from: classes.dex */
public final class q0 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1.a f15499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f15500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f15501c;

    public q0(x1.a aVar, Context context, x0.n1<Boolean> n1Var) {
        this.f15499a = aVar;
        this.f15500b = context;
        this.f15501c = n1Var;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
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
        g.a.b bVar = g.a.f13867f;
        ph.v1.j(bVar, qVarA, jVar2);
        g.a.d dVar = g.a.f13866e;
        ph.v1.j(dVar, a2VarY, jVar2);
        g.a.C0128a c0128a = g.a.f13868g;
        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
            l9.i.a(iD, jVar2, iD, c0128a);
        }
        g.a.c cVar = g.a.f13865d;
        ph.v1.j(cVar, dVarC, jVar2);
        d0.f(f3.q.c(R.string.template_detail_how_to_call, jVar2), jVar2, 0);
        float f10 = 8;
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
        x1.a aVar3 = this.f15499a;
        String str = aVar3.f15642g;
        jVar2.L(-1648917560);
        Context context = this.f15500b;
        boolean zL = jVar2.l(context) | jVar2.l(aVar3);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (zL || objG == c0321a) {
            objG = new androidx.credentials.playservices.m(1, context, aVar3);
            jVar2.C(objG);
        }
        jVar2.B();
        d0.c(str, (eh.a) objG, jVar2, 0);
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 24), jVar2);
        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
        z.m1 m1VarA = z.k1.a(z.b.f34450g, d.a.f14612k, jVar2, 54);
        int iD2 = jVar2.D();
        x0.a2 a2VarY2 = jVar2.y();
        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar2);
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
        ph.v1.j(dVar, a2VarY2, jVar2);
        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
            l9.i.a(iD2, jVar2, iD2, c0128a);
        }
        ph.v1.j(cVar, dVarC2, jVar2);
        d0.f(f3.q.c(R.string.template_detail_ai_prompt, jVar2), jVar2, 0);
        jVar2.L(1864949589);
        Object objG2 = jVar2.g();
        final x0.n1<Boolean> n1Var = this.f15501c;
        if (objG2 == c0321a) {
            objG2 = new eh.a() { // from class: j9.o0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // eh.a
                public final Object invoke() {
                    n1Var.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG2);
        }
        jVar2.B();
        t0.x0.d((eh.a) objG2, null, false, null, null, null, f1.c.b(-548505482, new p0(n1Var), jVar2), jVar2, 805306374, 510);
        jVar2.H();
        jVar2.L(-1648889439);
        if (n1Var.getValue().booleanValue()) {
            ff.b(pd.d.a(aVar, f10, jVar2, R.string.template_detail_ai_prompt_description, jVar2), androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, 7), ((e2) jVar2.f(f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26549l, jVar2, 48, 0, 65528);
            jVar2 = jVar2;
            String str2 = aVar3.f15643h;
            jVar2.L(-1648868795);
            boolean zL2 = jVar2.l(context) | jVar2.l(aVar3);
            Object objG3 = jVar2.g();
            if (zL2 || objG3 == c0321a) {
                objG3 = new androidx.credentials.playservices.o(2, context, aVar3);
                jVar2.C(objG3);
            }
            jVar2.B();
            d0.c(str2, (eh.a) objG3, jVar2, 0);
        }
        jVar2.B();
        jVar2.H();
        return pg.f0.f21461a;
    }
}
