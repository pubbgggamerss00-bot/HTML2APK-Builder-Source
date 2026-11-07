package y5;

import com.google.android.gms.internal.ads.hm1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y5.x0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f<T> extends h0<T> implements e<T>, i5.d {

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f15340x = AtomicIntegerFieldUpdater.newUpdater(f.class, "_decisionAndIndex");

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15341y = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state");

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15342z = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: v, reason: collision with root package name */
    public final g5.d<T> f15343v;

    /* renamed from: w, reason: collision with root package name */
    public final g5.f f15344w;

    public f(g5.d dVar) {
        super(1);
        this.f15343v = dVar;
        this.f15344w = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b.s;
    }

    public static void q(d dVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + dVar + ", already has " + obj).toString());
    }

    @Override // y5.h0
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15341y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof i1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof l) {
                return;
            }
            if (!(obj2 instanceof k)) {
                k kVar = new k(obj2, null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, kVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            k kVar2 = (k) obj2;
            if (kVar2.f15356e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            k kVarA = k.a(kVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, kVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            d dVar = kVar2.f15353b;
            if (dVar != null) {
                i(dVar, cancellationException);
            }
            p5.l<Throwable, d5.j> lVar = kVar2.f15354c;
            if (lVar != null) {
                try {
                    lVar.invoke(cancellationException);
                    return;
                } catch (Throwable th) {
                    w.a(this.f15344w, new hm1("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // y5.h0
    public final g5.d<T> b() {
        return this.f15343v;
    }

    @Override // i5.d
    public final i5.d c() {
        g5.d<T> dVar = this.f15343v;
        if (dVar instanceof i5.d) {
            return (i5.d) dVar;
        }
        return null;
    }

    @Override // y5.h0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y5.h0
    public final <T> T e(Object obj) {
        return obj instanceof k ? (T) ((k) obj).f15352a : obj;
    }

    @Override // g5.d
    public final void g(Object obj) {
        Throwable thA = d5.d.a(obj);
        if (thA != null) {
            obj = new l(thA, false);
        }
        int i6 = this.f15348u;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15341y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof i1)) {
                if (obj2 instanceof g) {
                    if (g.f15345c.compareAndSet((g) obj2, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            i1 i1Var = (i1) obj2;
            Object kVar = (!(obj instanceof l) && (i6 == 1 || i6 == 2) && (i1Var instanceof d)) ? new k(obj, (d) i1Var, null, 16) : obj;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, kVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!p()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15342z;
                j0 j0Var = (j0) atomicReferenceFieldUpdater2.get(this);
                if (j0Var != null) {
                    j0Var.d();
                    atomicReferenceFieldUpdater2.set(this, h1.s);
                }
            }
            k(i6);
            return;
        }
    }

    @Override // g5.d
    public final g5.f getContext() {
        return this.f15344w;
    }

    @Override // y5.h0
    public final Object h() {
        return f15341y.get(this);
    }

    public final void i(d dVar, Throwable th) {
        try {
            dVar.a(th);
        } catch (Throwable th2) {
            w.a(this.f15344w, new hm1("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean j(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15341y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof i1)) {
                return false;
            }
            g gVar = new g(this, th, (obj instanceof d) || (obj instanceof b6.u));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            i1 i1Var = (i1) obj;
            if (i1Var instanceof d) {
                i((d) obj, th);
            } else if (i1Var instanceof b6.u) {
                b6.u uVar = (b6.u) obj;
                if ((f15340x.get(this) & 536870911) == 536870911) {
                    throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
                }
                try {
                    uVar.a();
                } catch (Throwable th2) {
                    w.a(this.f15344w, new hm1("Exception in invokeOnCancellation handler for " + this, th2));
                }
            }
            if (!p()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15342z;
                j0 j0Var = (j0) atomicReferenceFieldUpdater2.get(this);
                if (j0Var != null) {
                    j0Var.d();
                    atomicReferenceFieldUpdater2.set(this, h1.s);
                }
            }
            k(this.f15348u);
            return true;
        }
    }

    public final void k(int i6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f15340x;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z6 = i6 == 4;
                g5.d<T> dVar = this.f15343v;
                if (!z6 && (dVar instanceof b6.g)) {
                    boolean z7 = i6 == 1 || i6 == 2;
                    int i9 = this.f15348u;
                    if (z7 == (i9 == 1 || i9 == 2)) {
                        b6.g gVar = (b6.g) dVar;
                        u uVar = gVar.f2020v;
                        g5.f fVar = gVar.f2021w.f13373t;
                        kotlin.jvm.internal.j.b(fVar);
                        if (uVar.y()) {
                            uVar.x(fVar, this);
                            return;
                        }
                        l0 l0VarA = l1.a();
                        if (l0VarA.f15359u >= 4294967296L) {
                            e5.h<h0<?>> hVar = l0VarA.f15361w;
                            if (hVar == null) {
                                hVar = new e5.h<>();
                                l0VarA.f15361w = hVar;
                            }
                            hVar.addLast(this);
                            return;
                        }
                        l0VarA.A(true);
                        try {
                            f5.b.m(this, dVar, true);
                            do {
                            } while (l0VarA.B());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                f5.b.m(this, dVar, z6);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1073741824 + (536870911 & i7)));
    }

    public final Object l() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        x0 x0Var;
        boolean zP = p();
        do {
            atomicIntegerFieldUpdater = f15340x;
            i6 = atomicIntegerFieldUpdater.get(this);
            int i7 = i6 >> 29;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zP) {
                    r();
                }
                Object obj = f15341y.get(this);
                if (obj instanceof l) {
                    throw ((l) obj).f15358a;
                }
                int i8 = this.f15348u;
                if ((i8 != 1 && i8 != 2) || (x0Var = (x0) this.f15344w.t(x0.b.s)) == null || x0Var.a()) {
                    return e(obj);
                }
                CancellationException cancellationExceptionH = x0Var.h();
                a(obj, cancellationExceptionH);
                throw cancellationExceptionH;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 536870912 + (536870911 & i6)));
        if (((j0) f15342z.get(this)) == null) {
            n();
        }
        if (zP) {
            r();
        }
        return h5.a.s;
    }

    public final void m() {
        j0 j0VarN = n();
        if (j0VarN == null || (f15341y.get(this) instanceof i1)) {
            return;
        }
        j0VarN.d();
        f15342z.set(this, h1.s);
    }

    public final j0 n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x0 x0Var = (x0) this.f15344w.t(x0.b.s);
        if (x0Var == null) {
            return null;
        }
        j0 j0VarF = x0Var.f((1 & 1) == 0, (1 & 2) != 0, new h(this));
        do {
            atomicReferenceFieldUpdater = f15342z;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, j0VarF)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return j0VarF;
    }

    public final void o(p5.l<? super Throwable, d5.j> lVar) {
        d u0Var = lVar instanceof d ? (d) lVar : new u0(lVar);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15341y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z6 = true;
            if (obj instanceof d ? true : obj instanceof b6.u) {
                q(u0Var, obj);
                throw null;
            }
            if (obj instanceof l) {
                l lVar2 = (l) obj;
                if (!l.f15357b.compareAndSet(lVar2, 0, 1)) {
                    q(u0Var, obj);
                    throw null;
                }
                if (obj instanceof g) {
                    i(u0Var, lVar2.f15358a);
                    return;
                }
                return;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (kVar.f15353b != null) {
                    q(u0Var, obj);
                    throw null;
                }
                Throwable th = kVar.f15356e;
                if (th != null) {
                    i(u0Var, th);
                    return;
                }
                k kVarA = k.a(kVar, u0Var, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, kVarA)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z6 = false;
                        break;
                    }
                }
                if (z6) {
                    return;
                }
            } else {
                k kVar2 = new k(obj, u0Var, null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z6 = false;
                        break;
                    }
                }
                if (z6) {
                    return;
                }
            }
        }
    }

    public final boolean p() {
        if (this.f15348u != 2) {
            return false;
        }
        g5.d<T> dVar = this.f15343v;
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", dVar);
        return b6.g.f2019z.get((b6.g) dVar) != null;
    }

    public final void r() {
        g5.d<T> dVar = this.f15343v;
        Throwable th = null;
        b6.g gVar = dVar instanceof b6.g ? (b6.g) dVar : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.g.f2019z;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                b6.v vVar = b6.h.f2025b;
                if (obj == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, vVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != vVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15342z;
            j0 j0Var = (j0) atomicReferenceFieldUpdater2.get(this);
            if (j0Var != null) {
                j0Var.d();
                atomicReferenceFieldUpdater2.set(this, h1.s);
            }
            j(th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(b0.h(this.f15343v));
        sb.append("){");
        Object obj = f15341y.get(this);
        sb.append(obj instanceof i1 ? "Active" : obj instanceof g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(b0.e(this));
        return sb.toString();
    }
}
