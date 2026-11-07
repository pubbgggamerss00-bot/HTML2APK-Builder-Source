package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import kc.b0;
import kc.i0;

/* loaded from: classes2.dex */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    final kc.e f6568a;

    /* renamed from: b, reason: collision with root package name */
    private final b0 f6569b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6570c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f6571d;

    /* renamed from: e, reason: collision with root package name */
    private final at f6572e;

    /* renamed from: f, reason: collision with root package name */
    private final k f6573f;

    public bn(Context context, b0 b0Var, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6571d = taskCompletionSource;
        this.f6570c = context.getPackageName();
        this.f6569b = b0Var;
        this.f6572e = atVar;
        this.f6573f = kVar;
        kc.e eVar = new kc.e(context, b0Var, "ExpressIntegrityService", bo.f6574a, new i0() { // from class: com.google.android.play.core.integrity.bd
            @Override // kc.i0
            public final Object a(IBinder iBinder) {
                int i10 = kc.q.f16297i;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof kc.r ? (kc.r) iInterfaceQueryLocalInterface : new kc.p(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f6568a = eVar;
        eVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f6570c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kc.n(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(aa.b.b(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f6570c);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kc.n(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(aa.b.b(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f6571d.getTask().isSuccessful() && ((Integer) bnVar.f6571d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i10 = bundle.getInt("dialog.intent.type");
        this.f6569b.b("requestAndShowDialog(%s)", Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6568a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j10, long j11, int i10) {
        this.f6569b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6568a.c(new bg(this, taskCompletionSource, 0, str, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j10, int i10) {
        this.f6569b.b("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6568a.c(new bf(this, taskCompletionSource, 0, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
