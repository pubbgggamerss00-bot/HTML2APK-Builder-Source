package c1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l<K, V> extends qg.f<V> {

    /* renamed from: a, reason: collision with root package name */
    public final f<K, V> f4575a;

    public l(f<K, V> fVar) {
        this.f4575a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // qg.f
    public final int c() {
        f<K, V> fVar = this.f4575a;
        fVar.getClass();
        return fVar.f4567f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f4575a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4575a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new z();
        }
        return new m(this.f4575a, uVarArr);
    }
}
