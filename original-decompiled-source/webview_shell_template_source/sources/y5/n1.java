package y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n1<T> extends b6.t<T> {
    private volatile boolean threadLocalIsSet;

    public final void P() {
        if (!this.threadLocalIsSet) {
            throw null;
        }
        throw null;
    }

    public final void Q() {
        this.threadLocalIsSet = true;
        throw null;
    }

    @Override // b6.t, y5.c1
    public final void u(Object obj) {
        if (this.threadLocalIsSet) {
            throw null;
        }
        e1.a(obj);
        throw null;
    }
}
