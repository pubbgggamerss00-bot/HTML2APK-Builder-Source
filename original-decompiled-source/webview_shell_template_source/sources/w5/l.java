package w5;

import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l<T, R> implements d<R> {

    /* renamed from: a, reason: collision with root package name */
    public final d<T> f15102a;

    /* renamed from: b, reason: collision with root package name */
    public final p5.l<T, R> f15103b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements Iterator<R>, q5.a {
        public final Iterator<T> s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l<T, R> f15104t;

        public a(l<T, R> lVar) {
            this.f15104t = lVar;
            this.s = lVar.f15102a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.s.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f15104t.f15103b.invoke(this.s.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(d<? extends T> dVar, p5.l<? super T, ? extends R> lVar) {
        this.f15102a = dVar;
        this.f15103b = lVar;
    }

    @Override // w5.d
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
