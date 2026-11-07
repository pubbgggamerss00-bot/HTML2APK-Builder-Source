package kotlin.jvm.internal;

import androidx.camera.camera2.internal.i0;
import androidx.camera.camera2.internal.v0;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        f(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void c(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        f(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void d(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        f(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void e(String str, Object obj) {
        if (obj != null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = j.class.getName();
        int i6 = 0;
        while (!stackTrace[i6].getClassName().equals(name)) {
            i6++;
        }
        while (stackTrace[i6].getClassName().equals(name)) {
            i6++;
        }
        StackTraceElement stackTraceElement = stackTrace[i6];
        StringBuilder sbA = i0.a("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbA.append(str);
        NullPointerException nullPointerException = new NullPointerException(sbA.toString());
        f(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i6 = -1;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(stackTrace[i7].getClassName())) {
                i6 = i7;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i6 + 1, length));
    }

    public static void g(String str) {
        d5.i iVar = new d5.i(v0.b("lateinit property ", str, " has not been initialized"));
        f(iVar, j.class.getName());
        throw iVar;
    }
}
