package c6;

import b6.w;
import java.util.concurrent.Executor;
import y5.q0;
import y5.u;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends q0 implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public static final b f2234u = new b();

    /* renamed from: v, reason: collision with root package name */
    public static final u f2235v;

    static {
        u iVar = k.f2248u;
        int i6 = w.f2050a;
        if (64 >= i6) {
            i6 = 64;
        }
        int iB = b6.a.b(i6, 12, "kotlinx.coroutines.io.parallelism");
        iVar.getClass();
        if (iB < 1) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(iB, "Expected positive parallelism level, but got ").toString());
        }
        if (iB < j.f2244d) {
            if (iB < 1) {
                throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(iB, "Expected positive parallelism level, but got ").toString());
            }
            iVar = new b6.i(iVar, iB);
        }
        f2235v = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        x(g5.g.s, runnable);
    }

    @Override // y5.u
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // y5.u
    public final void x(g5.f fVar, Runnable runnable) {
        f2235v.x(fVar, runnable);
    }

    @Override // y5.q0
    public final Executor z() {
        return this;
    }
}
