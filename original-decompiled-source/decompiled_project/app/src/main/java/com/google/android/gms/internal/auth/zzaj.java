package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;

/* loaded from: classes2.dex */
final class zzaj implements l {
    private final Status zza;

    public zzaj(Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.zza;
    }
}
