package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.l;

/* loaded from: classes2.dex */
public final class q<R extends l> extends BasePendingResult<R> {

    /* renamed from: a, reason: collision with root package name */
    public final Status f6077a;

    public q(Status status) {
        super((h) null);
        this.f6077a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.f6077a;
    }
}
