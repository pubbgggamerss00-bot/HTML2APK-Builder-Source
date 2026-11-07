package d1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c<E> implements Iterator<E>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f7316a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<E, a> f7317b;

    /* renamed from: c, reason: collision with root package name */
    public int f7318c;

    public c(Object obj, Map<E, a> map) {
        this.f7316a = obj;
        this.f7317b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7318c < this.f7317b.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e10 = (E) this.f7316a;
        this.f7318c++;
        a aVar = this.f7317b.get(e10);
        if (aVar != null) {
            this.f7316a = aVar.f7311b;
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
