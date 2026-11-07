package kotlinx.serialization.internal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlinx.serialization.PolymorphicSerializer;

/* loaded from: classes2.dex */
public final class k0 {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0176, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> zh.b<T> a(Class<T> cls, zh.b<Object>... args) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        zh.b<T> bVar;
        Class<?> cls2;
        Object obj2;
        Object obj3;
        zh.b<T> bVarB;
        Field field;
        zh.g gVar;
        kotlin.jvm.internal.r.e(args, "args");
        if (cls.isEnum() && cls.getAnnotation(zh.g.class) == null && cls.getAnnotation(zh.d.class) == null) {
            T[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            kotlin.jvm.internal.r.d(canonicalName, "getCanonicalName(...)");
            kotlin.jvm.internal.r.c(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
        }
        zh.b[] bVarArr = (zh.b[]) Arrays.copyOf(args, args.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        zh.b<T> bVarB2 = obj == null ? null : b(obj, (zh.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (bVarB2 != null) {
            return bVarB2;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 == null || mh.t.p(canonicalName2, "java.", false) || mh.t.p(canonicalName2, "kotlin.", false)) {
            bVar = null;
        } else {
            Field[] declaredFields = cls.getDeclaredFields();
            kotlin.jvm.internal.r.d(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            Field field2 = null;
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                if (i10 >= length) {
                    if (!z10) {
                        break;
                    }
                } else {
                    Field field3 = declaredFields[i10];
                    if (kotlin.jvm.internal.r.a(field3.getName(), "INSTANCE") && kotlin.jvm.internal.r.a(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        field2 = field3;
                    }
                    i10++;
                }
            }
            if (field2 != null) {
                Object obj4 = field2.get(null);
                Method[] methods = cls.getMethods();
                kotlin.jvm.internal.r.d(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    if (i11 >= length2) {
                        if (!z11) {
                            break;
                        }
                    } else {
                        Method method2 = methods[i11];
                        if (kotlin.jvm.internal.r.a(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            kotlin.jvm.internal.r.d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && kotlin.jvm.internal.r.a(method2.getReturnType(), zh.b.class)) {
                                if (z11) {
                                    break;
                                }
                                z11 = true;
                                method = method2;
                            }
                        }
                        i11++;
                    }
                }
                method = null;
                if (method != null) {
                    Object objInvoke = method.invoke(obj4, null);
                    if (objInvoke instanceof zh.b) {
                        bVar = (zh.b) objInvoke;
                    }
                }
            }
        }
        if (bVar != null) {
            return bVar;
        }
        zh.b[] bVarArr2 = (zh.b[]) Arrays.copyOf(args, args.length);
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        kotlin.jvm.internal.r.d(declaredClasses, "getDeclaredClasses(...)");
        int length3 = declaredClasses.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i12];
            if (cls2.getAnnotation(e0.class) != null) {
                break;
            }
            i12++;
        }
        if (cls2 == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = cls.getDeclaredField(cls2.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
            }
        }
        if (obj2 == null || (bVarB = b(obj2, (zh.b[]) Arrays.copyOf(bVarArr2, bVarArr2.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                kotlin.jvm.internal.r.d(declaredClasses2, "getDeclaredClasses(...)");
                int length4 = declaredClasses2.length;
                Class<?> cls3 = null;
                int i13 = 0;
                boolean z12 = false;
                while (true) {
                    if (i13 < length4) {
                        Class<?> cls4 = declaredClasses2[i13];
                        if (cls4.getSimpleName().equals("$serializer")) {
                            if (z12) {
                                break;
                            }
                            z12 = true;
                            cls3 = cls4;
                        }
                        i13++;
                    } else if (!z12) {
                    }
                }
                obj3 = (cls3 == null || (field = cls3.getField("INSTANCE")) == null) ? null : field.get(null);
            } catch (NoSuchFieldException unused3) {
            }
            bVarB = obj3 instanceof zh.b ? (zh.b) obj3 : null;
        }
        if (bVarB != null) {
            return bVarB;
        }
        if (cls.getAnnotation(zh.d.class) == null && ((gVar = (zh.g) cls.getAnnotation(zh.g.class)) == null || !kotlin.jvm.internal.h0.a(gVar.with()).equals(kotlin.jvm.internal.h0.a(PolymorphicSerializer.class)))) {
            return null;
        }
        return new PolymorphicSerializer(kotlin.jvm.internal.h0.a(cls));
    }

    public static final <T> zh.b<T> b(Object obj, zh.b<Object>... bVarArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = zh.b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (objInvoke instanceof zh.b) {
                return (zh.b) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final <T> boolean c(kh.c<T> cVar) {
        kotlin.jvm.internal.r.e(cVar, "<this>");
        return b3.e.c(cVar).isInterface();
    }
}
