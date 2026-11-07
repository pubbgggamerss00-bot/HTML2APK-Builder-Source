package sd;

import java.util.Set;

/* loaded from: classes2.dex */
public interface b {
    default <T> T a(Class<T> cls) {
        return (T) g(y.a(cls));
    }

    default <T> Set<T> b(y<T> yVar) {
        return f(yVar).get();
    }

    <T> fe.a<T> c(y<T> yVar);

    default <T> fe.b<T> d(Class<T> cls) {
        return h(y.a(cls));
    }

    default fe.a e() {
        return c(y.a(nd.b.class));
    }

    <T> fe.b<Set<T>> f(y<T> yVar);

    default <T> T g(y<T> yVar) {
        fe.b<T> bVarH = h(yVar);
        if (bVarH == null) {
            return null;
        }
        return bVarH.get();
    }

    <T> fe.b<T> h(y<T> yVar);
}
