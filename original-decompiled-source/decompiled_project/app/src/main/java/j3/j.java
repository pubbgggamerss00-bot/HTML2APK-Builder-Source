package j3;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i2.e0;
import i2.g;
import j2.j2;
import java.util.UUID;
import ph.v1;
import x0.a2;
import x0.h2;
import x0.j;
import x0.k;
import x0.n1;

/* loaded from: classes.dex */
public final class j {
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(eh.a aVar, d0 d0Var, f1.b bVar, x0.j jVar, int i10, int i11) {
        int i12;
        d0 d0Var2;
        d0 d0Var3;
        h2 h2VarV;
        int i13;
        int i14;
        f3.r rVar;
        x0.k kVarP = jVar.p(-2032877254);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                d0Var2 = d0Var;
                i12 |= kVarP.K(d0Var2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i12 |= kVarP.l(bVar) ? 256 : 128;
            }
            if (kVarP.A(i12 & 1, (i12 & 147) == 146)) {
                kVarP.v();
                d0Var3 = d0Var2;
            } else {
                d0Var3 = i15 != 0 ? new d0(7) : d0Var2;
                View view = (View) kVarP.f(AndroidCompositionLocals_androidKt.f1285f);
                f3.d dVar = (f3.d) kVarP.f(j2.f14779h);
                f3.r rVar2 = (f3.r) kVarP.f(j2.f14785n);
                k.b bVarE = kVarP.E();
                n1 n1VarK = bg.b.k(bVar, kVarP);
                UUID uuid = (UUID) b0.a0.d(new Object[0], null, g.f15057a, kVarP, 3072, 6);
                boolean zK = kVarP.K(view) | kVarP.K(dVar);
                Object objG = kVarP.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (zK || objG == c0321a) {
                    i13 = i12;
                    i14 = 32;
                    rVar = rVar2;
                    e0 e0Var = new e0(aVar, d0Var3, view, rVar, dVar, uuid);
                    f1.b bVar2 = new f1.b(488261145, true, new f(n1VarK));
                    c0 c0Var = e0Var.f15054g;
                    c0Var.setParentCompositionContext(bVarE);
                    c0Var.f15034k.setValue(bVar2);
                    c0Var.f15038p = true;
                    c0Var.d();
                    kVarP.C(e0Var);
                    objG = e0Var;
                } else {
                    i13 = i12;
                    i14 = 32;
                    rVar = rVar2;
                }
                e0 e0Var2 = (e0) objG;
                boolean zL = kVarP.l(e0Var2);
                Object objG2 = kVarP.g();
                if (zL || objG2 == c0321a) {
                    objG2 = new b(e0Var2, 0);
                    kVarP.C(objG2);
                }
                x0.o0.a(e0Var2, (eh.l) objG2, kVarP);
                boolean zL2 = kVarP.l(e0Var2) | ((i13 & 14) == 4) | ((i13 & 112) == i14) | kVarP.K(rVar);
                Object objG3 = kVarP.g();
                if (zL2 || objG3 == c0321a) {
                    objG3 = new c(e0Var2, aVar, d0Var3, rVar);
                    kVarP.C(objG3);
                }
                kVarP.u((eh.a) objG3);
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new d(aVar, d0Var3, bVar, i10, i11);
                return;
            }
            return;
        }
        i12 |= 48;
        d0Var2 = d0Var;
        if ((i10 & 384) == 0) {
        }
        if (kVarP.A(i12 & 1, (i12 & 147) == 146)) {
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void b(androidx.compose.ui.d dVar, eh.p pVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(-1177876616);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(pVar) ? 32 : 16;
        }
        if (kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            int i12 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            int i13 = (((((i11 << 3) & 112) | (((i11 >> 3) & 14) | 384)) << 6) & 896) | 6;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, h.f15079a, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVarP);
            pVar.invoke(kVarP, Integer.valueOf((i13 >> 6) & 14));
            kVarP.T(true);
        } else {
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new i(dVar, pVar, i10);
        }
    }
}
