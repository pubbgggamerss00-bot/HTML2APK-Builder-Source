package kotlinx.coroutines;

import c9.u1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import ph.v0;
import qg.m;
import tg.h;

/* loaded from: classes2.dex */
public final class a {
    public static final void a(Throwable th2, h hVar) {
        if (th2 instanceof v0) {
            th2 = ((v0) th2).f21596a;
        }
        try {
            if (((CoroutineExceptionHandler) hVar.get(CoroutineExceptionHandler.a.f16343a)) != null) {
                return;
            }
            m.p(th2, hVar);
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                u1.b(runtimeException, th2);
                th2 = runtimeException;
            }
            m.p(th2, hVar);
        }
    }
}
