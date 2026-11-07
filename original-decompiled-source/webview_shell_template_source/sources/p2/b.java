package p2;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.camera.camera2.internal.k0;
import androidx.work.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    public static final String f14064i = k.e("BatteryNotLowTracker");

    @Override // p2.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f14069b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        k.c().b(f14064i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // p2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p2.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        k.c().a(f14064i, k0.a("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
