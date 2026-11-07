package uh;

/* loaded from: classes2.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient tg.h f29729a;

    public e(tg.h hVar) {
        this.f29729a = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f29729a);
    }
}
