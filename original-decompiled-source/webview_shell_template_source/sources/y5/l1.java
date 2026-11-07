package y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<l0> f15362a = new ThreadLocal<>();

    public static l0 a() {
        ThreadLocal<l0> threadLocal = f15362a;
        l0 l0Var = threadLocal.get();
        if (l0Var != null) {
            return l0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
