package th;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient Object f28771a;

    public a(sh.g gVar) {
        super("Flow was aborted, no more elements needed");
        this.f28771a = gVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
