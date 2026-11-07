package c2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class i0 extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(t0.f4698a);
        return this;
    }
}
