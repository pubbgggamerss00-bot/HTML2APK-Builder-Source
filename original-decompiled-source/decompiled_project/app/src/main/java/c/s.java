package c;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.t;
import b.d0;
import pg.f0;
import ph.i0;
import x0.c0;
import x0.h2;
import x0.j;
import x0.l0;
import x0.n1;
import x0.o0;
import x0.w2;

/* loaded from: classes.dex */
public final class s {
    public static final void a(boolean z10, eh.p pVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(-642000585);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            n1 n1VarK = bg.b.k(pVar, kVarP);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                l0 l0Var = o0.f31834a;
                objG = new c0(new w2(kVarP.x()));
                kVarP.C(objG);
            }
            i0 i0Var = ((c0) objG).f31626a;
            Object objG2 = kVarP.g();
            Object obj = objG2;
            if (objG2 == c0321a) {
                eh.p<? super sh.f<b.c>, ? super tg.e<? super f0>, ? extends Object> pVar2 = (eh.p) n1VarK.getValue();
                n nVar = new n(z10);
                nVar.f4322d = i0Var;
                nVar.f4323e = pVar2;
                kVarP.C(nVar);
                obj = nVar;
            }
            n nVar2 = (n) obj;
            boolean zK = kVarP.K((eh.p) n1VarK.getValue()) | kVarP.K(i0Var);
            Object objG3 = kVarP.g();
            if (zK || objG3 == c0321a) {
                nVar2.f4323e = (eh.p) n1VarK.getValue();
                nVar2.f4322d = i0Var;
                kVarP.C(f0.f21461a);
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            boolean zL = ((i11 & 14) == 4) | kVarP.l(nVar2);
            Object objG4 = kVarP.g();
            if (zL || objG4 == c0321a) {
                objG4 = new o(nVar2, z10, null);
                kVarP.C(objG4);
            }
            o0.d((eh.p) objG4, boolValueOf, kVarP);
            b.i0 i0VarA = j.a(kVarP);
            if (i0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            d0 onBackPressedDispatcher = i0VarA.getOnBackPressedDispatcher();
            t tVar = (t) kVarP.f(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zL2 = kVarP.l(onBackPressedDispatcher) | kVarP.l(tVar) | kVarP.l(nVar2);
            Object objG5 = kVarP.g();
            if (zL2 || objG5 == c0321a) {
                objG5 = new q(onBackPressedDispatcher, tVar, nVar2);
                kVarP.C(objG5);
            }
            o0.b(tVar, onBackPressedDispatcher, (eh.l) objG5, kVarP);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new r(z10, pVar, i10);
        }
    }
}
