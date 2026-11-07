package v;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a0 extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(m1.f29994a);
        return this;
    }
}
