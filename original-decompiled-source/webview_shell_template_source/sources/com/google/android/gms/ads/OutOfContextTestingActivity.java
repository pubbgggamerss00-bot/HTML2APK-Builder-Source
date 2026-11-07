package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.internal.ads.dy;
import k3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    public static final String AD_UNIT_KEY = "adUnit";
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzdu zzduVarZzh = zzbc.zza().zzh(this, new dy());
        if (zzduVarZzh == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(AD_UNIT_KEY);
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzduVarZzh.zze(stringExtra, new b(this), new b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
