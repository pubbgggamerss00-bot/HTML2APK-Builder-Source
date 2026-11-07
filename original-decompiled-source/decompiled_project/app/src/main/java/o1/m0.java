package o1;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import i2.g1;

/* loaded from: classes.dex */
public final class m0 {
    public static final FocusTargetNode a(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeR = i2.k.g(focusTargetNode).getFocusOwner().r();
        if (focusTargetNodeR == null || !focusTargetNodeR.f1157p) {
            return null;
        }
        return focusTargetNodeR;
    }

    public static final p1.e b(FocusTargetNode focusTargetNode) {
        g1 g1Var = focusTargetNode.f1151h;
        return g1Var != null ? g2.w.c(g1Var).N(g1Var, false) : p1.e.f21130e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2;
        int iOrdinal;
        boolean z10 = focusTargetNode.f1144a.f1157p;
        if (z10) {
            if (!z10) {
                f2.a.b("visitChildren called on an unattached node");
            }
            z0.b bVar = new z0.b(new d.c[16]);
            d.c cVar = focusTargetNode.f1144a;
            d.c cVar2 = cVar.f1149f;
            if (cVar2 == null) {
                i2.k.a(bVar, cVar);
            } else {
                bVar.b(cVar2);
            }
            loop0: while (true) {
                int i10 = bVar.f34702c;
                if (i10 == 0) {
                    break;
                }
                d.c cVarB = (d.c) bVar.k(i10 - 1);
                if ((cVarB.f1147d & 1024) == 0) {
                    i2.k.a(bVar, cVarB);
                } else {
                    while (true) {
                        if (cVarB == null) {
                            break;
                        }
                        if ((cVarB.f1146c & 1024) != 0) {
                            z0.b bVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof FocusTargetNode) {
                                    focusTargetNode2 = (FocusTargetNode) cVarB;
                                    if (focusTargetNode2.f1144a.f1157p && ((iOrdinal = focusTargetNode2.Y().ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2)) {
                                        break loop0;
                                    }
                                } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof i2.m)) {
                                    int i11 = 0;
                                    for (d.c cVar3 = ((i2.m) cVarB).f13947r; cVar3 != null; cVar3 = cVar3.f1149f) {
                                        if ((cVar3.f1146c & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                cVarB = i2.k.b(bVar2);
                            }
                        } else {
                            cVarB = cVarB.f1149f;
                        }
                    }
                }
            }
            return focusTargetNode2;
        }
        return null;
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        i2.e0 e0Var;
        g1 g1Var;
        i2.e0 e0Var2;
        g1 g1Var2 = focusTargetNode.f1151h;
        return (g1Var2 == null || (e0Var = g1Var2.f13874n) == null || !e0Var.x() || (g1Var = focusTargetNode.f1151h) == null || (e0Var2 = g1Var.f13874n) == null || !e0Var2.m()) ? false : true;
    }
}
