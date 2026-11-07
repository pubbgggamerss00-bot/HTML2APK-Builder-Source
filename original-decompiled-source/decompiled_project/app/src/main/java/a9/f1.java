package a9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import i8.a;
import j1.d;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.z9;

/* loaded from: classes.dex */
public final class f1 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i8.a f200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f204e;

    public f1(i8.a aVar, boolean z10, String str, String str2, eh.a<pg.f0> aVar2) {
        this.f200a = aVar;
        this.f201b = z10;
        this.f202c = str;
        this.f203d = str2;
        this.f204e = aVar2;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        i8.a aVar = this.f200a;
        if (aVar instanceof a.b) {
            jVar2.L(1199084979);
            z9.a(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 31, 0L, 0L, null, jVar2);
            jVar2.B();
        } else {
            boolean z10 = aVar instanceof a.C0133a;
            d.a aVar2 = d.a.f1143b;
            if (z10) {
                jVar2.L(-1623883243);
                if (this.f201b || !(mh.x.A(this.f202c) || mh.x.A(this.f203d))) {
                    jVar2.L(1199547034);
                    ff.b(f3.q.c(R.string.premium_payment_disclaimer, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26549l, jVar2, 0, 0, 65018);
                    jVar2 = jVar2;
                    jVar2.B();
                } else {
                    jVar2.L(1199336172);
                    t0.x0.c(this.f204e, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, null, null, null, null, c.f153h, jVar2, 805306416, 508);
                    jVar2.B();
                }
                jVar2.B();
            } else if (aVar instanceof a.d) {
                jVar2.L(1199956358);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar2, jVar2);
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
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                ff.b(f3.q.c(R.string.premium_error_payment, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25777w, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26548k, jVar2, 0, 0, 65018);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 8), jVar2);
                t0.x0.c(this.f204e, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, null, null, null, null, c.f154i, jVar2, 805306416, 508);
                jVar2.H();
                jVar2.B();
            } else {
                jVar2.L(1200680332);
                t0.x0.c(this.f204e, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, null, null, null, null, c.f155j, jVar2, 805306416, 508);
                jVar2.B();
            }
        }
        return pg.f0.f21461a;
    }
}
