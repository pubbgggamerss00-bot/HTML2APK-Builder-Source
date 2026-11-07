package d7;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7404a;

    static {
        String strF = t6.s.f("WakeLocks");
        kotlin.jvm.internal.r.d(strF, "tagWithPrefix(\"WakeLocks\")");
        f7404a = strF;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (v.f7405a) {
            v.f7406b.put(wakeLock, strConcat);
        }
        kotlin.jvm.internal.r.d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
