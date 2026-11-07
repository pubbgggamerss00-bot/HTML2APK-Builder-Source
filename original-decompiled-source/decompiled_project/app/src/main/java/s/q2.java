package s;

import s.s;

/* loaded from: classes.dex */
public interface q2<V extends s> {
    boolean a();

    long b(V v10, V v11, V v12);

    V c(long j10, V v10, V v11, V v12);

    V d(long j10, V v10, V v11, V v12);

    default V g(V v10, V v11, V v12) {
        return (V) c(b(v10, v11, v12), v10, v11, v12);
    }
}
