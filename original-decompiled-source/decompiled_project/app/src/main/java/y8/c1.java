package y8;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.yalantis.ucrop.view.CropImageView;
import f9.lg;
import h9.q1;
import i2.e0;
import i2.g;
import j1.d;
import java.util.ArrayList;
import java.util.List;
import p0.f6;
import p0.gc;
import p0.o5;
import p0.t6;
import ph.v1;
import s8.e2;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import x0.a2;
import x0.j;
import x0.n1;
import x0.r3;
import x0.s3;

/* loaded from: classes.dex */
public final class c1 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f34076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.x f34077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f34078c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f34079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r3<List<KeystoreEntity>> f34081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34082g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p5.x f34083h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c.k<Intent, e.a> f34084j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r3<List<ProjectEntity>> f34085k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n1<KeystoreEntity> f34086l;

    public c1(z.f1 f1Var, h9.x xVar, Context context, n1 n1Var, n1 n1Var2, r3 r3Var, n1 n1Var3, p5.x xVar2, c.k kVar, r3 r3Var2, n1 n1Var4) {
        this.f34076a = f1Var;
        this.f34077b = xVar;
        this.f34078c = context;
        this.f34079d = n1Var;
        this.f34080e = n1Var2;
        this.f34081f = r3Var;
        this.f34082g = n1Var3;
        this.f34083h = xVar2;
        this.f34084j = kVar;
        this.f34085k = r3Var2;
        this.f34086l = n1Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        r3<List<KeystoreEntity>> r3Var;
        d.a aVar;
        boolean z10;
        final p5.x xVar;
        c.k<Intent, e.a> kVar;
        final h9.x xVar2;
        final n1 n1Var;
        boolean z11;
        z.i FadingPage = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FadingPage, "$this$FadingPage");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(fillElement, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, l0VarD, jVar2);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar2);
            final n1<Boolean> n1Var2 = this.f34080e;
            boolean zBooleanValue = n1Var2.getValue().booleanValue();
            Object obj = j.a.f31715a;
            z.f1 f1Var = this.f34076a;
            final h9.x xVar3 = this.f34077b;
            final Context context = this.f34078c;
            final n1 n1Var3 = this.f34079d;
            if (zBooleanValue) {
                jVar2.L(1789415685);
                boolean zBooleanValue2 = ((Boolean) n1Var3.getValue()).booleanValue();
                float f10 = 8;
                z.g1 g1VarD = androidx.compose.foundation.layout.f.d(f1Var.c() + f10, f1Var.a() + f10, 5);
                jVar2.L(-1604832877);
                boolean zL = jVar2.l(xVar3) | jVar2.l(context) | jVar2.K(n1Var3);
                Object objG = jVar2.g();
                if (zL || objG == obj) {
                    objG = new eh.r() { // from class: y8.t0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.r
                        public final Object f(Object obj2, Object obj3, Object obj4, Object obj5) {
                            String alias = (String) obj2;
                            String password = (String) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                            kotlin.jvm.internal.r.e(alias, "alias");
                            kotlin.jvm.internal.r.e(password, "password");
                            n1 n1Var4 = n1Var3;
                            boolean z12 = zBooleanValue3 && ((Boolean) n1Var4.getValue()).booleanValue();
                            Context context2 = context;
                            u0 u0Var = new u0(context2, n1Var2, zBooleanValue3, alias, n1Var4);
                            kotlin.jvm.internal.r.e(context2, "context");
                            h9.x xVar4 = xVar3;
                            l5.a aVarA = androidx.lifecycle.x0.a(xVar4);
                            wh.c cVar2 = ph.z0.f21632a;
                            ph.h.c(aVarA, wh.b.f31563c, null, new h9.y(iIntValue2, context2, alias, password, xVar4, z12, u0Var, null), 2);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                eh.r rVar = (eh.r) objG;
                jVar2.B();
                jVar2.L(-1604791123);
                Object objG2 = jVar2.g();
                if (objG2 == obj) {
                    objG2 = new d9.z(n1Var2, 1);
                    jVar2.C(objG2);
                }
                jVar2.B();
                v.b(zBooleanValue2, rVar, (eh.a) objG2, g1VarD, jVar2, 384);
                jVar2.B();
            } else {
                jVar2.L(1791467203);
                float f11 = 8;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(ph.m0.e(fillElement, ph.m0.c(jVar2), true), CropImageView.DEFAULT_ASPECT_RATIO, f1Var.c() + f11, CropImageView.DEFAULT_ASPECT_RATIO, f1Var.a(), 5);
                float f12 = 16;
                z.q qVarA = z.o.a(z.b.h(f12), d.a.f14614m, jVar2, 6);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, qVarA, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                r3<List<KeystoreEntity>> r3Var2 = this.f34081f;
                boolean zIsEmpty = r3Var2.getValue().isEmpty();
                d.a aVar3 = d.a.f1143b;
                n1<Boolean> n1Var4 = this.f34082g;
                if (zIsEmpty) {
                    jVar2.L(-301194876);
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, 32), jVar2);
                    androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
                    r3Var = r3Var2;
                    z.q qVarA2 = z.o.a(z.b.f34448e, d.a.f14615n, jVar2, 54);
                    int iD3 = jVar2.D();
                    a2 a2VarY3 = jVar2.y();
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarD, jVar2);
                    if (jVar2.t() == null) {
                        u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar2);
                    } else {
                        jVar2.z();
                    }
                    v1.j(bVar, qVarA2, jVar2);
                    v1.j(dVar, a2VarY3, jVar2);
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                        l9.i.a(iD3, jVar2, iD3, c0128a);
                    }
                    v1.j(cVar, dVarC3, jVar2);
                    w1.d dVarA = t6.a();
                    androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar3, 64);
                    s3 s3Var = f2.f25858a;
                    t4.b(dVarA, null, dVarN, ((e2) jVar2.f(s3Var)).f25773s, jVar2, 432, 0);
                    String strA = pd.d.a(aVar3, 12, jVar2, R.string.keystore_empty_title, jVar2);
                    s3 s3Var2 = of.f26647a;
                    t2.l0 l0Var = ((nf) jVar2.f(s3Var2)).f26547j;
                    long j10 = ((e2) jVar2.f(s3Var)).f25769o;
                    aVar = aVar3;
                    ff.b(strA, null, j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65530);
                    ff.b(pd.d.a(aVar, 4, jVar2, R.string.keystore_empty_subtitle, jVar2), null, ((e2) jVar2.f(s3Var)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26548k, jVar2, 0, 0, 65530);
                    jVar2 = jVar2;
                    jVar2.L(581346347);
                    if (((Boolean) n1Var3.getValue()).booleanValue()) {
                        p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f12), jVar2);
                        jVar2.L(581351826);
                        Object objG3 = jVar2.g();
                        if (objG3 == obj) {
                            z11 = true;
                            objG3 = new f8.p(n1Var4, 1);
                            jVar2.C(objG3);
                        } else {
                            z11 = true;
                        }
                        jVar2.B();
                        t0.x0.a((eh.a) objG3, null, false, null, null, null, null, null, a.f34005e, jVar2, 805306374, 510);
                        jVar2 = jVar2;
                    } else {
                        z11 = true;
                    }
                    jVar2.B();
                    jVar2.H();
                    jVar2.B();
                    z10 = z11;
                } else {
                    r3Var = r3Var2;
                    n1 n1Var5 = n1Var3;
                    jVar2.L(-298873193);
                    Object obj2 = obj;
                    final h9.x xVar4 = xVar3;
                    ff.b(f3.q.c(R.string.keystore_list_title, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25769o, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65498);
                    jVar2 = jVar2;
                    jVar2.L(1930033539);
                    for (final KeystoreEntity keystoreEntity : r3Var.getValue()) {
                        List<ProjectEntity> value = this.f34085k.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : value) {
                            Long keystoreId = ((ProjectEntity) obj3).getKeystoreId();
                            long id2 = keystoreEntity.getId();
                            if (keystoreId != null && keystoreId.longValue() == id2) {
                                arrayList.add(obj3);
                            }
                        }
                        boolean zBooleanValue3 = ((Boolean) n1Var5.getValue()).booleanValue();
                        jVar2.L(581392848);
                        boolean zL2 = jVar2.l(xVar4) | jVar2.K(keystoreEntity) | jVar2.l(context);
                        Object objG4 = jVar2.g();
                        Object obj4 = obj2;
                        if (zL2 || objG4 == obj4) {
                            objG4 = new eh.a() { // from class: y8.w0
                                @Override // eh.a
                                public final Object invoke() {
                                    Context context2 = context;
                                    KeystoreEntity keystore = keystoreEntity;
                                    m9.t tVar = new m9.t(context2, keystore, 1);
                                    kotlin.jvm.internal.r.e(keystore, "keystore");
                                    h9.x xVar5 = xVar4;
                                    l5.a aVarA = androidx.lifecycle.x0.a(xVar5);
                                    wh.c cVar2 = ph.z0.f21632a;
                                    ph.h.c(aVarA, wh.b.f31563c, null, new h9.z(xVar5, keystore, tVar, null), 2);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar2.C(objG4);
                        }
                        eh.a aVar4 = (eh.a) objG4;
                        final n1 n1Var6 = n1Var5;
                        boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar2, 581415382, n1Var6);
                        final p5.x xVar5 = this.f34083h;
                        boolean zL3 = zB | jVar2.l(xVar5) | jVar2.l(xVar4) | jVar2.l(context) | jVar2.K(keystoreEntity);
                        final c.k<Intent, e.a> kVar2 = this.f34084j;
                        boolean zL4 = zL3 | jVar2.l(kVar2);
                        Object objG5 = jVar2.g();
                        if (zL4 || objG5 == obj4) {
                            final h9.x xVar6 = xVar4;
                            objG5 = new eh.a() { // from class: y8.x0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // eh.a
                                public final Object invoke() {
                                    if (!((Boolean) n1Var6.getValue()).booleanValue()) {
                                        p5.x.c(e2.r.f24648c.f24627a, xVar5);
                                        return pg.f0.f21461a;
                                    }
                                    h9.x xVar7 = xVar6;
                                    c.k kVar3 = kVar2;
                                    Context context2 = context;
                                    b1 b1Var = new b1(xVar7, kVar3, context2);
                                    kotlin.jvm.internal.r.e(context2, "context");
                                    KeystoreEntity keystore = keystoreEntity;
                                    kotlin.jvm.internal.r.e(keystore, "keystore");
                                    l5.a aVarA = androidx.lifecycle.x0.a(xVar7);
                                    wh.c cVar2 = ph.z0.f21632a;
                                    ph.h.c(aVarA, wh.b.f31563c, null, new h9.b0(context2, keystore, b1Var, null), 2);
                                    return pg.f0.f21461a;
                                }
                            };
                            xVar = xVar5;
                            kVar = kVar2;
                            jVar2.C(objG5);
                        } else {
                            xVar = xVar5;
                            kVar = kVar2;
                        }
                        eh.a aVar5 = (eh.a) objG5;
                        boolean zB2 = androidx.datastore.preferences.protobuf.e.b(jVar2, 581454970, n1Var6) | jVar2.l(xVar) | jVar2.l(xVar4) | jVar2.l(context) | jVar2.K(keystoreEntity) | jVar2.l(kVar);
                        Object objG6 = jVar2.g();
                        if (zB2 || objG6 == obj4) {
                            final h9.x xVar7 = xVar4;
                            final p5.x xVar8 = xVar;
                            final c.k<Intent, e.a> kVar3 = kVar;
                            objG6 = new eh.a() { // from class: y8.y0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // eh.a
                                public final Object invoke() {
                                    if (!((Boolean) n1Var6.getValue()).booleanValue()) {
                                        p5.x.c(e2.r.f24648c.f24627a, xVar8);
                                        return pg.f0.f21461a;
                                    }
                                    h9.x xVar9 = xVar7;
                                    c.k kVar4 = kVar3;
                                    Context context2 = context;
                                    v0 v0Var = new v0(xVar9, kVar4, context2);
                                    kotlin.jvm.internal.r.e(context2, "context");
                                    KeystoreEntity keystore = keystoreEntity;
                                    kotlin.jvm.internal.r.e(keystore, "keystore");
                                    l5.a aVarA = androidx.lifecycle.x0.a(xVar9);
                                    wh.c cVar2 = ph.z0.f21632a;
                                    ph.h.c(aVarA, wh.b.f31563c, null, new h9.c0(xVar9, keystore, context2, v0Var, null), 2);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar2.C(objG6);
                        }
                        eh.a aVar6 = (eh.a) objG6;
                        boolean zB3 = androidx.datastore.preferences.protobuf.e.b(jVar2, 581494319, n1Var6) | jVar2.l(xVar) | jVar2.l(xVar4) | jVar2.l(context) | jVar2.K(keystoreEntity);
                        Object objG7 = jVar2.g();
                        if (zB3 || objG7 == obj4) {
                            xVar2 = xVar4;
                            final p5.x xVar9 = xVar;
                            objG7 = new eh.a() { // from class: y8.z0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // eh.a
                                public final Object invoke() {
                                    if (!((Boolean) n1Var6.getValue()).booleanValue()) {
                                        p5.x.c(e2.r.f24648c.f24627a, xVar9);
                                        return pg.f0.f21461a;
                                    }
                                    Context context2 = context;
                                    lg lgVar = new lg(context2, 1);
                                    kotlin.jvm.internal.r.e(context2, "context");
                                    KeystoreEntity keystore = keystoreEntity;
                                    kotlin.jvm.internal.r.e(keystore, "keystore");
                                    h9.x xVar10 = xVar2;
                                    l5.a aVarA = androidx.lifecycle.x0.a(xVar10);
                                    wh.c cVar2 = ph.z0.f21632a;
                                    ph.h.c(aVarA, wh.b.f31563c, null, new h9.d0(xVar10, keystore, lgVar, null), 2);
                                    return pg.f0.f21461a;
                                }
                            };
                            n1Var = n1Var6;
                            jVar2.C(objG7);
                        } else {
                            xVar2 = xVar4;
                            n1Var = n1Var6;
                        }
                        eh.a aVar7 = (eh.a) objG7;
                        boolean zB4 = androidx.datastore.preferences.protobuf.e.b(jVar2, 581523960, n1Var) | jVar2.l(xVar) | jVar2.K(keystoreEntity);
                        Object objG8 = jVar2.g();
                        if (zB4 || objG8 == obj4) {
                            final n1<KeystoreEntity> n1Var7 = this.f34086l;
                            objG8 = new eh.a() { // from class: y8.a1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // eh.a
                                public final Object invoke() {
                                    if (((Boolean) n1Var.getValue()).booleanValue()) {
                                        n1Var7.setValue(keystoreEntity);
                                        return pg.f0.f21461a;
                                    }
                                    p5.x.c(e2.r.f24648c.f24627a, xVar);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar2.C(objG8);
                        }
                        jVar2.B();
                        x0.j jVar3 = jVar2;
                        v.g(keystoreEntity, arrayList, zBooleanValue3, aVar4, aVar5, aVar6, aVar7, (eh.a) objG8, jVar3, 0);
                        n1Var5 = n1Var;
                        jVar2 = jVar3;
                        obj2 = obj4;
                        xVar4 = xVar2;
                    }
                    Object obj5 = obj2;
                    jVar2.B();
                    if (((Boolean) n1Var5.getValue()).booleanValue()) {
                        aVar = aVar3;
                        p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f11), jVar2);
                        jVar2.L(1930192307);
                        Object objG9 = jVar2.g();
                        if (objG9 == obj5) {
                            z10 = true;
                            objG9 = new q1(n1Var4, 1);
                            jVar2.C(objG9);
                        } else {
                            z10 = true;
                        }
                        jVar2.B();
                        x0.j jVar4 = jVar2;
                        t0.x0.a((eh.a) objG9, androidx.compose.foundation.layout.g.d(aVar, 1.0f), false, null, null, null, null, null, a.f34006f, jVar4, 805306422, 508);
                        jVar2 = jVar4;
                    } else {
                        aVar = aVar3;
                        z10 = true;
                    }
                    jVar2.B();
                }
                w1.d dVarA2 = o5.a();
                s3 s3Var3 = f2.f25858a;
                v.f(dVarA2, ((t0.e2) jVar2.f(s3Var3)).f25764j, f3.q.c(R.string.keystore_what_title, jVar2), f3.q.c(R.string.keystore_what_body, jVar2), r3Var.getValue().isEmpty() ^ z10, jVar2, 0);
                v.f(f6.a(), ((t0.e2) jVar2.f(s3Var3)).f25760f, f3.q.c(R.string.keystore_tip_title, jVar2), f3.q.c(R.string.keystore_tip_body, jVar2), r3Var.getValue().isEmpty() ^ z10, jVar2, 0);
                v.f(gc.a(), ((t0.e2) jVar2.f(s3Var3)).f25777w, f3.q.c(R.string.keystore_recovery_title, jVar2), f3.q.c(R.string.keystore_recovery_body, jVar2), true, jVar2, 196608);
                p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar), 156), jVar2);
                jVar2.H();
                jVar2.B();
            }
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
