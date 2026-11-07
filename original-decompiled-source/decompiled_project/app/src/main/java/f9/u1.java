package f9;

import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.WeakHashMap;
import z.b;
import z.x1;

/* loaded from: classes.dex */
public final class u1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b f10659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t0.e2 f10660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f10661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10662g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f10663h;

    public u1(boolean z10, long j10, eh.a aVar, f1.b bVar, t0.e2 e2Var, String str, boolean z11, String str2) {
        this.f10656a = z10;
        this.f10657b = j10;
        this.f10658c = aVar;
        this.f10659d = bVar;
        this.f10660e = e2Var;
        this.f10661f = str;
        this.f10662g = z11;
        this.f10663h = str2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        int i10;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarG = d0.h.g(aVar);
            b.k kVar = z.b.f34446c;
            f.a aVar2 = d.a.f14614m;
            z.q qVarA = z.o.a(kVar, aVar2, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, jVar2);
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
            ph.v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(z.y1.a(dVarD, new z.b1(x1.a.c(jVar2).f34677k, hf.a.f12994e)), 64);
            float f10 = 4;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(dVarF, f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            b.j jVar3 = z.b.f34444a;
            f.b bVar2 = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(jVar3, bVar2, jVar2, 48);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, jVar2);
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
            ph.v1.j(bVar, m1VarA, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            t0.s4.c(this.f10658c, null, false, null, c.f9145f, jVar2, 196608, 30);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(new LayoutWeightElement(1.0f, true), f10, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            z.q qVarA2 = z.o.a(kVar, aVar2, jVar2, 0);
            int iD3 = jVar2.D();
            x0.a2 a2VarY3 = jVar2.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarL, jVar2);
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
            ph.v1.j(bVar, qVarA2, jVar2);
            ph.v1.j(dVar, a2VarY3, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar2, iD3, c0128a);
            }
            ph.v1.j(cVar, dVarC3, jVar2);
            x0.s3 s3Var = t0.of.f26647a;
            t2.l0 l0Var = ((t0.nf) jVar2.f(s3Var)).f26545h;
            x2.p pVar = x2.p.f32032e;
            t0.e2 e2Var = this.f10660e;
            t0.ff.b(this.f10661f, null, e2Var.f25771q, 0L, pVar, null, 0L, null, 0L, 2, false, 1, 0, l0Var, jVar2, 196608, 3120, 55258);
            z.m1 m1VarA2 = z.k1.a(jVar3, bVar2, jVar2, 48);
            int iD4 = jVar2.D();
            x0.a2 a2VarY4 = jVar2.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar, jVar2);
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
            ph.v1.j(bVar, m1VarA2, jVar2);
            ph.v1.j(dVar, a2VarY4, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                l9.i.a(iD4, jVar2, iD4, c0128a);
            }
            ph.v1.j(cVar, dVarC4, jVar2);
            jVar2.L(-225905196);
            long j10 = this.f10657b;
            boolean z10 = this.f10662g;
            if (z10) {
                i10 = 0;
                z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 11), 7), j10, h0.f.f12083a), jVar2, 0);
            } else {
                i10 = 0;
            }
            jVar2.B();
            t0.ff.b(this.f10663h, null, z10 ? j10 : e2Var.f25773s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((t0.nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 3120, 55290);
            x0.j jVar4 = jVar2;
            jVar4.H();
            jVar4.H();
            this.f10659d.invoke(jVar4, Integer.valueOf(i10));
            jVar4.H();
            if (this.f10656a) {
                jVar4.L(-1801638737);
                t0.z9.c(CropImageView.DEFAULT_ASPECT_RATIO, 0, 390, 24, j10, q1.b1.f21653g, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 2), jVar4);
                jVar4 = jVar4;
                jVar4.B();
            } else {
                jVar4.L(-1801495393);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 2), jVar4);
                jVar4.B();
            }
            jVar4.H();
        }
        return pg.f0.f21461a;
    }
}
