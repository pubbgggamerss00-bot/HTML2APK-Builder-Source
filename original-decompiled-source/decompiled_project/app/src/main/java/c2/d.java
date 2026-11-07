package c2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class d extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4612a = new d();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(t0.f4698a);
        return this;
    }
}
