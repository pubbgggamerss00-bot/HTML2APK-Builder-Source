package q8;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class i {
    public static final void a(final androidx.compose.ui.d dVar, final j jVar, final f1.b bVar, x0.j jVar2, final int i10) {
        x0.k kVarP = jVar2.p(-794672836);
        if (((i10 | 6) & 131) == 130 && kVarP.s()) {
            kVarP.v();
        } else {
            jVar = j.f22245a;
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            bVar.b(androidx.compose.foundation.layout.b.f961a, kVarP, 54);
            kVarP.T(true);
            dVar = d.a.f1143b;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(jVar, bVar, i10) { // from class: q8.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f22221b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f1.b f22222c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(385);
                    i.a(this.f22220a, this.f22221b, this.f22222c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
