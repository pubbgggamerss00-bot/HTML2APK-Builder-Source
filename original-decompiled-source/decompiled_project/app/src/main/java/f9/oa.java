package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class oa implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f10179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10180g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f10181h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10182j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f10183k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10184l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f10185m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10186n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f10187p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10188q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10189r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10190s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10191t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10192v;

    /* JADX WARN: Multi-variable type inference failed */
    public oa(String str, eh.l<? super String, pg.f0> lVar, String str2, eh.l<? super String, pg.f0> lVar2, boolean z10, eh.l<? super Boolean, pg.f0> lVar3, boolean z11, String str3, eh.l<? super String, pg.f0> lVar4, String str4, eh.l<? super String, pg.f0> lVar5, String str5, eh.l<? super String, pg.f0> lVar6, String str6, eh.l<? super String, pg.f0> lVar7, String str7, eh.l<? super String, pg.f0> lVar8, String str8, eh.l<? super String, pg.f0> lVar9) {
        this.f10174a = str;
        this.f10175b = lVar;
        this.f10176c = str2;
        this.f10177d = lVar2;
        this.f10178e = z10;
        this.f10179f = lVar3;
        this.f10180g = z11;
        this.f10181h = str3;
        this.f10182j = lVar4;
        this.f10183k = str4;
        this.f10184l = lVar5;
        this.f10185m = str5;
        this.f10186n = lVar6;
        this.f10187p = str6;
        this.f10188q = lVar7;
        this.f10189r = str7;
        this.f10190s = lVar8;
        this.f10191t = str8;
        this.f10192v = lVar9;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x055d  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        Object obj;
        e0.a aVar;
        g.a.C0128a c0128a;
        z.r EditorCard = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            String strC = f3.q.c(R.string.editor_section_app_info, jVar2);
            x0.e2 e2Var = t0.of.f26647a;
            t2.l0 l0Var = ((t0.nf) jVar2.f(e2Var)).f26545h;
            x2.p pVar = x2.p.f32033f;
            x0.e2 e2Var2 = t0.f2.f25858a;
            t0.ff.b(strC, null, ((t0.e2) jVar2.f(e2Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            jVar2.L(-1037628486);
            final eh.l<String, pg.f0> lVar = this.f10175b;
            boolean zK = jVar2.K(lVar);
            Object objG = jVar2.g();
            Object obj2 = j.a.f31715a;
            if (zK || objG == obj2) {
                objG = new eh.l() { // from class: f9.ja
                    @Override // eh.l
                    public final Object invoke(Object obj3) {
                        String it = (String) obj3;
                        kotlin.jvm.internal.r.e(it, "it");
                        lVar.invoke(mh.y.b0(50, mh.t.n(mh.t.n(it, "\n", ""), "\r", "")));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.w9.a(this.f10174a, (eh.l) objG, dVarD, false, false, null, e.f9344d, null, null, null, null, e.f9346e, false, null, null, null, true, 1, 0, null, null, jVar2, 1573248, 113246592, 7991224);
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            jVar2.L(-1037614289);
            final eh.l<String, pg.f0> lVar2 = this.f10177d;
            boolean zK2 = jVar2.K(lVar2);
            Object objG2 = jVar2.g();
            if (zK2) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objG2 == obj) {
                }
                jVar2.B();
                Object obj3 = obj;
                t0.w9.a(this.f10176c, (eh.l) objG2, dVarD2, false, false, null, e.f9348f, null, null, null, null, f1.c.b(911804252, new na(this.f10178e), jVar2), this.f10178e, null, null, null, true, 1, 0, null, null, jVar2, 1573248, 113246592, 7983032);
                float f10 = 12;
                b.i iVarH = z.b.h(f10);
                f.b bVar = d.a.f14611j;
                z.m1 m1VarA = z.k1.a(iVarH, bVar, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar2, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() != null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                g.a.b bVar2 = g.a.f13867f;
                ph.v1.j(bVar2, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a2);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                i0.h2 h2Var = new i0.h2(3, 0, 123);
                z.o1 o1Var = z.o1.f34600a;
                t0.w9.a(this.f10185m, this.f10186n, o1Var.a(aVar2, 1.0f), false, false, null, e.f9350g, null, null, null, null, e.f9352h, false, null, h2Var, null, false, 0, 0, null, null, jVar2, 1572864, 196992, 8351672);
                t0.w9.a(this.f10187p, this.f10188q, o1Var.a(aVar2, 1.0f), false, false, null, e.f9354i, null, null, null, null, e.f9356j, false, null, null, null, false, 0, 0, null, null, jVar2, 1572864, 384, 8384440);
                jVar2.H();
                androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                jVar2.L(-1037556715);
                final eh.l<Boolean, pg.f0> lVar3 = this.f10179f;
                boolean zK3 = jVar2.K(lVar3);
                final boolean z10 = this.f10180g;
                boolean zC = zK3 | jVar2.c(z10);
                Object objG3 = jVar2.g();
                if (zC || objG3 == obj3) {
                    objG3 = new eh.a() { // from class: f9.la
                        @Override // eh.a
                        public final Object invoke() {
                            lVar3.invoke(Boolean.valueOf(!z10));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG3);
                }
                jVar2.B();
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD3, false, null, null, (eh.a) objG3, 7), CropImageView.DEFAULT_ASPECT_RATIO, 6, 1);
                z.m1 m1VarA2 = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    aVar = aVar3;
                    jVar2.w(aVar);
                } else {
                    aVar = aVar3;
                    jVar2.z();
                }
                ph.v1.j(bVar2, m1VarA2, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    c0128a = c0128a2;
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                } else {
                    c0128a = c0128a2;
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                t0.m1.a(this.f10180g, this.f10179f, null, false, null, jVar2, 0, 60);
                androidx.compose.ui.d dVarA = o1Var.a(aVar2, 1.0f);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD3 = jVar2.D();
                x0.a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarA, jVar2);
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
                ph.v1.j(bVar2, qVarA, jVar2);
                ph.v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                ph.v1.j(cVar, dVarC3, jVar2);
                e0.a aVar4 = aVar;
                g.a.C0128a c0128a3 = c0128a;
                t0.ff.b(f3.q.c(R.string.editor_auto_increment_version_code, jVar2), null, ((t0.e2) jVar2.f(e2Var2)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(e2Var)).f26548k, jVar2, 0, 0, 65530);
                t0.ff.b(f3.q.c(R.string.editor_auto_increment_version_code_desc, jVar2), null, ((t0.e2) jVar2.f(e2Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(e2Var)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
                jVar2.H();
                z.m1 m1VarA3 = z.k1.a(z.b.h(f10), bVar, jVar2, 6);
                int iD4 = jVar2.D();
                x0.a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar2, jVar2);
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
                ph.v1.j(bVar2, m1VarA3, jVar2);
                ph.v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a3);
                }
                ph.v1.j(cVar, dVarC4, jVar2);
                t0.w9.a(this.f10189r, this.f10190s, o1Var.a(aVar2, 1.0f), false, false, null, e.f9358k, null, null, null, null, e.f9360l, false, null, new i0.h2(3, 0, 123), null, false, 0, 0, null, null, jVar2, 1572864, 196992, 8351672);
                t0.w9.a(this.f10191t, this.f10192v, o1Var.a(aVar2, 1.0f), false, false, null, e.f9362m, null, null, null, null, e.f9364n, false, null, new i0.h2(3, 0, 123), null, false, 0, 0, null, null, jVar2, 1572864, 196992, 8351672);
                jVar2.H();
                t0.w9.a(this.f10181h, this.f10182j, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, false, null, e.f9366o, null, null, null, null, e.f9368p, false, null, new i0.h2(3, 0, 123), null, false, 0, 0, null, null, jVar2, 1573248, 196992, 8351672);
                androidx.compose.ui.d dVarD4 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                jVar2.L(-1037482172);
                Object obj4 = this.f10184l;
                boolean zK4 = jVar2.K(obj4);
                Object objG4 = jVar2.g();
                if (zK4 || objG4 == obj3) {
                    objG4 = new ma(obj4, 0);
                    jVar2.C(objG4);
                }
                jVar2.B();
                t0.w9.a(this.f10183k, (eh.l) objG4, dVarD4, false, false, null, e.f9370q, null, null, null, null, e.f9372r, false, null, null, null, true, 0, 0, null, null, jVar2, 1573248, 12583296, 8253368);
            }
            objG2 = new eh.l() { // from class: f9.ka
                @Override // eh.l
                public final Object invoke(Object obj5) {
                    String it = (String) obj5;
                    kotlin.jvm.internal.r.e(it, "it");
                    String string = mh.x.W(mh.t.n(mh.t.n(it, "\n", ""), "\r", "")).toString();
                    StringBuilder sb = new StringBuilder();
                    int length = string.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        char cCharAt = string.charAt(i10);
                        if (('a' <= cCharAt && cCharAt < '{') || (('0' <= cCharAt && cCharAt < ':') || cCharAt == '.' || cCharAt == '_')) {
                            sb.append(cCharAt);
                        }
                    }
                    lVar2.invoke(mh.y.b0(100, sb.toString()));
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG2);
            jVar2.B();
            Object obj32 = obj;
            t0.w9.a(this.f10176c, (eh.l) objG2, dVarD2, false, false, null, e.f9348f, null, null, null, null, f1.c.b(911804252, new na(this.f10178e), jVar2), this.f10178e, null, null, null, true, 1, 0, null, null, jVar2, 1573248, 113246592, 7983032);
            float f102 = 12;
            b.i iVarH2 = z.b.h(f102);
            f.b bVar3 = d.a.f14611j;
            z.m1 m1VarA4 = z.k1.a(iVarH2, bVar3, jVar2, 6);
            int iD5 = jVar2.D();
            x0.a2 a2VarY5 = jVar2.y();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar2, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar32 = g.a.f13863b;
            if (jVar2.t() != null) {
            }
        }
        return pg.f0.f21461a;
    }
}
