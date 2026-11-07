package q8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import java.util.ArrayList;
import java.util.List;
import mh.i;
import t0.ff;
import t0.nf;
import t0.of;
import t2.b;
import t2.i;
import x0.s3;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f22111a = new f1.b(575498859, false, a.f22115a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f22112b = new f1.b(173179604, false, b.f22116a);

    /* renamed from: c, reason: collision with root package name */
    public static final f1.b f22113c = new f1.b(404848115, false, c.f22117a);

    /* renamed from: d, reason: collision with root package name */
    public static final f1.b f22114d = new f1.b(-1785871693, false, d.f22118a);

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22115a = new a();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                mh.k kVar = n2.f22323a;
                jVar2.L(-1671101167);
                String strC = f3.q.c(R.string.sign_in_consent_terms, jVar2);
                List listJ = qg.p.j(new pg.n(f3.q.c(R.string.sign_in_consent_terms_link, jVar2), f3.q.c(R.string.terms_url, jVar2)), new pg.n(f3.q.c(R.string.sign_in_consent_privacy_link, jVar2), f3.q.c(R.string.privacy_policy_url, jVar2)));
                t2.i0 i0Var = new t2.i0(new t2.b0(((t0.e2) jVar2.f(t0.f2.f25858a)).f25751a, 0L, x2.p.f32032e, (x2.n) null, (x2.o) null, (x2.f) null, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, e3.i.f8365c, (q1.e2) null, 61434), 14);
                b.C0288b c0288b = new b.C0288b();
                while (true) {
                    if (strC.length() <= 0) {
                        break;
                    }
                    mh.i iVarB = n2.f22323a.b(strC);
                    if (iVarB == null) {
                        c0288b.b(strC);
                        break;
                    }
                    String strSubstring = strC.substring(0, iVarB.b().f15744a);
                    kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                    c0288b.b(strSubstring);
                    pg.n nVar = (pg.n) listJ.get(Integer.parseInt((String) ((i.a) iVarB.a()).get(1)) - 1);
                    String str = (String) nVar.f21469a;
                    b.C0288b.a aVar = new b.C0288b.a(new i.b((String) nVar.f21470b, i0Var), c0288b.f27764a.length(), 0, 12);
                    ArrayList arrayList = c0288b.f27765b;
                    arrayList.add(aVar);
                    c0288b.f27766c.add(aVar);
                    int size = arrayList.size() - 1;
                    try {
                        c0288b.b(str);
                        pg.f0 f0Var = pg.f0.f21461a;
                        c0288b.d(size);
                        strC = strC.substring(iVarB.b().f15745b + 1);
                        kotlin.jvm.internal.r.d(strC, "substring(...)");
                    } catch (Throwable th2) {
                        c0288b.d(size);
                        throw th2;
                    }
                }
                t2.b bVarE = c0288b.e();
                jVar2.B();
                ff.c(bVarE, null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, null, 0L, 0L, 0, false, 0, 0, null, null, ((nf) jVar2.f(of.f26647a)).f26548k, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f22116a = new b();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                z.q qVarA = z.o.a(z.b.h(4), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, jVar2);
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
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                String strC = f3.q.c(R.string.sign_in_consent_transfer, jVar2);
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26548k;
                s3 s3Var2 = t0.f2.f25858a;
                ff.b(strC, null, ((t0.e2) jVar2.f(s3Var2)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65530);
                ff.b(f3.q.c(R.string.sign_in_consent_transfer_note, jVar2), null, ((t0.e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f22117a = new c();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.sign_in_consent_age, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26548k, jVar2, 0, 0, 65530);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f22118a = new d();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.common_cancel, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }
}
