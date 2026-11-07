package y5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b1 extends n implements j0, s0 {

    /* renamed from: v, reason: collision with root package name */
    public c1 f15321v;

    @Override // y5.s0
    public final boolean a() {
        return true;
    }

    @Override // y5.s0
    public final g1 c() {
        return null;
    }

    @Override // y5.j0
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c1 c1VarK = k();
        while (true) {
            Object objE = c1VarK.E();
            if (objE instanceof b1) {
                if (objE != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c1.s;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c1VarK, objE, e1.f15339g)) {
                    if (atomicReferenceFieldUpdater2.get(c1VarK) != objE) {
                        break;
                    }
                }
                return;
            }
            if (!(objE instanceof s0) || ((s0) objE).c() == null) {
                return;
            }
            while (true) {
                Object objG = g();
                if (objG instanceof b6.r) {
                    return;
                }
                if (objG == this) {
                    return;
                }
                kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objG);
                b6.l lVar = (b6.l) objG;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = b6.l.f2035u;
                b6.r rVar = (b6.r) atomicReferenceFieldUpdater3.get(lVar);
                if (rVar == null) {
                    rVar = new b6.r(lVar);
                    atomicReferenceFieldUpdater3.lazySet(lVar, rVar);
                }
                do {
                    atomicReferenceFieldUpdater = b6.l.s;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objG, rVar)) {
                        lVar.e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objG);
            }
        }
    }

    public final c1 k() {
        c1 c1Var = this.f15321v;
        if (c1Var != null) {
            return c1Var;
        }
        kotlin.jvm.internal.j.g("job");
        throw null;
    }

    @Override // b6.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.e(this) + "[job@" + b0.e(k()) + ']';
    }
}
