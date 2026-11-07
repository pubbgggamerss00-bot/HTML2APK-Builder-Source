package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes2.dex */
public final class e0 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5954a;

    public e0(g gVar) {
        this.f5954a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z10) {
        zau zauVar = this.f5954a.f5981n;
        zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
