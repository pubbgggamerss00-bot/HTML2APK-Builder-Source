package g2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p.k0;

/* loaded from: classes.dex */
public interface u1 {

    public static final class a implements Collection<Object>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final p.j0<Object> f11456a;

        public a(int i10) {
            int i11 = p.t0.f20722a;
            this.f11456a = new p.j0<>(6);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.f11456a.b(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f11456a.c();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.f11456a.a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f11456a.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.f11456a.f20718g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            p.j0<Object> j0Var = this.f11456a;
            j0Var.getClass();
            return new k0.a(new p.k0(j0Var));
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f11456a.g(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            return this.f11456a.g(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            return this.f11456a.i(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f11456a.f20718g;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.i.a(this);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.i.b(this, tArr);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
