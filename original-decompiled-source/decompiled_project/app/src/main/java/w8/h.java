package w8;

import android.content.Context;
import androidx.compose.ui.d;
import b9.p1;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import e9.k;
import eh.q;
import i2.e0;
import i2.g;
import j1.d;
import kotlin.jvm.internal.r;
import p0.h8;
import p0.hb;
import pg.f0;
import ph.m0;
import ph.v1;
import q1.b1;
import q1.i2;
import t0.d1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.x0;
import t0.z0;
import w1.d;
import w1.m;
import x0.a2;
import x0.j;
import x0.n1;
import x0.s3;
import z.f1;
import z.i;
import z.o;

/* loaded from: classes.dex */
public final class h implements q<i, j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f31456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f31458c;

    public h(f1 f1Var, Context context, n1<Boolean> n1Var) {
        this.f31456a = f1Var;
        this.f31457b = context;
        this.f31458c = n1Var;
    }

    @Override // eh.q
    public final f0 b(i iVar, j jVar, Integer num) {
        i FadingPage = iVar;
        j jVar2 = jVar;
        int iIntValue = num.intValue();
        r.e(FadingPage, "$this$FadingPage");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            float f10 = 20;
            androidx.compose.ui.d dVarE = m0.e(androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.f976c, f10, 8), m0.c(jVar2), true);
            f1 f1Var = this.f31456a;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(dVarE, CropImageView.DEFAULT_ASPECT_RATIO, f1Var.c(), CropImageView.DEFAULT_ASPECT_RATIO, f1Var.a(), 5);
            float f11 = 16;
            z.q qVarA = o.a(z.b.h(f11), d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            v1.j(g.a.f13867f, qVarA, jVar2);
            v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, jVar2);
            d.a aVar2 = d.a.f1143b;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 4), jVar2);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            h0.e eVarA = h0.f.a(f10);
            s3 s3Var = f2.f25858a;
            d1.a(dVarD, eVarA, z0.a(b1.c(0.85f, ((e2) jVar2.f(s3Var)).I), jVar2, 0), null, null, a.f31430c, jVar2, 196614, 24);
            g.b(h8.a(), "1", f3.q.c(R.string.free_premium_step1_title, jVar2), f3.q.c(R.string.free_premium_step1_desc, jVar2), jVar2, 48);
            w1.d dVarB = hb.f20881a;
            if (dVarB == null) {
                d.a aVar3 = new d.a("Filled.ThumbUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = m.f31210a;
                i2 i2Var = new i2(b1.f21648b);
                w1.e eVar = new w1.e();
                eVar.h(1.0f, 21.0f);
                eVar.e(4.0f);
                eVar.f(5.0f, 9.0f);
                eVar.f(1.0f, 9.0f);
                eVar.l(12.0f);
                eVar.a();
                eVar.h(23.0f, 10.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                eVar.e(-6.31f);
                eVar.g(0.95f, -4.57f);
                eVar.g(0.03f, -0.32f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
                eVar.f(14.17f, 1.0f);
                eVar.f(7.59f, 7.59f);
                eVar.b(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
                eVar.l(10.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                eVar.e(9.0f);
                eVar.c(0.83f, CropImageView.DEFAULT_ASPECT_RATIO, 1.54f, -0.5f, 1.84f, -1.22f);
                eVar.g(3.02f, -7.05f);
                eVar.c(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
                eVar.l(-2.0f);
                eVar.a();
                d.a.a(aVar3, eVar.f31100a, 0, i2Var);
                dVarB = aVar3.b();
                hb.f20881a = dVarB;
            }
            g.b(dVarB, "2", f3.q.c(R.string.free_premium_step2_title, jVar2), f3.q.c(R.string.free_premium_step2_desc, jVar2), jVar2, 48);
            g.b(p0.d1.a(), "3", f3.q.c(R.string.free_premium_step3_title, jVar2), f3.q.c(R.string.free_premium_step3_desc, jVar2), jVar2, 48);
            jVar2.L(1035858300);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new p1(this.f31458c, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            x0.c((eh.a) objG, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(f11), null, null, null, a.f31431d, jVar2, 805306422, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
            jVar2.L(1035876573);
            Context context = this.f31457b;
            boolean zL = jVar2.l(context);
            Object objG2 = jVar2.g();
            if (zL || objG2 == c0321a) {
                objG2 = new k(context, 2);
                jVar2.C(objG2);
            }
            jVar2.B();
            x0.a((eh.a) objG2, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(f11), null, null, null, null, a.f31432e, jVar2, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
            ff.b(f3.q.c(R.string.free_premium_note, jVar2), null, ((e2) jVar2.f(s3Var)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26549l, jVar2, 0, 0, 65530);
            p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar2), 24), jVar2);
            jVar2.H();
        }
        return f0.f21461a;
    }
}
