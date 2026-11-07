package a9;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.v2;

/* loaded from: classes.dex */
public final class w0 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f361b;

    public w0(boolean z10, String str) {
        this.f360a = z10;
        this.f361b = str;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        d.a aVar = d.a.f1143b;
        androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 58, 10, 4, CropImageView.DEFAULT_ASPECT_RATIO, 8);
        z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
        int iD = jVar2.D();
        x0.a2 a2VarY = jVar2.y();
        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
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
        jVar2.L(1070813111);
        boolean z10 = this.f360a;
        long jC = z10 ? q1.b1.c(0.25f, ((e2) jVar2.f(f2.f25858a)).B) : q1.b1.c(0.06f, q1.b1.f21648b);
        jVar2.B();
        v2.a(androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 8, 7), 1, jC, jVar2, 54, 0);
        ff.b(this.f361b, null, q1.b1.c(z10 ? 0.88f : 0.82f, ((e2) jVar2.f(f2.f25858a)).f25769o), 0L, null, null, 0L, null, f3.u.c(19), 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26549l, jVar2, 0, 6, 64506);
        jVar2.H();
        return pg.f0.f21461a;
    }
}
