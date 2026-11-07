package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import d8.r0;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f5591a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5592b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5593c;

    /* renamed from: d, reason: collision with root package name */
    public int f5594d;

    /* renamed from: e, reason: collision with root package name */
    public long f5595e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5596f;

    public final Intent a(zzie zzieVar, long j10) {
        Intent intentB = b();
        intentB.putExtra("RESPONSE_CODE", 6);
        intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        a.C0062a c0062aA = a.a();
        c0062aA.f5609a = 6;
        c0062aA.f5611c = "An internal error occurred.";
        a aVarA = c0062aA.a();
        int i10 = r0.f7549a;
        intentB.putExtra("FAILURE_LOGGING_PAYLOAD", r0.b(zzieVar, 2, aVarA, null, zzil.BROADCAST_ACTION_UNSPECIFIED).zzM());
        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentB.putExtra("billingClientTransactionId", j10);
        intentB.putExtra("wasServiceAutoReconnected", this.f5596f);
        return intentB;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        Intent intentA;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100 || i10 == 110) {
            int i12 = zzc.zzh(intent, "ProxyBillingActivity").f5606a;
            if (i11 != -1) {
                zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i12);
                if (intent == null) {
                    zzc.zzn("ProxyBillingActivity", "Got null data with resultCode " + i11 + "!");
                    intentA = a(i11 != -1 ? i11 != 0 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? zzie.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzie.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE : zzie.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE : zzie.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE : zzie.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzie.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT, this.f5595e);
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentA = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                        intentA.setPackage(getApplicationContext().getPackageName());
                        intentA.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                        intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        Intent intentB = b();
                        intentB.putExtras(intent.getExtras());
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        intentA = intentB;
                    }
                    intentA.putExtra("billingClientTransactionId", this.f5595e);
                    intentA.putExtra("wasServiceAutoReconnected", this.f5596f);
                } else {
                    zzc.zzn("ProxyBillingActivity", "Got null bundle!");
                    intentA = a(zzie.NULL_BUNDLE_IN_ACTIVITY_RESULT, this.f5595e);
                }
                if (i10 == 110) {
                    intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA);
            } else if (i12 != 0) {
                i11 = -1;
                zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i12);
                if (intent == null) {
                }
                if (i10 == 110) {
                }
                sendBroadcast(intentA);
            } else {
                i11 = -1;
                if (intent == null) {
                }
                if (i10 == 110) {
                }
                sendBroadcast(intentA);
            }
        } else if (i10 == 101) {
            int iZza = zzc.zza(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver = this.f5591a;
            if (resultReceiver != null) {
                resultReceiver.send(iZza, intent == null ? null : intent.getExtras());
            }
        } else {
            zzc.zzn("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.f5592b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f5592b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f5591a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f5593c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f5594d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f5595e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f5596f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f5594d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f5593c = true;
                this.f5594d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f5591a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f5594d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f5595e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f5596f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f5592b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f5594d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            zzc.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f5591a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentA = a(zzie.INTENT_SENDER_EXCEPTION, this.f5595e);
                if (this.f5593c) {
                    intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA);
            }
            this.f5592b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f5592b) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f5593c) {
                intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.f5594d;
            if (i10 == 110 || i10 == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentB.putExtra("billingClientTransactionId", this.f5595e);
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5591a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f5592b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f5593c);
        bundle.putInt("activity_code", this.f5594d);
        bundle.putLong("billingClientTransactionId", this.f5595e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f5596f);
    }
}
