package ph;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class x1 extends uh.l implements b1, n1 {

    /* renamed from: d, reason: collision with root package name */
    public y1 f21606d;

    @Override // ph.b1
    public final void a() {
        y1 y1VarI = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y1.f21611a;
            Object obj = atomicReferenceFieldUpdater.get(y1VarI);
            if (obj instanceof x1) {
                if (obj != this) {
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(y1VarI, obj, b2.f21504g)) {
                    if (atomicReferenceFieldUpdater.get(y1VarI) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof n1) || ((n1) obj).c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = uh.l.f29752a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof uh.p) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                uh.l lVar = (uh.l) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = uh.l.f29754c;
                uh.p pVar = (uh.p) atomicReferenceFieldUpdater3.get(lVar);
                if (pVar == null) {
                    pVar = new uh.p(lVar);
                    atomicReferenceFieldUpdater3.set(lVar, pVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                lVar.e();
                return;
            }
        }
    }

    @Override // ph.n1
    public final d2 c() {
        return null;
    }

    public s1 getParent() {
        return i();
    }

    public final y1 i() {
        y1 y1Var = this.f21606d;
        if (y1Var != null) {
            return y1Var;
        }
        kotlin.jvm.internal.r.h("job");
        throw null;
    }

    @Override // ph.n1
    public final boolean isActive() {
        return true;
    }

    public abstract boolean j();

    public abstract void k(Throwable th2);

    @Override // uh.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + m0.a(this) + "[job@" + m0.a(i()) + ']';
    }
}
