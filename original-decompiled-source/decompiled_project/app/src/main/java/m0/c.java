package m0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f17267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f17269c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f17270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j10, boolean z10, androidx.compose.ui.d dVar, w wVar) {
        super(2);
        this.f17267a = j10;
        this.f17268b = z10;
        this.f17269c = dVar;
        this.f17270d = wVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j10 = this.f17267a;
            j.a.C0321a c0321a = j.a.f31715a;
            w wVar = this.f17270d;
            boolean z10 = this.f17268b;
            if (j10 != 9205357640488583168L) {
                jVar2.L(-837626688);
                b.e eVar = z10 ? b.a.f34452b : b.a.f34451a;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.g.l(this.f17269c, f3.k.b(j10), f3.k.a(j10), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                z.m1 m1VarA = z.k1.a(eVar, d.a.f14611j, jVar2, 0);
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
                ph.v1.j(g.a.f13867f, m1VarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                boolean zL = jVar2.l(wVar);
                Object objG = jVar2.g();
                if (zL || objG == c0321a) {
                    objG = new k0.o1(wVar, 1);
                    jVar2.C(objG);
                }
                g.c(d.a.f1143b, (eh.a) objG, z10, jVar2, 6);
                jVar2.H();
                jVar2.B();
            } else {
                jVar2.L(-836697680);
                boolean zL2 = jVar2.l(wVar);
                Object objG2 = jVar2.g();
                if (zL2 || objG2 == c0321a) {
                    objG2 = new b(wVar);
                    jVar2.C(objG2);
                }
                g.c(this.f17269c, (eh.a) objG2, z10, jVar2, 0);
                jVar2.B();
            }
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
