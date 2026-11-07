package t0;

import i2.e0;
import i2.g;
import j1.d;
import java.util.ArrayList;
import x0.j;

/* loaded from: classes.dex */
public final class tc {
    public static final void a(ic icVar, androidx.compose.ui.d dVar, x0.j jVar, int i10) {
        f1.b bVar = m2.f26421a;
        x0.k kVarP = jVar.p(-1316639904);
        int i11 = (i10 & 6) == 0 ? (kVarP.K(icVar) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(bVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new u3();
                kVarP.C(objG);
            }
            u3 u3Var = (u3) objG;
            kVarP.L(-1256811491);
            Object obj = u3Var.f27117a;
            ArrayList arrayList = u3Var.f27118b;
            if (!kotlin.jvm.internal.r.a(icVar, obj)) {
                u3Var.f27117a = icVar;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList2.add((ic) ((t3) arrayList.get(i12)).f27042a);
                }
                ArrayList arrayListE0 = qg.x.e0(arrayList2);
                if (!arrayListE0.contains(icVar)) {
                    arrayListE0.add(icVar);
                }
                arrayList.clear();
                ArrayList arrayList3 = new ArrayList(arrayListE0.size());
                int size2 = arrayListE0.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    Object obj2 = arrayListE0.get(i13);
                    if (obj2 != null) {
                        arrayList3.add(obj2);
                    }
                }
                int size3 = arrayList3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    ic icVar2 = (ic) arrayList3.get(i14);
                    arrayList.add(new t3(icVar2, f1.c.b(-1654683077, new mc(icVar2, icVar, arrayListE0, u3Var), kVarP)));
                }
            }
            kVarP.T(false);
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
            x0.h2 h2VarB = kVarP.b();
            if (h2VarB == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            kVarP.I(h2VarB);
            u3Var.f27119c = h2VarB;
            kVarP.L(1748085441);
            int size4 = arrayList.size();
            for (int i16 = 0; i16 < size4; i16++) {
                t3 t3Var = (t3) arrayList.get(i16);
                ic icVar3 = (ic) t3Var.f27042a;
                f1.b bVar2 = t3Var.f27043b;
                kVarP.q(1201076541, icVar3);
                bVar2.b(f1.c.b(-1135367807, new nc(icVar3), kVarP), kVarP, 6);
                kVarP.T(false);
            }
            kVarP.T(false);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new oc(icVar, dVar, i10);
        }
    }

    public static final void b(uc ucVar, androidx.compose.ui.d dVar, eh.q qVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(464178177);
        int i11 = (kVarP.K(dVar) ? 32 : 16) | i10 | 384;
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            qVar = m2.f26421a;
            ic icVar = (ic) ucVar.f27165b.getValue();
            j2.h hVar = (j2.h) kVarP.f(j2.j2.f14772a);
            boolean zK = kVarP.K(icVar) | kVarP.l(hVar);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                objG = new pc(icVar, hVar, null);
                kVarP.C(objG);
            }
            x0.o0.d((eh.p) objG, icVar, kVarP);
            a((ic) ucVar.f27165b.getValue(), dVar, kVarP, i11 & 1008);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new qc(ucVar, dVar, qVar, i10);
        }
    }
}
