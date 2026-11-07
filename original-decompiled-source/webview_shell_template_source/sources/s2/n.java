package s2;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14372a = androidx.work.k.e("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f14373b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f14373b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strConcat);
        }
        return wakeLockNewWakeLock;
    }
}
