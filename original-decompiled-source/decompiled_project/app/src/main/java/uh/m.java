package uh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class m<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29755a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29755a;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29755a;
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
        n nVar = (n) f29755a.get(this);
        nVar.getClass();
        long j10 = n.f29757f.get(nVar);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29755a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) nVar.d();
            if (e10 != n.f29758g) {
                return e10;
            }
            n<E> nVarC = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, nVarC) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
