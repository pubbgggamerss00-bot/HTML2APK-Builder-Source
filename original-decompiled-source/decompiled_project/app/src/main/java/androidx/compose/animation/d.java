package androidx.compose.animation;

import androidx.compose.ui.d;
import b.o;
import c2.g0;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import eh.p;
import eh.q;
import i2.e0;
import i2.g;
import j1.d;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.v1;
import r.a0;
import r.b0;
import r.c0;
import r.e1;
import r.f0;
import r.f1;
import r.i0;
import r.j0;
import r.m1;
import r.u0;
import r.u1;
import r.w;
import r.w0;
import r.w1;
import r.x;
import r.y;
import r.z;
import s.c2;
import s.e2;
import s.m;
import s.o2;
import s.p2;
import s.s0;
import s.y1;
import x0.a2;
import x0.h2;
import x0.j;
import x0.k;
import x0.n1;
import x0.o0;
import x0.x1;

/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [f1.b] */
    public static final void a(y1 y1Var, l lVar, androidx.compose.ui.d dVar, u1 u1Var, w1 w1Var, p pVar, f1.b bVar, j jVar, int i10) {
        int i11;
        f1.b bVar2;
        int i12;
        y1 y1Var2;
        j.a.C0321a c0321a;
        boolean z10;
        y1.a aVar;
        y1.a aVar2;
        y1.a aVar3;
        boolean z11;
        y1.a aVar4;
        y1.a aVar5;
        boolean z12;
        y1.a aVar6;
        y1.a aVar7;
        y1.a aVarB;
        final w1 w1Var2;
        final u1 u1Var2;
        boolean z13;
        f1.b bVar3;
        k kVarP = jVar.p(-891967166);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(y1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.K(u1Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.K(w1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.l(pVar) ? 131072 : 65536;
        }
        int i13 = i11 | 1572864;
        if ((12582912 & i10) == 0) {
            i13 |= kVarP.l(bVar) ? 8388608 : 4194304;
        }
        if (kVarP.A(i13 & 1, (4793491 & i13) != 4793490)) {
            x1 x1Var = y1Var.f24004d;
            g0 g0Var = y1Var.f24001a;
            if (((Boolean) lVar.invoke(x1Var.getValue())).booleanValue() || ((Boolean) lVar.invoke(g0Var.V())).booleanValue() || y1Var.g() || y1Var.d()) {
                kVarP.L(1788522886);
                int i14 = i13 & 14;
                int i15 = i14 | 48;
                int i16 = i15 & 14;
                boolean z14 = ((i16 ^ 6) > 4 && kVarP.K(y1Var)) || (i15 & 6) == 4;
                Object objG = kVarP.g();
                boolean z15 = z14;
                j.a.C0321a c0321a2 = j.a.f31715a;
                if (z15 || objG == c0321a2) {
                    objG = g0Var.V();
                    kVarP.C(objG);
                }
                if (y1Var.g()) {
                    objG = g0Var.V();
                }
                kVarP.L(-466616829);
                u0 u0VarE = e(y1Var, lVar, objG, kVarP);
                kVarP.T(false);
                Object value = y1Var.f24004d.getValue();
                kVarP.L(-466616829);
                u0 u0VarE2 = e(y1Var, lVar, value, kVarP);
                kVarP.T(false);
                int i17 = i16 | 3072;
                c2.b bVar4 = c2.f23679a;
                int i18 = (i17 & 14) ^ 6;
                int i19 = i13;
                boolean z16 = (i18 > 4 && kVarP.K(y1Var)) || (i17 & 6) == 4;
                Object objG2 = kVarP.g();
                if (z16 || objG2 == c0321a2) {
                    i12 = i17;
                    objG2 = new y1(new s0(u0VarE), y1Var, o.a(new StringBuilder(), y1Var.f24003c, " > EnterExitTransition"));
                    kVarP.C(objG2);
                } else {
                    i12 = i17;
                }
                y1 y1Var3 = (y1) objG2;
                boolean zK = ((i18 > 4 && kVarP.K(y1Var)) || (i12 & 6) == 4) | kVarP.K(y1Var3);
                Object objG3 = kVarP.g();
                if (zK || objG3 == c0321a2) {
                    objG3 = new e2(y1Var, y1Var3);
                    kVarP.C(objG3);
                }
                o0.a(y1Var3, (l) objG3, kVarP);
                if (y1Var.g()) {
                    y1Var3.k(u0VarE, u0VarE2);
                } else {
                    y1Var3.p(u0VarE2);
                    y1Var3.f24011k.setValue(Boolean.FALSE);
                }
                n1 n1VarK = bg.b.k(pVar, kVarP);
                g0 g0Var2 = y1Var3.f24001a;
                g0 g0Var3 = y1Var3.f24001a;
                x1 x1Var2 = y1Var3.f24004d;
                Object objInvoke = pVar.invoke(g0Var2.V(), x1Var2.getValue());
                boolean zK2 = kVarP.K(y1Var3) | kVarP.K(n1VarK);
                Object objG4 = kVarP.g();
                if (zK2 || objG4 == c0321a2) {
                    objG4 = new y(y1Var3, n1VarK, null);
                    kVarP.C(objG4);
                }
                n1 n1VarI = bg.b.i((p) objG4, objInvoke, kVarP);
                Object objV = g0Var3.V();
                u0 u0Var = u0.f22957c;
                if (objV == u0Var && x1Var2.getValue() == u0Var && ((Boolean) n1VarI.getValue()).booleanValue()) {
                    kVarP.L(1790688794);
                    kVarP.T(false);
                    bVar3 = bVar;
                    z13 = false;
                } else {
                    kVarP.L(1789551931);
                    boolean z17 = i14 == 4;
                    Object objG5 = kVarP.g();
                    if (z17 || objG5 == c0321a2) {
                        objG5 = new i0(y1Var3);
                        kVarP.C(objG5);
                    }
                    i0 i0Var = (i0) objG5;
                    o2 o2Var = w0.f22973a;
                    e1 e1Var = e1.f22814a;
                    boolean zK3 = kVarP.K(y1Var3);
                    Object objG6 = kVarP.g();
                    if (zK3 || objG6 == c0321a2) {
                        objG6 = bg.b.h(u1Var);
                        kVarP.C(objG6);
                    }
                    n1 n1Var = (n1) objG6;
                    if (g0Var3.V() == x1Var2.getValue() && g0Var3.V() == u0.f22956b) {
                        if (y1Var3.g()) {
                            n1Var.setValue(u1Var);
                        } else {
                            n1Var.setValue(u1.f22959a);
                        }
                    } else if (x1Var2.getValue() == u0.f22956b) {
                        n1Var.setValue(((u1) n1Var.getValue()).b(u1Var));
                    }
                    u1 u1Var3 = (u1) n1Var.getValue();
                    boolean zK4 = kVarP.K(y1Var3);
                    Object objG7 = kVarP.g();
                    if (zK4 || objG7 == c0321a2) {
                        objG7 = bg.b.h(w1Var);
                        kVarP.C(objG7);
                    }
                    n1 n1Var2 = (n1) objG7;
                    if (g0Var3.V() == x1Var2.getValue() && g0Var3.V() == u0.f22956b) {
                        if (y1Var3.g()) {
                            n1Var2.setValue(w1Var);
                        } else {
                            n1Var2.setValue(w1.f22979a);
                        }
                    } else if (x1Var2.getValue() != u0.f22956b) {
                        n1Var2.setValue(((w1) n1Var2.getValue()).b(w1Var));
                    }
                    w1 w1Var3 = (w1) n1Var2.getValue();
                    boolean z18 = (u1Var3.a().f22903b == null && w1Var3.a().f22903b == null) ? false : true;
                    boolean z19 = (u1Var3.a().f22904c == null && w1Var3.a().f22904c == null) ? false : true;
                    if (z18) {
                        kVarP.L(-821159459);
                        o2 o2Var2 = p2.f23874g;
                        Object objG8 = kVarP.g();
                        if (objG8 == c0321a2) {
                            objG8 = "Built-in slide";
                            kVarP.C("Built-in slide");
                        }
                        String str = (String) objG8;
                        c0321a = c0321a2;
                        y1Var2 = y1Var3;
                        z10 = true;
                        y1.a aVarB2 = c2.b(y1Var2, o2Var2, str, kVarP, 384, 0);
                        kVarP.T(false);
                        aVar = aVarB2;
                    } else {
                        y1Var2 = y1Var3;
                        c0321a = c0321a2;
                        z10 = true;
                        kVarP.L(-821053656);
                        kVarP.T(false);
                        aVar = null;
                    }
                    if (z19) {
                        kVarP.L(-820961865);
                        o2 o2Var3 = p2.f23875h;
                        Object objG9 = kVarP.g();
                        if (objG9 == c0321a) {
                            objG9 = "Built-in shrink/expand";
                            kVarP.C("Built-in shrink/expand");
                        }
                        y1.a aVarB3 = c2.b(y1Var2, o2Var3, (String) objG9, kVarP, 384, 0);
                        kVarP.T(false);
                        aVar2 = aVarB3;
                    } else {
                        kVarP.L(-820851041);
                        kVarP.T(false);
                        aVar2 = null;
                    }
                    if (z19) {
                        kVarP.L(-820777446);
                        o2 o2Var4 = p2.f23874g;
                        Object objG10 = kVarP.g();
                        if (objG10 == c0321a) {
                            objG10 = "Built-in InterruptionHandlingOffset";
                            kVarP.C("Built-in InterruptionHandlingOffset");
                        }
                        y1.a aVarB4 = c2.b(y1Var2, o2Var4, (String) objG10, kVarP, 384, 0);
                        kVarP.T(false);
                        aVar3 = aVarB4;
                    } else {
                        kVarP.L(-820608001);
                        kVarP.T(false);
                        aVar3 = null;
                    }
                    j0 j0Var = u1Var3.a().f22904c;
                    j0 j0Var2 = w1Var3.a().f22904c;
                    boolean z20 = !z19;
                    boolean z21 = (u1Var3.a().f22902a == null && w1Var3.a().f22902a == null) ? false : z10;
                    boolean z22 = (u1Var3.a().f22905d == null && w1Var3.a().f22905d == null) ? false : z10;
                    if (z21) {
                        kVarP.L(-675026101);
                        o2 o2Var5 = p2.f23868a;
                        Object objG11 = kVarP.g();
                        if (objG11 == c0321a) {
                            objG11 = "Built-in alpha";
                            kVarP.C("Built-in alpha");
                        }
                        z11 = z20;
                        y1.a aVarB5 = c2.b(y1Var2, o2Var5, (String) objG11, kVarP, 384, 0);
                        kVarP.T(false);
                        aVar4 = aVarB5;
                    } else {
                        z11 = z20;
                        kVarP.L(-674857617);
                        kVarP.T(false);
                        aVar4 = null;
                    }
                    if (z22) {
                        kVarP.L(-674790005);
                        o2 o2Var6 = p2.f23868a;
                        Object objG12 = kVarP.g();
                        if (objG12 == c0321a) {
                            objG12 = "Built-in scale";
                            kVarP.C("Built-in scale");
                        }
                        aVar5 = aVar4;
                        y1.a aVarB6 = c2.b(y1Var2, o2Var6, (String) objG12, kVarP, 384, 0);
                        z12 = false;
                        kVarP.T(false);
                        aVar6 = aVarB6;
                    } else {
                        aVar5 = aVar4;
                        z12 = false;
                        kVarP.L(-674621521);
                        kVarP.T(false);
                        aVar6 = null;
                    }
                    if (z22) {
                        kVarP.L(-674543896);
                        aVar7 = aVar6;
                        aVarB = c2.b(y1Var2, w0.f22973a, "TransformOriginInterruptionHandling", kVarP, 384, 0);
                        kVarP.T(z12);
                    } else {
                        aVar7 = aVar6;
                        kVarP.L(-674372529);
                        kVarP.T(z12);
                        aVarB = null;
                    }
                    boolean zL = kVarP.l(aVar5) | kVarP.K(u1Var3) | kVarP.K(w1Var3) | kVarP.l(aVar7) | kVarP.K(y1Var2) | kVarP.l(aVarB);
                    Object objG13 = kVarP.g();
                    if (zL || objG13 == c0321a) {
                        final y1.a aVar8 = aVar5;
                        final y1.a aVar9 = aVar7;
                        w1Var2 = w1Var3;
                        final y1 y1Var4 = y1Var2;
                        final y1.a aVar10 = aVarB;
                        u1Var2 = u1Var3;
                        objG13 = new r.c2() { // from class: r.v0
                            /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
                            @Override // r.c2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final z0 init() {
                                q1.l2 l2Var;
                                y1.a aVar11 = aVar8;
                                u1 u1Var4 = u1Var2;
                                w1 w1Var4 = w1Var2;
                                y1.a.C0268a c0268aA = aVar11 != null ? aVar11.a(new x0(u1Var4, w1Var4), new y0(u1Var4, w1Var4)) : null;
                                y1.a aVar12 = aVar9;
                                y1.a.C0268a c0268aA2 = aVar12 != null ? aVar12.a(new a1(u1Var4, w1Var4), new b1(u1Var4, w1Var4)) : null;
                                if (y1Var4.f24001a.V() == u0.f22955a) {
                                    f2 f2Var = u1Var4.a().f22905d;
                                    if (f2Var != null) {
                                        l2Var = new q1.l2(f2Var.f22820b);
                                    } else {
                                        f2 f2Var2 = w1Var4.a().f22905d;
                                        l2Var = f2Var2 != null ? new q1.l2(f2Var2.f22820b) : null;
                                    }
                                } else {
                                    f2 f2Var3 = w1Var4.a().f22905d;
                                    if (f2Var3 != null) {
                                        l2Var = new q1.l2(f2Var3.f22820b);
                                    } else {
                                        f2 f2Var4 = u1Var4.a().f22905d;
                                        if (f2Var4 != null) {
                                            l2Var = new q1.l2(f2Var4.f22820b);
                                        }
                                    }
                                }
                                y1.a aVar13 = aVar10;
                                return new z0(c0268aA, c0268aA2, aVar13 != null ? aVar13.a(c1.f22798a, new d1(l2Var, u1Var4, w1Var4)) : null);
                            }
                        };
                        kVarP.C(objG13);
                    } else {
                        w1Var2 = w1Var3;
                        u1Var2 = u1Var3;
                    }
                    r.c2 c2Var = (r.c2) objG13;
                    boolean zC = kVarP.c(z11) | kVarP.K(e1Var);
                    Object objG14 = kVarP.g();
                    if (zC || objG14 == c0321a) {
                        objG14 = new f1(e1Var, z11);
                        kVarP.C(objG14);
                    }
                    d.a aVar11 = d.a.f1143b;
                    androidx.compose.ui.d dVarH = androidx.compose.ui.graphics.a.a(aVar11, (l) objG14).h(new EnterExitTransitionElement(y1Var2, aVar2, aVar3, aVar, u1Var2, w1Var2, e1Var, c2Var));
                    kVarP.L(1581779440);
                    kVarP.T(false);
                    androidx.compose.ui.d dVarH2 = dVar.h(dVarH.h(aVar11));
                    Object objG15 = kVarP.g();
                    if (objG15 == c0321a) {
                        objG15 = new w(i0Var);
                        kVarP.C(objG15);
                    }
                    w wVar = (w) objG15;
                    int i20 = kVarP.P;
                    a2 a2VarP = kVarP.P();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH2, kVarP);
                    g.f13861o.getClass();
                    e0.a aVar12 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.w(aVar12);
                    } else {
                        kVarP.z();
                    }
                    v1.j(g.a.f13867f, wVar, kVarP);
                    v1.j(g.a.f13866e, a2VarP, kVarP);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (kVarP.O || !r.a(kVarP.g(), Integer.valueOf(i20))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i20, kVarP, i20, c0128a);
                    }
                    v1.j(g.a.f13865d, dVarC, kVarP);
                    ?? r12 = bVar;
                    r12.b(i0Var, kVarP, Integer.valueOf((i19 >> 18) & 112));
                    kVarP.T(true);
                    z13 = false;
                    kVarP.T(false);
                    bVar3 = r12;
                }
                kVarP.T(z13);
                bVar2 = bVar3;
            } else {
                kVarP.L(1790694746);
                kVarP.T(false);
                bVar2 = bVar;
            }
        } else {
            bVar2 = bVar;
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new x(y1Var, lVar, dVar, u1Var, w1Var, pVar, bVar2, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(z.r rVar, boolean z10, androidx.compose.ui.d dVar, u1 u1Var, w1 w1Var, String str, f1.b bVar, j jVar, int i10, int i11) {
        int i12;
        u1 u1VarB;
        int i13;
        w1 w1Var2;
        int i14;
        androidx.compose.ui.d dVar2;
        String str2;
        u1 u1Var2;
        h2 h2VarV;
        k kVarP = jVar.p(1766503102);
        if ((i10 & 48) == 0) {
            i12 = (kVarP.c(z10) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i12 | 384;
        int i16 = i11 & 4;
        if (i16 != 0) {
            i15 = i12 | 3456;
        } else {
            if ((i10 & 3072) == 0) {
                u1VarB = u1Var;
                i15 |= kVarP.K(u1VarB) ? 2048 : 1024;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    w1Var2 = w1Var;
                    i15 |= kVarP.K(w1Var2) ? 16384 : 8192;
                }
                i14 = i15 | 196608;
                if ((1572864 & i10) == 0) {
                    i14 |= kVarP.l(bVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if (kVarP.A(i14 & 1, (599185 & i14) != 599184)) {
                    if (i16 != 0) {
                        u1VarB = w0.c(null, 3).b(w0.b(null, 15));
                    }
                    u1 u1Var3 = u1VarB;
                    w1 w1VarB = i13 != 0 ? w0.d(null, 3).b(w0.g(null, 15)) : w1Var2;
                    int i17 = i14 >> 3;
                    y1 y1VarE = c2.e(Boolean.valueOf(z10), "AnimatedVisibility", kVarP, (i17 & 14) | ((i14 >> 12) & 112), 0);
                    int i18 = (i14 & 896) | 48 | (i14 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i14 & 57344) | (458752 & i17);
                    b0 b0Var = b0.f22784a;
                    d.a aVar = d.a.f1143b;
                    d(y1VarE, b0Var, aVar, u1Var3, w1VarB, bVar, kVarP, i18);
                    str2 = "AnimatedVisibility";
                    dVar2 = aVar;
                    u1Var2 = u1Var3;
                    w1Var2 = w1VarB;
                } else {
                    kVarP.v();
                    dVar2 = dVar;
                    str2 = str;
                    u1Var2 = u1VarB;
                }
                h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new c0(rVar, z10, dVar2, u1Var2, w1Var2, str2, bVar, i10, i11);
                    return;
                }
                return;
            }
            i15 |= 24576;
            w1Var2 = w1Var;
            i14 = i15 | 196608;
            if ((1572864 & i10) == 0) {
            }
            if (kVarP.A(i14 & 1, (599185 & i14) != 599184)) {
            }
            h2VarV = kVarP.V();
            if (h2VarV != null) {
            }
        }
        u1VarB = u1Var;
        i13 = i11 & 8;
        if (i13 != 0) {
        }
        w1Var2 = w1Var;
        i14 = i15 | 196608;
        if ((1572864 & i10) == 0) {
        }
        if (kVarP.A(i14 & 1, (599185 & i14) != 599184)) {
        }
        h2VarV = kVarP.V();
        if (h2VarV != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(boolean z10, androidx.compose.ui.d dVar, r.v1 v1Var, w1 w1Var, String str, f1.b bVar, j jVar, int i10, int i11) {
        androidx.compose.ui.d dVar2;
        int i12;
        w1 w1Var2;
        int i13;
        String str2;
        androidx.compose.ui.d dVar3;
        w1 w1Var3;
        h2 h2VarV;
        w1 w1VarB;
        k kVarP = jVar.p(2088733774);
        int i14 = (kVarP.c(z10) ? 4 : 2) | i10;
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 = i14 | 48;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i12 = i14 | (kVarP.K(dVar2) ? 32 : 16);
        }
        if ((i10 & 384) == 0) {
            i12 |= kVarP.K(v1Var) ? 256 : 128;
        }
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 3072) == 0) {
                w1Var2 = w1Var;
                i12 |= kVarP.K(w1Var2) ? 2048 : 1024;
            }
            i13 = i12 | 24576;
            if (kVarP.A(i13 & 1, (74899 & i13) == 74898)) {
                kVarP.v();
                str2 = str;
                dVar3 = dVar2;
                w1Var3 = w1Var2;
            } else {
                dVar3 = i15 != 0 ? d.a.f1143b : dVar2;
                if (i16 != 0) {
                    o2 o2Var = w0.f22973a;
                    long j10 = 1;
                    w1VarB = w0.f(m1.f22886a, d.a.f14610i, m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.p((j10 & BodyPartID.bodyIdMax) | (j10 << 32)), 1)).b(w0.d(null, 3));
                } else {
                    w1VarB = w1Var2;
                }
                y1 y1VarE = c2.e(Boolean.valueOf(z10), "AnimatedVisibility", kVarP, (i13 & 14) | 48, 0);
                int i17 = i13 << 3;
                d(y1VarE, z.f23003a, dVar3, v1Var, w1VarB, bVar, kVarP, (i17 & 57344) | (i17 & 896) | 48 | (i17 & V4Signature.MAX_SIGNING_INFOS_SIZE) | 196608);
                str2 = "AnimatedVisibility";
                w1Var3 = w1VarB;
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new a0(z10, dVar3, v1Var, w1Var3, str2, bVar, i10, i11);
                return;
            }
            return;
        }
        i12 |= 3072;
        w1Var2 = w1Var;
        i13 = i12 | 24576;
        if (kVarP.A(i13 & 1, (74899 & i13) == 74898)) {
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void d(y1 y1Var, l lVar, androidx.compose.ui.d dVar, u1 u1Var, w1 w1Var, f1.b bVar, j jVar, int i10) {
        int i11;
        u1 u1Var2;
        w1 w1Var2;
        f1.b bVar2;
        k kVarP = jVar.p(429978603);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(y1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            u1Var2 = u1Var;
            i11 |= kVarP.K(u1Var2) ? 2048 : 1024;
        } else {
            u1Var2 = u1Var;
        }
        if ((i10 & 24576) == 0) {
            w1Var2 = w1Var;
            i11 |= kVarP.K(w1Var2) ? 16384 : 8192;
        } else {
            w1Var2 = w1Var;
        }
        if ((i10 & 196608) == 0) {
            bVar2 = bVar;
            i11 |= kVarP.l(bVar2) ? 131072 : 65536;
        } else {
            bVar2 = bVar;
        }
        if (kVarP.A(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 112;
            int i13 = i11 & 14;
            boolean z10 = (i12 == 32) | (i13 == 4);
            Object objG = kVarP.g();
            if (z10 || objG == j.a.f31715a) {
                objG = new r.e0(lVar, y1Var);
                kVarP.C(objG);
            }
            a(y1Var, lVar, androidx.compose.ui.layout.b.a(dVar, (q) objG), u1Var2, w1Var2, f0.f22816a, bVar2, kVarP, i13 | 196608 | i12 | (i11 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (57344 & i11) | ((i11 << 6) & 29360128));
        } else {
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new r.g0(y1Var, lVar, dVar, u1Var, w1Var, bVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final u0 e(y1 y1Var, l lVar, Object obj, j jVar) {
        u0 u0Var;
        jVar.q(-902032957, y1Var);
        boolean zG = y1Var.g();
        g0 g0Var = y1Var.f24001a;
        if (zG) {
            jVar.L(2101770115);
            jVar.B();
            u0Var = ((Boolean) lVar.invoke(obj)).booleanValue() ? u0.f22956b : ((Boolean) lVar.invoke(g0Var.V())).booleanValue() ? u0.f22957c : u0.f22955a;
        } else {
            jVar.L(2102044248);
            Object objG = jVar.g();
            if (objG == j.a.f31715a) {
                objG = bg.b.h(Boolean.FALSE);
                jVar.C(objG);
            }
            n1 n1Var = (n1) objG;
            if (((Boolean) lVar.invoke(g0Var.V())).booleanValue()) {
                n1Var.setValue(Boolean.TRUE);
            }
            u0Var = ((Boolean) lVar.invoke(obj)).booleanValue() ? u0.f22956b : ((Boolean) n1Var.getValue()).booleanValue() ? u0.f22957c : u0.f22955a;
            jVar.B();
        }
        jVar.F();
        return u0Var;
    }
}
