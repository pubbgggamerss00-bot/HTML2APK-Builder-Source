package r;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import java.util.ListIterator;
import x0.j;

/* loaded from: classes.dex */
public final class t0 {
    public static final void a(Boolean bool, androidx.compose.ui.d dVar, s.e0 e0Var, String str, x0.j jVar, int i10) {
        String str2;
        s.e0 e0Var2;
        androidx.compose.ui.d dVar2;
        f1.b bVar = b9.a.f3685a;
        x0.k kVarP = jVar.p(-310686752);
        int i11 = (kVarP.K(bool) ? 4 : 2) | i10 | 432;
        if (kVarP.A(i11 & 1, (i11 & 9363) != 9362)) {
            s.m2 m2VarD = s.m.d(0, 0, null, 7);
            s.y1 y1VarE = s.c2.e(bool, str, kVarP, (i11 & 14) | 48, 0);
            d.a aVar = d.a.f1143b;
            b(y1VarE, aVar, m2VarD, null, kVarP, 25008);
            str2 = str;
            dVar2 = aVar;
            e0Var2 = m2VarD;
        } else {
            kVarP.v();
            str2 = str;
            e0Var2 = e0Var;
            dVar2 = dVar;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new o0(bool, dVar2, e0Var2, str2, i10);
        }
    }

    public static final void b(s.y1 y1Var, androidx.compose.ui.d dVar, s.e0 e0Var, eh.l lVar, x0.j jVar, int i10) {
        eh.l lVar2;
        c2.g0 g0Var = y1Var.f24001a;
        f1.b bVar = b9.a.f3689e;
        x0.k kVarP = jVar.p(679005231);
        int i11 = (i10 & 6) == 0 ? (kVarP.K(y1Var) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(e0Var) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= kVarP.l(bVar) ? 16384 : 8192;
        }
        if (kVarP.A(i12 & 1, (i12 & 9363) != 9362)) {
            lVar2 = p0.f22900a;
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            Object obj = objG;
            if (objG == c0321a) {
                h1.u uVar = new h1.u();
                uVar.add(g0Var.V());
                kVarP.C(uVar);
                obj = uVar;
            }
            h1.u uVar2 = (h1.u) obj;
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = p.w0.b();
                kVarP.C(objG2);
            }
            p.l0 l0Var = (p.l0) objG2;
            x0.x1 x1Var = y1Var.f24004d;
            if (kotlin.jvm.internal.r.a(g0Var.V(), x1Var.getValue())) {
                kVarP.L(860925177);
                if (uVar2.size() == 1 && kotlin.jvm.internal.r.a(uVar2.get(0), x1Var.getValue())) {
                    kVarP.L(861249809);
                    kVarP.T(false);
                } else {
                    kVarP.L(861059531);
                    boolean z10 = (i12 & 14) == 4;
                    Object objG3 = kVarP.g();
                    if (z10 || objG3 == c0321a) {
                        objG3 = new q2.s(y1Var, 1);
                        kVarP.C(objG3);
                    }
                    qg.t.r((eh.l) objG3, uVar2);
                    l0Var.f();
                    kVarP.T(false);
                }
                kVarP.T(false);
            } else {
                kVarP.L(861255761);
                kVarP.T(false);
            }
            if (l0Var.a(x1Var.getValue())) {
                kVarP.L(862059281);
                kVarP.T(false);
            } else {
                kVarP.L(861316428);
                ListIterator listIterator = uVar2.listIterator();
                int i13 = 0;
                while (true) {
                    h1.c0 c0Var = (h1.c0) listIterator;
                    if (!c0Var.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    Object next = c0Var.next();
                    lVar2.getClass();
                    if (kotlin.jvm.internal.r.a(next, x1Var.getValue())) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 == -1) {
                    uVar2.add(x1Var.getValue());
                } else {
                    uVar2.set(i13, x1Var.getValue());
                }
                l0Var.f();
                int size = uVar2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Object obj2 = uVar2.get(i14);
                    l0Var.l(obj2, f1.c.b(-1426421288, new r0(y1Var, e0Var, obj2), kVarP));
                }
                kVarP.T(false);
            }
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i15 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
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
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            kVarP.L(-187474512);
            int size2 = uVar2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                Object obj3 = uVar2.get(i16);
                lVar2.getClass();
                kVarP.q(-1081865889, obj3);
                eh.p pVar = (eh.p) l0Var.d(obj3);
                if (pVar == null) {
                    kVarP.L(821932266);
                } else {
                    kVarP.L(-1081864713);
                    pVar.invoke(kVarP, 0);
                }
                kVarP.T(false);
                kVarP.T(false);
            }
            kVarP.T(false);
            kVarP.T(true);
        } else {
            kVarP.v();
            lVar2 = lVar;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new s0(y1Var, dVar, e0Var, lVar2, i10);
        }
    }
}
