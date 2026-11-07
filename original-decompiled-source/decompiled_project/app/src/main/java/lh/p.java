package lh;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p<T, R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    public final g<T> f17089a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<T, R> f17090b;

    public static final class a implements Iterator<R>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f17091a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<T, R> f17092b;

        public a(p<T, R> pVar) {
            this.f17092b = pVar;
            this.f17091a = pVar.f17089a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f17091a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f17092b.f17090b.invoke(this.f17091a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(g<? extends T> gVar, eh.l<? super T, ? extends R> lVar) {
        this.f17089a = gVar;
        this.f17090b = lVar;
    }

    @Override // lh.g
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
