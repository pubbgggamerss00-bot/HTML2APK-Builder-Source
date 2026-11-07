package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;

/* loaded from: classes2.dex */
public final class r extends h.a {

    /* renamed from: a, reason: collision with root package name */
    public final e<Status> f6035a;

    public r(e<Status> eVar) {
        this.f6035a = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void onResult(Status status) {
        this.f6035a.setResult(status);
    }
}
