package z5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import d5.d;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            objA = new c(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objA = d5.e.a(th);
        }
        if (objA instanceof d.a) {
            objA = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            j.c("null cannot be cast to non-null type android.os.Handler", objInvoke);
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
