package qg;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g0<T> implements Iterator<e0<? extends T>>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator<T> f22722a;

    /* renamed from: b, reason: collision with root package name */
    public int f22723b;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(Iterator<? extends T> iterator) {
        kotlin.jvm.internal.r.e(iterator, "iterator");
        this.f22722a = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22722a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f22723b;
        this.f22723b = i10 + 1;
        if (i10 >= 0) {
            return new e0(i10, this.f22722a.next());
        }
        p.o();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
