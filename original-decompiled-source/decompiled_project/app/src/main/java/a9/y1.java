package a9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import t0.ff;
import z.b;

/* loaded from: classes.dex */
public final class y1 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f375c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f380h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f381j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f382k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f383l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f384m;

    public y1(boolean z10, eh.a aVar, boolean z11, boolean z12, long j10, String str, String str2, String str3, String str4, String str5, boolean z13, String str6) {
        this.f373a = z10;
        this.f374b = aVar;
        this.f375c = z11;
        this.f376d = z12;
        this.f377e = j10;
        this.f378f = str;
        this.f379g = str2;
        this.f380h = str3;
        this.f381j = str4;
        this.f382k = str5;
        this.f383l = z13;
        this.f384m = str6;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        e0.a aVar;
        g.a.C0128a c0128a;
        g.a.C0128a c0128a2;
        String strC;
        x0.j jVar2;
        z.r Card = rVar;
        x0.j jVar3 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar3.s()) {
            jVar3.v();
        } else {
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar2, 20);
            b.i iVarH = z.b.h(8);
            f.a aVar3 = d.a.f14614m;
            z.q qVarA = z.o.a(iVarH, aVar3, jVar3, 6);
            int iD = jVar3.D();
            x0.a2 a2VarY = jVar3.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar3);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, jVar3);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar3);
            g.a.C0128a c0128a3 = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a3);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar3);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            z.m1 m1VarA = z.k1.a(z.b.f34450g, d.a.f14612k, jVar3, 54);
            int iD2 = jVar3.D();
            x0.a2 a2VarY2 = jVar3.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar, m1VarA, jVar3);
            ph.v1.j(dVar, a2VarY2, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar3, iD2, c0128a3);
            }
            ph.v1.j(cVar, dVarC2, jVar3);
            z.q qVarA2 = z.o.a(z.b.f34446c, aVar3, jVar3, 0);
            int iD3 = jVar3.D();
            x0.a2 a2VarY3 = jVar3.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar2, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar, qVarA2, jVar3);
            ph.v1.j(dVar, a2VarY3, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar3, iD3, c0128a3);
            }
            ph.v1.j(cVar, dVarC3, jVar3);
            d.a aVar5 = aVar2;
            ff.b(this.f378f, null, b3.l.a(jVar3).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26551n, jVar3, 0, 0, 65530);
            ff.b(this.f379g, null, b3.l.a(jVar3).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26549l, jVar3, 0, 0, 65530);
            jVar3.H();
            float f10 = 12;
            androidx.compose.ui.d dVarD2 = e1.d.d(aVar5, h0.f.a(f10));
            boolean z10 = this.f376d;
            float f11 = z10 ? 0.15f : 0.12f;
            long j10 = this.f377e;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD2, q1.b1.c(f11, j10), q1.y1.f21750a);
            float f12 = 4;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(t.o.a(dVarB, 1, q1.b1.c(z10 ? 1.0f : 0.6f, j10), h0.f.a(f10)), 10, f12);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD4 = jVar3.D();
            x0.a2 a2VarY4 = jVar3.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarI, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                aVar = aVar4;
                jVar3.w(aVar);
            } else {
                aVar = aVar4;
                jVar3.z();
            }
            ph.v1.j(bVar, l0VarD, jVar3);
            ph.v1.j(dVar, a2VarY4, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                c0128a = c0128a3;
                l9.i.a(iD4, jVar3, iD4, c0128a);
            } else {
                c0128a = c0128a3;
            }
            ph.v1.j(cVar, dVarC4, jVar3);
            t2.l0 l0Var = b3.l.b(jVar3).f26552o;
            x2.p pVar = x2.p.f32033f;
            g.a.C0128a c0128a4 = c0128a;
            e0.a aVar6 = aVar;
            ff.b(this.f380h, null, j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar3, 196608, 0, 65498);
            jVar3.H();
            jVar3.H();
            z.q qVarA3 = z.o.a(z.b.h(2), aVar3, jVar3, 6);
            int iD5 = jVar3.D();
            x0.a2 a2VarY5 = jVar3.y();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar5, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar6);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar, qVarA3, jVar3);
            ph.v1.j(dVar, a2VarY5, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD5))) {
                c0128a2 = c0128a4;
                l9.i.a(iD5, jVar3, iD5, c0128a2);
            } else {
                c0128a2 = c0128a4;
            }
            ph.v1.j(cVar, dVarC5, jVar3);
            jVar3.L(950776680);
            jVar3.B();
            z.m1 m1VarA2 = z.k1.a(z.b.h(f12), d.a.f14613l, jVar3, 54);
            int iD6 = jVar3.D();
            x0.a2 a2VarY6 = jVar3.y();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(aVar5, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar6);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar, m1VarA2, jVar3);
            ph.v1.j(dVar, a2VarY6, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD6))) {
                l9.i.a(iD6, jVar3, iD6, c0128a2);
            }
            ph.v1.j(cVar, dVarC6, jVar3);
            jVar3.L(-580611223);
            String str = this.f381j;
            if (mh.x.A(str)) {
                strC = f3.q.c(this.f383l ? R.string.premium_price_unknown : R.string.premium_price_unavailable, jVar3);
            } else {
                strC = str;
            }
            jVar3.B();
            ff.b(strC, null, b3.l.a(jVar3).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26542e, jVar3, 196608, 0, 65498);
            x0.j jVar4 = jVar3;
            String str2 = this.f382k;
            if (str2 == null || mh.x.A(str)) {
                str2 = null;
            }
            jVar4.L(-580596613);
            if (str2 != null) {
                t2.l0 l0Var2 = b3.l.b(jVar4).f26548k;
                long j11 = b3.l.a(jVar4).f25773s;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(aVar5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f12, 7);
                aVar5 = aVar5;
                ff.b(str2, dVarL, j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar4, 48, 0, 65528);
                jVar4 = jVar4;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            jVar4.B();
            jVar4.H();
            jVar4.H();
            boolean z11 = this.f373a;
            eh.a<pg.f0> aVar7 = this.f374b;
            boolean z12 = this.f375c;
            String str3 = this.f384m;
            if (z11) {
                jVar4.L(-367658050);
                androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar5, 1.0f), 52);
                h0.e eVarA = h0.f.a(16);
                z.g1 g1Var = t0.m0.f26400a;
                x0.j jVar5 = jVar4;
                t0.x0.c(aVar7, dVarF, z12, eVarA, t0.m0.e(b3.l.a(jVar4).f25751a, jVar4), d2.a((float) 1.5d, b3.l.a(jVar4).f25751a), null, f1.c.b(-601364216, new w1(str3), jVar4), jVar5, 805306416, DilithiumEngine.DilithiumPolyT0PackedBytes);
                jVar5.B();
                jVar2 = jVar5;
            } else {
                jVar4.L(-366858622);
                androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar5, 1.0f), 52);
                h0.e eVarA2 = h0.f.a(16);
                z.g1 g1Var2 = t0.m0.f26400a;
                jVar2 = jVar4;
                t0.x0.a(aVar7, dVarF2, z12, eVarA2, t0.m0.a(c2.n0.c(z10 ? 4294956800L : 4294286859L), 0L, 0L, jVar4, 14), null, null, null, f1.c.b(976733967, new x1(str3), jVar4), jVar2, 805306416, 480);
                jVar2.B();
            }
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
