package qc;

import d0.h0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class j extends ci.a {
    public static <V> V I(Future<V> future) throws ExecutionException {
        if (future.isDone()) {
            return (V) q.a(future);
        }
        throw new IllegalStateException(h0.b("Future was expected to be done: %s", future));
    }
}
