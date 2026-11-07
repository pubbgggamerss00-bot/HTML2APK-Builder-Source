package i7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ph.g0;
import ph.z0;

/* loaded from: classes.dex */
public final class f extends g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14188e = AtomicIntegerFieldUpdater.newUpdater(f.class, "d");

    /* renamed from: c, reason: collision with root package name */
    public final g0 f14189c;

    /* renamed from: d, reason: collision with root package name */
    public volatile /* synthetic */ int f14190d = 1;

    public f(g0 g0Var) {
        this.f14189c = g0Var;
    }

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        H0().D0(hVar, runnable);
    }

    @Override // ph.g0
    public final void E0(tg.h hVar, Runnable runnable) {
        H0().E0(hVar, runnable);
    }

    @Override // ph.g0
    public final boolean F0(tg.h hVar) {
        return H0().F0(hVar);
    }

    @Override // ph.g0
    public final g0 G0(int i10) {
        return H0().G0(i10);
    }

    public final g0 H0() {
        return f14188e.get(this) == 1 ? z0.f21633b : this.f14189c;
    }

    @Override // ph.g0
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f14189c + ')';
    }
}
