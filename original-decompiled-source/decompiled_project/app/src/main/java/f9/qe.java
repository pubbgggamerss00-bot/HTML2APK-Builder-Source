package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import x0.j;
import x2.p;
import z.b;

/* loaded from: classes.dex */
public final class qe implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, pg.f0> f10320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, pg.f0> f10323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10324h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, pg.f0> f10325j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10326k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, pg.f0> f10327l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10328m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, pg.f0> f10329n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10330p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, pg.f0> f10331q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10332r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, pg.f0> f10333s;

    /* JADX WARN: Multi-variable type inference failed */
    public qe(String str, boolean z10, int i10, eh.l<? super Integer, pg.f0> lVar, boolean z11, int i11, eh.l<? super Integer, pg.f0> lVar2, int i12, eh.l<? super Integer, pg.f0> lVar3, int i13, eh.l<? super Integer, pg.f0> lVar4, int i14, eh.l<? super Integer, pg.f0> lVar5, int i15, eh.l<? super Integer, pg.f0> lVar6, int i16, eh.l<? super Integer, pg.f0> lVar7) {
        this.f10317a = str;
        this.f10318b = z10;
        this.f10319c = i10;
        this.f10320d = lVar;
        this.f10321e = z11;
        this.f10322f = i11;
        this.f10323g = lVar2;
        this.f10324h = i12;
        this.f10325j = lVar3;
        this.f10326k = i13;
        this.f10327l = lVar4;
        this.f10328m = i14;
        this.f10329n = lVar5;
        this.f10330p = i15;
        this.f10331q = lVar6;
        this.f10332r = i16;
        this.f10333s = lVar7;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        e0.a aVar;
        g.a.C0128a c0128a;
        e0.a aVar2;
        int i10;
        d.a aVar3;
        f.a aVar4;
        f.b bVar;
        x0.j jVar2;
        z.r Card = rVar;
        x0.j jVar3 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar3.s()) {
            jVar3.v();
        } else {
            d.a aVar5 = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar5, 16);
            b.i iVarH = z.b.h(12);
            f.a aVar6 = d.a.f14614m;
            z.q qVarA = z.o.a(iVarH, aVar6, jVar3, 6);
            int iD = jVar3.D();
            x0.a2 a2VarY = jVar3.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar3);
            i2.g.f13861o.getClass();
            e0.a aVar7 = g.a.f13863b;
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar7);
            } else {
                jVar3.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, qVarA, jVar3);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar3);
            g.a.C0128a c0128a2 = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a2);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar3);
            b.k kVar = z.b.f34446c;
            z.q qVarA2 = z.o.a(kVar, aVar6, jVar3, 0);
            int iD2 = jVar3.D();
            x0.a2 a2VarY2 = jVar3.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar5, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar7);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar2, qVarA2, jVar3);
            ph.v1.j(dVar, a2VarY2, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar3, iD2, c0128a2);
            }
            ph.v1.j(cVar, dVarC2, jVar3);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
            b.g gVar = z.b.f34450g;
            f.b bVar3 = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(gVar, bVar3, jVar3, 54);
            int iD3 = jVar3.D();
            x0.a2 a2VarY3 = jVar3.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarD, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar7);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar2, m1VarA, jVar3);
            ph.v1.j(dVar, a2VarY3, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar3, iD3, c0128a2);
            }
            ph.v1.j(cVar, dVarC3, jVar3);
            t0.ff.b(f3.q.c(R.string.editor_splash_icon_size_label, jVar3), null, b3.l.a(jVar3).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26548k, jVar3, 0, 0, 65530);
            int i11 = this.f10319c;
            String strB = i8.c.b(i11, "dp");
            t2.l0 l0Var = b3.l.b(jVar3).f26548k;
            x2.p pVar = x2.p.f32032e;
            t0.ff.b(strB, null, b3.l.a(jVar3).f25773s, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar3, 196608, 0, 65498);
            jVar3.H();
            float f10 = i11;
            jh.d dVar2 = new jh.d(60.0f, 180.0f);
            t0.rb rbVar = t0.rb.f26896a;
            t0.jb jbVarD = t0.rb.d(c2.n0.c(4294944550L), c2.n0.c(4294944550L), q1.b1.c(0.24f, c2.n0.c(4294944550L)), jVar3);
            jVar3.L(-703133967);
            eh.l<Integer, pg.f0> lVar = this.f10320d;
            boolean zK = jVar3.K(lVar);
            Object objG = jVar3.g();
            Object obj = j.a.f31715a;
            if (zK || objG == obj) {
                objG = new me(lVar);
                jVar3.C(objG);
            }
            eh.l lVar2 = (eh.l) objG;
            jVar3.B();
            boolean z10 = this.f10321e;
            t0.dc.a(f10, lVar2, null, z10, dVar2, 0, jbVarD, null, jVar3, 0, 356);
            jVar3.H();
            z.q qVarA3 = z.o.a(kVar, aVar6, jVar3, 0);
            int iD4 = jVar3.D();
            x0.a2 a2VarY4 = jVar3.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar5, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                aVar = aVar7;
                jVar3.w(aVar);
            } else {
                aVar = aVar7;
                jVar3.z();
            }
            ph.v1.j(bVar2, qVarA3, jVar3);
            ph.v1.j(dVar, a2VarY4, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                c0128a = c0128a2;
                l9.i.a(iD4, jVar3, iD4, c0128a);
            } else {
                c0128a = c0128a2;
            }
            ph.v1.j(cVar, dVarC4, jVar3);
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
            z.m1 m1VarA2 = z.k1.a(gVar, bVar3, jVar3, 54);
            int iD5 = jVar3.D();
            x0.a2 a2VarY5 = jVar3.y();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarD2, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar2, m1VarA2, jVar3);
            ph.v1.j(dVar, a2VarY5, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD5))) {
                l9.i.a(iD5, jVar3, iD5, c0128a);
            }
            ph.v1.j(cVar, dVarC5, jVar3);
            g.a.C0128a c0128a3 = c0128a;
            e0.a aVar8 = aVar;
            t0.ff.b(f3.q.c(R.string.editor_splash_icon_radius_label, jVar3), null, b3.l.a(jVar3).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26548k, jVar3, 0, 0, 65530);
            int i12 = this.f10322f;
            t0.ff.b(i8.c.b(i12, "dp"), null, b3.l.a(jVar3).f25773s, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26548k, jVar3, 196608, 0, 65498);
            jVar3.H();
            float f11 = i12;
            jh.d dVar3 = new jh.d(CropImageView.DEFAULT_ASPECT_RATIO, 40.0f);
            t0.jb jbVarD2 = t0.rb.d(c2.n0.c(4294944550L), c2.n0.c(4294944550L), q1.b1.c(0.24f, c2.n0.c(4294944550L)), jVar3);
            jVar3.L(-703083885);
            Object obj2 = this.f10323g;
            boolean zK2 = jVar3.K(obj2);
            Object objG2 = jVar3.g();
            if (zK2 || objG2 == obj) {
                objG2 = new b9.a4(obj2, 1);
                jVar3.C(objG2);
            }
            jVar3.B();
            t0.dc.a(f11, (eh.l) objG2, null, z10, dVar3, 0, jbVarD2, null, jVar3, 0, 356);
            jVar3.H();
            z.q qVarA4 = z.o.a(kVar, aVar6, jVar3, 0);
            int iD6 = jVar3.D();
            x0.a2 a2VarY6 = jVar3.y();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(aVar5, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                aVar2 = aVar8;
                jVar3.w(aVar2);
            } else {
                aVar2 = aVar8;
                jVar3.z();
            }
            ph.v1.j(bVar2, qVarA4, jVar3);
            ph.v1.j(dVar, a2VarY6, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD6))) {
                l9.i.a(iD6, jVar3, iD6, c0128a3);
            }
            ph.v1.j(cVar, dVarC6, jVar3);
            androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
            z.m1 m1VarA3 = z.k1.a(gVar, bVar3, jVar3, 54);
            int iD7 = jVar3.D();
            x0.a2 a2VarY7 = jVar3.y();
            androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarD3, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar2);
            } else {
                jVar3.z();
            }
            ph.v1.j(g.a.c(), m1VarA3, jVar3);
            ph.v1.j(g.a.e(), a2VarY7, jVar3);
            g.a.C0128a c0128aB = g.a.b();
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD7))) {
                l9.i.a(iD7, jVar3, iD7, c0128aB);
            }
            ph.v1.j(g.a.d(), dVarC7, jVar3);
            t0.ff.b(f3.q.c(R.string.editor_splash_loader_size_label, jVar3), null, b3.l.a(jVar3).a(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).a(), jVar3, 0, 0, 65530);
            int i13 = this.f10324h;
            t0.ff.b(i8.c.b(i13, "dp"), null, b3.l.a(jVar3).b(), 0L, p.a.c(), null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).a(), jVar3, 196608, 0, 65498);
            jVar3.H();
            float f12 = i13;
            jh.d dVarH2 = di.t.h(20.0f, 72.0f);
            t0.jb jbVarD3 = t0.rb.d(c2.n0.c(4294944550L), c2.n0.c(4294944550L), q1.b1.c(0.24f, c2.n0.c(4294944550L)), jVar3);
            jVar3.L(-703033837);
            eh.l<Integer, pg.f0> lVar3 = this.f10325j;
            boolean zK3 = jVar3.K(lVar3);
            Object objG3 = jVar3.g();
            if (zK3 || objG3 == obj) {
                objG3 = new ne(lVar3);
                jVar3.C(objG3);
            }
            jVar3.B();
            t0.dc.a(f12, (eh.l) objG3, null, z10, dVarH2, 0, jbVarD3, null, jVar3, 0, 356);
            jVar3.H();
            z.q qVarA5 = z.o.a(kVar, aVar6, jVar3, 0);
            int iC = c9.u1.c(jVar3);
            x0.a2 a2VarY8 = jVar3.y();
            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(aVar5, jVar3);
            e0.a aVarA = g.a.a();
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVarA);
            } else {
                jVar3.z();
            }
            ph.v1.j(g.a.c(), qVarA5, jVar3);
            ph.v1.j(g.a.e(), a2VarY8, jVar3);
            g.a.C0128a c0128aB2 = g.a.b();
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iC))) {
                l9.i.a(iC, jVar3, iC, c0128aB2);
            }
            ph.v1.j(g.a.d(), dVarC8, jVar3);
            androidx.compose.ui.d dVarD4 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
            z.m1 m1VarA4 = z.k1.a(z.b.a(), bVar3, jVar3, 54);
            int iC2 = c9.u1.c(jVar3);
            x0.a2 a2VarY9 = jVar3.y();
            androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(dVarD4, jVar3);
            e0.a aVarA2 = g.a.a();
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVarA2);
            } else {
                jVar3.z();
            }
            ph.v1.j(g.a.c(), m1VarA4, jVar3);
            ph.v1.j(g.a.e(), a2VarY9, jVar3);
            g.a.C0128a c0128aB3 = g.a.b();
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iC2))) {
                l9.i.a(iC2, jVar3, iC2, c0128aB3);
            }
            ph.v1.j(g.a.d(), dVarC9, jVar3);
            t0.ff.b(f3.q.c(R.string.editor_splash_spacing_label, jVar3), null, b3.l.a(jVar3).a(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).a(), jVar3, 0, 0, 65530);
            int i14 = this.f10326k;
            t0.ff.b(i8.c.b(i14, "dp"), null, b3.l.a(jVar3).b(), 0L, p.a.c(), null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).a(), jVar3, 196608, 0, 65498);
            jVar3.H();
            float f13 = i14;
            jh.d dVarH3 = di.t.h(CropImageView.DEFAULT_ASPECT_RATIO, 60.0f);
            t0.jb jbVarD4 = t0.rb.d(c2.n0.c(4294944550L), c2.n0.c(4294944550L), q1.b1.c(0.24f, c2.n0.c(4294944550L)), jVar3);
            jVar3.L(-702984208);
            Object obj3 = this.f10327l;
            boolean zK4 = jVar3.K(obj3);
            Object objG4 = jVar3.g();
            if (zK4 || objG4 == obj) {
                i10 = 0;
                objG4 = new oe(obj3, 0);
                jVar3.C(objG4);
            } else {
                i10 = 0;
            }
            jVar3.B();
            t0.dc.a(f13, (eh.l) objG4, null, z10, dVarH3, 0, jbVarD4, null, jVar3, 0, 356);
            jVar3.H();
            z.q qVarA6 = z.o.a(kVar, aVar6, jVar3, i10);
            int iC3 = c9.u1.c(jVar3);
            x0.a2 a2VarY10 = jVar3.y();
            androidx.compose.ui.d dVarC10 = androidx.compose.ui.c.c(aVar5, jVar3);
            e0.a aVarA3 = g.a.a();
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVarA3);
            } else {
                jVar3.z();
            }
            ph.v1.j(g.a.c(), qVarA6, jVar3);
            ph.v1.j(g.a.e(), a2VarY10, jVar3);
            g.a.C0128a c0128aB4 = g.a.b();
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iC3))) {
                l9.i.a(iC3, jVar3, iC3, c0128aB4);
            }
            ph.v1.j(g.a.d(), dVarC10, jVar3);
            androidx.compose.ui.d dVarD5 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
            z.m1 m1VarA5 = z.k1.a(z.b.a(), bVar3, jVar3, 54);
            int iC4 = c9.u1.c(jVar3);
            x0.a2 a2VarY11 = jVar3.y();
            androidx.compose.ui.d dVarC11 = androidx.compose.ui.c.c(dVarD5, jVar3);
            e0.a aVarA4 = g.a.a();
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVarA4);
            } else {
                jVar3.z();
            }
            ph.v1.j(g.a.c(), m1VarA5, jVar3);
            ph.v1.j(g.a.e(), a2VarY11, jVar3);
            g.a.C0128a c0128aB5 = g.a.b();
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iC4))) {
                l9.i.a(iC4, jVar3, iC4, c0128aB5);
            }
            ph.v1.j(g.a.d(), dVarC11, jVar3);
            b.k kVar2 = kVar;
            t0.ff.b(f3.q.c(R.string.editor_splash_duration_label, jVar3), null, b3.l.a(jVar3).a(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).a(), jVar3, 0, 0, 65530);
            int i15 = this.f10328m;
            t0.ff.b(i8.c.b(i15, "s"), null, b3.l.a(jVar3).b(), 0L, p.a.c(), null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).a(), jVar3, 196608, 0, 65498);
            jVar3.H();
            float f14 = i15;
            jh.d dVarH4 = di.t.h(1.0f, 10.0f);
            t0.jb jbVarD5 = t0.rb.d(c2.n0.c(4294944550L), c2.n0.c(4294944550L), q1.b1.c(0.24f, c2.n0.c(4294944550L)), jVar3);
            jVar3.L(-702933871);
            Object obj4 = this.f10329n;
            boolean zK5 = jVar3.K(obj4);
            Object objG5 = jVar3.g();
            Object obj5 = obj;
            if (zK5 || objG5 == obj5) {
                objG5 = new n6(obj4, 1);
                jVar3.C(objG5);
            }
            jVar3.B();
            t0.dc.a(f14, (eh.l) objG5, null, z10, dVarH4, 8, jbVarD5, null, jVar3, 196608, 324);
            x0.j jVar4 = jVar3;
            jVar4.H();
            jVar4.L(-850771138);
            if (kotlin.jvm.internal.r.a(this.f10317a, "none")) {
                aVar3 = aVar5;
                aVar4 = aVar6;
                bVar = bVar3;
            } else {
                z.q qVarA7 = z.o.a(kVar2, aVar6, jVar4, 0);
                int iC5 = c9.u1.c(jVar4);
                x0.a2 a2VarY12 = jVar4.y();
                androidx.compose.ui.d dVarC12 = androidx.compose.ui.c.c(aVar5, jVar4);
                e0.a aVarA5 = g.a.a();
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVarA5);
                } else {
                    jVar4.z();
                }
                ph.v1.j(g.a.c(), qVarA7, jVar4);
                ph.v1.j(g.a.e(), a2VarY12, jVar4);
                g.a.C0128a c0128aB6 = g.a.b();
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iC5))) {
                    l9.i.a(iC5, jVar4, iC5, c0128aB6);
                }
                ph.v1.j(g.a.d(), dVarC12, jVar4);
                androidx.compose.ui.d dVarD6 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
                z.m1 m1VarA6 = z.k1.a(z.b.a(), bVar3, jVar4, 54);
                int iC6 = c9.u1.c(jVar4);
                x0.a2 a2VarY13 = jVar4.y();
                androidx.compose.ui.d dVarC13 = androidx.compose.ui.c.c(dVarD6, jVar4);
                e0.a aVarA6 = g.a.a();
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVarA6);
                } else {
                    jVar4.z();
                }
                ph.v1.j(g.a.c(), m1VarA6, jVar4);
                ph.v1.j(g.a.e(), a2VarY13, jVar4);
                g.a.C0128a c0128aB7 = g.a.b();
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iC6))) {
                    l9.i.a(iC6, jVar4, iC6, c0128aB7);
                }
                ph.v1.j(g.a.d(), dVarC13, jVar4);
                kVar2 = kVar2;
                aVar3 = aVar5;
                aVar4 = aVar6;
                bVar = bVar3;
                t0.ff.b(f3.q.c(R.string.editor_splash_thickness_label, jVar4), null, b3.l.a(jVar4).a(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar4).a(), jVar4, 0, 0, 65530);
                int i16 = this.f10330p;
                t0.ff.b(i8.c.b(i16, "dp"), null, b3.l.a(jVar4).b(), 0L, p.a.c(), null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar4).a(), jVar4, 196608, 0, 65498);
                jVar4.H();
                float f15 = i16;
                jh.d dVarH5 = di.t.h(2.0f, 12.0f);
                t0.jb jbVarD6 = t0.rb.d(c2.n0.c(4294944550L), c2.n0.c(4294944550L), q1.b1.c(0.24f, c2.n0.c(4294944550L)), jVar4);
                jVar4.L(-702877672);
                Object obj6 = this.f10331q;
                boolean zK6 = jVar4.K(obj6);
                Object objG6 = jVar4.g();
                obj5 = obj5;
                if (zK6 || objG6 == obj5) {
                    objG6 = new b9.e4(obj6, 2);
                    jVar4.C(objG6);
                }
                jVar4.B();
                t0.dc.a(f15, (eh.l) objG6, null, z10, dVarH5, 9, jbVarD6, null, jVar4, 196608, 324);
                jVar4 = jVar4;
                jVar4.H();
            }
            jVar4.B();
            jVar4.L(-850712528);
            if (this.f10318b) {
                z.q qVarA8 = z.o.a(kVar2, aVar4, jVar4, 0);
                int iC7 = c9.u1.c(jVar4);
                x0.a2 a2VarY14 = jVar4.y();
                d.a aVar9 = aVar3;
                androidx.compose.ui.d dVarC14 = androidx.compose.ui.c.c(aVar9, jVar4);
                e0.a aVarA7 = g.a.a();
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVarA7);
                } else {
                    jVar4.z();
                }
                ph.v1.j(g.a.c(), qVarA8, jVar4);
                ph.v1.j(g.a.e(), a2VarY14, jVar4);
                g.a.C0128a c0128aB8 = g.a.b();
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iC7))) {
                    l9.i.a(iC7, jVar4, iC7, c0128aB8);
                }
                ph.v1.j(g.a.d(), dVarC14, jVar4);
                androidx.compose.ui.d dVarD7 = androidx.compose.foundation.layout.g.d(aVar9, 1.0f);
                z.m1 m1VarA7 = z.k1.a(z.b.a(), bVar, jVar4, 54);
                int iC8 = c9.u1.c(jVar4);
                x0.a2 a2VarY15 = jVar4.y();
                androidx.compose.ui.d dVarC15 = androidx.compose.ui.c.c(dVarD7, jVar4);
                e0.a aVarA8 = g.a.a();
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVarA8);
                } else {
                    jVar4.z();
                }
                ph.v1.j(g.a.c(), m1VarA7, jVar4);
                ph.v1.j(g.a.e(), a2VarY15, jVar4);
                g.a.C0128a c0128aB9 = g.a.b();
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iC8))) {
                    l9.i.a(iC8, jVar4, iC8, c0128aB9);
                }
                ph.v1.j(g.a.d(), dVarC15, jVar4);
                x0.j jVar5 = jVar4;
                Object obj7 = obj5;
                t0.ff.b(f3.q.c(R.string.editor_splash_fade_duration_label, jVar4), null, b3.l.a(jVar4).a(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar4).a(), jVar5, 0, 0, 65530);
                int i17 = this.f10332r;
                t0.ff.b(i8.c.b(i17, "ms"), null, b3.l.a(jVar5).b(), 0L, p.a.c(), null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar5).a(), jVar5, 196608, 0, 65498);
                jVar5.H();
                float f16 = i17;
                jh.d dVarH6 = di.t.h(150.0f, 1200.0f);
                t0.jb jbVarD7 = t0.rb.d(c2.n0.c(4294944550L), c2.n0.c(4294944550L), q1.b1.c(0.24f, c2.n0.c(4294944550L)), jVar5);
                jVar5.L(-702819563);
                Object obj8 = this.f10333s;
                boolean zK7 = jVar5.K(obj8);
                Object objG7 = jVar5.g();
                if (zK7 || objG7 == obj7) {
                    objG7 = new pe(obj8, 0);
                    jVar5.C(objG7);
                }
                jVar5.B();
                t0.dc.a(f16, (eh.l) objG7, null, z10, dVarH6, 20, jbVarD7, null, jVar5, 196608, 324);
                jVar2 = jVar5;
                jVar2.H();
            } else {
                jVar2 = jVar4;
            }
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
