package j9;

import android.content.Context;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j9.x1;
import s8.e2;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import x0.j;
import x0.r3;
import x0.s3;

/* loaded from: classes.dex */
public final class s0 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f15522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.a f15523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f15525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1 f15526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f15527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f15528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f15529h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f15530j;

    public s0(z.f1 f1Var, x1.a aVar, boolean z10, p5.x xVar, x1 x1Var, Context context, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2, r3<Boolean> r3Var) {
        this.f15522a = f1Var;
        this.f15523b = aVar;
        this.f15524c = z10;
        this.f15525d = xVar;
        this.f15526e = x1Var;
        this.f15527f = context;
        this.f15528g = n1Var;
        this.f15529h = n1Var2;
        this.f15530j = r3Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        float f10;
        d.a aVar;
        boolean z10;
        j.a.C0321a c0321a;
        boolean z11;
        p5.x xVar;
        float f11;
        d.a aVar2;
        x1.a aVar3;
        s3 s3Var;
        s0 s0Var;
        Context context;
        long jC;
        boolean z12;
        final boolean z13;
        r3<Boolean> r3Var;
        final x1.a aVar4;
        z.i BackgroundBox = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(BackgroundBox, "$this$BackgroundBox");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarE = ph.m0.e(androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.f976c, this.f15522a), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), ph.m0.c(jVar2), true);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarE, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar5 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar5);
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
            x1.a aVar6 = this.f15523b;
            String str = aVar6.f15636a;
            float f12 = 8;
            d.a aVar7 = d.a.f1143b;
            e.b(str, androidx.compose.foundation.layout.f.l(aVar7, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), jVar2, 48);
            String str2 = aVar6.f15638c;
            s3 s3Var2 = of.f26647a;
            t2.l0 l0Var = ((nf) jVar2.f(s3Var2)).f26547j;
            s3 s3Var3 = f2.f25858a;
            float f13 = 16;
            ff.b(str2, androidx.compose.foundation.layout.f.l(aVar7, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, f13, 5), ((e2) jVar2.f(s3Var3)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 48, 0, 65528);
            x0.j jVar3 = jVar2;
            jVar3.L(-1415582009);
            j.a.C0321a c0321a2 = j.a.f31715a;
            boolean z14 = this.f15524c;
            p5.x xVar2 = this.f15525d;
            if (z14) {
                jVar3.L(-1415579352);
                boolean zL = jVar3.l(xVar2);
                Object objG = jVar3.g();
                if (zL || objG == c0321a2) {
                    objG = new f9.w(xVar2, 1);
                    jVar3.C(objG);
                }
                jVar3.B();
                z10 = false;
                d0.e(0, (eh.a) objG, jVar3);
                f10 = f13;
                aVar = aVar7;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar3);
            } else {
                f10 = f13;
                aVar = aVar7;
                z10 = false;
            }
            jVar3.B();
            String str3 = aVar6.f15641f;
            Context context2 = this.f15527f;
            if (str3 != null) {
                jVar3.L(-933061518);
                f11 = f10;
                s3Var = s3Var3;
                aVar3 = aVar6;
                z11 = z14;
                aVar2 = aVar;
                ff.b(f3.q.c(R.string.catalog_offline, jVar3), null, ((e2) jVar3.f(s3Var3)).f25751a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var2)).f26551n, jVar3, 0, 0, 65530);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 12), jVar3);
                jVar3.L(-1415562745);
                xVar = xVar2;
                boolean zL2 = jVar3.l(aVar3) | jVar3.l(xVar);
                Object objG2 = jVar3.g();
                c0321a = c0321a2;
                if (zL2 || objG2 == c0321a) {
                    objG2 = new l0(0, aVar3, xVar);
                    jVar3.C(objG2);
                }
                jVar3.B();
                t0.x0.c((eh.a) objG2, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, null, null, null, null, f.f15365f, jVar3, 805306416, 508);
                jVar3 = jVar3;
                jVar3.B();
                s0Var = this;
                context = context2;
            } else {
                c0321a = c0321a2;
                z11 = z14;
                xVar = xVar2;
                f11 = f10;
                aVar2 = aVar;
                aVar3 = aVar6;
                s3Var = s3Var3;
                jVar3.L(-932100766);
                jVar3.L(-1415541958);
                Object objG3 = jVar3.g();
                s0Var = this;
                final x0.n1<Boolean> n1Var = s0Var.f15528g;
                if (objG3 == c0321a) {
                    objG3 = new eh.a() { // from class: j9.m0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar3.C(objG3);
                }
                jVar3.B();
                t0.x0.d((eh.a) objG3, null, false, null, null, null, f.f15366g, jVar3, 805306374, 510);
                boolean zBooleanValue = n1Var.getValue().booleanValue();
                context = context2;
                androidx.compose.animation.d.b(z.s.f34624a, zBooleanValue, null, null, null, null, f1.c.b(-1721384851, new q0(aVar3, context, s0Var.f15529h), jVar3), jVar3, 1572870, 30);
                jVar3.B();
            }
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 32), jVar3);
            boolean zA = ((k9.e) jVar3.f(k9.c.f16178b)).a();
            r3<Boolean> r3Var2 = s0Var.f15530j;
            boolean z15 = !r3Var2.getValue().booleanValue();
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 54);
            h0.e eVarA = h0.f.a(f11);
            z.g1 g1Var = t0.m0.f26400a;
            if (z11) {
                jVar3.L(-929081211);
                jC = zA ? ((e2) jVar3.f(s3Var)).f25755c : c2.n0.c(4292441862L);
                jVar3.B();
            } else {
                jVar3.L(-928944687);
                jC = ((e2) jVar3.f(s3Var)).f25751a;
                jVar3.B();
            }
            x0.j jVar4 = jVar3;
            d.a aVar8 = aVar2;
            boolean z16 = z11;
            t0.l0 l0VarA = t0.m0.a(jC, 0L, 0L, jVar4, 14);
            jVar4.L(-1415461433);
            boolean zC = jVar4.c(z16) | jVar4.l(xVar);
            final p5.x xVar3 = xVar;
            final x1 x1Var = s0Var.f15526e;
            boolean zL3 = zC | jVar4.l(x1Var) | jVar4.l(context) | jVar4.l(aVar3);
            Object objG4 = jVar4.g();
            if (zL3 || objG4 == c0321a) {
                z12 = zA;
                z13 = z16;
                r3Var = r3Var2;
                final Context context3 = context;
                aVar4 = aVar3;
                eh.a aVar9 = new eh.a() { // from class: j9.n0
                    @Override // eh.a
                    public final Object invoke() {
                        if (z13) {
                            p5.x.c(e2.r.f24648c.f24627a, xVar3);
                        } else {
                            Context context4 = context3;
                            kotlin.jvm.internal.r.e(context4, "context");
                            x1 x1Var2 = x1Var;
                            sh.z0 z0Var = x1Var2.f15634q;
                            if (!((Boolean) z0Var.getValue()).booleanValue()) {
                                z0Var.j(null, Boolean.TRUE);
                                ph.h.c(androidx.lifecycle.x0.a(x1Var2), null, null, new y1(x1Var2, context4, aVar4, null), 3);
                            }
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar4.C(aVar9);
                objG4 = aVar9;
            } else {
                z13 = z16;
                r3Var = r3Var2;
                aVar4 = aVar3;
                z12 = zA;
            }
            jVar4.B();
            t0.x0.a((eh.a) objG4, dVarF, z15, eVarA, l0VarA, null, null, null, f1.c.b(-1812709616, new r0(z13, z12, aVar4, r3Var), jVar4), jVar4, 805306416, 480);
            p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar8), 24), jVar4);
            jVar4.H();
        }
        return pg.f0.f21461a;
    }
}
