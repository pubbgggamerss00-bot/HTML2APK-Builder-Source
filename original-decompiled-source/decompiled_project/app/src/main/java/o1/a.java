package o1;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import g2.g;
import i2.d1;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[PHI: r0
      0x00a8: PHI (r0v11 int) = (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int), (r0v10 int) binds: [B:54:0x00a6, B:57:0x00ab, B:60:0x00af, B:63:0x00b3, B:66:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T a(FocusTargetNode focusTargetNode, int i10, eh.l<? super g.a, ? extends T> lVar) {
        int i11;
        d.c cVarB;
        d1 d1Var;
        if (!focusTargetNode.f1144a.f1157p) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        d.c cVar = focusTargetNode.f1144a.f1148e;
        i2.e0 e0VarF = i2.k.f(focusTargetNode);
        loop0: while (true) {
            i11 = 1;
            if (e0VarF == null) {
                cVarB = null;
                break;
            }
            if ((e0VarF.I.f13793e.f1147d & 1024) != 0) {
                while (cVar != null) {
                    if ((cVar.f1146c & 1024) != 0) {
                        cVarB = cVar;
                        z0.b bVar = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof i2.m)) {
                                int i12 = 0;
                                for (d.c cVar2 = ((i2.m) cVarB).f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
                                    if ((cVar2.f1146c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVarB = cVar2;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new z0.b(new d.c[16]);
                                            }
                                            if (cVarB != null) {
                                                bVar.b(cVarB);
                                                cVarB = null;
                                            }
                                            bVar.b(cVar2);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVarB = i2.k.b(bVar);
                        }
                    }
                    cVar = cVar.f1148e;
                }
            }
            e0VarF = e0VarF.G();
            cVar = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
        if (focusTargetNode2 != null) {
            h2.i<g2.g> iVar = g2.h.f11388a;
            if (!kotlin.jvm.internal.r.a((g2.g) focusTargetNode2.y(iVar), (g2.g) focusTargetNode.y(iVar))) {
                g2.g gVar = (g2.g) focusTargetNode.y(g2.h.f11388a);
                if (gVar != null) {
                    int i13 = 5;
                    if (i10 == 5) {
                        i11 = i13;
                    } else {
                        i13 = 6;
                        if (i10 != 6) {
                            i13 = 3;
                            if (i10 != 3) {
                                i13 = 4;
                                if (i10 != 4) {
                                    i13 = 2;
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return (T) gVar.m1(i11, lVar);
                }
            }
        }
        return null;
    }
}
