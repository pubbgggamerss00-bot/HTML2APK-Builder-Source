package t0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;
import z.x1;

/* loaded from: classes.dex */
public abstract class a3 {
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z10, eh.a aVar, androidx.compose.ui.d dVar, t.u1 u1Var, boolean z11, q1.f2 f2Var, long j10, float f10, float f11, t.v vVar, f1.b bVar, x0.j jVar, int i10, int i11) {
        int i12;
        q1.f2 f2Var2;
        long j11;
        float f12;
        float f13;
        t.v vVar2;
        int i13;
        int i14;
        t.u1 u1VarC;
        androidx.compose.ui.d dVar2;
        boolean z12;
        int i15;
        s.s0 s0Var;
        androidx.compose.ui.d dVar3;
        boolean z13;
        t.u1 u1Var2;
        x0.k kVarP = jVar.p(720925481);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.l(aVar) ? 32 : 16;
        }
        int i16 = i12 | 384;
        if ((i10 & 3072) == 0) {
            i16 = i12 | 1408;
        }
        int i17 = i16 | 24576;
        if ((196608 & i10) == 0) {
            f2Var2 = f2Var;
            i17 |= kVarP.K(f2Var2) ? 131072 : 65536;
        } else {
            f2Var2 = f2Var;
        }
        if ((1572864 & i10) == 0) {
            j11 = j10;
            i17 |= kVarP.j(j11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            j11 = j10;
        }
        if ((12582912 & i10) == 0) {
            f12 = f10;
            i17 |= kVarP.h(f12) ? 8388608 : 4194304;
        } else {
            f12 = f10;
        }
        if ((100663296 & i10) == 0) {
            f13 = f11;
            i17 |= kVarP.h(f13) ? 67108864 : 33554432;
        } else {
            f13 = f11;
        }
        if ((805306368 & i10) == 0) {
            vVar2 = vVar;
            i17 |= kVarP.K(vVar2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            vVar2 = vVar;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (kVarP.l(bVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= kVarP.K(this) ? 32 : 16;
        }
        if ((306783379 & i17) == 306783378 && (i13 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            dVar3 = dVar;
            u1Var2 = u1Var;
            z13 = z11;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                i14 = i17 & (-7169);
                u1VarC = ph.m0.c(kVarP);
                dVar2 = d.a.f1143b;
                z12 = true;
            } else {
                kVarP.v();
                i14 = i17 & (-7169);
                dVar2 = dVar;
                u1VarC = u1Var;
                z12 = z11;
            }
            kVarP.U();
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                i15 = i14;
                x0.x1 x1Var = new x0.x1(pg.f0.f21461a, x0.q1.f31878a);
                kVarP.C(x1Var);
                objG = x1Var;
            } else {
                i15 = i14;
            }
            x0.n1 n1Var = (x0.n1) objG;
            View view = (View) kVarP.f(AndroidCompositionLocals_androidKt.f1285f);
            f3.d dVar4 = (f3.d) kVarP.f(j2.j2.f14779h);
            WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
            int i18 = x1.a.c(kVarP).f34672f.e().f23164b;
            kVarP.L(321499814);
            if (z10) {
                Object objG2 = kVarP.g();
                if (objG2 == c0321a) {
                    objG2 = new w2(n1Var);
                    kVarP.C(objG2);
                }
                o3.b(view, dVar4, (eh.a) objG2, kVarP, 384);
            }
            kVarP.T(false);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = new s.s0(Boolean.FALSE);
                kVarP.C(objG3);
            }
            s.s0 s0Var2 = (s.s0) objG3;
            s0Var2.f23917c.setValue(Boolean.valueOf(z10));
            if (((Boolean) s0Var2.f23916b.getValue()).booleanValue() || ((Boolean) s0Var2.f23917c.getValue()).booleanValue()) {
                Object objG4 = kVarP.g();
                if (objG4 == c0321a) {
                    s0Var = s0Var2;
                    objG4 = bg.b.h(new q1.l2(q1.l2.f21718b));
                    kVarP.C(objG4);
                } else {
                    s0Var = s0Var2;
                }
                x0.n1 n1Var2 = (x0.n1) objG4;
                boolean zK = kVarP.K(dVar4) | kVarP.i(i18);
                Object objG5 = kVarP.g();
                if (zK || objG5 == c0321a) {
                    objG5 = new e3(dVar4, i18, n1Var, new z2(n1Var2));
                    kVarP.C(objG5);
                }
                e3 e3Var = (e3) objG5;
                d3 d3Var = d3.f25640a;
                String strC = c();
                Object systemService = ((Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b)).getSystemService("accessibility");
                kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
                boolean zC = kVarP.c(true) | kVarP.c(true);
                Object objG6 = kVarP.g();
                if (zC || objG6 == c0321a) {
                    objG6 = new u0.l0();
                    kVarP.C(objG6);
                }
                u0.l0 l0Var = (u0.l0) objG6;
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) kVarP.f(h5.k.f12264a);
                boolean zK2 = kVarP.K(l0Var) | kVarP.l(accessibilityManager);
                Object objG7 = kVarP.g();
                if (zK2 || objG7 == c0321a) {
                    objG7 = new u0.e(l0Var, accessibilityManager);
                    kVarP.C(objG7);
                }
                eh.l lVar = (eh.l) objG7;
                boolean zK3 = kVarP.K(l0Var) | kVarP.l(accessibilityManager);
                Object objG8 = kVarP.g();
                if (zK3 || objG8 == c0321a) {
                    objG8 = new u0.f(l0Var, accessibilityManager);
                    kVarP.C(objG8);
                }
                u0.g.a(tVar, lVar, (eh.a) objG8, kVarP, 0);
                int i19 = !((Boolean) l0Var.getValue()).booleanValue() ? 393248 : 393216;
                if (kotlin.jvm.internal.r.a(strC, "PrimaryEditable") || (kotlin.jvm.internal.r.a(strC, "SecondaryEditable") && !((Boolean) l0Var.getValue()).booleanValue())) {
                    i19 |= 8;
                }
                j3.k.a(e3Var, aVar, new j3.p0(i19, true), f1.c.b(-1082380263, new x2(this, dVar2, z12, s0Var, n1Var2, u1VarC, f2Var2, j11, f12, f13, vVar2, bVar), kVarP), kVarP, (i15 & 112) | 3072, 0);
            }
            dVar3 = dVar2;
            z13 = z12;
            u1Var2 = u1VarC;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new y2(this, z10, aVar, dVar3, u1Var2, z13, f2Var, j10, f10, f11, vVar, bVar, i10, i11);
        }
    }

    public abstract androidx.compose.ui.d b(androidx.compose.ui.d dVar, boolean z10);

    public abstract String c();

    public abstract androidx.compose.ui.d d(androidx.compose.ui.d dVar, boolean z10);
}
