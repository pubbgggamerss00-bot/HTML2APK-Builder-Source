package c2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class v extends CancellationException {
    public v(long j10) {
        super(u.a("Timed out waiting for ", " ms", j10));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(t0.f4698a);
        return this;
    }
}
