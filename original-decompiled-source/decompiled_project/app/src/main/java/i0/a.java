package i0;

import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f13123b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j10, androidx.compose.ui.d dVar) {
        super(2);
        this.f13122a = j10;
        this.f13123b = dVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j10 = this.f13122a;
            if (j10 != 9205357640488583168L) {
                jVar2.L(1828931592);
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.g.l(this.f13123b, f3.k.b(j10), f3.k.a(j10), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                g2.l0 l0VarD = z.g.d(d.a.f14603b, false);
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
                h.b(null, jVar2, 0, 1);
                jVar2.H();
                jVar2.B();
            } else {
                jVar2.L(1829298756);
                h.b(this.f13123b, jVar2, 0, 0);
                jVar2.B();
            }
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
