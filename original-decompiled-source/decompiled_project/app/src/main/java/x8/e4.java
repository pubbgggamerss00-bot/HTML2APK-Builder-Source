package x8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import t0.ff;
import t0.nf;
import t0.of;
import x0.j;
import x8.j6;
import z.b;

/* loaded from: classes.dex */
public final class e4 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6.b f32551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f32552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f32553c;

    public e4(Context context, j6.b bVar, j6 j6Var) {
        this.f32551a = bVar;
        this.f32552b = j6Var;
        this.f32553c = context;
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
            float f10 = 20;
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            final j6.b bVar2 = this.f32551a;
            String strC = f3.q.c(bVar2.f32806d, jVar2);
            x0.e2 e2Var = of.f26647a;
            t2.l0 l0Var = ((nf) jVar2.f(e2Var)).f26544g;
            x2.p pVar = x2.p.f32033f;
            x0.e2 e2Var2 = t0.f2.f25858a;
            ff.b(strC, null, ((t0.e2) jVar2.f(e2Var2)).f25769o, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 12), jVar2);
            ff.b(bVar2.f32805c, null, ((t0.e2) jVar2.f(e2Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(e2Var)).f26548k, jVar2, 0, 0, 65530);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            z.m1 m1VarA = z.k1.a(new b.i(8, true, new z.d(2)), d.a.f14611j, jVar2, 6);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, m1VarA, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            boolean z10 = bVar2.f32807e;
            Object obj = j.a.f31715a;
            final j6 j6Var = this.f32552b;
            if (z10) {
                jVar2.L(-36587897);
                jVar2.L(1938483695);
                boolean zL = jVar2.l(j6Var);
                Object objG = jVar2.g();
                if (zL || objG == obj) {
                    objG = new f9.z5(j6Var, 2);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, c.f32362t, jVar2, 805306368, 510);
                jVar2.B();
            } else {
                jVar2.L(-36144163);
                jVar2.L(1938495823);
                boolean zL2 = jVar2.l(j6Var);
                Object objG2 = jVar2.g();
                if (zL2 || objG2 == obj) {
                    objG2 = new u8.s(j6Var, 1);
                    jVar2.C(objG2);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG2, null, false, null, null, null, c.f32363u, jVar2, 805306368, 510);
                jVar2.L(1938509154);
                boolean zL3 = jVar2.l(j6Var) | jVar2.l(bVar2);
                final Context context = this.f32553c;
                boolean zL4 = zL3 | jVar2.l(context);
                Object objG3 = jVar2.g();
                if (zL4 || objG3 == obj) {
                    objG3 = new eh.a() { // from class: x8.b4
                        @Override // eh.a
                        public final Object invoke() {
                            Context context2 = context;
                            j6Var.f32796w.setValue(null);
                            Uri uri = bVar2.f32804b;
                            if (uri != null) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setDataAndType(uri, "resource/folder");
                                intent.addFlags(1);
                                try {
                                    context2.startActivity(intent);
                                } catch (Exception unused) {
                                }
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG3);
                }
                eh.a aVar3 = (eh.a) objG3;
                jVar2.B();
                t0.x0.d(aVar3, null, bVar2.f32804b != null, null, null, null, f1.c.b(289212286, new d4(bVar2), jVar2), jVar2, 805306368, 506);
                jVar2.L(1938551917);
                boolean zL5 = jVar2.l(j6Var) | jVar2.l(context) | jVar2.l(bVar2);
                Object objG4 = jVar2.g();
                if (zL5 || objG4 == obj) {
                    objG4 = new eh.a() { // from class: x8.c4
                        @Override // eh.a
                        public final Object invoke() {
                            j6Var.f32796w.setValue(null);
                            j6.b bVar3 = bVar2;
                            Intent intent = bVar3.f32803a;
                            int i10 = bVar3.f32806d;
                            Context context2 = context;
                            context2.startActivity(Intent.createChooser(intent, context2.getString(i10)));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG4);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG4, null, false, null, null, null, c.f32364v, jVar2, 805306368, 510);
                jVar2.B();
            }
            jVar2.H();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
