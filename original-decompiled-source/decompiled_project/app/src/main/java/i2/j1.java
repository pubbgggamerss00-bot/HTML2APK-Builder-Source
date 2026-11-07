package i2;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p.f0<Object> f13931a = p.p0.a();

    public static final void a(d.c cVar, int i10, int i11) {
        if (!(cVar instanceof m)) {
            b(cVar, i10 & cVar.f1146c, i11);
            return;
        }
        m mVar = (m) cVar;
        int i12 = mVar.f13946q;
        b(cVar, i12 & i10, i11);
        int i13 = (~i12) & i10;
        for (d.c cVar2 = mVar.f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
            a(cVar2, i13, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d.c cVar, int i10, int i11) {
        if (i11 != 0 || cVar.I1()) {
            if ((i10 & 2) != 0 && (cVar instanceof b0)) {
                k.f((b0) cVar).O();
                if (i11 == 2) {
                    g1 g1VarD = k.d(cVar, 2);
                    g1VarD.f13879t = true;
                    g1VarD.K.invoke();
                    if (g1VarD.M != null) {
                        if (g1VarD.N != null) {
                            g1VarD.N = null;
                        }
                        g1VarD.T1(null, false);
                        g1VarD.f13874n.e0(false);
                    }
                }
            }
            if ((i10 & 128) != 0 && (cVar instanceof a0) && i11 != 2) {
                k.f(cVar).O();
            }
            if ((i10 & 256) != 0 && (cVar instanceof t) && i11 != 2) {
                e0 e0VarF = k.f(cVar);
                if (!e0VarF.C() && !e0VarF.D() && !e0VarF.S) {
                    i0.a(e0VarF).b(e0VarF);
                }
            }
            if ((i10 & 4) != 0 && (cVar instanceof r)) {
                s.a((r) cVar);
            }
            if ((i10 & 8) != 0 && (cVar instanceof k2)) {
                k.f(cVar).f13826t = true;
            }
            if ((i10 & 64) != 0 && (cVar instanceof g2)) {
                j0 j0Var = k.f((g2) cVar).K;
                j0Var.f13929p.f14059t = true;
                p0 p0Var = j0Var.f13930q;
                if (p0Var != null) {
                    p0Var.f13993z = true;
                }
            }
            if ((i10 & 2048) != 0 && (cVar instanceof o1.a0)) {
                o1.a0 a0Var = (o1.a0) cVar;
                f.f13849b = null;
                a0Var.Y0(f.f13848a);
                if (f.f13849b != null) {
                    if (!a0Var.B().f1157p) {
                        f2.a.b("visitChildren called on an unattached node");
                    }
                    z0.b bVar = new z0.b(new d.c[16]);
                    d.c cVar2 = a0Var.B().f1149f;
                    if (cVar2 == null) {
                        k.a(bVar, a0Var.B());
                    } else {
                        bVar.b(cVar2);
                    }
                    while (true) {
                        int i12 = bVar.f34702c;
                        if (i12 == 0) {
                            break;
                        }
                        d.c cVarB = (d.c) bVar.k(i12 - 1);
                        if ((cVarB.f1147d & 1024) == 0) {
                            k.a(bVar, cVarB);
                        } else {
                            while (true) {
                                if (cVarB == null) {
                                    break;
                                }
                                if ((cVarB.f1146c & 1024) != 0) {
                                    z0.b bVar2 = null;
                                    while (cVarB != null) {
                                        if (cVarB instanceof FocusTargetNode) {
                                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB;
                                            k.g(focusTargetNode).getFocusOwner().a(focusTargetNode);
                                        } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof m)) {
                                            int i13 = 0;
                                            for (d.c cVar3 = ((m) cVarB).f13947r; cVar3 != null; cVar3 = cVar3.f1149f) {
                                                if ((cVar3.f1146c & 1024) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        cVarB = cVar3;
                                                    } else {
                                                        if (bVar2 == null) {
                                                            bVar2 = new z0.b(new d.c[16]);
                                                        }
                                                        if (cVarB != null) {
                                                            bVar2.b(cVarB);
                                                            cVarB = null;
                                                        }
                                                        bVar2.b(cVar3);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                            }
                                        }
                                        cVarB = k.b(bVar2);
                                    }
                                } else {
                                    cVarB = cVarB.f1149f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i10 & 4096) == 0 || !(cVar instanceof o1.h)) {
                return;
            }
            o1.h hVar = (o1.h) cVar;
            k.g(hVar).getFocusOwner().d(hVar);
        }
    }

    public static final void c(d.c cVar) {
        if (!cVar.f1157p) {
            f2.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(cVar, -1, 0);
    }

    public static final int d(d.b bVar) {
        int i10 = bVar instanceof g2.b0 ? 3 : 1;
        if (bVar instanceof n1.j) {
            i10 |= 4;
        }
        if (bVar instanceof q2.p) {
            i10 |= 8;
        }
        if (bVar instanceof c2.h0) {
            i10 |= 16;
        }
        if ((bVar instanceof h2.d) || (bVar instanceof h2.g)) {
            i10 |= 32;
        }
        if (bVar instanceof o1.g) {
            i10 |= 4096;
        }
        if (bVar instanceof o1.o) {
            i10 |= 2048;
        }
        if (bVar instanceof g2.x0) {
            i10 |= 256;
        }
        if (bVar instanceof g2.d1) {
            i10 |= 64;
        }
        if ((bVar instanceof g2.z0) || (bVar instanceof g2.a1)) {
            i10 |= 128;
        }
        return bVar instanceof n2.a ? 524288 | i10 : i10;
    }

    public static final int e(d.c cVar) {
        int i10 = cVar.f1146c;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = cVar.getClass();
        p.f0<Object> f0Var = f13931a;
        int iD = f0Var.d(cls);
        if (iD >= 0) {
            return f0Var.f20617c[iD];
        }
        int i11 = cVar instanceof b0 ? 3 : 1;
        if (cVar instanceof r) {
            i11 |= 4;
        }
        if (cVar instanceof k2) {
            i11 |= 8;
        }
        if (cVar instanceof i2) {
            i11 |= 16;
        }
        if (cVar instanceof h2.f) {
            i11 |= 32;
        }
        if (cVar instanceof g2) {
            i11 |= 64;
        }
        if (cVar instanceof a0) {
            i11 |= 128;
        }
        if (cVar instanceof t) {
            i11 |= 256;
        }
        if (cVar instanceof g2.d) {
            i11 |= 512;
        }
        if (cVar instanceof FocusTargetNode) {
            i11 |= 1024;
        }
        if (cVar instanceof o1.a0) {
            i11 |= 2048;
        }
        if (cVar instanceof o1.h) {
            i11 |= 4096;
        }
        if (cVar instanceof a2.e) {
            i11 |= 8192;
        }
        if (cVar instanceof e2.a) {
            i11 |= 16384;
        }
        if (cVar instanceof h) {
            i11 |= 32768;
        }
        if (cVar instanceof a2.h) {
            i11 |= 131072;
        }
        if (cVar instanceof o2) {
            i11 |= PKIFailureInfo.transactionIdInUse;
        }
        if (cVar instanceof n2.a) {
            i11 |= PKIFailureInfo.signerNotTrusted;
        }
        if (cVar instanceof t1) {
            i11 |= PKIFailureInfo.badCertTemplate;
        }
        f0Var.h(i11, cls);
        return i11;
    }

    public static final int f(d.c cVar) {
        if (!(cVar instanceof m)) {
            return e(cVar);
        }
        m mVar = (m) cVar;
        int iF = mVar.f13946q;
        for (d.c cVar2 = mVar.f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
            iF |= f(cVar2);
        }
        return iF;
    }

    public static final boolean g(int i10) {
        return (i10 & 128) != 0;
    }
}
