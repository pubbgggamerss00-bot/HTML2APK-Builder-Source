package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.n10;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            n10 n10VarZzo = zzbc.zza().zzo(this, new dy());
            if (n10VarZzo == null) {
                zzo.zzg("OfflineUtils is null");
            } else {
                n10VarZzo.u(getIntent());
            }
        } catch (RemoteException e6) {
            zzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e6.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
