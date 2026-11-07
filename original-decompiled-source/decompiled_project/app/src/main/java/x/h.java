package x;

import x0.j;
import x0.n1;
import x0.o0;

/* loaded from: classes.dex */
public final class h {
    public static final n1 a(l lVar, x0.j jVar, int i10) {
        Object objG = jVar.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = bg.b.h(Boolean.FALSE);
            jVar.C(objG);
        }
        n1 n1Var = (n1) objG;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && jVar.K(lVar)) || (i10 & 6) == 4;
        Object objG2 = jVar.g();
        if (z10 || objG2 == c0321a) {
            objG2 = new g(lVar, n1Var, null);
            jVar.C(objG2);
        }
        o0.d((eh.p) objG2, lVar, jVar);
        return n1Var;
    }
}
