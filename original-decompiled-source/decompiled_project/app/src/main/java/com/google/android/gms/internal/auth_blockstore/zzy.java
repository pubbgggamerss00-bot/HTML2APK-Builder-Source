package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzy extends zzh {
    final /* synthetic */ TaskCompletionSource zza;

    public zzy(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzi
    public final void zza(Status status, boolean z10) {
        v.a(status, Boolean.valueOf(z10), this.zza);
    }
}
