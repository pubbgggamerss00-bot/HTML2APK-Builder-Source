package v1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b<T> extends k {
    public abstract void d(a2.e eVar, T t6);

    public final void e(T t6) {
        a2.e eVarA = a();
        try {
            d(eVarA, t6);
            eVarA.f19t.executeInsert();
        } finally {
            c(eVarA);
        }
    }
}
