package f3;

import android.content.Context;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import i2.d1;
import i2.e0;
import i2.p1;
import o1.c0;
import o1.i0;
import o1.k0;
import o1.l0;
import o1.m0;
import o1.z;
import p.x;

/* loaded from: classes.dex */
public final class a {
    public static final g a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        g3.a aVarA = g3.b.a(f10);
        if (aVarA == null) {
            aVarA = new s(f10);
        }
        return new g(f11, f10, aVarA);
    }

    public static final void b(x xVar, int i10) {
        if (xVar.f20751b == 0 || !(xVar.c(0) == i10 || xVar.c(xVar.f20751b - 1) == i10)) {
            int i11 = xVar.f20751b;
            xVar.a(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iC = xVar.c(i12);
                if (i10 <= iC) {
                    break;
                }
                xVar.g(i11, iC);
                i11 = i12;
            }
            xVar.g(i11, i10);
        }
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z10) {
        int iOrdinal = focusTargetNode.Y().ordinal();
        if (iOrdinal == 0) {
            i2.k.g(focusTargetNode).getFocusOwner().m(null);
            focusTargetNode.T1(i0.f18864a, i0.f18867d);
            return true;
        }
        if (iOrdinal == 1) {
            FocusTargetNode focusTargetNodeC = m0.c(focusTargetNode);
            if (!(focusTargetNodeC != null ? c(focusTargetNodeC, z10) : true)) {
                return false;
            }
            focusTargetNode.T1(i0.f18865b, i0.f18867d);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new pg.l();
        }
        if (z10) {
            i2.k.g(focusTargetNode).getFocusOwner().m(null);
            focusTargetNode.T1(i0.f18866c, i0.f18867d);
        }
        return z10;
    }

    public static final o1.c d(FocusTargetNode focusTargetNode, int i10) {
        int iOrdinal = focusTargetNode.Y().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = m0.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                o1.c cVarD = d(focusTargetNodeC, i10);
                o1.c cVar = o1.c.f18850a;
                if (cVarD == cVar) {
                    cVarD = null;
                }
                if (cVarD != null) {
                    return cVarD;
                }
                if (focusTargetNode.f1180r) {
                    return cVar;
                }
                focusTargetNode.f1180r = true;
                try {
                    z zVarU1 = focusTargetNode.U1();
                    o1.b bVar = new o1.b(i10);
                    k0.a(focusTargetNode);
                    o1.q focusOwner = i2.k.g(focusTargetNode).getFocusOwner();
                    FocusTargetNode focusTargetNodeR = focusOwner.r();
                    zVarU1.f18919k.invoke(bVar);
                    FocusTargetNode focusTargetNodeR2 = focusOwner.r();
                    if (!bVar.f18849b) {
                        return (focusTargetNodeR == focusTargetNodeR2 || focusTargetNodeR2 == null) ? cVar : c0.f18856d == c0.f18855c ? o1.c.f18851b : o1.c.f18852c;
                    }
                    c0 c0Var = c0.f18854b;
                    return o1.c.f18851b;
                } finally {
                    focusTargetNode.f1180r = false;
                }
            }
            if (iOrdinal == 2) {
                return o1.c.f18851b;
            }
            if (iOrdinal != 3) {
                throw new pg.l();
            }
        }
        return o1.c.f18850a;
    }

    public static final o1.c e(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f1181s) {
            focusTargetNode.f1181s = true;
            try {
                z zVarU1 = focusTargetNode.U1();
                o1.b bVar = new o1.b(i10);
                k0.a(focusTargetNode);
                o1.q focusOwner = i2.k.g(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeR = focusOwner.r();
                zVarU1.f18918j.invoke(bVar);
                FocusTargetNode focusTargetNodeR2 = focusOwner.r();
                if (bVar.f18849b) {
                    c0 c0Var = c0.f18854b;
                    return o1.c.f18851b;
                }
                if (focusTargetNodeR != focusTargetNodeR2 && focusTargetNodeR2 != null) {
                    return c0.f18856d == c0.f18855c ? o1.c.f18851b : o1.c.f18852c;
                }
            } finally {
                focusTargetNode.f1181s = false;
            }
        }
        return o1.c.f18850a;
    }

    public static final o1.c f(FocusTargetNode focusTargetNode, int i10) {
        d.c cVarB;
        d1 d1Var;
        int iOrdinal = focusTargetNode.Y().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = m0.c(focusTargetNode);
                if (focusTargetNodeC != null) {
                    return d(focusTargetNodeC, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new pg.l();
                }
                if (!focusTargetNode.f1144a.f1157p) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                d.c cVar = focusTargetNode.f1144a.f1148e;
                e0 e0VarF = i2.k.f(focusTargetNode);
                loop0: while (true) {
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
                                        int i11 = 0;
                                        for (d.c cVar2 = ((i2.m) cVarB).f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
                                            if ((cVar2.f1146c & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
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
                                        if (i11 == 1) {
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
                if (focusTargetNode2 == null) {
                    return o1.c.f18850a;
                }
                int iOrdinal2 = focusTargetNode2.Y().ordinal();
                if (iOrdinal2 == 0) {
                    return e(focusTargetNode2, i10);
                }
                if (iOrdinal2 == 1) {
                    return f(focusTargetNode2, i10);
                }
                if (iOrdinal2 == 2) {
                    return o1.c.f18851b;
                }
                if (iOrdinal2 != 3) {
                    throw new pg.l();
                }
                o1.c cVarF = f(focusTargetNode2, i10);
                o1.c cVar3 = cVarF != o1.c.f18850a ? cVarF : null;
                return cVar3 == null ? e(focusTargetNode2, i10) : cVar3;
            }
        }
        return o1.c.f18850a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e4 A[ADDED_TO_REGION, LOOP:9: B:137:0x01e4->B:144:0x01f8, LOOP_START, PHI: r12
      0x01e4: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:136:0x01e2, B:144:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0207  */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean g(FocusTargetNode focusTargetNode) {
        z0.b bVar;
        int i10;
        d1 d1Var;
        char c10;
        d1 d1Var2;
        o1.q focusOwner = i2.k.g(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeR = focusOwner.r();
        i0 i0VarV1 = focusTargetNode.Y();
        if (focusTargetNodeR == focusTargetNode) {
            focusTargetNode.T1(i0VarV1, i0VarV1);
            return true;
        }
        int i11 = 0;
        if (focusTargetNodeR == null && !i2.k.g(focusTargetNode).getFocusOwner().t()) {
            return false;
        }
        char c11 = 16;
        if (focusTargetNodeR != null) {
            bVar = new z0.b(new FocusTargetNode[16]);
            if (!focusTargetNodeR.f1144a.f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNodeR.f1144a.f1148e;
            e0 e0VarF = i2.k.f(focusTargetNodeR);
            while (e0VarF != null) {
                if ((e0VarF.I.f13793e.f1147d & 1024) != 0) {
                    while (cVar != null) {
                        if ((cVar.f1146c & 1024) != 0) {
                            d.c cVarB = cVar;
                            z0.b bVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof FocusTargetNode) {
                                    bVar.b((FocusTargetNode) cVarB);
                                } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof i2.m)) {
                                    int i12 = 0;
                                    for (d.c cVar2 = ((i2.m) cVarB).f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
                                        if ((cVar2.f1146c & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                cVarB = cVar2;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new z0.b(new d.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    bVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                bVar2.b(cVar2);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                cVarB = i2.k.b(bVar2);
                            }
                        }
                        cVar = cVar.f1148e;
                    }
                }
                e0VarF = e0VarF.G();
                cVar = (e0VarF == null || (d1Var2 = e0VarF.I) == null) ? null : d1Var2.f13792d;
            }
        } else {
            bVar = null;
        }
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        if (!focusTargetNode.f1144a.f1157p) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        d.c cVar3 = focusTargetNode.f1144a.f1148e;
        e0 e0VarF2 = i2.k.f(focusTargetNode);
        int i13 = 1;
        int i14 = 0;
        while (e0VarF2 != null) {
            if ((e0VarF2.I.f13793e.f1147d & 1024) != 0) {
                while (cVar3 != null) {
                    if ((cVar3.f1146c & 1024) != 0) {
                        d.c cVarB2 = cVar3;
                        z0.b bVar3 = null;
                        while (cVarB2 != null) {
                            if (cVarB2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB2;
                                Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.j(focusTargetNode2)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i15 = i14 + 1;
                                    if (focusTargetNodeArr.length < i15) {
                                        int length = focusTargetNodeArr.length;
                                        ?? r42 = new Object[Math.max(i15, length * 2)];
                                        System.arraycopy(focusTargetNodeArr, i11, r42, i11, length);
                                        focusTargetNodeArr = r42;
                                    }
                                    focusTargetNodeArr[i14] = focusTargetNode2;
                                    i14 = i15;
                                }
                                if (focusTargetNode2 == focusTargetNodeR) {
                                    i13 = i11;
                                }
                            } else {
                                if ((cVarB2.f1146c & 1024) != 0 && (cVarB2 instanceof i2.m)) {
                                    int i16 = i11;
                                    for (d.c cVar4 = ((i2.m) cVarB2).f13947r; cVar4 != null; cVar4 = cVar4.f1149f) {
                                        if ((cVar4.f1146c & 1024) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                cVarB2 = cVar4;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new z0.b(new d.c[16]);
                                                }
                                                if (cVarB2 != null) {
                                                    bVar3.b(cVarB2);
                                                    cVarB2 = null;
                                                }
                                                bVar3.b(cVar4);
                                            }
                                        }
                                    }
                                    c10 = 16;
                                    if (i16 == 1) {
                                        c11 = 16;
                                    }
                                    i11 = 0;
                                }
                                cVarB2 = i2.k.b(bVar3);
                                c11 = c10;
                                i11 = 0;
                            }
                            c10 = 16;
                            cVarB2 = i2.k.b(bVar3);
                            c11 = c10;
                            i11 = 0;
                        }
                    }
                    cVar3 = cVar3.f1148e;
                    c11 = c11;
                    i11 = 0;
                }
            }
            char c12 = c11;
            e0VarF2 = e0VarF2.G();
            cVar3 = (e0VarF2 == null || (d1Var = e0VarF2.I) == null) ? null : d1Var.f13792d;
            c11 = c12;
            i11 = 0;
        }
        if (i13 == 0 || focusTargetNodeR == null || c(focusTargetNodeR, false)) {
            p1.a(focusTargetNode, new l0(focusTargetNode, 0));
            int iOrdinal = focusTargetNode.Y().ordinal();
            if (iOrdinal == 1 || iOrdinal == 3) {
                i2.k.g(focusTargetNode).getFocusOwner().m(focusTargetNode);
            }
            if (bVar != null) {
                int i17 = bVar.f34702c - 1;
                Object[] objArr = bVar.f34700a;
                if (i17 < objArr.length) {
                    while (i17 >= 0) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i17];
                        if (focusOwner.r() != focusTargetNode) {
                            break;
                        }
                        focusTargetNode3.T1(i0.f18865b, i0.f18867d);
                        i17--;
                    }
                    i10 = i14 - 1;
                    if (i10 >= focusTargetNodeArr.length) {
                        while (i10 >= 0) {
                            FocusTargetNode focusTargetNode4 = focusTargetNodeArr[i10];
                            if (focusOwner.r() != focusTargetNode) {
                                break;
                            }
                            focusTargetNode4.T1(focusTargetNode4 == focusTargetNodeR ? i0.f18864a : i0.f18867d, i0.f18865b);
                            i10--;
                        }
                        if (focusOwner.r() == focusTargetNode) {
                            focusTargetNode.T1(i0VarV1, i0.f18864a);
                            if (focusOwner.r() != focusTargetNode) {
                                break;
                            }
                            return true;
                        }
                    } else if (focusOwner.r() == focusTargetNode) {
                    }
                } else {
                    i10 = i14 - 1;
                    if (i10 >= focusTargetNodeArr.length) {
                    }
                }
            }
        }
        return false;
    }

    public static final int h(x xVar) {
        int iC;
        int i10 = xVar.f20751b;
        int iC2 = xVar.c(0);
        while (xVar.f20751b != 0 && xVar.c(0) == iC2) {
            xVar.g(0, xVar.d());
            xVar.f(xVar.f20751b - 1);
            int i11 = xVar.f20751b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iC3 = xVar.c(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iC4 = xVar.c(i15);
                if (i14 >= i11 || (iC = xVar.c(i14)) <= iC4) {
                    if (iC4 > iC3) {
                        xVar.g(i13, iC4);
                        xVar.g(i15, iC3);
                        i13 = i15;
                    }
                } else if (iC > iC3) {
                    xVar.g(i13, iC);
                    xVar.g(i14, iC3);
                    i13 = i14;
                }
            }
        }
        return iC2;
    }
}
