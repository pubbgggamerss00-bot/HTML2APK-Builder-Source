package a3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.r;
import qg.z;

/* loaded from: classes.dex */
public final class c implements Collection<b>, fh.a {

    /* renamed from: c, reason: collision with root package name */
    public static final c f24c = new c(z.f22752a);

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f25a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26b;

    public c(List<b> list) {
        this.f25a = list;
        this.f26b = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f25a.contains((b) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return this.f25a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return r.a(this.f25a, ((c) obj).f25a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f25a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f25a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<b> iterator() {
        return this.f25a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f26b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f25a + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) i.b(this, tArr);
    }
}
