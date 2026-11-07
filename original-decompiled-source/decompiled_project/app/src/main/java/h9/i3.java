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

/* loaded from: classes.dex */
public final class i3 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f12653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f12654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f12655c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b f12656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p5.x f12657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f12658f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f12659g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12660h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12661j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b4 f12662k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12663l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f12664m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.r3<k9.a> f12665n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f12666p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f12667q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Long> f12668r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12669s;

    public i3(z.f1 f1Var, float f10, f1.b bVar, f1.b bVar2, p5.x xVar, x0.r3 r3Var, Context context, x0.n1 n1Var, x0.n1 n1Var2, b4 b4Var, x0.n1 n1Var3, x0.r3 r3Var2, x0.r3 r3Var3, x0.r3 r3Var4, x0.n1 n1Var4, x0.r3 r3Var5, x0.n1 n1Var5) {
        this.f12653a = f1Var;
        this.f12654b = f10;
        this.f12655c = bVar;
        this.f12656d = bVar2;
        this.f12657e = xVar;
        this.f12658f = r3Var;
        this.f12659g = context;
        this.f12660h = n1Var;
        this.f12661j = n1Var2;
        this.f12662k = b4Var;
        this.f12663l = n1Var3;
        this.f12664m = r3Var2;
        this.f12665n = r3Var3;
        this.f12666p = r3Var4;
        this.f12667q = n1Var4;
        this.f12668r = r3Var5;
        this.f12669s = n1Var5;
    }

    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        z.i BackgroundBox = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(BackgroundBox, "$this$BackgroundBox");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(BackgroundBox) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarE = ph.m0.e(androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.f976c, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), ph.m0.c(jVar2), true);
            z.f1 f1Var = this.f12653a;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(dVarE, CropImageView.DEFAULT_ASPECT_RATIO, f1Var.c(), CropImageView.DEFAULT_ASPECT_RATIO, this.f12654b, 5);
            float f10 = 16;
            z.q qVarA = z.o.a(z.b.h(f10), d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
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
            d.a aVar2 = d.a.f1143b;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 8), jVar2);
            f1.b bVar = this.f12655c;
            z.s sVar = z.s.f34624a;
            bVar.b(sVar, jVar2, 6);
            String strC = f3.q.c(R.string.settings_section_pro, jVar2);
            p5.x xVar = this.f12657e;
            v3.f(strC, f1.c.b(2044884744, new r2(xVar, this.f12658f), jVar2), jVar2, 48);
            String strC2 = f3.q.c(R.string.settings_section_appearance, jVar2);
            Context context = this.f12659g;
            x0.n1<Boolean> n1Var = this.f12660h;
            x0.n1<Boolean> n1Var2 = this.f12661j;
            b4 b4Var = this.f12662k;
            v3.f(strC2, f1.c.b(352735487, new w2(context, n1Var, n1Var2, b4Var, this.f12663l, this.f12664m, this.f12665n, this.f12666p, this.f12667q), jVar2), jVar2, 48);
            v3.f(f3.q.c(R.string.settings_section_build, jVar2), f1.c.b(-558144256, new a3(xVar, context, b4Var, this.f12668r, this.f12669s), jVar2), jVar2, 48);
            v3.f(f3.q.c(R.string.settings_section_help, jVar2), f1.c.b(-1469023999, new e3(xVar, context), jVar2), jVar2, 48);
            v3.f(f3.q.c(R.string.settings_about, jVar2), f1.c.b(1915063554, new h3(xVar), jVar2), jVar2, 48);
            this.f12656d.b(sVar, jVar2, 6);
            String strA = k3.b.a(f3.q.c(R.string.app_name, jVar2), " · ", f3.q.d(R.string.settings_version, new Object[]{"1.32", 45}, jVar2));
            t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26549l;
            x0.s3 s3Var = t0.f2.f25858a;
            ff.b(strA, androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((t0.e2) jVar2.f(s3Var)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, l0Var, jVar2, 48, 0, 65016);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f10), jVar2);
            jVar2.H();
            z.g.a(q8.b1.a(BackgroundBox.e(), ((t0.e2) jVar2.f(s3Var)).f25768n, ((f3.d) jVar2.f(j2.j2.f14779h)).N0(f1Var.c() + 24), 8), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
