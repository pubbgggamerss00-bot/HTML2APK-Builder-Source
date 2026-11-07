package c1;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u<K, V, T> implements Iterator<T>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f4586a = t.f4579e.f4583d;

    /* renamed from: b, reason: collision with root package name */
    public int f4587b;

    /* renamed from: c, reason: collision with root package name */
    public int f4588c;

    public final void c(Object[] objArr, int i10, int i11) {
        this.f4586a = objArr;
        this.f4587b = i10;
        this.f4588c = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4588c < this.f4587b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
