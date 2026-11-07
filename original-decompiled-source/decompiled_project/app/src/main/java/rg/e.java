package rg;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import qg.i;
import rg.c;

/* loaded from: classes2.dex */
public final class e<E> extends i<E> {

    /* renamed from: a, reason: collision with root package name */
    public final c<E, ?> f23572a;

    public e(c<E, ?> cVar) {
        this.f23572a = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        r.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // qg.i
    public final int c() {
        return this.f23572a.f23559j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23572a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23572a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23572a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        c<E, ?> cVar = this.f23572a;
        cVar.getClass();
        return new c.e(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        c<E, ?> cVar = this.f23572a;
        cVar.f();
        int iK = cVar.k(obj);
        if (iK < 0) {
            return false;
        }
        cVar.p(iK);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> elements) {
        r.e(elements, "elements");
        this.f23572a.f();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> elements) {
        r.e(elements, "elements");
        this.f23572a.f();
        return super.retainAll(elements);
    }
}
