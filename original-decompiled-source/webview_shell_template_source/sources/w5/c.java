package w5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final p5.a<T> f15093a;

    /* renamed from: b, reason: collision with root package name */
    public final i f15094b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements Iterator<T>, q5.a {
        public T s;

        /* renamed from: t, reason: collision with root package name */
        public int f15095t = -2;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c<T> f15096u;

        public a(c<T> cVar) {
            this.f15096u = cVar;
        }

        public final void a() {
            T tA;
            int i6 = this.f15095t;
            c<T> cVar = this.f15096u;
            if (i6 == -2) {
                tA = cVar.f15093a.a();
            } else {
                i iVar = cVar.f15094b;
                T t6 = this.s;
                kotlin.jvm.internal.j.b(t6);
                tA = (T) iVar.invoke(t6);
            }
            this.s = tA;
            this.f15095t = tA == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f15095t < 0) {
                a();
            }
            return this.f15095t == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f15095t < 0) {
                a();
            }
            if (this.f15095t == 0) {
                throw new NoSuchElementException();
            }
            T t6 = this.s;
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", t6);
            this.f15095t = -1;
            return t6;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(p5.a aVar, i iVar) {
        kotlin.jvm.internal.j.e("getInitialValue", aVar);
        this.f15093a = aVar;
        this.f15094b = iVar;
    }

    @Override // w5.d
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
