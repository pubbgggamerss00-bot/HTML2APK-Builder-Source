package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
class bi extends kc.s {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f6559a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f6560b;

    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f6560b = bnVar;
        this.f6559a = taskCompletionSource;
    }

    @Override // kc.t
    public final void b(Bundle bundle) throws RemoteException {
        this.f6560b.f6568a.d(this.f6559a);
    }

    @Override // kc.t
    public void c(Bundle bundle) throws RemoteException {
        this.f6560b.f6568a.d(this.f6559a);
    }

    @Override // kc.t
    public final void d(Bundle bundle) throws RemoteException {
        this.f6560b.f6568a.d(this.f6559a);
    }

    @Override // kc.t
    public void e(Bundle bundle) throws RemoteException {
        this.f6560b.f6568a.d(this.f6559a);
    }
}
