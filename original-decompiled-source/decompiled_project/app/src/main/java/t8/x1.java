package t8;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import t0.z9;

/* loaded from: classes.dex */
public final class x1 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f28565a;

    public x1(androidx.compose.ui.d dVar) {
        this.f28565a = dVar;
    }

    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            float f10 = 24;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(this.f28565a, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
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
            ph.v1.j(g.a.f13867f, l0VarD, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            z9.a(2, 0, 390, 26, 0L, 0L, androidx.compose.foundation.layout.g.n(d.a.f1143b, f10), jVar2);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
