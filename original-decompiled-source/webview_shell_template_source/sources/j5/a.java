package j5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class a {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: j5.a$a, reason: collision with other inner class name */
    public static final class C0069a {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f13503a;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            j.b(methods);
            int length = methods.length;
            int i6 = 0;
            while (true) {
                method = null;
                if (i6 >= length) {
                    break;
                }
                Method method2 = methods[i6];
                if (j.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    j.d("getParameterTypes(...)", parameterTypes);
                    if (j.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i6++;
            }
            f13503a = method;
            int length2 = methods.length;
            for (int i7 = 0; i7 < length2 && !j.a(methods[i7].getName(), "getSuppressed"); i7++) {
            }
        }
    }

    public void a(Throwable th, Throwable th2) {
        j.e("cause", th);
        j.e("exception", th2);
        Method method = C0069a.f13503a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
