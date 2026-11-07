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
import com.google.android.gms.internal.base.zau;

/* loaded from: classes2.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5901b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f5902a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5902a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.g gVarH = com.google.android.gms.common.api.internal.g.h(this);
                if (i11 == -1) {
                    zau zauVar = gVarH.f5981n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                } else if (i11 == 0) {
                    gVarH.i(new pa.a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f5902a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f5902a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5902a = bundle.getInt("resolution");
        }
        if (this.f5902a == 1) {
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
            com.google.android.gms.common.internal.p.f(num);
            pa.d.f21387d.d(this, num.intValue(), this);
            this.f5902a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f5902a = 1;
            } catch (ActivityNotFoundException e10) {
                e = e10;
                if (extras.getBoolean("notify_manager", true)) {
                    com.google.android.gms.common.api.internal.g.h(this).i(new pa.a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strD = i8.n.d("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strD = strD.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strD, e);
                }
                googleApiActivity.f5902a = 1;
                finish();
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e12) {
            e = e12;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e13) {
            e = e13;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5902a);
        super.onSaveInstanceState(bundle);
    }
}
