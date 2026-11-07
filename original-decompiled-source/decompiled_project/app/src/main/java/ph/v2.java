package ph;

/* loaded from: classes2.dex */
public final class v2 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final v2 f21597c = new v2();

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        z2 z2Var = (z2) hVar.get(z2.f21635c);
        if (z2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        z2Var.f21636b = true;
    }

    @Override // ph.g0
    public final g0 G0(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // ph.g0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
