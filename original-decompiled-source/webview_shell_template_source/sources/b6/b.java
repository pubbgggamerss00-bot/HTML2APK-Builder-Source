package b6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b<T> extends q {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2017a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f2012a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b6.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2017a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        v vVar = a.f2012a;
        if (obj2 == vVar) {
            v vVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == vVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVarC)) {
                        obj2 = vVarC;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != vVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t6, Object obj);

    public abstract v c(Object obj);
}
