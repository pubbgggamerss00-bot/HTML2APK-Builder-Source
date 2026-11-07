package ph;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class o {
    public static final <T> m<T> a(tg.e<? super T> eVar) {
        m<T> mVar;
        m<T> mVar2;
        if (!(eVar instanceof uh.f)) {
            return new m<>(1, eVar);
        }
        uh.f fVar = (uh.f) eVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uh.f.f29732h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            mVar = null;
            uh.v vVar = uh.g.f29738b;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, vVar);
                mVar2 = null;
                break;
            }
            if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            }
            if (obj != vVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.f21564g;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if (!(obj2 instanceof x) || ((x) obj2).f21603d == null) {
                m.f21563f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f21497a);
                mVar = mVar2;
            } else {
                mVar2.k();
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m<>(2, eVar);
    }
}
