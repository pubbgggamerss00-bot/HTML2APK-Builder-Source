package uh;

import ph.o2;
import tg.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements eh.p {
    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        g0 g0Var = (g0) obj;
        h.a aVar = (h.a) obj2;
        if (aVar instanceof o2) {
            o2<Object> o2Var = (o2) aVar;
            Object objN = o2Var.N(g0Var.f29739a);
            Object[] objArr = g0Var.f29740b;
            int i10 = g0Var.f29742d;
            objArr[i10] = objN;
            o2<Object>[] o2VarArr = g0Var.f29741c;
            g0Var.f29742d = i10 + 1;
            o2VarArr[i10] = o2Var;
        }
        return g0Var;
    }
}
