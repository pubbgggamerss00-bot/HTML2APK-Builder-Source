package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzx extends h.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzx(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void onResult(Status status) {
        zzab.zzf(status, null, this.zza);
    }
}
