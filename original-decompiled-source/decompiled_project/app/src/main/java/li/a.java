package li;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: classes3.dex */
public final class a {
    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
