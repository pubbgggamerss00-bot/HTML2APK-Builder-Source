package p;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f1 implements Iterator<Object>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public int f20621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1<Object> f20622b;

    public f1(c1<Object> c1Var) {
        this.f20622b = c1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20621a < this.f20622b.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f20621a;
        this.f20621a = i10 + 1;
        return this.f20622b.g(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
