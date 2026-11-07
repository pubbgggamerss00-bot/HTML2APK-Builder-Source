package f9;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class p1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f10219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, pg.f0> f10220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10221c;

    public p1(float f10, long j10, eh.l lVar) {
        this.f10219a = f10;
        this.f10220b = lVar;
        this.f10221c = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
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
            ph.v1.j(g.a.f13867f, m1VarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            final float f10 = this.f10219a;
            boolean z10 = f10 > 10.0f;
            float f11 = 36;
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, f11);
            jVar2.L(1297621252);
            final eh.l<Float, pg.f0> lVar = this.f10220b;
            boolean zK = jVar2.K(lVar) | jVar2.h(f10);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zK || objG == obj) {
                objG = new eh.a() { // from class: f9.n1
                    @Override // eh.a
                    public final Object invoke() {
                        lVar.invoke(Float.valueOf(f10 - 1.0f));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.s4.c((eh.a) objG, dVarN, z10, null, c.f9153n, jVar2, 196656, 24);
            t0.ff.b(String.valueOf((int) f10), androidx.compose.foundation.layout.g.s(aVar, 24, CropImageView.DEFAULT_ASPECT_RATIO, 2), this.f10221c, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26550m, jVar2, 48, 0, 65016);
            boolean z11 = f10 < 22.0f;
            androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(aVar, f11);
            jVar2.L(1297642212);
            boolean zK2 = jVar2.K(lVar) | jVar2.h(f10);
            Object objG2 = jVar2.g();
            if (zK2 || objG2 == obj) {
                objG2 = new eh.a() { // from class: f9.o1
                    @Override // eh.a
                    public final Object invoke() {
                        lVar.invoke(Float.valueOf(f10 + 1.0f));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            t0.s4.c((eh.a) objG2, dVarN2, z11, null, c.f9154o, jVar2, 196656, 24);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
