package rg;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import rg.c;

/* loaded from: classes2.dex */
public final class f<V> extends qg.f<V> {

    /* renamed from: a, reason: collision with root package name */
    public final c<?, V> f23573a;

    public f(c<?, V> cVar) {
        this.f23573a = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> elements) {
        r.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // qg.f
    public final int c() {
        return this.f23573a.f23559j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f23573a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f23573a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f23573a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        c<?, V> cVar = this.f23573a;
        cVar.getClass();
        return new c.f(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c<?, V> cVar = this.f23573a;
        cVar.f();
        int iM = cVar.m(obj);
        if (iM < 0) {
            return false;
        }
        cVar.p(iM);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> elements) {
        r.e(elements, "elements");
        this.f23573a.f();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> elements) {
        r.e(elements, "elements");
        this.f23573a.f();
        return super.retainAll(elements);
    }
}
