package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

@zh.g(with = JsonArraySerializer.class)
/* loaded from: classes2.dex */
public final class c extends h implements List<h>, fh.a {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<h> f16439a;

    public static final class a {
        public final zh.b<c> serializer() {
            return JsonArraySerializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends h> content) {
        kotlin.jvm.internal.r.e(content, "content");
        this.f16439a = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f16439a.contains((h) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        return this.f16439a.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.r.a(this.f16439a, obj);
    }

    @Override // java.util.List
    public final h get(int i10) {
        return this.f16439a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f16439a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        return this.f16439a.indexOf((h) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f16439a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<h> iterator() {
        return this.f16439a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        return this.f16439a.lastIndexOf((h) obj);
    }

    @Override // java.util.List
    public final ListIterator<h> listIterator() {
        return this.f16439a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ h remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<h> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ h set(int i10, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f16439a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super h> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<h> subList(int i10, int i11) {
        return this.f16439a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    public final String toString() {
        return qg.x.I(this.f16439a, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<h> listIterator(int i10) {
        return this.f16439a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }
}
