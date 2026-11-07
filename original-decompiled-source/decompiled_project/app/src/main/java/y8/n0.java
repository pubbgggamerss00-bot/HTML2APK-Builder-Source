package y8;

import android.content.Context;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.yalantis.ucrop.view.CropImageView;
import f9.pf;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p0.o5;
import p0.p3;
import p0.q2;
import p0.q3;
import p0.t6;
import p0.y9;
import ph.v1;
import q1.y1;
import t0.ff;
import t0.s4;
import t0.t4;
import x0.a2;
import x0.j;
import x0.n1;
import z.b;
import z.m1;
import z.o1;

/* loaded from: classes.dex */
public final class n0 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f34188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f34189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f34190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f34191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1<pg.n<String, String>> f34194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34195h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f34196j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f34197k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f34198l;

    public n0(boolean z10, eh.a<pg.f0> aVar, KeystoreEntity keystoreEntity, eh.a<pg.f0> aVar2, List<ProjectEntity> list, n1<Boolean> n1Var, n1<pg.n<String, String>> n1Var2, n1<Boolean> n1Var3, Context context, eh.a<pg.f0> aVar3, eh.a<pg.f0> aVar4) {
        this.f34188a = z10;
        this.f34189b = aVar;
        this.f34190c = keystoreEntity;
        this.f34191d = aVar2;
        this.f34192e = list;
        this.f34193f = n1Var;
        this.f34194g = n1Var2;
        this.f34195h = n1Var3;
        this.f34196j = context;
        this.f34197k = aVar3;
        this.f34198l = aVar4;
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        int i10;
        float f10;
        f.b bVar;
        x0.j jVar2;
        n0 n0Var;
        d.a aVar;
        o1 o1Var;
        n0 n0Var2;
        Object next;
        String name;
        z.r Card = rVar;
        x0.j jVar3 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar3.s()) {
            jVar3.v();
        } else {
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 16);
            b.k kVar = z.b.f34446c;
            f.a aVar3 = d.a.f14614m;
            z.q qVarA = z.o.a(kVar, aVar3, jVar3, 0);
            int iD = jVar3.D();
            a2 a2VarY = jVar3.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar3);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            v1.j(bVar2, qVarA, jVar3);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar3);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar3);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            float f11 = 12;
            b.i iVarH = z.b.h(f11);
            f.b bVar3 = d.a.f14612k;
            m1 m1VarA = z.k1.a(iVarH, bVar3, jVar3, 54);
            int iD2 = jVar3.D();
            a2 a2VarY2 = jVar3.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar3);
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            v1.j(bVar2, m1VarA, jVar3);
            v1.j(dVar, a2VarY2, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar3, iD2, c0128a);
            }
            v1.j(cVar, dVarC2, jVar3);
            androidx.compose.ui.d dVarD2 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, 44), h0.f.a(f11));
            long j10 = b3.l.a(jVar3).f25772r;
            y1.a aVar5 = y1.f21750a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD2, j10, aVar5);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD3 = jVar3.D();
            a2 a2VarY3 = jVar3.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar3);
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            v1.j(bVar2, l0VarD, jVar3);
            v1.j(dVar, a2VarY3, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar3, iD3, c0128a);
            }
            v1.j(cVar, dVarC3, jVar3);
            t4.b(t6.a(), null, androidx.compose.foundation.layout.g.n(aVar2, 24), b3.l.a(jVar3).f25751a, jVar3, 432, 0);
            jVar3.H();
            o1 o1Var2 = o1.f34600a;
            androidx.compose.ui.d dVarA = o1Var2.a(aVar2, 1.0f);
            z.q qVarA2 = z.o.a(kVar, aVar3, jVar3, 0);
            int iD4 = jVar3.D();
            a2 a2VarY4 = jVar3.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarA, jVar3);
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            v1.j(bVar2, qVarA2, jVar3);
            v1.j(dVar, a2VarY4, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                l9.i.a(iD4, jVar3, iD4, c0128a);
            }
            v1.j(cVar, dVarC4, jVar3);
            KeystoreEntity keystoreEntity = this.f34190c;
            ff.b(keystoreEntity.getAlias(), null, b3.l.a(jVar3).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26547j, jVar3, 196608, 0, 65498);
            ff.b(f3.q.d(R.string.keystore_item_algorithm, new Object[]{keystoreEntity.getAlgorithm()}, jVar3), null, b3.l.a(jVar3).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26549l, jVar3, 0, 0, 65530);
            float f12 = 4;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f12), jVar3);
            ?? r10 = this.f34192e;
            if (r10.isEmpty()) {
                i10 = 2;
                f10 = f11;
                bVar = bVar3;
                jVar3.L(-79281630);
                ff.b(f3.q.c(R.string.keystore_no_project_linked, jVar3), null, q1.b1.c(0.7f, b3.l.a(jVar3).f25773s), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26552o, jVar3, 0, 0, 65530);
                jVar2 = jVar3;
                jVar2.B();
            } else {
                jVar3.L(-80684783);
                b.i iVarH2 = z.b.h(f12);
                float f13 = 6;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.a.b(e1.d.d(aVar2, h0.f.a(f13)), q1.b1.c(0.7f, b3.l.a(jVar3).f25755c), aVar5), f13, 2);
                m1 m1VarA2 = z.k1.a(iVarH2, bVar3, jVar3, 54);
                int iD5 = jVar3.D();
                a2 a2VarY5 = jVar3.y();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarI, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar4);
                } else {
                    jVar3.z();
                }
                v1.j(bVar2, m1VarA2, jVar3);
                v1.j(dVar, a2VarY5, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD5))) {
                    l9.i.a(iD5, jVar3, iD5, c0128a);
                }
                v1.j(cVar, dVarC5, jVar3);
                t4.b(o5.a(), null, androidx.compose.foundation.layout.g.n(aVar2, f11), b3.l.a(jVar3).f25757d, jVar3, 432, 0);
                ArrayList arrayList = new ArrayList(qg.p.h(r10, 10));
                for (ProjectEntity projectEntity : r10) {
                    Iterator<String> it = mh.x.D(projectEntity.getAppName()).iterator();
                    while (true) {
                        mh.f fVar = (mh.f) it;
                        if (!fVar.hasNext()) {
                            next = null;
                            break;
                        }
                        next = fVar.next();
                        if (!mh.x.A((String) next)) {
                            break;
                        }
                    }
                    String str = (String) next;
                    if (str == null || (name = mh.x.W(str).toString()) == null) {
                        name = projectEntity.getName();
                    }
                    arrayList.add(name);
                }
                List listX = qg.x.x(arrayList);
                f10 = f11;
                bVar = bVar3;
                i10 = 2;
                ff.b(f3.q.d(R.string.keystore_project_linked, new Object[]{listX.size() <= 2 ? qg.x.I(listX, null, null, null, null, 63) : qg.x.I(qg.x.W(listX, 2), null, null, null, null, 63) + " +" + (listX.size() - 2)}, jVar3), null, b3.l.a(jVar3).f25757d, 0L, x2.p.f32032e, null, 0L, null, 0L, 2, false, 2, 0, b3.l.b(jVar3).f26552o, jVar3, 196608, 3120, 55258);
                jVar2 = jVar3;
                jVar2.H();
                jVar2.B();
            }
            jVar2.L(-2545930);
            if (keystoreEntity.isPersisted()) {
                x0.j jVar4 = jVar2;
                ff.b(pd.d.a(aVar2, i10, jVar2, R.string.keystore_persisted, jVar2), null, b3.l.a(jVar2).f25751a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).f26549l, jVar4, 0, 0, 65530);
                jVar2 = jVar4;
            }
            jVar2.B();
            jVar2.H();
            jVar2.L(653904391);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                n0Var = this;
                final n1<Boolean> n1Var = n0Var.f34193f;
                objG = new eh.a() { // from class: y8.k0
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.TRUE);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            } else {
                n0Var = this;
            }
            jVar2.B();
            x0.j jVar5 = jVar2;
            s4.c((eh.a) objG, null, false, null, a.A, jVar5, 196614, 30);
            x0.j jVar6 = jVar5;
            jVar6.H();
            pg.n<String, String> value = n0Var.f34194g.getValue();
            jVar6.L(-2080349827);
            if (value == null) {
                aVar = aVar2;
                n0Var2 = n0Var;
                o1Var = o1Var2;
            } else {
                String str2 = value.f21469a;
                String str3 = value.f21470b;
                jVar6.L(-2080348601);
                if (str2 == null && str3 == null) {
                    aVar = aVar2;
                    n0Var2 = n0Var;
                    o1Var = o1Var2;
                } else {
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 8), jVar6);
                    androidx.compose.ui.d dVarD3 = e1.d.d(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), h0.f.a(10));
                    jVar6.L(653926199);
                    n1<Boolean> n1Var2 = n0Var.f34195h;
                    boolean zK = jVar6.K(n1Var2);
                    Object objG2 = jVar6.g();
                    if (zK || objG2 == c0321a) {
                        objG2 = new pf(n1Var2, 1);
                        jVar6.C(objG2);
                    }
                    jVar6.B();
                    androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD3, false, null, null, (eh.a) objG2, 7), CropImageView.DEFAULT_ASPECT_RATIO, 6, 1);
                    m1 m1VarA3 = z.k1.a(z.b.f34444a, bVar, jVar6, 48);
                    int iD6 = jVar6.D();
                    a2 a2VarY6 = jVar6.y();
                    androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarJ, jVar6);
                    e0.a aVar6 = g.a.f13863b;
                    if (jVar6.t() == null) {
                        u1.d();
                        throw null;
                    }
                    jVar6.r();
                    if (jVar6.m()) {
                        jVar6.w(aVar6);
                    } else {
                        jVar6.z();
                    }
                    v1.j(g.a.f13867f, m1VarA3, jVar6);
                    v1.j(g.a.f13866e, a2VarY6, jVar6);
                    g.a.C0128a c0128a2 = g.a.f13868g;
                    if (jVar6.m() || !kotlin.jvm.internal.r.a(jVar6.g(), Integer.valueOf(iD6))) {
                        l9.i.a(iD6, jVar6, iD6, c0128a2);
                    }
                    v1.j(g.a.f13865d, dVarC6, jVar6);
                    String strC = f3.q.c(R.string.keystore_fingerprints_title, jVar6);
                    t2.l0 l0Var = b3.l.b(jVar6).f26551n;
                    x2.p pVar = x2.p.f32033f;
                    long j11 = b3.l.a(jVar6).f25771q;
                    androidx.compose.ui.d dVarA2 = o1Var2.a(aVar2, 1.0f);
                    aVar = aVar2;
                    o1Var = o1Var2;
                    n0Var2 = this;
                    ff.b(strC, dVarA2, j11, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar6, 196608, 0, 65496);
                    t4.b(n1Var2.getValue().booleanValue() ? p3.a() : q3.a(), null, null, b3.l.a(jVar6).f25773s, jVar6, 48, 4);
                    jVar6.H();
                    androidx.compose.animation.d.b(z.s.f34624a, n1Var2.getValue().booleanValue(), null, null, null, null, f1.c.b(568792376, new m0(n0Var2.f34196j, str2, str3), jVar6), jVar6, 1572870, 30);
                    jVar6 = jVar6;
                }
                jVar6.B();
                pg.f0 f0Var = pg.f0.f21461a;
            }
            jVar6.B();
            jVar6.L(-2080280835);
            boolean z10 = n0Var2.f34188a;
            if (z10) {
                d.a aVar7 = aVar;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, f10), jVar6);
                androidx.compose.ui.d dVarD4 = androidx.compose.foundation.layout.g.d(aVar7, 1.0f);
                float f14 = 8;
                m1 m1VarA4 = z.k1.a(z.b.h(f14), d.a.f14611j, jVar6, 6);
                int iD7 = jVar6.D();
                a2 a2VarY7 = jVar6.y();
                androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarD4, jVar6);
                e0.a aVar8 = g.a.f13863b;
                if (jVar6.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar6.r();
                if (jVar6.m()) {
                    jVar6.w(aVar8);
                } else {
                    jVar6.z();
                }
                v1.j(g.a.f13867f, m1VarA4, jVar6);
                v1.j(g.a.f13866e, a2VarY7, jVar6);
                g.a.C0128a c0128a3 = g.a.f13868g;
                if (jVar6.m() || !kotlin.jvm.internal.r.a(jVar6.g(), Integer.valueOf(iD7))) {
                    l9.i.a(iD7, jVar6, iD7, c0128a3);
                }
                v1.j(g.a.f13865d, dVarC7, jVar6);
                o1 o1Var3 = o1Var;
                v.a(y9.a(), f3.q.c(R.string.keystore_export_p12, jVar6), n0Var2.f34197k, o1Var3.a(aVar7, 1.0f), jVar6, 0);
                v.a(q2.a(), f3.q.c(R.string.keystore_export_pem, jVar6), n0Var2.f34198l, o1Var3.a(aVar7, 1.0f), jVar6, 0);
                jVar6.H();
                jVar6.L(-2080254759);
                if (z10) {
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, f14), jVar6);
                    v.a(p0.v1.a(), f3.q.c(R.string.keystore_export_pepk, jVar6), n0Var2.f34189b, androidx.compose.foundation.layout.g.d(aVar7, 1.0f), jVar6, 3072);
                }
                jVar6.B();
                if (!keystoreEntity.isPersisted()) {
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, f14), jVar6);
                    v.a(p0.v1.a(), f3.q.c(R.string.keystore_persist, jVar6), n0Var2.f34191d, androidx.compose.foundation.layout.g.d(aVar7, 1.0f), jVar6, 3072);
                }
            }
            x0.j jVar7 = jVar6;
            jVar7.B();
            jVar7.H();
        }
        return pg.f0.f21461a;
    }
}
