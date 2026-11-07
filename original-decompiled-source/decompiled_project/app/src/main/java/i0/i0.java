package i0;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.d;
import f3.b;
import i2.e0;
import i2.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t2.b;
import x0.j;
import x2.f;

/* loaded from: classes.dex */
public final class i0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(t2.b bVar, androidx.compose.ui.d dVar, t2.l0 l0Var, eh.l lVar, int i10, boolean z10, int i11, int i12, Map map, x0.j jVar, int i13) {
        x0.k kVar;
        int i14;
        x0.k kVar2;
        Object obj;
        boolean z11;
        l0.g gVar;
        boolean z12;
        boolean z13;
        x0.k kVar3;
        boolean z14;
        Object objG;
        x0.n1 n1Var;
        boolean zK;
        Object objG2;
        x0.k kVarP = jVar.p(-1343466571);
        int i15 = (i13 & 6) == 0 ? (kVarP.K(bVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= kVarP.K(l0Var) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= kVarP.l(lVar) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= kVarP.i(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= kVarP.c(z10) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i15 |= kVarP.i(i11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i13) == 0) {
            i15 |= kVarP.i(i12) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= kVarP.l(map) ? 67108864 : 33554432;
        }
        if ((805306368 & i13) == 0) {
            i15 |= kVarP.l(null) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (kVarP.A(i15 & 1, (306783379 & i15) != 306783378)) {
            x1.c(i12, i11);
            m0.j2 j2Var = (m0.j2) kVarP.f(m0.n2.f17429a);
            Object obj2 = j.a.f31715a;
            if (j2Var != null) {
                kVarP.L(-1584170794);
                long j10 = ((m0.q3) kVarP.f(m0.r3.f17501a)).f17465b;
                Object[] objArr = {j2Var};
                g0 g0Var = new g0(j2Var);
                g1.n nVar = g1.m.f11307a;
                i14 = i15;
                g1.n nVar2 = new g1.n(g0Var, h0.f13308a);
                boolean zL = kVarP.l(j2Var);
                Object objG3 = kVarP.g();
                if (zL || objG3 == obj2) {
                    objG3 = new x(j2Var);
                    kVarP.C(objG3);
                }
                obj = obj2;
                z11 = true;
                Object objD = b0.a0.d(objArr, nVar2, (eh.a) objG3, kVarP, 0, 4);
                kVar2 = kVarP;
                long jLongValue = ((Number) objD).longValue();
                boolean zJ = kVar2.j(jLongValue) | kVar2.K(j2Var) | kVar2.j(j10);
                Object objG4 = kVar2.g();
                if (zJ || objG4 == obj) {
                    objG4 = new l0.g(jLongValue, j2Var, j10);
                    kVar2.C(objG4);
                }
                kVar2.T(false);
                gVar = (l0.g) objG4;
            } else {
                i14 = i15;
                kVar2 = kVarP;
                obj = obj2;
                z11 = true;
                kVar2.L(-1583679630);
                kVar2.T(false);
                gVar = null;
            }
            pg.n<List<b.c<t2.u>>, List<b.c<eh.q<String, x0.j, Integer, pg.f0>>>> nVar3 = i.f13321a;
            int length = bVar.f27761b.length();
            List<b.c<? extends b.a>> list = bVar.f27760a;
            if (list != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                    b.c<? extends b.a> cVar = list.get(i16);
                    if ((cVar.f27771a instanceof t2.e0) && "androidx.compose.foundation.text.inlineContent".equals(cVar.f27774d)) {
                        z12 = false;
                        if (t2.e.b(0, length, cVar.f27772b, cVar.f27773c)) {
                            z13 = z11;
                            break;
                        }
                    }
                }
                z12 = false;
                z13 = false;
                boolean zF = c1.x.f(bVar);
                if (!z13 || zF) {
                    kVar3 = kVar2;
                    boolean z15 = z12;
                    kVar3.L(-1582650709);
                    z14 = (i14 & 14) != 4 ? z11 : z15;
                    objG = kVar3.g();
                    if (!z14 || objG == obj) {
                        objG = bg.b.h(bVar);
                        kVar3.C(objG);
                    }
                    n1Var = (x0.n1) objG;
                    t2.b bVar2 = (t2.b) n1Var.getValue();
                    f.a aVar = (f.a) kVar3.f(j2.j2.f14782k);
                    zK = kVar3.K(n1Var);
                    objG2 = kVar3.g();
                    if (!zK || objG2 == obj) {
                        objG2 = new s(n1Var);
                        kVar3.C(objG2);
                    }
                    int i17 = i14 << 6;
                    e(dVar, bVar2, lVar, z13, map, l0Var, i10, z10, i11, i12, aVar, gVar, (eh.l) objG2, kVar3, ((i14 >> 3) & 910) | ((i14 >> 12) & 57344) | ((i14 << 9) & 458752) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), ((i14 >> 21) & 896) | 24576);
                    kVar = kVar3;
                    kVar.T(false);
                } else {
                    kVar2.L(-1583500636);
                    x0.k kVar4 = kVar2;
                    androidx.compose.ui.d dVarG = g(dVar, bVar, l0Var, lVar, i10, z10, i11, i12, (f.a) kVar2.f(j2.j2.f14782k), null, null, gVar, null, null);
                    t1 t1Var = t1.f13598a;
                    int i18 = kVar4.P;
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, kVar4);
                    x0.a2 a2VarP = kVar4.P();
                    i2.g.f13861o.getClass();
                    e0.a aVar2 = g.a.f13863b;
                    kVar4.r();
                    if (kVar4.O) {
                        kVar4.w(aVar2);
                    } else {
                        kVar4.z();
                    }
                    ph.v1.j(g.a.f13867f, t1Var, kVar4);
                    ph.v1.j(g.a.f13866e, a2VarP, kVar4);
                    ph.v1.j(g.a.f13865d, dVarC, kVar4);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (kVar4.O || !kotlin.jvm.internal.r.a(kVar4.g(), Integer.valueOf(i18))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i18, kVar4, i18, c0128a);
                    }
                    kVar4.T(z11);
                    kVar4.T(false);
                    kVar = kVar4;
                }
            } else {
                z12 = false;
                z13 = false;
                boolean zF2 = c1.x.f(bVar);
                if (z13) {
                    kVar3 = kVar2;
                    boolean z152 = z12;
                    kVar3.L(-1582650709);
                    if ((i14 & 14) != 4) {
                    }
                    objG = kVar3.g();
                    if (!z14) {
                        objG = bg.b.h(bVar);
                        kVar3.C(objG);
                        n1Var = (x0.n1) objG;
                        t2.b bVar22 = (t2.b) n1Var.getValue();
                        f.a aVar3 = (f.a) kVar3.f(j2.j2.f14782k);
                        zK = kVar3.K(n1Var);
                        objG2 = kVar3.g();
                        if (!zK) {
                            objG2 = new s(n1Var);
                            kVar3.C(objG2);
                            int i172 = i14 << 6;
                            e(dVar, bVar22, lVar, z13, map, l0Var, i10, z10, i11, i12, aVar3, gVar, (eh.l) objG2, kVar3, ((i14 >> 3) & 910) | ((i14 >> 12) & 57344) | ((i14 << 9) & 458752) | (3670016 & i172) | (29360128 & i172) | (234881024 & i172) | (i172 & 1879048192), ((i14 >> 21) & 896) | 24576);
                            kVar = kVar3;
                            kVar.T(false);
                        }
                    }
                }
            }
        } else {
            kVar = kVarP;
            kVar.v();
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new t(bVar, dVar, l0Var, lVar, i10, z10, i11, i12, map, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, androidx.compose.ui.d dVar, t2.l0 l0Var, int i10, boolean z10, int i11, int i12, x0.j jVar, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        x0.k kVar;
        boolean z11;
        int i20;
        int i21;
        x0.h2 h2VarV;
        x0.k kVar2;
        int i22;
        l0.g gVar;
        androidx.compose.ui.d dVarG;
        x0.k kVarP = jVar.p(-1040751001);
        if ((i13 & 6) == 0) {
            i15 = (kVarP.K(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= kVarP.K(l0Var) ? 256 : 128;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= kVarP.l(null) ? 2048 : 1024;
        }
        int i23 = i14 & 16;
        if (i23 != 0) {
            i15 |= 24576;
        } else {
            if ((i13 & 24576) == 0) {
                i16 = i10;
                i15 |= kVarP.i(i16) ? 16384 : 8192;
            }
            i17 = i14 & 32;
            if (i17 == 0) {
                i15 |= 196608;
            } else {
                if ((196608 & i13) == 0) {
                    i15 |= kVarP.c(z10) ? 131072 : 65536;
                }
                if ((1572864 & i13) == 0) {
                    i15 |= kVarP.i(i11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i18 = i14 & 128;
                if (i18 == 0) {
                    if ((12582912 & i13) == 0) {
                        i15 |= kVarP.i(i12) ? 8388608 : 4194304;
                    }
                    if ((i14 & 256) == 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        i15 |= kVarP.l(null) ? 67108864 : 33554432;
                    }
                    i19 = i15 | 805306368;
                    if (kVarP.A(i19 & 1, (306783379 & i19) == 306783378)) {
                        kVar = kVarP;
                        kVar.v();
                        z11 = z10;
                        i20 = i16;
                        i21 = i12;
                    } else {
                        int i24 = i23 != 0 ? 1 : i16;
                        z11 = i17 != 0 ? true : z10;
                        i21 = i18 != 0 ? 1 : i12;
                        x1.c(i21, i11);
                        m0.j2 j2Var = (m0.j2) kVarP.f(m0.n2.f17429a);
                        if (j2Var != null) {
                            kVarP.L(-1588802442);
                            long j10 = ((m0.q3) kVarP.f(m0.r3.f17501a)).f17465b;
                            Object[] objArr = {j2Var};
                            g0 g0Var = new g0(j2Var);
                            g1.n nVar = g1.m.f11307a;
                            g1.n nVar2 = new g1.n(g0Var, h0.f13308a);
                            boolean zL = kVarP.l(j2Var);
                            Object objG = kVarP.g();
                            j.a.C0321a c0321a = j.a.f31715a;
                            if (zL || objG == c0321a) {
                                objG = new w(j2Var);
                                kVarP.C(objG);
                            }
                            Object objD = b0.a0.d(objArr, nVar2, (eh.a) objG, kVarP, 0, 4);
                            kVar2 = kVarP;
                            i22 = i24;
                            long jLongValue = ((Number) objD).longValue();
                            boolean zJ = kVar2.j(jLongValue) | kVar2.K(j2Var) | kVar2.j(j10);
                            Object objG2 = kVar2.g();
                            if (zJ || objG2 == c0321a) {
                                objG2 = new l0.g(jLongValue, j2Var, j10);
                                kVar2.C(objG2);
                            }
                            kVar2.T(false);
                            gVar = (l0.g) objG2;
                        } else {
                            kVar2 = kVarP;
                            i22 = i24;
                            kVar2.L(-1588311278);
                            kVar2.T(false);
                            gVar = null;
                        }
                        if (gVar == null) {
                            kVar2.L(-1587511974);
                            i20 = i22;
                            dVarG = dVar.h(new TextStringSimpleElement(str, l0Var, (f.a) kVar2.f(j2.j2.f14782k), i20, z11, i11, i21, null));
                            kVar2.T(false);
                            kVar = kVar2;
                        } else {
                            i20 = i22;
                            kVar2.L(-1588155131);
                            kVar = kVar2;
                            dVarG = g(dVar, new t2.b(str), l0Var, null, i20, z11, i11, i21, (f.a) kVar2.f(j2.j2.f14782k), null, null, gVar, null, null);
                            kVar.T(false);
                        }
                        t1 t1Var = t1.f13598a;
                        int i25 = kVar.P;
                        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, kVar);
                        x0.a2 a2VarP = kVar.P();
                        i2.g.f13861o.getClass();
                        e0.a aVar = g.a.f13863b;
                        kVar.r();
                        if (kVar.O) {
                            kVar.w(aVar);
                        } else {
                            kVar.z();
                        }
                        ph.v1.j(g.a.f13867f, t1Var, kVar);
                        ph.v1.j(g.a.f13866e, a2VarP, kVar);
                        ph.v1.j(g.a.f13865d, dVarC, kVar);
                        g.a.C0128a c0128a = g.a.f13868g;
                        if (kVar.O || !kotlin.jvm.internal.r.a(kVar.g(), Integer.valueOf(i25))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(i25, kVar, i25, c0128a);
                        }
                        kVar.T(true);
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new r(str, dVar, l0Var, i20, z11, i11, i21, i13, i14);
                        return;
                    }
                    return;
                }
                i15 |= 12582912;
                if ((i14 & 256) == 0) {
                }
                i19 = i15 | 805306368;
                if (kVarP.A(i19 & 1, (306783379 & i19) == 306783378)) {
                }
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            }
            if ((1572864 & i13) == 0) {
            }
            i18 = i14 & 128;
            if (i18 == 0) {
            }
            if ((i14 & 256) == 0) {
            }
            i19 = i15 | 805306368;
            if (kVarP.A(i19 & 1, (306783379 & i19) == 306783378)) {
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        }
        i16 = i10;
        i17 = i14 & 32;
        if (i17 == 0) {
        }
        if ((1572864 & i13) == 0) {
        }
        i18 = i14 & 128;
        if (i18 == 0) {
        }
        if ((i14 & 256) == 0) {
        }
        i19 = i15 | 805306368;
        if (kVarP.A(i19 & 1, (306783379 & i19) == 306783378)) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    @pg.d
    public static final void c(t2.b bVar, androidx.compose.ui.d dVar, t2.l0 l0Var, eh.l lVar, int i10, boolean z10, int i11, int i12, Map map, x0.j jVar, int i13) {
        int i14;
        x0.k kVar;
        x0.k kVarP = jVar.p(-1064305212);
        if ((i13 & 6) == 0) {
            i14 = (kVarP.K(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= kVarP.K(l0Var) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= kVarP.l(lVar) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= kVarP.i(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= kVarP.c(z10) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= kVarP.i(i11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i13) == 0) {
            i14 |= kVarP.i(i12) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= kVarP.l(map) ? 67108864 : 33554432;
        }
        int i15 = i14 | 805306368;
        if (kVarP.A(i15 & 1, (306783379 & i15) != 306783378)) {
            kVar = kVarP;
            a(bVar, dVar, l0Var, lVar, i10, z10, i11, i12, map, kVar, i15 & 2147483646);
        } else {
            kVar = kVarP;
            kVar.v();
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new v(bVar, dVar, l0Var, lVar, i10, z10, i11, i12, map, i13);
        }
    }

    @pg.d
    public static final void d(String str, androidx.compose.ui.d dVar, t2.l0 l0Var, int i10, boolean z10, int i11, int i12, x0.j jVar, int i13) {
        int i14;
        x0.k kVar;
        x0.k kVarP = jVar.p(-1186827822);
        if ((i13 & 6) == 0) {
            i14 = (kVarP.K(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= kVarP.K(l0Var) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= kVarP.l(null) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= kVarP.i(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= kVarP.c(z10) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= kVarP.i(i11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i13) == 0) {
            i14 |= kVarP.i(i12) ? 8388608 : 4194304;
        }
        int i15 = i14 | 100663296;
        if (kVarP.A(i15 & 1, (38347923 & i15) != 38347922)) {
            kVar = kVarP;
            b(str, dVar, l0Var, i10, z10, i11, i12, kVar, i15 & 268435454, 512);
        } else {
            kVar = kVarP;
            kVar.v();
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new u(str, dVar, l0Var, i10, z10, i11, i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0203  */
    /* JADX WARN: Type inference failed for: r0v1, types: [x0.j, x0.k] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [i0.n4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, x0.n1] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r9v30, types: [qg.z] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(androidx.compose.ui.d dVar, t2.b bVar, eh.l lVar, boolean z10, Map map, t2.l0 l0Var, int i10, boolean z11, int i11, int i12, f.a aVar, l0.g gVar, eh.l lVar2, x0.j jVar, int i13, int i14) {
        int i15;
        int i16;
        ?? r12;
        eh.a aVar2;
        eh.a aVar3;
        pg.n<List<b.c<t2.u>>, List<b.c<eh.q<String, x0.j, Integer, pg.f0>>>> nVar;
        eh.l lVar3;
        ?? r72;
        Object u4Var;
        boolean z12;
        ?? arrayList;
        int i17;
        Map map2 = map;
        ?? P = jVar.p(-2118572703);
        if ((i13 & 6) == 0) {
            i15 = (P.K(dVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= P.K(bVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= P.l(lVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= P.c(z10) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= P.l(map2) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= P.K(l0Var) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= P.i(i10) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= P.c(z11) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= P.i(i11) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= P.i(i12) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (P.l(aVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= P.l(gVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= P.l(null) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= P.l(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= (i14 & 32768) == 0 ? P.K(null) : P.l(null) ? 16384 : 8192;
        }
        if (P.A(i15 & 1, ((i15 & 306783379) == 306783378 && (i16 & 9363) == 9362) ? false : true)) {
            boolean zF = c1.x.f(bVar);
            Object obj = j.a.f31715a;
            if (zF) {
                P.L(-613484007);
                boolean z13 = (i15 & 112) == 32;
                Object objG = P.g();
                if (z13 || objG == obj) {
                    objG = new n4(bVar);
                    P.C(objG);
                }
                P.T(false);
                r12 = (n4) objG;
            } else {
                P.L(-613418350);
                P.T(false);
                r12 = 0;
            }
            if (c1.x.f(bVar)) {
                P.L(-613220135);
                boolean zK = ((i15 & 112) == 32) | P.K(r12);
                Object objG2 = P.g();
                if (zK || objG2 == obj) {
                    objG2 = new e0(r12, bVar);
                    P.C(objG2);
                }
                aVar2 = (eh.a) objG2;
                P.T(false);
            } else {
                P.L(-613122857);
                boolean z14 = (i15 & 112) == 32;
                Object objG3 = P.g();
                if (z14 || objG3 == obj) {
                    objG3 = new f0(bVar);
                    P.C(objG3);
                }
                aVar2 = (eh.a) objG3;
                P.T(false);
            }
            if (!z10) {
                aVar3 = aVar2;
                lVar3 = null;
                nVar = new pg.n<>(null, null);
            } else if (map2 != null) {
                pg.n<List<b.c<t2.u>>, List<b.c<eh.q<String, x0.j, Integer, pg.f0>>>> nVar2 = i.f13321a;
                if (map2.isEmpty()) {
                    aVar3 = aVar2;
                    nVar = i.f13321a;
                } else {
                    int length = bVar.f27761b.length();
                    aVar3 = aVar2;
                    List<b.c<? extends b.a>> list = bVar.f27760a;
                    if (list != null) {
                        arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i18 = 0;
                        while (i18 < size) {
                            List<b.c<? extends b.a>> list2 = list;
                            b.c<? extends b.a> cVar = list.get(i18);
                            int i19 = size;
                            Object obj2 = cVar.f27771a;
                            int i20 = i18;
                            int i21 = cVar.f27773c;
                            int i22 = cVar.f27772b;
                            String str = cVar.f27774d;
                            if ((obj2 instanceof t2.e0) && "androidx.compose.foundation.text.inlineContent".equals(str) && t2.e.b(0, length, i22, i21)) {
                                Object obj3 = cVar.f27771a;
                                i17 = length;
                                kotlin.jvm.internal.r.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                arrayList.add(new b.c(((t2.e0) obj3).f27798a, i22, i21, str));
                            } else {
                                i17 = length;
                            }
                            i18 = i20 + 1;
                            size = i19;
                            list = list2;
                            length = i17;
                        }
                    } else {
                        arrayList = qg.z.f22752a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList.size();
                    int i23 = 0;
                    List list3 = arrayList;
                    while (i23 < size2) {
                        b.c cVar2 = (b.c) list3.get(i23);
                        Object obj4 = cVar2.f27771a;
                        List list4 = list3;
                        int i24 = cVar2.f27773c;
                        int i25 = cVar2.f27772b;
                        if (((z1) map2.get(obj4)) != null) {
                            arrayList2.add(new b.c(null, i25, i24));
                            arrayList3.add(new b.c(null, i25, i24));
                        }
                        i23++;
                        map2 = map;
                        list3 = list4;
                    }
                    nVar = new pg.n<>(arrayList2, arrayList3);
                }
                lVar3 = null;
            }
            List<b.c<t2.u>> list5 = nVar.f21469a;
            List<b.c<eh.q<String, x0.j, Integer, pg.f0>>> list6 = nVar.f21470b;
            if (z10) {
                P.L(-612806750);
                Object objG4 = P.g();
                if (objG4 == obj) {
                    objG4 = bg.b.h(lVar3);
                    P.C(objG4);
                }
                P.T(false);
                r72 = (x0.n1) objG4;
            } else {
                P.L(-612718990);
                P.T(false);
                r72 = lVar3;
            }
            if (z10) {
                P.L(-612625741);
                boolean zK2 = P.K(r72);
                Object objG5 = P.g();
                if (zK2 || objG5 == obj) {
                    objG5 = new d0(r72);
                    P.C(objG5);
                }
                lVar3 = (eh.l) objG5;
                P.T(false);
            } else {
                P.L(-612554318);
                P.T(false);
            }
            eh.l lVar4 = lVar3;
            t2.b bVar2 = (t2.b) aVar3.invoke();
            boolean zL = P.l(r12) | ((i15 & 896) == 256);
            Object objG6 = P.g();
            if (zL || objG6 == obj) {
                objG6 = new y(r12, lVar);
                P.C(objG6);
            }
            androidx.compose.ui.d dVarG = g(dVar, bVar2, l0Var, (eh.l) objG6, i10, z11, i11, i12, aVar, list5, lVar4, gVar, null, lVar2);
            if (z10) {
                P.L(-611365560);
                boolean zL2 = P.l(r12);
                Object objG7 = P.g();
                if (zL2 || objG7 == obj) {
                    objG7 = new a0(r12);
                    P.C(objG7);
                }
                eh.a aVar4 = (eh.a) objG7;
                boolean zK3 = P.K(r72);
                Object objG8 = P.g();
                if (zK3 || objG8 == obj) {
                    objG8 = new b0(r72);
                    P.C(objG8);
                }
                u4Var = new u4(aVar4, (eh.a) objG8);
                P.T(false);
            } else {
                P.L(-611542291);
                boolean zL3 = P.l(r12);
                Object objG9 = P.g();
                if (zL3 || objG9 == obj) {
                    objG9 = new z(r12);
                    P.C(objG9);
                }
                u4Var = new l2((eh.a) objG9);
                P.T(false);
            }
            int i26 = P.P;
            x0.a2 a2VarP = P.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, P);
            i2.g.f13861o.getClass();
            e0.a aVar5 = g.a.f13863b;
            P.r();
            if (P.O) {
                P.w(aVar5);
            } else {
                P.z();
            }
            ph.v1.j(g.a.f13867f, u4Var, P);
            ph.v1.j(g.a.f13866e, a2VarP, P);
            g.a.C0128a c0128a = g.a.f13868g;
            if (P.O || !kotlin.jvm.internal.r.a(P.g(), Integer.valueOf(i26))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i26, P, i26, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, P);
            if (r12 == 0) {
                P.L(-509592027);
                z12 = false;
                P.T(false);
            } else {
                z12 = false;
                P.L(537750876);
                r12.a(0, P);
                P.T(false);
                pg.f0 f0Var = pg.f0.f21461a;
            }
            if (list6 == null) {
                P.L(-509541249);
            } else {
                P.L(-509541248);
                i.a(bVar, list6, P, (i15 >> 3) & 14);
                pg.f0 f0Var2 = pg.f0.f21461a;
            }
            P.T(z12);
            P.T(true);
        } else {
            P.v();
        }
        x0.h2 h2VarV = P.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c0(dVar, bVar, lVar, z10, map, l0Var, i10, z11, i11, i12, aVar, gVar, lVar2, i13, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList f(List list, eh.a aVar) {
        w4 w4Var;
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2.k0 k0Var = (g2.k0) list.get(i10);
            Object objW = k0Var.w();
            kotlin.jvm.internal.r.c(objW, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            m4 m4Var = ((x4) objW).f13680b;
            n4 n4Var = m4Var.f13436a;
            b.c cVar = m4Var.f13437b;
            t2.h0 h0Var = (t2.h0) n4Var.f13448a.getValue();
            if (h0Var == null) {
                w4Var = new w4(0, 0, s4.f13576a);
            } else {
                b.c cVarC = n4.c(cVar, h0Var);
                if (cVarC == null) {
                    w4Var = new w4(0, 0, t4.f13605a);
                } else {
                    f3.n nVarD = f3.o.d(h0Var.i(cVarC.f27772b, cVarC.f27773c).getBounds());
                    w4Var = new w4(nVarD.d(), nVarD.b(), new r4(nVarD));
                }
            }
            int i11 = w4Var.f13668a;
            int i12 = w4Var.f13669b;
            arrayList.add(new pg.n(k0Var.P(b.a.b(i11, i11, i12, i12)), w4Var.f13670c));
        }
        return arrayList;
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, t2.b bVar, t2.l0 l0Var, eh.l lVar, int i10, boolean z10, int i11, int i12, f.a aVar, List list, eh.l lVar2, l0.g gVar, q1.e1 e1Var, eh.l lVar3) {
        if (gVar == null) {
            return dVar.h(d.a.f1143b).h(new TextAnnotatedStringElement(bVar, l0Var, aVar, lVar, i10, z10, i11, i12, list, lVar2, e1Var, lVar3));
        }
        return dVar.h(gVar.f16614f).h(new SelectableTextAnnotatedStringElement(bVar, l0Var, aVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, e1Var));
    }
}
