package c1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j<K, V> extends qg.i<K> {

    /* renamed from: a, reason: collision with root package name */
    public final f<K, V> f4574a;

    public j(f<K, V> fVar) {
        this.f4574a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // qg.i
    public final int c() {
        f<K, V> fVar = this.f4574a;
        fVar.getClass();
        return fVar.f4567f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4574a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4574a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new w();
        }
        return new k(this.f4574a, uVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f<K, V> fVar = this.f4574a;
        if (!fVar.containsKey(obj)) {
            return false;
        }
        fVar.remove(obj);
        return true;
    }
}
