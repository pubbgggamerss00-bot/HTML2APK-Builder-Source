package nc;

import java.util.ListIterator;

/* loaded from: classes2.dex */
public abstract class d1<F, T> extends c1<F, T> implements ListIterator<T> {
    @Override // java.util.ListIterator
    public final void add(T t3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f18670a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f18670a).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) a(((ListIterator) this.f18670a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f18670a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(T t3) {
        throw new UnsupportedOperationException();
    }
}
