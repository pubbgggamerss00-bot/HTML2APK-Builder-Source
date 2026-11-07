package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f6554a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f6555b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6556c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f6557d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f6558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.f6558e = bnVar;
        this.f6554a = bundle;
        this.f6555b = activity;
        this.f6556c = taskCompletionSource2;
        this.f6557d = i10;
    }

    @Override // kc.c0
    public final void b() {
        if (bn.k(this.f6558e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f6558e;
            kc.e eVar = bnVar.f6568a;
            ((kc.r) eVar.f16282n).a(this.f6554a, bnVar.f6572e.a(this.f6555b, this.f6556c, eVar));
        } catch (RemoteException e10) {
            this.f6558e.f6569b.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f6557d));
            this.f6556c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
