package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2374a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2375b = new HashMap();

    public static h a(Constructor constructor, s sVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = constructor.newInstance(sVar);
            kotlin.jvm.internal.r.b(objNewInstance);
            return (h) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Class cls) throws NoSuchMethodException, SecurityException {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        kotlin.jvm.internal.b bVarE;
        HashMap map = f2374a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r32 != null ? r32.getName() : "";
                kotlin.jvm.internal.r.b(name);
                if (name.length() != 0) {
                    kotlin.jvm.internal.r.b(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    kotlin.jvm.internal.r.d(canonicalName, "substring(...)");
                }
                kotlin.jvm.internal.r.b(canonicalName);
                String strConcat = mh.t.n(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap map2 = f2375b;
            if (declaredConstructor != null) {
                map2.put(cls, c0.g0.c(declaredConstructor));
            } else {
                c cVar = c.f2251c;
                HashMap map3 = cVar.f2253b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((c0) declaredMethods[i11].getAnnotation(c0.class)) != null) {
                                cVar.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i11++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && s.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.r.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            kotlin.jvm.internal.r.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            bVarE = f3.f.e(cls.getInterfaces());
                            while (true) {
                                if (!bVarE.hasNext()) {
                                    Class cls2 = (Class) bVarE.next();
                                    if (cls2 != null && s.class.isAssignableFrom(cls2)) {
                                        kotlin.jvm.internal.r.b(cls2);
                                        if (b(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        kotlin.jvm.internal.r.b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        bVarE = f3.f.e(cls.getInterfaces());
                        while (true) {
                            if (!bVarE.hasNext()) {
                            }
                        }
                    }
                }
            }
            i10 = 2;
        }
        map.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
