package f3;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import i2.d1;
import i2.e0;
import java.util.Arrays;
import o1.i0;
import o1.m0;
import o1.n0;
import o1.o0;
import o1.u;

/* loaded from: classes.dex */
public final class f {
    public static e a() {
        return new e(1.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(FocusTargetNode focusTargetNode, u.a aVar) {
        int iOrdinal = focusTargetNode.Y().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = m0.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetNodeC.Y().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                throw new pg.l();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (b(focusTargetNodeC, aVar) || d(focusTargetNode, focusTargetNodeC, 2, aVar) || (focusTargetNodeC.U1().f18909a && ((Boolean) aVar.invoke(focusTargetNodeC)).booleanValue())) {
                        return true;
                    }
                }
                return d(focusTargetNode, focusTargetNodeC, 2, aVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new pg.l();
                }
                if (!f(focusTargetNode, aVar)) {
                    if (!(focusTargetNode.U1().f18909a ? ((Boolean) aVar.invoke(focusTargetNode)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return f(focusTargetNode, aVar);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, u.a aVar) {
        int iOrdinal = focusTargetNode.Y().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = m0.c(focusTargetNode);
                if (focusTargetNodeC != null) {
                    return c(focusTargetNodeC, aVar) || d(focusTargetNode, focusTargetNodeC, 1, aVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.U1().f18909a ? ((Boolean) aVar.invoke(focusTargetNode)).booleanValue() : g(focusTargetNode, aVar);
                }
                throw new pg.l();
            }
        }
        return g(focusTargetNode, aVar);
    }

    public static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, u.a aVar) {
        if (h(focusTargetNode, focusTargetNode2, i10, aVar)) {
            return true;
        }
        f1.m mVarJ = i2.k.g(focusTargetNode).getFocusOwner().j();
        mVarJ.getClass();
        Boolean bool = (Boolean) o1.a.a(focusTargetNode, i10, new o0(mVarJ, i2.k.g(focusTargetNode).getFocusOwner().r(), focusTargetNode, focusTargetNode2, i10, aVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final kotlin.jvm.internal.b e(Object[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return new kotlin.jvm.internal.b(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean f(FocusTargetNode focusTargetNode, u.a aVar) {
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        if (!focusTargetNode.f1144a.f1157p) {
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
        int i10 = 0;
        while (true) {
            int i11 = bVar.f34702c;
            if (i11 == 0) {
                break;
            }
            d.c cVarB = (d.c) bVar.k(i11 - 1);
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                int i12 = i10 + 1;
                                if (focusTargetNodeArr.length < i12) {
                                    int length = focusTargetNodeArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(focusTargetNodeArr, 0, r10, 0, length);
                                    focusTargetNodeArr = r10;
                                }
                                focusTargetNodeArr[i10] = focusTargetNode2;
                                i10 = i12;
                            } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof i2.m)) {
                                int i13 = 0;
                                for (d.c cVar3 = ((i2.m) cVarB).f13947r; cVar3 != null; cVar3 = cVar3.f1149f) {
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
                            cVarB = i2.k.b(bVar2);
                        }
                    } else {
                        cVarB = cVarB.f1149f;
                    }
                }
            }
        }
        Arrays.sort(focusTargetNodeArr, 0, i10, n0.f18877a);
        int i14 = i10 - 1;
        if (i14 < focusTargetNodeArr.length) {
            while (i14 >= 0) {
                FocusTargetNode focusTargetNode3 = focusTargetNodeArr[i14];
                if (m0.d(focusTargetNode3) && b(focusTargetNode3, aVar)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean g(FocusTargetNode focusTargetNode, u.a aVar) {
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        if (!focusTargetNode.f1144a.f1157p) {
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
        int i10 = 0;
        while (true) {
            int i11 = bVar.f34702c;
            if (i11 == 0) {
                break;
            }
            d.c cVarB = (d.c) bVar.k(i11 - 1);
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                int i12 = i10 + 1;
                                if (focusTargetNodeArr.length < i12) {
                                    int length = focusTargetNodeArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(focusTargetNodeArr, 0, r10, 0, length);
                                    focusTargetNodeArr = r10;
                                }
                                focusTargetNodeArr[i10] = focusTargetNode2;
                                i10 = i12;
                            } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof i2.m)) {
                                int i13 = 0;
                                for (d.c cVar3 = ((i2.m) cVarB).f13947r; cVar3 != null; cVar3 = cVar3.f1149f) {
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
                            cVarB = i2.k.b(bVar2);
                        }
                    } else {
                        cVarB = cVarB.f1149f;
                    }
                }
            }
        }
        Arrays.sort(focusTargetNodeArr, 0, i10, n0.f18877a);
        for (int i14 = 0; i14 < i10; i14++) {
            FocusTargetNode focusTargetNode3 = focusTargetNodeArr[i14];
            if (m0.d(focusTargetNode3) && c(focusTargetNode3, aVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean h(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, u.a aVar) {
        d.c cVar;
        e0 e0VarF;
        d1 d1Var;
        if (focusTargetNode.Y() != i0.f18865b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        if (!focusTargetNode.f1144a.f1157p) {
            f2.a.b("visitChildren called on an unattached node");
        }
        z0.b bVar = new z0.b(new d.c[16]);
        d.c cVar2 = focusTargetNode.f1144a;
        d.c cVar3 = cVar2.f1149f;
        if (cVar3 == null) {
            i2.k.a(bVar, cVar2);
        } else {
            bVar.b(cVar3);
        }
        int i11 = 0;
        while (true) {
            int i12 = bVar.f34702c;
            cVar = null;
            if (i12 == 0) {
                break;
            }
            d.c cVarB = (d.c) bVar.k(i12 - 1);
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
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVarB;
                                int i13 = i11 + 1;
                                if (focusTargetNodeArr.length < i13) {
                                    int length = focusTargetNodeArr.length;
                                    ?? r11 = new Object[Math.max(i13, length * 2)];
                                    System.arraycopy(focusTargetNodeArr, 0, r11, 0, length);
                                    focusTargetNodeArr = r11;
                                }
                                focusTargetNodeArr[i11] = focusTargetNode3;
                                i11 = i13;
                            } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof i2.m)) {
                                int i14 = 0;
                                for (d.c cVar4 = ((i2.m) cVarB).f13947r; cVar4 != null; cVar4 = cVar4.f1149f) {
                                    if ((cVar4.f1146c & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            cVarB = cVar4;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new z0.b(new d.c[16]);
                                            }
                                            if (cVarB != null) {
                                                bVar2.b(cVarB);
                                                cVarB = null;
                                            }
                                            bVar2.b(cVar4);
                                        }
                                    }
                                }
                                if (i14 == 1) {
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
        Arrays.sort(focusTargetNodeArr, 0, i11, n0.f18877a);
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            jh.g gVarQ = jh.j.q(0, i11);
            int i15 = gVarQ.f15744a;
            int i16 = gVarQ.f15745b;
            if (i15 <= i16) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusTargetNode focusTargetNode4 = focusTargetNodeArr[i16];
                        if (m0.d(focusTargetNode4) && b(focusTargetNode4, aVar)) {
                            break;
                        }
                    }
                    if (kotlin.jvm.internal.r.a(focusTargetNodeArr[i16], focusTargetNode2)) {
                        z10 = true;
                    }
                    if (i16 == i15) {
                        break;
                    }
                    i16--;
                }
            }
            if (i10 != 1) {
                if (!focusTargetNode.f1144a.f1157p) {
                }
                d.c cVar5 = focusTargetNode.f1144a.f1148e;
                e0VarF = i2.k.f(focusTargetNode);
                loop5: while (true) {
                    if (e0VarF == null) {
                    }
                }
                if (cVar != null) {
                }
            }
            return false;
        }
        jh.g gVarQ2 = jh.j.q(0, i11);
        int i17 = gVarQ2.f15744a;
        int i18 = gVarQ2.f15745b;
        if (i17 <= i18) {
            boolean z11 = false;
            while (true) {
                if (z11) {
                    FocusTargetNode focusTargetNode5 = focusTargetNodeArr[i17];
                    if (m0.d(focusTargetNode5) && c(focusTargetNode5, aVar)) {
                        break;
                    }
                }
                if (kotlin.jvm.internal.r.a(focusTargetNodeArr[i17], focusTargetNode2)) {
                    z11 = true;
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        if (i10 != 1 && focusTargetNode.U1().f18909a) {
            if (!focusTargetNode.f1144a.f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            d.c cVar52 = focusTargetNode.f1144a.f1148e;
            e0VarF = i2.k.f(focusTargetNode);
            loop5: while (true) {
                if (e0VarF == null) {
                    break;
                }
                if ((e0VarF.I.f13793e.f1147d & 1024) != 0) {
                    while (cVar52 != null) {
                        if ((cVar52.f1146c & 1024) != 0) {
                            d.c cVarB2 = cVar52;
                            z0.b bVar3 = null;
                            while (cVarB2 != null) {
                                if (cVarB2 instanceof FocusTargetNode) {
                                    cVar = cVarB2;
                                    break loop5;
                                }
                                if ((cVarB2.f1146c & 1024) != 0 && (cVarB2 instanceof i2.m)) {
                                    int i19 = 0;
                                    for (d.c cVar6 = ((i2.m) cVarB2).f13947r; cVar6 != null; cVar6 = cVar6.f1149f) {
                                        if ((cVar6.f1146c & 1024) != 0) {
                                            i19++;
                                            if (i19 == 1) {
                                                cVarB2 = cVar6;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new z0.b(new d.c[16]);
                                                }
                                                if (cVarB2 != null) {
                                                    bVar3.b(cVarB2);
                                                    cVarB2 = null;
                                                }
                                                bVar3.b(cVar6);
                                            }
                                        }
                                    }
                                    if (i19 == 1) {
                                    }
                                }
                                cVarB2 = i2.k.b(bVar3);
                            }
                        }
                        cVar52 = cVar52.f1148e;
                    }
                }
                e0VarF = e0VarF.G();
                cVar52 = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
            }
            if (cVar != null) {
                return ((Boolean) aVar.invoke(focusTargetNode)).booleanValue();
            }
        }
        return false;
    }
}
