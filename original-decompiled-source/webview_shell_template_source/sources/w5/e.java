package w5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u0.k0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e<T> extends f<T> implements Iterator<T>, g5.d<d5.j>, q5.a {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public T f15097t;

    /* renamed from: u, reason: collision with root package name */
    public Iterator<? extends T> f15098u;

    /* renamed from: v, reason: collision with root package name */
    public g5.d<? super d5.j> f15099v;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w5.f
    public final void a(Object obj, k0 k0Var) {
        this.f15097t = obj;
        this.s = 3;
        this.f15099v = k0Var;
    }

    @Override // w5.f
    public final Object b(Iterator it, k0 k0Var) {
        if (!it.hasNext()) {
            return d5.j.f12745a;
        }
        this.f15098u = it;
        this.s = 2;
        this.f15099v = k0Var;
        return h5.a.s;
    }

    public final RuntimeException c() {
        int i6 = this.s;
        if (i6 == 4) {
            return new NoSuchElementException();
        }
        if (i6 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.s);
    }

    @Override // g5.d
    public final void g(Object obj) throws Throwable {
        d5.e.b(obj);
        this.s = 4;
    }

    @Override // g5.d
    public final g5.f getContext() {
        return g5.g.s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i6 = this.s;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2 || i6 == 3) {
                        return true;
                    }
                    if (i6 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator<? extends T> it = this.f15098u;
                kotlin.jvm.internal.j.b(it);
                if (it.hasNext()) {
                    this.s = 2;
                    return true;
                }
                this.f15098u = null;
            }
            this.s = 5;
            g5.d<? super d5.j> dVar = this.f15099v;
            kotlin.jvm.internal.j.b(dVar);
            this.f15099v = null;
            dVar.g(d5.j.f12745a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i6 = this.s;
        if (i6 == 0 || i6 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i6 == 2) {
            this.s = 1;
            Iterator<? extends T> it = this.f15098u;
            kotlin.jvm.internal.j.b(it);
            return it.next();
        }
        if (i6 != 3) {
            throw c();
        }
        this.s = 0;
        T t6 = this.f15097t;
        this.f15097t = null;
        return t6;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
