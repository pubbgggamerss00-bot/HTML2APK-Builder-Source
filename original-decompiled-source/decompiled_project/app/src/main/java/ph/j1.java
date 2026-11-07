package ph;

import java.io.Closeable;
import java.util.concurrent.Executor;
import ph.g0;

/* loaded from: classes2.dex */
public abstract class j1 extends g0 implements Closeable, AutoCloseable {
    static {
        g0.a baseKey = g0.f21535b;
        kotlin.jvm.internal.r.e(baseKey, "baseKey");
    }

    public abstract Executor H0();
}
