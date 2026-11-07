package y8;

import android.content.Context;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import x0.a2;
import x0.j;

/* loaded from: classes.dex */
public final class m0 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f34179c;

    public m0(Context context, String str, String str2) {
        this.f34177a = str;
        this.f34178b = str2;
        this.f34179c = context;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
        int iD = jVar2.D();
        a2 a2VarY = jVar2.y();
        d.a aVar = d.a.f1143b;
        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
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
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 4), jVar2);
        jVar2.L(301304880);
        j.a.C0321a c0321a = j.a.f31715a;
        final String str = this.f34177a;
        final Context context = this.f34179c;
        if (str != null) {
            String strC = f3.q.c(R.string.keystore_fingerprint_sha1, jVar2);
            jVar2.L(1308781580);
            boolean zL = jVar2.l(context) | jVar2.K(str);
            Object objG = jVar2.g();
            if (zL || objG == c0321a) {
                objG = new eh.a() { // from class: y8.l0
                    @Override // eh.a
                    public final Object invoke() {
                        v.k(context, str);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            v.d(strC, str, (eh.a) objG, jVar2, 0);
        }
        jVar2.B();
        jVar2.L(301315122);
        String str2 = this.f34178b;
        if (str2 != null) {
            String strC2 = f3.q.c(R.string.keystore_fingerprint_sha256, jVar2);
            jVar2.L(1308791884);
            boolean zL2 = jVar2.l(context) | jVar2.K(str2);
            Object objG2 = jVar2.g();
            if (zL2 || objG2 == c0321a) {
                objG2 = new h9.u0(str2, 2, context);
                jVar2.C(objG2);
            }
            jVar2.B();
            v.d(strC2, str2, (eh.a) objG2, jVar2, 0);
        }
        jVar2.B();
        jVar2.H();
        return pg.f0.f21461a;
    }
}
