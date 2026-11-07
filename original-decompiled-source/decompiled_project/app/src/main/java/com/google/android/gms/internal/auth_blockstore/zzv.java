package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzv extends zzn {
    final /* synthetic */ TaskCompletionSource zza;

    public zzv(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzo
    public final void zza(Status status, int i10) {
        v.a(status, Integer.valueOf(i10), this.zza);
    }
}
