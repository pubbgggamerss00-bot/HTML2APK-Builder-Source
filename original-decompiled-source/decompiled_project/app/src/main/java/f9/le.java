package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.Locale;
import q1.y1;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class le implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f9999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f10002h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f10003j;

    public le(boolean z10, String str, x0.n1<Boolean> n1Var, String str2, long j10, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3, String str3, long j11) {
        this.f9995a = z10;
        this.f9996b = str;
        this.f9997c = n1Var;
        this.f9998d = str2;
        this.f9999e = j10;
        this.f10000f = n1Var2;
        this.f10001g = n1Var3;
        this.f10002h = str3;
        this.f10003j = j11;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        e0.a aVar;
        g.a.C0128a c0128a;
        j.a.C0321a c0321a;
        g.a.C0128a c0128a2;
        le leVar;
        e0.a aVar2;
        g.a.C0128a c0128a3;
        z.r Card = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            float f10 = 8;
            d.a aVar3 = d.a.f1143b;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar3, 16, f10);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar4);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a4 = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a4);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
            jVar2.L(-851201210);
            Object objG = jVar2.g();
            j.a.C0321a c0321a2 = j.a.f31715a;
            if (objG == c0321a2) {
                objG = new je(this.f9997c, 0);
                jVar2.C(objG);
            }
            eh.a aVar5 = (eh.a) objG;
            jVar2.B();
            boolean z10 = this.f9995a;
            androidx.compose.ui.d dVarC2 = androidx.compose.foundation.b.c(dVarD, z10, null, null, aVar5, 6);
            float f11 = 10;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(dVarC2, CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
            b.g gVar = z.b.f34450g;
            f.b bVar2 = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(gVar, bVar2, jVar2, 54);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarJ, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar4);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, m1VarA, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a4);
            }
            ph.v1.j(cVar, dVarC3, jVar2);
            t0.ff.b(f3.q.c(R.string.editor_splash_bg_label, jVar2), null, b3.l.a(jVar2).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).f26548k, jVar2, 0, 0, 65530);
            b.j jVar3 = z.b.f34444a;
            z.m1 m1VarA2 = z.k1.a(jVar3, bVar2, jVar2, 48);
            int iD3 = jVar2.D();
            x0.a2 a2VarY3 = jVar2.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar3, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                aVar = aVar4;
                jVar2.w(aVar);
            } else {
                aVar = aVar4;
                jVar2.z();
            }
            ph.v1.j(bVar, m1VarA2, jVar2);
            ph.v1.j(dVar, a2VarY3, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                c0128a = c0128a4;
                l9.i.a(iD3, jVar2, iD3, c0128a);
            } else {
                c0128a = c0128a4;
            }
            ph.v1.j(cVar, dVarC4, jVar2);
            Locale locale = Locale.ROOT;
            String upperCase = this.f9998d.toUpperCase(locale);
            kotlin.jvm.internal.r.d(upperCase, "toUpperCase(...)");
            t2.l0 l0Var = b3.l.b(jVar2).f26548k;
            e0.a aVar6 = aVar;
            x2.r rVar2 = x2.f.f32016c;
            g.a.C0128a c0128a5 = c0128a;
            t0.ff.b(upperCase, null, b3.l.a(jVar2).f25773s, 0L, null, rVar2, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65466);
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar3, f11), jVar2);
            float f12 = 28;
            androidx.compose.ui.d dVarD2 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar3, f12), h0.f.a(f10));
            long j10 = this.f9999e;
            y1.a aVar7 = q1.y1.f21750a;
            float f13 = 1;
            z.g.a(t.o.a(androidx.compose.foundation.a.b(dVarD2, j10, aVar7), f13, b3.l.a(jVar2).B, h0.f.a(f10)), jVar2, 0);
            jVar2.H();
            jVar2.H();
            float f14 = (float) 0.5d;
            t0.v2.a(null, f14, q1.b1.c(0.25f, b3.l.a(jVar2).B), jVar2, 48, 1);
            androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
            jVar2.L(-851144276);
            Object objG2 = jVar2.g();
            if (objG2 == c0321a2) {
                objG2 = new b9.w3(this.f10000f, 1);
                jVar2.C(objG2);
            }
            jVar2.B();
            androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD3, z10, null, null, (eh.a) objG2, 6), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
            z.m1 m1VarA3 = z.k1.a(gVar, bVar2, jVar2, 54);
            int iD4 = jVar2.D();
            x0.a2 a2VarY4 = jVar2.y();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarJ2, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                c0321a = c0321a2;
                jVar2.w(aVar6);
            } else {
                c0321a = c0321a2;
                jVar2.z();
            }
            ph.v1.j(bVar, m1VarA3, jVar2);
            ph.v1.j(dVar, a2VarY4, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                c0128a2 = c0128a5;
                l9.i.a(iD4, jVar2, iD4, c0128a2);
            } else {
                c0128a2 = c0128a5;
            }
            ph.v1.j(cVar, dVarC5, jVar2);
            g.a.C0128a c0128a6 = c0128a2;
            j.a.C0321a c0321a3 = c0321a;
            t0.ff.b(f3.q.c(R.string.editor_splash_loader_style_label, jVar2), null, b3.l.a(jVar2).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).f26548k, jVar2, 0, 0, 65530);
            String str = this.f9996b;
            t0.ff.b(kotlin.jvm.internal.r.a(str, "bar") ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -703267204, R.string.editor_splash_loader_bar, jVar2) : kotlin.jvm.internal.r.a(str, "none") ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -703264515, R.string.editor_splash_loader_none, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -703261857, R.string.editor_splash_loader_circle, jVar2), null, b3.l.a(jVar2).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).f26548k, jVar2, 0, 0, 65530);
            x0.j jVar4 = jVar2;
            jVar4.H();
            jVar4.L(-851106275);
            if (!kotlin.jvm.internal.r.a(str, "none")) {
                t0.v2.a(null, f14, q1.b1.c(0.25f, b3.l.a(jVar4).B), jVar4, 48, 1);
                androidx.compose.ui.d dVarD4 = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
                jVar4.L(-851093588);
                Object objG3 = jVar4.g();
                if (objG3 == c0321a3) {
                    leVar = this;
                    final x0.n1<Boolean> n1Var = leVar.f10001g;
                    objG3 = new eh.a() { // from class: f9.ke
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var.setValue(Boolean.TRUE);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar4.C(objG3);
                } else {
                    leVar = this;
                }
                jVar4.B();
                androidx.compose.ui.d dVarJ3 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD4, z10, null, null, (eh.a) objG3, 6), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
                z.m1 m1VarA4 = z.k1.a(gVar, bVar2, jVar4, 54);
                int iD5 = jVar4.D();
                x0.a2 a2VarY5 = jVar4.y();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarJ3, jVar4);
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    aVar2 = aVar6;
                    jVar4.w(aVar2);
                } else {
                    aVar2 = aVar6;
                    jVar4.z();
                }
                ph.v1.j(bVar, m1VarA4, jVar4);
                ph.v1.j(dVar, a2VarY5, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD5))) {
                    c0128a3 = c0128a6;
                    l9.i.a(iD5, jVar4, iD5, c0128a3);
                } else {
                    c0128a3 = c0128a6;
                }
                ph.v1.j(cVar, dVarC6, jVar4);
                g.a.C0128a c0128a7 = c0128a3;
                e0.a aVar8 = aVar2;
                t0.ff.b(f3.q.c(R.string.editor_splash_loader_color_label, jVar4), null, b3.l.a(jVar4).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar4).f26548k, jVar4, 0, 0, 65530);
                z.m1 m1VarA5 = z.k1.a(jVar3, bVar2, jVar4, 48);
                int iD6 = jVar4.D();
                x0.a2 a2VarY6 = jVar4.y();
                androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(aVar3, jVar4);
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVar8);
                } else {
                    jVar4.z();
                }
                ph.v1.j(bVar, m1VarA5, jVar4);
                ph.v1.j(dVar, a2VarY6, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD6))) {
                    l9.i.a(iD6, jVar4, iD6, c0128a7);
                }
                ph.v1.j(cVar, dVarC7, jVar4);
                String upperCase2 = this.f10002h.toUpperCase(locale);
                kotlin.jvm.internal.r.d(upperCase2, "toUpperCase(...)");
                t0.ff.b(upperCase2, null, b3.l.a(jVar4).f25773s, 0L, null, rVar2, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar4).f26548k, jVar4, 0, 0, 65466);
                jVar4 = jVar4;
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar3, f11), jVar4);
                z.g.a(t.o.a(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(aVar3, f12), h0.f.a(f10)), this.f10003j, aVar7), f13, b3.l.a(jVar4).B, h0.f.a(f10)), jVar4, 0);
                jVar4.H();
                jVar4.H();
            }
            jVar4.B();
            jVar4.H();
        }
        return pg.f0.f21461a;
    }
}
