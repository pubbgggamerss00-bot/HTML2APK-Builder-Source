package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import b.k;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import e.c;
import f.h;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends k {

    /* renamed from: a, reason: collision with root package name */
    public c f5597a;

    /* renamed from: b, reason: collision with root package name */
    public c f5598b;

    /* renamed from: c, reason: collision with root package name */
    public c f5599c;

    /* renamed from: d, reason: collision with root package name */
    public ResultReceiver f5600d;

    /* renamed from: e, reason: collision with root package name */
    public ResultReceiver f5601e;

    /* renamed from: f, reason: collision with root package name */
    public ResultReceiver f5602f;

    @Override // b.k, o3.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5597a = registerForActivityResult(new h(), new e.b() { // from class: d8.w0
            @Override // e.b
            public final void a(Object obj) {
                e.a aVar = (e.a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.f7567a;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f8087b;
                int i10 = zzc.zzh(intent, "ProxyBillingActivityV2").f5606a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.f5600d;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar.f8086a;
                if (i11 != -1 || i10 != 0) {
                    zzc.zzn("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.f5598b = registerForActivityResult(new h(), new e.b() { // from class: d8.x0
            @Override // e.b
            public final void a(Object obj) {
                e.a aVar = (e.a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.f7571a;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f8087b;
                int i10 = zzc.zzh(intent, "ProxyBillingActivityV2").f5606a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.f5601e;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar.f8086a;
                if (i11 != -1 || i10 != 0) {
                    zzc.zzn("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.f5599c = registerForActivityResult(new h(), new e.b() { // from class: d8.y0
            @Override // e.b
            public final void a(Object obj) {
                e.a aVar = (e.a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.f7574a;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f8087b;
                int i10 = aVar.f8086a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i10 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    zzc.zzn("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", zzie.ERROR_IN_ACTIVITY_RESULT.zza());
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                }
                int i11 = zzc.zzh(intent, "ProxyBillingActivityV2").f5606a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.f5602f;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, extras);
                } else {
                    zzc.zzn("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i11 != 0) {
                    zzc.zzn("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f5600d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f5601e = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f5602f = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f5600d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            c cVar = this.f5597a;
            r.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            r.d(intentSender, "pendingIntent.intentSender");
            cVar.a(new e.k(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f5601e = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            c cVar2 = this.f5598b;
            r.e(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            r.d(intentSender2, "pendingIntent.intentSender");
            cVar2.a(new e.k(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f5602f = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            c cVar3 = this.f5599c;
            r.e(pendingIntent3, "pendingIntent");
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            r.d(intentSender3, "pendingIntent.intentSender");
            cVar3.a(new e.k(intentSender3, null, 0, 0));
        }
    }

    @Override // b.k, o3.d, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5600d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f5601e;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f5602f;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
