package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import kc.b0;
import kc.i0;

/* loaded from: classes2.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final kc.e f6505a;

    /* renamed from: b, reason: collision with root package name */
    private final b0 f6506b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6507c;

    /* renamed from: d, reason: collision with root package name */
    private final at f6508d;

    /* renamed from: e, reason: collision with root package name */
    private final k f6509e;

    public aj(Context context, b0 b0Var, at atVar, k kVar) {
        this.f6507c = context.getPackageName();
        this.f6506b = b0Var;
        this.f6508d = atVar;
        this.f6509e = kVar;
        b0 b0Var2 = kc.g.f16288a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (kc.g.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    this.f6505a = new kc.e(context, b0Var, "IntegrityService", ak.f6510a, new i0() { // from class: com.google.android.play.core.integrity.ae
                        @Override // kc.i0
                        public final Object a(IBinder iBinder) {
                            int i10 = kc.v.f16298i;
                            if (iBinder == null) {
                                return null;
                            }
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                            return iInterfaceQueryLocalInterface instanceof kc.w ? (kc.w) iInterfaceQueryLocalInterface : new kc.u(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                        }
                    });
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        b0Var.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", b0.c(b0Var.f16263a, "Phonesky is not installed.", objArr));
        }
        this.f6505a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f6507c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kc.n(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(aa.b.b(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f6505a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f6506b.b("requestAndShowDialog(%s, %s)", this.f6507c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6505a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f6505a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f6506b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f6505a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
