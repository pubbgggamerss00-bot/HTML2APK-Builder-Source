package nc;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class k<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    public final lc.j<Iterable<E>> f18706a;

    public static class a extends k<E> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f18707b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f18707b = iterable2;
        }

        @Override // java.lang.Iterable
        public final Iterator<E> iterator() {
            return this.f18707b.iterator();
        }
    }

    public k() {
        this.f18706a = lc.a.f16932a;
    }

    public static <E> k<E> a(Iterable<E> iterable) {
        return iterable instanceof k ? (k) iterable : new a(iterable, iterable);
    }

    public final String toString() {
        Iterator it = ((Iterable) this.f18706a.a(this)).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(it.next());
            z10 = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public k(Iterable<E> iterable) {
        iterable.getClass();
        iterable = this == iterable ? null : iterable;
        this.f18706a = iterable == null ? lc.a.f16932a : new lc.n(iterable);
    }
}
