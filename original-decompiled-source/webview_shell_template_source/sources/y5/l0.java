package y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class l0 extends u {

    /* renamed from: u, reason: collision with root package name */
    public long f15359u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15360v;

    /* renamed from: w, reason: collision with root package name */
    public e5.h<h0<?>> f15361w;

    public final void A(boolean z6) {
        this.f15359u = (z6 ? 4294967296L : 1L) + this.f15359u;
        if (z6) {
            return;
        }
        this.f15360v = true;
    }

    public final boolean B() {
        e5.h<h0<?>> hVar = this.f15361w;
        if (hVar == null) {
            return false;
        }
        h0<?> h0VarRemoveFirst = hVar.isEmpty() ? null : hVar.removeFirst();
        if (h0VarRemoveFirst == null) {
            return false;
        }
        h0VarRemoveFirst.run();
        return true;
    }

    public final void z() {
        long j6 = this.f15359u - 4294967296L;
        this.f15359u = j6;
        if (j6 <= 0 && this.f15360v) {
            shutdown();
        }
    }

    public void shutdown() {
    }
}
