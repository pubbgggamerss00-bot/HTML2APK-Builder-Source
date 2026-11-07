package lh;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class f<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final eh.a<T> f17070a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<T, T> f17071b;

    public static final class a implements Iterator<T>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public T f17072a;

        /* renamed from: b, reason: collision with root package name */
        public int f17073b = -2;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f<T> f17074c;

        public a(f<T> fVar) {
            this.f17074c = fVar;
        }

        public final void c() {
            T tInvoke;
            int i10 = this.f17073b;
            f<T> fVar = this.f17074c;
            if (i10 == -2) {
                tInvoke = fVar.f17070a.invoke();
            } else {
                eh.l<T, T> lVar = fVar.f17071b;
                T t3 = this.f17072a;
                r.b(t3);
                tInvoke = lVar.invoke(t3);
            }
            this.f17072a = tInvoke;
            this.f17073b = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f17073b < 0) {
                c();
            }
            return this.f17073b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f17073b < 0) {
                c();
            }
            if (this.f17073b == 0) {
                throw new NoSuchElementException();
            }
            T t3 = this.f17072a;
            r.c(t3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f17073b = -1;
            return t3;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(eh.a<? extends T> getInitialValue, eh.l<? super T, ? extends T> getNextValue) {
        r.e(getInitialValue, "getInitialValue");
        r.e(getNextValue, "getNextValue");
        this.f17070a = getInitialValue;
        this.f17071b = getNextValue;
    }

    @Override // lh.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
