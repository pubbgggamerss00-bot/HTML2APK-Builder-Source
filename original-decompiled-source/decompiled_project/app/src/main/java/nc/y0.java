package nc;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class y0 extends o0<Comparable> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f18793a = new y0();

    @Override // nc.o0
    public final <S extends Comparable> o0<S> c() {
        return n0.f18723a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
