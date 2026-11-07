package xg;

import java.lang.reflect.Method;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: xg.a$a, reason: collision with other inner class name */
    public static final class C0337a {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f33570a;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            r.b(methods);
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    break;
                }
                Method method2 = methods[i10];
                if (r.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    r.d(parameterTypes, "getParameterTypes(...)");
                    if (r.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i10++;
            }
            f33570a = method;
            int length2 = methods.length;
            for (int i11 = 0; i11 < length2 && !r.a(methods[i11].getName(), "getSuppressed"); i11++) {
            }
        }
    }

    public void a(Throwable cause, Throwable exception) {
        r.e(cause, "cause");
        r.e(exception, "exception");
        Method method = C0337a.f33570a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
