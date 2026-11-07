package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;
import la.c;

/* loaded from: classes2.dex */
final class zzw extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    public zzw(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzm
    public final void zzb(Status status, c cVar) {
        v.a(status, cVar, this.zza);
    }
}
