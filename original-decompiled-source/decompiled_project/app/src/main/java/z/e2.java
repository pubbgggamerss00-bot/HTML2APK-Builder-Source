package z;

import android.view.View;
import java.util.WeakHashMap;
import x0.j;
import z.x1;

/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {
    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(359872873);
        WeakHashMap<View, x1> weakHashMap = x1.f34666v;
        x1 x1VarC = x1.a.c(jVar2);
        boolean zK = jVar2.K(x1VarC);
        Object objG = jVar2.g();
        if (zK || objG == j.a.f31715a) {
            objG = new s0(x1VarC.f34673g);
            jVar2.C(objG);
        }
        s0 s0Var = (s0) objG;
        jVar2.B();
        return s0Var;
    }
}
