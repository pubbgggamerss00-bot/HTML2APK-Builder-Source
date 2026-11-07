package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class w2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10830b;

    public w2(long j10, x0.n1<Boolean> n1Var) {
        this.f10829a = j10;
        this.f10830b = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else if (d1.n(this.f10830b)) {
            jVar2.L(-182371172);
            t0.z9.a(2, 0, 390, 24, this.f10829a, 0L, androidx.compose.foundation.layout.g.n(d.a.f1143b, 20), jVar2);
            jVar2.B();
        } else {
            jVar2.L(-182367343);
            w1.d dVarB = r0.o0.f23036a;
            if (dVarB == null) {
                d.a aVar = new d.a("Rounded.Save", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = w1.m.f31210a;
                q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                w1.e eVarA = o0.d.a(17.59f, 3.59f);
                eVarA.c(-0.38f, -0.38f, -0.89f, -0.59f, -1.42f, -0.59f);
                eVarA.f(5.0f, 3.0f);
                eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
                eVarA.l(14.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                eVarA.e(14.0f);
                eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                eVarA.f(21.0f, 7.83f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
                eVarA.g(-2.82f, -2.83f);
                eVarA.a();
                eVarA.h(12.0f, 19.0f);
                eVarA.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, -1.34f, -3.0f, -3.0f);
                eVarA.j(1.34f, -3.0f, 3.0f, -3.0f);
                eVarA.j(3.0f, 1.34f, 3.0f, 3.0f);
                eVarA.j(-1.34f, 3.0f, -3.0f, 3.0f);
                l9.i.b(eVarA, 13.0f, 9.0f, 7.0f, 9.0f);
                eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, -0.9f, -2.0f, -2.0f);
                eVarA.j(0.9f, -2.0f, 2.0f, -2.0f);
                eVarA.e(6.0f);
                eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, 0.9f, 2.0f, 2.0f);
                eVarA.j(-0.9f, 2.0f, -2.0f, 2.0f);
                eVarA.a();
                d.a.a(aVar, eVarA.f31100a, 0, i2Var);
                dVarB = aVar.b();
                r0.o0.f23036a = dVarB;
            }
            t0.t4.b(dVarB, f3.q.c(R.string.common_save, jVar2), null, 0L, jVar2, 0, 12);
            jVar2.B();
        }
        return pg.f0.f21461a;
    }
}
