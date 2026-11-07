package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import kc.b0;

/* loaded from: classes2.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f6613b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6614c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6616e;

    /* renamed from: a, reason: collision with root package name */
    private final b0 f6612a = new b0("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f6615d = new Object();

    public y(String str, long j10) {
        this.f6613b = str;
        this.f6614c = j10;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.f6615d) {
            try {
                if (this.f6616e) {
                    return Tasks.forResult(0);
                }
                this.f6616e = true;
                b0 b0Var = this.f6612a;
                Object[] objArr = {Integer.valueOf(i10)};
                b0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", b0.c(b0Var.f16263a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i10);
                bundle.putString("package.name", this.f6613b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f6614c);
                return b(activity, bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
