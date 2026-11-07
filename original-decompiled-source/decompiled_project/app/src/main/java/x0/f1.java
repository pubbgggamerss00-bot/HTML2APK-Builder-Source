package x0;

import x0.d1;

/* loaded from: classes.dex */
public final class f1 {
    public static final d1 a(tg.h hVar) {
        d1 d1Var = (d1) hVar.get(d1.a.f31629a);
        if (d1Var != null) {
            return d1Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(eh.l lVar, vg.i iVar) {
        return a(iVar.getContext()).f0(new e1(lVar), iVar);
    }
}
