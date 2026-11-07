package ph;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class y0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f21610a;

    public y0(g0 g0Var) {
        this.f21610a = g0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g0 g0Var = this.f21610a;
        tg.i iVar = tg.i.f28768a;
        if (uh.g.c(g0Var, iVar)) {
            uh.g.b(g0Var, iVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f21610a.toString();
    }
}
