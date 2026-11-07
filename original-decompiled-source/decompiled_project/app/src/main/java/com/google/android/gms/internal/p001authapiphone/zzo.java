package com.google.android.gms.internal.p001authapiphone;

import b3.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzo extends h.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void onResult(Status status) {
        if (status.f5910a == 6) {
            this.zza.trySetException(a.b(status));
        } else {
            v.a(status, null, this.zza);
        }
    }
}
