package c1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final g<K, V, Map.Entry<K, V>> f4573a;

    public i(f<K, V> fVar) {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f4573a = new g<>(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4573a.f4561c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f4573a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4573a.remove();
    }
}
