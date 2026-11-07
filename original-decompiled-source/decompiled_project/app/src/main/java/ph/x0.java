package ph;

import java.util.concurrent.CancellationException;
import ph.s1;

/* loaded from: classes2.dex */
public abstract class x0<T> extends wh.g {

    /* renamed from: c, reason: collision with root package name */
    public int f21605c;

    public x0(int i10) {
        this.f21605c = i10;
    }

    public void a(CancellationException cancellationException) {
    }

    public abstract tg.e<T> c();

    public Throwable d(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null) {
            return yVar.f21609a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th2) {
        kotlinx.coroutines.a.a(new l0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), c().getContext());
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            tg.e<T> eVarC = c();
            kotlin.jvm.internal.r.c(eVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            uh.f fVar = (uh.f) eVarC;
            vg.c cVar = fVar.f29734e;
            Object obj = fVar.f29736g;
            tg.h context = cVar.getContext();
            Object objC = uh.b0.c(context, obj);
            s1 s1Var = null;
            w2<?> w2VarC = objC != uh.b0.f29719a ? e0.c(cVar, context, objC) : null;
            try {
                tg.h context2 = cVar.getContext();
                Object objG = g();
                Throwable thD = d(objG);
                if (thD == null) {
                    int i10 = this.f21605c;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                    if (z10) {
                        s1Var = (s1) context2.get(s1.a.f21589a);
                    }
                }
                if (s1Var != null && !s1Var.isActive()) {
                    CancellationException cancellationException = s1Var.getCancellationException();
                    a(cancellationException);
                    cVar.resumeWith(pg.q.a(cancellationException));
                } else if (thD != null) {
                    cVar.resumeWith(pg.q.a(thD));
                } else {
                    cVar.resumeWith(e(objG));
                }
                pg.f0 f0Var = pg.f0.f21461a;
                if (w2VarC == null || w2VarC.h0()) {
                    uh.b0.a(context, objC);
                }
            } catch (Throwable th2) {
                if (w2VarC == null || w2VarC.h0()) {
                    uh.b0.a(context, objC);
                }
                throw th2;
            }
        } catch (v0 e10) {
            kotlinx.coroutines.a.a(e10.f21596a, c().getContext());
        } catch (Throwable th3) {
            f(th3);
        }
    }
}
