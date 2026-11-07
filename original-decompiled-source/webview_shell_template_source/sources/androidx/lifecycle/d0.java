package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Class<?>> f1289a = e5.l.c(Application.class, y.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List<Class<?>> f1290b = e5.k.a(y.class);

    public static final Constructor a(List list, Class cls) throws SecurityException {
        kotlin.jvm.internal.j.e("signature", list);
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.j.d("modelClass.constructors", constructors);
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.j.d("constructor.parameterTypes", parameterTypes);
            int length = parameterTypes.length;
            List arrayList = length != 0 ? length != 1 ? new ArrayList(new e5.g(parameterTypes)) : e5.k.a(parameterTypes[0]) : e5.s.s;
            if (list.equals(arrayList)) {
                return constructor;
            }
            if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends f0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Failed to access " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e8.getCause());
        }
    }
}
