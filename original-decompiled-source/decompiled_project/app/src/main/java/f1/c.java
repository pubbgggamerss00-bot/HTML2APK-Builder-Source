package f1;

import java.util.ArrayList;
import kotlin.jvm.internal.r;
import x0.g2;
import x0.h2;
import x0.j;

/* loaded from: classes.dex */
public final class c {
    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final b b(int i10, pg.f fVar, x0.j jVar) {
        Object objG = jVar.g();
        if (objG == j.a.f31715a) {
            objG = new b(i10, true, fVar);
            jVar.C(objG);
        }
        b bVar = (b) objG;
        if (!r.a(bVar.f8779c, fVar)) {
            boolean z10 = bVar.f8779c == null;
            bVar.f8779c = fVar;
            if (!z10 && bVar.f8778b) {
                g2 g2Var = bVar.f8780d;
                if (g2Var != null) {
                    g2Var.invalidate();
                    bVar.f8780d = null;
                }
                ArrayList arrayList = bVar.f8781e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((g2) arrayList.get(i11)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
        return bVar;
    }

    public static final boolean c(g2 g2Var, g2 g2Var2) {
        if (g2Var == null) {
            return true;
        }
        if (!(g2Var instanceof h2) || !(g2Var2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) g2Var;
        return !h2Var.b() || g2Var.equals(g2Var2) || r.a(h2Var.f31702c, ((h2) g2Var2).f31702c);
    }
}
