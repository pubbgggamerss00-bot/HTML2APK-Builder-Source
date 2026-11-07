package c5;

import c5.h;
import p.b1;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final b1<ClassLoader, b1<String, Class<?>>> f4978a = new b1<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        b1<ClassLoader, b1<String, Class<?>>> b1Var = f4978a;
        b1<String, Class<?>> b1Var2 = b1Var.get(classLoader);
        if (b1Var2 == null) {
            b1Var2 = new b1<>();
            b1Var.put(classLoader, b1Var2);
        }
        Class<?> cls = b1Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        b1Var2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends h> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new h.e(i8.n.d("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new h.e(i8.n.d("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public h a(String str) {
        throw null;
    }
}
