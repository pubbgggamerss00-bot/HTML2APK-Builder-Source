package h5;

import androidx.lifecycle.l;
import androidx.lifecycle.t;
import eh.p;
import java.util.Arrays;
import sh.y0;
import x0.j;
import x0.m3;
import x0.n1;
import x0.o0;

/* loaded from: classes.dex */
public final class b {
    public static final n1 a(y0 y0Var, x0.j jVar) {
        t tVar = (t) jVar.f(k.f12264a);
        l.b bVar = l.b.f2322d;
        Object value = y0Var.getValue();
        l lifecycle = tVar.getLifecycle();
        tg.i iVar = tg.i.f28768a;
        Object[] objArr = {y0Var, lifecycle, bVar, iVar};
        boolean zL = jVar.l(lifecycle) | jVar.i(bVar.ordinal()) | jVar.l(iVar) | jVar.l(y0Var);
        Object objG = jVar.g();
        Object obj = j.a.f31715a;
        if (zL || objG == obj) {
            Object aVar = new a(lifecycle, bVar, iVar, y0Var, null);
            jVar.C(aVar);
            objG = aVar;
        }
        p pVar = (p) objG;
        Object objG2 = jVar.g();
        if (objG2 == obj) {
            objG2 = bg.b.h(value);
            jVar.C(objG2);
        }
        n1 n1Var = (n1) objG2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zL2 = jVar.l(pVar);
        Object objG3 = jVar.g();
        if (zL2 || objG3 == obj) {
            objG3 = new m3(pVar, n1Var, null);
            jVar.C(objG3);
        }
        o0.g(objArrCopyOf, (p) objG3, jVar);
        return n1Var;
    }
}
