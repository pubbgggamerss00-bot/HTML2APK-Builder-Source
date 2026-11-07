package androidx.lifecycle;

import androidx.lifecycle.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1276c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1277a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1278b = new HashMap();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Deprecated
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f1279a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f1280b;

        public a(HashMap map) {
            this.f1280b = map;
            for (Map.Entry entry : map.entrySet()) {
                h.a aVar = (h.a) entry.getValue();
                List arrayList = (List) this.f1279a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f1279a.put(aVar, arrayList);
                }
                arrayList.add((C0014b) entry.getKey());
            }
        }

        public static void a(List list, m mVar, h.a aVar, l lVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0014b c0014b = (C0014b) list.get(size);
                    Method method = c0014b.f1282b;
                    try {
                        int i6 = c0014b.f1281a;
                        if (i6 == 0) {
                            method.invoke(lVar, null);
                        } else if (i6 == 1) {
                            method.invoke(lVar, mVar);
                        } else if (i6 == 2) {
                            method.invoke(lVar, mVar, aVar);
                        }
                    } catch (IllegalAccessException e6) {
                        throw new RuntimeException(e6);
                    } catch (InvocationTargetException e7) {
                        throw new RuntimeException("Failed to call observer method", e7.getCause());
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    public static final class C0014b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1281a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f1282b;

        public C0014b(int i6, Method method) throws SecurityException {
            this.f1281a = i6;
            this.f1282b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0014b)) {
                return false;
            }
            C0014b c0014b = (C0014b) obj;
            return this.f1281a == c0014b.f1281a && this.f1282b.getName().equals(c0014b.f1282b.getName());
        }

        public final int hashCode() {
            return this.f1282b.getName().hashCode() + (this.f1281a * 31);
        }
    }

    public static void b(HashMap map, C0014b c0014b, h.a aVar, Class cls) {
        h.a aVar2 = (h.a) map.get(c0014b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0014b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0014b.f1282b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    public final a a(Class<?> cls, Method[] methodArr) throws SecurityException {
        int i6;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1277a;
        if (superclass != null) {
            a aVarA = (a) map2.get(superclass);
            if (aVarA == null) {
                aVarA = a(superclass, null);
            }
            map.putAll(aVarA.f1280b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVarA2 = (a) map2.get(cls2);
            if (aVarA2 == null) {
                aVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : aVarA2.f1280b.entrySet()) {
                b(map, (C0014b) entry.getKey(), (h.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            t tVar = (t) method.getAnnotation(t.class);
            if (tVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i6 = 0;
                } else {
                    if (!m.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i6 = 1;
                }
                h.a aVarValue = tVar.value();
                if (parameterTypes.length > 1) {
                    if (!h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i6 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0014b(i6, method), aVarValue, cls);
                z6 = true;
            }
        }
        a aVar = new a(map);
        map2.put(cls, aVar);
        this.f1278b.put(cls, Boolean.valueOf(z6));
        return aVar;
    }
}
