package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;

/* loaded from: classes2.dex */
public final class x implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f6067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f6068b;

    public x(z zVar, BasePendingResult basePendingResult) {
        this.f6068b = zVar;
        this.f6067a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.i.a
    public final void a(Status status) {
        this.f6068b.f6072a.remove(this.f6067a);
    }
}
