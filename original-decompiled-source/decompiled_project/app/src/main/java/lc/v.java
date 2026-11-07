package lc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f16973a;

    static {
        Object objA = a();
        f16973a = objA;
        Method method = null;
        if (objA != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e10) {
                throw e10;
            } catch (Throwable unused) {
            }
        }
        if (objA == null) {
            return;
        }
        try {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (Throwable unused2) {
            }
            if (method == null) {
                return;
            }
            method.invoke(a(), new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused3) {
        }
    }

    public static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }
}
