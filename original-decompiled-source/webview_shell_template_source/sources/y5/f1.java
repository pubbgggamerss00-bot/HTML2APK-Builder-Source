package y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class f1 extends u {
    @Override // y5.u
    public String toString() {
        f1 f1VarZ;
        String str;
        c6.c cVar = i0.f15349a;
        f1 f1Var = b6.p.f2047a;
        if (this == f1Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                f1VarZ = f1Var.z();
            } catch (UnsupportedOperationException unused) {
                f1VarZ = null;
            }
            str = this == f1VarZ ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + b0.e(this);
    }

    public abstract f1 z();
}
