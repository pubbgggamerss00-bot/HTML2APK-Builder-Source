package f5;

import f5.c;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g<E> extends e5.f<E> implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    public static final g f13074t;
    public final c<E, ?> s;

    static {
        c cVar = c.F;
        f13074t = new g(c.F);
    }

    public g(c<E, ?> cVar) {
        j.e("backing", cVar);
        this.s = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e6) {
        return this.s.a(e6) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        j.e("elements", collection);
        this.s.b();
        return super.addAll(collection);
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
    public final boolean contains(Object obj) {
        return this.s.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.s.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        c<E, ?> cVar = this.s;
        cVar.getClass();
        return new c.e(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        c<E, ?> cVar = this.s;
        cVar.b();
        int iG = cVar.g(obj);
        if (iG < 0) {
            return false;
        }
        cVar.k(iG);
        return true;
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
