package c1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final f<K, V> f4572a;

    public h(f<K, V> fVar) {
        this.f4572a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // qg.i
    public final int c() {
        f<K, V> fVar = this.f4572a;
        fVar.getClass();
        return fVar.f4567f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4572a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f4572a);
    }
}
