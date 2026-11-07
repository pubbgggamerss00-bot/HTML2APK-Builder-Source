package i9;

import a9.d2;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.d;
import c2.n0;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import d8.k;
import g2.l0;
import i2.e0;
import i2.g;
import i8.a;
import j1.d;
import java.util.Map;
import ph.m0;
import ph.v1;
import q1.b1;
import q1.q1;
import t0.d1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.x0;
import t0.z0;
import x0.a2;
import x0.j;
import x0.n1;
import x0.r3;
import x0.s3;
import z.f1;

/* loaded from: classes.dex */
public final class n implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f14358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14360c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f14361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f14362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f14363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r3<Map<String, d8.k>> f14364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n1 f14365h;

    public n(f1 f1Var, boolean z10, boolean z11, Context context, r rVar, n1 n1Var, r3 r3Var, n1 n1Var2) {
        this.f14358a = f1Var;
        this.f14359b = z10;
        this.f14360c = z11;
        this.f14361d = context;
        this.f14362e = rVar;
        this.f14363f = n1Var;
        this.f14364g = r3Var;
        this.f14365h = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0422  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        boolean z10;
        boolean z11;
        j.a.C0321a c0321a;
        boolean zL;
        Object objG;
        boolean zL2;
        j.a.C0321a c0321a2;
        k.a aVarA;
        k.a aVarA2;
        k.a aVarA3;
        z.i FadingPage = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FadingPage, "$this$FadingPage");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarE = m0.e(androidx.compose.foundation.layout.g.f976c, m0.c(jVar2), true);
            f1 f1Var = this.f14358a;
            float f10 = 20;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.f.l(dVarE, CropImageView.DEFAULT_ASPECT_RATIO, f1Var.c(), CropImageView.DEFAULT_ASPECT_RATIO, f1Var.a(), 5), f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar2);
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
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar2);
            float f11 = 12;
            d.a aVar2 = d.a.f1143b;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f11), jVar2);
            androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, 88), h0.f.f12083a);
            boolean z12 = this.f14359b;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.a.a(dVarD, new q1(z12 ? qg.p.j(new b1(n0.c(4294956800L)), new b1(n0.c(4294942720L))) : qg.p.j(new b1(n0.c(4292441862L)), new b1(n0.c(4290007817L))), null, 0L, 9187343241974906880L));
            jVar2.L(487073113);
            Object objG2 = jVar2.g();
            j.a.C0321a c0321a3 = j.a.f31715a;
            if (objG2 == c0321a3) {
                objG2 = new x.n();
                jVar2.C(objG2);
            }
            x.m mVar = (x.m) objG2;
            jVar2.B();
            jVar2.L(487076772);
            Object objG3 = jVar2.g();
            if (objG3 == c0321a3) {
                objG3 = new h9.u1(this.f14363f, 1);
                jVar2.C(objG3);
            }
            jVar2.B();
            androidx.compose.ui.d dVarB = androidx.compose.foundation.b.b(dVarA, mVar, null, false, null, (eh.a) objG3, 28);
            l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD2 = jVar2.D();
            a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
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
            v1.j(bVar, l0VarD, jVar2);
            v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            v1.j(cVar, dVarC2, jVar2);
            ff.b("☕", null, 0L, f3.u.c(44), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3078, 0, 131062);
            jVar2.H();
            float f12 = 16;
            String strA = pd.d.a(aVar2, f12, jVar2, R.string.support_developer_subtitle, jVar2);
            t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26544g;
            x2.p pVar = x2.p.f32033f;
            s3 s3Var = f2.f25858a;
            ff.b(strA, null, ((e2) jVar2.f(s3Var)).f25769o, 0L, pVar, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 64986);
            x0.j jVar3 = jVar2;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f11), jVar3);
            d1.a(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), h0.f.a(f10), z0.a(b1.c(0.85f, ((e2) jVar3.f(s3Var)).f25770p), jVar3, 0), null, d2.a(1, b1.c(0.4f, ((e2) jVar3.f(s3Var)).B)), c.f14289c, jVar3, 196614, 8);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 24), jVar3);
            r3<Map<String, d8.k>> r3Var = this.f14364g;
            d8.k kVar = r3Var.getValue().get("support_coffee");
            String str = (kVar == null || (aVarA3 = kVar.a()) == null) ? null : aVarA3.f7511a;
            String strC = f3.q.c(R.string.support_tier_coffee_title, jVar3);
            String strC2 = f3.q.c(R.string.support_tier_coffee_desc, jVar3);
            boolean z13 = this.f14360c;
            if (z13 && str == null) {
                z10 = z13;
                z11 = true;
            } else {
                z10 = z13;
                z11 = false;
            }
            jVar3.L(487189942);
            final Context context = this.f14361d;
            boolean zL3 = jVar3.l(context);
            final r rVar = this.f14362e;
            boolean zL4 = zL3 | jVar3.l(rVar);
            Object objG4 = jVar3.g();
            if (zL4) {
                c0321a = c0321a3;
            } else {
                c0321a = c0321a3;
                if (objG4 == c0321a) {
                }
                jVar3.B();
                boolean z14 = z10;
                j.a.C0321a c0321a4 = c0321a;
                q.b("☕", strC, strC2, str, z11, false, false, z12, (eh.a) objG4, jVar3, 196614, 64);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f12), jVar3);
                d8.k kVar2 = r3Var.getValue().get("support_meal");
                String str2 = (kVar2 != null || (aVarA2 = kVar2.a()) == null) ? null : aVarA2.f7511a;
                String strC3 = f3.q.c(R.string.support_tier_meal_title, jVar3);
                String strC4 = f3.q.c(R.string.support_tier_meal_desc, jVar3);
                boolean z15 = !z14 && str2 == null;
                jVar3.L(487220596);
                zL = jVar3.l(context) | jVar3.l(rVar);
                objG = jVar3.g();
                if (!zL || objG == c0321a4) {
                    objG = new androidx.credentials.playservices.a(1, context, rVar);
                    jVar3.C(objG);
                }
                jVar3.B();
                q.b("🍕", strC3, strC4, str2, z15, true, false, z12, (eh.a) objG, jVar3, 196614, 64);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f12), jVar3);
                d8.k kVar3 = r3Var.getValue().get("support_sponsor");
                String str3 = (kVar3 != null || (aVarA = kVar3.a()) == null) ? null : aVarA.f7511a;
                String strC5 = f3.q.c(R.string.support_tier_sponsor_title, jVar3);
                String strC6 = f3.q.c(R.string.support_tier_sponsor_desc, jVar3);
                boolean z16 = !z14 && str3 == null;
                jVar3.L(487253015);
                zL2 = jVar3.l(context) | jVar3.l(rVar);
                Object objG5 = jVar3.g();
                if (zL2) {
                    c0321a2 = c0321a4;
                    if (objG5 == c0321a2) {
                    }
                    jVar3.B();
                    j.a.C0321a c0321a5 = c0321a2;
                    q.b("🚀", strC5, strC6, str3, z16, false, true, z12, (eh.a) objG5, jVar3, 1769478, 0);
                    jVar3.L(487260712);
                    if (((i8.a) this.f14365h.getValue()) instanceof a.d) {
                        p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f12), jVar3);
                        jVar3.L(487267153);
                        boolean zL5 = jVar3.l(rVar);
                        Object objG6 = jVar3.g();
                        if (zL5 || objG6 == c0321a5) {
                            objG6 = new f9.r(rVar, 1);
                            jVar3.C(objG6);
                        }
                        jVar3.B();
                        x0.c((eh.a) objG6, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, null, null, null, null, c.f14290d, jVar3, 805306416, 508);
                        jVar3 = jVar3;
                    }
                    jVar3.B();
                    p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar2), 32), jVar3);
                    jVar3.H();
                } else {
                    c0321a2 = c0321a4;
                }
                objG5 = new eh.a() { // from class: i9.m
                    @Override // eh.a
                    public final Object invoke() {
                        Context context2 = context;
                        Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                        if (activity != null) {
                            rVar.f(activity, "support_sponsor");
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar3.C(objG5);
                jVar3.B();
                j.a.C0321a c0321a52 = c0321a2;
                q.b("🚀", strC5, strC6, str3, z16, false, true, z12, (eh.a) objG5, jVar3, 1769478, 0);
                jVar3.L(487260712);
                if (((i8.a) this.f14365h.getValue()) instanceof a.d) {
                }
                jVar3.B();
                p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar2), 32), jVar3);
                jVar3.H();
            }
            objG4 = new eh.a() { // from class: i9.l
                @Override // eh.a
                public final Object invoke() {
                    Context context2 = context;
                    Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                    if (activity != null) {
                        rVar.f(activity, "support_coffee");
                    }
                    return pg.f0.f21461a;
                }
            };
            jVar3.C(objG4);
            jVar3.B();
            boolean z142 = z10;
            j.a.C0321a c0321a42 = c0321a;
            q.b("☕", strC, strC2, str, z11, false, false, z12, (eh.a) objG4, jVar3, 196614, 64);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f12), jVar3);
            d8.k kVar22 = r3Var.getValue().get("support_meal");
            if (kVar22 != null) {
                String strC32 = f3.q.c(R.string.support_tier_meal_title, jVar3);
                String strC42 = f3.q.c(R.string.support_tier_meal_desc, jVar3);
                if (z142) {
                    jVar3.L(487220596);
                    zL = jVar3.l(context) | jVar3.l(rVar);
                    objG = jVar3.g();
                    if (!zL) {
                        objG = new androidx.credentials.playservices.a(1, context, rVar);
                        jVar3.C(objG);
                        jVar3.B();
                        q.b("🍕", strC32, strC42, str2, z15, true, false, z12, (eh.a) objG, jVar3, 196614, 64);
                        p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f12), jVar3);
                        d8.k kVar32 = r3Var.getValue().get("support_sponsor");
                        if (kVar32 != null) {
                            String strC52 = f3.q.c(R.string.support_tier_sponsor_title, jVar3);
                            String strC62 = f3.q.c(R.string.support_tier_sponsor_desc, jVar3);
                            if (z142) {
                                jVar3.L(487253015);
                                zL2 = jVar3.l(context) | jVar3.l(rVar);
                                Object objG52 = jVar3.g();
                                if (zL2) {
                                }
                                objG52 = new eh.a() { // from class: i9.m
                                    @Override // eh.a
                                    public final Object invoke() {
                                        Context context2 = context;
                                        Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                                        if (activity != null) {
                                            rVar.f(activity, "support_sponsor");
                                        }
                                        return pg.f0.f21461a;
                                    }
                                };
                                jVar3.C(objG52);
                                jVar3.B();
                                j.a.C0321a c0321a522 = c0321a2;
                                q.b("🚀", strC52, strC62, str3, z16, false, true, z12, (eh.a) objG52, jVar3, 1769478, 0);
                                jVar3.L(487260712);
                                if (((i8.a) this.f14365h.getValue()) instanceof a.d) {
                                }
                                jVar3.B();
                                p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar2), 32), jVar3);
                                jVar3.H();
                            }
                        }
                    }
                }
            }
        }
        return pg.f0.f21461a;
    }
}
