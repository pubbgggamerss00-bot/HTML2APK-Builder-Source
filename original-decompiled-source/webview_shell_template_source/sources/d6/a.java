package d6;

import i2.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: d6.a$a, reason: collision with other inner class name */
    public static class C0048a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final h f12746a;

        public C0048a(h hVar) {
            this.f12746a = hVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return Class.forName(method.getDeclaringClass().getName(), true, h.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f12746a, objArr);
            } catch (InvocationTargetException e6) {
                throw e6.getTargetException();
            } catch (ReflectiveOperationException e7) {
                throw new RuntimeException("Reflection failed for method " + method, e7);
            }
        }
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
