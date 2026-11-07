package f3;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import com.yalantis.ucrop.view.CropImageView;
import i2.l0;
import o1.i0;
import o1.m0;
import o1.p0;
import o1.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class i {
    public static final long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final int b(l0 l0Var, g2.a aVar) {
        l0 l0VarS0 = l0Var.s0();
        if (l0VarS0 == null) {
            f2.a.b("Child of " + l0Var + " cannot be null when calculating alignment line");
        }
        if (l0Var.v0().r().containsKey(aVar)) {
            Integer num = l0Var.v0().r().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iQ = l0VarS0.Q(aVar);
            if (iQ != Integer.MIN_VALUE) {
                l0VarS0.f13937g = true;
                l0Var.f13938h = true;
                l0Var.E0();
                l0VarS0.f13937g = false;
                l0Var.f13938h = false;
                return iQ + ((int) (aVar instanceof g2.o ? l0VarS0.z0() & BodyPartID.bodyIdMax : l0VarS0.z0() >> 32));
            }
        }
        return PKIFailureInfo.systemUnavail;
    }

    public static final boolean c(p1.e eVar, p1.e eVar2, p1.e eVar3, int i10) {
        float f10;
        float f11;
        boolean zD = d(i10, eVar3, eVar);
        float f12 = eVar3.f21132b;
        float f13 = eVar3.f21134d;
        float f14 = eVar3.f21131a;
        float f15 = eVar3.f21133c;
        float f16 = eVar.f21134d;
        float f17 = eVar.f21132b;
        float f18 = eVar.f21133c;
        float f19 = eVar.f21131a;
        if (zD || !d(i10, eVar2, eVar)) {
            return false;
        }
        if (i10 == 3) {
            if (f19 < f15) {
                return true;
            }
        } else if (i10 == 4) {
            if (f18 > f14) {
                return true;
            }
        } else if (i10 == 5) {
            if (f17 < f13) {
                return true;
            }
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f16 > f12) {
                return true;
            }
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        if (i10 == 3) {
            f10 = f19 - eVar2.f21133c;
        } else if (i10 == 4) {
            f10 = eVar2.f21131a - f18;
        } else if (i10 == 5) {
            f10 = f17 - eVar2.f21134d;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = eVar2.f21132b - f16;
        }
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (i10 == 3) {
            f11 = f19 - f14;
        } else if (i10 == 4) {
            f11 = f15 - f18;
        } else if (i10 == 5) {
            f11 = f17 - f12;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f11 = f13 - f16;
        }
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        return f10 < f11;
    }

    public static final boolean d(int i10, p1.e eVar, p1.e eVar2) {
        if (i10 == 3 || i10 == 4) {
            return eVar.f21134d > eVar2.f21132b && eVar.f21132b < eVar2.f21134d;
        }
        if (i10 == 5 || i10 == 6) {
            return eVar.f21133c > eVar2.f21131a && eVar.f21131a < eVar2.f21133c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final void e(FocusTargetNode focusTargetNode, z0.b bVar) {
        if (!focusTargetNode.f1144a.f1157p) {
            f2.a.b("visitChildren called on an unattached node");
        }
        z0.b bVar2 = new z0.b(new d.c[16]);
        d.c cVar = focusTargetNode.f1144a;
        d.c cVar2 = cVar.f1149f;
        if (cVar2 == null) {
            i2.k.a(bVar2, cVar);
        } else {
            bVar2.b(cVar2);
        }
        while (true) {
            int i10 = bVar2.f34702c;
            if (i10 == 0) {
                return;
            }
            d.c cVarB = (d.c) bVar2.k(i10 - 1);
            if ((cVarB.f1147d & 1024) == 0) {
                i2.k.a(bVar2, cVarB);
            } else {
                while (true) {
                    if (cVarB == null) {
                        break;
                    }
                    if ((cVarB.f1146c & 1024) != 0) {
                        z0.b bVar3 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                if (focusTargetNode2.f1157p && !i2.k.f(focusTargetNode2).T) {
                                    if (focusTargetNode2.U1().f18909a) {
                                        bVar.b(focusTargetNode2);
                                    } else {
                                        e(focusTargetNode2, bVar);
                                    }
                                }
                            } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof i2.m)) {
                                int i11 = 0;
                                for (d.c cVar3 = ((i2.m) cVarB).f13947r; cVar3 != null; cVar3 = cVar3.f1149f) {
                                    if ((cVar3.f1146c & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarB = cVar3;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new z0.b(new d.c[16]);
                                            }
                                            if (cVarB != null) {
                                                bVar3.b(cVarB);
                                                cVarB = null;
                                            }
                                            bVar3.b(cVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarB = i2.k.b(bVar3);
                        }
                    } else {
                        cVarB = cVarB.f1149f;
                    }
                }
            }
        }
    }

    public static final FocusTargetNode f(z0.b bVar, p1.e eVar, int i10) {
        p1.e eVarI;
        if (i10 == 3) {
            eVarI = eVar.i((eVar.f21133c - eVar.f21131a) + 1, CropImageView.DEFAULT_ASPECT_RATIO);
        } else if (i10 == 4) {
            eVarI = eVar.i(-((eVar.f21133c - eVar.f21131a) + 1), CropImageView.DEFAULT_ASPECT_RATIO);
        } else if (i10 == 5) {
            eVarI = eVar.i(CropImageView.DEFAULT_ASPECT_RATIO, (eVar.f21134d - eVar.f21132b) + 1);
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            eVarI = eVar.i(CropImageView.DEFAULT_ASPECT_RATIO, -((eVar.f21134d - eVar.f21132b) + 1));
        }
        Object[] objArr = bVar.f34700a;
        int i11 = bVar.f34702c;
        FocusTargetNode focusTargetNode = null;
        for (int i12 = 0; i12 < i11; i12++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i12];
            if (m0.d(focusTargetNode2)) {
                p1.e eVarB = m0.b(focusTargetNode2);
                if (i(eVarB, eVarI, eVar, i10)) {
                    focusTargetNode = focusTargetNode2;
                    eVarI = eVarB;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean g(FocusTargetNode focusTargetNode, int i10, eh.l lVar) {
        p1.e eVar;
        z0.b bVar = new z0.b(new FocusTargetNode[16]);
        e(focusTargetNode, bVar);
        int i11 = bVar.f34702c;
        if (i11 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i11 == 0 ? null : bVar.f34700a[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) lVar.invoke(focusTargetNode2)).booleanValue();
            }
        } else {
            if (i10 == 7) {
                i10 = 4;
            }
            if (i10 == 4 || i10 == 6) {
                p1.e eVarB = m0.b(focusTargetNode);
                float f10 = eVarB.f21131a;
                float f11 = eVarB.f21132b;
                eVar = new p1.e(f10, f11, f10, f11);
            } else {
                if (i10 != 3 && i10 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                p1.e eVarB2 = m0.b(focusTargetNode);
                float f12 = eVarB2.f21133c;
                float f13 = eVarB2.f21134d;
                eVar = new p1.e(f12, f13, f12, f13);
            }
            FocusTargetNode focusTargetNodeF = f(bVar, eVar, i10);
            if (focusTargetNodeF != null) {
                return ((Boolean) lVar.invoke(focusTargetNodeF)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean h(int i10, FocusTargetNode focusTargetNode, u.a aVar, p1.e eVar) {
        if (l(i10, focusTargetNode, aVar, eVar)) {
            return true;
        }
        f1.m mVarJ = i2.k.g(focusTargetNode).getFocusOwner().j();
        mVarJ.getClass();
        Boolean bool = (Boolean) o1.a.a(focusTargetNode, i10, new p0(mVarJ, i2.k.g(focusTargetNode).getFocusOwner().r(), focusTargetNode, eVar, i10, aVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean i(p1.e eVar, p1.e eVar2, p1.e eVar3, int i10) {
        if (!j(i10, eVar, eVar3)) {
            return false;
        }
        if (j(i10, eVar2, eVar3) && !c(eVar3, eVar, eVar2, i10)) {
            return !c(eVar3, eVar2, eVar, i10) && k(i10, eVar3, eVar) < k(i10, eVar3, eVar2);
        }
        return true;
    }

    public static final boolean j(int i10, p1.e eVar, p1.e eVar2) {
        float f10 = eVar.f21132b;
        float f11 = eVar.f21134d;
        float f12 = eVar.f21131a;
        float f13 = eVar.f21133c;
        if (i10 == 3) {
            float f14 = eVar2.f21133c;
            float f15 = eVar2.f21131a;
            return (f14 > f13 || f15 >= f13) && f15 > f12;
        }
        if (i10 == 4) {
            float f16 = eVar2.f21131a;
            float f17 = eVar2.f21133c;
            return (f16 < f12 || f17 <= f12) && f17 < f13;
        }
        if (i10 == 5) {
            float f18 = eVar2.f21134d;
            float f19 = eVar2.f21132b;
            return (f18 > f11 || f19 >= f11) && f19 > f10;
        }
        if (i10 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f20 = eVar2.f21132b;
        float f21 = eVar2.f21134d;
        return (f20 < f10 || f21 <= f10) && f21 < f11;
    }

    public static final long k(int i10, p1.e eVar, p1.e eVar2) {
        float f10;
        float f11;
        float f12 = eVar2.f21132b;
        float f13 = eVar2.f21134d;
        float f14 = eVar2.f21131a;
        float f15 = eVar2.f21133c;
        if (i10 == 3) {
            f10 = eVar.f21131a - f15;
        } else if (i10 == 4) {
            f10 = f14 - eVar.f21133c;
        } else if (i10 == 5) {
            f10 = eVar.f21132b - f13;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = f12 - eVar.f21134d;
        }
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        long j10 = (long) f10;
        if (i10 == 3 || i10 == 4) {
            float f16 = eVar.f21132b;
            float f17 = 2;
            f11 = (((eVar.f21134d - f16) / f17) + f16) - (((f13 - f12) / f17) + f12);
        } else {
            if (i10 != 5 && i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = eVar.f21131a;
            float f19 = 2;
            f11 = (((eVar.f21133c - f18) / f19) + f18) - (((f15 - f14) / f19) + f14);
        }
        long j11 = (long) f11;
        return (j11 * j11) + (13 * j10 * j10);
    }

    public static final boolean l(int i10, FocusTargetNode focusTargetNode, u.a aVar, p1.e eVar) {
        FocusTargetNode focusTargetNodeF;
        z0.b bVar = new z0.b(new FocusTargetNode[16]);
        if (!focusTargetNode.f1144a.f1157p) {
            f2.a.b("visitChildren called on an unattached node");
        }
        z0.b bVar2 = new z0.b(new d.c[16]);
        d.c cVar = focusTargetNode.f1144a;
        d.c cVar2 = cVar.f1149f;
        if (cVar2 == null) {
            i2.k.a(bVar2, cVar);
        } else {
            bVar2.b(cVar2);
        }
        while (true) {
            int i11 = bVar2.f34702c;
            if (i11 == 0) {
                break;
            }
            d.c cVarB = (d.c) bVar2.k(i11 - 1);
            if ((cVarB.f1147d & 1024) == 0) {
                i2.k.a(bVar2, cVarB);
            } else {
                while (true) {
                    if (cVarB == null) {
                        break;
                    }
                    if ((cVarB.f1146c & 1024) != 0) {
                        z0.b bVar3 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                if (focusTargetNode2.f1157p) {
                                    bVar.b(focusTargetNode2);
                                }
                            } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof i2.m)) {
                                int i12 = 0;
                                for (d.c cVar3 = ((i2.m) cVarB).f13947r; cVar3 != null; cVar3 = cVar3.f1149f) {
                                    if ((cVar3.f1146c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVarB = cVar3;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new z0.b(new d.c[16]);
                                            }
                                            if (cVarB != null) {
                                                bVar3.b(cVarB);
                                                cVarB = null;
                                            }
                                            bVar3.b(cVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVarB = i2.k.b(bVar3);
                        }
                    } else {
                        cVarB = cVarB.f1149f;
                    }
                }
            }
        }
        while (bVar.f34702c != 0 && (focusTargetNodeF = f(bVar, eVar, i10)) != null) {
            if (focusTargetNodeF.U1().f18909a) {
                return ((Boolean) aVar.invoke(focusTargetNodeF)).booleanValue();
            }
            if (h(i10, focusTargetNodeF, aVar, eVar)) {
                return true;
            }
            bVar.j(focusTargetNodeF);
        }
        return false;
    }

    public static final Boolean m(int i10, FocusTargetNode focusTargetNode, u.a aVar, p1.e eVar) {
        int iOrdinal = focusTargetNode.Y().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = m0.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetNodeC.Y().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM = m(i10, focusTargetNodeC, aVar, eVar);
                        if (!kotlin.jvm.internal.r.a(boolM, Boolean.FALSE)) {
                            return boolM;
                        }
                        if (eVar == null) {
                            if (focusTargetNodeC.Y() != i0.f18865b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            FocusTargetNode focusTargetNodeA = m0.a(focusTargetNodeC);
                            if (focusTargetNodeA == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            eVar = m0.b(focusTargetNodeA);
                        }
                        return Boolean.valueOf(h(i10, focusTargetNode, aVar, eVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new pg.l();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (eVar == null) {
                    eVar = m0.b(focusTargetNodeC);
                }
                return Boolean.valueOf(h(i10, focusTargetNode, aVar, eVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.U1().f18909a ? (Boolean) aVar.invoke(focusTargetNode) : eVar == null ? Boolean.valueOf(g(focusTargetNode, i10, aVar)) : Boolean.valueOf(l(i10, focusTargetNode, aVar, eVar));
                }
                throw new pg.l();
            }
        }
        return Boolean.valueOf(g(focusTargetNode, i10, aVar));
    }

    public static final int n(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }
}
