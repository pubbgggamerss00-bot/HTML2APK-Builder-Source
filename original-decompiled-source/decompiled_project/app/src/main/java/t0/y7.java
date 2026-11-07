package t0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import x0.j;
import x0.k;

/* loaded from: classes.dex */
public final class y7 {
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(eh.a aVar, q7 q7Var, s.b bVar, f1.b bVar2, x0.j jVar, int i10) {
        int i11;
        j.a.C0321a c0321a;
        f3.r rVar;
        x0.k kVar;
        Object obj;
        j.a.C0321a c0321a2;
        boolean zL;
        Object objG;
        x0.k kVar2;
        x0.k kVarP = jVar.p(1254951810);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(q7Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? kVarP.K(bVar) : kVarP.l(bVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(bVar2) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            kVar2 = kVarP;
        } else {
            View view = (View) kVarP.f(AndroidCompositionLocals_androidKt.f1285f);
            f3.d dVar = (f3.d) kVarP.f(j2.j2.f14779h);
            f3.r rVar2 = (f3.r) kVarP.f(j2.j2.f14785n);
            k.b bVarE = kVarP.E();
            x0.n1 n1VarK = bg.b.k(bVar2, kVarP);
            UUID uuid = (UUID) b0.a0.d(new Object[0], null, x7.f27380a, kVarP, 3072, 6);
            Object objG2 = kVarP.g();
            j.a.C0321a c0321a3 = j.a.f31715a;
            if (objG2 == c0321a3) {
                x0.l0 l0Var = x0.o0.f31834a;
                objG2 = new x0.c0(new x0.w2(kVarP.x()));
                kVarP.C(objG2);
            }
            ph.i0 i0Var = ((x0.c0) objG2).f31626a;
            boolean zB = h6.a.b(kVarP);
            boolean zK = kVarP.K(view) | kVarP.K(dVar);
            Object objG3 = kVarP.g();
            if (zK || objG3 == c0321a3) {
                x0.k kVar3 = kVarP;
                c0321a = c0321a3;
                rVar = rVar2;
                e6 e6Var = new e6(aVar, q7Var, view, rVar, dVar, uuid, bVar, i0Var, zB);
                f1.b bVar3 = new f1.b(-1560960657, true, new w7(n1VarK));
                d6 d6Var = e6Var.f25803g;
                d6Var.setParentCompositionContext(bVarE);
                d6Var.f25654n.setValue(bVar3);
                d6Var.f25656q = true;
                d6Var.d();
                kVar3.C(e6Var);
                obj = e6Var;
                kVar = kVar3;
            } else {
                kVar = kVarP;
                c0321a = c0321a3;
                rVar = rVar2;
                obj = objG3;
            }
            e6 e6Var2 = (e6) obj;
            boolean zL2 = kVar.l(e6Var2);
            Object objG4 = kVar.g();
            if (zL2) {
                c0321a2 = c0321a;
            } else {
                c0321a2 = c0321a;
                if (objG4 == c0321a2) {
                }
                x0.o0.a(e6Var2, (eh.l) objG4, kVar);
                zL = kVar.l(e6Var2) | ((i12 & 14) != 4) | ((i12 & 112) != 32) | kVar.K(rVar);
                objG = kVar.g();
                if (!zL || objG == c0321a2) {
                    objG = new t7(e6Var2, aVar, q7Var, rVar);
                    kVar.C(objG);
                }
                kVar.u((eh.a) objG);
                kVar2 = kVar;
            }
            objG4 = new s7(e6Var2);
            kVar.C(objG4);
            x0.o0.a(e6Var2, (eh.l) objG4, kVar);
            zL = kVar.l(e6Var2) | ((i12 & 14) != 4) | ((i12 & 112) != 32) | kVar.K(rVar);
            objG = kVar.g();
            if (!zL) {
                objG = new t7(e6Var2, aVar, q7Var, rVar);
                kVar.C(objG);
                kVar.u((eh.a) objG);
                kVar2 = kVar;
            }
        }
        x0.h2 h2VarV = kVar2.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new u7(aVar, q7Var, bVar, bVar2, i10);
        }
    }
}
