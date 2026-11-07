package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import ia.b;

/* loaded from: classes2.dex */
final class zzbu implements l {
    private final Status zza;
    private b zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final b getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(b bVar) {
        this.zzb = bVar;
        this.zza = Status.f5905e;
    }
}
