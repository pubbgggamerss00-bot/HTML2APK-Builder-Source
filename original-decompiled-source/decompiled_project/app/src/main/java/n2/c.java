package n2;

import androidx.compose.ui.d;
import i2.d1;
import i2.e0;
import i2.g1;
import i2.j;
import i2.k;
import i2.m;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;

/* loaded from: classes.dex */
public final class c {
    public static final Object a(j jVar, eh.a aVar, vg.c cVar) {
        Object obj;
        g1 g1VarE;
        Object objL1;
        d1 d1Var;
        if (!jVar.B().f1157p) {
            return f0.f21461a;
        }
        if (!jVar.B().f1157p) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        d.c cVar2 = jVar.B().f1148e;
        e0 e0VarF = k.f(jVar);
        loop0: while (true) {
            obj = null;
            if (e0VarF == null) {
                break;
            }
            if ((e0VarF.I.f13793e.f1147d & PKIFailureInfo.signerNotTrusted) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.f1146c & PKIFailureInfo.signerNotTrusted) != 0) {
                        d.c cVarB = cVar2;
                        z0.b bVar = null;
                        while (cVarB != null) {
                            if (cVarB instanceof a) {
                                obj = cVarB;
                                break loop0;
                            }
                            if ((cVarB.f1146c & PKIFailureInfo.signerNotTrusted) != 0 && (cVarB instanceof m)) {
                                int i10 = 0;
                                for (d.c cVar3 = ((m) cVarB).f13947r; cVar3 != null; cVar3 = cVar3.f1149f) {
                                    if ((cVar3.f1146c & PKIFailureInfo.signerNotTrusted) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarB = cVar3;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new z0.b(new d.c[16]);
                                            }
                                            if (cVarB != null) {
                                                bVar.b(cVarB);
                                                cVarB = null;
                                            }
                                            bVar.b(cVar3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarB = k.b(bVar);
                        }
                    }
                    cVar2 = cVar2.f1148e;
                }
            }
            e0VarF = e0VarF.G();
            cVar2 = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
        }
        a aVar2 = (a) obj;
        return (aVar2 != null && (objL1 = aVar2.l1((g1VarE = k.e(jVar)), new b(0, aVar, g1VarE), cVar)) == ug.a.f29706a) ? objL1 : f0.f21461a;
    }
}
