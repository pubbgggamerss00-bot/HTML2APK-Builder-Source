package androidx.camera.core;

import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class Logger {
    static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    private Logger() {
    }

    public static void d(String str, String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 3)) {
            Log.d(strTruncateTag, str2);
        }
    }

    public static void e(String str, String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 6)) {
            Log.e(strTruncateTag, str2);
        }
    }

    public static int getMinLogLevel() {
        return sMinLogLevel;
    }

    public static void i(String str, String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 4)) {
            Log.i(strTruncateTag, str2);
        }
    }

    public static boolean isDebugEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 3);
    }

    public static boolean isErrorEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 6);
    }

    public static boolean isInfoEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 4);
    }

    private static boolean isLogLevelEnabled(String str, int i6) {
        return sMinLogLevel <= i6 || Log.isLoggable(str, i6);
    }

    public static boolean isVerboseEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 2);
    }

    public static boolean isWarnEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 5);
    }

    public static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    public static void setMinLogLevel(int i6) {
        sMinLogLevel = i6;
    }

    private static String truncateTag(String str) {
        return (Build.VERSION.SDK_INT > 25 || MAX_TAG_LENGTH >= str.length()) ? str : str.substring(0, MAX_TAG_LENGTH);
    }

    public static void w(String str, String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 5)) {
            Log.w(strTruncateTag, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 3)) {
            Log.d(strTruncateTag, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 6)) {
            Log.e(strTruncateTag, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 4)) {
            Log.i(strTruncateTag, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 5)) {
            Log.w(strTruncateTag, str2, th);
        }
    }
}
