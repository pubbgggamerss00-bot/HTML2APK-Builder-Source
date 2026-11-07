package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;
import ga.c;

/* loaded from: classes2.dex */
final class zbam extends zbl {
    final /* synthetic */ TaskCompletionSource zba;

    public zbam(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    public final void zbb(Status status, c cVar) throws RemoteException {
        v.a(status, cVar, this.zba);
    }
}
