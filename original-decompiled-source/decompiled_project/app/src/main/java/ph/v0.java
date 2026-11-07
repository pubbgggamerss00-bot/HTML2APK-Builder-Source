package ph;

/* loaded from: classes2.dex */
public final class v0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f21596a;

    public v0(Throwable th2, g0 g0Var, tg.h hVar) {
        super("Coroutine dispatcher " + g0Var + " threw an exception, context = " + hVar, th2);
        this.f21596a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f21596a;
    }
}
