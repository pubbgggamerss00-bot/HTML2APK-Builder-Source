package y8;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import i2.e0;
import i2.g;
import j1.d;
import pg.p;
import ph.v1;
import t0.ff;
import t0.nf;
import t0.of;
import t0.w9;
import x0.a2;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class z implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeystoreStorage.PersistedKeystore f34305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.x f34306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f34307c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f34308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1<String> f34309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<String> f34310f;

    public z(Context context, KeystoreStorage.PersistedKeystore persistedKeystore, eh.a aVar, h9.x xVar, n1 n1Var, n1 n1Var2) {
        this.f34305a = persistedKeystore;
        this.f34306b = xVar;
        this.f34307c = context;
        this.f34308d = aVar;
        this.f34309e = n1Var;
        this.f34310f = n1Var2;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r Card = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 12);
            z.q qVarA = z.o.a(z.b.h(8), d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
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
            v1.j(g.a.f13867f, qVarA, jVar2);
            v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, jVar2);
            final KeystoreStorage.PersistedKeystore persistedKeystore = this.f34305a;
            ff.b(persistedKeystore.getDisplayName(), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26548k, jVar2, 196608, 0, 65502);
            final n1<String> n1Var = this.f34309e;
            String value = n1Var.getValue();
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(155572507);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new eh.l() { // from class: y8.w
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        String it = (String) obj;
                        kotlin.jvm.internal.r.e(it, "it");
                        n1Var.setValue(it);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            w9.a(value, (eh.l) objG, dVarD, false, false, null, a.f34014n, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, jVar2, 1573296, 12582912, 8257464);
            final n1<String> n1Var2 = this.f34310f;
            String value2 = n1Var2.getValue();
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(155587998);
            Object objG2 = jVar2.g();
            if (objG2 == c0321a) {
                objG2 = new androidx.room.y(n1Var2, 1);
                jVar2.C(objG2);
            }
            jVar2.B();
            w9.a(value2, (eh.l) objG2, dVarD2, false, false, null, a.f34015o, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, jVar2, 1573296, 12582912, 8257464);
            boolean z10 = (mh.x.A(n1Var.getValue()) || mh.x.A(n1Var2.getValue())) ? false : true;
            androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(155601953);
            final h9.x xVar = this.f34306b;
            boolean zL = jVar2.l(xVar);
            final Context context = this.f34307c;
            boolean zL2 = zL | jVar2.l(context) | jVar2.l(persistedKeystore);
            final eh.a<pg.f0> aVar3 = this.f34308d;
            boolean zK = zL2 | jVar2.K(aVar3);
            Object objG3 = jVar2.g();
            if (zK || objG3 == c0321a) {
                objG3 = new eh.a() { // from class: y8.x
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        final n1 n1Var3 = n1Var;
                        String alias = (String) n1Var3.getValue();
                        String password = (String) n1Var2.getValue();
                        final Context context2 = context;
                        final eh.a aVar4 = aVar3;
                        eh.l<? super pg.p<pg.f0>, pg.f0> lVar = new eh.l() { // from class: y8.y
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // eh.l
                            public final Object invoke(Object obj) {
                                String message;
                                pg.p pVar = (pg.p) obj;
                                Object obj2 = pVar.f21471a;
                                Throwable thA = pg.p.a(obj2);
                                Context context3 = context2;
                                if (thA == null) {
                                    message = context3.getString(R.string.keystore_imported, (String) n1Var3.getValue());
                                    kotlin.jvm.internal.r.d(message, "getString(...)");
                                } else {
                                    message = thA.getMessage();
                                    if (message == null) {
                                        message = context3.getString(R.string.keystore_operation_failed);
                                        kotlin.jvm.internal.r.d(message, "getString(...)");
                                    }
                                }
                                Toast.makeText(context3, message, 0).show();
                                if (!(pVar.f21471a instanceof p.a)) {
                                    aVar4.invoke();
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        kotlin.jvm.internal.r.e(context2, "context");
                        KeystoreStorage.PersistedKeystore persisted = persistedKeystore;
                        kotlin.jvm.internal.r.e(persisted, "persisted");
                        kotlin.jvm.internal.r.e(alias, "alias");
                        kotlin.jvm.internal.r.e(password, "password");
                        xVar.g(context2, persisted.getUri(), alias, password, password, lVar);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG3);
            }
            jVar2.B();
            t0.x0.a((eh.a) objG3, dVarD3, z10, null, null, null, null, null, a.f34016p, jVar2, 805306416, 504);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
