package f9;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import b9.e3;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.WebViewSettings;
import com.basitce.htmltoapk.domain.model.WebViewSettingsKt;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class x2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10888c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f10890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f10891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg f10892g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f10893h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f10894j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f10895k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f10896l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f10897m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f10898n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10899p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10900q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10901r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f10902s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10903t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10904v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f10905w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10906x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f10907y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ x0.n1<j> f10908z;

    public x2(x0.n1 n1Var, x0.n1 n1Var2, boolean z10, eh.a aVar, String str, Context context, fg fgVar, boolean z11, View view, x0.n1 n1Var3, ph.i0 i0Var, boolean z12, long j10, x0.n1 n1Var4, x0.n1 n1Var5, x0.n1 n1Var6, x0.k1 k1Var, x0.n1 n1Var7, eh.a aVar2, x0.n1 n1Var8, x0.n1 n1Var9, x0.n1 n1Var10, x0.n1 n1Var11) {
        this.f10886a = n1Var;
        this.f10887b = n1Var2;
        this.f10888c = z10;
        this.f10889d = aVar;
        this.f10890e = str;
        this.f10891f = context;
        this.f10892g = fgVar;
        this.f10893h = z11;
        this.f10894j = view;
        this.f10895k = n1Var3;
        this.f10896l = i0Var;
        this.f10897m = z12;
        this.f10898n = j10;
        this.f10899p = n1Var4;
        this.f10900q = n1Var5;
        this.f10901r = n1Var6;
        this.f10902s = k1Var;
        this.f10903t = n1Var7;
        this.f10904v = aVar2;
        this.f10905w = n1Var8;
        this.f10906x = n1Var9;
        this.f10907y = n1Var10;
        this.f10908z = n1Var11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.n1<y2.c0> n1Var;
        x0.n1<Boolean> n1Var2;
        boolean z10;
        Object obj;
        final Context context;
        final x0.n1 n1Var3;
        final x0.n1<String> n1Var4;
        eh.a aVar;
        eh.a aVar2;
        x0.n1<y2.c0> n1Var5;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-2147281492);
            final x0.n1<Boolean> n1Var6 = this.f10886a;
            boolean zK = jVar2.K(n1Var6);
            final x0.n1<Boolean> n1Var7 = this.f10887b;
            boolean zK2 = zK | jVar2.K(n1Var7);
            Object objG = jVar2.g();
            Object obj2 = j.a.f31715a;
            if (zK2 || objG == obj2) {
                objG = new eh.a() { // from class: f9.l2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        List<String> list = d1.f9265a;
                        x0.n1 n1Var8 = n1Var6;
                        n1Var8.setValue(Boolean.valueOf(!((Boolean) n1Var8.getValue()).booleanValue()));
                        if (!((Boolean) n1Var8.getValue()).booleanValue()) {
                            n1Var7.setValue(Boolean.FALSE);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            long j10 = this.f10898n;
            boolean z11 = this.f10888c;
            t0.s4.c((eh.a) objG, null, z11, null, f1.c.b(1226442326, new u2(j10, z11, n1Var6), jVar2), jVar2, 196608, 26);
            jVar2.L(-2147259159);
            Object obj3 = this.f10892g;
            Object obj4 = this.f10889d;
            final x0.n1<y2.c0> n1Var8 = this.f10905w;
            x0.n1<Boolean> n1Var9 = this.f10906x;
            boolean z12 = this.f10888c;
            Context context2 = this.f10891f;
            if (obj4 != null) {
                jVar2.L(-2147256834);
                boolean zK3 = jVar2.K(obj4) | jVar2.c(this.f10893h) | jVar2.K(this.f10890e) | jVar2.l(context2) | jVar2.l(obj3) | jVar2.l(this.f10894j);
                Object objG2 = jVar2.g();
                if (zK3 || objG2 == obj2) {
                    final String str = this.f10890e;
                    final fg fgVar = this.f10892g;
                    final boolean z13 = this.f10893h;
                    final eh.a<pg.f0> aVar3 = this.f10889d;
                    final Context context3 = this.f10891f;
                    final View view = this.f10894j;
                    objG2 = new eh.a() { // from class: f9.o2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            String string = str;
                            boolean zA = mh.x.A(string);
                            Context context4 = context3;
                            if (zA) {
                                string = context4.getString(R.string.preview_title);
                                kotlin.jvm.internal.r.d(string, "getString(...)");
                            }
                            String str2 = string;
                            fg fgVar2 = fgVar;
                            String colorMode = ((WebViewSettings) fgVar2.W0.getValue()).getColorMode();
                            List<String> list = d1.f9265a;
                            String htmlContent = ((y2.c0) n1Var8.getValue()).f33682a.f27761b;
                            boolean z14 = !z13;
                            int iWebViewMixedContentMode = WebViewSettingsKt.webViewMixedContentMode((WebViewSettings) fgVar2.W0.getValue());
                            kotlin.jvm.internal.r.e(htmlContent, "htmlContent");
                            kotlin.jvm.internal.r.e(colorMode, "colorMode");
                            b9.e3.f3796a = new e3.a(str2, e3.b.f3811a, htmlContent, null, null, null, null, null, colorMode, iWebViewMixedContentMode, z14, null, 9208);
                            d1.k(context4, view);
                            aVar3.invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    n1Var5 = n1Var8;
                    jVar2.C(objG2);
                } else {
                    n1Var5 = n1Var8;
                }
                eh.a aVar4 = (eh.a) objG2;
                jVar2.B();
                boolean z14 = (!z12 || d1.n(n1Var9) || mh.x.A(n1Var5.getValue().f33682a.f27761b)) ? false : true;
                f1.b bVarB = f1.c.b(1273939505, new v2(z12, n1Var9, n1Var5), jVar2);
                obj = n1Var7;
                n1Var = n1Var5;
                context = context2;
                n1Var2 = n1Var9;
                z10 = z12;
                t0.s4.c(aVar4, null, z14, null, bVarB, jVar2, 196608, 26);
            } else {
                n1Var = n1Var8;
                n1Var2 = n1Var9;
                z10 = z12;
                obj = n1Var7;
                context = context2;
            }
            x0.n1 n1Var10 = this.f10895k;
            boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar2, -2147215927, n1Var10) | jVar2.c(z10);
            final ph.i0 i0Var = this.f10896l;
            boolean zL = zB | jVar2.l(i0Var) | jVar2.l(context) | jVar2.l(obj3);
            Object objG3 = jVar2.g();
            x0.n1<String> n1Var11 = this.f10907y;
            if (zL || objG3 == obj2) {
                final boolean z15 = this.f10888c;
                final ph.i0 i0Var2 = this.f10896l;
                final x0.n1<Boolean> n1Var12 = this.f10906x;
                final fg fgVar2 = this.f10892g;
                final Context context4 = this.f10891f;
                n1Var3 = n1Var10;
                n1Var4 = n1Var11;
                final x0.n1<y2.c0> n1Var13 = n1Var;
                objG3 = new eh.a() { // from class: f9.p2
                    @Override // eh.a
                    public final Object invoke() {
                        d1.q(z15, i0Var2, n1Var3, n1Var12, n1Var13, fgVar2, context4, n1Var4, null);
                        return pg.f0.f21461a;
                    }
                };
                n1Var = n1Var13;
                jVar2.C(objG3);
            } else {
                n1Var3 = n1Var10;
                n1Var4 = n1Var11;
            }
            eh.a aVar5 = (eh.a) objG3;
            jVar2.B();
            boolean z16 = (!z10 || d1.n(n1Var2) || ((Uri) n1Var3.getValue()) == null) ? false : true;
            boolean z17 = this.f10897m;
            long jC = z17 ? q1.b1.c(0.18f, j10) : q1.b1.f21653g;
            jVar2.L(-2147205684);
            long j11 = z17 ? j10 : ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s;
            jVar2.B();
            t0.j4 j4VarB = t0.k4.b(jC, j11, jVar2, 0);
            f1.b bVarB2 = f1.c.b(-41791505, new w2(j10, n1Var2), jVar2);
            final x0.n1 n1Var14 = n1Var3;
            final x0.n1<y2.c0> n1Var15 = n1Var;
            t0.s4.b(aVar5, null, z16, null, j4VarB, bVarB2, jVar2, 1572864, 42);
            List<String> list = d1.f9265a;
            final x0.n1<Boolean> n1Var16 = this.f10900q;
            boolean zBooleanValue = n1Var16.getValue().booleanValue();
            final x0.n1<Boolean> n1Var17 = this.f10901r;
            boolean zP = d1.p(n1Var17);
            final x0.k1 k1Var = this.f10902s;
            float floatValue = k1Var.getFloatValue();
            jVar2.L(-2147184459);
            Object obj5 = obj;
            boolean zK4 = jVar2.K(n1Var6) | jVar2.K(obj5);
            Object objG4 = jVar2.g();
            if (zK4 || objG4 == obj2) {
                objG4 = new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.n(1, n1Var6, obj5);
                jVar2.C(objG4);
            }
            eh.a aVar6 = (eh.a) objG4;
            x0.n1<Boolean> n1Var18 = this.f10899p;
            boolean zB2 = androidx.datastore.preferences.protobuf.e.b(jVar2, -2147179658, n1Var18);
            Object objG5 = jVar2.g();
            if (zB2 || objG5 == obj2) {
                objG5 = new b9.t(n1Var18, 1);
                jVar2.C(objG5);
            }
            eh.a aVar7 = (eh.a) objG5;
            boolean zB3 = androidx.datastore.preferences.protobuf.e.b(jVar2, -2147177706, n1Var16) | jVar2.l(context) | jVar2.K(n1Var17) | jVar2.K(k1Var);
            Object objG6 = jVar2.g();
            if (zB3 || objG6 == obj2) {
                objG6 = new eh.a() { // from class: f9.q2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        List<String> list2 = d1.f9265a;
                        x0.n1 n1Var19 = n1Var16;
                        n1Var19.setValue(Boolean.valueOf(!((Boolean) n1Var19.getValue()).booleanValue()));
                        d1.y(context, k1Var, n1Var19, n1Var17);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG6);
            }
            eh.a aVar8 = (eh.a) objG6;
            boolean zB4 = androidx.datastore.preferences.protobuf.e.b(jVar2, -2147174742, n1Var17) | jVar2.l(context) | jVar2.K(n1Var16) | jVar2.K(k1Var);
            Object objG7 = jVar2.g();
            if (zB4 || objG7 == obj2) {
                objG7 = new eh.a() { // from class: f9.r2
                    @Override // eh.a
                    public final Object invoke() {
                        x0.n1 n1Var19 = n1Var17;
                        n1Var19.setValue(Boolean.valueOf(!d1.p(n1Var19)));
                        d1.y(context, k1Var, n1Var16, n1Var19);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG7);
            }
            eh.a aVar9 = (eh.a) objG7;
            jVar2.B();
            jVar2.L(-2147172224);
            boolean zK5 = jVar2.K(k1Var) | jVar2.l(context) | jVar2.K(n1Var16) | jVar2.K(n1Var17);
            Object objG8 = jVar2.g();
            if (zK5 || objG8 == obj2) {
                objG8 = new s2(context, k1Var, n1Var16, n1Var17);
                jVar2.C(objG8);
            }
            eh.l lVar = (eh.l) objG8;
            jVar2.B();
            jVar2.L(-2147169159);
            boolean zL2 = jVar2.l(i0Var) | jVar2.l(context);
            Object objG9 = jVar2.g();
            if (zL2 || objG9 == obj2) {
                final x0.n1<j> n1Var19 = this.f10908z;
                objG9 = new eh.a() { // from class: f9.t2
                    @Override // eh.a
                    public final Object invoke() {
                        List<String> list2 = d1.f9265a;
                        ph.h.c(i0Var, null, null, new w3(context, n1Var15, n1Var19, null), 3);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG9);
            }
            eh.a aVar10 = (eh.a) objG9;
            x0.n1<Boolean> n1Var20 = this.f10903t;
            boolean zB5 = androidx.datastore.preferences.protobuf.e.b(jVar2, -2147167202, n1Var20);
            Object objG10 = jVar2.g();
            if (zB5 || objG10 == obj2) {
                objG10 = new m2(n1Var20, 0);
                jVar2.C(objG10);
            }
            eh.a aVar11 = (eh.a) objG10;
            jVar2.B();
            jVar2.L(-2147164051);
            final eh.a<pg.f0> aVar12 = this.f10904v;
            if (aVar12 == null) {
                aVar2 = null;
                aVar = aVar10;
            } else {
                jVar2.L(-182326880);
                final Context context5 = this.f10891f;
                boolean zL3 = jVar2.l(context5);
                aVar = aVar10;
                final View view2 = this.f10894j;
                boolean zL4 = zL3 | jVar2.l(view2);
                final boolean z18 = this.f10897m;
                boolean zC = zL4 | jVar2.c(z18) | jVar2.K(n1Var14);
                final boolean z19 = this.f10888c;
                boolean zC2 = zC | jVar2.c(z19);
                final ph.i0 i0Var3 = this.f10896l;
                boolean zL5 = zC2 | jVar2.l(i0Var3);
                final fg fgVar3 = this.f10892g;
                boolean zL6 = zL5 | jVar2.l(fgVar3) | jVar2.K(aVar12);
                Object objG11 = jVar2.g();
                if (zL6 || objG11 == obj2) {
                    final x0.n1<Boolean> n1Var21 = this.f10906x;
                    final x0.n1<String> n1Var22 = n1Var4;
                    objG11 = new eh.a() { // from class: f9.n2
                        @Override // eh.a
                        public final Object invoke() {
                            Context context6 = context5;
                            d1.k(context6, view2);
                            boolean z20 = z18;
                            eh.a aVar13 = aVar12;
                            if (z20) {
                                d1.q(z19, i0Var3, n1Var14, n1Var21, n1Var15, fgVar3, context6, n1Var22, aVar13);
                            } else {
                                aVar13.invoke();
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG11);
                }
                aVar2 = (eh.a) objG11;
                jVar2.B();
            }
            eh.a aVar13 = aVar2;
            jVar2.B();
            d1.d(this.f10888c, this.f10898n, zBooleanValue, zP, floatValue, aVar6, aVar7, aVar8, aVar9, lVar, aVar, aVar11, aVar13, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
