package c2;

import j2.k5;
import v.w1;

/* loaded from: classes.dex */
public interface c extends f3.d {
    Object C1(t tVar, vg.a aVar);

    r M();

    default long R0() {
        return 0L;
    }

    default Object Z(long j10, w1 w1Var, tg.e eVar) {
        return w1Var.invoke(this, eVar);
    }

    long a();

    k5 getViewConfiguration();

    default Object y1(long j10, eh.p pVar, vg.c cVar) {
        return pVar.invoke(this, cVar);
    }
}
