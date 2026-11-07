package y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m1 extends u {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f15368u = 0;

    static {
        new m1();
    }

    @Override // y5.u
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // y5.u
    public final void x(g5.f fVar, Runnable runnable) {
        if (((p1) fVar.t(p1.f15371t)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
