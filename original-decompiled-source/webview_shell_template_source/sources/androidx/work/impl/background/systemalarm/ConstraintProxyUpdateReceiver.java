package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.camera.camera2.internal.k0;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.k;
import s2.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1805a = k.e("ConstrntProxyUpdtRecvr");

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public final /* synthetic */ Intent s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f1806t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f1807u;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.s = intent;
            this.f1806t = context;
            this.f1807u = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f1807u;
            Context context = this.f1806t;
            Intent intent = this.s;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                k.c().a(ConstraintProxyUpdateReceiver.f1805a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                h.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                h.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                h.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                h.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            j2.k.b(context).f13477d.a(new a(intent, context, goAsync()));
        } else {
            k.c().a(f1805a, k0.a("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
