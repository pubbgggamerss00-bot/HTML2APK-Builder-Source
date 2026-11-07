package ph;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import tg.f;

/* loaded from: classes2.dex */
public final class h {
    public static q0 a(i0 i0Var, qh.g gVar, eh.p pVar, int i10) {
        tg.h hVar = gVar;
        if ((i10 & 1) != 0) {
            hVar = tg.i.f28768a;
        }
        k0 k0Var = k0.f21553a;
        tg.h hVarB = e0.b(i0Var, hVar);
        k0 k0Var2 = k0.f21553a;
        q0 q0Var = new q0(hVarB, true);
        q0Var.b0(k0Var, q0Var, pVar);
        return q0Var;
    }

    public static final l2 b(i0 i0Var, tg.h hVar, k0 k0Var, eh.p pVar) {
        tg.h hVarB = e0.b(i0Var, hVar);
        k0Var.getClass();
        l2 c2Var = k0Var == k0.f21554b ? new c2(hVarB, pVar) : new l2(hVarB, true);
        c2Var.b0(k0Var, c2Var, pVar);
        return c2Var;
    }

    public static /* synthetic */ l2 c(i0 i0Var, tg.h hVar, k0 k0Var, eh.p pVar, int i10) {
        if ((i10 & 1) != 0) {
            hVar = tg.i.f28768a;
        }
        if ((i10 & 2) != 0) {
            k0Var = k0.f21553a;
        }
        return b(i0Var, hVar, k0Var, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T d(tg.h hVar, eh.p<? super i0, ? super tg.e<? super T>, ? extends Object> pVar) throws Throwable {
        f1 f1VarA;
        tg.h hVarA;
        Thread threadCurrentThread = Thread.currentThread();
        f.a aVar = f.a.f28767a;
        tg.f fVar = (tg.f) hVar.get(aVar);
        tg.i iVar = tg.i.f28768a;
        if (fVar == null) {
            f1VarA = p2.a();
            hVarA = e0.a(iVar, hVar.plus(f1VarA), true);
            wh.c cVar = z0.f21632a;
            if (hVarA != cVar && hVarA.get(aVar) == null) {
                hVarA = hVarA.plus(cVar);
            }
        } else {
            if (fVar instanceof f1) {
            }
            f1VarA = p2.f21577a.get();
            hVarA = e0.a(iVar, hVar, true);
            wh.c cVar2 = z0.f21632a;
            if (hVarA != cVar2 && hVarA.get(aVar) == null) {
                hVarA = hVarA.plus(cVar2);
            }
        }
        f fVar2 = new f(hVarA, threadCurrentThread, f1VarA);
        fVar2.b0(k0.f21553a, fVar2, pVar);
        f1 f1Var = fVar2.f21528e;
        if (f1Var != null) {
            int i10 = f1.f21529f;
            f1Var.J0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jK0 = f1Var != null ? f1Var.K0() : Long.MAX_VALUE;
                if (fVar2.isCompleted()) {
                    if (f1Var != null) {
                        int i11 = f1.f21529f;
                        f1Var.H0(false);
                    }
                    T t3 = (T) b2.a(y1.f21611a.get(fVar2));
                    y yVar = t3 instanceof y ? (y) t3 : null;
                    if (yVar == null) {
                        return t3;
                    }
                    throw yVar.f21609a;
                }
                LockSupport.parkNanos(fVar2, jK0);
            } catch (Throwable th2) {
                if (f1Var != null) {
                    int i12 = f1.f21529f;
                    f1Var.H0(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        fVar2.l(interruptedException);
        throw interruptedException;
    }

    public static final <T> Object e(tg.h hVar, eh.p<? super i0, ? super tg.e<? super T>, ? extends Object> pVar, tg.e<? super T> eVar) throws Throwable {
        Object objA;
        tg.h context = eVar.getContext();
        tg.h hVarPlus = !((Boolean) hVar.fold(Boolean.FALSE, new b0())).booleanValue() ? context.plus(hVar) : e0.a(context, hVar, false);
        v1.e(hVarPlus);
        if (hVarPlus == context) {
            uh.r rVar = new uh.r(eVar, hVarPlus);
            objA = d0.q1.b(rVar, rVar, pVar);
        } else {
            f.a aVar = f.a.f28767a;
            if (kotlin.jvm.internal.r.a(hVarPlus.get(aVar), context.get(aVar))) {
                w2 w2Var = new w2(eVar, hVarPlus);
                tg.h hVar2 = w2Var.f21494c;
                Object objC = uh.b0.c(hVar2, null);
                try {
                    Object objB = d0.q1.b(w2Var, w2Var, pVar);
                    uh.b0.a(hVar2, objC);
                    objA = objB;
                } catch (Throwable th2) {
                    uh.b0.a(hVar2, objC);
                    throw th2;
                }
            } else {
                w0 w0Var = new w0(eVar, hVarPlus);
                try {
                    uh.g.a(pg.f0.f21461a, ah.p.c(ah.p.b(pVar, w0Var, w0Var)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w0.f21598e;
                    while (true) {
                        int i10 = atomicIntegerFieldUpdater.get(w0Var);
                        if (i10 != 0) {
                            if (i10 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objA = b2.a(y1.f21611a.get(w0Var));
                            if (objA instanceof y) {
                                throw ((y) objA).f21609a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(w0Var, 0, 1)) {
                            objA = ug.a.f29706a;
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (th instanceof v0) {
                        th = ((v0) th).f21596a;
                    }
                    w0Var.resumeWith(pg.q.a(th));
                    throw th;
                }
            }
        }
        ug.a aVar2 = ug.a.f29706a;
        return objA;
    }
}
