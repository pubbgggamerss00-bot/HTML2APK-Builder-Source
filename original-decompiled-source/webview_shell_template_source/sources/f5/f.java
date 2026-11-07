package f5;

import f5.c;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f<V> extends e5.d<V> {
    public final c<?, V> s;

    public f(c<?, V> cVar) {
        this.s = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        j.e("elements", collection);
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.s.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.s.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        c<?, V> cVar = this.s;
        cVar.getClass();
        return new c.f(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c<?, V> cVar = this.s;
        cVar.b();
        int iH = cVar.h(obj);
        if (iH < 0) {
            return false;
        }
        cVar.k(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        j.e("elements", collection);
        this.s.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        j.e("elements", collection);
        this.s.b();
        return super.retainAll(collection);
    }
}
