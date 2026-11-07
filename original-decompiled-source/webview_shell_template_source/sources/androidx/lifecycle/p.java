package androidx.lifecycle;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1324a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1325b = new HashMap();

    public static e a(Constructor constructor, l lVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = constructor.newInstance(lVar);
            kotlin.jvm.internal.j.d("{\n            constructo…tance(`object`)\n        }", objNewInstance);
            return (e) objNewInstance;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Class cls) throws NoSuchMethodException, SecurityException {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i6;
        HashMap map = f1324a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i7 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r32 != null ? r32.getName() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                kotlin.jvm.internal.j.d("fullPackage", name);
                if (name.length() != 0) {
                    kotlin.jvm.internal.j.d("name", canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    kotlin.jvm.internal.j.d("this as java.lang.String).substring(startIndex)", canonicalName);
                }
                kotlin.jvm.internal.j.d("if (fullPackage.isEmpty(…g(fullPackage.length + 1)", canonicalName);
                String strConcat = x5.l.m(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
            HashMap map2 = f1325b;
            if (declaredConstructor != null) {
                map2.put(cls, e5.k.a(declaredConstructor));
            } else {
                b bVar = b.f1276c;
                HashMap map3 = bVar.f1278b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length2) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((t) declaredMethods[i8].getAnnotation(t.class)) != null) {
                                bVar.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i8++;
                        }
                    } catch (NoClassDefFoundError e7) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && l.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.j.d("superclass", superclass);
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            kotlin.jvm.internal.j.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            kotlin.jvm.internal.j.d("klass.interfaces", interfaces);
                            length = interfaces.length;
                            i6 = 0;
                            while (true) {
                                if (i6 < length) {
                                    Class<?> cls2 = interfaces[i6];
                                    if (cls2 != null && l.class.isAssignableFrom(cls2)) {
                                        kotlin.jvm.internal.j.d("intrface", cls2);
                                        if (b(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        kotlin.jvm.internal.j.b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i6++;
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        kotlin.jvm.internal.j.d("klass.interfaces", interfaces2);
                        length = interfaces2.length;
                        i6 = 0;
                        while (true) {
                            if (i6 < length) {
                            }
                            i6++;
                        }
                    }
                }
            }
            i7 = 2;
        }
        map.put(cls, Integer.valueOf(i7));
        return i7;
    }
}
