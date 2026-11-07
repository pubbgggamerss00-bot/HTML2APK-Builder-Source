package b6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class m<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2038a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2038a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int iA = nVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                n<E> nVarC = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, nVarC) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2038a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n<E> nVarC = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, nVarC) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f2038a.get(this);
        nVar.getClass();
        long j6 = n.f2040f.get(nVar);
        return (((int) ((j6 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j6))) & 1073741823;
    }

    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2038a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            E e6 = (E) nVar.d();
            if (e6 != n.f2041g) {
                return e6;
            }
            n<E> nVarC = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, nVarC) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
