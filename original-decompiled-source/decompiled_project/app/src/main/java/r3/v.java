package r3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q3.e;

/* loaded from: classes.dex */
public class v extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public static Class<?> f23173a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor<?> f23174b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f23175c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f23176d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f23177e = false;

    public static boolean e(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        f();
        try {
            return ((Boolean) f23175c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void f() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f23177e) {
            return;
        }
        f23177e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f23174b = constructor;
        f23173a = cls;
        f23175c = method2;
        f23176d = method;
    }

    @Override // r3.a0
    public Typeface a(Context context, e.b bVar, Resources resources, int i10) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        f();
        try {
            Object objNewInstance = f23174b.newInstance(null);
            for (e.c cVar : bVar.f21877a) {
                File fileC = b0.c(context);
                if (fileC == null) {
                    return null;
                }
                try {
                    if (!b0.a(fileC, resources, cVar.f21883f)) {
                        return null;
                    }
                    if (!e(objNewInstance, fileC.getPath(), cVar.f21879b, cVar.f21880c)) {
                        return null;
                    }
                    fileC.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileC.delete();
                }
            }
            f();
            try {
                Object objNewInstance2 = Array.newInstance(f23173a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f23176d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
