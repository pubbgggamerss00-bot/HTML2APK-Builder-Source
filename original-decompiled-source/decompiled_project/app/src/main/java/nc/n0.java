package nc;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class n0 extends o0<Comparable> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f18723a = new n0();

    @Override // nc.o0
    public final <S extends Comparable> o0<S> c() {
        return y0.f18793a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
