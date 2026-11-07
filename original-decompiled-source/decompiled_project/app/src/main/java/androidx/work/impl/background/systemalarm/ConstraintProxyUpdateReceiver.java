package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import d7.p;
import t6.s;
import u6.t0;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3142a = s.f("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f3143a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3144b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f3145c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3143a = intent;
            this.f3144b = context;
            this.f3145c = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f3145c;
            Context context = this.f3144b;
            Intent intent = this.f3143a;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                s.d().a(ConstraintProxyUpdateReceiver.f3142a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                p.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                p.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                p.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                p.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            t0.b(context).f29339d.d(new a(intent, context, goAsync()));
            return;
        }
        s.d().a(f3142a, "Ignoring unknown action " + action);
    }
}
