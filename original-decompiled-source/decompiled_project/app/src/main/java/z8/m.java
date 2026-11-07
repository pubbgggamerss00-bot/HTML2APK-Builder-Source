package z8;

import androidx.compose.ui.d;
import c2.n0;
import c9.u1;
import com.yalantis.ucrop.view.CropImageView;
import g2.l0;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import q1.b1;
import q1.l1;
import q1.y1;
import t0.t4;
import x0.a2;
import x0.j;

/* loaded from: classes.dex */
public final class m implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f34836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f34837b;

    public m(float f10, long j10) {
        this.f34836a = f10;
        this.f34837b = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            j1.f fVar = d.a.f14606e;
            l0 l0VarD = z.g.d(fVar, false);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, l0VarD, jVar2);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar2);
            float f10 = this.f34836a;
            final float fL = (1.0f - jh.j.l((f10 - 0.9f) / 0.1f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)) * jh.j.l((f10 - 0.55f) / 0.2f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 56);
            jVar2.L(-1290007103);
            boolean zH = jVar2.h(fL);
            Object objG = jVar2.g();
            if (zH || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: z8.l
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        l1 graphicsLayer = (l1) obj;
                        kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                        float f11 = (fL * 0.2f) + 0.8f;
                        graphicsLayer.h(f11);
                        graphicsLayer.d(f11);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.ui.graphics.a.a(dVarN, (eh.l) objG), h0.f.a(16));
            long j10 = this.f34837b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, n0.g(b1.c(0.25f, j10), j10, fL), y1.f21750a);
            l0 l0VarD2 = z.g.d(fVar, false);
            int iD2 = jVar2.D();
            a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            v1.j(bVar, l0VarD2, jVar2);
            v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            v1.j(cVar, dVarC2, jVar2);
            t4.b(p0.p.a(), null, androidx.compose.foundation.layout.g.n(aVar, 32), b1.f21650d, jVar2, 3504, 0);
            jVar2.H();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
