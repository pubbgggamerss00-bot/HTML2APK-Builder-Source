package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class y9 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f11020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f11022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f11024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f11025h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f11026j;

    /* JADX WARN: Multi-variable type inference failed */
    public y9(boolean z10, String str, eh.l<? super String, pg.f0> lVar, String str2, eh.l<? super String, pg.f0> lVar2, String str3, eh.l<? super String, pg.f0> lVar3, String str4, eh.l<? super String, pg.f0> lVar4) {
        this.f11018a = z10;
        this.f11019b = str;
        this.f11020c = lVar;
        this.f11021d = str2;
        this.f11022e = lVar2;
        this.f11023f = str3;
        this.f11024g = lVar3;
        this.f11025h = str4;
        this.f11026j = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        z.q qVarA = z.o.a(z.b.h(14), d.a.f14614m, jVar2, 6);
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
        t0.ff.b(f3.q.c(R.string.editor_color_mode, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26546i, jVar2, 0, 0, 65534);
        x0.j jVar3 = jVar2;
        z.m1 m1VarA = z.k1.a(z.b.h(8), d.a.f14611j, jVar3, 6);
        int iD2 = jVar3.D();
        x0.a2 a2VarY2 = jVar3.y();
        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, jVar3);
        if (jVar3.t() == null) {
            c9.u1.d();
            throw null;
        }
        jVar3.r();
        if (jVar3.m()) {
            jVar3.w(aVar2);
        } else {
            jVar3.z();
        }
        ph.v1.j(bVar, m1VarA, jVar3);
        ph.v1.j(dVar, a2VarY2, jVar3);
        if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
            l9.i.a(iD2, jVar3, iD2, c0128a);
        }
        ph.v1.j(cVar, dVarC2, jVar3);
        jVar3.L(427368586);
        for (pg.n nVar : qg.p.j(new pg.n("auto", Integer.valueOf(R.string.editor_color_mode_auto)), new pg.n("dark", Integer.valueOf(R.string.editor_color_mode_dark)), new pg.n("light", Integer.valueOf(R.string.editor_color_mode_light)))) {
            final String str = (String) nVar.f21469a;
            int iIntValue = ((Number) nVar.f21470b).intValue();
            boolean zA = kotlin.jvm.internal.r.a(this.f11023f, str);
            jVar3.L(-623013113);
            final eh.l<String, pg.f0> lVar = this.f11024g;
            boolean zK = jVar3.K(lVar) | jVar3.K(str);
            Object objG = jVar3.g();
            if (zK || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: f9.v9
                    @Override // eh.a
                    public final Object invoke() {
                        lVar.invoke(str);
                        return pg.f0.f21461a;
                    }
                };
                jVar3.C(objG);
            }
            jVar3.B();
            x0.j jVar4 = jVar3;
            t0.d2.b(zA, (eh.a) objG, f1.c.b(633956003, new w9(iIntValue), jVar3), null, false, null, null, null, null, null, jVar4, 384, 4088);
            jVar3 = jVar4;
        }
        jVar3.B();
        jVar3.H();
        x0.j jVar5 = jVar3;
        androidx.compose.animation.d.b(z.s.f34624a, this.f11018a, null, null, null, null, f1.c.b(-1751087791, new x9(this.f11026j, this.f11025h), jVar3), jVar5, 1572870, 30);
        b8.f(f3.q.c(R.string.editor_shared_bar_color, jVar5), f3.q.c(R.string.editor_shared_bar_color_hint, jVar5), this.f11019b, qg.p.j("#000000", "#121212", "#FFFFFF", "#2196F3", "#34495E", "#00E5CC"), this.f11020c, jVar5, 3072);
        t0.v2.a(null, CropImageView.DEFAULT_ASPECT_RATIO, ((t0.e2) jVar5.f(t0.f2.f25858a)).B, jVar5, 0, 3);
        b8.f(f3.q.c(R.string.editor_label_web_bg_color, jVar5), f3.q.c(R.string.editor_desc_web_bg_color, jVar5), this.f11021d, qg.p.j("#FFFFFF", "#F5F5F5", "#121212", "#000000"), this.f11022e, jVar5, 3072);
        jVar5.H();
        return pg.f0.f21461a;
    }
}
