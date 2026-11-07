package a9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import q1.u0;
import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class x0 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f364a;

    public x0(boolean z10) {
        this.f364a = z10;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        v1.c cVar;
        g.a.d dVar;
        d.a aVar;
        List listJ;
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        d.a aVar2 = d.a.f1143b;
        float f10 = 4;
        androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.n(aVar2, 118), f10);
        g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
        int iD = jVar2.D();
        x0.a2 a2VarY = jVar2.y();
        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
        i2.g.f13861o.getClass();
        e0.a aVar3 = g.a.f13863b;
        if (jVar2.t() == null) {
            c9.u1.d();
            throw null;
        }
        jVar2.r();
        if (jVar2.m()) {
            jVar2.w(aVar3);
        } else {
            jVar2.z();
        }
        g.a.b bVar = g.a.f13867f;
        ph.v1.j(bVar, l0VarD, jVar2);
        g.a.d dVar2 = g.a.f13866e;
        ph.v1.j(dVar2, a2VarY, jVar2);
        g.a.C0128a c0128a = g.a.f13868g;
        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
            l9.i.a(iD, jVar2, iD, c0128a);
        }
        g.a.c cVar2 = g.a.f13865d;
        ph.v1.j(cVar2, dVarC, jVar2);
        v1.c cVarA = o2.c.a(R.drawable.ic_premium_logo, jVar2);
        String strC = f3.q.c(R.string.pro_badge_content_description, jVar2);
        float f11 = 26;
        androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, HeaderItem.DATA_SIZE_OFFSET), h0.f.a(f11));
        float f12 = 2;
        boolean z10 = this.f364a;
        if (z10) {
            aVar = aVar2;
            cVar = cVarA;
            dVar = dVar2;
            listJ = qg.p.j(new q1.b1(c2.n0.c(4294956800L)), new q1.b1(q1.b1.c(0.6f, c2.n0.c(4294942720L))));
        } else {
            cVar = cVarA;
            dVar = dVar2;
            aVar = aVar2;
            listJ = qg.p.j(new q1.b1(c2.n0.c(4292441862L)), new q1.b1(q1.b1.c(0.6f, c2.n0.c(4290007817L))));
        }
        g.a.d dVar3 = dVar;
        t.t0.a(cVar, strC, t.o.b(dVarD, f12, u0.a.b(listJ), h0.f.a(f11)), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, jVar2, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        float f13 = 8;
        androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(t.o.a(androidx.compose.foundation.a.a(e1.d.d(androidx.compose.foundation.layout.e.b(androidx.compose.foundation.layout.b.f961a.b(aVar, d.a.f14610i), f10, f10), h0.f.a(f13)), u0.a.a(qg.p.j(new q1.b1(c2.n0.c(4294956800L)), new q1.b1(c2.n0.c(4294942720L))))), (float) 1.5d, z10 ? c2.n0.c(4280163108L) : q1.b1.f21650d, h0.f.a(f13)), f13, 3);
        g2.l0 l0VarD2 = z.g.d(d.a.f14602a, false);
        int iD2 = jVar2.D();
        x0.a2 a2VarY2 = jVar2.y();
        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI, jVar2);
        if (jVar2.t() == null) {
            c9.u1.d();
            throw null;
        }
        jVar2.r();
        if (jVar2.m()) {
            jVar2.w(aVar3);
        } else {
            jVar2.z();
        }
        ph.v1.j(bVar, l0VarD2, jVar2);
        ph.v1.j(dVar3, a2VarY2, jVar2);
        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
            l9.i.a(iD2, jVar2, iD2, c0128a);
        }
        ph.v1.j(cVar2, dVarC2, jVar2);
        ff.b("PRO", null, c2.n0.c(4279900698L), 0L, x2.p.f32035h, null, f3.u.b(0.5d), null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26552o, jVar2, 12779910, 0, 65370);
        jVar2.H();
        jVar2.H();
        return pg.f0.f21461a;
    }
}
