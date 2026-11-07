package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import hb.t;

/* loaded from: classes2.dex */
abstract class zzf extends t<Status> {
    public zzf(h hVar) {
        super(hVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ l createFailedResult(Status status) {
        return status;
    }
}
