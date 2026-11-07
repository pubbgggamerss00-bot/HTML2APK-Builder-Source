package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zban extends h.a {
    final /* synthetic */ TaskCompletionSource zba;

    public zban(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void onResult(Status status) throws RemoteException {
        v.a(status, null, this.zba);
    }
}
