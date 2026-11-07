package ph;

import java.util.concurrent.CancellationException;
import ph.s1;

/* loaded from: classes2.dex */
public final class j0 {
    public static final uh.c a(tg.h hVar) {
        if (hVar.get(s1.a.f21589a) == null) {
            hVar = hVar.plus(v1.a());
        }
        return new uh.c(hVar);
    }

    public static final void b(i0 i0Var, CancellationException cancellationException) {
        s1 s1Var = (s1) i0Var.getCoroutineContext().get(s1.a.f21589a);
        if (s1Var != null) {
            s1Var.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + i0Var).toString());
        }
    }

    public static final <R> Object c(eh.p<? super i0, ? super tg.e<? super R>, ? extends Object> pVar, tg.e<? super R> eVar) {
        uh.r rVar = new uh.r(eVar, eVar.getContext());
        Object objB = d0.q1.b(rVar, rVar, pVar);
        ug.a aVar = ug.a.f29706a;
        return objB;
    }

    public static final boolean d(i0 i0Var) {
        s1 s1Var = (s1) i0Var.getCoroutineContext().get(s1.a.f21589a);
        if (s1Var != null) {
            return s1Var.isActive();
        }
        return true;
    }
}
