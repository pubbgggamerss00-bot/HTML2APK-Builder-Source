package d0;

import g2.e1;
import h1.h;
import x0.j;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7058a = 0;

    public static final void a(Object obj, int i10, c1 c1Var, f1.b bVar, x0.j jVar, int i11) {
        int i12;
        x0.k kVarP = jVar.p(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (kVarP.l(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= kVarP.i(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= kVarP.l(c1Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= kVarP.l(bVar) ? 2048 : 1024;
        }
        if (kVarP.A(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zK = kVarP.K(obj) | kVarP.K(c1Var);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK || objG == c0321a) {
                objG = new x0(obj, c1Var);
                kVarP.C(objG);
            }
            x0 x0Var = (x0) objG;
            x0Var.f7298c = i10;
            x0.x1 x1Var = x0Var.f7302g;
            x0.m0 m0Var = g2.f1.f11378a;
            g2.e1 e1Var = (g2.e1) kVarP.f(m0Var);
            h1.h hVarA = h.a.a();
            eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
            h1.h hVarB = h.a.b(hVarA);
            try {
                if (e1Var != ((g2.e1) x1Var.getValue())) {
                    x1Var.setValue(e1Var);
                    if (x0Var.f7299d > 0) {
                        e1.a aVar = x0Var.f7300e;
                        if (aVar != null) {
                            aVar.a();
                        }
                        x0Var.f7300e = e1Var != null ? e1Var.b() : null;
                    }
                }
                pg.f0 f0Var = pg.f0.f21461a;
                h.a.d(hVarA, hVarB, lVarE);
                boolean zK2 = kVarP.K(x0Var);
                Object objG2 = kVarP.g();
                if (zK2 || objG2 == c0321a) {
                    objG2 = new z0(x0Var);
                    kVarP.C(objG2);
                }
                x0.o0.a(x0Var, (eh.l) objG2, kVarP);
                x0.y.a(m0Var.a(x0Var), bVar, kVarP, ((i12 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                h.a.d(hVarA, hVarB, lVarE);
                throw th2;
            }
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a1(obj, i10, c1Var, bVar, i11);
        }
    }

    public static final long b(e0.d1 d1Var) {
        return gh.a.c(d1Var.k() * d1Var.o()) + (d1Var.j() * d1Var.o());
    }
}
