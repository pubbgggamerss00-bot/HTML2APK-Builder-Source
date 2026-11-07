package f9;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.R;
import g2.j;
import h7.e;
import i2.e0;
import i2.g;
import j1.d;
import w7.l;

/* loaded from: classes.dex */
public final class ia implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9801c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f9803e;

    public ia(String str, eh.a<pg.f0> aVar, boolean z10, eh.a<pg.f0> aVar2, Uri uri) {
        this.f9799a = str;
        this.f9800b = aVar;
        this.f9801c = z10;
        this.f9802d = aVar2;
        this.f9803e = uri;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        d.a aVar;
        boolean z10;
        x0.j jVar2;
        x0.j jVar3;
        d.a aVar2;
        z.r EditorCard = rVar;
        x0.j jVar4 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
        if ((iIntValue & 17) == 16 && jVar4.s()) {
            jVar4.v();
        } else {
            t0.ff.b(f3.q.c(R.string.editor_section_icon, jVar4), null, b3.l.a(jVar4).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar4).f26545h, jVar4, 196608, 0, 65498);
            t0.ff.b(f3.q.c(R.string.editor_icon_description, jVar4), null, b3.l.a(jVar4).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar4).f26549l, jVar4, 0, 0, 65530);
            z.m1 m1VarA = z.k1.a(z.b.h(20), d.a.f14612k, jVar4, 54);
            int iD = jVar4.D();
            x0.a2 a2VarY = jVar4.y();
            d.a aVar3 = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar3, jVar4);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            if (jVar4.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar4.r();
            if (jVar4.m()) {
                jVar4.w(aVar4);
            } else {
                jVar4.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, m1VarA, jVar4);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar4);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar4, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar4);
            float f10 = 96;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(aVar3, f10), h0.f.a(24)), b3.l.a(jVar4).G, q1.y1.f21750a);
            j1.f fVar = d.a.f14606e;
            g2.l0 l0VarD = z.g.d(fVar, false);
            int iD2 = jVar4.D();
            x0.a2 a2VarY2 = jVar4.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar4);
            if (jVar4.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar4.r();
            if (jVar4.m()) {
                jVar4.w(aVar4);
            } else {
                jVar4.z();
            }
            ph.v1.j(bVar, l0VarD, jVar4);
            ph.v1.j(dVar, a2VarY2, jVar4);
            if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar4, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar4);
            boolean z11 = this.f9801c;
            if (z11) {
                jVar4.L(-1207343324);
                t0.z9.a(3, 0, 390, 24, b3.l.a(jVar4).f25751a, 0L, androidx.compose.foundation.layout.g.n(aVar3, 40), jVar4);
                jVar4.B();
                jVar2 = jVar4;
                aVar = aVar3;
                z10 = z11;
            } else {
                Uri uri = this.f9803e;
                if (uri != null) {
                    jVar4.L(-1207054187);
                    String string = uri.toString();
                    androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar3, f10);
                    final v1.b bVar2 = new v1.b(b3.l.a(jVar4).G);
                    final v1.b bVar3 = new v1.b(b3.l.a(jVar4).G);
                    i7.c cVar2 = new i7.c(string, (h7.c) jVar4.f(h7.p.f12340a), g7.e0.a((Context) jVar4.f(AndroidCompositionLocals_androidKt.f1281b)));
                    int i10 = i7.i.f14196b;
                    z10 = z11;
                    h7.b.a(cVar2, null, dVarN, new eh.l() { // from class: i7.h
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            e.b bVar4 = (e.b) obj;
                            if (bVar4 instanceof e.b.c) {
                                return new e.b.c(bVar2);
                            }
                            if (!(bVar4 instanceof e.b.C0113b)) {
                                return bVar4;
                            }
                            w7.e eVar = ((e.b.C0113b) bVar4).f12303b;
                            return eVar.f31327c instanceof l ? new e.b.C0113b(bVar3, eVar) : new e.b.C0113b(bVar3, eVar);
                        }
                    }, null, fVar, j.a.f11397a, 1.0f, null, 1, true, jVar4, 1573296, 0);
                    jVar4.B();
                    aVar = aVar3;
                    jVar2 = jVar4;
                } else {
                    aVar = aVar3;
                    z10 = z11;
                    jVar4.L(-1206502883);
                    t0.t4.b(p0.n5.a(), null, androidx.compose.foundation.layout.g.n(aVar, 40), b3.l.a(jVar4).f25773s, jVar4, 432, 0);
                    jVar2 = jVar4;
                    jVar2.B();
                }
            }
            jVar2.H();
            h0.e eVarA = h0.f.a(12);
            z.g1 g1Var = t0.m0.f26400a;
            x0.j jVar5 = jVar2;
            t0.x0.a(this.f9802d, null, false, eVarA, t0.m0.a(b3.l.a(jVar2).f25755c, 0L, 0L, jVar2, 14), null, null, null, e.K, jVar5, 805306368, 486);
            jVar5.H();
            jVar5.L(-1900631201);
            String str = this.f9799a;
            if (mh.x.A(str)) {
                jVar3 = jVar5;
                aVar2 = aVar;
            } else {
                jVar3 = jVar5;
                aVar2 = aVar;
                t0.ff.b(f3.q.d(R.string.editor_selected_icon, new Object[]{str}, jVar5), null, b3.l.a(jVar5).f25751a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar5).f26551n, jVar3, 0, 0, 65530);
            }
            jVar3.B();
            if (this.f9800b != null) {
                t0.x0.c(this.f9800b, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), !z10, null, null, null, null, e.L, jVar3, 805306416, 504);
            }
        }
        return pg.f0.f21461a;
    }
}
