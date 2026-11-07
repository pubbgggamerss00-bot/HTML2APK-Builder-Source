package lh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class e<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final g<T> f17063a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17064b;

    /* renamed from: c, reason: collision with root package name */
    public final eh.l<T, Boolean> f17065c;

    public static final class a implements Iterator<T>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f17066a;

        /* renamed from: b, reason: collision with root package name */
        public int f17067b = -1;

        /* renamed from: c, reason: collision with root package name */
        public T f17068c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e<T> f17069d;

        public a(e<T> eVar) {
            this.f17069d = eVar;
            this.f17066a = eVar.f17063a.iterator();
        }

        public final void c() {
            T next;
            e<T> eVar;
            do {
                Iterator<T> it = this.f17066a;
                if (!it.hasNext()) {
                    this.f17067b = 0;
                    return;
                } else {
                    next = it.next();
                    eVar = this.f17069d;
                }
            } while (eVar.f17065c.invoke(next).booleanValue() != eVar.f17064b);
            this.f17068c = next;
            this.f17067b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f17067b == -1) {
                c();
            }
            return this.f17067b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f17067b == -1) {
                c();
            }
            if (this.f17067b == 0) {
                throw new NoSuchElementException();
            }
            T t3 = this.f17068c;
            this.f17068c = null;
            this.f17067b = -1;
            return t3;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends T> gVar, boolean z10, eh.l<? super T, Boolean> lVar) {
        this.f17063a = gVar;
        this.f17064b = z10;
        this.f17065c = lVar;
    }

    @Override // lh.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
