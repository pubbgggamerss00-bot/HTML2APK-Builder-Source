package q1;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static Method f21747a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f21748b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21749c;

    public static void a(Canvas canvas, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f21749c) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f21747a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f21748b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f21747a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f21748b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f21747a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f21748b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f21749c = true;
        }
        if (z10) {
            try {
                Method method4 = f21747a;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f21748b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
