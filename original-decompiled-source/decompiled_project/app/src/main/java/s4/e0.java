package s4;

import java.util.concurrent.CancellationException;
import s4.w0;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.s implements eh.p<w0.a<Object>, Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f24217a = new e0(2);

    @Override // eh.p
    public final pg.f0 invoke(w0.a<Object> aVar, Throwable th2) {
        w0.a<Object> msg = aVar;
        Throwable cancellationException = th2;
        kotlin.jvm.internal.r.e(msg, "msg");
        ph.v vVar = msg.f24414b;
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        vVar.d0(cancellationException);
        return pg.f0.f21461a;
    }
}
