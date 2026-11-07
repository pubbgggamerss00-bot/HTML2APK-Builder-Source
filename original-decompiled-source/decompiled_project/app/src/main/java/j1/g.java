package j1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class g extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(h.f14623a);
        return this;
    }
}
