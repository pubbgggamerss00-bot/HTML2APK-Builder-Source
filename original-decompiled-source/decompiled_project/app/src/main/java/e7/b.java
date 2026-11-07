package e7;

import d7.s;
import e7.c;
import ph.g0;

/* loaded from: classes.dex */
public interface b {
    default g0 a() {
        return bg.b.g(c());
    }

    c.a b();

    s c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
