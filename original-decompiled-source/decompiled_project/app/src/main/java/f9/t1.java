package f9;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import z.b;

/* loaded from: classes.dex */
public final class t1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t0.e2 f10528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10529h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10530j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10531k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f10532l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f10533m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10534n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10535p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f10536q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10537r;

    /* JADX WARN: Multi-variable type inference failed */
    public t1(boolean z10, eh.a<pg.f0> aVar, String str, eh.l<? super String, pg.f0> lVar, int i10, int i11, t0.e2 e2Var, eh.a<pg.f0> aVar2, eh.a<pg.f0> aVar3, eh.a<pg.f0> aVar4, long j10, String str2, eh.l<? super String, pg.f0> lVar2, eh.a<pg.f0> aVar5, boolean z11, eh.a<pg.f0> aVar6) {
        this.f10522a = z10;
        this.f10523b = aVar;
        this.f10524c = str;
        this.f10525d = lVar;
        this.f10526e = i10;
        this.f10527f = i11;
        this.f10528g = e2Var;
        this.f10529h = aVar2;
        this.f10530j = aVar3;
        this.f10531k = aVar4;
        this.f10532l = j10;
        this.f10533m = str2;
        this.f10534n = lVar2;
        this.f10535p = aVar5;
        this.f10536q = z11;
        this.f10537r = aVar6;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        String strB;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            float f10 = 8;
            float f11 = 6;
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar, f10, f11);
            z.q qVarA = z.o.a(z.b.h(f11), d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
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
            b.j jVar3 = z.b.f34444a;
            f.b bVar2 = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(jVar3, bVar2, jVar2, 48);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, jVar2);
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
            ph.v1.j(bVar, m1VarA, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            float f12 = 36;
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, f12);
            boolean z10 = this.f10522a;
            long j10 = this.f10532l;
            t0.e2 e2Var = this.f10528g;
            t0.s4.c(this.f10523b, dVarN, false, null, f1.c.b(-1021500791, new r1(z10, j10, e2Var), jVar2), jVar2, 196656, 28);
            String strC = f3.q.c(R.string.editor_html_find_placeholder, jVar2);
            w1.d dVarA = r0.p0.a();
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String str = this.f10524c;
            d1.b(str, this.f10525d, strC, layoutWeightElement, dVarA, jVar2, 0);
            int i10 = this.f10526e;
            int i11 = this.f10527f;
            if (i10 >= 500) {
                jVar2.L(-1726833173);
                strB = f3.q.d(R.string.editor_html_find_match_count_capped, new Object[]{Integer.valueOf(i11), Integer.valueOf(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION)}, jVar2);
                jVar2.B();
            } else if (i10 > 0) {
                jVar2.L(-1726828866);
                strB = f3.q.d(R.string.editor_html_find_match_count, new Object[]{Integer.valueOf(i11), Integer.valueOf(i10)}, jVar2);
                jVar2.B();
            } else {
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -1726825309, R.string.editor_html_find_no_matches, jVar2);
            }
            t0.ff.b(strB, androidx.compose.foundation.layout.f.j(aVar, f10, CropImageView.DEFAULT_ASPECT_RATIO, 2), (mh.x.A(str) || i10 != 0) ? e2Var.f25773s : e2Var.f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26551n, jVar2, 48, 0, 65528);
            x0.j jVar4 = jVar2;
            t0.s4.c(this.f10529h, androidx.compose.foundation.layout.g.n(aVar, f12), i10 > 0, null, c.f9155p, jVar4, 196656, 24);
            t0.s4.c(this.f10530j, androidx.compose.foundation.layout.g.n(aVar, f12), i10 > 0, null, c.f9156q, jVar4, 196656, 24);
            t0.s4.c(this.f10531k, androidx.compose.foundation.layout.g.n(aVar, f12), false, null, c.f9157r, jVar4, 196656, 28);
            jVar4.H();
            jVar4.L(588127878);
            if (z10) {
                z.m1 m1VarA2 = z.k1.a(z.b.h(f11), bVar2, jVar4, 54);
                int iD3 = jVar4.D();
                x0.a2 a2VarY3 = jVar4.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar, jVar4);
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVar2);
                } else {
                    jVar4.z();
                }
                ph.v1.j(bVar, m1VarA2, jVar4);
                ph.v1.j(dVar, a2VarY3, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar4, iD3, c0128a);
                }
                ph.v1.j(cVar, dVarC3, jVar4);
                String strB2 = r.e2.b(aVar, 30, jVar4, R.string.editor_html_replace_placeholder, jVar4);
                w1.d dVarA2 = r0.a0.a();
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                d1.b(this.f10533m, this.f10534n, strB2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), dVarA2, jVar4, 0);
                boolean z11 = this.f10536q;
                t0.x0.d(this.f10535p, null, i10 > 0 && !z11, null, null, androidx.compose.foundation.layout.f.c(10, CropImageView.DEFAULT_ASPECT_RATIO, 2), f1.c.b(-549454034, new s1(i10, j10), jVar4), jVar4, 817889280, 378);
                t0.x0.b(this.f10537r, null, i10 > 0 && !z11, null, null, null, androidx.compose.foundation.layout.f.c(12, CropImageView.DEFAULT_ASPECT_RATIO, 2), c.f9158s, jVar4, 817889280, 378);
                jVar4 = jVar4;
                jVar4.H();
            }
            jVar4.B();
            jVar4.H();
        }
        return pg.f0.f21461a;
    }
}
