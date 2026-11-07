package y5;

import java.util.concurrent.CancellationException;
import y5.x0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class h0<T> extends c6.g {

    /* renamed from: u, reason: collision with root package name */
    public int f15348u;

    public h0(int i6) {
        this.f15348u = i6;
    }

    public abstract g5.d<T> b();

    public Throwable d(Object obj) {
        l lVar = obj instanceof l ? (l) obj : null;
        if (lVar != null) {
            return lVar.f15358a;
        }
        return null;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            b0.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.j.b(th);
        w.a(b().getContext(), new a0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        x0 x0Var;
        Object objA = d5.j.f12745a;
        c6.h hVar = this.f2238t;
        try {
            g5.d<T> dVarB = b();
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>", dVarB);
            b6.g gVar = (b6.g) dVarB;
            i5.c cVar = gVar.f2021w;
            Object obj = gVar.f2023y;
            g5.f fVar = cVar.f13373t;
            kotlin.jvm.internal.j.b(fVar);
            Object objC = b6.x.c(fVar, obj);
            n1 n1VarA = objC != b6.x.f2051a ? s.a(cVar, fVar) : null;
            try {
                g5.f fVar2 = cVar.f13373t;
                kotlin.jvm.internal.j.b(fVar2);
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null) {
                    int i6 = this.f15348u;
                    boolean z6 = true;
                    if (i6 != 1 && i6 != 2) {
                        z6 = false;
                    }
                    x0Var = z6 ? (x0) fVar2.t(x0.b.s) : null;
                }
                if (x0Var != null && !x0Var.a()) {
                    CancellationException cancellationExceptionH = x0Var.h();
                    a(objH, cancellationExceptionH);
                    cVar.g(d5.e.a(cancellationExceptionH));
                } else if (thD != null) {
                    cVar.g(d5.e.a(thD));
                } else {
                    cVar.g(e(objH));
                }
                if (n1VarA != null) {
                    n1VarA.P();
                    throw null;
                }
                b6.x.a(fVar, objC);
                try {
                    hVar.getClass();
                } catch (Throwable th) {
                    objA = d5.e.a(th);
                }
                f(null, d5.d.a(objA));
            } catch (Throwable th2) {
                if (n1VarA != null) {
                    n1VarA.P();
                    throw null;
                }
                b6.x.a(fVar, objC);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                hVar.getClass();
            } catch (Throwable th4) {
                objA = d5.e.a(th4);
            }
            f(th3, d5.d.a(objA));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }
}
