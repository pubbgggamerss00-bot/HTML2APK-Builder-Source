package i5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements g5.d<Object> {
    public static final b s = new b();

    @Override // g5.d
    public final void g(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // g5.d
    public final g5.f getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
