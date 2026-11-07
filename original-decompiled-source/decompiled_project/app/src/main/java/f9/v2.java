package f9;

import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class v2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f10764c;

    public v2(boolean z10, x0.n1<Boolean> n1Var, x0.n1<y2.c0> n1Var2) {
        this.f10762a = z10;
        this.f10763b = n1Var;
        this.f10764c = n1Var2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            w1.d dVarB = r0.u0.f23048a;
            if (dVarB == null) {
                d.a aVar = new d.a("Rounded.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = w1.m.f31210a;
                q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                w1.e eVarA = o0.d.a(12.0f, 4.0f);
                eVarA.b(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
                eVarA.b(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
                eVarA.j(9.27f, -3.11f, 11.0f, -7.5f);
                eVarA.b(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
                eVarA.a();
                eVarA.h(12.0f, 16.5f);
                eVarA.c(-2.76f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, -2.24f, -5.0f, -5.0f);
                eVarA.j(2.24f, -5.0f, 5.0f, -5.0f);
                eVarA.j(5.0f, 2.24f, 5.0f, 5.0f);
                eVarA.j(-2.24f, 5.0f, -5.0f, 5.0f);
                eVarA.a();
                eVarA.h(12.0f, 8.5f);
                eVarA.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
                eVarA.j(1.34f, 3.0f, 3.0f, 3.0f);
                eVarA.j(3.0f, -1.34f, 3.0f, -3.0f);
                eVarA.j(-1.34f, -3.0f, -3.0f, -3.0f);
                eVarA.a();
                d.a.a(aVar, eVarA.f31100a, 0, i2Var);
                dVarB = aVar.b();
                r0.u0.f23048a = dVarB;
            }
            t0.t4.b(dVarB, f3.q.c(R.string.preview_button, jVar2), null, q1.b1.c((!this.f10762a || d1.n(this.f10763b) || mh.x.A(this.f10764c.getValue().f33682a.f27761b)) ? 0.38f : 1.0f, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s), jVar2, 0, 4);
        }
        return pg.f0.f21461a;
    }
}
