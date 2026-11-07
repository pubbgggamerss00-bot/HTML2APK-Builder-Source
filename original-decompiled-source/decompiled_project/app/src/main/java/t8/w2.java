package t8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import t0.ff;
import t0.k4;
import t0.nf;
import t0.of;
import t0.s4;

/* loaded from: classes.dex */
public final class w2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f28539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f28541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f28543f;

    /* JADX WARN: Multi-variable type inference failed */
    public w2(boolean z10, eh.a<pg.f0> aVar, String str, eh.a<pg.f0> aVar2, String str2, eh.l<? super String, pg.f0> lVar) {
        this.f28538a = z10;
        this.f28539b = aVar;
        this.f28540c = str;
        this.f28541d = aVar2;
        this.f28542e = str2;
        this.f28543f = lVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        String str;
        float f10;
        d.a aVar;
        x0.j jVar2;
        float f11;
        x0.j jVar3 = jVar;
        if ((num.intValue() & 3) == 2 && jVar3.s()) {
            jVar3.v();
        } else {
            float f12 = 6;
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.f.k(aVar2, 18, f12, f12, f12);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14613l, jVar3, 48);
            int iD = jVar3.D();
            x0.a2 a2VarY = jVar3.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarK, jVar3);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar3);
            } else {
                jVar3.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, m1VarA, jVar3);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar3);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar3);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            float f13 = 44;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.h(new LayoutWeightElement(1.0f, true), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 11, 1);
            g2.l0 l0VarD = z.g.d(d.a.f14605d, false);
            int iD2 = jVar3.D();
            x0.a2 a2VarY2 = jVar3.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar3);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar, l0VarD, jVar3);
            ph.v1.j(dVar, a2VarY2, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar3, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar3);
            jVar3.L(785225369);
            String str2 = this.f28540c;
            if (str2.length() == 0) {
                str = str2;
                f11 = f13;
                aVar = aVar2;
                f10 = f12;
                ff.b(this.f28542e, null, ((t0.e2) jVar3.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((nf) jVar3.f(of.f26647a)).f26547j, jVar3, 0, 3072, 57338);
                jVar2 = jVar3;
            } else {
                str = str2;
                f10 = f12;
                aVar = aVar2;
                jVar2 = jVar3;
                f11 = f13;
            }
            jVar2.B();
            boolean z10 = this.f28538a;
            boolean z11 = !z10;
            t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26547j;
            x0.s3 s3Var = t0.f2.f25858a;
            t2.l0 l0VarA = t2.l0.a(l0Var, ((t0.e2) jVar2.f(s3Var)).f25771q, 0L, null, null, 0L, 0L, null, null, 16777214);
            long j10 = k9.d.f16192n;
            x0.j jVar4 = jVar2;
            String str3 = str;
            d.a aVar4 = aVar;
            i0.q.a(str3, this.f28543f, androidx.compose.foundation.layout.g.d(aVar, 1.0f), z11, false, l0VarA, null, null, false, 6, 0, null, null, null, new q1.i2(j10), null, jVar4, 805306752, 0, 48592);
            jVar4.H();
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar4, f10), jVar4);
            if (z10) {
                jVar4.L(-912820315);
                s4.a(this.f28539b, androidx.compose.foundation.layout.g.n(aVar4, f11), false, h0.f.f12083a, k4.a(((t0.e2) jVar4.f(s3Var)).f25771q, ((t0.e2) jVar4.f(s3Var)).f25770p, jVar4, 0), c4.f28167s, jVar4, 1572912, 36);
                jVar4.B();
            } else {
                jVar4.L(-912245358);
                s4.a(this.f28541d, androidx.compose.foundation.layout.g.n(aVar4, f11), !mh.x.A(str), h0.f.f12083a, k4.a(j10, v2.f28491a, jVar4, 48), c4.f28168t, jVar4, 1572912, 32);
                jVar4.B();
            }
            jVar4.H();
        }
        return pg.f0.f21461a;
    }
}
