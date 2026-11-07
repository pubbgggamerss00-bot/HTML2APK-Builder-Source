package u0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y<T> implements Iterator<T>, q5.a {
    public final p5.l<T, Iterator<T>> s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f14590t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public Iterator<? extends T> f14591u;

    public y(j0 j0Var, p5.l lVar) {
        this.s = lVar;
        this.f14591u = j0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14591u.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.f14591u.next();
        Iterator<T> itInvoke = this.s.invoke(next);
        ArrayList arrayList = this.f14590t;
        if (itInvoke != null && itInvoke.hasNext()) {
            arrayList.add(this.f14591u);
            this.f14591u = itInvoke;
            return next;
        }
        while (!this.f14591u.hasNext() && !arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            this.f14591u = (Iterator) arrayList.get(e5.l.b(arrayList));
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            arrayList.remove(e5.l.b(arrayList));
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
