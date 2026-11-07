package b9;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import b9.e3;
import s8.e2;
import t0.s4;
import x0.j;

/* loaded from: classes.dex */
public final class y3 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e3.a f4175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f4176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f4177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f4178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f4179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f4181g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f4182h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f4183j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<WebView> f4184k;

    public y3(e3.a aVar, Uri uri, x0.r3<Boolean> r3Var, p5.x xVar, Context context, String str, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3, x0.n1<WebView> n1Var4) {
        this.f4175a = aVar;
        this.f4176b = uri;
        this.f4177c = r3Var;
        this.f4178d = xVar;
        this.f4179e = context;
        this.f4180f = str;
        this.f4181g = n1Var;
        this.f4182h = n1Var2;
        this.f4183j = n1Var3;
        this.f4184k = n1Var4;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        final p5.x xVar;
        e3.a aVar;
        final Context context;
        final Uri uri;
        z.n1 TopAppBar = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(TopAppBar, "$this$TopAppBar");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(311110173);
            x0.n1<Boolean> n1Var2 = this.f4182h;
            x0.n1<Boolean> n1Var3 = this.f4181g;
            Object obj = j.a.f31715a;
            final p5.x xVar2 = this.f4178d;
            e3.a aVar2 = this.f4175a;
            if (aVar2 == null || !aVar2.f3805i || (uri = this.f4176b) == null) {
                xVar = xVar2;
                aVar = aVar2;
            } else {
                boolean z10 = (n1Var3.getValue().booleanValue() || n1Var2.getValue().booleanValue()) ? false : true;
                jVar2.L(311117042);
                final x0.r3<Boolean> r3Var = this.f4177c;
                boolean zK = jVar2.K(r3Var) | jVar2.l(xVar2) | jVar2.l(uri);
                Object objG = jVar2.g();
                if (zK || objG == obj) {
                    final x0.n1<Boolean> n1Var4 = this.f4183j;
                    objG = new eh.a() { // from class: b9.t3
                        @Override // eh.a
                        public final Object invoke() {
                            if (((Boolean) r3Var.getValue()).booleanValue()) {
                                e2.v vVar = e2.v.f24652c;
                                String string = uri.toString();
                                kotlin.jvm.internal.r.d(string, "toString(...)");
                                p5.x.c(e2.v.a(vVar, 0L, false, string, 2), xVar2);
                            } else {
                                n1Var4.setValue(Boolean.TRUE);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                aVar = aVar2;
                xVar = xVar2;
                t0.x0.d((eh.a) objG, null, z10, null, null, null, b.f3739b, jVar2, 805306368, 506);
                jVar2 = jVar2;
            }
            jVar2.B();
            final Long l10 = aVar != null ? aVar.f3810n : null;
            final x0.n1<WebView> n1Var5 = this.f4184k;
            Context context2 = this.f4179e;
            if (l10 != null) {
                jVar2.L(1055314983);
                jVar2.L(311138365);
                boolean zL = jVar2.l(xVar) | jVar2.K(l10);
                Object objG2 = jVar2.g();
                if (zL || objG2 == obj) {
                    objG2 = new eh.a() { // from class: b9.u3
                        @Override // eh.a
                        public final Object invoke() {
                            p5.x.c(e2.l.f24642c.a(l10.longValue()), xVar);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                context = context2;
                s4.c((eh.a) objG2, null, false, null, b.f3740c, jVar2, 196608, 30);
                jVar2.B();
            } else {
                context = context2;
                jVar2.L(1055701181);
                boolean z11 = (aVar == null || n1Var2.getValue().booleanValue() || n1Var3.getValue().booleanValue()) ? false : true;
                jVar2.L(311154399);
                boolean zL2 = jVar2.l(context);
                final String str = this.f4180f;
                boolean zK2 = zL2 | jVar2.K(str);
                Object objG3 = jVar2.g();
                if (zK2 || objG3 == obj) {
                    objG3 = new eh.a() { // from class: b9.v3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            WebView webView = (WebView) n1Var5.getValue();
                            if (webView != null) {
                                f.a(context, webView, str);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG3);
                }
                jVar2.B();
                s4.c((eh.a) objG3, null, z11, null, b.f3741d, jVar2, 196608, 26);
                jVar2.B();
            }
            jVar2.L(311164102);
            Object objG4 = jVar2.g();
            if (objG4 == obj) {
                objG4 = new w3(n1Var5, 0);
                jVar2.C(objG4);
            }
            jVar2.B();
            s4.c((eh.a) objG4, null, false, null, b.f3742e, jVar2, 196614, 30);
            if ((aVar != null ? aVar.f3798b : null) == e3.b.f3812b && !mh.x.A(aVar.f3800d)) {
                jVar2.L(311178880);
                boolean zL3 = jVar2.l(aVar) | jVar2.l(context);
                Object objG5 = jVar2.g();
                if (zL3 || objG5 == obj) {
                    objG5 = new x3(0, aVar, context);
                    jVar2.C(objG5);
                }
                jVar2.B();
                s4.c((eh.a) objG5, null, false, null, b.f3743f, jVar2, 196608, 30);
            }
        }
        return pg.f0.f21461a;
    }
}
