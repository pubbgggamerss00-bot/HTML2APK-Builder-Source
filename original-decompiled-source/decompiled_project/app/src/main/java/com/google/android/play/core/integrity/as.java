package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import kc.b0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class as extends kc.z {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f6523a;

    /* renamed from: b, reason: collision with root package name */
    final kc.e f6524b;

    /* renamed from: c, reason: collision with root package name */
    private final b0 f6525c = new b0("RequestDialogCallbackImpl");

    /* renamed from: d, reason: collision with root package name */
    private final String f6526d;

    /* renamed from: e, reason: collision with root package name */
    private final k f6527e;

    /* renamed from: f, reason: collision with root package name */
    private final Activity f6528f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, kc.e eVar) {
        this.f6526d = context.getPackageName();
        this.f6527e = kVar;
        this.f6523a = taskCompletionSource;
        this.f6528f = activity;
        this.f6524b = eVar;
    }

    @Override // kc.a0
    public final void b(Bundle bundle) {
        this.f6524b.d(this.f6523a);
        this.f6525c.b("onRequestDialog(%s)", this.f6526d);
        com.google.android.gms.common.api.b bVarA = this.f6527e.a(bundle);
        if (bVarA != null) {
            this.f6523a.trySetException(bVarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            b0 b0Var = this.f6525c;
            Object[] objArr = {this.f6526d};
            b0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", b0.c(b0Var.f16263a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f6523a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f6528f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(PKIFailureInfo.duplicateCertReq);
        intent.putExtra("result_receiver", new ar(this, this.f6524b.a()));
        b0 b0Var2 = this.f6525c;
        Object[] objArr2 = new Object[0];
        b0Var2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", b0.c(b0Var2.f16263a, "Starting dialog intent...", objArr2));
        }
        this.f6528f.startActivityForResult(intent, 0);
    }
}
