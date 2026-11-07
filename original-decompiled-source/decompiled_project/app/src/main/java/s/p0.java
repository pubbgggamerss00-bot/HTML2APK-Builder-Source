package s;

import s.l0;
import s.l0.a;
import x0.j;

/* loaded from: classes.dex */
public final class p0 {
    public static final l0.a a(l0 l0Var, float f10, float f11, k0 k0Var, String str, x0.j jVar, int i10, int i11) {
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        Float fValueOf = Float.valueOf(f10);
        Float fValueOf2 = Float.valueOf(f11);
        int i12 = i10 << 3;
        return b(l0Var, fValueOf, fValueOf2, p2.f23868a, k0Var, str, jVar, (i10 & 1022) | (57344 & i12) | (i12 & 458752), 0);
    }

    public static final l0.a b(l0 l0Var, Number number, Number number2, o2 o2Var, k0 k0Var, String str, x0.j jVar, int i10, int i11) {
        l0 l0Var2;
        Number number3;
        Number number4;
        k0 k0Var2;
        Object objG = jVar.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            l0Var2 = l0Var;
            number3 = number;
            number4 = number2;
            k0Var2 = k0Var;
            l0.a aVar = l0Var2.new a(number3, number4, o2Var, k0Var2);
            jVar.C(aVar);
            objG = aVar;
        } else {
            l0Var2 = l0Var;
            number3 = number;
            number4 = number2;
            k0Var2 = k0Var;
        }
        l0.a aVar2 = (l0.a) objG;
        boolean z10 = ((((i10 & 112) ^ 48) > 32 && jVar.l(number3)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && jVar.l(number4)) || (i10 & 384) == 256) | ((((57344 & i10) ^ 24576) > 16384 && jVar.l(k0Var2)) || (i10 & 24576) == 16384);
        Object objG2 = jVar.g();
        if (z10 || objG2 == c0321a) {
            objG2 = new m0(number3, aVar2, number4, k0Var2);
            jVar.C(objG2);
        }
        x0.l0 l0Var3 = x0.o0.f31834a;
        jVar.u((eh.a) objG2);
        boolean zL = jVar.l(l0Var2);
        Object objG3 = jVar.g();
        if (zL || objG3 == c0321a) {
            objG3 = new o0(l0Var2, aVar2);
            jVar.C(objG3);
        }
        x0.o0.a(aVar2, (eh.l) objG3, jVar);
        return aVar2;
    }

    public static final l0 c(String str, x0.j jVar, int i10) {
        Object objG = jVar.g();
        if (objG == j.a.f31715a) {
            objG = new l0();
            jVar.C(objG);
        }
        l0 l0Var = (l0) objG;
        l0Var.a(0, jVar);
        return l0Var;
    }
}
