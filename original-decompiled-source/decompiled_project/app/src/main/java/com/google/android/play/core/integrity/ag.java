package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kc.c0;

/* loaded from: classes2.dex */
final class ag extends c0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f6496a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f6497b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6498c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f6499d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f6500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.f6500e = ajVar;
        this.f6496a = bundle;
        this.f6497b = activity;
        this.f6498c = taskCompletionSource2;
        this.f6499d = i10;
    }

    @Override // kc.c0
    public final void b() {
        try {
            aj ajVar = this.f6500e;
            ((kc.w) ajVar.f6505a.f16282n).a(this.f6496a, ajVar.f6508d.a(this.f6497b, this.f6498c, ajVar.f6505a));
        } catch (RemoteException e10) {
            this.f6500e.f6506b.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f6499d));
            this.f6498c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
