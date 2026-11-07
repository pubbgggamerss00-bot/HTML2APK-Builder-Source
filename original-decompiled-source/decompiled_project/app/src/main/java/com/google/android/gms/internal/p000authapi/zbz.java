package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import ga.a;

/* loaded from: classes2.dex */
final class zbz extends zbi {
    final /* synthetic */ TaskCompletionSource zba;

    public zbz(zbaa zbaaVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbj
    public final void zbb(Status status, a aVar) throws RemoteException {
        if (status.d()) {
            this.zba.setResult(aVar);
        } else {
            this.zba.setException(b3.a.b(status));
        }
    }
}
