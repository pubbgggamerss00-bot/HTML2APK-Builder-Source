package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import b3.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import ga.h;

/* loaded from: classes2.dex */
final class zbae extends zbs {
    final /* synthetic */ TaskCompletionSource zba;

    public zbae(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbt
    public final void zbb(Status status, h hVar) throws RemoteException {
        if (status.d()) {
            this.zba.setResult(hVar);
        } else {
            this.zba.setException(a.b(status));
        }
    }
}
