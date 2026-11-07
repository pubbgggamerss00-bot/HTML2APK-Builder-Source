package tg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pg.p;

/* loaded from: classes2.dex */
public final class j<T> implements e<T>, vg.d {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<j<?>, Object> f28769b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final e<T> f28770a;
    private volatile Object result;

    public j(e eVar, ug.a aVar) {
        this.f28770a = eVar;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        ug.a aVar = ug.a.f29707b;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<j<?>, Object> atomicReferenceFieldUpdater = f28769b;
            ug.a aVar2 = ug.a.f29706a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return ug.a.f29706a;
        }
        if (obj == ug.a.f29708c) {
            return ug.a.f29706a;
        }
        if (obj instanceof p.a) {
            throw ((p.a) obj).f21472a;
        }
        return obj;
    }

    @Override // vg.d
    public final vg.d getCallerFrame() {
        e<T> eVar = this.f28770a;
        if (eVar instanceof vg.d) {
            return (vg.d) eVar;
        }
        return null;
    }

    @Override // tg.e
    public final h getContext() {
        return this.f28770a.getContext();
    }

    @Override // tg.e
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            ug.a aVar = ug.a.f29707b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater<j<?>, Object> atomicReferenceFieldUpdater = f28769b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            ug.a aVar2 = ug.a.f29706a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater<j<?>, Object> atomicReferenceFieldUpdater2 = f28769b;
            ug.a aVar3 = ug.a.f29708c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f28770a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f28770a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(e<? super T> eVar) {
        ug.a aVar = ug.a.f29707b;
        this.f28770a = eVar;
        this.result = aVar;
    }
}
