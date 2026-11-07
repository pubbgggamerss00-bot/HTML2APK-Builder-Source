package f5;

import f5.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d<K, V> extends a<Map.Entry<K, V>, K, V> {
    public final c<K, V> s;

    public d(c<K, V> cVar) {
        this.s = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        j.e("element", (Map.Entry) obj);
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        j.e("elements", collection);
        throw new UnsupportedOperationException();
    }

    @Override // e5.f
    public final int c() {
        return this.s.A;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        j.e("elements", collection);
        return this.s.d(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.s.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        c<K, V> cVar = this.s;
        cVar.getClass();
        return new c.b(cVar);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        j.e("elements", collection);
        this.s.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        j.e("elements", collection);
        this.s.b();
        return super.retainAll(collection);
    }
}
