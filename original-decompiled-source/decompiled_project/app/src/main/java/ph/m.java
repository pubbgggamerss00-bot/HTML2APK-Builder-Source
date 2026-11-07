package ph;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.j;
import ph.s1;

/* loaded from: classes2.dex */
public class m<T> extends x0<T> implements k<T>, vg.d, y2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21563f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21564g = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21565h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final tg.e<T> f21566d;

    /* renamed from: e, reason: collision with root package name */
    public final tg.h f21567e;

    public m(int i10, tg.e eVar) {
        super(i10);
        this.f21566d = eVar;
        this.f21567e = eVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f21497a;
    }

    public static Object C(g2 g2Var, Object obj, int i10, eh.q qVar) {
        if (obj instanceof y) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (qVar != null || (g2Var instanceof j)) {
            return new x(obj, g2Var instanceof j ? (j) g2Var : null, qVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final <R> void A(R r10, int i10, eh.q<? super Throwable, ? super R, ? super tg.h, pg.f0> qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21564g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof g2) {
                Object objC = C((g2) obj, r10, i10, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, objC)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (!v()) {
                    k();
                }
                l(i10);
                return;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (p.f21574c.compareAndSet(pVar, 0, 1)) {
                    if (qVar != null) {
                        i(qVar, pVar.f21609a, r10);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + r10).toString());
        }
    }

    public final void B(g0 g0Var, T t3) {
        tg.e<T> eVar = this.f21566d;
        uh.f fVar = eVar instanceof uh.f ? (uh.f) eVar : null;
        A(t3, (fVar != null ? fVar.f29733d : null) == g0Var ? 4 : this.f21605c, null);
    }

    public final uh.v D(Object obj, eh.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21564g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof g2)) {
                return null;
            }
            Object objC = C((g2) obj2, obj, this.f21605c, qVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            boolean zV = v();
            uh.v vVar = n.f21569a;
            if (!zV) {
                k();
            }
            return vVar;
        }
    }

    @Override // ph.x0
    public final void a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21564g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof g2) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof y) {
                return;
            }
            if (!(obj instanceof x)) {
                cancellationException2 = cancellationException;
                x xVar = new x(obj, (j) null, (eh.q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, xVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            x xVar2 = (x) obj;
            if (xVar2.f21604e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            x xVarA = x.a(xVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, xVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            j jVar = xVar2.f21601b;
            if (jVar != null) {
                h(jVar, cancellationException);
            }
            eh.q<Throwable, R, tg.h, pg.f0> qVar = xVar2.f21602c;
            if (qVar != 0) {
                i(qVar, cancellationException, xVar2.f21600a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // ph.y2
    public final void b(uh.s<?> sVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f21563f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        t(sVar);
    }

    @Override // ph.x0
    public final tg.e<T> c() {
        return this.f21566d;
    }

    @Override // ph.k
    public final boolean cancel(Throwable th2) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21564g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof g2)) {
                return false;
            }
            boolean z10 = (obj instanceof j) || (obj instanceof uh.s);
            if (th2 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th2;
            }
            p pVar = new p(z10, cancellationException);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            g2 g2Var = (g2) obj;
            if (g2Var instanceof j) {
                h((j) obj, th2);
            } else if (g2Var instanceof uh.s) {
                j((uh.s) obj, th2);
            }
            if (!v()) {
                k();
            }
            l(this.f21605c);
            return true;
        }
    }

    @Override // ph.x0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ph.x0
    public final <T> T e(Object obj) {
        return obj instanceof x ? (T) ((x) obj).f21600a : obj;
    }

    @Override // ph.x0
    public final Object g() {
        return f21564g.get(this);
    }

    @Override // vg.d
    public final vg.d getCallerFrame() {
        tg.e<T> eVar = this.f21566d;
        if (eVar instanceof vg.d) {
            return (vg.d) eVar;
        }
        return null;
    }

    @Override // tg.e
    public final tg.h getContext() {
        return this.f21567e;
    }

    public final void h(j jVar, Throwable th2) {
        try {
            jVar.d(th2);
        } catch (Throwable th3) {
            kotlinx.coroutines.a.a(new z("Exception in invokeOnCancellation handler for " + this, th3), this.f21567e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void i(eh.q<? super Throwable, ? super R, ? super tg.h, pg.f0> qVar, Throwable th2, R r10) {
        tg.h hVar = this.f21567e;
        try {
            qVar.b(th2, r10, hVar);
        } catch (Throwable th3) {
            kotlinx.coroutines.a.a(new z("Exception in resume onCancellation handler for " + this, th3), hVar);
        }
    }

    public final void j(uh.s<?> sVar, Throwable th2) {
        tg.h hVar = this.f21567e;
        int i10 = f21563f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.h(i10, hVar);
        } catch (Throwable th3) {
            kotlinx.coroutines.a.a(new z("Exception in invokeOnCancellation handler for " + this, th3), hVar);
        }
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21565h;
        b1 b1Var = (b1) atomicReferenceFieldUpdater.get(this);
        if (b1Var == null) {
            return;
        }
        b1Var.a();
        atomicReferenceFieldUpdater.set(this, f2.f21533a);
    }

    public final void l(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f21563f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                tg.e<T> eVar = this.f21566d;
                if (!z10 && (eVar instanceof uh.f)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.f21605c;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        uh.f fVar = (uh.f) eVar;
                        g0 g0Var = fVar.f29733d;
                        tg.h context = fVar.f29734e.getContext();
                        if (uh.g.c(g0Var, context)) {
                            uh.g.b(g0Var, context, this);
                            return;
                        }
                        f1 f1VarA = p2.a();
                        if (f1VarA.f21530c >= 4294967296L) {
                            f1VarA.I0(this);
                            return;
                        }
                        f1VarA.J0(true);
                        try {
                            f3.q.b(this, eVar, true);
                            do {
                            } while (f1VarA.L0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                f3.q.b(this, eVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    @Override // ph.k
    public final uh.v m(Object obj, eh.q qVar) {
        return D(obj, qVar);
    }

    public Throwable n(y1 y1Var) {
        return y1Var.getCancellationException();
    }

    public final Object o() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        s1 s1Var;
        boolean zV = v();
        do {
            atomicIntegerFieldUpdater = f21563f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zV) {
                    z();
                }
                Object obj = f21564g.get(this);
                if (obj instanceof y) {
                    throw ((y) obj).f21609a;
                }
                int i12 = this.f21605c;
                if ((i12 != 1 && i12 != 2) || (s1Var = (s1) this.f21567e.get(s1.a.f21589a)) == null || s1Var.isActive()) {
                    return e(obj);
                }
                CancellationException cancellationException = s1Var.getCancellationException();
                a(cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, PKIFailureInfo.duplicateCertReq + (536870911 & i10)));
        if (((b1) f21565h.get(this)) == null) {
            q();
        }
        if (zV) {
            z();
        }
        return ug.a.f29706a;
    }

    public final void p() {
        b1 b1VarQ = q();
        if (b1VarQ == null || (f21564g.get(this) instanceof g2)) {
            return;
        }
        b1VarQ.a();
        f21565h.set(this, f2.f21533a);
    }

    public final b1 q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        s1 s1Var = (s1) this.f21567e.get(s1.a.f21589a);
        if (s1Var == null) {
            return null;
        }
        b1 b1VarG = v1.g(s1Var, new q(this));
        do {
            atomicReferenceFieldUpdater = f21565h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, b1VarG)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return b1VarG;
    }

    @Override // ph.k
    public final <R extends T> void r(R r10, eh.q<? super Throwable, ? super R, ? super tg.h, pg.f0> qVar) {
        A(r10, this.f21605c, qVar);
    }

    @Override // tg.e
    public final void resumeWith(Object obj) {
        Throwable thA = pg.p.a(obj);
        if (thA != null) {
            obj = new y(false, thA);
        }
        A(obj, this.f21605c, null);
    }

    public final void s(eh.l<? super Throwable, pg.f0> lVar) {
        t(new j.a(lVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        x(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(g2 g2Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21564g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g2Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof j) || (obj instanceof uh.s)) {
                break;
            }
            if (obj instanceof y) {
                y yVar = (y) obj;
                if (!y.f21608b.compareAndSet(yVar, 0, 1)) {
                    x(g2Var, obj);
                    throw null;
                }
                if (obj instanceof p) {
                    Throwable th2 = yVar.f21609a;
                    if (g2Var instanceof j) {
                        h((j) g2Var, th2);
                        return;
                    } else {
                        kotlin.jvm.internal.r.c(g2Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        j((uh.s) g2Var, th2);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof x)) {
                if (g2Var instanceof uh.s) {
                    return;
                }
                kotlin.jvm.internal.r.c(g2Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                x xVar = new x(obj, (j) g2Var, (eh.q) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, xVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            x xVar2 = (x) obj;
            if (xVar2.f21601b != null) {
                x(g2Var, obj);
                throw null;
            }
            if (g2Var instanceof uh.s) {
                return;
            }
            kotlin.jvm.internal.r.c(g2Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            j jVar = (j) g2Var;
            Throwable th3 = xVar2.f21604e;
            if (th3 != null) {
                h(jVar, th3);
                return;
            }
            x xVarA = x.a(xVar2, jVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, xVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(m0.f(this.f21566d));
        sb.append("){");
        Object obj = f21564g.get(this);
        sb.append(obj instanceof g2 ? "Active" : obj instanceof p ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(m0.a(this));
        return sb.toString();
    }

    public final boolean u() {
        return f21564g.get(this) instanceof g2;
    }

    public final boolean v() {
        if (this.f21605c != 2) {
            return false;
        }
        tg.e<T> eVar = this.f21566d;
        kotlin.jvm.internal.r.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return uh.f.f29732h.get((uh.f) eVar) != null;
    }

    @Override // ph.k
    public final void w(Object obj) {
        l(this.f21605c);
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        tg.e<T> eVar = this.f21566d;
        Throwable th2 = null;
        uh.f fVar = eVar instanceof uh.f ? (uh.f) eVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uh.f.f29732h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                uh.v vVar = uh.g.f29738b;
                if (obj == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, vVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != vVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            k();
            cancel(th2);
        }
    }
}
