package a9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import i8.a;
import j1.d;
import s8.e2;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class u1 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.f1 f321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2 f323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f326g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f327h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r3<g8.x> f328j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f329k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f330l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f331m;

    public u1(p5.x xVar, z.f1 f1Var, Context context, b2 b2Var, r3 r3Var, r3 r3Var2, String str, String str2, r3 r3Var3, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3) {
        this.f320a = xVar;
        this.f321b = f1Var;
        this.f322c = context;
        this.f323d = b2Var;
        this.f324e = r3Var;
        this.f325f = r3Var2;
        this.f326g = str;
        this.f327h = str2;
        this.f328j = r3Var3;
        this.f329k = n1Var;
        this.f330l = n1Var2;
        this.f331m = n1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        r3<Boolean> r3Var;
        boolean z10;
        boolean z11;
        z.i FadingPage = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FadingPage, "$this$FadingPage");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, l0VarD, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            r3<Boolean> r3Var2 = this.f324e;
            boolean zBooleanValue = r3Var2.getValue().booleanValue();
            Object obj = j.a.f31715a;
            final p5.x xVar = this.f320a;
            z.f1 f1Var = this.f321b;
            final Context context = this.f322c;
            final b2 b2Var = this.f323d;
            if (zBooleanValue) {
                jVar2.L(1633115717);
                boolean zBooleanValue2 = this.f325f.getValue().booleanValue();
                float fC = f1Var.c();
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(fillElement, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                jVar2.L(1022525600);
                boolean zL = jVar2.l(context);
                Object objG = jVar2.g();
                if (zL || objG == obj) {
                    objG = new eh.a() { // from class: a9.l1
                        @Override // eh.a
                        public final Object invoke() {
                            Context context2 = context;
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=pro_subscription_monthly&package=" + context2.getPackageName()));
                            intent.addFlags(268435456);
                            try {
                                try {
                                    context2.startActivity(intent);
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions"));
                                intent2.addFlags(268435456);
                                context2.startActivity(intent2);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                eh.a aVar2 = (eh.a) objG;
                jVar2.B();
                jVar2.L(1022562130);
                boolean zL2 = jVar2.l(b2Var);
                Object objG2 = jVar2.g();
                if (zL2 || objG2 == obj) {
                    objG2 = new m1(b2Var, 0);
                    jVar2.C(objG2);
                }
                jVar2.B();
                v0.e(xVar, zBooleanValue2, fC, dVarJ, aVar2, (eh.a) objG2, jVar2, 3072);
                jVar2.B();
                r3Var = r3Var2;
                z10 = false;
                z11 = true;
            } else {
                jVar2.L(1634857359);
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(ph.m0.e(androidx.compose.foundation.layout.f.j(fillElement, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), ph.m0.c(jVar2), true), CropImageView.DEFAULT_ASPECT_RATIO, f1Var.c(), CropImageView.DEFAULT_ASPECT_RATIO, f1Var.a(), 5);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, qVarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                d.a aVar3 = d.a.f1143b;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, 16), jVar2);
                g8.x value = this.f328j.getValue();
                jVar2.L(581017040);
                boolean zL3 = jVar2.l(xVar);
                Object objG3 = jVar2.g();
                if (zL3 || objG3 == obj) {
                    objG3 = new eh.a() { // from class: a9.n1
                        @Override // eh.a
                        public final Object invoke() {
                            p5.x.c(e2.s.f24649c.f24627a, xVar);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG3);
                }
                eh.a aVar4 = (eh.a) objG3;
                jVar2.B();
                i8.a aVar5 = (i8.a) this.f329k.getValue();
                boolean zBooleanValue3 = this.f330l.getValue().booleanValue();
                boolean zBooleanValue4 = this.f331m.getValue().booleanValue();
                jVar2.L(581031163);
                boolean zL4 = jVar2.l(context) | jVar2.l(b2Var);
                Object objG4 = jVar2.g();
                if (zL4 || objG4 == obj) {
                    objG4 = new o1(0, context, b2Var);
                    jVar2.C(objG4);
                }
                eh.a aVar6 = (eh.a) objG4;
                jVar2.B();
                jVar2.L(581040168);
                boolean zL5 = jVar2.l(context) | jVar2.l(b2Var);
                Object objG5 = jVar2.g();
                if (zL5 || objG5 == obj) {
                    objG5 = new p1(0, context, b2Var);
                    jVar2.C(objG5);
                }
                eh.a aVar7 = (eh.a) objG5;
                jVar2.B();
                jVar2.L(581048888);
                boolean zL6 = jVar2.l(b2Var);
                Object objG6 = jVar2.g();
                if (zL6 || objG6 == obj) {
                    objG6 = new eh.a() { // from class: a9.q1
                        @Override // eh.a
                        public final Object invoke() {
                            b2Var.f138b.h();
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG6);
                }
                eh.a aVar8 = (eh.a) objG6;
                jVar2.B();
                jVar2.L(581051739);
                boolean zL7 = jVar2.l(b2Var) | jVar2.l(context);
                Object objG7 = jVar2.g();
                if (zL7 || objG7 == obj) {
                    objG7 = new eh.a() { // from class: a9.r1
                        @Override // eh.a
                        public final Object invoke() {
                            t1 t1Var = new t1(context);
                            b2 b2Var2 = b2Var;
                            j8.a aVar9 = b2Var2.f140d;
                            aVar9.f15265d.clear();
                            aVar9.f15262a.g();
                            i8.j jVar3 = b2Var2.f138b;
                            z1 z1Var = new z1(b2Var2, t1Var);
                            if (kotlin.jvm.internal.r.a(jVar3.f14227g.getValue(), a.C0133a.f14198a)) {
                                uh.c cVar2 = jVar3.f14223c;
                                if (cVar2 != null) {
                                    ph.h.c(cVar2, null, null, new i8.o(z1Var, jVar3, null), 3);
                                }
                            } else {
                                jVar3.i();
                                uh.c cVar3 = jVar3.f14223c;
                                if (cVar3 != null) {
                                    wh.c cVar4 = ph.z0.f21632a;
                                    ph.h.c(cVar3, uh.o.f29764a, null, new i8.m(z1Var, jVar3, null), 2);
                                }
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG7);
                }
                eh.a aVar9 = (eh.a) objG7;
                jVar2.B();
                jVar2.L(581061460);
                boolean zL8 = jVar2.l(b2Var);
                Object objG8 = jVar2.g();
                if (zL8 || objG8 == obj) {
                    objG8 = new eh.p() { // from class: a9.s1
                        @Override // eh.p
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Boolean) obj2).getClass();
                            ((Boolean) obj3).getClass();
                            b2Var.f138b.getClass();
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG8);
                }
                jVar2.B();
                r3Var = r3Var2;
                z10 = false;
                z11 = true;
                v0.f(value, aVar4, this.f326g, this.f327h, aVar5, zBooleanValue3, zBooleanValue4, aVar6, aVar7, aVar8, aVar9, (eh.p) objG8, jVar2, 8);
                p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar3), 24), jVar2);
                jVar2.H();
                jVar2.B();
            }
            jVar2.L(1022641565);
            jVar2.L(1022641600);
            boolean z12 = (!r3Var.getValue().booleanValue() || q8.x1.a(jVar2)) ? z10 : z11;
            jVar2.B();
            if (z12) {
                v0.a(fillElement, jVar2, 6);
            }
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
