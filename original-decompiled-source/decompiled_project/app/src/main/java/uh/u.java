package uh;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29769a = 0;

    static {
        Object objA;
        Object objA2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objA = vg.a.class.getCanonicalName();
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        if (pg.p.a(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objA2 = u.class.getCanonicalName();
        } catch (Throwable th3) {
            objA2 = pg.q.a(th3);
        }
        if (pg.p.a(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
