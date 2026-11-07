package h1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e0<K, V> extends f0<K, V> implements Iterator<Map.Entry<K, V>>, fh.a {
    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (this.f12118d != null) {
            return new d0(this);
        }
        throw new IllegalStateException();
    }
}
