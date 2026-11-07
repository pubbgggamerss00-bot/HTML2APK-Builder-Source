package i2;

import java.util.ArrayList;
import z0.b;

/* loaded from: classes.dex */
public final class z0 {
    public static final ArrayList a(g2.q qVar) {
        kotlin.jvm.internal.r.c(qVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        e0 e0VarK1 = ((y0) qVar).k1();
        boolean zB = b(e0VarK1);
        b.a aVar = (b.a) e0VarK1.B();
        z0.b<T> bVar = aVar.f34703a;
        ArrayList arrayList = new ArrayList(bVar.f34702c);
        int i10 = bVar.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var = (e0) aVar.get(i11);
            arrayList.add(zB ? e0Var.v() : e0Var.w());
        }
        return arrayList;
    }

    public static final boolean b(e0 e0Var) {
        int iOrdinal = e0Var.K.f13917d.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new pg.l();
                }
                e0 e0VarG = e0Var.G();
                if (e0VarG != null) {
                    return b(e0VarG);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }
}
