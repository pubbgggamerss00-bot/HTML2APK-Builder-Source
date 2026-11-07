package ph;

/* loaded from: classes2.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<f1> f21577a = new ThreadLocal<>();

    public static f1 a() {
        ThreadLocal<f1> threadLocal = f21577a;
        f1 f1Var = threadLocal.get();
        if (f1Var != null) {
            return f1Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
