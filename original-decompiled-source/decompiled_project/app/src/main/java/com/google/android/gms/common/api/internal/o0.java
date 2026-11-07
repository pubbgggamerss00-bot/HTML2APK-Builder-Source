package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes2.dex */
public final class o0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f6027a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f6028b;

    public o0(n1 n1Var) {
        this.f6028b = n1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            n1 n1Var = this.f6028b;
            p1 p1Var = ((o1) n1Var.f6026b).f6030b;
            p1Var.f6032b.set(null);
            zau zauVar = ((a0) p1Var).f5929f.f5981n;
            zauVar.sendMessage(zauVar.obtainMessage(3));
            AlertDialog alertDialog = (AlertDialog) n1Var.f6025a;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.f6027a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f6027a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
