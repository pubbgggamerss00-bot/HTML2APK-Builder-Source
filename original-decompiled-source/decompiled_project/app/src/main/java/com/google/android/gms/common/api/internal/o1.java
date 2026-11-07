package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes2.dex */
public final class o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f6029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f6030b;

    public o1(p1 p1Var, m1 m1Var) {
        this.f6030b = p1Var;
        this.f6029a = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6030b.f6031a) {
            pa.a aVar = this.f6029a.f6023b;
            if (aVar.f21377b != 0 && aVar.f21378c != null) {
                p1 p1Var = this.f6030b;
                k kVar = p1Var.mLifecycleFragment;
                Activity activity = p1Var.getActivity();
                PendingIntent pendingIntent = aVar.f21378c;
                com.google.android.gms.common.internal.p.f(pendingIntent);
                int i10 = this.f6029a.f6022a;
                int i11 = GoogleApiActivity.f5901b;
                Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", false);
                kVar.startActivityForResult(intent, 1);
                return;
            }
            p1 p1Var2 = this.f6030b;
            if (p1Var2.f6034d.a(p1Var2.getActivity(), null, aVar.f21377b) != null) {
                p1 p1Var3 = this.f6030b;
                p1Var3.f6034d.h(p1Var3.getActivity(), p1Var3.mLifecycleFragment, aVar.f21377b, this.f6030b);
                return;
            }
            if (aVar.f21377b != 18) {
                this.f6030b.a(aVar, this.f6029a.f6022a);
                return;
            }
            p1 p1Var4 = this.f6030b;
            pa.d dVar = p1Var4.f6034d;
            Activity activity2 = p1Var4.getActivity();
            dVar.getClass();
            ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
            builder.setView(progressBar);
            builder.setMessage(com.google.android.gms.common.internal.y.b(activity2, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            pa.d.f(activity2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", p1Var4);
            p1 p1Var5 = this.f6030b;
            Context applicationContext = p1Var5.getActivity().getApplicationContext();
            n1 n1Var = new n1();
            n1Var.f6026b = this;
            n1Var.f6025a = alertDialogCreate;
            p1Var5.f6034d.getClass();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            o0 o0Var = new o0(n1Var);
            zao.zaa(applicationContext, o0Var, intentFilter);
            o0Var.f6027a = applicationContext;
            if (pa.i.a(applicationContext)) {
                return;
            }
            p1 p1Var6 = this.f6030b;
            p1Var6.f6032b.set(null);
            zau zauVar = ((a0) p1Var6).f5929f.f5981n;
            zauVar.sendMessage(zauVar.obtainMessage(3));
            if (alertDialogCreate.isShowing()) {
                alertDialogCreate.dismiss();
            }
            synchronized (o0Var) {
                try {
                    Context context = o0Var.f6027a;
                    if (context != null) {
                        context.unregisterReceiver(o0Var);
                    }
                    o0Var.f6027a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
