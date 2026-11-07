package m6;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f17668a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f17669b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f17670c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f17671d;

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
            return b.c();
        }
        try {
            if (f17669b == null) {
                f17668a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f17669b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f17669b.invoke(null, Long.valueOf(f17668a))).booleanValue();
        } catch (Exception e10) {
            a("isTagEnabled", e10);
            return false;
        }
    }

    public static String c(String str) {
        return str.length() <= 127 ? str : str.substring(0, CertificateBody.profileType);
    }
}
