package h1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h0<K, V> extends f0<K, V> implements Iterator<V>, fh.a {
    @Override // java.util.Iterator
    public final V next() {
        Map.Entry<? extends K, ? extends V> entry = this.f12119e;
        if (entry == null) {
            throw new IllegalStateException();
        }
        c();
        return entry.getValue();
    }
}
