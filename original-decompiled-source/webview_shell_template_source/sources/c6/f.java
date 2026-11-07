package c6;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import y5.q0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class f extends q0 {

    /* renamed from: u, reason: collision with root package name */
    public a f2237u;

    @Override // y5.u
    public final void x(g5.f fVar, Runnable runnable) {
        a aVar = this.f2237u;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f2215z;
        aVar.b(runnable, j.f2247g);
    }

    @Override // y5.q0
    public final Executor z() {
        return this.f2237u;
    }
}
