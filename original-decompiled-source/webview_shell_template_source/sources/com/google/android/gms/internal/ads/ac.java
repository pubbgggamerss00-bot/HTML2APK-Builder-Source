package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.camera.core.CameraInfo;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2645a = Log.isLoggable("Volley", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final String f2646b = ac.class.getName();

    public static void a(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f2645a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static String d(String str, Object... objArr) {
        String strD;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i6 = 2;
        while (true) {
            if (i6 >= stackTrace.length) {
                strD = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
                break;
            }
            if (!stackTrace[i6].getClassName().equals(f2646b)) {
                String className = stackTrace[i6].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                strD = androidx.activity.m.d(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".", stackTrace[i6].getMethodName());
                break;
            }
            i6++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append("] ");
        sb.append(strD);
        return androidx.activity.m.e(sb, ": ", str2);
    }
}
