package lh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final g<T> f17083a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<T, Boolean> f17084b;

    public static final class a implements Iterator<T>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f17085a;

        /* renamed from: b, reason: collision with root package name */
        public int f17086b = -1;

        /* renamed from: c, reason: collision with root package name */
        public T f17087c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o<T> f17088d;

        public a(o<T> oVar) {
            this.f17088d = oVar;
            this.f17085a = oVar.f17083a.iterator();
        }

        public final void c() {
            Iterator<T> it = this.f17085a;
            if (it.hasNext()) {
                T next = it.next();
                if (this.f17088d.f17084b.invoke(next).booleanValue()) {
                    this.f17086b = 1;
                    this.f17087c = next;
                    return;
                }
            }
            this.f17086b = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f17086b == -1) {
                c();
            }
            return this.f17086b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f17086b == -1) {
                c();
            }
            if (this.f17086b == 0) {
                throw new NoSuchElementException();
            }
            T t3 = this.f17087c;
            this.f17087c = null;
            this.f17086b = -1;
            return t3;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(g<? extends T> gVar, eh.l<? super T, Boolean> lVar) {
        this.f17083a = gVar;
        this.f17084b = lVar;
    }

    @Override // lh.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
