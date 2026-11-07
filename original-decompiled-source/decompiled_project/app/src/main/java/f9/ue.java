package f9;

import android.net.Uri;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import g2.j;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class ue implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f10728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f10730c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f10732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Uri f10735h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f10736j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10737k;

    /* JADX WARN: Multi-variable type inference failed */
    public ue(Uri uri, boolean z10, eh.l<? super Boolean, pg.f0> lVar, boolean z11, eh.l<? super Boolean, pg.f0> lVar2, boolean z12, eh.a<pg.f0> aVar, Uri uri2, String str, eh.a<pg.f0> aVar2) {
        this.f10728a = uri;
        this.f10729b = z10;
        this.f10730c = lVar;
        this.f10731d = z11;
        this.f10732e = lVar2;
        this.f10733f = z12;
        this.f10734g = aVar;
        this.f10735h = uri2;
        this.f10736j = str;
        this.f10737k = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0218  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        Uri uri;
        g.a.c cVar;
        float f10;
        f.b bVar;
        float f11;
        g.a.C0128a c0128a;
        float f12;
        g.a.d dVar;
        String strB;
        x0.j jVar2;
        e0.a aVar;
        g.a.C0128a c0128a2;
        g.a.C0128a c0128a3;
        x0.j jVar3;
        e0.a aVar2;
        g.a.C0128a c0128a4;
        z.r Card = rVar;
        x0.j jVar4 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar4.s()) {
            jVar4.v();
        } else {
            d.a aVar3 = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), 16);
            float f13 = 12;
            b.i iVarH = z.b.h(f13);
            f.a aVar4 = d.a.f14614m;
            z.q qVarA = z.o.a(iVarH, aVar4, jVar4, 6);
            int iD = jVar4.D();
            x0.a2 a2VarY = jVar4.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar4);
            i2.g.f13861o.getClass();
            e0.a aVar5 = g.a.f13863b;
            if (jVar4.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar4.r();
            if (jVar4.m()) {
                jVar4.w(aVar5);
            } else {
                jVar4.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, qVarA, jVar4);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarY, jVar4);
            g.a.C0128a c0128a5 = g.a.f13868g;
            if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar4, iD, c0128a5);
            }
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, jVar4);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
            b.j jVar5 = z.b.f34444a;
            f.b bVar3 = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(jVar5, bVar3, jVar4, 48);
            int iD2 = jVar4.D();
            x0.a2 a2VarY2 = jVar4.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar4);
            if (jVar4.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar4.r();
            if (jVar4.m()) {
                jVar4.w(aVar5);
            } else {
                jVar4.z();
            }
            ph.v1.j(bVar2, m1VarA, jVar4);
            ph.v1.j(dVar2, a2VarY2, jVar4);
            if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar4, iD2, c0128a5);
            }
            ph.v1.j(cVar2, dVarC2, jVar4);
            float f14 = 10;
            float f15 = 1;
            androidx.compose.ui.d dVarA = t.o.a(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(aVar3, 44), h0.f.a(f14)), b3.l.a(jVar4).G, q1.y1.f21750a), f15, q1.b1.c(0.5f, b3.l.a(jVar4).B), h0.f.a(f14));
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD3 = jVar4.D();
            x0.a2 a2VarY3 = jVar4.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarA, jVar4);
            if (jVar4.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar4.r();
            if (jVar4.m()) {
                jVar4.w(aVar5);
            } else {
                jVar4.z();
            }
            ph.v1.j(bVar2, l0VarD, jVar4);
            ph.v1.j(dVar2, a2VarY3, jVar4);
            if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar4, iD3, c0128a5);
            }
            ph.v1.j(cVar2, dVarC3, jVar4);
            j.a.C0100a c0100a = j.a.f11397a;
            Uri uri2 = this.f10728a;
            if (uri2 != null) {
                jVar4.L(-1912468287);
                bVar = bVar3;
                f10 = f15;
                cVar = cVar2;
                h7.r.a(uri2, null, androidx.compose.foundation.layout.g.f976c, c0100a, jVar4, 1573296);
                uri = uri2;
                jVar4.B();
            } else {
                uri = uri2;
                cVar = cVar2;
                f10 = f15;
                bVar = bVar3;
                Uri uri3 = this.f10735h;
                if (uri3 != null) {
                    jVar4.L(-1912097341);
                    h7.r.a(uri3, null, androidx.compose.foundation.layout.g.f976c, c0100a, jVar4, 1573296);
                    jVar4.B();
                } else {
                    jVar4.L(-1911751815);
                    f11 = f14;
                    c0128a = c0128a5;
                    f12 = f10;
                    dVar = dVar2;
                    t0.t4.b(p0.n5.a(), null, androidx.compose.foundation.layout.g.n(aVar3, 24), q1.b1.c(0.6f, b3.l.a(jVar4).f25773s), jVar4, 432, 0);
                    jVar4 = jVar4;
                    jVar4.B();
                    jVar4.H();
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar3, f13), jVar4);
                    z.o1 o1Var = z.o1.f34600a;
                    androidx.compose.ui.d dVarA2 = o1Var.a(aVar3, 1.0f);
                    b.k kVar = z.b.f34446c;
                    z.q qVarA2 = z.o.a(kVar, aVar4, jVar4, 0);
                    int iD4 = jVar4.D();
                    x0.a2 a2VarY4 = jVar4.y();
                    androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarA2, jVar4);
                    if (jVar4.t() != null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar4.r();
                    if (jVar4.m()) {
                        jVar4.w(aVar5);
                    } else {
                        jVar4.z();
                    }
                    ph.v1.j(bVar2, qVarA2, jVar4);
                    ph.v1.j(dVar, a2VarY4, jVar4);
                    if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD4))) {
                        l9.i.a(iD4, jVar4, iD4, c0128a);
                    }
                    ph.v1.j(cVar, dVarC4, jVar4);
                    if (uri != null) {
                        jVar4.L(-1911142231);
                        strB = this.f10736j;
                        if (mh.x.A(strB)) {
                            strB = f3.q.c(R.string.editor_splash_custom_active, jVar4);
                        }
                        jVar4.B();
                    } else {
                        strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar4, -1910995353, R.string.editor_splash_using_icon, jVar4);
                    }
                    t2.l0 l0Var = b3.l.b(jVar4).f26548k;
                    x2.p pVar = x2.p.f32032e;
                    x0.j jVar6 = jVar4;
                    float f16 = f12;
                    g.a.c cVar3 = cVar;
                    g.a.d dVar3 = dVar;
                    g.a.C0128a c0128a6 = c0128a;
                    float f17 = f11;
                    t0.ff.b(strB, null, b3.l.a(jVar4).f25771q, 0L, pVar, null, 0L, null, 0L, 2, false, 1, 0, l0Var, jVar6, 196608, 3120, 55258);
                    float f18 = 2;
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, f18), jVar6);
                    t0.ff.b(uri != null ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar6, -1910391318, R.string.editor_splash_preview, jVar6) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar6, -1910276060, R.string.editor_splash_fallback_hint, jVar6), null, b3.l.a(jVar6).f25773s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, b3.l.b(jVar6).f26549l, jVar6, 0, 3120, 55290);
                    jVar6.H();
                    jVar6.H();
                    boolean z10 = this.f10729b;
                    eh.a<pg.f0> aVar6 = this.f10734g;
                    if (uri != null) {
                        jVar6.L(-596386406);
                        androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
                        z.m1 m1VarA2 = z.k1.a(z.b.h(f17), d.a.f14611j, jVar6, 6);
                        int iD5 = jVar6.D();
                        x0.a2 a2VarY5 = jVar6.y();
                        androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarD2, jVar6);
                        if (jVar6.t() == null) {
                            c9.u1.d();
                            throw null;
                        }
                        jVar6.r();
                        if (jVar6.m()) {
                            aVar = aVar5;
                            jVar6.w(aVar);
                        } else {
                            aVar = aVar5;
                            jVar6.z();
                        }
                        ph.v1.j(bVar2, m1VarA2, jVar6);
                        ph.v1.j(dVar3, a2VarY5, jVar6);
                        if (jVar6.m() || !kotlin.jvm.internal.r.a(jVar6.g(), Integer.valueOf(iD5))) {
                            c0128a2 = c0128a6;
                            l9.i.a(iD5, jVar6, iD5, c0128a2);
                        } else {
                            c0128a2 = c0128a6;
                        }
                        ph.v1.j(cVar3, dVarC5, jVar6);
                        androidx.compose.ui.d dVarA3 = o1Var.a(aVar3, 1.0f);
                        z.g1 g1Var = t0.m0.f26400a;
                        g.a.C0128a c0128a7 = c0128a2;
                        t0.x0.c(this.f10737k, dVarA3, z10, null, t0.m0.e(b3.l.a(jVar6).f25777w, jVar6), a9.d2.a(f16, q1.b1.c(0.5f, b3.l.a(jVar6).f25777w)), null, e.R, jVar6, 805306368, 424);
                        t0.x0.a(aVar6, o1Var.a(aVar3, 1.0f), z10, null, t0.m0.a(b3.l.a(jVar6).f25751a, 0L, 0L, jVar6, 14), null, null, null, e.S, jVar6, 805306368, 488);
                        jVar6.H();
                        p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, f17), jVar6);
                        float f19 = (float) 0.5d;
                        t0.v2.a(null, f19, q1.b1.c(0.25f, b3.l.a(jVar6).B), jVar6, 48, 1);
                        androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
                        jVar6.L(-850448969);
                        final eh.l<Boolean, pg.f0> lVar = this.f10730c;
                        boolean zK = jVar6.K(lVar);
                        final boolean z11 = this.f10731d;
                        boolean zC = zK | jVar6.c(z11);
                        Object objG = jVar6.g();
                        Object obj = j.a.f31715a;
                        if (zC || objG == obj) {
                            objG = new eh.a() { // from class: f9.re
                                @Override // eh.a
                                public final Object invoke() {
                                    lVar.invoke(Boolean.valueOf(!z11));
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar6.C(objG);
                        }
                        jVar6.B();
                        androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD3, z10, null, null, (eh.a) objG, 6), CropImageView.DEFAULT_ASPECT_RATIO, f17, 1);
                        b.g gVar = z.b.f34450g;
                        f.b bVar4 = bVar;
                        z.m1 m1VarA3 = z.k1.a(gVar, bVar4, jVar6, 54);
                        int iD6 = jVar6.D();
                        x0.a2 a2VarY6 = jVar6.y();
                        androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarJ, jVar6);
                        if (jVar6.t() == null) {
                            c9.u1.d();
                            throw null;
                        }
                        jVar6.r();
                        if (jVar6.m()) {
                            jVar6.w(aVar);
                        } else {
                            jVar6.z();
                        }
                        ph.v1.j(bVar2, m1VarA3, jVar6);
                        ph.v1.j(dVar3, a2VarY6, jVar6);
                        if (jVar6.m() || !kotlin.jvm.internal.r.a(jVar6.g(), Integer.valueOf(iD6))) {
                            c0128a3 = c0128a7;
                            l9.i.a(iD6, jVar6, iD6, c0128a3);
                        } else {
                            c0128a3 = c0128a7;
                        }
                        ph.v1.j(cVar3, dVarC6, jVar6);
                        androidx.compose.ui.d dVarA4 = o1Var.a(aVar3, 1.0f);
                        z.q qVarA3 = z.o.a(kVar, aVar4, jVar6, 0);
                        int iD7 = jVar6.D();
                        x0.a2 a2VarY7 = jVar6.y();
                        androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarA4, jVar6);
                        if (jVar6.t() == null) {
                            c9.u1.d();
                            throw null;
                        }
                        jVar6.r();
                        if (jVar6.m()) {
                            jVar6.w(aVar);
                        } else {
                            jVar6.z();
                        }
                        ph.v1.j(bVar2, qVarA3, jVar6);
                        ph.v1.j(dVar3, a2VarY7, jVar6);
                        if (jVar6.m() || !kotlin.jvm.internal.r.a(jVar6.g(), Integer.valueOf(iD7))) {
                            l9.i.a(iD7, jVar6, iD7, c0128a3);
                        }
                        ph.v1.j(cVar3, dVarC7, jVar6);
                        g.a.C0128a c0128a8 = c0128a3;
                        e0.a aVar7 = aVar;
                        t0.ff.b(f3.q.c(R.string.editor_splash_fullscreen_label, jVar6), null, b3.l.a(jVar6).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar6).f26548k, jVar6, 196608, 0, 65498);
                        t0.ff.b(pd.d.a(aVar3, f18, jVar6, R.string.editor_splash_fullscreen_desc, jVar6), null, b3.l.a(jVar6).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar6).f26549l, jVar6, 0, 0, 65530);
                        jVar6.H();
                        jVar6.L(-702549269);
                        boolean zK2 = jVar6.K(lVar);
                        Object objG2 = jVar6.g();
                        if (zK2 || objG2 == obj) {
                            objG2 = new eh.l() { // from class: f9.se
                                @Override // eh.l
                                public final Object invoke(Object obj2) {
                                    Boolean bool = (Boolean) obj2;
                                    bool.booleanValue();
                                    lVar.invoke(bool);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar6.C(objG2);
                        }
                        jVar6.B();
                        long j10 = q1.b1.f21650d;
                        androidx.compose.material3.a.a(z11, (eh.l) objG2, null, z10, t0.td.a(j10, b3.l.a(jVar6).f25751a, jVar6), jVar6, 0, 76);
                        jVar6.H();
                        if (z11) {
                            t0.v2.a(null, f19, q1.b1.c(0.25f, b3.l.a(jVar6).B), jVar6, 48, 1);
                            androidx.compose.ui.d dVarD4 = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
                            jVar6.L(-850380289);
                            final eh.l<Boolean, pg.f0> lVar2 = this.f10732e;
                            boolean zK3 = jVar6.K(lVar2);
                            final boolean z12 = this.f10733f;
                            boolean zC2 = zK3 | jVar6.c(z12);
                            Object objG3 = jVar6.g();
                            if (zC2 || objG3 == obj) {
                                objG3 = new eh.a() { // from class: f9.te
                                    @Override // eh.a
                                    public final Object invoke() {
                                        lVar2.invoke(Boolean.valueOf(!z12));
                                        return pg.f0.f21461a;
                                    }
                                };
                                jVar6.C(objG3);
                            }
                            jVar6.B();
                            androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD4, z10, null, null, (eh.a) objG3, 6), CropImageView.DEFAULT_ASPECT_RATIO, f17, 1);
                            z.m1 m1VarA4 = z.k1.a(gVar, bVar4, jVar6, 54);
                            int iD8 = jVar6.D();
                            x0.a2 a2VarY8 = jVar6.y();
                            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(dVarJ2, jVar6);
                            if (jVar6.t() == null) {
                                c9.u1.d();
                                throw null;
                            }
                            jVar6.r();
                            if (jVar6.m()) {
                                aVar2 = aVar7;
                                jVar6.w(aVar2);
                            } else {
                                aVar2 = aVar7;
                                jVar6.z();
                            }
                            ph.v1.j(bVar2, m1VarA4, jVar6);
                            ph.v1.j(dVar3, a2VarY8, jVar6);
                            if (jVar6.m() || !kotlin.jvm.internal.r.a(jVar6.g(), Integer.valueOf(iD8))) {
                                c0128a4 = c0128a8;
                                l9.i.a(iD8, jVar6, iD8, c0128a4);
                            } else {
                                c0128a4 = c0128a8;
                            }
                            ph.v1.j(cVar3, dVarC8, jVar6);
                            androidx.compose.ui.d dVarA5 = o1Var.a(aVar3, 1.0f);
                            z.q qVarA4 = z.o.a(kVar, aVar4, jVar6, 0);
                            int iD9 = jVar6.D();
                            x0.a2 a2VarY9 = jVar6.y();
                            androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(dVarA5, jVar6);
                            if (jVar6.t() == null) {
                                c9.u1.d();
                                throw null;
                            }
                            jVar6.r();
                            if (jVar6.m()) {
                                jVar6.w(aVar2);
                            } else {
                                jVar6.z();
                            }
                            ph.v1.j(bVar2, qVarA4, jVar6);
                            ph.v1.j(dVar3, a2VarY9, jVar6);
                            if (jVar6.m() || !kotlin.jvm.internal.r.a(jVar6.g(), Integer.valueOf(iD9))) {
                                l9.i.a(iD9, jVar6, iD9, c0128a4);
                            }
                            ph.v1.j(cVar3, dVarC9, jVar6);
                            t0.ff.b(f3.q.c(R.string.editor_splash_hideloader_label, jVar6), null, b3.l.a(jVar6).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar6).f26548k, jVar6, 196608, 0, 65498);
                            t0.ff.b(pd.d.a(aVar3, f18, jVar6, R.string.editor_splash_hideloader_desc, jVar6), null, b3.l.a(jVar6).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar6).f26549l, jVar6, 0, 0, 65530);
                            jVar6.H();
                            jVar6.L(-702477653);
                            boolean zK4 = jVar6.K(lVar2);
                            Object objG4 = jVar6.g();
                            if (zK4 || objG4 == obj) {
                                objG4 = new r6(1, lVar2);
                                jVar6.C(objG4);
                            }
                            jVar6.B();
                            androidx.compose.material3.a.a(z12, (eh.l) objG4, null, z10, t0.td.a(j10, b3.l.a(jVar6).f25751a, jVar6), jVar6, 0, 76);
                            jVar3 = jVar6;
                            jVar3.H();
                        } else {
                            jVar3 = jVar6;
                        }
                        jVar3.B();
                        jVar2 = jVar3;
                    } else {
                        jVar6.L(-590121709);
                        jVar2 = jVar6;
                        t0.x0.c(aVar6, androidx.compose.foundation.layout.g.d(aVar3, 1.0f), z10, null, null, null, null, e.T, jVar2, 805306416, 504);
                        jVar2.B();
                    }
                    jVar2.H();
                }
            }
            f12 = f10;
            f11 = f14;
            dVar = dVar2;
            c0128a = c0128a5;
            jVar4.H();
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar3, f13), jVar4);
            z.o1 o1Var2 = z.o1.f34600a;
            androidx.compose.ui.d dVarA22 = o1Var2.a(aVar3, 1.0f);
            b.k kVar2 = z.b.f34446c;
            z.q qVarA22 = z.o.a(kVar2, aVar4, jVar4, 0);
            int iD42 = jVar4.D();
            x0.a2 a2VarY42 = jVar4.y();
            androidx.compose.ui.d dVarC42 = androidx.compose.ui.c.c(dVarA22, jVar4);
            if (jVar4.t() != null) {
            }
        }
        return pg.f0.f21461a;
    }
}
