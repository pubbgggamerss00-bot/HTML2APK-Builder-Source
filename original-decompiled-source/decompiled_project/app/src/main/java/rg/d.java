package rg;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.r;
import rg.c;

/* loaded from: classes2.dex */
public final class d<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final c<K, V> f23571a;

    public d(c<K, V> cVar) {
        this.f23571a = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        r.e(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        r.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // qg.i
    public final int c() {
        return this.f23571a.f23559j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23571a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> elements) {
        r.e(elements, "elements");
        return this.f23571a.h(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23571a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        c<K, V> cVar = this.f23571a;
        cVar.getClass();
        return new c.b(cVar);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> elements) {
        r.e(elements, "elements");
        this.f23571a.f();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> elements) {
        r.e(elements, "elements");
        this.f23571a.f();
        return super.retainAll(elements);
    }
}
