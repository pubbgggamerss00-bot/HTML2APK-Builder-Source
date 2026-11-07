package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Class<?>> f2351a = qg.p.j(Application.class, l0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List<Class<?>> f2352b = c0.g0.c(l0.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> signature) {
        kotlin.jvm.internal.r.e(signature, "signature");
        kotlin.jvm.internal.b bVarE = f3.f.e(cls.getConstructors());
        while (bVarE.hasNext()) {
            Constructor<T> constructor = (Constructor) bVarE.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.r.d(parameterTypes, "getParameterTypes(...)");
            List listB = qg.o.B(parameterTypes);
            if (signature.equals(listB)) {
                return constructor;
            }
            if (signature.size() == listB.size() && listB.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends w0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(ae.e.a(cls, "A ", " cannot be instantiated."), e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
