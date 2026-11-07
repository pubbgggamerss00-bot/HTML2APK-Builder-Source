package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzx extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    public zzx(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzm
    public final void zza(Status status, byte[] bArr) {
        v.a(status, bArr, this.zza);
    }
}
