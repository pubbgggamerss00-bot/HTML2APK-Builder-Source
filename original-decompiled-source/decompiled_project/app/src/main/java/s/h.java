package s;

import s.s;

/* loaded from: classes.dex */
public interface h<T, V extends s> {
    boolean a();

    long b();

    n2<T, V> c();

    V d(long j10);

    default boolean e(long j10) {
        return j10 >= b();
    }

    T f(long j10);

    T g();
}
