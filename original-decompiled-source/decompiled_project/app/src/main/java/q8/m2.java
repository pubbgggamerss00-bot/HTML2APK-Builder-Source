package q8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import p0.ac;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import t0.t4;
import w1.d;
import x0.s3;

/* loaded from: classes.dex */
public final class m2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22313c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22317g;

    public m2(boolean z10, boolean z11, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3) {
        this.f22311a = z10;
        this.f22312b = z11;
        this.f22313c = aVar;
        this.f22314d = aVar2;
        this.f22315e = n1Var;
        this.f22316f = n1Var2;
        this.f22317g = n1Var3;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t.u1 u1VarC = ph.m0.c(jVar2);
            d.a aVar = d.a.f1143b;
            float f10 = 24;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(ph.m0.e(aVar, u1VarC, true), f10);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
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
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 56);
            s3 s3Var = t0.f2.f25858a;
            float f11 = 16;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, q1.b1.c(0.12f, ((t0.e2) jVar2.f(s3Var)).f25751a), h0.f.a(f11));
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
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
            ph.v1.j(bVar, l0VarD, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            w1.d dVarB2 = ac.f20788a;
            if (dVarB2 == null) {
                d.a aVar3 = new d.a("Filled.VerifiedUser", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = w1.m.f31210a;
                q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                w1.e eVar = new w1.e();
                eVar.h(12.0f, 1.0f);
                eVar.f(3.0f, 5.0f);
                eVar.l(6.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
                eVar.c(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
                eVar.f(21.0f, 5.0f);
                eVar.g(-9.0f, -4.0f);
                eVar.a();
                eVar.h(10.0f, 17.0f);
                eVar.g(-4.0f, -4.0f);
                eVar.g(1.41f, -1.41f);
                eVar.f(10.0f, 14.17f);
                eVar.g(6.59f, -6.59f);
                eVar.f(18.0f, 9.0f);
                eVar.g(-8.0f, 8.0f);
                eVar.a();
                d.a.a(aVar3, eVar.f31100a, 0, i2Var);
                dVarB2 = aVar3.b();
                ac.f20788a = dVarB2;
            }
            t4.b(dVarB2, null, androidx.compose.foundation.layout.g.n(aVar, 28), ((t0.e2) jVar2.f(s3Var)).f25751a, jVar2, 432, 0);
            jVar2.H();
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f11), jVar2);
            String strC = f3.q.c(R.string.sign_in_consent_title, jVar2);
            s3 s3Var2 = of.f26647a;
            ff.b(strC, null, ((t0.e2) jVar2.f(s3Var)).f25771q, 0L, x2.p.f32033f, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26544g, jVar2, 196608, 0, 64986);
            ff.b(pd.d.a(aVar, 8, jVar2, R.string.sign_in_consent_message, jVar2), null, ((t0.e2) jVar2.f(s3Var)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26548k, jVar2, 0, 0, 65018);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 20), jVar2);
            h0.e eVarA = h0.f.a(18);
            long j10 = ((t0.e2) jVar2.f(s3Var)).I;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            boolean z10 = this.f22312b;
            md.a(dVarD, eVarA, j10, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1991594607, new k2(z10, this.f22315e, this.f22316f, this.f22317g), jVar2), jVar2, 12582918, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
            t0.x0.a(this.f22313c, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 52), this.f22311a && !z10, h0.f.a(f11), null, null, null, null, f1.c.b(2075731750, new l2(z10), jVar2), jVar2, 805306416, 496);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 4), jVar2);
            t0.x0.d(this.f22314d, null, !z10, null, null, null, b0.f22114d, jVar2, 805306368, 506);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
