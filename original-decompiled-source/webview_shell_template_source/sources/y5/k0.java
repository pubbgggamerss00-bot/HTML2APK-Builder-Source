package y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k0 implements s0 {
    public final boolean s;

    public k0(boolean z6) {
        this.s = z6;
    }

    @Override // y5.s0
    public final boolean a() {
        return this.s;
    }

    @Override // y5.s0
    public final g1 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.s ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
