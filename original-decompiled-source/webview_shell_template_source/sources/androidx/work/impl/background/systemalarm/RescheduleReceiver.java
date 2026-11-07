package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1808a = k.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        k.c().a(f1808a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            j2.k kVarB = j2.k.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            kVarB.getClass();
            synchronized (j2.k.f13473l) {
                try {
                    kVarB.f13481i = pendingResultGoAsync;
                    if (kVarB.h) {
                        pendingResultGoAsync.finish();
                        kVarB.f13481i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e6) {
            k.c().b(f1808a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e6);
        }
    }
}
