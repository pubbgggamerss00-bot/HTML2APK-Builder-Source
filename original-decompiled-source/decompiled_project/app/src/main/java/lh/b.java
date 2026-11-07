package lh;

import java.util.Iterator;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class b<T> implements g<T>, c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final g<T> f17058a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17059b;

    public static final class a implements Iterator<T>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f17060a;

        /* renamed from: b, reason: collision with root package name */
        public int f17061b;

        public a(b<T> bVar) {
            this.f17060a = bVar.f17058a.iterator();
            this.f17061b = bVar.f17059b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f17061b;
                it = this.f17060a;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f17061b--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f17061b;
                it = this.f17060a;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f17061b--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g<? extends T> sequence, int i10) {
        r.e(sequence, "sequence");
        this.f17058a = sequence;
        this.f17059b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // lh.c
    public final g<T> a(int i10) {
        int i11 = this.f17059b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f17058a, i11);
    }

    @Override // lh.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
