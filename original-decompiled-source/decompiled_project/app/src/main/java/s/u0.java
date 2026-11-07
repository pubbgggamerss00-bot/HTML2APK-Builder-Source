package s;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class u0 extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
