package rg;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import qg.i;
import rg.c;

/* loaded from: classes2.dex */
public final class g<E> extends i<E> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final g f23574b;

    /* renamed from: a, reason: collision with root package name */
    public final c<E, ?> f23575a;

    static {
        c cVar = c.f23550p;
        f23574b = new g(c.f23550p);
    }

    public g(c<E, ?> backing) {
        r.e(backing, "backing");
        this.f23575a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        return this.f23575a.c(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        r.e(elements, "elements");
        this.f23575a.f();
        return super.addAll(elements);
    }

    @Override // qg.i
    public final int c() {
        return this.f23575a.f23559j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23575a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23575a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23575a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        c<E, ?> cVar = this.f23575a;
        cVar.getClass();
        return new c.e(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        c<E, ?> cVar = this.f23575a;
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
        this.f23575a.f();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> elements) {
        r.e(elements, "elements");
        this.f23575a.f();
        return super.retainAll(elements);
    }

    public g() {
        this(new c());
    }
}
