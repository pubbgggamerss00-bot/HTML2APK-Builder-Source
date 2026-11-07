package androidx.lifecycle;

import androidx.lifecycle.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f2251c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2252a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2253b = new HashMap();

    @Deprecated
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f2254a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f2255b;

        public a(HashMap map) {
            this.f2255b = map;
            for (Map.Entry entry : map.entrySet()) {
                l.a aVar = (l.a) entry.getValue();
                List arrayList = (List) this.f2254a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f2254a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        public static void a(List<b> list, t tVar, l.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    Method method = bVar.f2257b;
                    try {
                        int i10 = bVar.f2256a;
                        if (i10 == 0) {
                            method.invoke(obj, null);
                        } else if (i10 == 1) {
                            method.invoke(obj, tVar);
                        } else if (i10 == 2) {
                            method.invoke(obj, tVar, aVar);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2256a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f2257b;

        public b(int i10, Method method) throws SecurityException {
            this.f2256a = i10;
            this.f2257b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2256a == bVar.f2256a && this.f2257b.getName().equals(bVar.f2257b.getName());
        }

        public final int hashCode() {
            return this.f2257b.getName().hashCode() + (this.f2256a * 31);
        }
    }

    public static void b(HashMap map, b bVar, l.a aVar, Class cls) {
        l.a aVar2 = (l.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f2257b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    public final a a(Class<?> cls, Method[] methodArr) throws SecurityException {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f2252a;
        if (superclass != null) {
            a aVarA = (a) map2.get(superclass);
            if (aVarA == null) {
                aVarA = a(superclass, null);
            }
            map.putAll(aVarA.f2255b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVarA2 = (a) map2.get(cls2);
            if (aVarA2 == null) {
                aVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : aVarA2.f2255b.entrySet()) {
                b(map, (b) entry.getKey(), (l.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            c0 c0Var = (c0) method.getAnnotation(c0.class);
            if (c0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                l.a aVarValue = c0Var.value();
                if (parameterTypes.length > 1) {
                    if (!l.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != l.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        map2.put(cls, aVar);
        this.f2253b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }
}
