package pg;

import pg.p;

/* loaded from: classes2.dex */
public final class q {
    public static final p.a a(Throwable exception) {
        kotlin.jvm.internal.r.e(exception, "exception");
        return new p.a(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof p.a) {
            throw ((p.a) obj).f21472a;
        }
    }
}
