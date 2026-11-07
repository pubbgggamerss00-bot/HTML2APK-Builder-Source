package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import c3.b;
import c3.g;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.util.VisibleForTesting;
import e3.d;
import o3.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f2393t = 0;

    @VisibleForTesting
    public int s = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i6, int i7, Intent intent) {
        super.onActivityResult(i6, i7, intent);
        if (i6 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.s = 0;
            setResult(i7, intent);
            if (booleanExtra) {
                d dVarE = d.e(this);
                if (i7 == -1) {
                    f fVar = dVarE.E;
                    fVar.sendMessage(fVar.obtainMessage(3));
                } else if (i7 == 0) {
                    dVarE.f(new b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i6 == 2) {
            this.s = 0;
            setResult(i7, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.s = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.s = bundle.getInt("resolution");
        }
        if (this.s == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            l.f(num);
            g.f2182d.d(this, num.intValue(), this);
            this.s = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.s = 1;
            } catch (ActivityNotFoundException e6) {
                e = e6;
                if (extras.getBoolean("notify_manager", true)) {
                    d.e(this).f(new b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String string = pendingIntent.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(string);
                    sb.append(".");
                    String string2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        string2 = string2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", string2, e);
                }
                googleApiActivity.s = 1;
                finish();
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e8) {
            e = e8;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e9) {
            e = e9;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.s);
        super.onSaveInstanceState(bundle);
    }
}
