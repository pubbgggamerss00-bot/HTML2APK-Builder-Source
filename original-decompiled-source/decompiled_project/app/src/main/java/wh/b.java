package wh;

import java.util.concurrent.Executor;
import ph.g0;
import ph.j1;
import uh.w;
import uh.x;

/* loaded from: classes2.dex */
public final class b extends j1 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final b f31563c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f31564d;

    static {
        j jVar = j.f31577c;
        int i10 = x.f29772a;
        if (64 >= i10) {
            i10 = 64;
        }
        f31564d = jVar.G0(w.b(i10, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        f31564d.D0(hVar, runnable);
    }

    @Override // ph.g0
    public final void E0(tg.h hVar, Runnable runnable) {
        f31564d.E0(hVar, runnable);
    }

    @Override // ph.g0
    public final g0 G0(int i10) {
        return j.f31577c.G0(i10);
    }

    @Override // ph.j1
    public final Executor H0() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D0(tg.i.f28768a, runnable);
    }

    @Override // ph.g0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
