package d2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f12707a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f12708b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f12709c;

    public static void a(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a();
        }
        try {
            if (f12708b == null) {
                f12707a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f12708b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f12708b.invoke(null, Long.valueOf(f12707a))).booleanValue();
        } catch (Exception e6) {
            a("isTagEnabled", e6);
            return false;
        }
    }

    public static void c(int i6, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(i6, d(str));
            return;
        }
        String strD = d(str);
        try {
            if (f12709c == null) {
                f12709c = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f12709c.invoke(null, Long.valueOf(f12707a), strD, Integer.valueOf(i6));
        } catch (Exception e6) {
            a("traceCounter", e6);
        }
    }

    public static String d(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
