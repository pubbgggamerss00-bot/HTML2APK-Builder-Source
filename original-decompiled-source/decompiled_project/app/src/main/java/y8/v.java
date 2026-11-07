package y8;

import a9.b2;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b9.f4;
import b9.r3;
import b9.w3;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.yalantis.ucrop.view.CropImageView;
import f9.cf;
import f9.o8;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j5.a;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p0.q2;
import ph.v1;
import q1.y1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.ra;
import t0.t4;
import t0.w9;
import x0.a2;
import x0.h2;
import x0.j;
import x0.n1;
import x0.s3;
import x0.w2;
import z.b;
import z.m1;

/* loaded from: classes.dex */
public final class v {

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.keystore.KeystoreManagerScreenKt$DiscoverKeystoresDialog$1$1", f = "KeystoreManagerScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h9.x f34245a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f34246b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n1<List<KeystoreStorage.PersistedKeystore>> f34247c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h9.x xVar, n1<Boolean> n1Var, n1<List<KeystoreStorage.PersistedKeystore>> n1Var2, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f34245a = xVar;
            this.f34246b = n1Var;
            this.f34247c = n1Var2;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f34245a, this.f34246b, this.f34247c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            cf cfVar = new cf(1, this.f34246b, this.f34247c);
            h9.x xVar = this.f34245a;
            l5.a aVarA = androidx.lifecycle.x0.a(xVar);
            wh.c cVar = ph.z0.f21632a;
            ph.h.c(aVarA, wh.b.f31563c, null, new h9.a0(xVar, cfVar, null), 2);
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f34248a;

        public b(eh.a<pg.f0> aVar) {
            this.f34248a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f34248a, null, false, null, null, null, y8.a.f34012l, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f34249a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<List<KeystoreStorage.PersistedKeystore>> f34250b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h9.x f34251c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f34252d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f34253e;

        public c(n1<Boolean> n1Var, n1<List<KeystoreStorage.PersistedKeystore>> n1Var2, h9.x xVar, Context context, eh.a<pg.f0> aVar) {
            this.f34249a = n1Var;
            this.f34250b = n1Var2;
            this.f34251c = xVar;
            this.f34252d = context;
            this.f34253e = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2;
            x0.j jVar3 = jVar;
            if ((num.intValue() & 3) == 2 && jVar3.s()) {
                jVar3.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 240);
                g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
                int iD = jVar3.D();
                a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarF, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                g.a.b bVar = g.a.f13867f;
                v1.j(bVar, l0VarD, jVar3);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar3);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar3);
                boolean zBooleanValue = this.f34249a.getValue().booleanValue();
                j1.f fVar = d.a.f14606e;
                if (zBooleanValue) {
                    jVar3.L(-1516501648);
                    FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                    g2.l0 l0VarD2 = z.g.d(fVar, false);
                    int iD2 = jVar3.D();
                    a2 a2VarY2 = jVar3.y();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(fillElement, jVar3);
                    if (jVar3.t() == null) {
                        u1.d();
                        throw null;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        jVar3.w(aVar2);
                    } else {
                        jVar3.z();
                    }
                    v1.j(bVar, l0VarD2, jVar3);
                    v1.j(dVar, a2VarY2, jVar3);
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                        l9.i.a(iD2, jVar3, iD2, c0128a);
                    }
                    v1.j(cVar, dVarC2, jVar3);
                    jVar2 = jVar3;
                    ff.b(f3.q.c(R.string.home_exporting, jVar3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
                    jVar2.H();
                    jVar2.B();
                } else {
                    n1<List<KeystoreStorage.PersistedKeystore>> n1Var = this.f34250b;
                    if (n1Var.getValue().isEmpty()) {
                        jVar3.L(-1516226399);
                        FillElement fillElement2 = androidx.compose.foundation.layout.g.f976c;
                        g2.l0 l0VarD3 = z.g.d(fVar, false);
                        int iD3 = jVar3.D();
                        a2 a2VarY3 = jVar3.y();
                        androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(fillElement2, jVar3);
                        if (jVar3.t() == null) {
                            u1.d();
                            throw null;
                        }
                        jVar3.r();
                        if (jVar3.m()) {
                            jVar3.w(aVar2);
                        } else {
                            jVar3.z();
                        }
                        v1.j(bVar, l0VarD3, jVar3);
                        v1.j(dVar, a2VarY3, jVar3);
                        if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                            l9.i.a(iD3, jVar3, iD3, c0128a);
                        }
                        v1.j(cVar, dVarC3, jVar3);
                        jVar2 = jVar3;
                        ff.b(f3.q.c(R.string.keystore_discover_empty, jVar3), null, ((e2) jVar3.f(f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(of.f26647a)).f26548k, jVar2, 0, 0, 65530);
                        jVar2.H();
                        jVar2.B();
                    } else {
                        jVar3.L(-1515632656);
                        androidx.compose.ui.d dVarE = ph.m0.e(aVar, ph.m0.c(jVar3), true);
                        z.q qVarA = z.o.a(z.b.h(8), d.a.f14614m, jVar3, 6);
                        int iD4 = jVar3.D();
                        a2 a2VarY4 = jVar3.y();
                        androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarE, jVar3);
                        if (jVar3.t() == null) {
                            u1.d();
                            throw null;
                        }
                        jVar3.r();
                        if (jVar3.m()) {
                            jVar3.w(aVar2);
                        } else {
                            jVar3.z();
                        }
                        v1.j(bVar, qVarA, jVar3);
                        v1.j(dVar, a2VarY4, jVar3);
                        if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                            l9.i.a(iD4, jVar3, iD4, c0128a);
                        }
                        v1.j(cVar, dVarC4, jVar3);
                        jVar3.L(-479685960);
                        for (KeystoreStorage.PersistedKeystore persistedKeystore : n1Var.getValue()) {
                            jVar3.L(703739630);
                            Object objG = jVar3.g();
                            j.a.C0321a c0321a = j.a.f31715a;
                            if (objG == c0321a) {
                                objG = bg.b.h("");
                                jVar3.C(objG);
                            }
                            n1 n1Var2 = (n1) objG;
                            jVar3.B();
                            jVar3.L(703742190);
                            Object objG2 = jVar3.g();
                            if (objG2 == c0321a) {
                                objG2 = bg.b.h("");
                                jVar3.C(objG2);
                            }
                            jVar3.B();
                            t0.d1.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), h0.f.a(16), t0.z0.a(q1.b1.c(0.85f, ((e2) jVar3.f(f2.f25858a)).f25770p), jVar3, 0), null, null, f1.c.b(755333314, new z(this.f34252d, persistedKeystore, this.f34253e, this.f34251c, n1Var2, (n1) objG2), jVar3), jVar3, 196614, 24);
                        }
                        jVar2 = jVar3;
                        jVar2.B();
                        jVar2.H();
                        jVar2.B();
                    }
                }
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.p<String, String, pg.f0> f34254a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<String> f34255b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n1<String> f34256c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(eh.p<? super String, ? super String, pg.f0> pVar, n1<String> n1Var, n1<String> n1Var2) {
            this.f34254a = pVar;
            this.f34255b = n1Var;
            this.f34256c = n1Var2;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(1076190633);
                final eh.p<String, String, pg.f0> pVar = this.f34254a;
                boolean zK = jVar2.K(pVar);
                Object objG = jVar2.g();
                final n1<String> n1Var = this.f34256c;
                final n1<String> n1Var2 = this.f34255b;
                if (zK || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: y8.a0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            pVar.invoke((String) n1Var2.getValue(), (String) n1Var.getValue());
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                eh.a aVar = (eh.a) objG;
                jVar2.B();
                t0.x0.d(aVar, null, (mh.x.A(n1Var2.getValue()) || mh.x.A(n1Var.getValue())) ? false : true, null, null, null, y8.a.f34007g, jVar2, 805306368, 506);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f34257a;

        public e(eh.a<pg.f0> aVar) {
            this.f34257a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f34257a, null, false, null, null, null, y8.a.f34008h, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n1<String> f34258a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<String> f34259b;

        public f(n1<String> n1Var, n1<String> n1Var2) {
            this.f34258a = n1Var;
            this.f34259b = n1Var2;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                z.q qVarA = z.o.a(z.b.h(8), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, jVar2);
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
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                v1.j(g.a.f13865d, dVarC, jVar2);
                ff.b(f3.q.c(R.string.keystore_import_body, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
                n1<String> n1Var = this.f34258a;
                String value = n1Var.getValue();
                jVar2.L(-736168360);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (objG == c0321a) {
                    objG = new androidx.room.e0(n1Var, 1);
                    jVar2.C(objG);
                }
                jVar2.B();
                w9.a(value, (eh.l) objG, null, false, false, null, y8.a.f34010j, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, jVar2, 1572912, 12582912, 8257468);
                final n1<String> n1Var2 = this.f34259b;
                String value2 = n1Var2.getValue();
                jVar2.L(-736160037);
                Object objG2 = jVar2.g();
                if (objG2 == c0321a) {
                    objG2 = new eh.l() { // from class: y8.b0
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            String it = (String) obj;
                            kotlin.jvm.internal.r.e(it, "it");
                            n1Var2.setValue(it);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                w9.a(value2, (eh.l) objG2, null, false, false, null, y8.a.f34011k, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, jVar2, 1572912, 12582912, 8257468);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ph.i0 f34260a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f34261b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ KeystoreEntity f34262c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f34263d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f34264e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f34265f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ n1<String> f34266g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n1<Uri> f34267h;

        public g(Context context, KeystoreEntity keystoreEntity, eh.a aVar, ph.i0 i0Var, n1 n1Var, n1 n1Var2, n1 n1Var3, n1 n1Var4) {
            this.f34260a = i0Var;
            this.f34261b = context;
            this.f34262c = keystoreEntity;
            this.f34263d = aVar;
            this.f34264e = n1Var;
            this.f34265f = n1Var2;
            this.f34266g = n1Var3;
            this.f34267h = n1Var4;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
        @Override // eh.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(-223138856);
                boolean zL = jVar2.l(this.f34260a) | jVar2.l(this.f34261b);
                final KeystoreEntity keystoreEntity = this.f34262c;
                boolean zK = zL | jVar2.K(keystoreEntity) | jVar2.K(this.f34263d);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    final Context context = this.f34261b;
                    final eh.a<pg.f0> aVar = this.f34263d;
                    final ph.i0 i0Var = this.f34260a;
                    final n1<Boolean> n1Var = this.f34264e;
                    final n1<Boolean> n1Var2 = this.f34265f;
                    final n1<String> n1Var3 = this.f34266g;
                    final n1<Uri> n1Var4 = this.f34267h;
                    eh.a aVar2 = new eh.a() { // from class: y8.e1
                        @Override // eh.a
                        public final Object invoke() {
                            ph.h.c(i0Var, null, null, new f1(context, aVar, n1Var, keystoreEntity, n1Var2, n1Var3, n1Var4, null), 3);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(aVar2);
                    objG = aVar2;
                }
                eh.a aVar3 = (eh.a) objG;
                jVar2.B();
                n1<Boolean> n1Var5 = this.f34264e;
                if (!n1Var5.getValue().booleanValue()) {
                    n1<Boolean> n1Var6 = this.f34265f;
                    boolean z10 = (n1Var6.getValue().booleanValue() && !mh.x.A(this.f34266g.getValue())) || !(n1Var6.getValue().booleanValue() || this.f34267h.getValue() == null);
                    t0.x0.d(aVar3, null, z10, null, null, null, f1.c.b(340394902, new g1(n1Var5), jVar2), jVar2, 805306368, 506);
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f34268a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f34269b;

        public h(eh.a<pg.f0> aVar, n1<Boolean> n1Var) {
            this.f34268a = aVar;
            this.f34269b = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f34268a, null, !this.f34269b.getValue().booleanValue(), null, null, null, y8.a.f34017q, jVar2, 805306368, 506);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class i implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.k<String, Uri> f34270a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f34271b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f34272c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1<String> f34273d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n1<String> f34274e;

        public i(c.k<String, Uri> kVar, Context context, n1<Boolean> n1Var, n1<String> n1Var2, n1<String> n1Var3) {
            this.f34270a = kVar;
            this.f34271b = context;
            this.f34272c = n1Var;
            this.f34273d = n1Var2;
            this.f34274e = n1Var3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            int i10;
            Object obj;
            float f10;
            e0.a aVar;
            g.a.C0128a c0128a;
            n1<Boolean> n1Var;
            int i11;
            Object obj2;
            x0.j jVar2;
            x0.j jVar3 = jVar;
            if ((num.intValue() & 3) == 2 && jVar3.s()) {
                jVar3.v();
            } else {
                t.u1 u1VarC = ph.m0.c(jVar3);
                d.a aVar2 = d.a.f1143b;
                androidx.compose.ui.d dVarE = ph.m0.e(aVar2, u1VarC, true);
                z.q qVarA = z.o.a(z.b.h(12), d.a.f14614m, jVar3, 6);
                int iD = jVar3.D();
                a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarE, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar3);
                } else {
                    jVar3.z();
                }
                g.a.b bVar = g.a.f13867f;
                v1.j(bVar, qVarA, jVar3);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar3);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a2);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar3);
                s3 s3Var = of.f26647a;
                ff.b("Select the same option you chose in Play Console.", null, ((e2) jVar3.f(f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var)).f26548k, jVar3, 6, 0, 65530);
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                jVar3.L(-1580984712);
                Object objG = jVar3.g();
                final n1<Boolean> n1Var2 = this.f34272c;
                j.a.C0321a c0321a = j.a.f31715a;
                if (objG == c0321a) {
                    i10 = 1;
                    x8.m mVar = new x8.m(n1Var2, 1);
                    jVar3.C(mVar);
                    obj = mVar;
                } else {
                    i10 = 1;
                    obj = objG;
                }
                jVar3.B();
                androidx.compose.ui.d dVarC2 = androidx.compose.foundation.b.c(dVarD, false, null, null, (eh.a) obj, 7);
                float f11 = 4;
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(dVarC2, CropImageView.DEFAULT_ASPECT_RATIO, f11, i10);
                b.j jVar4 = z.b.f34444a;
                f.b bVar2 = d.a.f14612k;
                m1 m1VarA = z.k1.a(jVar4, bVar2, jVar3, 48);
                int iD2 = jVar3.D();
                a2 a2VarY2 = jVar3.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarJ, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    f10 = f11;
                    aVar = aVar3;
                    jVar3.w(aVar);
                } else {
                    f10 = f11;
                    aVar = aVar3;
                    jVar3.z();
                }
                e0.a aVar4 = aVar;
                v1.j(bVar, m1VarA, jVar3);
                v1.j(dVar, a2VarY2, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                    c0128a = c0128a2;
                    l9.i.a(iD2, jVar3, iD2, c0128a);
                } else {
                    c0128a = c0128a2;
                }
                v1.j(cVar, dVarC3, jVar3);
                boolean zBooleanValue = n1Var2.getValue().booleanValue();
                jVar3.L(957487383);
                Object objG2 = jVar3.g();
                Object obj3 = objG2;
                if (objG2 == c0321a) {
                    eh.l lVar = new eh.l() { // from class: y8.h1
                        @Override // eh.l
                        public final Object invoke(Object obj4) {
                            ((Boolean) obj4).getClass();
                            n1Var2.setValue(Boolean.TRUE);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar3.C(lVar);
                    obj3 = lVar;
                }
                jVar3.B();
                t0.m1.a(zBooleanValue, (eh.l) obj3, null, false, null, jVar3, 48, 60);
                String strC = f3.q.c(R.string.keystore_pepk_method_hex, jVar3);
                t2.l0 l0Var = ((nf) jVar3.f(s3Var)).f26548k;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                g.a.C0128a c0128a3 = c0128a;
                float f12 = f10;
                ff.b(strC, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar3, 0, 0, 65532);
                jVar3.H();
                androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                jVar3.L(-1580963975);
                Object objG3 = jVar3.g();
                if (objG3 == c0321a) {
                    n1Var = n1Var2;
                    i11 = 1;
                    o8 o8Var = new o8(n1Var, 1);
                    jVar3.C(o8Var);
                    obj2 = o8Var;
                } else {
                    n1Var = n1Var2;
                    i11 = 1;
                    obj2 = objG3;
                }
                jVar3.B();
                androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD2, false, null, null, (eh.a) obj2, 7), CropImageView.DEFAULT_ASPECT_RATIO, f12, i11);
                m1 m1VarA2 = z.k1.a(jVar4, bVar2, jVar3, 48);
                int iD3 = jVar3.D();
                a2 a2VarY3 = jVar3.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarJ2, jVar3);
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
                v1.j(bVar, m1VarA2, jVar3);
                v1.j(dVar, a2VarY3, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar3, iD3, c0128a3);
                }
                v1.j(cVar, dVarC4, jVar3);
                boolean z10 = (n1Var.getValue().booleanValue() ? 1 : 0) ^ i11;
                jVar3.L(957508184);
                Object objG4 = jVar3.g();
                Object obj4 = objG4;
                if (objG4 == c0321a) {
                    s5.n nVar = new s5.n(n1Var, i11);
                    jVar3.C(nVar);
                    obj4 = nVar;
                }
                jVar3.B();
                boolean z11 = i11;
                n1<Boolean> n1Var3 = n1Var;
                t0.m1.a(z10, (eh.l) obj4, null, false, null, jVar3, 48, 60);
                String strC2 = f3.q.c(R.string.keystore_pepk_method_pem, jVar3);
                t2.l0 l0Var2 = ((nf) jVar3.f(s3Var)).f26548k;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                ff.b(strC2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z11), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar3, 0, 0, 65532);
                jVar3.H();
                if (n1Var3.getValue().booleanValue()) {
                    jVar3.L(-1764758840);
                    final n1<String> n1Var4 = this.f34273d;
                    String value = n1Var4.getValue();
                    androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                    jVar3.L(-1580944874);
                    Object objG5 = jVar3.g();
                    Object obj5 = objG5;
                    if (objG5 == c0321a) {
                        eh.l lVar2 = new eh.l() { // from class: y8.i1
                            @Override // eh.l
                            public final Object invoke(Object obj6) {
                                String it = (String) obj6;
                                kotlin.jvm.internal.r.e(it, "it");
                                n1Var4.setValue(it);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar3.C(lVar2);
                        obj5 = lVar2;
                    }
                    jVar3.B();
                    w9.a(value, (eh.l) obj5, dVarD3, false, false, null, y8.a.f34019s, null, null, null, null, null, false, null, null, null, false, 5, 3, null, null, jVar3, 1573296, 905969664, 7602104);
                    jVar3.B();
                    jVar2 = jVar3;
                } else {
                    jVar3.L(-1764352120);
                    jVar3.L(-1580933326);
                    final c.k<String, Uri> kVar = this.f34270a;
                    boolean zL = jVar3.l(kVar);
                    final Context context = this.f34271b;
                    boolean zL2 = zL | jVar3.l(context);
                    Object objG6 = jVar3.g();
                    Object obj6 = objG6;
                    if (zL2 || objG6 == c0321a) {
                        eh.a aVar5 = new eh.a() { // from class: y8.j1
                            @Override // eh.a
                            public final Object invoke() {
                                hf.a.a(kVar, context, "*/*", R.string.launch_no_app);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar3.C(aVar5);
                        obj6 = aVar5;
                    }
                    jVar3.B();
                    jVar2 = jVar3;
                    t0.x0.c((eh.a) obj6, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, null, null, null, null, f1.c.b(1348523946, new k1(this.f34274e), jVar3), jVar2, 805306416, 508);
                    jVar2.B();
                }
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class j implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f34275a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f34276b;

        public j(Context context, eh.a<pg.f0> aVar) {
            this.f34275a = context;
            this.f34276b = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(-1755337497);
                final Context context = this.f34275a;
                boolean zL = jVar2.l(context);
                final eh.a<pg.f0> aVar = this.f34276b;
                boolean zK = zL | jVar2.K(aVar);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: y8.l1
                        @Override // eh.a
                        public final Object invoke() {
                            Context context2 = context;
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse("https://play.google.com/console/"));
                            try {
                                context2.startActivity(intent);
                            } catch (Exception unused) {
                                org.bouncycastle.crypto.engines.a.b(context2, R.string.keystore_browser_not_found, context2, 0);
                            }
                            aVar.invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, y8.a.f34020t, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class k implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f34277a;

        public k(eh.a<pg.f0> aVar) {
            this.f34277a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f34277a, null, false, null, null, null, y8.a.f34021u, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(final w1.d dVar, final String str, final eh.a aVar, final androidx.compose.ui.d dVar2, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-303491472);
        int i11 = (kVarP.K(dVar) ? 4 : 2) | i10 | (kVarP.K(str) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128);
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.K(dVar2) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            float f10 = 12;
            androidx.compose.ui.d dVarD = e1.d.d(dVar2, h0.f.a(f10));
            s3 s3Var = f2.f25858a;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(androidx.compose.foundation.a.b(dVarD, q1.b1.c(0.5f, ((e2) kVarP.f(s3Var)).f25772r), y1.f21750a), false, null, null, aVar, 7), f10, 10);
            m1 m1VarA = z.k1.a(z.b.h(8), d.a.f14612k, kVarP, 54);
            int i12 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, m1VarA, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVarP);
            t4.b(dVar, null, androidx.compose.foundation.layout.g.n(d.a.f1143b, 18), ((e2) kVarP.f(s3Var)).f25751a, kVarP, (i11 & 14) | 432, 0);
            ff.b(str, null, ((e2) kVarP.f(s3Var)).f25771q, 0L, x2.p.f32031d, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26549l, kVarP, ((i11 >> 3) & 14) | 196608, 0, 65498);
            kVarP = kVarP;
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: y8.b
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v.a(dVar, str, aVar, dVar2, (x0.j) obj, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final boolean z10, final eh.r rVar, final eh.a aVar, final z.g1 g1Var, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-148254691);
        int i11 = i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.l(rVar) ? 32 : 16) | (kVarP.K(g1Var) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(338840478);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = bg.b.h("");
                kVarP.C(objG);
            }
            final n1 n1Var = (n1) objG;
            Object objA = p0.h.a(kVarP, false, 338842142);
            if (objA == obj) {
                objA = bg.b.h("");
                kVarP.C(objA);
            }
            final n1 n1Var2 = (n1) objA;
            Object objA2 = p0.h.a(kVarP, false, 338843808);
            if (objA2 == obj) {
                objA2 = bg.b.h("25");
                kVarP.C(objA2);
            }
            final n1 n1Var3 = (n1) objA2;
            Object objA3 = p0.h.a(kVarP, false, 338845505);
            if (objA3 == obj) {
                objA3 = bg.b.h(Boolean.FALSE);
                kVarP.C(objA3);
            }
            final n1 n1Var4 = (n1) objA3;
            Object objA4 = p0.h.a(kVarP, false, 338847177);
            if (objA4 == obj) {
                objA4 = bg.b.h(null);
                kVarP.C(objA4);
            }
            final n1 n1Var5 = (n1) objA4;
            kVarP.T(false);
            final String strC = f3.q.c(R.string.keystore_error_required, kVarP);
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.f.g(ph.m0.e(androidx.compose.foundation.layout.g.f976c, ph.m0.c(kVarP), true), g1Var);
            float f10 = 16;
            z.q qVarA = z.o.a(z.b.h(f10), d.a.f14614m, kVarP, 6);
            int i12 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, qVarA, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVarP);
            String strC2 = f3.q.c(R.string.keystore_create, kVarP);
            t2.l0 l0Var = ((nf) kVarP.f(of.f26647a)).f26543f;
            x2.p pVar = x2.p.f32033f;
            s3 s3Var = f2.f25858a;
            ff.b(strC2, null, ((e2) kVarP.f(s3Var)).f25769o, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 196608, 0, 65498);
            d.a aVar3 = d.a.f1143b;
            t0.d1.a(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), h0.f.a(20), t0.z0.a(q1.b1.c(0.85f, ((e2) kVarP.f(s3Var)).f25770p), kVarP, 0), null, null, f1.c.b(2072141829, new u(z10, n1Var, n1Var5, n1Var2, n1Var3, n1Var4), kVarP), kVarP, 196614, 24);
            kVarP.L(1418907346);
            boolean zK = kVarP.K(strC) | kVarP.l(context) | ((i11 & 112) == 32);
            Object objG2 = kVarP.g();
            if (zK || objG2 == obj) {
                eh.a aVar4 = new eh.a() { // from class: y8.n
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        n1 n1Var6 = n1Var;
                        boolean zA = mh.x.A((String) n1Var6.getValue());
                        n1 n1Var7 = n1Var5;
                        if (!zA) {
                            n1 n1Var8 = n1Var2;
                            if (!mh.x.A((String) n1Var8.getValue())) {
                                Integer numG = mh.s.g((String) n1Var3.getValue());
                                if (numG != null) {
                                    jh.g gVar = new jh.g(1, 100, 1);
                                    int iIntValue = numG.intValue();
                                    if (1 <= iIntValue && iIntValue <= gVar.f15745b) {
                                        String str = (String) n1Var6.getValue();
                                        String str2 = (String) n1Var8.getValue();
                                        Boolean bool = (Boolean) n1Var4.getValue();
                                        bool.booleanValue();
                                        rVar.f(str, str2, numG, bool);
                                        return pg.f0.f21461a;
                                    }
                                }
                                n1Var7.setValue(context.getString(R.string.keystore_error_validity_range, 1, 100));
                                return pg.f0.f21461a;
                            }
                        }
                        n1Var7.setValue(strC);
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(aVar4);
                objG2 = aVar4;
            }
            kVarP.T(false);
            t0.x0.a((eh.a) objG2, androidx.compose.foundation.layout.g.d(aVar3, 1.0f), false, null, null, null, null, null, y8.a.E, kVarP, 805306416, 508);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
            z.g1 g1Var2 = t0.m0.f26400a;
            t0.x0.a(aVar, dVarD, false, null, t0.m0.a(((e2) kVarP.f(s3Var)).f25772r, 0L, 0L, kVarP, 14), null, null, null, y8.a.F, kVarP, 805306422, 492);
            kVarP = kVarP;
            p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar3), f10), kVarP);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, rVar, aVar, g1Var, i10) { // from class: y8.o

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f34199a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.r f34200b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f34201c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ z.g1 f34202d;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(385);
                    v.b(this.f34199a, this.f34200b, this.f34201c, this.f34202d, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final h9.x xVar, eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        int i11;
        x0.k kVar;
        final eh.a<pg.f0> aVar2 = aVar;
        x0.k kVarP = jVar.p(1307948072);
        if ((i10 & 6) == 0) {
            i11 = i10 | ((i10 & 8) == 0 ? kVarP.K(xVar) : kVarP.l(xVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar2) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(350555076);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(qg.z.f22752a);
                kVarP.C(objG);
            }
            n1 n1Var = (n1) objG;
            Object objA = p0.h.a(kVarP, false, 350558324);
            if (objA == c0321a) {
                objA = bg.b.h(Boolean.TRUE);
                kVarP.C(objA);
            }
            n1 n1Var2 = (n1) objA;
            kVarP.T(false);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(350560373);
            boolean z10 = (i12 & 14) == 4 || ((i12 & 8) != 0 && kVarP.l(xVar));
            Object objG2 = kVarP.g();
            if (z10 || objG2 == c0321a) {
                objG2 = new a(xVar, n1Var2, n1Var, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, f0Var, kVarP);
            kVar = kVarP;
            aVar2 = aVar;
            t0.r.a(aVar2, f1.c.b(-989489040, new b(aVar2), kVarP), null, null, null, y8.a.f34013m, f1.c.b(-1118200779, new c(n1Var2, n1Var, xVar, context, aVar), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i12 >> 3) & 14) | 1769520, 0, 16284);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: y8.h
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iN = f3.i.n(i10 | 1);
                    v.c(xVar, aVar2, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(final String str, String str2, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        final String str3;
        x0.k kVarP = jVar.p(-691474916);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.K(str2) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            str3 = str2;
        } else {
            d.a aVar2 = d.a.f1143b;
            float f10 = 10;
            androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), h0.f.a(f10));
            s3 s3Var = f2.f25858a;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(androidx.compose.foundation.a.b(dVarD, q1.b1.c(0.4f, ((e2) kVarP.f(s3Var)).f25772r), y1.f21750a), false, null, null, aVar, 7), 12, f10);
            m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, kVarP, 54);
            int i12 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, m1VarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, kVarP);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i13 = kVarP.P;
            a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            v1.j(bVar, qVarA, kVarP);
            v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            v1.j(cVar, dVarC2, kVarP);
            s3 s3Var2 = of.f26647a;
            ff.b(str, null, ((e2) kVarP.f(s3Var)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(s3Var2)).f26552o, kVarP, i11 & 14, 0, 65530);
            str3 = str2;
            ff.b(str3, null, ((e2) kVarP.f(s3Var)).f25771q, 0L, null, x2.f.f32016c, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(s3Var2)).f26549l, kVarP, (i11 >> 3) & 14, 0, 65466);
            kVarP = kVarP;
            kVarP.T(true);
            t4.b(q2.a(), f3.q.c(R.string.keystore_fingerprint_copy, kVarP), androidx.compose.foundation.layout.g.n(aVar2, 18), ((e2) kVarP.f(s3Var)).f25751a, kVarP, 384, 0);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, aVar, str, str3) { // from class: y8.k

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f34160a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f34161b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f34162c;

                {
                    this.f34160a = str;
                    this.f34161b = str3;
                    this.f34162c = aVar;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v.d(this.f34160a, this.f34161b, this.f34162c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void e(final eh.p<? super String, ? super String, pg.f0> pVar, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(-1765848619);
        if (((i10 | (kVarP.l(pVar) ? 4 : 2)) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.L(-1856503445);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h("");
                kVarP.C(objG);
            }
            n1 n1Var = (n1) objG;
            Object objA = p0.h.a(kVarP, false, -1856501781);
            if (objA == c0321a) {
                objA = bg.b.h("");
                kVarP.C(objA);
            }
            n1 n1Var2 = (n1) objA;
            kVarP.T(false);
            kVar = kVarP;
            t0.r.a(aVar, f1.c.b(2041791117, new d(pVar, n1Var, n1Var2), kVarP), null, f1.c.b(-1914888629, new e(aVar), kVarP), null, y8.a.f34009i, f1.c.b(-1407457304, new f(n1Var, n1Var2), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, 1772598, 0, 16276);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar, i10) { // from class: y8.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f34088b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    v.e(this.f34087a, this.f34088b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void f(final w1.d dVar, final long j10, final String str, final String str2, final boolean z10, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(1127663247);
        int i11 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | (kVarP.K(str) ? 256 : 128) | (kVarP.K(str2) ? 2048 : 1024) | 24576;
        if ((i10 & 196608) == 0) {
            i11 |= kVarP.c(z10) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.L(662512879);
            int i12 = i11 & 458752;
            boolean z11 = i12 == 131072;
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (z11 || objG == obj) {
                objG = bg.b.h(Boolean.valueOf(!z10));
                kVarP.C(objG);
            }
            final n1 n1Var = (n1) objG;
            kVarP.T(false);
            kVarP.L(662515553);
            boolean zK = kVarP.K(n1Var) | (i12 == 131072);
            Object objG2 = kVarP.g();
            if (zK || objG2 == obj) {
                objG2 = new eh.a() { // from class: y8.l
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        if (z10) {
                            n1Var.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG2);
            }
            eh.a aVar = (eh.a) objG2;
            kVarP.T(false);
            androidx.compose.ui.d dVarC = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(dVarC, 1.0f);
            if (z10) {
                dVarC = androidx.compose.foundation.b.c(dVarC, false, null, null, aVar, 7);
            }
            kVar = kVarP;
            t0.d1.a(dVarD.h(dVarC), h0.f.a(20), t0.z0.a(q1.b1.c(0.85f, ((e2) kVarP.f(f2.f25858a)).f25770p), kVarP, 0), null, null, f1.c.b(-1336094591, new d0(j10, z10, dVar, str, n1Var, str2), kVarP), kVar, 196608, 24);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: y8.m
                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    v.f(dVar, j10, str, str2, z10, (x0.j) obj2, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final KeystoreEntity keystoreEntity, final List list, final boolean z10, final eh.a aVar, final eh.a aVar2, final eh.a aVar3, final eh.a aVar4, final eh.a aVar5, x0.j jVar, final int i10) {
        n1 n1Var;
        x0.k kVar;
        j.a.C0321a c0321a;
        n1 n1Var2;
        x0.k kVarP = jVar.p(553941720);
        int i11 = i10 | (kVarP.K(keystoreEntity) ? 4 : 2) | (kVarP.l(list) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.l(aVar) ? 2048 : 1024) | (kVarP.l(aVar2) ? 16384 : 8192) | (kVarP.l(aVar3) ? 131072 : 65536) | (kVarP.l(aVar4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.l(aVar5) ? 8388608 : 4194304);
        if ((4793491 & i11) == 4793490 && kVarP.s()) {
            kVarP.v();
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(-716891252);
            Object objG = kVarP.g();
            j.a.C0321a c0321a2 = j.a.f31715a;
            if (objG == c0321a2) {
                objG = bg.b.h(null);
                kVarP.C(objG);
            }
            n1 n1Var3 = (n1) objG;
            Object objA = p0.h.a(kVarP, false, -716888588);
            if (objA == c0321a2) {
                objA = bg.b.h(Boolean.FALSE);
                kVarP.C(objA);
            }
            n1 n1Var4 = (n1) objA;
            kVarP.T(false);
            Object[] objArr = {Long.valueOf(keystoreEntity.getId())};
            kVarP.L(-716885621);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a2) {
                objG2 = new y8.i();
                kVarP.C(objG2);
            }
            kVarP.T(false);
            boolean z11 = false;
            n1 n1Var5 = (n1) b0.a0.d(objArr, null, (eh.a) objG2, kVarP, 3072, 6);
            kVarP.L(-716883638);
            if (((Boolean) n1Var4.getValue()).booleanValue()) {
                kVarP.L(-716882293);
                Object objG3 = kVarP.g();
                if (objG3 == c0321a2) {
                    n1Var = n1Var4;
                    objG3 = new w3(n1Var, 2);
                    kVarP.C(objG3);
                } else {
                    n1Var = n1Var4;
                }
                kVarP.T(false);
                c0321a = c0321a2;
                t0.r.a((eh.a) objG3, f1.c.b(-1911277525, new f0(aVar, n1Var), kVarP), null, f1.c.b(1515762409, new g0(n1Var), kVarP), y8.a.f34026z, f1.c.b(647835047, new h0(keystoreEntity), kVarP), f1.c.b(213871366, new i0(list), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVarP, 1797174, 0, 16260);
                kVar = kVarP;
                z11 = false;
            } else {
                n1Var = n1Var4;
                kVar = kVarP;
                c0321a = c0321a2;
            }
            kVar.T(z11);
            String path = keystoreEntity.getPath();
            String password = keystoreEntity.getPassword();
            String keyAlias = keystoreEntity.getKeyAlias();
            kVar.L(-716849529);
            boolean z12 = (i11 & 14) == 4;
            Object objG4 = kVar.g();
            if (z12 || objG4 == c0321a) {
                n1Var2 = n1Var3;
                objG4 = new j0(keystoreEntity, n1Var2, null);
                kVar.C(objG4);
            } else {
                n1Var2 = n1Var3;
            }
            kVar.T(false);
            x0.o0.f(path, password, keyAlias, (eh.p) objG4, kVar);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(20);
            t0.y0 y0VarA = t0.z0.a(q1.b1.c(0.85f, ((e2) kVar.f(f2.f25858a)).f25770p), kVar, 0);
            f1.b bVarB = f1.c.b(28720330, new n0(z10, aVar5, keystoreEntity, aVar4, list, n1Var, n1Var2, n1Var5, context, aVar2, aVar3), kVar);
            x0.k kVar2 = kVar;
            t0.d1.a(dVarD, eVarA, y0VarA, null, null, bVarB, kVar2, 196614, 24);
            kVarP = kVar2;
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(list, z10, aVar, aVar2, aVar3, aVar4, aVar5, i10) { // from class: y8.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f34146b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f34147c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f34148d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f34149e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f34150f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f34151g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.a f34152h;

                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v.g(this.f34145a, this.f34146b, this.f34147c, this.f34148d, this.f34149e, this.f34150f, this.f34151g, this.f34152h, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(p5.x xVar, h9.x xVar2, b2 b2Var, x0.j jVar, final int i10) {
        b2 b2Var2;
        h9.x xVar3;
        n1 n1Var;
        final h9.x xVar4;
        final b2 b2Var3;
        final n1 n1Var2;
        final p5.x navController = xVar;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(284924877);
        if ((((kVarP.l(navController) ? 4 : 2) | i10 | 144) & 147) == 146 && kVarP.s()) {
            kVarP.v();
            xVar4 = xVar2;
            b2Var3 = b2Var;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB = k5.c.b(h9.x.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                h9.x xVar5 = (h9.x) w0VarB;
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA2 = k5.b.a(kVarP);
                if (b1VarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA2 = f5.a.a(b1VarA2, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB2 = k5.c.b(b2.class, b1VarA2, bVarA2, b1VarA2 instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA2).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                b2Var2 = (b2) w0VarB2;
                xVar3 = xVar5;
            } else {
                kVarP.v();
                xVar3 = xVar2;
                b2Var2 = b2Var;
            }
            kVarP.U();
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(-2057255908);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            n1 n1Var3 = (n1) objG;
            Object objA = p0.h.a(kVarP, false, -2057253892);
            if (objA == obj) {
                objA = bg.b.h(Boolean.FALSE);
                kVarP.C(objA);
            }
            final n1 n1Var4 = (n1) objA;
            Object objA2 = p0.h.a(kVarP, false, -2057251812);
            if (objA2 == obj) {
                objA2 = bg.b.h(Boolean.FALSE);
                kVarP.C(objA2);
            }
            n1 n1Var5 = (n1) objA2;
            Object objA3 = p0.h.a(kVarP, false, -2057249764);
            if (objA3 == obj) {
                objA3 = bg.b.h(Boolean.FALSE);
                kVarP.C(objA3);
            }
            n1 n1Var6 = (n1) objA3;
            Object objA4 = p0.h.a(kVarP, false, -2057247700);
            if (objA4 == obj) {
                objA4 = bg.b.h(null);
                kVarP.C(objA4);
            }
            final n1 n1Var7 = (n1) objA4;
            Object objA5 = p0.h.a(kVarP, false, -2057245395);
            if (objA5 == obj) {
                objA5 = bg.b.h(null);
                kVarP.C(objA5);
            }
            final n1 n1Var8 = (n1) objA5;
            kVarP.T(false);
            n1 n1VarB = bg.b.b(xVar3.f12859d, kVarP);
            n1 n1VarB2 = bg.b.b(xVar3.f12860e, kVarP);
            n1 n1VarB3 = bg.b.b(b2Var2.f142f, kVarP);
            b2 b2Var4 = b2Var2;
            boolean z10 = ((Boolean) n1VarB3.getValue()).booleanValue() || ((List) n1VarB.getValue()).size() < 1;
            f.c cVar = new f.c();
            kVarP.L(-2057233212);
            Object objG2 = kVarP.g();
            if (objG2 == obj) {
                objG2 = new eh.l() { // from class: y8.p
                    @Override // eh.l
                    public final Object invoke(Object obj2) {
                        Uri uri = (Uri) obj2;
                        if (uri != null) {
                            n1Var8.setValue(uri);
                            n1Var4.setValue(Boolean.TRUE);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG2);
            }
            kVarP.T(false);
            c.k kVarA = c.d.a(cVar, (eh.l) objG2, kVarP, 48);
            f.g gVar = new f.g();
            kVarP.L(-2057226403);
            Object objG3 = kVarP.g();
            if (objG3 == obj) {
                n1Var = n1Var8;
                objG3 = new f4(2);
                kVarP.C(objG3);
            } else {
                n1Var = n1Var8;
            }
            kVarP.T(false);
            n1 n1Var9 = n1Var;
            xVar4 = xVar3;
            navController = xVar;
            b2Var3 = b2Var4;
            ra.a(null, f1.c.b(-1959410799, new p0(navController), kVarP), null, null, f1.c.b(1160962004, new s0(n1Var3, n1VarB3, kVarA, context, navController, z10), kVarP), 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(1460628124, new d1(xVar4, context, n1VarB3, n1Var3, n1VarB, n1Var5, xVar, c.d.a(gVar, (eh.l) objG3, kVarP, 48), n1VarB2, n1Var7), kVarP), kVarP, 806903856, 173);
            kVarP = kVarP;
            kVarP.L(-2056771449);
            if (((Boolean) n1Var4.getValue()).booleanValue() && ((Uri) n1Var9.getValue()) != null) {
                kVarP.L(-2056768511);
                boolean zL = kVarP.l(xVar4) | kVarP.l(context);
                Object objG4 = kVarP.g();
                if (zL || objG4 == obj) {
                    n1Var2 = n1Var9;
                    objG4 = new eh.p() { // from class: y8.q
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.p
                        public final Object invoke(Object obj2, Object obj3) {
                            final String alias = (String) obj2;
                            String password = (String) obj3;
                            kotlin.jvm.internal.r.e(alias, "alias");
                            kotlin.jvm.internal.r.e(password, "password");
                            n1 n1Var10 = n1Var2;
                            Uri uri = (Uri) n1Var10.getValue();
                            if (uri != null) {
                                final Context context2 = context;
                                xVar4.g(context2, uri, alias, password, password, new eh.l() { // from class: y8.e
                                    @Override // eh.l
                                    public final Object invoke(Object obj4) {
                                        String message;
                                        Object obj5 = ((pg.p) obj4).f21471a;
                                        Throwable thA = pg.p.a(obj5);
                                        Context context3 = context2;
                                        if (thA == null) {
                                            message = context3.getString(R.string.keystore_imported, alias);
                                            kotlin.jvm.internal.r.d(message, "getString(...)");
                                        } else {
                                            message = thA.getMessage();
                                            if (message == null) {
                                                message = context3.getString(R.string.keystore_operation_failed);
                                                kotlin.jvm.internal.r.d(message, "getString(...)");
                                            }
                                        }
                                        Toast.makeText(context3, message, 0).show();
                                        return pg.f0.f21461a;
                                    }
                                });
                            }
                            n1Var10.setValue(null);
                            n1Var4.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG4);
                } else {
                    n1Var2 = n1Var9;
                }
                eh.p pVar = (eh.p) objG4;
                Object objA6 = p0.h.a(kVarP, false, -2056747533);
                if (objA6 == obj) {
                    objA6 = new eh.a() { // from class: y8.r
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var2.setValue(null);
                            n1Var4.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objA6);
                }
                kVarP.T(false);
                e(pVar, (eh.a) objA6, kVarP, 48);
            }
            kVarP.T(false);
            kVarP.L(-2056743906);
            if (((Boolean) n1Var5.getValue()).booleanValue()) {
                kVarP.L(-2056740264);
                Object objG5 = kVarP.g();
                if (objG5 == obj) {
                    objG5 = new u8.u0(n1Var5, 1);
                    kVarP.C(objG5);
                }
                kVarP.T(false);
                c(xVar4, (eh.a) objG5, kVarP, 56);
            }
            kVarP.T(false);
            kVarP.L(-2056738500);
            if (((Boolean) n1Var6.getValue()).booleanValue()) {
                kVarP.L(-2056735881);
                Object objG6 = kVarP.g();
                if (objG6 == obj) {
                    objG6 = new u8.y0(n1Var6, 1);
                    kVarP.C(objG6);
                }
                kVarP.T(false);
                j(6, (eh.a) objG6, kVarP);
            }
            kVarP.T(false);
            KeystoreEntity keystoreEntity = (KeystoreEntity) n1Var7.getValue();
            if (keystoreEntity != null) {
                kVarP.L(-305028139);
                Object objG7 = kVarP.g();
                if (objG7 == obj) {
                    objG7 = new eh.a() { // from class: y8.s
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var7.setValue(null);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG7);
                }
                kVarP.T(false);
                i(keystoreEntity, (eh.a) objG7, kVarP, 48);
                pg.f0 f0Var = pg.f0.f21461a;
            }
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(xVar4, b2Var3, i10) { // from class: y8.t

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h9.x f34228b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b2 f34229c;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    v.h(this.f34227a, this.f34228b, this.f34229c, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void i(KeystoreEntity keystoreEntity, eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        final KeystoreEntity keystoreEntity2;
        final eh.a<pg.f0> aVar2;
        x0.k kVar;
        x0.k kVarP = jVar.p(-318784559);
        if ((((kVarP.K(keystoreEntity) ? 4 : 2) | i10) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            keystoreEntity2 = keystoreEntity;
            aVar2 = aVar;
            kVar = kVarP;
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                x0.l0 l0Var = x0.o0.f31834a;
                w2 w2Var = new w2(kVarP.x());
                kVarP.C(w2Var);
                objG = w2Var;
            }
            ph.i0 i0Var = (ph.i0) objG;
            kVarP.L(1994768202);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = bg.b.h(Boolean.TRUE);
                kVarP.C(objG2);
            }
            n1 n1Var = (n1) objG2;
            Object objA = p0.h.a(kVarP, false, 1994769864);
            if (objA == c0321a) {
                objA = bg.b.h("");
                kVarP.C(objA);
            }
            n1 n1Var2 = (n1) objA;
            Object objA2 = p0.h.a(kVarP, false, 1994771484);
            if (objA2 == c0321a) {
                objA2 = bg.b.h(null);
                kVarP.C(objA2);
            }
            final n1 n1Var3 = (n1) objA2;
            Object objA3 = p0.h.a(kVarP, false, 1994773736);
            if (objA3 == c0321a) {
                objA3 = bg.b.h("");
                kVarP.C(objA3);
            }
            final n1 n1Var4 = (n1) objA3;
            Object objA4 = p0.h.a(kVarP, false, 1994775531);
            if (objA4 == c0321a) {
                objA4 = bg.b.h(Boolean.FALSE);
                kVarP.C(objA4);
            }
            n1 n1Var5 = (n1) objA4;
            kVarP.T(false);
            f.c cVar = new f.c();
            kVarP.L(1994779746);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = new eh.l() { // from class: y8.f
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            n1Var3.setValue(uri);
                            String lastPathSegment = uri.getLastPathSegment();
                            n1Var4.setValue(lastPathSegment != null ? mh.x.T(lastPathSegment, '/', lastPathSegment) : "public_key.pem");
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG3);
            }
            kVarP.T(false);
            c.k kVarA = c.d.a(cVar, (eh.l) objG3, kVarP, 48);
            kVarP.L(1994785995);
            Object objG4 = kVarP.g();
            if (objG4 == c0321a) {
                objG4 = new r3(2, aVar, n1Var5);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            g gVar = new g(context, keystoreEntity, aVar, i0Var, n1Var5, n1Var, n1Var2, n1Var3);
            keystoreEntity2 = keystoreEntity;
            aVar2 = aVar;
            kVar = kVarP;
            t0.r.a((eh.a) objG4, f1.c.b(1753930265, gVar, kVarP), null, f1.c.b(-644057573, new h(aVar2, n1Var5), kVarP), null, y8.a.f34018r, f1.c.b(-2093555682, new i(kVarA, context, n1Var, n1Var2, n1Var4), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, 1772592, 0, 16276);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar2, i10) { // from class: y8.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f34135b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    v.i(this.f34134a, this.f34135b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void j(final int i10, final eh.a aVar, x0.j jVar) {
        x0.k kVar;
        x0.k kVarP = jVar.p(1408963139);
        if ((i10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            t0.r.a(aVar, f1.c.b(427304699, new j((Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b), aVar), kVarP), null, f1.c.b(837915065, new k(aVar), kVarP), null, y8.a.f34022v, y8.a.f34023w, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, 1772598, 0, 16276);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, aVar) { // from class: y8.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ eh.a f34074a;

                {
                    this.f34074a = aVar;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v.j(f3.i.n(7), this.f34074a, (x0.j) obj);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void k(Context context, String str) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("fingerprint", str));
        Toast.makeText(context, R.string.keystore_fingerprint_copied, 0).show();
    }
}
