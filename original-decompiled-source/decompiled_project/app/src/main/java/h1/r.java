package h1;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class r<K, V, E> implements Set<E>, fh.d {

    /* renamed from: a, reason: collision with root package name */
    public final w<K, V> f12178a;

    public r(w<K, V> wVar) {
        this.f12178a = wVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12178a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12178a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12178a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.i.b(this, tArr);
    }
}
