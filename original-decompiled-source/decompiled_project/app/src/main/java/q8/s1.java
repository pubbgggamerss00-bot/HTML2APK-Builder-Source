package q8;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class s1 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22381a;

    public s1(eh.a<pg.f0> aVar) {
        this.f22381a = aVar;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
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
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 16), jVar2);
        jVar2.L(1076961507);
        eh.a<pg.f0> aVar3 = this.f22381a;
        boolean zK = jVar2.K(aVar3);
        Object objG = jVar2.g();
        if (zK || objG == j.a.f31715a) {
            objG = new a9.i1(aVar3, 1);
            jVar2.C(objG);
        }
        jVar2.B();
        t0.x0.a((eh.a) objG, androidx.compose.foundation.layout.g.d(aVar, 1.0f), false, h0.f.a(12), null, null, null, null, a0.f22091b, jVar2, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
        jVar2.H();
        return pg.f0.f21461a;
    }
}
