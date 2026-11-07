package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import t6.s;
import u6.t0;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3146a = s.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        s.d().a(f3146a, "Received intent " + intent);
        try {
            t0 t0VarB = t0.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            t0VarB.getClass();
            synchronized (t0.f29335m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = t0VarB.f29344i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    t0VarB.f29344i = pendingResultGoAsync;
                    if (t0VarB.f29343h) {
                        pendingResultGoAsync.finish();
                        t0VarB.f29344i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e10) {
            s.d().c(f3146a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
