package r9;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class o implements t9.b<Executor> {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o f23304a = new o();
    }

    @Override // og.a
    public final Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
